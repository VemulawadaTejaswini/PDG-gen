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
		long[] dp = new long[n2];
		dp[0] = 0;
		for (int i = 1; i < n2; i++) {
			for (int x = 0; x < n; x++) {
				for (int y = x + 1; y < n; y++) {
					if ((i >> x & 1) == 1 && (i >> y & 1) == 1) {
						dp[i] += a[x][y];
					}
				}
			}
			for (int j = (i - 1) & i; j > 0; j = (j - 1) & i) {
				dp[i] = Math.max(dp[i], dp[j] + dp[i - j]);
			}
		}
		System.out.println(dp[n2 - 1]);
	}
}
