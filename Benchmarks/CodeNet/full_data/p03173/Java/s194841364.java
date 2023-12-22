import java.util.Scanner;

public class Main {
	static long[] b;
	static long[][] dp;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		b = new long[n + 1];
		for (int i = 1; i <= n; i++) {
			b[i] = b[i - 1] + a[i];
		}

		dp = new long[n + 1][n + 1];
		System.out.println(dfs(1, n));
	}

	static long dfs(int l, int r) {
		if (dp[l][r] > 0 || l == r) {
			return dp[l][r];
		}

		long ret = Long.MAX_VALUE;
		for (int i = l; i < r; i++) {
			long val = dfs(l, i) + dfs(i + 1, r) + b[r] - b[l - 1];
			ret = Math.min(ret, val);
		}
		return dp[l][r] = ret;
	}
}
