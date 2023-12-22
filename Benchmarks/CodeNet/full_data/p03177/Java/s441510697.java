import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		long k = Long.parseLong(sa[1]);
		long[][][] dp = new long[61][n][n];
		for (int i = 0; i < n; i++) {
			sa = br.readLine().split(" ");
			for (int j = 0; j < n; j++) {
				dp[0][i][j] = Long.parseLong(sa[j]);
			}
		}
		br.close();

		int mod = 1000000007;
		for (int i = 0; i < 60; i++) {
			for (int j = 0; j < n; j++) {
				for (int j2 = 0; j2 < n; j2++) {
					for (int x = 0; x < n; x++) {
						dp[i + 1][j][j2] += dp[i][j][x] * dp[i][x][j2];
						dp[i + 1][j][j2] %= mod;
					}
				}
			}
		}

		long[][] a = new long[n][n];
		boolean first = true;
		for (int i = 0; i < 60; i++) {
			if ((k >> i & 1) == 1) {
				if (first) {
					a = dp[i];
					first = false;
				} else {
					long[][] b = new long[n][n];
					for (int j = 0; j < n; j++) {
						for (int j2 = 0; j2 < n; j2++) {
							for (int x = 0; x < n; x++) {
								b[j][j2] += a[j][x] * dp[i][x][j2];
								b[j][j2] %= mod;
							}
						}
					}
					a = b;
				}
			}
		}

		long ans = 0;
		for (int j = 0; j < n; j++) {
			for (int j2 = 0; j2 < n; j2++) {
				ans += a[j][j2];
			}
		}
		ans %= mod;
		System.out.println(ans);
	}
}
