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
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			final int MOD = (int) (1e9 + 7);
			int n = in.nextInt();
			char[][] s = new char[2][];
			s[0] = in.next().toCharArray();
			s[1] = in.next().toCharArray();
			int[][] d = new int[4][4];
			d[3][3] = 1;
			for (int i = 0; i < n; ) {
				boolean horizontal = false;
				if (s[0][i] != s[1][i]) {
					horizontal = true;
				}

				int[][] nd = new int[4][4];
				for (int c1 = 0; c1 < 4; c1++) {
					for (int c2 = 0; c2 < 4; c2++) {
						if (d[c1][c2] == 0) {
							continue;
						}
						for (int nc1 = 0; nc1 < 3; nc1++) {
							for (int nc2 = 0; nc2 < 3; nc2++) {
								if (horizontal && nc1 == nc2) {
									continue;
								}
								if (!horizontal && nc1 != nc2) {
									continue;
								}
								if (nc1 == c1) {
									continue;
								}
								if (nc2 == c2) {
									continue;
								}
								nd[nc1][nc2] += d[c1][c2];
								if (nd[nc1][nc2] >= MOD) {
									nd[nc1][nc2] -= MOD;
								}
							}
						}
					}
				}
				d = nd;

				if (horizontal) {
					i += 2;
				} else {
					i += 1;
				}
			}
			int ans = 0;
			for (int c1 = 0; c1 < 3; c1++) {
				for (int c2 = 0; c2 < 3; c2++) {
					ans = (ans + d[c1][c2]) % MOD;
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

