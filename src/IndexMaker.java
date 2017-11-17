/**
 * This program takes a text file, creates an index (by line numbers)
 *  for all the words in the file and writes the index
 *  into the output file.  The program takes input and output file names
 *  from the command-line args or prompts the user for the file names.
 */

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class IndexMaker
{

	private final static String ERROR = "ERROR: FILE NOT FOUND";
	
	public IndexMaker () {
		
	}
	
	/**
	 * 
	 * @method getOutputName 
	 * 		-takes in the input file and adds "Index" to it to create the output file name
	 * @param input - name of input file
	 * @return String output - name of output file
     **/
	public static String getOutputName(String input) {
		
		String ix = "Index";
		boolean hasPeriod = true;
		int lastP = 0;
		String output = "";
		String ext = ".txt";
		
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '.') {
				hasPeriod = true;
				lastP = i;
			}
		} 
		
		if (hasPeriod) {
			output = input.substring(0, lastP) + ix + ext;
		}
		else
			output = input + ix + ext;
		
		return output;
		
	}
	
	
//TODO javadocs
	/**
	 * 
	 * @method getIndexes
	 * 		-t
	 * @param input - file to be read in
	 * @param output - file to be printed to
	 * @throws IOException
	 */
	public static void getIndexes(String input, String output) throws IOException {

	    Scanner keyboard = new Scanner(System.in);

	    // Open input file:

	    BufferedReader inputFile = null;
	    
	    try {
	    	inputFile = new BufferedReader(new FileReader(input), 1024);
	    }
	    catch (FileNotFoundException e) {
	    	System.out.println(ERROR);
	    	System.exit(0);
	    }
	    // Create output file:

	    PrintWriter outputFile = new PrintWriter(new FileWriter(output));

	    // Create index:

	    DocumentIndex index = new DocumentIndex();
	    TreeMap<String, IndexEntry> map = index.getMap();

	    String line;
	    int lineNum = 0;
	    while ((line = inputFile.readLine()) != null)
	    {
	      lineNum++;
	      index.addAllWords(line, lineNum);
	    }

	    // Save index: 
	    
	    String toOutput = "";
	    for (Map.Entry<String, IndexEntry> entry : map.entrySet())
	    {
	    	toOutput+=(entry.getValue()) + "\n";
	    }
	    // Finish:
	    outputFile.println(toOutput);
	    inputFile.close();
	    outputFile.close();

	    keyboard.close();
	    System.out.println("Done.");
	} 
  
	public static void main(String[] args) throws IOException {
		
		Scanner keyboard = new Scanner(System.in);
		String input, output;

		// Open input file:

		if (args.length > 0)
			input = args[0];
		else
		{
			System.out.print("\nEnter input file name: ");
			input = keyboard.nextLine().trim();
		}

		// Create output file:

		if (args.length > 1)
			output = args[1];
		else
			output = getOutputName(input);
		

		// Create index:

		getIndexes(input, output);
    
    
		keyboard.close();
  }
	
}
