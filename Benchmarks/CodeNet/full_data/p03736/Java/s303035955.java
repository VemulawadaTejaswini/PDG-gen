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
		TaskF solver = new TaskF();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskF {
		final long infinity = (long) (1e12);

		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int n = in.nextInt();
			int numQueries = in.nextInt();
			int a = in.nextInt() - 1;
			int b = in.nextInt() - 1;
			int[] xs = new int[numQueries];
			for (int i = 0; i < xs.length; i++) {
				xs[i] = in.nextInt() - 1;
			}
			long[] da = new long[n];
			long[] db = new long[n];
			Arrays.fill(da, infinity);
			Arrays.fill(db, infinity);
			da[a] = Math.abs(b - xs[0]);
			db[b] = Math.abs(a - xs[0]);

//		// Slow version:
//		for (int it = 1; it < xs.length; it++) {
//			int x = xs[it];
//			int p = xs[it - 1];
//			long dx = Math.abs(x - p);
//
//			long dap = infinity;
//			long dbp = infinity;
//			for (int i = 0; i <= x; i++) {
//				dap = Math.min(dap, db[i] + (x - i));
//				dbp = Math.min(dbp, da[i] + (x - i));
//			}
//			for (int i = x; i < n; i++) {
//				dap = Math.min(dap, db[i] + (i - x));
//				dbp = Math.min(dbp, da[i] + (i - x));
//			}
//
//			for (int i = 0; i < n; i++) {
//				da[i] += dx;
//				db[i] += dx;
//			}
//
//			out.println(Arrays.toString(da));
//
//			da[p] = Math.min(da[p], dap);
//			db[p] = Math.min(db[p], dbp);
//
//			out.println(Arrays.toString(da));
//		}
//		long ans = infinity;
//		for (int i = 0; i < n; i++) {
//			ans = Math.min(ans, da[i]);
//			ans = Math.min(ans, db[i]);
//		}
//		out.println(ans);

			Tree ta0 = new Tree(n);
			Tree ta1 = new Tree(n);
			Tree ta2 = new Tree(n);
			Tree tb0 = new Tree(n);
			Tree tb1 = new Tree(n);
			Tree tb2 = new Tree(n);
			for (int i = 0; i < n; i++) {
				ta0.set(i, da[i]);
				ta1.set(i, da[i] + i);
				ta2.set(i, da[i] - i);
				tb0.set(i, db[i]);
				tb1.set(i, db[i] + i);
				tb2.set(i, db[i] - i);
			}

			for (int it = 1; it < xs.length; it++) {
				int x = xs[it];
				int p = xs[it - 1];
				long dx = Math.abs(x - p);

				long dap = infinity;
				dap = Math.min(dap, tb2.getMin(0, x) + x);
				dap = Math.min(dap, tb1.getMin(x, n - 1) - x);

				long dbp = infinity;
				dbp = Math.min(dbp, ta2.getMin(0, x) + x);
				dbp = Math.min(dbp, ta1.getMin(x, n - 1) - x);

				ta0.add(0, n - 1, dx);
				ta1.add(0, n - 1, dx);
				ta2.add(0, n - 1, dx);
				tb0.add(0, n - 1, dx);
				tb1.add(0, n - 1, dx);
				tb2.add(0, n - 1, dx);

				dap = Math.min(dap, ta0.getMin(p, p));
				dbp = Math.min(dbp, tb0.getMin(p, p));

				ta0.set(p, dap);
				ta1.set(p, dap + p);
				ta2.set(p, dap - p);
				tb0.set(p, dbp);
				tb1.set(p, dbp + p);
				tb2.set(p, dbp - p);
			}

			long ans = infinity;
			ans = Math.min(ans, ta0.getMin(0, n - 1));
			ans = Math.min(ans, tb0.getMin(0, n - 1));
			out.println(ans);
		}

		class Tree {
			int n;
			long[] min;
			long[] add;

			Tree(int n) {
				this.n = n;
				add = new long[4 * n];
				min = new long[4 * n];
			}

			void set(int i, long val) {
				long cur = getMin(i, i);
				add(i, i, val - cur);
			}

			void add(int l, int r, long val) {
				add(0, l, r, 0, n - 1, val);
			}

			long getMin(int l, int r) {
				return getMin(0, l, r, 0, n - 1);
			}

			private long getMin(int root, int l, int r, int L, int R) {
				if (l > r || l > R || L > r || L > R) {
					return infinity;
				}
				if (l == L && r == R) {
					return min[root];
				}
				push(root);
				int M = (L + R) / 2;
				long m1 = getMin(2 * root + 1, l, Math.min(M, r), L, M);
				long m2 = getMin(2 * root + 2, Math.max(M + 1, l), r, M + 1, R);
				return Math.min(m1, m2);
			}

			private void add(int root, int l, int r, int L, int R, long val) {
				if (l > r || l > R || L > r || L > R) {
					return;
				}
				if (l == L && r == R) {
					add[root] += val;
					min[root] += val;
					fix(root);
					return;
				}
				push(root);
				int M = (L + R) / 2;
				add(2 * root + 1, l, Math.min(M, r), L, M, val);
				add(2 * root + 2, Math.max(M + 1, l), r, M + 1, R, val);
				min[root] = Math.min(min[2 * root + 1], min[2 * root + 2]);
			}

			void push(int root) {
				add[2 * root + 1] += add[root];
				add[2 * root + 2] += add[root];
				min[2 * root + 1] += add[root];
				min[2 * root + 2] += add[root];
				fix(2 * root + 1);
				fix(2 * root + 2);
				add[root] = 0;
			}

			void fix(int i) {
				add[i] = Math.min(add[i], infinity);
				min[i] = Math.min(min[i], infinity);
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

