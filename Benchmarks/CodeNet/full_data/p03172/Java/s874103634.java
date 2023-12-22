import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int k = Integer.parseInt(sa[1]);
		int[] a = new int[n + 1];
		sa = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			a[i + 1] = Integer.parseInt(sa[i]);
		}
		br.close();

		int[] b = new int[n + 1];
		for (int i = 0; i < n; i++) {
			b[i + 1] = b[i] + a[i + 1];
		}

		long[][] dp = new long[n + 1][k + 1];
		dp[0][0] = 1;
		for (int x = 1; x <= n; x++) {
			dp[x][0] = dp[x - 1][0];
			int m = Math.min(b[x] / 2, k);
			for (int y = 1; y <= m; y++) {
				dp[x][y] = dp[x][y - 1] + dp[x - 1][y];
				dp[x][y] %= 1000000007;
			}
			int o = Math.min(b[x], k);
			for (int y = m + 1; y <= o; y++) {
				dp[x][y] = dp[x][b[x] - y];
			}
		}
		System.out.println(dp[n][k]);
	}
}
