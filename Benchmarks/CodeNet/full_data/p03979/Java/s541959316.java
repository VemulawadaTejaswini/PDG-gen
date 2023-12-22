import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;

import java.io.*;

public class Main {
	int[] di = {0, 1, 0, -1};
	int[] dj = {1, 0, -1, 0};
	char[][] t;
	void solve() {
		int H = sc.nextInt();
		int W = sc.nextInt();
		t = new char[H][W];
		for (int i = 0; i < H; i++) t[i] = sc.next().toCharArray();
		for (int i = 0; i < H; i++) for (int j = 0; j < W; j++) {
			if (t[i][j] == 'X') {
				if (i == 0 || i == H-1 || j == 0 || j == W-1) {
					out.println(-1);
					return;
				}
			}
		}
		V src = new V();
		V sink = new V();
		
		V[][] v1 = new V[H][W];
		V[][] v2 = new V[H][W];
		for (int i = 0; i < H; i++) for (int j = 0; j < W; j++) {
			v1[i][j] = new V();
			v2[i][j] = new V();
		}
		
		for (int i = 0; i < H; i++) for (int j = 0; j < W; j++) {
			if (t[i][j] == 'X') {
				src.add(v1[i][j], INF);
				for (int k = 0; k < 4; k++) {
					int ni = i + di[k];
					int nj = j + dj[k];
					if (0 <= ni && ni < H && 0 <= nj && nj < W && t[ni][nj] == '.') {
						v1[i][j].add(v1[ni][nj], INF);
					}
				}
			} else {
				v1[i][j].add(v2[i][j], 1);
			}
		}
		
		for (int i = 0; i < H; i++) for (int j = 0; j < W; j++) {
			for (int k = 0; k < 4; k++) {
				int ni = i + di[k];
				int nj = j + dj[k];
				if (0 <= ni && ni < H && 0 <= nj && nj < W && t[ni][nj] == '.') {
					v2[i][j].add(v1[ni][nj], INF);
				}
			}
			if (i == 0 || i == H-1 || j == 0 || j == W-1) {
				v2[i][j].add(sink, INF);
			}
		}
		
		int flow = dinic(src, sink);
		int ans = flow;
		out.println(ans);
	}

	static final int INF = 1001001001;
	
	int dinic(V s, V t) {
		int flow = 0;
		for (int p = 1;; p++) {
			Queue<V> que = new LinkedList<V>();
			s.level = 0;
			s.p = p;
			que.offer(s);
			while (!que.isEmpty()) {
				V v = que.poll();
				v.iter = v.es.size() - 1;
				for (E e : v.es)
					if (e.to.p < p && e.cap > 0) {
						e.to.level = v.level + 1;
						e.to.p = p;
						que.offer(e.to);
					}
			}
			if (t.p < p) return flow;
			for (int f; (f = dfs(s, t, INF)) > 0;) flow += f;
		}
	}

	int dfs(V v, V t, int f) {
		if (v == t) return f;
		for (; v.iter >= 0; v.iter--) {
			E e = v.es.get(v.iter);
			if (v.level < e.to.level && e.cap > 0) {
				int d = dfs(e.to, t, Math.min(f, e.cap));
				if (d > 0) {
					e.cap -= d;
					e.rev.cap += d;
					return d;
				}
			}
		}
		return 0;
	}

	class V {
		ArrayList<E> es = new ArrayList<E>();
		int level, p, iter;
		
		void add(V to, int cap) {
			E e = new E(to, cap);
			E rev = new E(this, 0);
			e.rev = rev;
			rev.rev = e;
			es.add(e);
			to.es.add(rev);
		}
	}

	class E {
		V to;
		E rev;
		int cap;

		E(V to, int cap) {
			this.to = to;
			this.cap = cap;
		}
	}
	
	static void tr(Object... os) { System.err.println(deepToString(os)); }
	static void tr(int[][] as) { for (int[] a : as) tr(a); }
	static void tr(boolean[][] as) { for (boolean[] a : as) {
		for (boolean b : a) {
			System.err.print(b ? 1 : 0);
		}
		System.err.println();
		}
	}

	void print(int[] a) {
		if (a.length > 0) out.print(a[0]);
		for (int i = 1; i < a.length; i++) out.print(" " + a[i]);
		out.println();
	}

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	MyScanner sc = null;
	PrintWriter out = null;
	public void run() throws Exception {
		sc = new MyScanner(System.in);
		out = new PrintWriter(System.out);
		for (;sc.hasNext();) {
			solve();
			out.flush();
		}
		out.close();
	}

	class MyScanner {
		String line;
		BufferedReader reader;
		StringTokenizer tokenizer;

		public MyScanner(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream));
			tokenizer = null;
		}
		public void eat() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					line = reader.readLine();
					if (line == null) {
						tokenizer = null;
						return;
					}
					tokenizer = new StringTokenizer(line);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		}
		public String next() {
			eat();
			return tokenizer.nextToken();
		}
		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		public boolean hasNext() {
			eat();
			return (tokenizer != null && tokenizer.hasMoreElements());
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++) a[i] = nextInt();
			return a;
		}
	}
}