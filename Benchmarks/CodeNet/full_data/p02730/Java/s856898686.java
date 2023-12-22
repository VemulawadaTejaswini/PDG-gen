import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int N = S.length();
		boolean isStrongStr = false;

		StringBuffer sb = new StringBuffer(S);
		String dst = sb.reverse().toString();
		if (S.equals(dst)) {
			String second = S.substring(0, (N - 1) / 2);
			sb = new StringBuffer(second);
			if (second.equals(sb.reverse().toString())) {
				String third = S.substring((N + 3) / 2 - 1, S.length());
				sb = new StringBuffer(third);
				if (third.equals(sb.reverse().toString())) {
					isStrongStr = true;
				}
			}
		}

		if (isStrongStr) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}