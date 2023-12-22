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
		ProblemD solver = new ProblemD();
		solver.solve(1, in, out);
		out.close();
	}

	static class ProblemD {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int height = in.nextInt();
			int width = in.nextInt();
			char[][] s = new char[height][];
			for (int r = 0; r < height; r++) {
				s[r] = in.next().toCharArray();
			}
			final int infinity = 1000000000;
			int n = height;
			int[][][] d = new int[n + 1][n + 1][n + 1];
			for (int s1 = n; s1 >= 0; s1--) {
				for (int s2 = n; s2 >= 0; s2--) {
					for (int s3 = n; s3 >= 0; s3--) {
						int c1 = 0;
						int c2 = 0;
						for (int r = 0; r < height; r++) {
							if (r >= s1 && r >= s2 && s[r - s1][0] == s[r - s2][1]) {
								++c1;
							}
							if (width == 3 && r >= s2 && r >= s3 && s[r - s2][1] == s[r - s3][2]) {
								++c2;
							}
						}
						if (s1 == n && s2 == n && s3 == n) {
							d[s1][s2][s3] = 0;
						} else {
							d[s1][s2][s3] = infinity;
						}
						if (s1 < n) {
							d[s1][s2][s3] = Math.min(d[s1][s2][s3], d[s1 + 1][s2][s3] + c1);
						}
						if (s2 < n) {
							d[s1][s2][s3] = Math.min(d[s1][s2][s3], d[s1][s2 + 1][s3] + c1 + c2);
						}
						if (s3 < n) {
							d[s1][s2][s3] = Math.min(d[s1][s2][s3], d[s1][s2][s3 + 1] + c2);
						}
					}
				}
			}
			if (width == 2) {
				out.println(d[0][0][n]);
			} else {
				out.println(d[0][0][0]);
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

