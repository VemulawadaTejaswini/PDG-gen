import java.io.*;
import java.util.*;
import java.util.Map.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] x = new int[n];
		Map<Integer, Map<Integer, Integer>> hm = new TreeMap<>();
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();

			int mod = x[i] % m;

			if (!hm.containsKey(mod)) {
				hm.put(mod, new TreeMap<>());
			}

			Map<Integer, Integer> hmtmp = hm.get(mod);
			if (!hmtmp.containsKey(x[i])) {
				hmtmp.put(x[i], 0);
			}
			hmtmp.put(x[i], hmtmp.get(x[i]) + 1);
		}

		int ret = 0;
		int ret2 = 0;
		for (Entry<Integer, Map<Integer, Integer>> e : hm.entrySet()) {
			int mod = e.getKey();
			int mod2 = (m - mod) % m;
			Map<Integer, Integer> hmtmp = e.getValue();

			if (mod == mod2) {
				int tmp = 0;
				for (int ee : hmtmp.values()) {
					tmp += ee;
				}

				ret += tmp / 2;
//			} else if (mod < mod2) {
			} else {
				int ecnt = 0;
				int ocnt = 0;
				for (int ee : hmtmp.values()) {
					ecnt += ee;
					if (ee % 2 == 1) {
						ocnt++;
						ecnt--;
					}
				}

				if (!hm.containsKey(mod2)) {
					ret += ecnt / 2;
					continue;
				}

				Map<Integer, Integer> hmtmp2 = hm.get(mod2);

				int ecnt2 = 0;
				int ocnt2 = 0;
				for (int ee : hmtmp2.values()) {
					ecnt2 += ee;
					if (ee % 2 == 1) {
						ocnt2++;
						ecnt2--;
					}
				}

				if (ecnt + ocnt >= ecnt2 + ocnt2) {
					/*
					ret2 += ecnt2 + ocnt2;
					int tmp = Math.min(ocnt, ecnt2 + ocnt2);
					ocnt -= tmp;
					ecnt -= ecnt2 + ocnt2 - tmp;

					ret2 += ecnt / 2;
					*/
					int tmp = (ecnt + ocnt - (ecnt2 + ocnt2)) / 2;
					tmp = Math.min(tmp, ecnt / 2);

					ret2 += tmp + ecnt2 + ocnt2;
				} else {
					/*
					ret2 += ecnt + ocnt;
					int tmp = Math.min(ocnt2, ecnt + ocnt);
					ocnt2 -= tmp;
					ecnt2 -= ecnt + ocnt - tmp;

					ret2 += ecnt2 / 2;
					*/
					int tmp = (ecnt2 + ocnt2 - (ecnt + ocnt)) / 2;
					tmp = Math.min(tmp, ecnt2 / 2);

					ret2 += tmp + ecnt + ocnt;
				}
//			} else {
//				break;
			}

		}

		pr.println(ret + ret2 / 2);
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
