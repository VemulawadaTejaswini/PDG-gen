import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static final char BASE = 'a';
	private static final int ALPHABETS = 26;

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int n = sc.nextInt();
		int[] commonChars = new int[ALPHABETS];
		Arrays.fill(commonChars, Integer.MAX_VALUE);
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			int[] charCnt = countChars(s);
			for (int j = 0; j < ALPHABETS; j++) {
				commonChars[j] = Math.min(commonChars[j], charCnt[j]);
			}
		}

		StringBuilder answer = new StringBuilder();
		for (int i = 0; i < ALPHABETS; i++) {
			char c = (char) (BASE + i);
			for (int j = 0; j < commonChars[i]; j++) {
				answer.append(c);
			}
		}
		System.out.println(answer.toString());

		sc.close();
	}

	public int[] countChars(String str) {
		int[] chars = new int[26];
		for (int i = 0; i < str.length(); i++) {
			chars[str.charAt(i) - BASE]++;
		}
		return chars;
	}
}
