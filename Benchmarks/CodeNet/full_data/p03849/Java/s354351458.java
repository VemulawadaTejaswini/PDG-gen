import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		long n = sc.nextLong();

		if (n < 10) {
			int[] ans = {2, 4, 5, 8, 10, 13, 14, 18, 21, 26};
			pr.println(ans[(int)(n - 1)]);
			return;
		}

		n++;
		hmfa = new HashMap<>();
		hmfs = new HashMap<>();
		
		List<Long> s = new ArrayList<>();
		s.add(1L);
		for (int i = 1; true; i++) {
			s.add(s.get(i - 1) * 3 % MOD);
			if (n >= 0x1L << i + 1) {
			} else {
				n -= (0x1L << i) - 1;
				break;
			}
		}

//		pr.println(n);
//		pr.println(s);

		long ans = 0;
		for (int i = 0, size = s.size(); i < size - 1; i++) {
			long e = s.get(i);
			ans += e;
			ans %= MOD;
		}
		if (n == 0) {
			pr.println(ans);
		} else {
//			pr.printf("%d %d%n", s.size(), n);
			ans += fs(s.size() - 1, n - 1);
			ans %= MOD;
			pr.println(ans);
		}
	}

	static final int MOD = 1_000_000_007;
	static Map<Pair, Long> hmfs;
	static Map<Pair, Long> hmfa;

	private static long fs(int i, long j) {
//		pr.printf("fs %d %d%n", i, j);
		
		if (j == 0 || j >= 0x1L << i) {
			return 1L;
		}
		if (i == 1) {
			long[] ret = {1, 3};
			return ret[(int)(j)];
		}

		Pair key = new Pair(i, j);
		Long tmp = hmfs.get(new Pair(i, j));
		if (tmp != null) {
			return tmp;
		}
		
		long ret = (fs(i - 1, j / 2) - 1 + 2 * fs(i - 1, (j - 1) / 2) + fa(i - 1, (j + 1) / 2)) % MOD;
//		pr.printf("fs %d %d %d%n", i, j, ret);
		hmfs.put(key, ret);
		return ret;
	}

	private static long fa(int i, long j) {
//		pr.printf("fa %d %d%n", i, j);

		if (i == 1) {
			long[] ret = {1, 2};
			return ret[(int)(j % 2)];
		}
		if (j % 2 == 0) {
			return fa(i - 1, j / 2);
		}

		Pair key = new Pair(i, j);
		Long tmp = hmfa.get(key);
		if (tmp != null) {
			return tmp;
		}
		
		long ret = (fa(i - 1, j / 2) + fa(i - 1, j / 2 + 1)) % MOD;
//		pr.printf("fa %d %d %d%n", i, j, ret);
		hmfa.put(key, ret);
		return ret;
	}

	static class Pair implements Comparable<Pair> {
		int a;
		long b;

		Pair(int a, long b) {
			this.a = a;
			this.b = b;
		}

		@Override
		public int compareTo(Pair o) {
			if (a == o.a) {
				return Long.compare(b, o.b);
			}

			return Integer.compare(a, o.a);
		}

		@Override
		public int hashCode() {
			return Long.hashCode(a + b);
		}

		@Override
		public boolean equals(Object obj) {
			Pair o = (Pair) obj;
			return a == o.a && b == o.b;
		}

		@Override
		public String toString() {
			// [xxx, xxxx]
			StringBuilder stmp = new StringBuilder(32);
			stmp.append('[');
			stmp.append(a);
			stmp.append(',');
			stmp.append(' ');
			stmp.append(b);
			stmp.append(']');

			return stmp.toString();
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
