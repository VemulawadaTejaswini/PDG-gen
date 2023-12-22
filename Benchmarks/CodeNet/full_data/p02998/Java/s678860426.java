import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

	static PrintWriter out;
	static InputReader ir;

	static void solve() {
		int n = ir.nextInt();
		int[][] a = new int[n][];
		for (int i = 0; i < n; i++)
			a[i] = ir.nextIntArray(2);
		Arrays.sort(a, new Comparator<int[]>() {
			public int compare(int[] A, int[] B) {
				return A[0] - B[0];
			}
		});

		UnionFindTree uf = new UnionFindTree(100010);
		for (int i = 0; i < n; i++) {
			uf.st[a[i][1]].add(a[i][0]);
		}
		for (int i = 0; i < n - 1; i++) {
			if (a[i][0] == a[i + 1][0])
				uf.unite(a[i][1], a[i + 1][1]);
		}
		boolean[] used = new boolean[100010];
		long tot = 0;
		for (int i = 0; i < 100010; i++) {
			int p = uf.find(i);
			if (!used[p]) {
				used[p] = true;
				tot += (long) uf.size(p) * uf.st[p].size();
			}
		}
		out.println(tot - n);
	}

	static class UnionFindTree {

		private int[] par;
		private int g;
		public HS[] st;

		public UnionFindTree(int size) {
			par = new int[size];
			st = new HS[size];
			for (int i = 0; i < size; i++)
				st[i] = new HS();
			g = size;
			for (int i = 0; i < size; i++) {
				par[i] = -1;
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
			if (st[x].size() > st[y].size()) {
				int temp = x;
				x = y;
				y = temp;
			}
			for (int v : st[x])
				st[y].add(v);
			st[x].clear();
			par[y] += par[x];
			par[x] = y;
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

	static class HS extends HashSet<Integer> {
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
