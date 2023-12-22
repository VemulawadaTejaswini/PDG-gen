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
		for (int i = 1; i <= n; i++) {
			dp[i][0] = dp[i - 1][0];
			int end = Math.min(k, b[i]);
			for (int j = 1; j <= end; j++) {
				dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
				dp[i][j] %= 1000000007;
			}
			for (int j = a[i] + 1; j <= end; j++) {
				dp[i][j] = dp[i][j] + 1000000007 - dp[i][j - a[i] - 1];
				dp[i][j] %= 1000000007;
			}
		}
		System.out.println(dp[n][k]);
	}
}
