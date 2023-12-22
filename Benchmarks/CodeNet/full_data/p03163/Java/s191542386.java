import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class kanpsack {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		StringTokenizer st = new StringTokenizer(line, " ");
		int n = Integer.parseInt(st.nextToken());
		int sum = Integer.parseInt(st.nextToken());
		int wt[] = new int[n];
		int val[] = new int[n];
		for (int i = 0; i < n; i++) {
			String lines = br.readLine();
			StringTokenizer sts = new StringTokenizer(lines, " ");
			wt[i] = Integer.parseInt(sts.nextToken());
			val[i] = Integer.parseInt(sts.nextToken());
		}
		System.out.println(KN(n, sum, wt, val));
	}

	static long KN(int n, int W, int wt[], int val[]) {
		long dp[][] = new long[n + 1][W + 1];

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= W; j++) {
				if (i == 0 || j == 0) {
					dp[i][j] = 0;
				} else if (wt[i - 1] <= j) {
					dp[i][j] = Math.max(val[i - 1] + dp[i - 1][j - wt[i - 1]], dp[i - 1][j]);
				} else {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}
		return dp[n][W];
	}

}
