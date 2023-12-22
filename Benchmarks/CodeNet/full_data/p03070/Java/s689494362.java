import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine());
			sum += a[i];
		}
		br.close();

		int mod = 998244353;
		long[][] dp = new long[n + 1][sum + 1];
		dp[0][0] = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= sum; j++) {
				dp[i + 1][j] += dp[i][j] * 2;
				dp[i + 1][j] %= mod;
				int j2 = j + a[i];
				if (j2 <= sum) {
					dp[i + 1][j2] += dp[i][j];
					dp[i + 1][j2] %= mod;
				}
			}
		}

		int sum2 = sum / 2;
		long rem = 0;
		for (int j = sum2 + 1; j <= sum; j++) {
			rem += dp[n][j];
		}
		rem *= 3;
		rem %= mod;
		long total = power(3, n, mod);
		long ans = (total - rem + mod) % mod;

		if (sum2 * 2 == sum) {
			long[][] dp2 = new long[n + 1][sum2 + 1];
			dp2[0][0] = 1;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j <= sum2; j++) {
					dp2[i + 1][j] += dp2[i][j];
					dp2[i + 1][j] %= mod;
					int j2 = j + a[i];
					if (j2 <= sum2) {
						dp2[i + 1][j2] += dp2[i][j];
						dp2[i + 1][j2] %= mod;
					}
				}
			}
			long rem2 = dp[n][sum2] - dp2[n][sum2] + mod;
			rem2 *= 3;
			rem2 %= mod;
			ans = (ans - rem2 + mod) % mod;
		}

		System.out.println(ans);
	}

	static long power(long x, long n, int m) {
		if (n == 0) {
			return 1;
		}
		long val = power(x, n / 2, m);
		val = val * val % m;
		if (n % 2 == 1) {
			val = val * x % m;
		}
		return val;
	}
}
