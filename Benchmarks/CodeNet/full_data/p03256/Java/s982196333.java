import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		FastScanner in = new FastScanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		ProblemC solver = new ProblemC();
		solver.solve(1, in, out);
		out.close();
	}

	static class ProblemC {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int n = in.nextInt();
			int m = in.nextInt();
			char[] s = in.next().toCharArray();
			List<Integer>[] adj = new List[n];
			for (int i = 0; i < n; i++) {
				adj[i] = new ArrayList<>();
			}
			int[][] deg = new int[2][n];
			for (int i = 0; i < m; i++) {
				int a = in.nextInt() - 1;
				int b = in.nextInt() - 1;
				adj[a].add(b);
				adj[b].add(a);
				++deg[s[a] - 'A'][b];
				++deg[s[b] - 'A'][a];
			}

			int[] q = new int[n];
			boolean[] was = new boolean[n];
			int qt = 0;
			int qh = 0;
			for (int i = 0; i < n; i++) {
				if (deg[0][i] == 0 || deg[1][i] == 0) {
					was[i] = true;
					q[qh++] = i;
				}
			}
			while (qt < qh) {
				int v = q[qt++];
				for (int u : adj[v]) {
					--deg[s[v] - 'A'][u];
					if (was[u]) {
						continue;
					}
					if (deg[0][u] == 0 || deg[1][u] == 0) {
						was[u] = true;
						q[qh++] = u;
					}
				}
			}
			out.println(qt < n ? "Yes" : "No");
		}

	}

	static class FastScanner {
		private BufferedReader in;
		private StringTokenizer st;

		public FastScanner(InputStream stream) {
			in = new BufferedReader(new InputStreamReader(stream));
		}

		public String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					String rl = in.readLine();
					if (rl == null) {
						return null;
					}
					st = new StringTokenizer(rl);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

	}
}

