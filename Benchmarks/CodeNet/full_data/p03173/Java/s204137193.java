import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		long[] sum = new long[n + 1];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
			sum[i + 1] = sum[i] + a[i];
		}

		long[][] dp = new long[n + 1][n + 1];
		for (int i = 0; i <= n; i++) {
			Arrays.fill(dp[i], Long.MAX_VALUE / 3);
		}

		for (int i = 0; i < n; i++) {
			dp[i][i + 1] = a[i]; // last: (n-1, n)
		}

		for (int d = 2; d <= n; d++) {
			for (int l = 0; l < n; l++) {
				int r = Math.min(l + d, n);

				for (int x = 1; (l + x) <= r; x++) {
					long cl = dp[l][l + x] + (sum[l + x] - sum[l]);
					long cr = dp[l + x][r] + (sum[r] - sum[l + x]);
					dp[l][r] = Math.min(dp[l][r], cl + cr);
				}
			}
		}

		System.out.println(dp[0][n] - sum[n]);
	}
}
