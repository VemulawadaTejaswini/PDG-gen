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
		D_DoubleLandscape solver = new D_DoubleLandscape();
		solver.solve(1, in, out);
		out.close();
	}

	static class D_DoubleLandscape {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			final int MOD = (int) (1e9 + 7);
			int n = in.nextInt();
			int m = in.nextInt();
			int[] a = new int[n];
			int[] cntA = new int[n * m];
			for (int i = 0; i < a.length; i++) {
				a[i] = in.nextInt() - 1;
				++cntA[a[i]];
			}
			int[] b = new int[m];
			int[] cntB = new int[n * m];
			for (int i = 0; i < b.length; i++) {
				b[i] = in.nextInt() - 1;
				++cntB[b[i]];
			}
			long ans = 1;
			int effN = 0;
			int effM = 0;
			for (int i = n * m - 1; i >= 0; i--) {
				if (cntA[i] > 1 || cntB[i] > 1) {
					ans = 0;
					break;
				}
				if (cntA[i] == 1 && cntB[i] == 1) {
					++effN;
					++effM;
					continue;
				}
				if (cntA[i] == 1 && cntB[i] == 0) {
					ans = ans * effM % MOD;
					++effN;
					continue;
				}
				if (cntA[i] == 0 && cntB[i] == 1) {
					ans = ans * effN % MOD;
					++effM;
					continue;
				}
				if (cntA[i] == 0 && cntB[i] == 0) {
					ans = ans * Math.max(0, (effN * effM - (n * m - i - 1))) % MOD;
					continue;
				}
				throw new AssertionError();
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

