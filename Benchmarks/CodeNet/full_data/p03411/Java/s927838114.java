import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
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
		TaskC solver = new TaskC();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskC {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int n = in.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			int[] c = new int[n];
			int[] d = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
				b[i] = in.nextInt();
			}
			for (int i = 0; i < n; i++) {
				c[i] = in.nextInt();
				d[i] = in.nextInt();
			}
			boolean[][] g = new boolean[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (a[i] < c[j] && b[i] < d[j]) {
						g[i][j] = true;
					}
				}
			}
			out.println(bipartiteMatching(g));
		}

		private int bipartiteMatching(boolean[][] g) {
			int n = g.length;
			if (n == 0) {
				return 0;
			}
			int m = g[0].length;
			boolean[] was = new boolean[n];
			int[] pair = new int[m];
			Arrays.fill(pair, -1);
			int res = 0;
			for (int i = 0; i < n; i++) {
				Arrays.fill(was, false);
				if (dfs(i, g, was, pair)) {
					++res;
				}
			}
			return res;
		}

		private boolean dfs(int i, boolean[][] g, boolean[] was, int[] pair) {
			if (was[i]) {
				return false;
			}
			was[i] = true;
			for (int j = 0; j < g[i].length; j++) {
				if (!g[i][j]) {
					continue;
				}
				if (pair[j] < 0 || dfs(pair[j], g, was, pair)) {
					pair[j] = i;
					return true;
				}
			}
			return false;
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

