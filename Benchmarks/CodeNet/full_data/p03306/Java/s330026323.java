import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

	static PrintWriter out;
	static InputReader ir;
	static boolean debug = false;

	static void solve() {
		int n = ir.nextInt();
		int m = ir.nextInt();
		Graph[] g = new Graph[n];
		for (int i = 0; i < n; i++)
			g[i] = new Graph();
		for (int i = 0; i < m; i++) {
			long[] x = ir.nextLongArray(3);
			x[0]--;
			x[1]--;
			g[(int) x[0]].add(new long[] { x[1], x[2] });
			g[(int) x[1]].add(new long[] { x[0], x[2] });
		}
		long[][] a = new long[n][2];
		a[0][0] = 1;
		a[0][1] = 0;
		Deque<Integer> que = new ArrayDeque<>();
		que.offerLast(0);
		long mi = 1, ma = (long) 1e9;
		for (long[] p : g[0]) {
			ma = Math.min(ma, p[1] - 1);
		}
		while (!que.isEmpty()) {
			int from = que.pollFirst();
			for (long[] e : g[from]) {
				int to = (int) e[0];
				if (a[to][0] == 0) {
					a[to][0] = a[from][0] * (-1);
					a[to][1] = e[1] - a[from][1];
					long l = a[to][0] == 1 ? Math.max(mi, 1 - a[to][1]) : Math.max(mi, a[to][1] - e[1]);
					long u = a[to][0] == 1 ? Math.min(ma, e[1] - a[to][1]) : Math.min(ma, a[to][1] - 1);
					if (u < mi || l > ma) {
						out.println(0);
						return;
					}
					mi = l;
					ma = u;
					que.offerLast(to);
				} else {
					if (a[to][0] == a[from][0] * (-1)) {
						if (a[to][1] == e[1] - a[from][1])
							continue;
						else {
							out.println(0);
							return;
						}
					} else {
						long k = a[to][1] - (e[1] - a[from][1]);
						if (a[to][0] == 1)
							k *= -1;
						if (k <= 0 || k % 2 == 1) {
							out.println(0);
							return;
						}
						if (k / 2 >= mi && k / 2 <= ma) {
							mi = ma = k / 2;
						} else {
							out.println(0);
							return;
						}
					}
				}
			}
		}
		out.println(ma - mi + 1);
	}

	static class Graph extends ArrayList<long[]> {
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
