import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static class Edge {
		int to, cost;

		public Edge(int to, int cost) {
			this.to = to;
			this.cost = cost;
		}
	}

	List<Edge>[] g;
	int[] color;

	void dfs(int u, int parent, long sum) {
		color[u] = (int) (sum % 2L);
		for (Edge e : g[u]) {
			if (e.to == parent)
				continue;
			dfs(e.to, u, sum + e.cost);
		}
	}

	void solve(Scanner in, PrintWriter out) {
		int n = in.nextInt();
		g = new ArrayList[n + 1];
		color = new int[n + 1];
		for (int i = 0; i <= n; ++i) {
			g[i] = new ArrayList<>();
		}
		for (int i = 0; i < n - 1; ++i) {
			int u = in.nextInt(), v = in.nextInt(), c = in.nextInt();
			g[u].add(new Edge(v, c));
			g[v].add(new Edge(u, c));
		}
		dfs(1, 0, 0);
		for (int i = 1; i <= n; ++i) {
			out.println(color[i]);
		}
	}

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)) {
			new Main().solve(in, out);
		}
	}
}
