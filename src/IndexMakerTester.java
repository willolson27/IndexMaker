import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
public class IndexMakerTester {

	public static void main(String[] args) throws IOException {

		TreeMap<String, String> files = new TreeMap<String, String>();
		String pb = "*******************************************";
		IndexMaker maker = new IndexMaker();
		Scanner in = new Scanner(System.in);
		int num = 0;
		String toOutput = "";
		
		System.out.println("Give a file name for output");
		String fileNameOutput = in.nextLine();

	    PrintWriter outputFile = new PrintWriter(new FileWriter(fileNameOutput));
	    
	    System.out.println("How many files do you want to get indexes for?");
		num = in.nextInt();
		
		for (int i = 0; i < num; i++) {
			System.out.println("Give a file name for indexes");
			String fileNameInput = in.nextLine();
			files.put(fileNameInput, (maker.getIndexes(fileNameInput)));
		}
		
		for (Map.Entry<String, String> entry : files.entrySet())
	    {
	    	toOutput+=(pb + "Indexes for " + entry.getKey() + pb + "\n"+ entry.getValue());
	    }
		outputFile.print(toOutput);
		outputFile.close();
	}
	
}
