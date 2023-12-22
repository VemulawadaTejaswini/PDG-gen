import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Edge{
	int to;
	int cost;
	public Edge(int to, int cost) {
		this.to = to;
		this.cost = cost;
	}
}

public class Main {
	static List<Edge>[] tree;
	static long result = 0;

	static void dfs(boolean[] seen, int v, long cost, long[] costs) {
		seen[v] = true;
		costs[v] = cost;
		for(Edge next : tree[v]) {
			if(seen[next.to]) continue;
			costs[next.to] = costs[v] + next.cost;
			dfs(seen, next.to, cost + next.cost, costs);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[] seen = new boolean[n];
		long[] costs = new long[n];
		tree = new ArrayList[n];

		for(int i = 0; i < n; i++) {
			tree[i] = new ArrayList<>();
		}

		for(int i = 0; i < n - 1; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			int c = sc.nextInt();
			tree[a].add(new Edge(b, c));
			tree[b].add(new Edge(a, c));
		}

		int q = sc.nextInt();
		int k = sc.nextInt() - 1;
		int[] x = new int[q];
		int[] y = new int[q];

		for(int i = 0; i < q; i++) {
			x[i] = sc.nextInt() - 1;
			y[i] = sc.nextInt() - 1;
		}

		dfs(seen, k, 0, costs);

		for(int i = 0; i < q; i++) {
			System.out.println(costs[x[i]] + costs[y[i]]);
		}
		sc.close();
	}
}
