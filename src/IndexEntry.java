import java.util.TreeSet;

public class IndexEntry {

	TreeSet<String> nums = new TreeSet<String>();
	
	String word;
	
	/**
	 * 
	 * @param w
	 * 
	 */
	public IndexEntry(String w) {
		word = w.toUpperCase();
	
	}
	
	/**
	 * 
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
		System.out.print(word + " " + indexes.substring(1, indexes.length() - 1) + "\n");
		return word + " " + indexes.substring(1, indexes.length() - 1);
		
	}
	
}
