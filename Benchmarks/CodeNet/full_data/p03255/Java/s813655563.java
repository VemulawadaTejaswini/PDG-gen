import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
		ProblemB solver = new ProblemB();
		solver.solve(1, in, out);
		out.close();
	}

	static class ProblemB {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int n = in.nextInt();
			long X = in.nextInt();
			long[] x = new long[n];
			for (int i = 0; i < n; i++) {
				x[i] = in.nextInt();
			}
			long[] d = new long[n];

			long big = 1;
			for (int i = 0; i < n; i++) {
				big += x[i] + X + 4 * x[i] + X;
			}

			for (int i = 0; i < n; i++) {
				d[i] = Long.MAX_VALUE;
				int am = 1;
				long cur = x[i] + X;
				for (int j = i; j >= 0; j--) {
					if (j < i) {
						long dc = getCost(x[j + 1] - x[j], am, big);
						cur = Math.min(big, cur + dc);
						am += 1;
					}

					long goBack = getCost(x[j], am, big);
					if (j == 0) {
						d[i] = Math.min(d[i], cur + goBack);
					} else {
						d[i] = Math.min(d[i], cur + goBack + d[j - 1]);
					}
				}
			}
			out.println(d[n - 1] + (long) n * X);
		}

		private long getCost(long x, int am, long big) {
			long c = x * (am + 1);
			if (c > big / (am + 1)) {
				return big;
			}
			return c * (am + 1);
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

