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
		TaskF solver = new TaskF();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskF {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int n = in.nextInt();
			int[] p = new int[n];
			for (int i = 0; i < n; i++) {
				p[i] = in.nextInt() - 1;
			}
			int[] first = new int[n];
			int[] next = new int[n + 1];
			int[] dst = new int[n + 1];
			Arrays.fill(first, -1);
			int numEdges = 0;
			for (int i = 0; i < n; i++) {
				int e = numEdges++;
				next[e] = first[p[i]];
				first[p[i]] = e;
				dst[e] = i;
			}

			int[] a = new int[n];
			boolean[] used = new boolean[n];
			for (int step = 0; step < 150; step++) {
				for (int i = 0; i < n; i++) {
					for (int e = first[i]; e >= 0; e = next[e]) {
						int j = dst[e];
						used[a[j]] = true;
					}
					a[i] = 0;
					while (used[a[i]]) {
						++a[i];
					}
					for (int e = first[i]; e >= 0; e = next[e]) {
						int j = dst[e];
						used[a[j]] = false;
					}
				}
			}

			boolean ans = true;
			for (int i = 0; i < n; i++) {
				if (a[i] == a[p[i]]) {
					ans = false;
				}
			}
			for (int i = 0; i < n; i++) {
				for (int e = first[i]; e >= 0; e = next[e]) {
					int j = dst[e];
					used[a[j]] = true;
				}
				for (int c = 0; c < a[i]; c++) {
					if (!used[c]) {
						ans = false;
					}
				}
				for (int e = first[i]; e >= 0; e = next[e]) {
					int j = dst[e];
					used[a[j]] = false;
				}
			}
			out.println(ans ? "POSSIBLE" : "IMPOSSIBLE");
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

