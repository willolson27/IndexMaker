import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
public class IndexMakerTester {

	public static void go() throws IOException {
		
		String[] args = {"fish.txt", "b"};
		IndexMaker bob = new IndexMaker();
		IndexMaker.main(args);
		
	}
	
	public static void main(String[] args) throws IOException {

		go();
		
	}
	
}
