import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		ArrayList<String> shiritoriList = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			shiritoriList.add(sc.next());
		}
		sc.close();

		ArrayList<String> checkList = new ArrayList<>();
		for(int i = 0; i < shiritoriList.size(); i++) {
			String word = shiritoriList.get(i);
			if(i != 0) {
				String formerWords = shiritoriList.get(i - 1);
				char lastWord = formerWords.charAt(formerWords.length() - 1);
				if(lastWord != word.charAt(0)) {
					System.out.println("No");
					return;
				}
				if(checkList.contains(word)) {
					System.out.println("No");
					return;
				}
			}
			checkList.add(word);
		}
		System.out.println("Yes");
		return;
	}

}