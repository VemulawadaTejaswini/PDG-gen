import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
 * AtCoder Beginner Contest 112 C "Pyramid"
 *   https://abc112.contest.atcoder.jp/tasks/abc112_c/
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

			int N = in.nextInt();
			int[][] xyh = new int[N][3];
			for (int i = 0; i < N; i++) {
				xyh[i][0] = in.nextInt();
				xyh[i][1] = in.nextInt();
				xyh[i][2] = in.nextInt();
			}
			Arrays.sort(xyh, Comparator.comparingInt(a -> a[2]));

			int ansX = 0;
			int ansY = 0;
			int ansH = 0;

			if (N == 1) {
				ansX = xyh[0][0];
				ansY = xyh[0][1];
				ansH = xyh[0][2];

			} else if (N == 2) {

				for (int j = 0; j <= 100; j++) {
					for (int l = 0; l <= 100; l++) {

						int h1 = xyh[0][2] + Math.abs(j - xyh[0][0]) + Math.abs(l - xyh[0][1]);
						int h2 = xyh[1][2] + Math.abs(j - xyh[1][0]) + Math.abs(l - xyh[1][1]);

						if (h1 == h2) {
							ansX = j;
							ansY = l;
							ansH = h1;
						}
					}
				}


			} else {


				int count = 0;
				for (int j = 0; j <= 100; j++) {
					for (int l = 0; l <= 100; l++) {

						int countTmp = 0;
						int h = xyh[N - 1][2] + Math.abs(j - xyh[N - 1][0]) + Math.abs(l - xyh[N - 1][1]);

						for (int i = N - 2; i >= 0; i--) {
							int hi = xyh[i][2] + Math.abs(j - xyh[i][0]) + Math.abs(l - xyh[i][1]);
							if (h == hi) {
								countTmp++;
							}
						}

						if (count < countTmp) {
							ansX = j;
							ansY = l;
							ansH = h;
							count = countTmp;
						}

					}
				}
			}

			out.println(ansX + " " + ansY + " " + ansH);
		}
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
