import java.util.Scanner;

public class Main {
	public static final long MOD = 1_000_000_000 + 7;

	public static void main(String[] args) {
		// input
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		long[] x = new long[n];
		long[] y = new long[m];

		for (int i = 0; i < n; i++) {
			x[i] = sc.nextLong();
		}
		for (int i = 0; i < m; i++) {
			y[i] = sc.nextLong();
		}

		long xsum = 0;
		for (int i = 0; i < n; i++) {
			//		long tmp = ((2 * i - n + 1) * x[i]) % MOD;
			//		xsum += tmp;
			//		xsum %= MOD;
			long add = (i * x[i]) % MOD;
			long subtract = ((n - i - 1) * x[i]) % MOD;
			long sum = (add - subtract) % MOD;
			xsum += sum;
			xsum %= MOD;
		}
		System.out.println(xsum);

		long ysum = 0;
		for (int i = 0; i < m; i++) {
			//	long tmp = ((2 * i - m + 1) * y[i]) % MOD;
			//	ysum += tmp;
			//	ysum %= MOD;
			long add = (i * y[i]) % MOD;
			long subtract = ((m - i - 1) * y[i]) % MOD;
			long sum = (add - subtract) % MOD;
			ysum += sum;
			ysum %= MOD;
		}
		System.out.println(ysum);

		long ans = (xsum * ysum) % MOD;

		// output
		System.out.println(ans);
	}
}
