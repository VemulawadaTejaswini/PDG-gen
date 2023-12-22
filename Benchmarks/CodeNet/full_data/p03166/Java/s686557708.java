import java.util.*;
import java.io.*;

public class Main {


	public static void main(String[] args) {
		
		Main answer = new Main();
		long solution = answer.solve();
		System.out.println(solution);
	}

	private long [] dp = new long[100001];

	private long solve() {
		Arrays.fill(dp, -1);
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Map<Integer, List<Integer>> graph = new HashMap<>();
		for(int i=0;i<M;i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			List<Integer> vertices = graph.getOrDefault(u, new ArrayList<Integer>());
			vertices.add(v);
			graph.put(u, vertices);
		}
		long answer=0;
		for(int i=0;i<=N;i++) {
			long path = pathLength(graph, i);
			answer = Math.max(answer, path);
			//System.out.printf("path length from %d: %d\n", i, path);
		}
		return answer;
	}

	private long pathLength(Map<Integer, List<Integer>> graph, int u) {
		long answer =0;
		//System.out.printf("dp[%d]: %d\n", u, dp[u]);
		if (dp[u] !=-1) return dp[u];
		if (!graph.containsKey(u)) {
			dp[u]=0;
			return 0;
		} else {
			List<Integer> children = graph.get(u);			 
			//System.out.printf("children of %d: %s\n", u, Arrays.toString(children.toArray(new Integer[children.size()])));
			for(int v: graph.get(u)) {
				long path = pathLength(graph, v);
				//System.out.printf("length of %d: %d\n", v, path);
				answer = Math.max(answer, path);
			}
		}
		dp[u] = 1+ answer;
		//System.out.printf("dp[%d]: %d\n", u, dp[u]);
		return dp[u];
	}

}