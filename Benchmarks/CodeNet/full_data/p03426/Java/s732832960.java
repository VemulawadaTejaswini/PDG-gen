
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
			int H = sc.nextInt();
			int W = sc.nextInt();
			int D = sc.nextInt();
			int[][] hw = new int[H][W];
			InfoInt[] xy = new InfoInt[H * W + 1];
			xy[0] = new InfoInt(0, 0);

			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					hw[i][j] = sc.nextInt();
					xy[hw[i][j]] = new InfoInt(i + 1, j + 1);
				}
			}
			int Q = sc.nextInt();

			long[][] visit = new long[H * W + 100][H * W + 100];
			boolean[][] visited = new boolean[H * W + 100][H * W + 100];

			for (int i = 0; i < Q; i++) {
				int l = sc.nextInt();
				int r = sc.nextInt();
				long ans = 0;
				if (l != r) {
					if (!visited[l][r]) {
						int now = l;
						while (now != r) {
							int next = now + D;
							if (!visited[now][next]) {
								int nextx = xy[next].x;
								int nexty = xy[next].y;
								int nowx = xy[now].x;
								int nowy = xy[now].y;
								long t = Math.abs(nextx - nowx) + Math.abs(nexty - nowy);
								ans += t;
								visit[now][next] = t;
								visited[now][next] = true;
							}
							now = next;
						}
					} else {
						ans = visit[l][r];
					}
				}
				visited[l][r] = true;
				visit[l][r] = ans;
				out.println(ans);
			}

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

	class InfoInt {
		public int x;
		public int y;

		public InfoInt(int x, int y) {
			this.x = x;
			this.y = y;
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
