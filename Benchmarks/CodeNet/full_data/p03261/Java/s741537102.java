import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<String> list = new ArrayList<>();
		String newWord;

		for (int i = 0; i < N; i++) {
			newWord = sc.next();
			if (list.contains(newWord)
					|| (!list.isEmpty() && !(list.get(list.size() - 1)).endsWith(String.valueOf(newWord.charAt(0))))) {
				System.out.println("No");
				return;
			} else {
				list.add(newWord);
			}
		}
		System.out.println("Yes");
	}
}