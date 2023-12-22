import java.io.*;
import java.util.*;

public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();
		int k = sc.nextInt();

		int[] x = new int[n];
		int[] y = new int[n];
		char[] c = new char[n];
		int[][][][] xyc = new int[2][2][k + 1][k + 1];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			c[i] = sc.next().toCharArray()[0];

			xyc[c[i] == 'B' ? 1 : 0][(x[i] / k % 2 + y[i] / k % 2) % 2][x[i] % k + 1][y[i] % k + 1] += 1;
		}

		int[][][][] sum = new int[2][2][k + 1][k + 1];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int xx = 1; xx <= k; xx++) {
					for (int yy = 1; yy <= k; yy++) {
						sum[i][j][xx][yy] = sum[i][j][xx][yy - 1] + sum[i][j][xx - 1][yy] - sum[i][j][xx - 1][yy - 1] + xyc[i][j][xx][yy];
					}
				}
			}
		}

		int max = 0;
		for (int xx = 0; xx < k; xx++) {
			for (int yy = 0; yy < k; yy++) {
				int tmp = 0;
				// B
				tmp += sum[1][0][xx][yy] - sum[1][0][0][0];
				tmp += sum[1][0][k][k] - sum[1][0][k][yy] - sum[1][0][xx][k] + sum[1][0][xx][yy];
				// W
				tmp += sum[0][0][k][yy] - sum[0][0][xx][yy];
				tmp += sum[0][0][xx][k] - sum[0][0][xx][yy];
				// W
				tmp += sum[0][1][xx][yy] - sum[0][1][0][0];
				tmp += sum[0][1][k][k] - sum[0][1][k][yy] - sum[0][1][xx][k] + sum[0][1][xx][yy];
				// B
				tmp += sum[1][1][k][yy] - sum[1][1][xx][yy];
				tmp += sum[1][1][xx][k] - sum[1][1][xx][yy];

				max = Math.max(max, tmp);
			}
		}

		pr.println(max);
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		pr = new Printer(System.out);

		solve();

		pr.close();
		sc.close();
	}

	@SuppressWarnings("unused")
	private static class Scanner {
		BufferedReader br;

		Scanner (InputStream in) {
			br = new BufferedReader(new InputStreamReader(in));
		}

		private boolean isPrintable(int ch) {
			return ch >= '!' && ch <= '~';
		}

		private boolean isCRLF(int ch) {
			return ch == '\n' || ch == '\r' || ch == -1;
		}

		private int nextPrintable() {
			try {
				int ch;
				while (!isPrintable(ch = br.read())) {
					if (ch == -1) {
						throw new NoSuchElementException();
					}
				}

				return ch;
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		String next() {
			try {
				int ch = nextPrintable();
				StringBuilder sb = new StringBuilder();
				do {
					sb.appendCodePoint(ch);
				} while (isPrintable(ch = br.read()));

				return sb.toString();
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		int nextInt() {
			try {
				// parseInt from Integer.parseInt()
				boolean negative = false;
				int res = 0;
				int limit = -Integer.MAX_VALUE;
				int radix = 10;

				int fc = nextPrintable();
				if (fc < '0') {
					if (fc == '-') {
						negative = true;
						limit = Integer.MIN_VALUE;
					} else if (fc != '+') {
						throw new NumberFormatException();
					}
					fc = br.read();
				}
				int multmin = limit / radix;

				int ch = fc;
				do {
					int digit = ch - '0';
					if (digit < 0 || digit >= radix) {
						throw new NumberFormatException();
					}
					if (res < multmin) {
						throw new NumberFormatException();
					}
					res *= radix;
					if (res < limit + digit) {
						throw new NumberFormatException();
					}
					res -= digit;

				} while (isPrintable(ch = br.read()));

				return negative ? res : -res;
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		long nextLong() {
			try {
				// parseLong from Long.parseLong()
				boolean negative = false;
				long res = 0;
				long limit = -Long.MAX_VALUE;
				int radix = 10;

				int fc = nextPrintable();
				if (fc < '0') {
					if (fc == '-') {
						negative = true;
						limit = Long.MIN_VALUE;
					} else if (fc != '+') {
						throw new NumberFormatException();
					}
					fc = br.read();
				}
				long multmin = limit / radix;

				int ch = fc;
				do {
					int digit = ch - '0';
					if (digit < 0 || digit >= radix) {
						throw new NumberFormatException();
					}
					if (res < multmin) {
						throw new NumberFormatException();
					}
					res *= radix;
					if (res < limit + digit) {
						throw new NumberFormatException();
					}
					res -= digit;

				} while (isPrintable(ch = br.read()));

				return negative ? res : -res;
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		float nextFloat() {
			return Float.parseFloat(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			try {
				int ch;
				while (isCRLF(ch = br.read())) {
					if (ch == -1) {
						throw new NoSuchElementException();
					}
				}
				StringBuilder sb = new StringBuilder();
				do {
					sb.appendCodePoint(ch);
				} while (!isCRLF(ch = br.read()));

				return sb.toString();
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		void close() {
			try {
				br.close();
			} catch (IOException e) {
//				throw new NoSuchElementException();
			}
		}
	}

	private static class Printer extends PrintWriter {
		Printer(PrintStream out) {
			super(out);
		}
	}
}
