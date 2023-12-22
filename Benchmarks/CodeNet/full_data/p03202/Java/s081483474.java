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
	static int res;
	static int[] ct;

	static void solve() {
		int n = ir.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = ir.nextInt();
		ct = new int[21];
		Arrays.fill(ct, -1);
		int len = 0;
		boolean f = false;
		for (int i = 0; i < n - 1; i++) {
			if (a[i] >= a[i + 1]) {
				f = true;
				break;
			}
		}
		if (!f) {
			out.println(1);
			return;
		}
		for (int i = 1; i <= Math.min(20, a[0]); i++) {
			ct[i]++;
		}
		int res = 2;
		for (int i = 0; i < n - 1; i++) {
			if (a[i] == a[i + 1]) {
				if (a[i] > 20)
					continue;
				ct[(int) a[i]]++;
				work();
				if (Math.pow(res, a[i]) < ct[(int) a[i]]) {
					res++;
				}
			} else if (a[i] < a[i + 1]) {
				if (a[i] < 20) {
					for (int j = (int) a[i] + 1; j <= Math.min(20, a[i + 1]); j++) {
						ct[j] = 0;
						work();
					}
				}
			} else {
				if (a[i + 1] <= 20) {
					for (int j = a[i + 1] + 1; j <= 20; j++)
						ct[j] = -1;
					ct[a[i + 1]]++;
					work();
				}
			}
		}
		tr(ct);
		out.println(res);
	}

	static void work() {
		for (int i = 20; i > 0; i--) {
			if (ct[i] > res) {
				ct[i] -= res;
				ct[i + 1]++;
			}
		}
		if (ct[0] == 0) {
			res++;
			ct[1] = res - 1;
			ct[0] = -1;
		}
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