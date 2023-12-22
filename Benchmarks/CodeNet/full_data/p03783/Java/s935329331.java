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
		TaskE solver = new TaskE();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskE {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			final int N = 410;
			final long infinity = (long) 1e18;
			int n = in.nextInt();
			int[] l = new int[n];
			int[] r = new int[n];
			for (int i = 0; i < n; i++) {
				l[i] = in.nextInt();
				r[i] = in.nextInt();
			}
			long[] d = new long[N];
			long[] nd = new long[N];
			for (int i = 0; i < n; i++) {
				Arrays.fill(nd, infinity);
				int len2 = r[i] - l[i];
				for (int x1 = 0; x1 < N; x1++) {
					if (d[x1] >= infinity) {
						continue;
					}
					int len1 = N;
					if (i > 0) {
						len1 = r[i - 1] - l[i - 1];
					}
					for (int x2 = 0; x2 < N; x2++) {
						int L = Math.max(x1, x2);
						int R = Math.min(x1 + len1, x2 + len2);
						if (L > R) {
							continue;
						}
						nd[x2] = Math.min(nd[x2], d[x1] + Math.abs(x2 - l[i]));
					}
				}
				long[] t = d;
				d = nd;
				nd = t;
			}
			long ans = infinity;
			for (long x : d) {
				ans = Math.min(ans, x);
			}
			out.println(ans);
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
					st = new StringTokenizer(in.readLine());
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

