
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskX solver = new TaskX();
		solver.solve(1, in, out);
		out.close();
	}

	static int INF = 1 << 30;
	static int modP = 1000000007;

	static class TaskX {
		public void solve(int testNumber, InputReader in, PrintWriter out) {

			int n = in.nextInt(), m = in.nextInt();
			Edge[] es = new Edge[m];
			for (int i = 0; i < m; i++) {
				int a = in.nextInt()-1;
				int b = in.nextInt()-1;
				long c = -in.nextLong();
				es[i] = new Edge(a, b, c);
			}

			long[] d = new long[n];

			if (findNegativeCycleByBellmanFord(es, d, 0)) {
				out.println("inf");
				return;
			}

			bellmanFord(es, d, 0);

			out.println(-d[n-1]);

		}
	}

	static void bellmanFord(Edge[] edges, long[] d, int fromNode) {

		int m = edges.length;
		long INF = Long.MAX_VALUE/3;

		Arrays.fill(d, INF);
		d[fromNode] = 0;

		while (true) {
			boolean update = false;
			for (int i = 0; i < m; i++) {
				Edge e = edges[i];
				if (d[e.fromNodeNum] == INF) {
					continue;
				}
				if (d[e.toNodeNum] > d[e.fromNodeNum] + e.weight) {
					d[e.toNodeNum] = d[e.fromNodeNum] + e.weight;
					update = true;
				}
			}
			if (!update) {
				break;
			}
		}
	}

	static boolean findNegativeCycleByBellmanFord(Edge[] edges, long[] d, int fromNode) {

		int v = d.length;
		int m = edges.length;

		Arrays.fill(d, 0);

		for (int i = 0; i < v; i++) {
			for (int j = 0; j < m; j++) {
				Edge e = edges[j];
				if (d[e.toNodeNum] > d[e.fromNodeNum] + e.weight) {
					d[e.toNodeNum] = d[e.fromNodeNum] + e.weight;
					if (i == v-1) return true;
				}
			}
		}
		return false;

	}

	static class Node {
		int nodeNum;
		long cost;

		public Node(int nodeNum, long weight) {
			this.nodeNum = nodeNum;
			this.cost = weight;
		}
	}
	static class Edge {
		int fromNodeNum;
		int toNodeNum;
		long weight;

		public Edge(int fromNodeNum, int toNodeNum, long weight) {
			this.fromNodeNum = fromNodeNum;
			this.toNodeNum = toNodeNum;
			this.weight = weight;
		}
	}

	static class InputReader {
		BufferedReader in;
		StringTokenizer tok;

		public String nextString() {
			while (!tok.hasMoreTokens()) {
				try {
					tok = new StringTokenizer(in.readLine(), " ");
				} catch (IOException e) {
					throw new InputMismatchException();
				}
			}
			return tok.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(nextString());
		}

		public long nextLong() {
			return Long.parseLong(nextString());
		}

		public double nextDouble() {
			return Double.parseDouble(nextString());
		}

		public int[] nextIntArray(int n) {
			int[] res = new int[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextInt();
			}
			return res;
		}

		public long[] nextLongArray(int n) {
			long[] res = new long[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextLong();
			}
			return res;
		}

		public InputReader(InputStream inputStream) {
			in = new BufferedReader(new InputStreamReader(inputStream));
			tok = new StringTokenizer("");
		}

	}

}
