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
		TaskD solver = new TaskD();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskD {
		final int MOD = (int) (1e9 + 7);

		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int n = in.nextInt();
			int m = in.nextInt();
			int[] x = new int[n];
			for (int i = 0; i < x.length; i++) {
				x[i] = in.nextInt();
			}
			int[] y = new int[m];
			for (int i = 0; i < y.length; i++) {
				y[i] = in.nextInt();
			}
			int s = f(x, 1);
			int ans = f(y, s);
			out.println(ans);
		}

		private int f(int[] x, int s) {
			long res = 0;
			long sum = 0;
			for (int i = 0; i < x.length; i++) {
				long cx = x[i] % MOD;
				if (cx < 0) {
					cx += MOD;
				}
				long cur = i * cx % MOD;
				cur -= sum;
				if (cur < 0) {
					cur += MOD;
				}
				res = (res + cur * s) % MOD;
				sum += cx;
				if (sum >= MOD) {
					sum -= MOD;
				}
			}
			return (int) res;
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

