import java.io.*;
import java.util.NoSuchElementException;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int l = 1;
		int r = 1_000_000_001;
		while (r - l > 1) {
			int mid = l + (r - l) / 2;
			if (f(mid, a)) {
				l = mid;
			} else {
				r = mid;
			}
		}

//		return l;
		pr.println(l);
	}
	
	private static boolean f(int w, int[] a) {
		// w以上の値が中央値の中央値になるか
		int n = a.length;

		int[] aa = new int[n];
		for (int i = 0; i < n; i++) {
			if (a[i] >= w) {
				aa[i] = 1;
			} else {
				aa[i] = -1;
			}
		}
		
		int[] cumsum = new int[n + 1];
		for (int i = 0; i < n; i++) {
			cumsum[i + 1] = cumsum[i] + aa[i];
		}

		int offset = n + 1;
		BIT bit = new BIT(2 * n + 2);
		bit.add(cumsum[0] + offset, 1);
		long cnt = 0;
		for (int i = 1; i <= n; i++) {
			cnt += bit.query(cumsum[i] + offset);
			bit.add(cumsum[i] + offset, 1);
		}

		return (long)n * (n + 1) / 2 - cnt <= (long)n * (n + 1) / 2 / 2;
	}

	/**
	 * Binary Indexed Tree による Range Sum Query
	 */
	static class BIT {
		// [0,n-1]
		private int[] bit;
		private int n;

		/**
		 * n 個の要素を持つBITを生成する
		 * 
		 * @param n 要素数
		 */
		BIT(int n) {
			this.n = n;
			bit = new int[this.n];
		}

		/**
		 * i 番目の要素に x を足す
		 * 
		 * @param i 対象となる要素(1-indexed)
		 * @param x 追加する値
		 */
		void add(int i, int x) {
			while (i <= n) {
				bit[i - 1] += x;
				i += i & (-i);
			}
		}

		/**
		 * 指定した範囲の合計値を返す
		 * 
		 * @param i 範囲の上界。[1,i](1-indexed)
		 * @return 指定された範囲の合計値
		 */
		int query(int i) {
			int sum = 0;
			while (i > 0) {
				sum += bit[i - 1];
				i -= i & (-i);
			}

			return sum;
		}
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		pr = new Printer(System.out);
			
		solve();
			
		pr.close();
		sc.close();
	}

	static class Scanner {
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

	static class Printer extends PrintWriter {
		Printer(OutputStream out) {
			super(out);
		}
	}
}
