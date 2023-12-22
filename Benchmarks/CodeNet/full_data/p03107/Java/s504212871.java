import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		int len = S.length();

		while (isOneChar(S) == false) {
			S = S.replaceAll("10", "");
			S = S.replaceAll("01", "");
		}

		System.out.println(len - S.length());

	}

	static boolean isOneChar(String s) {
		boolean b = false;

		if (s.isEmpty()) {
			b = true;
		} else if (s.contains("0") == true && s.contains("1") == false) {
			b = true;
		} else if (s.contains("0") == false && s.contains("1") == true) {
			b = true;
		}

		return b;
	}
}
