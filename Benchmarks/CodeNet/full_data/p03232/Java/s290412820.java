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
		final int N = 200010;
		final int MOD = (int) (1e9 + 7);
		int[] fact = new int[N];
		int[] inv = new int[N];
		int[] invFact = new int[N];

		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			precalc();

			int n = in.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}

			long[] f = new long[n];
			for (int d = 0; d < n; d++) {
				int b = n - 1 - d;
				long cur = 0;
				for (int k = 0; k <= b; k++) {
					long v = 1;
					v = v * fact[n - k - 1] % MOD;
					v = v * invFact[b - k] % MOD;
					cur = (cur + v) % MOD;
				}
				f[d] = cur * fact[b] % MOD;
			}

			long ans = 0;
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				ans = (ans + f[Math.abs(i - j)] * a[i]) % MOD;
//			}
//		}

			long[] inc = new long[n + 1];
			for (int i = 0; i < n; i++) {
				addSegment(inc, 0, 0, a[i]);
				addSegment(inc, 1, i, a[i]);
				addSegment(inc, 1, n - i - 1, a[i]);
			}

			long sum = 0;
			for (int i = 0; i < n; i++) {
				sum += inc[i];
				ans = (ans + sum * f[i]) % MOD;
			}

			out.println(ans);
		}

		private void addSegment(long[] inc, int l, int r, int val) {
			inc[l] += val;
			if (inc[l] >= MOD) {
				inc[l] -= MOD;
			}
			inc[r + 1] -= val;
			if (inc[r + 1] < 0) {
				inc[r + 1] += MOD;
			}
		}

		private void precalc() {
			inv[1] = 1;
			for (int i = 2; i < N; i++) {
				inv[i] = (int) ((MOD - (MOD / i) * (long) inv[MOD % i] % MOD) % MOD);
			}
			fact[0] = 1;
			invFact[0] = 1;
			for (int i = 1; i < N; i++) {
				fact[i] = (int) (i * (long) fact[i - 1] % MOD);
				invFact[i] = (int) (inv[i] * (long) invFact[i - 1] % MOD);
			}
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

