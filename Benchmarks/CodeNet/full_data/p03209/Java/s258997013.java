import java.util.Scanner;

public class Main {
	private static long[] all;
	private static long[] p;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long x = sc.nextLong();
		all = new long[n + 1];
		p = new long[n + 1];

		all[0] = 1;
		p[0] = 1;
		for (int i = 1; i <= n; i++) {
			all[i] = 2 * all[i - 1] + 3;
			p[i] = 2 * p[i - 1] + 1;
		}

		System.out.println(solve(n, x));
	}

	private static long solve(int n, long x) {
		if (x <= 0 || n < 0) return 0;
		if (n == 0) return 1;
		if (x == 1) return 0;

		if (x <= 1 + all[n - 1]) return solve(n - 1, x - 1);
		if (x == 2 + all[n - 1]) return p[n - 1] + 1;
		if (x <= 2 * all[n - 1] + 2) return p[n - 1] + 1 + solve(n - 1, x - 2 - all[n - 1]);
		return 2 * p[n - 1] + 1;
	}
}
