import java.io.*;
import java.util.*;

public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] p = new int[m];
		int[] q = new int[m];
		int[] c = new int[m];

		Set<Integer> hsc = new HashSet<>();
		for (int i = 0; i < m; i++) {
			p[i] = sc.nextInt() - 1;
			q[i] = sc.nextInt() - 1;
			c[i] = sc.nextInt();

			hsc.add(c[i]);
		}

		int cn = hsc.size();
		Map<Integer, Integer> hmc = new HashMap<>();
		int index = n;
		for (int e : hsc) {
			hmc.put(e, index++);
		}

		List<Set<Integer>> edges = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			edges.add(new HashSet<>());
		}

		Dijkstra di = new Dijkstra(n + cn);

		for (int i = 0; i < m; i++) {
			if (!edges.get(p[i]).contains(c[i])) {
				int ci = hmc.get(c[i]);
				di.addEdge(p[i], ci, 1);
				di.addEdge(ci, p[i], 0);
				di.addEdge(q[i], ci, 1);
				di.addEdge(ci, q[i], 0);
				edges.get(p[i]).add(c[i]);
			}
		}

		long ret = di.getShortestPath(0, n - 1);

		if (ret == di.INF) {
			pr.println(-1);
		} else {
			pr.println(ret);
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
