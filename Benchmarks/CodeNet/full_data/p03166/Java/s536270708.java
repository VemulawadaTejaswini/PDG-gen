import java.util.*;
import java.io.*;

public class Main {


	public static void main(String[] args) {
		Main ans = new Main();
		System.out.println(ans.solve());
	}

	private long solve() {

		Scanner sc = new Scanner(System.in);
		Map<Integer,List<Integer>> graph = new HashMap<>();
		int N = sc.nextInt();
		int M = sc.nextInt();

		for(int i=0;i<M;i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			List<Integer> children = graph.getOrDefault(u, new ArrayList<Integer>());
			children.add(v);
			graph.put(u, children);
		}

		long [] dp = new long[N+1];
		long ans = Long.MIN_VALUE;
		for(int i=1;i<=N;i++) {
			ans = Math.max(ans, solve(i, dp, graph));
		}
		return ans;
	}

	private long solve(int u, long[] dp, Map<Integer, List<Integer>> graph) {
		if (dp[u]!=0) return dp[u];
		if (!graph.containsKey(u)) return 0L;
		long bestChild = 0;
		for(int child: graph.get(u)){ 
			bestChild = Math.max(bestChild, solve(child, dp, graph));
		}
		dp[u] = bestChild+1;
		return dp[u];
	}


}