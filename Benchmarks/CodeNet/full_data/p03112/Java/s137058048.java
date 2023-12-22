import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int q = sc.nextInt();

		long[] s = new long[a];
		long[] t = new long[b];
		long[] x = new long[q];
		NavigableSet<Long> tss = new TreeSet<>();
		NavigableSet<Long> tst = new TreeSet<>();
		for (int i = 0; i < a; i++) {
			s[i] = sc.nextLong();
			tss.add(s[i]);
		}
		for (int i = 0; i < b; i++) {
			t[i] = sc.nextLong();
			tst.add(t[i]);
		}
		for (int i = 0; i < q; i++) {
			x[i] = sc.nextLong();
		}

		long[] stot = new long[a];
		long[] ttos = new long[b];
		for (int i = 0; i < a; i++) {
			Long east = tst.higher(s[i]);
			Long west = tst.lower(s[i]);

			if (east == null) {
				stot[i] = s[i] - west;
			} else if (west == null) {
				stot[i] = east - s[i];
			} else if (east - s[i] > s[i] - west) {
				stot[i] = s[i] - west;
			} else {
				stot[i] = east - s[i];
			}
		}
		for (int i = 0; i < b; i++) {
			Long east = tss.higher(t[i]);
			Long west = tss.lower(t[i]);

			if (east == null) {
				ttos[i] = t[i] - west;
			} else if (west == null) {
				ttos[i] = east - t[i];
			} else if (east - t[i] > t[i] - west) {
				ttos[i] = t[i] - west;
			} else {
				ttos[i] = east - t[i];
			}
		}
		
		for (int i = 0; i < q; i++) {
			long min = Long.MAX_VALUE;
			Long easts = tss.higher(x[i]);
			if (easts != null) {
				int index = Arrays.binarySearch(s, easts);
				min = Math.min(min, easts - x[i] + stot[index]);
			}
			Long wests = tss.lower(x[i]);
			if (wests != null) {
				int index = Arrays.binarySearch(s, wests);
				min = Math.min(min, x[i] - wests + stot[index]);
			}
			Long eastt = tst.higher(x[i]);
			if (eastt != null) {
				int index = Arrays.binarySearch(t, eastt);
				min = Math.min(min, eastt - x[i] + ttos[index]);
			}
			Long westt = tst.lower(x[i]);
			if (westt != null) {
				int index = Arrays.binarySearch(t, westt);
				min = Math.min(min, x[i] - westt + ttos[index]);
			}
			
			pr.println(min);
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
