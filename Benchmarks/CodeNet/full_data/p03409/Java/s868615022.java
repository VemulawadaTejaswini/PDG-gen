
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main implements Runnable { // クラス名はMain1

	PrintWriter out = new PrintWriter(System.out);
	InputReader sc = new InputReader(System.in);
	static int mod = (int) (1e9 + 7); //10^9+7
	int[] dx = { 1, 0, -1, 0 }, dy = { 0, 1, 0, -1 }; //4 directions

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 1024 * 1024 * 1024).start(); // 16MBスタックを確保して実行
	}

	public void run() {

		try {
			//String S = sc.next().trim();
			int N = sc.nextInt();
			InfoIntAB[] infoAB = new InfoIntAB[N];
			for (int i = 0; i < N; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				InfoIntAB each = new InfoIntAB(a, b, 0);
				infoAB[i] = each;
			}
			InfoIntCD[] infoCD = new InfoIntCD[N];
			for (int i = 0; i < N; i++) {
				int c = sc.nextInt();
				int d = sc.nextInt();
				InfoIntCD each = new InfoIntCD(c, d, 1);
				infoCD[i] = each;
			}

			Arrays.parallelSort(infoAB);
			Arrays.parallelSort(infoCD);

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (!infoCD[i].ans && !infoAB[j].ans) {
						if (infoCD[i].c > infoAB[j].a && infoCD[i].d > infoAB[j].b) {
							infoCD[i].ans = true;
							infoAB[j].ans = true;
							infoCD[i].counter = j;
						}
					}
				}
			}

			/*
			for (int i = 0; i < N; i++) {
			
				if (infoCD[i].ans) {
					out.println(infoCD[i].c + " " + infoCD[i].d + " : " + infoAB[infoCD[i].counter].a + " "
							+ infoAB[infoCD[i].counter].b);
				}
			}
			*/
			int cnt = 0;
			for (int i = 0; i < N; i++) {
				if (infoCD[i].ans)
					cnt++;
			}
			out.println(cnt);

		} catch (ArithmeticException ae) {
			//ae.printStackTrace();
			throw new RuntimeException();
		} catch (Exception e) {
			//e.printStackTrace();
			throw new RuntimeException();
		} finally {
			out.flush();
			out.close();
		}

	}

	class Comp implements Comparator<InfoIntAB> {
		public int compare(InfoIntAB be, InfoIntAB af) {
			if (be.b == af.b) {
				return Integer.compare(be.b, af.b);
			} else {
				return Integer.compare(be.a, af.a);
			}
		}
	}

	class InfoIntAB implements Comparable<InfoIntAB> {
		public int a;
		public int b;
		public int type;
		public int counter;
		public boolean ans = false;

		public InfoIntAB(int a, int b, int type) {
			this.a = a;
			this.b = b;
			this.type = type;
		}

		@Override
		public int compareTo(InfoIntAB o) {
			//return this.a - o.a;//昇順
			// return o.a - this.a;//降順
			//複数項目で並び替え。aの降順、aが同じならbの降順
			if (this.b == o.a) {
				return Integer.compare(o.a, this.a);
			} else {
				return Integer.compare(o.b, this.b);
			}
		}
	}

	class InfoIntCD implements Comparable<InfoIntCD> {
		public int c;
		public int d;
		public int type;
		public boolean ans = false;
		public int counter;

		public InfoIntCD(int c, int d, int type) {
			this.c = c;
			this.d = d;
			this.type = type;
		}

		@Override
		public int compareTo(InfoIntCD o) {
			//return this.a - o.a;//昇順
			// return o.a - this.a;//降順
			//複数項目で並び替え。aの降順、aが同じならbの降順
			if (this.c == o.c) {
				return Integer.compare(o.d, this.d);
			} else {
				return Integer.compare(this.c, o.c);
			}
		}
	}

	/**
	 *
	 * @param n
	 * @param m
	 * @return Combinationの数を返す(mod無しなので、大きい値には使用できない桁溢れする)
	 */
	long calcCombination(int n, int m) {
		if (n < m || m < 0) {
			throw new IllegalArgumentException("引数の値が不正です ( n : " + n + ", m : " + m + ")");
		}
		long c = 1;
		m = (n - m < m ? n - m : m);
		for (int ns = n - m + 1, ms = 1; ms <= m; ns++, ms++) {
			c *= ns;
			c /= ms;
		}
		return c;
	}

	/*
	 * 使用するときはModに注意。Global変数を参照
	 */
	public static long comb(long a, long b) {
		if (a < b)
			return 0;
		long res = 1;
		long inv = pow(fact(Math.min(b, a - b)), mod - 2);
		for (long i = a; i > a - Math.min(b, a - b); i--) {
			res *= i;
			res %= mod;
		}
		res *= inv;
		res %= mod;
		return res;
	}

	public static long pow(long x, long n) {
		long res = 1;
		while (n > 0) {
			if ((n & 1) == 1) {
				res *= x;
				res %= mod;
			}
			x *= x;
			x %= mod;
			n >>= 1;
		}
		return res;
	}

	public static long fact(long n) {
		long res = 1;
		while (n > 0) {
			res *= n;
			res %= mod;
			n--;
		}
		return res;
	}

	// 高速なScanner
	static class InputReader {
		private InputStream in;
		private byte[] buffer = new byte[1024];
		private int curbuf;
		private int lenbuf;

		public InputReader(InputStream in) {
			this.in = in;
			this.curbuf = this.lenbuf = 0;
		}

		public boolean hasNextByte() {
			if (curbuf >= lenbuf) {
				curbuf = 0;
				try {
					lenbuf = in.read(buffer);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (lenbuf <= 0)
					return false;
			}
			return true;
		}

		private int readByte() {
			if (hasNextByte())
				return buffer[curbuf++];
			else
				return -1;
		}

		private boolean isSpaceChar(int c) {
			return !(c >= 33 && c <= 126);
		}

		private void skip() {
			while (hasNextByte() && isSpaceChar(buffer[curbuf]))
				curbuf++;
		}

		public boolean hasNext() {
			skip();
			return hasNextByte();
		}

		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (!isSpaceChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		public int nextInt() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}

		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		public long[] nextLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}

		public char[][] nextCharMap(int n, int m) {
			char[][] map = new char[n][m];
			for (int i = 0; i < n; i++)
				map[i] = next().toCharArray();
			return map;
		}
	}
}
