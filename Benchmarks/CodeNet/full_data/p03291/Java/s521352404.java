import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] s = str.toCharArray();
		sc.close();

		int n = s.length + 1;
		long[] a = new long[n];
		long[] b = new long[n];
		long[] c = new long[n];
		long base = 1;
		for (int i = 1; i <= s.length; i++) {
			char ch = s[i - 1];
			if (ch == 'A') {
				a[i] = a[i - 1] + base;
				a[i] %= 1000000007;
				b[i] = b[i - 1];
				c[i] = c[i - 1];

			} else if (ch == 'B') {
				a[i] = a[i - 1];
				b[i] = b[i - 1] + a[i - 1];
				b[i] %= 1000000007;
				c[i] = c[i - 1];

			} else if (ch == 'C') {
				a[i] = a[i - 1];
				b[i] = b[i - 1];
				c[i] = c[i - 1] + b[i - 1];
				c[i] %= 1000000007;

			} else {
				a[i] = a[i - 1] * 3 + base;
				a[i] %= 1000000007;
				b[i] = b[i - 1] * 3 + a[i - 1];
				b[i] %= 1000000007;
				c[i] = c[i - 1] * 3 + b[i - 1];
				c[i] %= 1000000007;
				base *= 3;
			}
		}
		System.out.println(c[n - 1]);
	}
}
