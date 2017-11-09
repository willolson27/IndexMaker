import java.util.TreeSet;

public class IndexEntry {

	TreeSet<String> nums = new TreeSet<String>();
	
	String word;
	
	public IndexEntry(String w, TreeSet<String> num) {
		word = w;
		nums = num;
	}
	
	
	public void add(int num) {
		nums.add(Integer.toString(num));
	}
	
	public String getWord() {

		return word;
	}
	
	public String toString() {
		
		String indexes = nums.toString();
		return word + " " + indexes.substring(1, indexes.length() - 1);
		
	}
	
}