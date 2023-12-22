import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Map;
import java.io.BufferedReader;
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
		ProblemD solver = new ProblemD();
		solver.solve(1, in, out);
		out.close();
	}

	static class ProblemD {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int height = in.nextInt();
			int width = in.nextInt();
			int n = in.nextInt();
			int[] rs = new int[n];
			int[] cs = new int[n];
			long[] as = new long[n];
			Map<Long, Long> map = new HashMap<>();
			for (int i = 0; i < n; i++) {
				rs[i] = in.nextInt();
				cs[i] = in.nextInt();
				as[i] = in.nextInt();
				map.put(f(rs[i], cs[i]), as[i]);
			}
			boolean[][] got = new boolean[4][Math.max(height, width) + 1];
			long[][] val = new long[4][Math.max(height, width) + 1];
			int[] dr = {-1, 0, 1, 0};
			int[] dc = {0, -1, 0, 1};
			for (int i = 0; i < n; i++) {
				int r1 = rs[i];
				int c1 = cs[i];
				for (int dir = 0; dir < 4; dir++) {
					int r2 = rs[i] + dr[dir];
					int c2 = cs[i] + dc[dir];
					if (!map.containsKey(f(r2, c2))) {
						continue;
					}
					long v = map.get(f(r2, c2)) - map.get(f(r1, c1));
					int id = r1;
					if (dr[dir] == 0) {
						id = c1;
					}
					if (got[dir][id] && val[dir][id] != v) {
						out.println("No");
						return;
					}
					got[dir][id] = true;
					val[dir][id] = v;
				}
			}
			for (int dir = 0; dir < 4; dir++) {
				int[] xs = rs;
				if (dr[dir] == 0) {
					xs = cs;
				}
				if (!check(xs, as, got[dir], val[dir])) {
					out.println("No");
					return;
				}
			}
			out.println("Yes");
		}

		private boolean check(int[] xs, long[] as, boolean[] got, long[] v) {
			long[] min = new long[v.length];
			for (int i = v.length - 1; i >= 0; i--) {
				if (!got[i]) {
					min[i] = Long.MAX_VALUE / 2;
					continue;
				}
				min[i] = v[i];
				if (i + 1 < v.length) {
					min[i] = Math.min(min[i], min[i + 1] + v[i]);
				}
			}
			for (int i = 0; i < xs.length; i++) {
				int x = xs[i];
				if (got[x] && as[i] + min[x] < 0) {
					return false;
				}
			}
			return true;
		}

		private long f(int r, int c) {
			return r * (long) (1e6) + c;
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

