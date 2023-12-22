import java.util.*;

public class Main {
	static long[][][] dp;
	static int[] arr;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		dp = new long[n + 1][n + 1][a * n + 1];
		for (long[][] first : dp) {
			for (long[] second : first) {
				Arrays.fill(second, -1);
			}
		}
		long total = 0;
		for (int i = 1; i <= n; i++) {
			total += dfs(n, i, i * a);
		}
		System.out.println(total);
	}
	
	static long dfs(int x, int y, int total) {
		if (x < 0 || y < 0 || total < 0) {
			return 0;
		}
		if (dp[x][y][total] != -1) {
			return dp[x][y][total];
		}
		if (x == 0) {
			if (y == 0 && total == 0) {
				dp[x][y][total] = 1;
				return 1;
			} else {
				dp[x][y][total] = 0;
				return 0;
			}
		}
		long ans = dfs(x - 1, y, total) + dfs(x - 1, y - 1, total - arr[x - 1]);
		dp[x][y][total] = ans;
		return ans;
	}
}
