import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskC solver = new TaskC();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskC {
		public class Edge {
			long cost;
			Node connectsTo;

			public Edge(long cost, Node connectsTo) {
				this.cost = cost;
				this.connectsTo = connectsTo;
			}
		}

		public class Node {
			public ArrayList<Edge> edges = new ArrayList<>();
			public long minDistansFromK = Long.MAX_VALUE;
			public boolean marked = false;
		}

		public void solve(int testNumber, InputReader in, PrintWriter out) {
			int n = in.nextInt();
			Node[] nodes = new Node[n];
			for (int i = 0; i < n; i++) {
				nodes[i] = new Node();
			}
			for (int i = 1; i < n; i++) {
				int a = in.nextInt() - 1;
				int b = in.nextInt() - 1;
				int c = in.nextInt();
				nodes[a].edges.add(new Edge(c, nodes[b]));
				nodes[b].edges.add(new Edge(c, nodes[a]));
			}
			int nubmerQuery = in.nextInt();
			int k = in.nextInt() - 1;
			Queue<Node> q = new LinkedList<>();
			q.add(nodes[k]);
			nodes[k].marked = true;
			nodes[k].minDistansFromK = 0;
			while (!q.isEmpty()) {
				Node currentNode = q.poll();
				for (Edge e : currentNode.edges) {
					if (!e.connectsTo.marked) {
						q.add(e.connectsTo);
						e.connectsTo.marked = true;
						e.connectsTo.minDistansFromK = currentNode.minDistansFromK + e.cost;
					}
				}
			}
			for (int i = 0; i < nubmerQuery; i++) {
				int x = in.nextInt() - 1;
				int y = in.nextInt() - 1;
				out.println(nodes[x].minDistansFromK + nodes[y].minDistansFromK);
			}
		}
	}

	static class InputReader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
			tokenizer = null;
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public double nextFloat() {
			return Double.parseDouble(next());
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

	}
}