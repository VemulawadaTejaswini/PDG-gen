import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
	static List<Integer> path;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int a = Integer.parseInt(sa[1]);

		sa = br.readLine().split(" ");
		int[] x = new int[n + 1];
		for (int i = 0; i < n; i++) {
			x[i + 1] = Integer.parseInt(sa[i]);
		}
		br.close();

		long[][][] dp = new long[n + 1][n + 1][n * 50 + 1];
		dp[0][0][0] = 1;
		for (int i = 1; i <= n; i++) {
			dp[i][0][0] = 1;
			for (int j = 1; j <= i; j++) {
				for (int k = 0; k <= j * 50; k++) {
					dp[i][j][k] = dp[i - 1][j][k];
					int pre = k - x[i];
					if (0 <= pre && pre <= (j - 1) * 50) {
						dp[i][j][k] += dp[i - 1][j - 1][pre];
					}
				}
			}
		}

		long ans = 0;
		for (int j = 1; j <= n; j++) {
			ans += dp[n][j][j * a];
		}
		System.out.println(ans);
	}
}
