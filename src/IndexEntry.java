import java.util.TreeSet;

public class IndexEntry {

	TreeSet<String> nums;
	
	String word;
	
	/**
	 * 
	 * @param w - word for a new index entry
	 * 
	 */
	public IndexEntry(String w) {
		word = w.toUpperCase();
		nums = new TreeSet<String>();
	}
	
	/**
	 * 
	 * @method 															
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
