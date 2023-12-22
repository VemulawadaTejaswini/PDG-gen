import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int MOD = 1000000007;
	static long[] fac = new long[1000000];
	static long[] finv = new long[1000000];
	static long[] inv = new long[1000000];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int x = Integer.parseInt(str[0]);
		int y = Integer.parseInt(str[1]);

		int a = (2 * x - y) / 3;
		int b = (2 * y - x) / 3;

		if (((-x + 2 * y) % 3 != 0) || ((2 * x - y) % 3 != 0)) {
			System.out.println(0);
		} else {
			COMinit();
			System.out.println(COM(a + b, a));
		}
	}

	public static void COMinit() {
		fac[0] = 1L;
		fac[1] = 1L;
		finv[0] = 1L;
		finv[1] = 1L;
		inv[1] = 1L;
		for (int i = 2; i < 1000000; i++) {
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