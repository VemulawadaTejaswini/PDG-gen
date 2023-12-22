import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int q = sc.nextInt();

		List<Pair> ab = new ArrayList<>();
		List<List<Integer>> qq = new ArrayList<>();
		for (int i = 0; i < q; i++) {
			List<Integer> tmp = new ArrayList<>();
			qq.add(tmp);
			
			int query = sc.nextInt();
			switch (query) {
			case 1:
				int a = sc.nextInt();
				int b = sc.nextInt();
				ab.add(new Pair(a, b, i));
				tmp.add(1);
				tmp.add(a);
				tmp.add(b);
				break;
			case 2:
				tmp.add(2);
				break;
			}
		}
		Collections.sort(ab);
		List<Integer> index = new ArrayList<>();
		for (int i = 0; i < q; i++) {
			index.add(0);
		}
		for (int i = 0, size = ab.size(); i < size; i++) {
			Pair e = ab.get(i);
			index.set(e.i, i);
		}

		RSQ rsqa = new RSQ(q);
		RSQ rsqb = new RSQ(q);
		RSQ rsqi = new RSQ(q);
		int cnt = 0;
		for (int i = 0; i < q; i++) {
			int query = qq.get(i).get(0);
			switch (query) {
			case 1:
				int a = qq.get(i).get(1);
				int b = qq.get(i).get(2);
				
				int ai = index.get(i);
				rsqi.add(ai, 1);
				rsqa.add(ai, a);
				rsqb.add(ai, b);
				cnt++;
				break;
			case 2:
				int l = -1;
				int r = q;
				while (r - l > 1) {
					int mid = l + (r - l) / 2;
					if (rsqi.query(0, mid + 1) >= (cnt + 1) / 2) {
//					if (data[mid] > value) {
						r = mid;
					} else {
						l = mid;
					}
				}

				int mi = ab.get(r).i;
				int mii = index.get(mi);
				long sumb = rsqb.query(0, q);
				long suma = -rsqa.query(0, mii + 1) + rsqa.query(mii + 1, q);
				if (cnt % 2 == 1) {
					suma += ab.get(r).a;
				}

				pr.printf("%d %d%n", ab.get(r).a, suma + sumb);
				break;
			}
			
		}
	}

	static class Pair implements Comparable<Pair> {
		int a;
		int b;
		int i;

		Pair(int a, int b, int i) {
			this.a = a;
			this.b = b;
			this.i = i;
		}

		@Override
		public int compareTo(Pair o) {
			if (a == o.a) {
				if (b == o.b) {
					return Integer.compare(i, o.i);
				}
				return Integer.compare(b, o.b);
			}

			return Integer.compare(a, o.a);
		}

		@Override
		public int hashCode() {
			return Integer.hashCode(a + b);
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

	/**
	 * Segment Tree による Range Sum Query
	 */
	static class RSQ {
		long[] st;
		int n;

		/**
		 * n 個の要素を持つSegmentTreeを生成する
		 * 
		 * @param n 要素数
		 */
		RSQ(int n) {
			this.n = 1;
			while (this.n < n) {
				this.n *= 2;
			}
			st = new long[2 * this.n - 1];
		}

		/**
		 * i 番目の要素に x を足す
		 * 
		 * @param i 対象となる要素(0-indexed)
		 * @param x 追加する値
		 */
		void add(int i, int x) {
			i = n - 1 + i;
			st[i] += x;
			while (i > 0) {
				i = (i - 1) / 2;
				st[i] += x;
			}
		}

		/**
		 * 指定した区間の合計値を返す
		 * 
		 * @param a 区間の端点。[a,b)(0-indexed)
		 * @param b 区間の端点。[a,b)(0-indexed)
		 * @return 指定された区間の合計値
		 */
		long query(int a, int b) {
			return query(a, b, 0, 0, n);
		}

		private long query(int a, int b, int i, int l, int r) {
			if (a >= r || b <= l) {
				return 0;
			}
			if (a <= l && b >= r) {
				return st[i];
			}

			return query(a, b, i * 2 + 1, l, (l + r) / 2) + query(a, b, i * 2 + 2, (l + r) / 2, r);
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
