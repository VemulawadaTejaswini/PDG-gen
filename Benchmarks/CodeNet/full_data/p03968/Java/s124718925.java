import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Set;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;
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
		ProblemC solver = new ProblemC();
		solver.solve(1, in, out);
		out.close();
	}

	static class ProblemC {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int n = in.nextInt();
			int[][] col = new int[n][4];
			long[][] hash = new long[n][4];
			Set<Long> any = new HashSet<>();
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < 4; j++) {
					col[i][j] = in.nextInt();
				}
				for (int rot = 0; rot < 4; rot++) {
					for (int j = 0; j < 4; j++) {
						hash[i][rot] = 1000 * hash[i][rot] + col[i][(rot + j) % 4];
					}
					any.add(hash[i][rot]);
				}
			}
			long ans = 0;
			long[] dp = new long[1 << 4];
			int[] ways = new int[4];
			for (int front = 0; front < n; front++) {
				int a = col[front][0];
				int b = col[front][1];
				int c = col[front][2];
				int d = col[front][3];
				for (int back = front + 1; back < n; back++) {
					rotLoop:
					for (int rotBack = 0; rotBack < 4; rotBack++) {
						int f = col[back][(rotBack + 0) % 4];
						int e = col[back][(rotBack + 1) % 4];
						int h = col[back][(rotBack + 2) % 4];
						int g = col[back][(rotBack + 3) % 4];
						long h1 = calcHash(a, e, f, b);
						long h2 = calcHash(b, f, g, c);
						long h3 = calcHash(d, c, g, h);
						long h4 = calcHash(e, a, d, h);
						long[] hs = {h1, h2, h3, h4};
						for (long hh : hs) {
							if (!any.contains(hh)) {
								continue rotLoop;
							}
						}
						Arrays.fill(dp, 0);
						dp[0] = 1;
						for (int i = front + 1; i < n; i++) {
							if (i == back) {
								continue;
							}
							Arrays.fill(ways, 0);
							for (int bit = 0; bit < 4; bit++) {
								for (int rot = 0; rot < 4; rot++) {
									if (hash[i][rot] == hs[bit]) {
										++ways[bit];
									}
								}
							}
							for (int mask = 15; mask >= 0; mask--) {
								if (dp[mask] == 0) {
									continue;
								}
								for (int bit = 0; bit < 4; bit++) {
									if ((mask & (1 << bit)) != 0) {
										continue;
									}
									dp[mask | (1 << bit)] += dp[mask] * ways[bit];
								}
							}
						}
						ans += dp[15];
					}
				}
			}
			out.println(ans);
		}

		private long calcHash(int a, int b, int c, int d) {
			long h = 0;
			h = 1000 * h + a;
			h = 1000 * h + b;
			h = 1000 * h + c;
			h = 1000 * h + d;
			return h;
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

