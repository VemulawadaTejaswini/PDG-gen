import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tokens = br.readLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		int M = Integer.parseInt(tokens[1]);
		int P = Integer.parseInt(tokens[2]);
		Edge[] edges = new Edge[M];
		for (int i = 0; i < M; i++) {
			tokens = br.readLine().split(" ");
			int src = Integer.parseInt(tokens[0]) - 1;
			int dest = Integer.parseInt(tokens[1]) - 1;
			int weight = Integer.parseInt(tokens[2]);
			edges[i] = new Edge(src, dest, weight);
		}
		Long[] dist = new Long[N];
		dist[0] = 0L;
		long max = 0;
		for (int i = 1; i < N; i++) {
//			System.out.println(Arrays.toString(dist));
			Long[] currDist = new Long[N];
			for (Edge e : edges) {
				currDist[e.v] = max(currDist[e.v], max(dist[e.v], dist[e.u], e.w));
//				System.out.println(currDist[e.v] + " max");
//				System.out.println(Arrays.toString(currDist));
			}
			if (currDist[N - 1] != null) {
				max = Math.max(max, currDist[N - 1] - P * i);
			}
//			System.out.println(Arrays.toString(currDist));
			for (int v = 0; v < N; v++) {
				dist[v] = max(dist[v], currDist[v]);
			}
		}
//		System.out.println(Arrays.toString(dist));
		if (dist[N - 1] == null) {
			System.out.println(-1);
			return;
		}
		for (Edge e : edges) {
			if (e.v == N - 1 && dist[e.u] != null && dist[N - 1] < dist[e.u] + e.w) {
//				System.out.println(dist[e.u] + e.w + " " + dist[e.v]);
				System.out.println(-1);
				return;
			}
		}
		System.out.println(max);
	}

	public static Long max(Long a, Long b) {
		if (a == null && b == null)
			return null;
		if (a == null)
			return b;
		if (b == null)
			return a;
		return Long.max(a, b);
	}

	public static Long max(Long a, Long b, long weight) {
//		System.out.println(a + " " + b + " " + weight);
		if (a == null && b == null)
			return null;
		if (a == null)
			return b + weight;
		if (b == null)
			return a;
		return Long.max(a, b + weight);
	}

	static class Edge {
		int u;
		int v;
		int w;

		Edge(int src, int dest, int w) {
			u = src;
			v = dest;
			this.w = w;
		}

		Edge(Edge e) {
			u = e.u;
			v = e.v;
			w = e.w;
		}

		@Override
		public String toString() {
			return String.valueOf(v);
		}
	}

}