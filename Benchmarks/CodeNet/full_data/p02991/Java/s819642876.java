import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

	static PrintWriter out;
	static InputReader ir;

	static void solve() {
		int n = ir.nextInt();
		init(n);
		int m = ir.nextInt();
		Graph[] g = new Graph[n];
		for (int i = 0; i < n; i++) {
			g[i] = new Graph();
		}
		for (int i = 0; i < m; i++) {
			int u = ir.nextInt();
			int v = ir.nextInt();
			u--;
			v--;
			g[u].add(v);
		}
		int s = ir.nextInt() - 1;
		int t = ir.nextInt() - 1;
		for (int i = 0; i < n; i++) {
			HashSet<Integer> st = new HashSet<>();
			st.add(i);
			for (int j = 0; j < 3; j++) {
				HashSet<Integer> temp = new HashSet<>();
				for (int from : st) {
					for (int to : g[from]) {
						temp.add(to);
					}
				}
				st = temp;
			}
			for (int to : st) {
				unite(i, to, 1);
			}
		}
		if (!same(s, t)) {
			out.println(-1);
		} else {
			out.println(Math.abs(diff(s, t)));
		}
	}

	static class Graph extends ArrayList<Integer> {
	}

	final static int MAX_N = 111111;
	static int[] par = new int[MAX_N];
	static int[] rank = new int[MAX_N];
	static int[] diff_weight = new int[MAX_N];

	static void init(int n) {
		for (int i = 0; i < n; i++) {
			par[i] = i;
			rank[i] = 0;
			diff_weight[i] = 0;
		}
	}

	static int root(int x) {
		if (par[x] == x) {
			return x;
		} else {
			int r = root(par[x]);
			diff_weight[x] += diff_weight[par[x]];
			return par[x] = r;
		}
	}

	static boolean same(int x, int y) {
		return root(x) == root(y);
	}

	static boolean unite(int x, int y, int w) {

		w += (weight(x) - weight(y));

		x = root(x);
		y = root(y);
		if (x == y) {
			if (diff(x, y) == w) {
				return true;
			} else {
				return false;
			}
		}

		if (rank[x] < rank[y]) {
			int temp = x;
			x = y;
			y = temp;
			w = -w;
		}

		if (rank[x] == rank[y])
			rank[x]++;
		par[y] = x;

		diff_weight[y] = w;

		return true;
	}

	static int weight(int x) {
		root(x);
		return diff_weight[x];
	}

	static int diff(int x, int y) {
		return weight(y) - weight(x);
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
		out.println(Arrays.deepToString(o));
	}
}
