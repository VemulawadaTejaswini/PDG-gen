import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static int[] a;
	private static int[][] dp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int z = sc.nextInt();
		int w = sc.nextInt();

		a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		dp = new int[n + 1][2];
		for (int i = 0; i <= n; i++) {
			Arrays.fill(dp[i], -1);
		}

		System.out.println(dfs(0, 0, z, w));
	}

	private static int dfs(int current, int who, int z, int w) {
		if (current >= a.length) {
			dp[current][who] = Math.abs(z - w);
			return dp[current][who];
		}

		if (dp[current][who] >= 0) return dp[current][who];

		int score;
		if (who == 0) {
			score = Integer.MIN_VALUE;

			for (int k = current; k < a.length; k++) {
				score = Math.max(score, dfs(k + 1, 1, a[k], w));
			}

		} else {
			score = Integer.MAX_VALUE;

			for (int k = current; k < a.length; k++) {
				score = Math.min(score, dfs(k + 1, 0, z, a[k]));
			}
		}

		dp[current][who] = score;
		return dp[current][who];
	}
}
