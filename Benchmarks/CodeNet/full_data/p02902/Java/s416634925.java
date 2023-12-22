import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class Main {

	static PrintWriter out;
	static InputReader ir;
	static ArrayList<Integer> xs = new ArrayList<Integer>();

	static void solve() {
		int n = ir.nextInt();
		int m = ir.nextInt();
		Graph[] g = new Graph[n];
		Graph[] f = new Graph[n];
		boolean[][] e = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			g[i] = new Graph();
			f[i] = new Graph();
		}
		for (int i = 0; i < m; i++) {
			int u = ir.nextInt() - 1;
			int v = ir.nextInt() - 1;
			g[u].add(v);
			f[v].add(u);
			e[u][v] = true;
		}
		int[] tp = TopologicalSort(g);
		if (xs.isEmpty()) {
			out.println(-1);
		} else {
			for (int x : xs) {
				long[] d = dijkstra(x, g);
				ArrayList<Integer> l = new ArrayList<>();
				for (int i = 0; i < n; i++) {
					if (d[i] < 1L << 60 && e[i][x]) {
						int cur = i;
						while (cur != x) {
							l.add(cur);
							for (int to : f[cur]) {
								if (d[to] + 1 == d[cur]) {
									cur = to;
									break;
								}
							}
						}
						l.add(x);
						out.println(l.size());
						for (int j = 0; j < l.size(); j++) {
							out.println(l.get(j) + 1);
						}
						return;
					}
				}
			}
			out.println(-1);
		}
	}

	public static long[] dijkstra(int s, Graph[] g) {
		long[] d = new long[g.length];
		PriorityQueue<long[]> pq = new PriorityQueue<long[]>(new Comparator<long[]>() {
			public int compare(long[] a, long[] b) {
				return Long.compare(a[1], b[1]);
			}
		});
		Arrays.fill(d, 1L << 60);
		d[s] = 0;
		pq.offer(new long[] { s, 0 });
		while (!pq.isEmpty()) {
			long[] p = pq.poll();
			int from = (int) p[0];
			if (d[from] != p[1])
				continue;
			for (int i = 0; i < g[from].size(); i++) {
				int e = g[from].get(i);
				int to = (int) e;
				if (d[to] > d[from] + 1) {
					d[to] = d[from] + 1;
					pq.offer(new long[] { to, d[to] });
				}
			}
		}
		return d;
	}

	static int[] TopologicalSort(Graph[] g) {
		int n = g.length;
		int[] in = new int[n];
		int[] ord = new int[n];
		for (int i = 0; i < n; i++) {
			for (int to : g[i])
				in[to]++;
		}
		Deque<Integer> s = new ArrayDeque<Integer>();
		for (int i = 0; i < n; i++) {
			if (in[i] == 0) {
				s.offerFirst(i);
			}
		}
		int p = 0;
		while (!s.isEmpty()) {
			int from = s.pollFirst();
			ord[p++] = from;
			for (int j = 0; j < g[from].size(); j++) {
				int to = g[from].get(j);
				in[to]--;
				if (in[to] == 0) {
					s.offerFirst(to);
				}
			}
		}
		for (int i = 0; i < n; i++)
			if (in[i] != 0) {
				xs.add(i);
				return ord;
			}
		return ord;
	}

	static class Graph extends ArrayList<Integer> {
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