import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	static class TaskF {
		class Edge implements Comparable<Edge> {
			int i;
			int j;
			long cost;

			public Edge(int i_, int j_, long cost_) {
				i = i_;
				j = j_;
				cost = cost_;
			}

			public int compareTo(Edge o) {
				return Long.compare(cost, o.cost);
			};
		}

		final long INF = Long.MAX_VALUE / 10;

		public void solve(int testNumber, InputReader in, PrintWriter out) {
			int N = in.nextInt();
			ArrayList<Edge> es = new ArrayList<>();
			long[][] a = new long[N][N];
			for (int i = 0; i < N; ++i) {
				for (int j = 0; j < N; ++j) {
					a[i][j] = in.nextInt();
					if (i > j)
						es.add(new Edge(i, j, a[i][j]));
				}
			}
			Collections.sort(es);
			long[][] dist = new long[N][N];
			for (int i = 0; i < N; ++i) {
				Arrays.fill(dist[i], INF);
				dist[i][i] = 0;
			}
			long[][] ret = new long[N][N];
			for (int i = 0; i < N; ++i) {
				for (int j = 0; j < N; ++j) {
					if (i == j)
						continue;
					ret[i][j] = INF;
				}
			}
			for (Edge e : es) {
				PriorityQueue<Edge>[] q = new PriorityQueue[2];
				for (int i = 0; i < q.length; ++i)
					q[i] = new PriorityQueue<>();
				long[][] d = new long[2][N];
				for (int i = 0; i < d.length; ++i) {
					Arrays.fill(d[i], INF);
				}

				q[0].add(new Edge(e.i, -1, 0));
				q[1].add(new Edge(e.j, -1, 0));
				boolean[][] vis = new boolean[2][N];
				out: while (!q[0].isEmpty() && !q[1].isEmpty()) {
					for (int i = 0; i < 2; ++i) {
						Edge s = q[i].poll();
						if (vis[i][s.i])
							continue;
						vis[i][s.i] = true;
						d[i][s.i] = s.cost;
						if (vis[i][s.i] && vis[i ^ 1][s.i]) {
							break out;
						}
						for (int dst = 0; dst < N; ++dst) {
							if (d[i][dst] > s.cost + ret[s.i][dst]) {
								d[i][dst] = s.cost + ret[s.i][dst];
								q[i].add(new Edge(dst, -1, d[i][dst]));
							}
						}
					}
				}
				long distance = INF;
				for (int middle = 0; middle < N; ++middle) {
					distance = Math.min(distance, d[0][middle] + d[1][middle]);
				}
				if (distance < a[e.i][e.j]) {
					System.out.println(-1);
					return;
				} else if (distance == a[e.i][e.j]) {

				} else if (ret[e.i][e.j] > a[e.i][e.j]) {
					ret[e.i][e.j] = e.cost;
					ret[e.j][e.i] = e.cost;
				}
			}

			long ans = 0;
			for (int i = 0; i < N; ++i) {
				for (int j = 0; j < N; ++j) {
					if (ret[i][j] != INF)
						ans += ret[i][j];
				}
			}
			System.out.println(ans / 2);
		}
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

	InputStream is;
	PrintWriter out;
	String INPUT = "";

	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskF solver = new TaskF();
		solver.solve(1, in, out);
		out.close();
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

	}

}