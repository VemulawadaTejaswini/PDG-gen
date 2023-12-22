import java.util.*;
import java.util.stream.IntStream;
import java.io.*;

public class Main {

	List<Integer>[] graph;
	int[] color;
	void dfs(int u, int c) {
		color[u] = c;
		for (int t = 0; t < graph[u].size(); t++) {
			int v = graph[u].get(t);
			if (color[v] == -1) {
				dfs(v, c);
			}
		}
	}
	void solve() {
		int n = in.nextInt();
		graph = new List[n];
		for (int i = 0; i < n; i++) {
			graph[i] = new ArrayList<>();
		}
		for (int i = 0; i < n - 1; i++) {
			int from = in.nextInt() - 1, to = in.nextInt() - 1;
			graph[from].add(to);
			graph[to].add(from);
		}
		
		int[] q = new int[n];
		int head = 0, tail = 0;
		int[] prev = new int[n];
		int[] dist = new int[n];
		Arrays.fill(dist, -1);
		dist[0] = 0;
		q[tail++] = 0;
		while (head < tail) {
			int cur = q[head++];
			for (int v : graph[cur]) {
				if (dist[v] == -1) {
					dist[v] = dist[cur] + 1;
					prev[v] = cur;
					q[tail++] = v;
				}
			}
		}
		
		color = new int[n];
		Arrays.fill(color, -1);
		int len = dist[n - 1];
		int cur = n - 1;
		while (cur > 0) {
			if (dist[cur] <= len / 2) {
				color[cur] = 0;
			} else {
				color[cur] = 1;
			}
			cur = prev[cur];
		}
		color[0] = 0;
		for (int i = 0; i < n; i++) {
			if (color[i] != -1) {
				dfs(i, color[i]);
			}
		}
		int[] cnt = new int[2];
		for (int i = 0; i < n; i++) {
			cnt[color[i]]++;
		}
		
		out.println(cnt[0] > cnt[1] ? "Fennec" : "Snuke");
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
