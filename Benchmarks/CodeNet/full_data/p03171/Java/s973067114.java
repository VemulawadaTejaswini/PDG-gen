
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		int[][] dp = new int[n][n];
		boolean[][] vis=new boolean[n][n];
		System.out.println(rec(arr, 0, n - 1, dp,vis));
	}

	public static int rec(int[] arr, int i, int j, int[][] dp,boolean[][] vis) {
		if (i == j) {
			dp[i][j] = arr[i];
			vis[i][j]=true;
			return dp[i][j];
		}
		if (vis[i][j])
			return dp[i][j];
         vis[i][j]=true;
		dp[i][j] = Math.max(arr[i] - rec(arr, i + 1, j, dp,vis), arr[j] - rec(arr, i, j - 1, dp,vis));
		return dp[i][j];
	}
}
