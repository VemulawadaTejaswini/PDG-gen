import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		boolean isOk = true;
		String[] divide = { "dream", "dreamer", "erase", "eraser" };
		for (int i = S.length(); i > 0;) {
			String s = S.substring(0, i);
			if (s.endsWith(divide[0])) {
				i -= divide[0].length();
			} else if (s.endsWith(divide[1])) {
				i -= divide[1].length();
			} else if (s.endsWith(divide[2])) {
				i -= divide[2].length();
			} else if (s.endsWith(divide[3])) {
				i -= divide[3].length();
			} else {
				isOk = false;
				break;
			}
		}
		System.out.println(isOk ? "YES" : "NO");
		in.close();
	}
}