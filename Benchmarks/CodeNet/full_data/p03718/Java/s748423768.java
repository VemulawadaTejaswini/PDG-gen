import java.util.*;
import java.lang.*;

class Main {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] a = new char[h][w];
		for (int i = 0; i < h; i++) {
			a[i] = sc.next().toCharArray();
		}

		for (int i = 0; i < h; i++) {
			int count = 0;
			for (int j = 0; j < w; j++) {
				if (a[i][j] == 'S' || a[i][j] == 'T') count++;
			}
			if (count >= 2) {
				System.out.println(-1);
				return;
			}
		}


		for (int j = 0; j < w; j++) {
			int count = 0;
			for (int i = 0; i < h; i++) {
				if (a[i][j] == 'S' || a[i][j] == 'T') count++;
			}
			if (count >= 2) {
				System.out.println(-1);
				return;
			}
		}

		Dinic dinic = new Dinic(h + w + 2);
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				switch (a[i][j]) {
					case '.':
						break;
					case 'o':
						dinic.addEdge(i, h + j, 1);
						dinic.addEdge(h + j, i, 1);
						break;
					case 'S':
						dinic.addEdge(h + w, h + j, Integer.MAX_VALUE);
						dinic.addEdge(h + w, i, Integer.MAX_VALUE);
						break;
					case 'T':
						dinic.addEdge(h + j, h + w + 1, Integer.MAX_VALUE);
						dinic.addEdge(i, h + w + 1, Integer.MAX_VALUE);
						break;
				}
			}
		}

		long f = dinic.maxFlow(h + w, h + w + 1);
		System.out.println(f);
	}

	static class Dinic {
		private List<Edge>[] g;
		private int[] level;
		private int[] iterator;

		class Edge {
			int to;
			int cap;
			int residualId;

			public Edge(int to, int cap, int residualId) {
				this.to = to;
				this.cap = cap;
				this.residualId = residualId;
			}
		}

		public Dinic(int n) {
			g = new ArrayList[n];
			level = new int[n];
			iterator = new int[n];
			for (int i = 0; i < g.length; i++) {
				g[i] = new ArrayList<>();
			}
		}

		public void addEdge(int from, int to, int cap) {
			g[from].add(new Edge(to, cap, g[to].size()));
			g[to].add(new Edge(from, 0, g[from].size() - 1)); // residual path
		}

		public long maxFlow(int s, int t) {
			long flow = 0;
			while (true) {
				bfs(s);
				if (level[t] < 0) break;
				Arrays.fill(iterator, 0);
				while (true) {
					long f = dfs(s, t, Long.MAX_VALUE);
					if (f == 0) break;
					flow += f;
				}
			}
			return flow;
		}

		private void bfs(int s) {
			Arrays.fill(level, -1);
			Queue<Integer> q = new LinkedList<>();
			level[s] = 0;
			q.offer(s);
			while (!q.isEmpty()) {
				int v = q.poll();
				for (int i = 0; i < g[v].size(); i++) {
					Edge e = g[v].get(i);
					if (e.cap > 0 && level[e.to] < 0) {
						level[e.to] = level[v] + 1;
						q.offer(e.to);
					}

				}
			}
		}

		private long dfs(int s, int t, long f) {
			if (s == t) return f;
			for (int i = iterator[s]; i < g[s].size(); i = ++iterator[s]) {
				Edge e = g[s].get(i);
				if (e.cap > 0 && level[s] < level[e.to]) {
					long d = dfs(e.to, t, Math.min(e.cap, f));
					if (d > 0) {
						e.cap -= d;
						g[e.to].get(e.residualId).cap += d;
						return d;
					}
				}
			}
			return 0;
		}
	}
}
