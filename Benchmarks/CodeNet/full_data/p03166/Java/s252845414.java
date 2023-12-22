
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.LinkedList;

public class Main {
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

	public static void main(String[] args) throws IOException {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		ArrayList<Integer> g[] = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			g[i] = new ArrayList<>();
		}
		for (int i = 0; i < m; i++) {
			int x = scn.nextInt() - 1;
			int y = scn.nextInt() - 1;
			g[x].add(y);
		}
		int dp[] = new int[n];
		HashSet<Integer> hset = new HashSet<>();
		for (int i = 0; i < n; i++) {
			if(!hset.contains(i)){
			dp[i] = dfs(i, hset, dp, g);}
		}
		int max = 0;
		for(int v : dp) {
			max = Math.max(max, v);
		}
		System.out.println(max);
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
		dp[sr] = Math.max(dp[sr], res+1);
		return dp[sr];

	}

}