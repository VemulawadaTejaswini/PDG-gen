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
		C_WhenIHitMyPocket solver = new C_WhenIHitMyPocket();
		solver.solve(1, in, out);
		out.close();
	}

	static class C_WhenIHitMyPocket {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			long k = in.nextLong();
			long a = in.nextLong();
			long b = in.nextLong();
			if (k < a - 1) {
				out.println(k + 1);
				return;
			}
			k -= a - 1;
			long ans = a;
			if (k % 2 == 1) {
				++ans;
				--k;
			}
			if (b - a > 2) {
				ans += (b - a) * (k / 2);
			} else {
				ans += k;
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

		public long nextLong() {
			return Long.parseLong(next());
		}

	}
}

