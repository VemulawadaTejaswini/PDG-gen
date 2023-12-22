import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		sc.close();

		int n2 = 1 << n;
		long[][] dp = new long[n + 1][n2];
		dp[0][0] = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] == 0) {
					continue;
				}
				int j1 = 1 << j;
				for (int j2 = 0; j2 < n2; j2++) {
					dp[i + 1][j2 | j1] += dp[i][j2];
				}
			}
			for (int j2 = 0; j2 < n2; j2++) {
				dp[i + 1][j2] %= 1000000007;
			}
		}
		System.out.println(dp[n][n2 - 1]);
	}
}
