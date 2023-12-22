import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int h = sc.nextInt();
		int w = sc.nextInt();

		char[][] c = new char[h][];
		for (int i = 0; i < h; i++) {
			c[i] = sc.next().toCharArray();
		}

		if (w != 3) {
			pr.println(0);
			return;
		}

		StringBuilder[] s = new StringBuilder[w];
		for (int i = 0; i < w; i++) {
			s[i] = new StringBuilder();
			for (int j = 0; j < h; j++) {
				s[i].append(c[h - 1 - j][i]);
			}
		}

		int ret = 0;
		out:
		while (true) {
			int[] min = new int[3];
			int[] cnt = new int[3];

			if (s[0].length() == 0) {
				min[0] = Integer.MAX_VALUE;
			} else {
				if (s[1].length() != 0) {
					for (int i = 0; i < Math.min(s[0].length(), s[1].length()); i++) {
						if (s[0].charAt(i) == s[1].charAt(i)) {
							cnt[0]++;
						}
					}

					for (int i = 0; i < Math.min(s[0].length() - 1, s[1].length()); i++) {
						if (s[0].charAt(i + 1) == s[1].charAt(i)) {
							min[0]++;
						}
					}
				}
			}

			if (s[2].length() == 0) {
				min[2] = Integer.MAX_VALUE;
			} else {
				if (s[1].length() != 0) {
					for (int i = 0; i < Math.min(s[2].length(), s[1].length()); i++) {
						if (s[2].charAt(i) == s[1].charAt(i)) {
							cnt[2]++;
						}
					}

					for (int i = 0; i < Math.min(s[2].length() - 1, s[1].length()); i++) {
						if (s[2].charAt(i + 1) == s[1].charAt(i)) {
							min[2]++;
						}
					}
				}
			}

			if (s[1].length() == 0) {
				min[1] = Integer.MAX_VALUE;
			} else {
				if (s[1].length() != 0) {
					for (int i = 0; i < Math.min(s[0].length(), s[1].length()); i++) {
						if (s[0].charAt(i) == s[1].charAt(i)) {
							cnt[1]++;
						}
					}

					for (int i = 0; i < Math.min(s[0].length(), s[1].length() - 1); i++) {
						if (s[0].charAt(i) == s[1].charAt(i + 1)) {
							min[1]++;
						}
					}
				}
				if (s[1].length() != 0) {
					for (int i = 0; i < Math.min(s[2].length(), s[1].length()); i++) {
						if (s[2].charAt(i) == s[1].charAt(i)) {
							cnt[1]++;
						}
					}

					for (int i = 0; i < Math.min(s[2].length(), s[1].length() - 1); i++) {
						if (s[2].charAt(i) == s[1].charAt(i + 1)) {
							min[1]++;
						}
					}
				}
			}

			Tri[] tmp = {new Tri(0, min[0], s[0].length()), new Tri(1, min[1], s[1].length()), new Tri(2, min[2], s[2].length())};
			Arrays.sort(tmp);

			ret += cnt[tmp[0].a];
			s[tmp[0].a].deleteCharAt(0);

			for (StringBuilder ss : s) {
				if (ss.length() > 0) {
					continue out;
				}
			}
			break;
		}

		pr.println(ret);
	}

	private static class Tri implements Comparable<Tri> {
		int a;
		int b;
		int c;

		Tri(int a, int b, int c) {
			this.a = a;
			this.b = b;
			this.c = c;
		}

		@Override
		public int compareTo(Tri o) {
			if (b == o.b) {
				return Integer.compare(c, o.c);
			}
			return Integer.compare(b, o.b);
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
