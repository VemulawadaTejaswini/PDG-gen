import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {
	static PrintWriter out;
	static InputReader ir;

	static void solve() {
		int n = ir.nextInt();
		int m = ir.nextInt();
		int[][] a = new int[m][3];
		for (int i = 0; i < m; i++)
			a[i] = ir.nextIntArray(3);
		Graph[] g = new Graph[n];
		for (int i = 0; i < n; i++)
			g[i] = new Graph();
		for (int i = 0; i < m; i++) {
			a[i][0]--;
			a[i][1]--;
			g[a[i][0]].add(new int[] { a[i][1], a[i][2] });
			g[a[i][1]].add(new int[] { a[i][0], -a[i][2] });
		}
		UnionFindTree uf = new UnionFindTree(n);
		for (int i = 0; i < m; i++) {
			uf.unite(a[i][0], a[i][1]);
		}

		long[] p = new long[n];
		Arrays.fill(p, 1L << 60);
		for (int i = 0; i < n; i++)
			p[uf.find(i)] = 0;
		for (int i = 0; i < n; i++) {
			if (p[i] == 0) {
				if (!dfs(i, g, p)) {
					out.println("No");
					return;
				}
			}
		}
		out.println("Yes");
	}

	static boolean dfs(int cur, Graph[] g, long[] p) {
		for (int[] to : g[cur]) {
			if (p[to[0]] == 1L << 60) {
				p[to[0]] = p[cur] + to[1];
				if (!dfs(to[0], g, p))
					return false;
			} else {
				if (p[to[0]] != p[cur] + to[1])
					return false;
			}
		}
		return true;
	}

	static class Graph extends ArrayList<int[]> {
	}

	static class UnionFindTree {

		private int[] par;
		private int[] rank;
		private int g;

		public UnionFindTree(int size) {
			par = new int[size];
			rank = new int[size];
			g = size;
			for (int i = 0; i < size; i++) {
				par[i] = -1;
				rank[i] = 0;
			}
		}

		public int find(int x) {
			if (par[x] < 0)
				return x;
			else
				return par[x] = find(par[x]);
		}

		public void unite(int x, int y) {
			x = find(x);
			y = find(y);
			if (x == y)
				return;
			else if (rank[x] > rank[y]) {
				par[x] += par[y];
				par[y] = x;
			} else {
				par[y] += par[x];
				par[x] = y;
				if (rank[x] == rank[y])
					rank[y]++;
			}
			g--;
		}

		public int groups() {
			return g;
		}

		public int size(int x) {
			return -par[find(x)];
		}

		public boolean same(int x, int y) {
			return find(x) == find(y);
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
		out.println(Arrays.deepToString(o));
		out.flush();
	}
}
