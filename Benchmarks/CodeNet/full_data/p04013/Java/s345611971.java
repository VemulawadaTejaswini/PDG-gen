import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int[] x = new int[n + 1];
		int max = a;
		for (int i = 1; i <= n; i++) {
			x[i] = sc.nextInt();
			max = Math.max(max, x[i]);
		}
		long[][][] dp = new long[n + 1][n + 1][n * max + 1];
		for (int i = 0; i <= n; i++) {
			dp[i][0][0] = 1;
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				for (int k = 0; k <= n * max; k++) {
					if (k - x[i] < 0) {
						dp[i][j][k] = dp[i - 1][j][k];
					} else if (j > 0 && k - x[i] >= 0) {
						dp[i][j][k] = dp[i - 1][j][k] + dp[i - 1][j - 1][k - x[i]];
					}
				}
			}
		}
		long sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += dp[n][i][i * a];
		}
		System.out.println(sum);
	}
}