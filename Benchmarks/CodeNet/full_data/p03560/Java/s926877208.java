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
		TaskD solver = new TaskD();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskD {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int k = in.nextInt();
			final int N = (int) 1e5;
			final int MAX_DEPTH = 100;
			int[] best = new int[N];
			Arrays.fill(best, Integer.MAX_VALUE / 3);
			best[k] = 0;
			for (int depth = 0; depth + 1 < MAX_DEPTH; depth++) {
				for (int i = 0; i < N; i++) {
					for (int digit = 0; digit < 10; digit++) {
						int v = i + k * digit;
						int j = v / 10;
						if (j >= N) {
							continue;
						}
						best[j] = Math.min(best[j], best[i] + (v % 10));
					}
				}
			}
			int ans = Integer.MAX_VALUE;
			for (int i = 0; i < N; i++) {
				ans = Math.min(ans, best[i] + sumDigits(i));
			}
			out.println(ans);
		}

		private int sumDigits(int n) {
			int res = 0;
			while (n > 0) {
				res += n % 10;
				n /= 10;
			}
			return res;
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

