import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * AtCoder Beginner Contest 104 D "We Love ABC"
 *   https://abc104.contest.atcoder.jp/tasks/abc104_d/
 */
public class Main {

	public static void main(String[] args) {

		InputScanner in = new InputScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		Task task = new Task();
		task.run(in, out);

		in.close();
		out.close();
	}

	static class Task {

		public void run(InputScanner in, PrintWriter out) {

			String S = in.next();
			long[][] dp = new long[S.length() + 1][4];

			for (int i = S.length(); i >= 0; i--) {
				for (int j = 3; j >= 0; j--) {

					if (i == S.length() && j == 3) {
						dp[i][j] = 1;
					} else if (i == S.length() && j < 3) {
						dp[i][j] = 0;
					}

					if (i < S.length() && j == 3) {
						if (S.charAt(i) == '?') {
							dp[i][j] = 3 * dp[i + 1][j];
						} else {
							dp[i][j] = 1 * dp[i + 1][j];
						}
					} else if (i < S.length() && j < 3) {
						if (S.charAt(i) == '?') {
							dp[i][j] = 3 * dp[i + 1][j];
						} else {
							dp[i][j] = 1 * dp[i + 1][j];
						}
						if (S.charAt(i) == '?' ||
							S.charAt(i) == 'A' && j == 0 ||
							S.charAt(i) == 'B' && j == 1 ||
							S.charAt(i) == 'C' && j == 2) {
							dp[i][j] += 1 * dp[i + 1][j + 1];
						} else {
							dp[i][j] += 0 * dp[i + 1][j + 1];
						}
					}
				}
			}

			out.println(dp[0][0] % 1000000007);
		}
	}

	static long combination(long n, long k) {

		long res = 1;

		for (int i = 1; i <= k; i++) {
			res *= (n - k + i);
			res /= i;
		}

		return res;
	}

	/*
	 * extends java.util.Scanner
	 */
	static class InputScanner {

		Scanner scanner;

		public InputScanner(InputStream inputStream) {
			this.scanner = new Scanner(inputStream);
		}

		public boolean hasNext() {
			return scanner.hasNext();
		}

		public int nextInt() {
			return Integer.parseInt(scanner.next());
		}

		public long nextLong() {
			return Long.parseLong(scanner.next());
		}

		public double nextDouble() {
			return Double.parseDouble(scanner.next());
		}
		public String next() {
			return scanner.next();
		}

		public int[] nextIntArray(int n) {
			int[] ret = new int[n];
			for (int i = 0; i < n; i++) {
				ret[i] = scanner.nextInt();
			}
			return ret;
		}

		public int[][] nextIntArray(int h, int w) {
			int[][] ret = new int[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					ret[i][j] = scanner.nextInt();
				}
			}
			return ret;
		}

		public long[] nextLongArray(int n) {
			long[] ret = new long[n];
			for (int i = 0; i < n; i++) {
				ret[i] = scanner.nextLong();
			}
			return ret;
		}

		public long[][] nextlongArray(int h, int w) {
			long[][] ret = new long[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					ret[i][j] = scanner.nextLong();
				}
			}
			return ret;
		}

		public double[] nextDoubleArray(int n) {
			double[] ret = new double[n];
			for (int i = 0; i < n; i++) {
				ret[i] = scanner.nextDouble();
			}
			return ret;
		}

		public double[][] nextDoubleArray(int h, int w) {
			double[][] ret = new double[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					ret[i][j] = scanner.nextLong();
				}
			}
			return ret;
		}

		public String[] nextStringArray(int n) {
			String[] ret = new String[n];
			for (int i = 0; i < n; i++) {
				ret[i] = scanner.next();
			}
			return ret;
		}

		public String[] nextStringArray(String split) {
			String[] ret = scanner.next().split(split);
			return ret;
		}

		public String[][] nextStringArray(int h, int w) {
			String[][] ret = new String[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					ret[i][j] = scanner.next();
				}
			}
			return ret;
		}

		public String[][] nextStringArray(int h, String split) {
			String[][] ret = new String[h][];
			for (int i = 0; i < h; i++) {
				ret[i] = scanner.next().split(split);
			}
			return ret;
		}

		public void close() {
			scanner.close();
		}

	}

}
