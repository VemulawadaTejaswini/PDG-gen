import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

	static PrintWriter out;
	static InputReader ir;
	static boolean debug = false;

	static void solve() {
		final long mod = (long) 1e9 + 7;
		int n = ir.nextInt();
		int m = ir.nextInt();
		int[] a = ir.nextIntArray(n);
		int[] b = ir.nextIntArray(m);
		int[] h = new int[n * m + 1];
		int[] w = new int[n * m + 1];
		int[] t = new int[n * m + 1];
		for (int i = 0; i < n; i++) {
			h[a[i]]++;
		}
		for (int i = 0; i < m; i++) {
			w[b[i]]++;
		}
		for (int i = 0; i < n * m; i++) {
			if (h[i + 1] > 1 || w[i + 1] > 1) {
				out.println(0);
				return;
			}
			if (h[i + 1] == 1 && w[i + 1] == 1) {
				t[i + 1] = 1;
			} else if (h[i + 1] == 1) {
				t[i + 1] = 2;
			} else if (w[i + 1] == 1) {
				t[i + 1] = 3;
			}
		}
		for (int i = n * m; i > 0; i--) {
			h[i - 1] += h[i];
			w[i - 1] += w[i];
		}
		long res = 1;
		for (int i = n * m; i > 0; i--) {
			if (t[i] == 2) {
				res *= (w[i]);
			} else if (t[i] == 3) {
				res *= (h[i]);
			}
			res %= mod;
		}
		long ct = 0;
		for (int i = n * m; i > 0; i--) {
			if (t[i] != 0)
				ct++;
			else {
				if (h[i] * w[i] <= ct) {
					out.println(0);
					return;
				}
				res *= (h[i] * w[i] - ct);
				res %= mod;
				ct++;
			}
		}
		out.println(res);
	}

	public static void main(String[] args) {
		ir = new InputReader(System.in);
		out = new PrintWriter(System.out);
		solve();
		out.flush();
	}

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

	static void tr(Object... o) {
		if (debug)
			out.println(Arrays.deepToString(o));
	}
}