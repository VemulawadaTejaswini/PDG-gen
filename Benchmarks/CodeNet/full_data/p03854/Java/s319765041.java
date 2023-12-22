import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		char[] a = "dream".toCharArray();
		char[] b = "dreamer".toCharArray();
		char[] c = "erase".toCharArray();
		char[] d = "eraser".toCharArray();
		StringBuilder sb = new StringBuilder(s);

		while (sb.length() > 0) {
			if (isMatch(sb, a)) {
				sb.delete(sb.length() - a.length, sb.length());

			} else if (isMatch(sb, b)) {
				sb.delete(sb.length() - b.length, sb.length());

			} else if (isMatch(sb, c)) {
				sb.delete(sb.length() - c.length, sb.length());

			} else if (isMatch(sb, d)) {
				sb.delete(sb.length() - d.length, sb.length());

			} else {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}

	static boolean isMatch(StringBuilder sb, char[] str) {
		if (sb.length() < str.length) {
			return false;
		}
		for (int i = 0; i < str.length; i++) {
			if (sb.charAt(sb.length() - str.length + i) != str[i]) {
				return false;
			}
		}
		return true;
	}
}
