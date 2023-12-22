import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();
		int p = sc.nextInt();

		int[] a = new int[n];
		int even = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			if (a[i] % 2 == 0) {
				even++;
			}
		}
		int odd = n - even;

		long ans = 0;
		if (p == 0) {
			long tmp0 = 0;
			for (int i = 0; i <= even; i++) {
				tmp0 += CLong(even, i);
			}
			long tmp1 = 0;
			for (int i = 0; i <= odd; i += 2) {
				tmp1 += CLong(odd, i);
			}

			ans += tmp0 * tmp1;
		} else {
			long tmp1 = 0;
			for (int i = 1; i <= odd; i += 2) {
				tmp1 += CLong(odd, i);
			}

			long tmp0 = 0;
			for (int i = 0; i <= even; i++) {
				tmp0 += CLong(even, i);
			}

			ans += tmp0 * tmp1;
		}

		pr.println(ans);
	}

	// 組合せの数
	// パスカルの三角形MODなし
	// 限界：n=66 : 66C33=7219428434016265740
	private final static int LIMIT = 66;
	private static int to;
	private static long[][] cache;

	static long CLong(int n, int r) {
		if (r > n) {
			return 0;
		}

		if (n > LIMIT) {
			throw new IllegalArgumentException(Integer.toString(n));
		}

		if (cache == null) {
			cache = new long[LIMIT + 1][];
			cache[0] = new long[1];
			cache[0][0] = 1;
			to = 0;
		}

		if (cache[n] == null) {
			for (int i = to + 1; i <= n; i++) {
				cache[i] = new long[i + 1];
				for (int j = 0; j <= i; j++) {
					if (j == 0 || j == i) {
						cache[i][j] = 1;
					} else {
						if (Long.MAX_VALUE - cache[i - 1][j - 1] < cache[i - 1][j]) {
			    			throw new IllegalArgumentException("Overflow");
						} else {
							cache[i][j] = cache[i - 1][j - 1] + cache[i - 1][j];
						}
					}
				}
			}
			to = n;
		}

		return cache[n][r];
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
