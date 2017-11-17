import java.util.TreeSet;

public class IndexEntry {

	TreeSet<String> nums;
	
	String word;
	
	/**
	 * 
	 * @method IndexEntry
	 * 		-constructor that creates a new instance of the IndexEntry class with a givne word w
	 * @param w - word for a new index entry
	 * 
	 */
	public IndexEntry(String w) {
		word = w.toUpperCase();
		nums = new TreeSet<String>();
	}
	
	/**
	 * 
	 * @user willolson27
	 * @date November 17, 2017
	 * @method add 
	 * 		-adds a given lineNumber to the TreeSet												
	 * @param num
	 */
	public void add(int num) {
		nums.add(Integer.toString(num).toUpperCase());
	}
	
	/**
	 * 
	 * 
	 */
	public String getWord() {

		return word;
	}
	
	/**
	 * 
	 */
	public String toString() {
		
		String indexes = nums.toString();
		return word + " " + indexes.substring(1, indexes.length() - 1);
		
	}
	
}
