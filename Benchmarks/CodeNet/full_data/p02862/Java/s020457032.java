import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		if ( ((- X + 2 * Y) % 3 != 0) || ((2 * X - Y) % 3 != 0) ) {
			System.out.println(0);
		} else {
			int n = (- X + 2 * Y) / 3;
			int m = (2 * X - Y) / 3;
			COMinit();
			System.out.println(COM(n + m, n));
		}
	}

	static int MAX = 1000000;
	static int MOD = 1000000007;
	static long[] fac = new long[MAX];
	static long[] finv = new long[MAX];
	static long[] inv = new long[MAX];

	public static void COMinit() {
		fac[0] = 1L;
		fac[1] = 1L;
		finv[0] = 1L;
		finv[1] = 1L;
		inv[1] = 1L;
		for (int i = 2; i < MAX; i++) {
			fac[i] = fac[i - 1] * i % MOD;
			inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
			finv[i] = finv[i - 1] * inv[i] % MOD;
		}
	}

	public static long COM(int n, int k) {
		if (n < k) {
			return 0L;
		}
		if (n < 0 || k < 0) {
			return 0L;
		}
		return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
	}
}