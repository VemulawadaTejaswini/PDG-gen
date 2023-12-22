

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		List<List<Integer>> adj = new ArrayList<>();
		int n = scan.nextInt();
		int m = scan.nextInt();

		for (int i = 0; i <= n; i++) {
			adj.add(i, new ArrayList<>());
		}

		for (int i = 1; i <= m; i++) {
			adj.get(scan.nextInt()).add(scan.nextInt());
		}

		int[] dp = new int[n + 1];
		int path = Integer.MIN_VALUE;
		
		for (int i = 1; i <= n; i++) {
			path = Math.max(path, findLongestPath(adj, i, dp));
		}
		System.out.println(path);

	}

	public static int findLongestPath(List<List<Integer>> adj, int node, int dp[]) {
		if (adj.get(node).size() == 0) {
			return 0;
		}

		if (dp[node] != 0) {
			return dp[node];
		}
		List<Integer> nbrs = adj.get(node);
		int path = Integer.MIN_VALUE;
		for (int nbr : nbrs) {
			path = Math.max(path, findLongestPath(adj, nbr, dp));
		}

		dp[node] = path + 1;
		return dp[node];

	}
}
