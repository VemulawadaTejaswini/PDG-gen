import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int h = sc.nextInt();
		int w = sc.nextInt();

		char[][] a = new char[h][];
		int[] cnt = new int[26];
		for (int i = 0; i < h; i++) {
			a[i] = sc.next().toCharArray();
			for (char c : a[i]) {
				cnt[c - 'a']++;
			}
		}

		int cnt4 = (h / 2 * 2) * (w / 2 * 2);
		for (int i = 0; i < 26; i++) {
			int tmp = Math.min(cnt4, cnt[i] / 4 * 4);;
			cnt[i] -= tmp;
			cnt4 -= tmp;
		}

		int sum = 0;
		int odd = 0;
		for (int i = 0; i < 26; i++) {
			sum += cnt[i];
			if (cnt[i] % 2 == 1) {
				odd++;
			}
		}

		if (odd > 1) {
			pr.println("No");
			return;
		}

		if (h % 2 == 0 && w % 2 == 0) {
			if (sum == 0) {
				pr.println("Yes");
			} else {
				pr.println("No");
			}
		} else if (h % 2 == 1 && w % 2 == 1) {
			int cnt2 = (h / 2 * 2) + (w / 2 * 2);
			for (int i = 0; i < 26; i++) {
				int tmp = Math.min(cnt2, cnt[i] / 2 * 2);;
				cnt[i] -= tmp;
				cnt2 -= tmp;
			}

			sum = 0;
			for (int i = 0; i < 26; i++) {
				sum += cnt[i];
//				if (cnt[i] % 2 == 1) {
//					odd++;
//				}
			}

			if (sum == 1) {
				pr.println("Yes");
			} else {
				pr.println("No");
			}
		} else {
			int cnt2 = (h / 2 * 2) + (w / 2 * 2);
			for (int i = 0; i < 26; i++) {
				int tmp = Math.min(cnt2, cnt[i] / 2 * 2);;
				cnt[i] -= tmp;
				cnt2 -= tmp;
			}

			sum = 0;
			for (int i = 0; i < 26; i++) {
				sum += cnt[i];
//				if (cnt[i] % 2 == 1) {
//					odd++;
//				}
			}

			if (sum == 0) {
				pr.println("Yes");
			} else {
				pr.println("No");
			}
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
