public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String keyWord = sc.next();
		keyWord = keyWord.toUpperCase();
		ArrayList<String> wordLists = new ArrayList<>();
		while(true) {
			String word = sc.next();
			if(word.equals("END_OF_TEXT")) break;
			wordLists.add(word.toUpperCase());
		}
		sc.close();
		int count = 0;
		for(String word : wordLists) {
			if(word.equals(keyWord)) count++;
		}
		System.out.println(count);
	}
}
