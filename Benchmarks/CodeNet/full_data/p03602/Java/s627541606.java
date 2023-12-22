import java.io.*;
import java.util.*;

public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();

		int[][] a = new int[n][n];
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
				if (j > i) {
					pq.add(new Pair(i, j, a[i][j]));
				}
			}
		}

		UnionFind uf = new UnionFind(n);
		Dijkstra di = new Dijkstra(n);
		long ans = 0;
		while (!pq.isEmpty()) {
			Pair e = pq.remove();

			if (uf.same(e.a, e.b)) {
				long tmp = di.getShortestPath(e.a, e.b);
				if (tmp < a[e.a][e.b]) {
					pr.println(-1);
					return;
				} else if (tmp > a[e.a][e.b]) {
					di.addEdge(e.a, e.b, e.c);
					di.addEdge(e.b, e.a, e.c);
					ans += e.c;
				}
			} else {
				uf.unite(e.a, e.b);
				di.addEdge(e.a, e.b, e.c);
				di.addEdge(e.b, e.a, e.c);
				ans += e.c;
			}
		}

		pr.println(ans);
	}

	private static class Pair implements Comparable<Pair> {
		int a;
		int b;
		int c;

		Pair(int a, int b, int c) {
			this.a = a;
			this.b = b;
			this.c = c;
		}

		@Override
		public int compareTo(Pair o) {
			if (c == o.c) {
				return Integer.compare(a, o.a);
			}

			return Integer.compare(c, o.c);
		}

		@Override
		public int hashCode() {
			return Integer.hashCode(a);
		}

		@Override
		public String toString() {
			// [xxx, xxxx]
			StringBuilder stmp = new StringBuilder(32);
			stmp.append('[');
			stmp.append(a);
			stmp.append(',');
			stmp.append(' ');
			stmp.append(b);
			stmp.append(']');

			return stmp.toString();
		}
	}

	private static class Dijkstra {
		long[] d;
		List<Edge>[] edges;
		PriorityQueue<Vertex> pq;
		int n;
		int s;

		final long INF = Long.MAX_VALUE;

		@SuppressWarnings("unchecked")
		Dijkstra(int n) {
			this.n = n;

			edges = new List[n];
			for (int ii = 0; ii < n; ii++) {
				edges[ii] = new ArrayList<Edge>();
			}

			s = - 1;
		}

		// i, j:0-indexed
		public void addEdge(int i, int j, int c) {
			edges[i].add(new Edge(i, j, c));
		}

		public long getShortestPath(int i, int j) {
			if (s != i) {
				d = new long[n];
				Arrays.fill(d, INF);
				d[i] = 0;
				pq = new PriorityQueue<Vertex>();
				pq.add(new Vertex(i, d[i]));

				while (!pq.isEmpty()) {
					Vertex u = pq.poll();
					if (d[u.me] < u.d) {
						continue;  // skip old vertex
					}

					for (int ii = 0; ii < edges[u.me].size(); ii++) {
						Edge v = edges[u.me].get(ii);
						if (d[u.me] != INF && d[v.v] > d[u.me] + v.w) {
							d[v.v] = d[u.me] + v.w;
							pq.add(new Vertex(v.v, d[v.v]));
						}
					}
				}

				s = i;
			}

			return d[j];
		}

		private static class Edge {
//			int u; // from
			int v; // to
			int w; // cost

			Edge(int u, int v, int w) {
//				this.u = u;
				this.v = v;
				this.w = w;
			}
		}

		private static class Vertex implements Comparable<Vertex> {
			int me; // me
			long d; // cost

			Vertex(int u, long w) {
				this.me = u;
				this.d = w;
			}

			@Override
			public int compareTo(Vertex o) {
//				return Long.compare(this.d, o.d);
				return this.d > o.d ? 1 : this.d < o.d ? -1 : 0;
			}
		}
	}

	@SuppressWarnings("unused")
	private static class UnionFind {
		int n;
		// cnt : 異なる集合の数
		int cnt;
		// parent[x] : 0～n-1 の場合、要素xのroot要素
		//           : -1～-n の場合、自分自身がroot要素、
		//                            -parent[x]でxを含む集合の要素数
		int[] parent;
		// rank[x] : 要素xが属する木の高さ
		int[] rank;

		UnionFind(int n) {
			this.n = n;
			cnt = n;
			parent = new int[n];
			Arrays.fill(parent, -1);
			rank = new int[n];
			Arrays.fill(rank, 0);
		}

		// xのrootを求める
		int find(int x) {
			if (parent[x] < 0) {
				return x;
			} else {
				return parent[x] = find(parent[x]);
			}
		}

		// xとyが同じ集合に属するのか
		boolean same(int x, int y) {
			return find(x) == find(y);
		}

		// xとyの属する集合を併合する
		void unite(int x, int y) {
			x = find(x);
			y = find(y);
			if (x == y) {
				return;
			}

			cnt--;
			// rankが大きい集合をrootにする
			if (rank[x] > rank[y]) {
				parent[x] += parent[y];
				parent[y] = x;
			} else {
				parent[y] += parent[x];
				parent[x] = y;
				if (rank[x] == rank[y]) {
					rank[y]++;
				}
			}

			return;
		}

		// 要素xを含む集合の要素数
		int count(int x) {
			return -parent[find(x)];
		}

		// 異なる集合の数
		int count() {
			return cnt;
		}
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		pr = new Printer(System.out);

		solve();

		pr.close();
		sc.close();
	}

	@SuppressWarnings("unused")
	private static class Scanner {
		BufferedReader br;

		Scanner (InputStream in) {
			br = new BufferedReader(new InputStreamReader(in));
		}

		private boolean isPrintable(int ch) {
			return ch >= '!' && ch <= '~';
		}

		private boolean isCRLF(int ch) {
			return ch == '\n' || ch == '\r' || ch == -1;
		}

		private int nextPrintable() {
			try {
				int ch;
				while (!isPrintable(ch = br.read())) {
					if (ch == -1) {
						throw new NoSuchElementException();
					}
				}

				return ch;
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		String next() {
			try {
				int ch = nextPrintable();
				StringBuilder sb = new StringBuilder();
				do {
					sb.appendCodePoint(ch);
				} while (isPrintable(ch = br.read()));

				return sb.toString();
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		int nextInt() {
			try {
				// parseInt from Integer.parseInt()
				boolean negative = false;
				int res = 0;
				int limit = -Integer.MAX_VALUE;
				int radix = 10;

				int fc = nextPrintable();
				if (fc < '0') {
					if (fc == '-') {
						negative = true;
						limit = Integer.MIN_VALUE;
					} else if (fc != '+') {
						throw new NumberFormatException();
					}
					fc = br.read();
				}
				int multmin = limit / radix;

				int ch = fc;
				do {
					int digit = ch - '0';
					if (digit < 0 || digit >= radix) {
						throw new NumberFormatException();
					}
					if (res < multmin) {
						throw new NumberFormatException();
					}
					res *= radix;
					if (res < limit + digit) {
						throw new NumberFormatException();
					}
					res -= digit;

				} while (isPrintable(ch = br.read()));

				return negative ? res : -res;
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		long nextLong() {
			try {
				// parseLong from Long.parseLong()
				boolean negative = false;
				long res = 0;
				long limit = -Long.MAX_VALUE;
				int radix = 10;

				int fc = nextPrintable();
				if (fc < '0') {
					if (fc == '-') {
						negative = true;
						limit = Long.MIN_VALUE;
					} else if (fc != '+') {
						throw new NumberFormatException();
					}
					fc = br.read();
				}
				long multmin = limit / radix;

				int ch = fc;
				do {
					int digit = ch - '0';
					if (digit < 0 || digit >= radix) {
						throw new NumberFormatException();
					}
					if (res < multmin) {
						throw new NumberFormatException();
					}
					res *= radix;
					if (res < limit + digit) {
						throw new NumberFormatException();
					}
					res -= digit;

				} while (isPrintable(ch = br.read()));

				return negative ? res : -res;
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		float nextFloat() {
			return Float.parseFloat(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			try {
				int ch;
				while (isCRLF(ch = br.read())) {
					if (ch == -1) {
						throw new NoSuchElementException();
					}
				}
				StringBuilder sb = new StringBuilder();
				do {
					sb.appendCodePoint(ch);
				} while (!isCRLF(ch = br.read()));

				return sb.toString();
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		void close() {
			try {
				br.close();
			} catch (IOException e) {
//				throw new NoSuchElementException();
			}
		}
	}

	private static class Printer extends PrintWriter {
		Printer(PrintStream out) {
			super(out);
		}
	}
}
