import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int t = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}

		long[][][] dp = new long[n + 1][t + 1][2];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < t; j++) {
				dp[i + 1][j + 1][0] = dp[i][j + 1][0];
				dp[i + 1][j + 1][0] = Math.max(dp[i + 1][j + 1][0], dp[i + 1][j][0]);

				if (j - a[i] >= 0) {
					dp[i + 1][j + 1][0] = Math.max(dp[i + 1][j + 1][0], dp[i][j - a[i]][0] + b[i]);
				}
				dp[i + 1][j + 1][1] = Math.max(dp[i][j][1], dp[i][j][0] + b[i]);
			}
		}

		System.out.println(Math.max(dp[n][t][0], dp[n][t][1]));
	}
}
