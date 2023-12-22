import java.util.*;
import java.lang.*;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int W = sc.nextInt();
		long w1 = sc.nextLong();
		long[] w = new long[n + 1];
		long[] v = new long[n + 1];
		w[1] = w1;
		v[1] = sc.nextLong();
		for (int i = 2; i <= n; i++) {
			w[i] = sc.nextLong();
			v[i] = sc.nextLong();
		}
		long[][][] dp = new long[n + 1][n + 1][300];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				for (int k = 0; k < 300; k++) {
					if (k - (w[i] - w1) < 0) {
						dp[i][j][k] = dp[i - 1][j][k];
					} else {
						dp[i][j][k] = Math.max(dp[i - 1][j - 1][k - (int) (w[i] - w1)] + v[i], dp[i - 1][j][k]);
					}
				}
			}
		}
		long max = 0;
		for (int i = 0; i <= n; i++) {
			if (W - w1 * i >= 0 && W - w1 * i < 300) {
				max = Math.max(max, dp[n][i][W - (int)w1 * i]);
			}
		}
		System.out.println(max);
	}
}
