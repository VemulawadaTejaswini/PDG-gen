import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

	static PrintWriter out;
	static InputReader ir;
	static boolean debug = false;

	static void solve() {
		int n = ir.nextInt();
		long[][] a = new long[n][];
		for (int i = 0; i < n; i++) {
			a[i] = ir.nextLongArray(2);
			if (a[i][0] < a[i][1]) {
				long t = a[i][0];
				a[i][0] = a[i][1];
				a[i][1] = t;
			}
		}
		long[] ma = new long[2];
		long[] mi = new long[2];
		int[] idx = new int[2];
		Arrays.fill(mi, (long) 1e9 + 7);
		Arrays.sort(a, new Comparator<long[]>() {
			public int compare(long[] A, long[] B) {
				return Long.compare(B[0], A[0]);
			}
		});
		for (int i = 0; i < n; i++)
			for (int j = 0; j < 2; j++) {
				if ((j == 1 && mi[j] >= a[i][j])) {
					idx[j] = i;
				}
				ma[j] = Math.max(ma[j], a[i][j]);
				mi[j] = Math.min(mi[j], a[i][j]);
			}
		long res = (ma[0] - mi[0]) * (ma[1] - mi[1]);
		if (idx[0] != idx[1]) {
			long max = Math.max(a[idx[0]][1], a[idx[1]][0]);
			long min = Math.min(a[idx[0]][1], a[idx[1]][0]);
			long[][] b = new long[n - 2][];
			int p = 0;
			for (int i = 0; i < n; i++) {
				if (i != idx[0] && i != idx[1])
					b[p++] = a[i];
			}
			Arrays.sort(b, new Comparator<long[]>() {
				public int compare(long[] A, long[] B) {
					return Long.compare(B[0], A[0]);
				}
			});
			for (int i = 0; i < n - 2; i++) {
				res = Math.min(res, (ma[0] - mi[1]) * (Math.max(b[i][0], max) - Math.min(b[n - 3][0], min)));
				max = Math.max(max, b[i][1]);
				min = Math.min(min, b[i][1]);
			}
			res = Math.min(res, (ma[0] - mi[1]) * (max - min));
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