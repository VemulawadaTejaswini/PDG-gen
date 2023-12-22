import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		long a = sc.nextLong();
		long b = sc.nextLong();

		Prime prime = new Prime(1_000_000);

		Map<Long, Integer> pfa = prime.primeFactorize(a);
		Map<Long, Integer> pfb = prime.primeFactorize(b);

		int ans = 0;
		for (long e : pfa.keySet()) {
			if (pfb.keySet().contains(e)) {
				ans++;
			}
		}
		
		pr.println(ans + 1);
	}
	
	/**
	 * 素数リスト生成、素数判定、素因数分解などを行う
	 */
	static class Prime implements Iterable<Integer> {
		private int n;
		private BitSet p;

		/**
		 * 上限 n までの素数を保持するインスタンスを返す
		 * O(n log log n)
		 * 
		 * @param n 保持する素数の上限
		 */
		Prime(int n) {
			this.n = n;

			p = new BitSet(n / 2);
			int m = (int)Math.sqrt(n);

//			for (int i = 1; i <= m; i++) {
			for (int bi = p.nextClearBit(0); 2 * (bi + 1) + 1 <= m; bi = p.nextClearBit(bi + 1)) {
				long i = bi + 1;
//				if (p.get(i - 1)) {
//					continue;
//				}

				for (long j = 2 * i * (i + 1); 2 * j + 1 <= n; j += 2 * i + 1) {
					p.set((int)(j - 1));
				}
			}
		}

		/**
		 * 素数かどうかを判定する
		 * O(1)
		 * 
		 * @param n 判定する値
		 * @return 素数の場合、true
		 */
		boolean isPrime(int n) {
			if (n == 2) {
				return true;
			}

			if (n == 1 || (n & 0x1) == 0) {
				return false;
			}

			return !p.get(n / 2 - 1);
		}

		/**
		 * 素数を含む List を返す
		 * O(pi(n)) (pi(n):nまでの素数の個数)
		 * 
		 * @return n 以下の素数を含む List
		 */
		List<Integer> getPrimeList() {
			List<Integer> ret = new ArrayList<>();
			for (int p : this) {
				ret.add(p);
			}

			return ret;
		}

		/**
		 * 素因数分解の結果を返す
		 * O(pi(n^1/2))?
		 * 
		 * @param x 素因数分解をする値
		 * @return 素因数分解した結果
		 */
		Map<Long, Integer> primeFactorize(long x) {
			Map<Long, Integer> hm = new TreeMap<>();
			long n = x;
			for (int p : this) {
				if ((long)p * p > n) {
					break;
				}
				int cnt = 0;
				while (n % p == 0) {
					cnt++;
					n /= p;
				}
				if (cnt > 0) {
					hm.put((long)p, cnt);
				}
			}
			if (n != 1) {
				hm.put(n, 1);
			}

			return hm;
		}

		@Override
		public Iterator<Integer> iterator() {
			return new PrimeIterator();
		}

		private class PrimeIterator implements Iterator<Integer> {
			int index;

			PrimeIterator() {
				index = -1;
			}

			@Override
			public boolean hasNext() {
				if (index == -1) {
					return n >= 2;
				} else {
					return 2 * (index + 1) + 1 <= n;
				}
			}

			@Override
			public Integer next() {
				if (index == -1) {
					if (n >= 2) {
						index = p.nextClearBit(0);
						return 2;
					} else {
						throw new NoSuchElementException();
					}
				} else {
					int ret = 2 * (index + 1) + 1;

					if (ret <= n) {
						index = p.nextClearBit(index + 1);

						return ret;
					} else {
						throw new NoSuchElementException();
					}
				}
			}
		}

		/**
		 * 素数かどうかを判定する(long)
		 * O(n^1/2)
		 * 
		 * @param n 判定する値
		 * @return 素数の場合、true
		 */
		static boolean isPrime(long n) {
			if (n == 2) {
				return true;
			}

			if (n == 1 || (n & 0x1) == 0) {
				return false;
			}

			for (long i = 3; i * i <= n; i += 2) {
				if (n % i == 0) {
					return false;
				}
			}

			return true;
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
		
		int[] nextIntArray(int n) {
			int[] ret = new int[n];
			for (int i = 0; i < n; i++) {
				ret[i] = sc.nextInt();
			}
			
			return ret;
		}

		int[][] nextIntArrays(int n, int m) {
			int[][] ret = new int[m][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					ret[j][i] = sc.nextInt();
				}
			}
			
			return ret;
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
		
		void printInts(int... a) {
			StringBuilder sb = new StringBuilder(32);
			for (int i = 0, size = a.length; i < size; i++) {
				if (i > 0) {
					sb.append(' ');
				}
				sb.append(a[i]);
			}

			println(sb);
		}
		
		void printLongs(long... a) {
			StringBuilder sb = new StringBuilder(64);
			for (int i = 0, size = a.length; i < size; i++) {
				if (i > 0) {
					sb.append(' ');
				}
				sb.append(a[i]);
			}

			println(sb);
		}
		
		void printStrings(String... a) {
			StringBuilder sb = new StringBuilder(32);
			for (int i = 0, size = a.length; i < size; i++) {
				if (i > 0) {
					sb.append(' ');
				}
				sb.append(a[i]);
			}

			println(sb);
		}
	}
}
