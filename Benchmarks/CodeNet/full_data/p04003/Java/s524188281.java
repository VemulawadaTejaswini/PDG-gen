import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	int gen = 0;

	class Edge implements Comparable<Edge> {
		int src, dst, c;
		int cur;
		long dist;
		int id = gen++;

		public Edge(int src_, int dst_, int c_) {
			src = src_;
			dst = dst_;
			c = c_;
		}

		public Edge(int src_, int dst_, int c_, int dist_) {
			src = src_;
			dst = dst_;
			c = c_;
			dist = dist_;
		}

		@Override
		public int compareTo(Edge o) {
			return Long.compare(dist, o.dist);
		}

	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] p = new int[m];
		int[] q = new int[m];
		int[] c = new int[m];
		ArrayList<Edge>[] g = new ArrayList[n];
		for (int i = 0; i < n; ++i) {
			g[i] = new ArrayList<>();
		}
		for (int i = 0; i < m; ++i) {
			p[i] = sc.nextInt();
			q[i] = sc.nextInt();
			c[i] = sc.nextInt();
			--p[i];
			--q[i];
			g[p[i]].add(new Edge(p[i], q[i], c[i]));
			g[q[i]].add(new Edge(q[i], p[i], c[i]));
		}
		solve(n, m, g);
	}

	void solve(int n, int m, ArrayList<Edge>[] g) {
		long ans = Long.MAX_VALUE / 10;
		long[] dist = new long[2 * m];
		Arrays.fill(dist, Long.MAX_VALUE / 10);
		PriorityQueue<Edge> pq = new PriorityQueue<>();
		for (Edge e : g[0]) {
			e.dist = 1;
			pq.add(e);
			dist[e.id] = 1;
		}
		while (!pq.isEmpty()) {
			Edge e1 = pq.poll();
			for (Edge e2 : g[e1.dst]) {
				int cost = (e2.c == e1.c ? 0 : 1);
				if (dist[e2.id] > dist[e1.id] + cost) {
					dist[e2.id] = dist[e1.id] + cost;
					if (e2.dst == n - 1) {
						ans = Math.min(ans, dist[e2.id]);
					}
					e2.dist = dist[e2.id];
					pq.add(e2);
				}
			}
		}
		System.out.println(ans > 1e10 ? -1 : ans);

	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
