import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long k = sc.nextLong();
		sc.close();

		if (s.length() == 1) {
			System.out.println(k / 2);
			return;
		}

		long change = 0;
		char first = s.charAt(0);
		char before = s.charAt(0);
		boolean isDuplicate = false;
		boolean isAllSame = true;
		int i = 1;
		while (i < s.length()) {
			char now = s.charAt(i);
			if (isAllSame && before != now) {
				isAllSame = false;
			}
			if (before == now) {
				change++;
				if (i + 1 < s.length() && s.charAt(i + 1) == now) {
					i++;
				}
			}
			before = now;
			i++;
		}
		if (isAllSame) {
			long len = s.length();
			System.out.println((len * k) / 2);
			return;
		}

		if (s.charAt(s.length() - 2) != s.charAt(s.length() - 1) && first == s.charAt(s.length() - 1)
				&& s.charAt(0) != s.charAt(1)) {
			isDuplicate = true;
		}
		long returnLong = change * k;
		if (isDuplicate) {
			returnLong = returnLong + k - 1;
		}
		System.out.println(returnLong);
	}
}