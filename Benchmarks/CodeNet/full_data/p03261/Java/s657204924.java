import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> wordList = new ArrayList<>();

		while (sc.hasNextLine()) {
			wordList.add(sc.nextLine());
		}

		boolean isCorrect = true;
		Set<String> checkHash = new HashSet<>();
		int listSize = wordList.size();
		for (int i = 1 ; i < listSize; i++) {
			String word = wordList.get(i);
			if (i == 0) {
				continue;
			}
			if (i == 1) {
				checkHash.add(word);
				continue;
			}
			if (checkHash.contains(word)) {
				isCorrect = false;
				break;
			}
			String preWord = wordList.get(i-1);
			if (word.charAt(0) != (preWord.charAt(preWord.length()-1))) {
				isCorrect = false;
				break;
			}
			checkHash.add(word);
		}
		if (isCorrect) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
