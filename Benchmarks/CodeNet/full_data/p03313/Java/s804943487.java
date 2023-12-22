import java.io.*;
import java.util.*;

public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();
		int nn = 0x1 << n;

		int[] a = new int[nn];
		for (int i = 0; i < nn; i++) {
			a[i] = sc.nextInt();
		}

		int[] max1 = new int[nn];
		int[] max2 = new int[nn];
		max1[0] = 0;
		// n個のビットのうち、i個のビットが立っているmaskのパターンの生成
		for (int i = 1; i <= n; i++) {
			int mask = (0x1 << i) - 1;
			while (mask < 0x1 << n) {
				// maskに対する処理

				if (a[mask] >= a[0]) {
					max1[mask] = mask;
					max2[mask] = 0;
				} else {
					max1[mask] = 0;
					max2[mask] = mask;
				}
				for (int j = 0; j < n; j++) {
					int tmp = 0x1 << j;
					if ((mask & tmp) == 0) {
						continue;
					}

					if (max1[mask ^ tmp] != max1[mask] && max1[mask ^ tmp] != max2[mask] && a[max1[mask ^ tmp]] >= a[max1[mask]]) {
						max2[mask] = max1[mask];
						max1[mask] = max1[mask ^ tmp];
						if (max2[mask ^ tmp] != max2[mask] && a[max2[mask ^ tmp]] >= a[max2[mask]]) {
							max2[mask] = max2[mask ^ tmp];
						}
					} else if (max1[mask ^ tmp] != max1[mask] && max1[mask ^ tmp] != max2[mask] && a[max1[mask ^ tmp]] >= a[max2[mask]]) {
						max2[mask] = max1[mask ^ tmp];
					}
				}
				
				// 次のmaskの計算
				int xx = mask & -mask;
				int yy = mask + xx;
				mask = ((mask & ~yy) / xx >> 1) | yy;
			}
		}

		int max = 0;
		for (int i = 1; i < nn; i++) {
			max = Math.max(max, a[max1[i]] + a[max2[i]]);
			pr.println(max);
		}
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(INPUT == null ? System.in : new ByteArrayInputStream(INPUT.getBytes()));
		pr = new Printer(System.out);

		solve();

//		pr.close();
		pr.flush();
//		sc.close();
	}

	static String INPUT = null;

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
		Printer(OutputStream out) {
			super(out);
		}
	}
}
