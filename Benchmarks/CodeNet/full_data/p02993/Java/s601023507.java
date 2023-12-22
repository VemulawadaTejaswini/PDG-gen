import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sysin = new Scanner(System.in);
		final String s = sysin.next();
		sysin.close();

		System.out.println(judge(s.toCharArray()));
	}

	private static String judge(char[] chars) {
		for (int i = 1; i < chars.length; i++) {
			if (chars[i] == chars[i - 1]) {
				return "Bad";
			}
		}

		return "Good";
	}
}
