import java.util.*;
public class IndexMakerTester {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>();
		set.add("1");
		set.add("2");
		set.add("3");
		IndexEntry entry = new IndexEntry("asdf" , set);
		System.out.println(entry);
		
	}
	
}
