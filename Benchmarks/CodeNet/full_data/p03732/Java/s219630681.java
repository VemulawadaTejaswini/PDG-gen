import java.util.*;
import java.lang.*;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int W = sc.nextInt();
		long[] w = new long[n + 1];
		long[] v = new long[n + 1];
		for (int i = 1; i <= n; i++) {
			w[i] = sc.nextLong();
			v[i] = sc.nextLong();
		}
		long[][][] dp = new long[n + 1][n + 1][500];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				for (int k = 0; k < 500; k++) {
					if (k - (w[i] - w[1]) < 0) {
						dp[i][j][k] = dp[i - 1][j][k];
					} else {
						dp[i][j][k] = Math.max(dp[i - 1][j - 1][k - (int) (w[i] - w[1])] + v[i], dp[i - 1][j][k]);
					}
				}
			}
		}
		long max = 0;
		for (int i = 0; i <= n; i++) {
			if (W - w[1] * i >= 0) {
				max = Math.max(max, dp[n][i][Math.max(499,W - (int)w[1] * i)]);
			}
		}
		System.out.println(max);
	}
}