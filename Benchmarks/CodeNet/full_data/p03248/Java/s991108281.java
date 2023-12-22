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
		ProblemE solver = new ProblemE();
		solver.solve(1, in, out);
		out.close();
	}

	static class ProblemE {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			char[] s = ("0" + in.next()).toCharArray();
			int n = s.length - 1;

			List<Integer>[] adj = new List[n];
			for (int i = 0; i < n; i++) {
				adj[i] = new ArrayList<>();
			}
			addEdge(adj, 0, 1);
			int root = 1;
			for (int i = 2; i < n; i++) {
				addEdge(adj, root, i);
				if (s[i] == '1') {
					root = i;
				}
			}

			int[] sz = new int[n];
			dfs(adj, sz, root, -1);
			boolean[] got = new boolean[n + 1];
			for (int i = 0; i < n; i++) {
				if (i != root) {
					got[sz[i]] = true;
					got[n - sz[i]] = true;
				}
			}
			for (int i = 0; i <= n; i++) {
				if (got[i] != (s[i] == '1')) {
					out.println(-1);
					return;
				}
			}
			for (int i = 0; i < n; i++) {
				for (int j : adj[i]) {
					if (i < j) {
						out.println((i + 1) + " " + (j + 1));
					}
				}
			}
		}

		private void dfs(List<Integer>[] adj, int[] sz, int root, int p) {
			sz[root] = 1;
			for (int v : adj[root]) {
				if (v == p) {
					continue;
				}
				dfs(adj, sz, v, root);
				sz[root] += sz[v];
			}
		}

		private void addEdge(List<Integer>[] adj, int a, int b) {
			adj[a].add(b);
			adj[b].add(a);
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

	}
}

