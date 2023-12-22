import java.io.*;
import java.util.*;

class Main {

	static final int M = 1000000007;

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int[][] dp = new int[n][k + 1];
		int[][] sum = new int[2][k + 2];
		for (int i = 0; i <= Math.min(k, a[0]); i++) {
			dp[0][k - i] = 1;
		}
		for (int i = 0; i <= k; i++) {
			sum[0][k - i] = (sum[0][k - i + 1] + dp[0][k - i]) % M;
		}

		for (int i = 1; i < n; i++) {
			for (int j = 0; j <= k; j++) {
				dp[i][k - j] = (sum[(i + 1) % 2][k - j] - sum[(i + 1) % 2][1 + Math.min(k, k - j + a[i])]) % M;
				dp[i][k - j] = (dp[i][k - j] + M) % M;
				sum[i % 2][k - j] = (sum[i % 2][k - j + 1] + dp[i][k - j]) % M;
			}
		}

		System.out.println(dp[n - 1][0]);
	}
}
