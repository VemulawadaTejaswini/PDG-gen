import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int a = sc.nextInt();
		int[] x = new int[n+1];
		for (int i = 1; i <= n; i++) {
			x[i] = sc.nextInt();
		}
		int[][][] dp = new int[n + 1][n + 1][50 * n + 1];
		dp[0][0][0] = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				for (int k = 0; k <= 50 * n; k++) {
					if (i >= 1 && k < x[i]) {
						dp[i][j][k] = dp[i - 1][j][k];
					} else if (i >= 1 && j >= 1 && k >= x[i]) {
						dp[i][j][k] = dp[i - 1][j][k] + dp[i - 1][j - 1][k - x[i]];
					} else {
						dp[i][j][k] = 0;
					}
				}
			}
		}
		long ans = 0;
		for (int i = 1; i <= n; i++) {
			ans += dp[n][i][i * a];
		}
		System.out.println(ans);
	}
}