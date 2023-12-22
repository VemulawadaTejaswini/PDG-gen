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
		ProblemD solver = new ProblemD();
		solver.solve(1, in, out);
		out.close();
	}

	static class ProblemD {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int height = in.nextInt();
			int width = in.nextInt();
			char[][] s = new char[height][];
			char[][] columns = new char[width][height];
			for (int r = 0; r < height; r++) {
				s[r] = in.next().toCharArray();
				for (int c = 0; c < width; c++) {
					columns[c][r] = s[r][c];
				}
			}
			int ans = 0;
			for (int i = 0; i + 1 < columns.length; i++) {
				ans += solve(columns[i], columns[i + 1]);
			}
			out.println(ans);
		}

		private int solve(char[] a, char[] b) {
			int n = a.length;
			int[][] cost = new int[n + 1][n + 1];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (a[i] == b[j]) {
						++cost[n - 1 - i][n - 1 - j];
					}
				}
			}
			for (int i = n - 1; i >= 0; i--) {
				for (int j = n - 1; j >= 0; j--) {
					cost[i][j] += cost[i + 1][j + 1];
				}
			}
			final int infinity = 1000000000;
			int[][] d = new int[n + 1][n + 1];
			for (int[] arr : d) {
				Arrays.fill(arr, infinity);
			}
			d[n][n] = 0;
			for (int s1 = n; s1 >= 0; s1--) {
				for (int s2 = n; s2 >= 0; s2--) {
					if (s1 < n) {
						d[s1][s2] = Math.min(d[s1][s2], d[s1 + 1][s2] + cost[s1][s2]);
					}
					if (s2 < n) {
						d[s1][s2] = Math.min(d[s1][s2], d[s1][s2 + 1] + cost[s1][s2]);
					}
				}
			}
			return d[0][0];
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

