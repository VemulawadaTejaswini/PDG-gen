import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.Set;
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
			int numTests = in.nextInt();
			for (int test = 0; test < numTests; test++) {
				long a = in.nextLong();
				long b = in.nextLong();
				long c = in.nextLong();
				long d = in.nextLong();
				out.println(solve(a, b, c, d) ? "Yes" : "No");
			}
		}

		private boolean solve(long a, long b, long c, long d) {
			if (b > a) {
				return false;
			}
			if (a > c) {
				long k = (a - c) / b;
				if (a - k * b == c) {
					--k;
				}
				assert (a - k * b > c);
				assert (a - (k + 1) * b <= c);
				a -= k * b;
			}
			if (b > a) {
				return false;
			}
			if (b > d) {
				return false;
			}
			if (b == d) {
				return true;
			}
			if (b <= c) {
				return true;
			}

			Set<Long> was = new HashSet<>();
			assert (b <= a && b > c && b < d && a - b <= c);
			long e = d - b;
			for (int i = 0; i < 3000; i++) {
				if (was.contains(a)) {
					return true;
				}
				was.add(a);
				assert (a > c);
				assert (a - b <= c);
				long k = 1 + (c + b - a) / e;
				assert (a + k * e - b > c);
				assert (a + (k - 1) * e - b <= c);
				a = a + k * e - b;
				if (a < b) {
					return false;
				}

				k = (a - c) / b;
				if (a - k * b == c) {
					--k;
				}
				assert (a - k * b > c);
				assert (a - (k + 1) * b <= c);
				a -= k * b;
			}

			return true;
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

		public long nextLong() {
			return Long.parseLong(next());
		}

	}
}

