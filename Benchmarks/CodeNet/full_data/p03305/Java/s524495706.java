import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();
		int t = sc.nextInt();
		--s;
		--t;
		int[] u = new int[m];
		int[] v = new int[m];
		long[] a = new long[m];
		long[] b = new long[m];
		ArrayList<Edge>[] g_y = new ArrayList[n];
		ArrayList<Edge>[] g_s = new ArrayList[n];
		for (int i = 0; i < n; ++i) {
			g_y[i] = new ArrayList<>();
			g_s[i] = new ArrayList<>();
		}
		for (int i = 0; i < m; ++i) {
			u[i] = sc.nextInt();
			v[i] = sc.nextInt();
			a[i] = sc.nextLong();
			b[i] = sc.nextLong();
			--u[i];
			--v[i];
			g_y[u[i]].add(new Edge(u[i], v[i], a[i]));
			g_y[v[i]].add(new Edge(v[i], u[i], a[i]));
			g_s[u[i]].add(new Edge(u[i], v[i], b[i]));
			g_s[v[i]].add(new Edge(v[i], u[i], b[i]));
		}
		long[] dist_y = dist(g_y, s);
		long[] dist_s = dist(g_s, t);
		long ans = Long.MAX_VALUE / 3;
		PrintWriter pw = new PrintWriter(System.out);
		long[] f = new long[n];
		for (int i = n - 1; i >= 0; --i) {
			ans = Math.min(ans, dist_y[i] + dist_s[i]);
			f[i] = (long) 1e15 - ans;
		}
		for (int i = 0; i < n; ++i) {
			System.out.println(f[i]);
		}
		pw.close();
	}

	long[] dist(ArrayList<Edge>[] g, int s) {
		long[] ret = new long[g.length];
		Arrays.fill(ret, Long.MAX_VALUE / 3);
		ret[s] = 0;
		PriorityQueue<P> pq = new PriorityQueue<>();
		pq.add(new P(s, 0));
		boolean[] vis = new boolean[g.length];
		while (!pq.isEmpty()) {
			P p = pq.poll();
			if (vis[p.v])
				continue;
			vis[p.v] = true;
			for (Edge e : g[p.v]) {
				if (ret[e.dst] > ret[e.src] + e.cost) {
					ret[e.dst] = ret[e.src] + e.cost;
					pq.add(new P(e.dst, ret[e.dst]));
				}
			}
		}
		return ret;
	}

	class Edge {
		int src, dst;
		long cost;

		public Edge(int src_, int dst_, long cost_) {
			src = src_;
			dst = dst_;
			cost = cost_;
		}
	}

	class P implements Comparable<P> {
		int v;
		long d;

		public P(int v_, long d_) {
			v = v_;
			d = d_;
		}

		public int compareTo(P o) {
			return Long.compare(d, o.d);
		};
	}

	class Scanner {
		private final InputStream in = System.in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int buflen = 0;

		private boolean hasNextByte() {
			if (ptr < buflen) {
				return true;
			} else {
				ptr = 0;
				try {
					buflen = in.read(buffer);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (buflen <= 0) {
					return false;
				}
			}
			return true;
		}

		private int readByte() {
			if (hasNextByte())
				return buffer[ptr++];
			else
				return -1;
		}

		private boolean isPrintableChar(int c) {
			return 33 <= c && c <= 126;
		}

		private void skipUnprintable() {
			while (hasNextByte() && !isPrintableChar(buffer[ptr]))
				ptr++;
		}

		public boolean hasNext() {
			skipUnprintable();
			return hasNextByte();
		}

		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (isPrintableChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			long n = 0;
			boolean minus = false;
			int b = readByte();
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			if (b < '0' || '9' < b) {
				throw new NumberFormatException();
			}
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

		int nextInt() {
			return (int) nextLong();
		}
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}