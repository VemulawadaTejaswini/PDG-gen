import java.util.Arrays;
import java.util.Scanner;

public class Main {
	int n;
	int[] x;
	long[][][] dp;

	long dp(int k, int t, int s) {
		if (k < 0 || t < 0 || s < 0) {
			return 0;
		}
		if (k == 0) {
			if (t == 0 && s == 0) {
				return 1;
			}
			if (t == 1 && s == x[0]) {
				return 1;
			}
			return 0;
		}
		if (0 <= dp[k][t][s]) {
			return dp[k][t][s];
		}

		long ret = dp(k - 1, t, s);
		ret += dp(k - 1, t - 1, s - x[k]);
		return dp[k][t][s] = ret;
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		int a = sc.nextInt();
		x = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
		long ans = 0;
		dp = new long[n][n + 1][a * n + 1];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n + 1; j++) {
				Arrays.fill(dp[i][j], -1);
			}
		}
		for (int i = 1; i <= n; i++) {
			ans += dp(n - 1, i, a * i);
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
