import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String word1 = sc.next();
		String word2 = sc.next();
		String result = "No";

		StringBuilder sb = new StringBuilder();
		sb.append(word1);


		int word1Size = word1.length();
		for (int i = word1Size-1; i >= 0; i--) {
			sb.insert(0, word1.charAt(i));
			sb.deleteCharAt(word1Size);
			if (sb.toString().equals(word2)) {
				result = "Yes";
				break;
			}
		}
		System.out.println(result);
	}
}
