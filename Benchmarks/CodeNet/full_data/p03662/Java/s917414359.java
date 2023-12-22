import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Collections;
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
		TaskD solver = new TaskD();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskD {
		List<Integer>[] adj;
		int[] p;

		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int n = in.nextInt();
			adj = new List[n];
			for (int i = 0; i < n; i++) {
				adj[i] = new ArrayList<>();
			}
			for (int i = 0; i < n - 1; i++) {
				int a = in.nextInt() - 1;
				int b = in.nextInt() - 1;
				adj[a].add(b);
				adj[b].add(a);
			}
			p = new int[n];
			p[0] = -1;
			dfs1(0);
			List<Integer> path = new ArrayList<>();
			for (int v = n - 1; v >= 0; v = p[v]) {
				path.add(v);
			}
			Collections.reverse(path);
			int bad = path.get((path.size() + 1) / 2);
			int a = dfs2(0, bad, -1);
			int b = n - a;
			out.println(a > b ? "Fennec" : "Snuke");
		}

		private void dfs1(int v) {
			for (int u : adj[v]) {
				if (u != p[v]) {
					p[u] = v;
					dfs1(u);
				}
			}
		}

		private int dfs2(int v, int bad, int pr) {
			int res = 1;
			for (int u : adj[v]) {
				if (u == pr || u == bad) {
					continue;
				}
				res += dfs2(u, bad, v);
			}
			return res;
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

