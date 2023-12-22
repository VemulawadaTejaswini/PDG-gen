import java.util.*;

public class Main {
	static long[][] dp;
	static int[] arrW;
	static int[] arrV;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w = sc.nextInt();
		dp = new long[n + 1][w + 1];
		arrW = new int[n + 1];
		arrV = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			arrW[i] = sc.nextInt();
			arrV[i] = sc.nextInt();
		}
		System.out.println(dfs(n, w));
	}
	
	static long dfs (int n, int w) {
		if (n < 0 || w < 0) {
			return Long.MIN_VALUE;
		}
		if (n == 0 || w == 0) {
			return 0;
		}
		if (dp[n][w] != 0) {
			return dp[n][w];
		}
		
		dp[n][w] = Math.max(dfs(n - 1, w), dfs(n - 1, w - arrW[n]) + arrV[n]);
		return dp[n][w];
	}
}
