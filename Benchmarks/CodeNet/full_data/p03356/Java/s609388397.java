import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		Scanner in = new Scanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskD2 solver = new TaskD2();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskD2 {
		public void solve(int testNumber, Scanner sc, PrintWriter out) {

			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] p = new int[n];
			for (int i = 0; i < n; i++) {
				p[i] = sc.nextInt() - 1;
			}

			UnionFind uf = new UnionFind(n);
			for (int i = 0; i < m; i++) {
				int x = sc.nextInt() - 1;
				int y = sc.nextInt() - 1;
				uf.unite(x, y);
			}

			int count = 0;
			for (int i = 0; i < n; i++) {
				if (uf.same(p[i], i)) count++;
			}

			out.println(count);
		}

	}

	static class UnionFind {
		private int[] parent;
		private int[] rank;

		public UnionFind(int n) {
			parent = new int[n];
			rank = new int[n];
			for (int i = 0; i < n; i++) parent[i] = i;
		}

		public int find(int x) {
			if (parent[x] == x) return x;
			else return parent[x] = find(parent[x]);
		}

		public void unite(int x, int y) {
			x = find(x);
			y = find(y);
			if (x == y) return;
			if (rank[x] < rank[y]) {
				parent[x] = y;
			} else {
				parent[y] = x;
				if (rank[x] == rank[y]) rank[x]++;
			}
		}

		public boolean same(int x, int y) {
			return find(x) == find(y);
		}

	}

	static class Scanner {
		private final InputStream in;
		private final byte[] buffer;
		private int ptr;
		private int buflen;

		public Scanner(InputStream in) {
			this.in = in;
			this.buffer = new byte[1024];
			this.ptr = 0;
			this.buflen = 0;
		}

		private boolean hasNextByte() {
			if (ptr < buflen) return true;
			else {
				ptr = 0;
				try {
					buflen = in.read(buffer);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (buflen <= 0) return false;
			}
			return true;
		}

		private byte readByte() {
			if (hasNextByte()) return buffer[ptr++];
			return -1;
		}

		private boolean isPrintableChar(byte c) {
			return '!' <= c && c <= '~';
		}

		private void skipUnprintable() {
			while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
				ptr++;
			}
		}

		public boolean hasNext() {
			skipUnprintable();
			return hasNextByte();
		}

		public int nextInt() {
			if (!hasNext()) throw new NoSuchElementException();
			int n = 0;
			boolean minus = false;
			byte b = readByte();
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			if (b < '0' || '9' < b) throw new NumberFormatException();
			while (true) {
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				} else if (b == -1 || !isPrintableChar(b)) {
					return minus ? -n : n;
				} else {
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}

	}
}

