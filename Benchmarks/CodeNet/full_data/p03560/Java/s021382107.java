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
		int ans;
		int k;

		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			k = in.nextInt();
			ans = sumDigits(k);
			dfs(k, 0, 8);
			out.println(ans);
		}

		private void dfs(int v, int cur, int depth) {
			if (depth == 0) {
				return;
			}
			if (cur > ans) {
				return;
			}
			ans = Math.min(ans, sumDigits(v) + cur);
			if (k == 0) {
				return;
			}
			for (int x = 0; x < 10; x++) {
				int nv = v + k * x;
				dfs(nv / 10, cur + (nv % 10), depth - 1);
			}
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

