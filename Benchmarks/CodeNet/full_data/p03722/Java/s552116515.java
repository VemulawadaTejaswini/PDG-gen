
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

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

	static int maxN = 1000;
	static int maxM = 2000;
	static int n;
	static int m;
	static long INF = Long.MAX_VALUE;
	static class TaskX {
		public void solve(int testNumber, InputReader in, PrintWriter out) {

			// input
			n = in.nextInt();
			m = in.nextInt();

			long[] d = new long[n];
			Edge[] edges = new Edge[m];

			for (int i = 0; i < m; i++) {
				int a = in.nextInt()-1;
				int b = in.nextInt()-1;
				long c = in.nextLong();
				edges[i] = new Edge(a, b, -c);
			}

			Arrays.fill(d, INF);

			d[0] = 0;

			boolean updated = true;
			boolean isNegative = false;

			int count = 0;
			outer:
			while (updated) {
				updated = false;
				for (Edge e : edges) {
					if (d[e.from] == INF) {
						continue;
					}
					if (d[e.to] > d[e.from] + e.cost) {
						d[e.to] = d[e.from] + e.cost;
						updated = true;
						if (count == n-1) {
							isNegative = true;
							break outer;
						}
					}
				}
				count++;
			}

			if (isNegative) {
				out.println("inf");
			} else {
				out.println(-d[n-1]);
			}


		}
	}

	static class Edge {
		int from;
		int to;
		long cost;

		public Edge(int from, int toNodeNum, long weight) {
			this.from = from;
			this.to = toNodeNum;
			this.cost = weight;
		}
	}

	static class ArrayUtils {
		public static Map<Integer, Integer> getCountMap(int[] array) {
			Map<Integer, Integer> map = new TreeMap<>();
			for (int x : array)
				map.merge(x, 1, Integer::sum);
			return map;
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
