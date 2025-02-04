
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
	InputStream is;

	int __t__ = 1;
	int __f__ = 0;
	int __FILE_DEBUG_FLAG__ = __f__;
	String __DEBUG_FILE_NAME__ = "src/C1";

	FastScanner in;
	PrintWriter out;

	class Edge {
		int to;
		long cost;
		
		Edge(int to, long cost) {
			this.to = to;
			this.cost = cost;
		}
	}

	/* ---------- SCC --------------*/
	class TopologicalSort {
		int cur;
		ArrayList<Integer>[] g;
		ArrayList<Integer> res;
		boolean[] visited;
		
		public TopologicalSort(ArrayList<Integer>[] g) {
			this.g = g;
			visited = new boolean[g.length];
		}
		
		void dfs(int u) {
			visited[u] = true;
			
			for (int v : g[u]) {
				if (!visited[v]) dfs(v);
			}
			res.add(u);
		}
		
		ArrayList<Integer> doit() {
			int n = g.length;
			
			res = new ArrayList<Integer>();
			Arrays.fill(visited, false);
			for (int i = 0; i < n; i++) {
				if (!visited[i]) dfs(i);
			}
			
			return res;
		}
	}
	
	class SCC {
		int n;
		int size = -1;
		boolean[] visited;
		ArrayList<Integer>[] g, rg;
		ArrayList<Integer> vs; //post order
		int[] cmp = null;
		
		SCC(ArrayList<Integer>[] g) {
			this.g = g;
			this.n = g.length;
			this.visited = new boolean[n];
			this.vs = new ArrayList<Integer>();
			
			// set reverse graph
			rg = new ArrayList[n];
			for (int i = 0; i < n; i++)
				rg[i] = new ArrayList<Integer>();
			
			for (int u = 0; u < n; u++) {
				for (int v : g[u]) {
					rg[v].add(u);
				}
			}
		}
		
		void rdfs(int u, int idx) {
			visited[u] = true;
			cmp[u] = idx;
			
			for (int v : rg[u]) {
				if (!visited[v]) rdfs(v, idx);
			}
		}
		
		int[] getCmp() {
			if (cmp == null) throw new RuntimeException();
			return cmp;
		}
		
		int getSCCSize() {
			if (size == -1) throw new RuntimeException();
			return size;
		}
		
		void doit() {
			cmp = new int[n];
			
			vs = new TopologicalSort(g).doit();			
			size = 0;
			Arrays.fill(visited, false);
			for (int i = n - 1; i >= 0; i--) {
				int next = vs.get(i);
				if (!visited[next]) rdfs(next, size++);
			}
		}
	}
	/* ----------------------------- */
	
	final long INF = (long) (1e13);
	long[] dp;
	ArrayList<Edge>[] g;
	
	long dfs(int u) {
		if (dp[u] != -INF) return dp[u];
		
		for (Edge e : g[u]) {
			long ncost = dfs(e.to) + e.cost;
			if (ncost > dp[u]) {
				dp[u] = ncost;
			}
		}
		// System.out.println(u + " " + dp[u]);
		return dp[u];
	}
	
	public void solve() {
		int n = in.nextInt(), m = in.nextInt();
		int[] a = new int[m];
		int[] b = new int[m];
		int[] c = new int[m];
		
		g = new ArrayList[n];
		ArrayList<Integer>[] rg = new ArrayList[n];
		
		for (int i = 0; i < n; i++) {
			g[i] = new ArrayList<Edge>();
			rg[i] = new ArrayList<>();
		}
		
		for (int i = 0; i < m; i++) {
			a[i] = in.nextInt() - 1;
			b[i] = in.nextInt() - 1;
			c[i] = in.nextInt();
			rg[a[i]].add(b[i]);
			g[b[i]].add(new Edge(a[i], c[i]));
		}
		
		dp = new long[n];
		Arrays.fill(dp, -INF);
		dp[0] = 0;
		
		SCC scc = new SCC(rg);
		scc.doit();
		
		if (scc.size != n) {
			System.out.println("inf");
			return;
		}
		
		System.out.println(dfs(n - 1));		
	}
	
	public void run() {
		if (__FILE_DEBUG_FLAG__ == __t__) {
			try {
				is = new FileInputStream(__DEBUG_FILE_NAME__);
			} catch (FileNotFoundException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			System.out.println("FILE_INPUT!");
		} else {
			is = System.in;
		}
		in = new FastScanner(is);
		out = new PrintWriter(System.out);

		solve();
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public void mapDebug(int[][] a) {
		System.out.println("--------map display---------");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d ", a[i][j]);
			}
			System.out.println();
		}

		System.out.println("----------------------------");
		System.out.println();
	}

	public void debug(Object... obj) {
		System.out.println(Arrays.deepToString(obj));
	}

	class FastScanner {
		private InputStream stream;
		private byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;

		public FastScanner(InputStream stream) {
			this.stream = stream;
			//stream = new FileInputStream(new File("dec.in"));

		}

		int read() {
			if (numChars == -1)
				throw new InputMismatchException();
			if (curChar >= numChars) {
				curChar = 0;
				try {
					numChars = stream.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (numChars <= 0)
					return -1;
			}
			return buf[curChar++];
		}

		boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		boolean isEndline(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] nextIntArray(int n) {
			int[] array = new int[n];
			for (int i = 0; i < n; i++)
				array[i] = nextInt();

			return array;
		}

		int[][] nextIntMap(int n, int m) {
			int[][] map = new int[n][m];
			for (int i = 0; i < n; i++) {
				map[i] = in.nextIntArray(m);
			}
			return map;
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		long[] nextLongArray(int n) {
			long[] array = new long[n];
			for (int i = 0; i < n; i++)
				array[i] = nextLong();

			return array;
		}

		long[][] nextLongMap(int n, int m) {
			long[][] map = new long[n][m];
			for (int i = 0; i < n; i++) {
				map[i] = in.nextLongArray(m);
			}
			return map;
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		double[] nextDoubleArray(int n) {
			double[] array = new double[n];
			for (int i = 0; i < n; i++)
				array[i] = nextDouble();

			return array;
		}

		double[][] nextDoubleMap(int n, int m) {
			double[][] map = new double[n][m];
			for (int i = 0; i < n; i++) {
				map[i] = in.nextDoubleArray(m);
			}
			return map;
		}

		String next() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}

		String[] nextStringArray(int n) {
			String[] array = new String[n];
			for (int i = 0; i < n; i++)
				array[i] = next();

			return array;
		}

		String nextLine() {
			int c = read();
			while (isEndline(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isEndline(c));
			return res.toString();
		}
	}
}
