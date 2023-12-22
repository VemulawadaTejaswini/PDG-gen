import java.util.Scanner;

public class Main {

	private static int solve(long n) {

		int ret = 0;

		String s = String.valueOf(n);
		int l = s.length();

		boolean f = false;
		for (int i = 0; i < l; i++) {

			int m = s.charAt(i) - '0';

			if (1 == l) {
				ret += m;

			} else if (f) {
				ret += 9;

			} else {

				if (i + 1 < l && '9' == s.charAt(i + 1)) {
					ret += m;

				} else if (i + 1 < l && '9' != s.charAt(i + 1)) {
					ret += m - 1;
					f = true;

				} else {
					ret += m;
				}

			}

		}

		return ret;

	}

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			long n = sc.nextLong();

			int result = solve(n);

			System.out.println(result);

		}

	}

}
