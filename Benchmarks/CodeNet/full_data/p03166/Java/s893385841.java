import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main ans = new Main();
		System.out.println(ans.solve());
	}

	private long solve() {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Map<Integer, List<Integer>> graph =new HashMap<>();
		for(int i=1;i<=M;i++){
			int u = sc.nextInt();
			int v = sc.nextInt();
			List<Integer> children = graph.getOrDefault(u, new ArrayList<Integer>());
			children.add(v);
			graph.put(u, children);
		}
		long [] dp = new long[N+1];
		long ans =0;
		for(int i=1;i<=N;i++){
			ans = Math.max(ans, solve(graph, i, dp));
		}

		return ans;
	}

	private long solve(Map<Integer, List<Integer>> graph, int u, long []dp) {
		if (!graph.containsKey(u))  return 0;
		if (dp[u]!=0) return dp[u];
		long bestChild =0;
		for(int child: graph.get(u)) {
			bestChild = Math.max(bestChild, solve(graph, child, dp));
		}
		dp[u] = bestChild+1;
		return dp[u];
	}



}