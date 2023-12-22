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
		ProblemC solver = new ProblemC();
		solver.solve(1, in, out);
		out.close();
	}

	static class ProblemC {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			final int MOD = (int) (1e9 + 7);
			int n = in.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}
			int[] b = new int[n];
			for (int i = 0; i < n; i++) {
				b[i] = in.nextInt();
			}
			int[] l1 = new int[n];
			int[] r1 = new int[n];
			for (int i = 0; i < n; i++) {
				r1[i] = a[i];
				if (i == 0 || a[i] != a[i - 1]) {
					l1[i] = a[i];
				} else {
					l1[i] = 1;
				}
			}
			int[] l2 = new int[n];
			int[] r2 = new int[n];
			for (int i = n - 1; i >= 0; i--) {
				r2[i] = b[i];
				if (i == n - 1 || b[i] != b[i + 1]) {
					l2[i] = b[i];
				} else {
					l2[i] = 1;
				}
			}
			long ans = 1;
			for (int i = 0; i < n; i++) {
				int l = Math.max(l1[i], l2[i]);
				int r = Math.min(r1[i], r2[i]);
				if (l <= r) {
					ans = ans * (r - l + 1) % MOD;
				} else {
					ans = 0;
				}
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

