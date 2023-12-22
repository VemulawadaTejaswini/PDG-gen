
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.LinkedList;

public class Main{
	public class pair implements Comparable<pair> {
		int wt;
		int val;
		double rat;

		pair(int a, int v) {
			wt = a;
			val = v;
			rat = v / wt;
		}

		@Override
		public int compareTo(pair o) {
			// TODO Auto-generated method stub
			return (int) (this.rat - o.rat);
		}

	}

	public static long mod = (long) (1e9 + 7);

	public static void main(String[] args) throws IOException {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		double head[] = new double[n];
		double tail[] = new double[n];
		for (int i = 0; i < n; i++) {
			head[i] = scn.nextDouble();
			tail[i] = 1 - head[i];
		}
		double dp[][] = new double[n][n + 1];
		dp[0][0] = tail[0];
		dp[0][1] = head[0];
		for (int i = 1; i < n; i++) {
			for (int j = 0; j <= n; j++) {
				dp[i][j] = dp[i - 1][j] * tail[i] + (j>0?dp[i - 1][j - 1] * head[i]:0);
			}
		}
		double ans = 0;
		for (int i = n / 2 + 1; i <= n; i++) {
			ans += dp[n - 1][i];
		}
		System.out.println(ans);

	}

	private static int dfs(int sr, HashSet<Integer> hset, int[] dp, ArrayList<Integer>[] g) {
		if (hset.contains(sr)) {
			return dp[sr];
		}
		hset.add(sr);
		int res = -1;
		for (int nei : g[sr]) {
			res = Math.max(res, dfs(nei, hset, dp, g));
		}
		dp[sr] = Math.max(dp[sr], res + 1);
		return dp[sr];

	}

}