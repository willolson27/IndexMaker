import java.util.TreeMap;

public class DocumentIndex {

	TreeMap<String, IndexEntry> map = new TreeMap<String, IndexEntry>();
	
	/**
	 * 
	 * @method addWord
	 * 		-Adds a given word at 
	 * @param word
	 * @param num
	 */
	public void addWord(String word, int num) {
		word.toUpperCase();
		if (!map.containsKey(word)) {
			IndexEntry entry = new IndexEntry(word);
			entry.add(num);
			map.put(word, entry);
		}
		else
			map.get(word).add(num);
	}
	
	/**
	 * 
	 * @param line
	 * @param lineNum
	 */
	public void addAllWords(String line, int lineNum) {
		String[] words = line.split("\\W+");
		for (String a : words) 
			addWord(a, lineNum);
		
	}
	
	public TreeMap<String, IndexEntry> getMap() {
		return map;
	}

}
