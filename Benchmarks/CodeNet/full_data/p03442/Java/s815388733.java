import java.util.*;
import java.io.*;

public class Main {

	class Edge {
		int from, to, mark;

		public Edge(int from, int to, int mark) {
			super();
			this.from = from;
			this.to = to;
			this.mark = mark;
		}

		@Override
		public String toString() {
			return "Edge [from=" + from + ", to=" + to + ", mark=" + mark + "]";
		}
		
	}
	
	List<Edge>[] graph;
	
	int dfs(int u, int p) {
		int xor = 0;
		for (int t = 0; t < graph[u].size(); t++) {
			Edge e = graph[u].get(t);
			int to = u ^ e.from ^ e.to;
			if (to == p) {
				continue;
			}
			xor ^= e.mark;
			e.mark ^= dfs(to, u);
		}
		return xor;
	}
	
	void solve() {
		int n = in.nextInt();
		graph = new List[n];
		for (int i = 0; i < n; i++) {
			graph[i] = new ArrayList<>();
		}
		
		Edge[] e = new Edge[n - 1];
		for (int i = 0; i < n - 1; i++) {
			e[i] = new Edge(in.nextInt(), in.nextInt(), in.nextInt());
			graph[e[i].from].add(e[i]);
			graph[e[i].to].add(e[i]);
		}
		dfs(0, -1);
		int allMask = 0;
		int result = 0;
		for (int i = 0; i < n - 1; i++) {
			int bit = e[i].mark;
			if (bit == 0) {
				result++;
				continue;
			}
			if ((allMask & (1 << bit)) != 0) {
				result++;
			}
			allMask ^= 1 << bit;
		}
		int[] xor = new int[1 << 16];
		for (int i =0 ; i < 1 << 16; i++) {
			for (int j = 0; j < 16; j++ ) {
				if ((i & (1 << j)) != 0) {
					xor[i] ^= j;
				}
			}
		}
		int[] dp = new int[1 << 16];
		for (int mask = 1; mask < 1 << 16; mask++) {
			for (int submask = mask; submask > 0; submask = (submask - 1) & mask) {
				if (xor[submask] == 0) {
					dp[mask] = Math.max(dp[mask], dp[mask ^ submask] + 1);
				}
			}
		}
		out.println((n - 1) - (dp[allMask] + result));
	}

	FastScanner in;
	PrintWriter out;

	void run() {
		in = new FastScanner();
		out = new PrintWriter(System.out);
		solve();
		out.close();
	}

	class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		public FastScanner(String s) {
			try {
				br = new BufferedReader(new FileReader(s));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public String nextToken() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(nextToken());
		}

		public long nextLong() {
			return Long.parseLong(nextToken());
		}

		public double nextDouble() {
			return Double.parseDouble(nextToken());
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
