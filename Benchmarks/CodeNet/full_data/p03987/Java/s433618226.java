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
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt() - 1;
			}
			int[] l = calc(a);
			a = rev(a);
			int[] r = calc(a);
			r = rev(r);
			long ans = 0;
			a = rev(a);
			for (int i = 0; i < n; i++) {
				ans += (long) (a[i] + 1) * l[i] * r[i];
			}
			out.println(ans);
		}

		private int[] calc(int[] a) {
			int[] s = new int[a.length];
			int[] l = new int[a.length];
			int p = 0;
			for (int i = 0; i < a.length; i++) {
				while (p > 0 && a[s[p - 1]] > a[i]) {
					--p;
				}
				if (p == 0) {
					l[i] = i + 1;
				} else {
					l[i] = i - s[p - 1];
				}
				s[p++] = i;
			}
			return l;
		}

		private int[] rev(int[] a) {
			int[] b = new int[a.length];
			for (int i = 0; i < a.length; i++) {
				b[i] = a[a.length - i - 1];
			}
			return b;
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

