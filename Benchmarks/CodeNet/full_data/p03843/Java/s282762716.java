import java.io.*;
import java.util.*;

public class Main {

	static final int INF = Integer.MAX_VALUE / 10;
	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;
	boolean eof;

	List<Integer>[] g;

	int[] down, down2;
	int[] whoDown;
	int[] up;
	
	int[] high;
	
	int[] par;

	void dfs1(int v, int p) {
		par[v] = p;
		for (int u : g[v]) {
			if (u == p) {
				continue;
			}
			dfs1(u, v);

			if (down[u] + 1 > down[v]) {
				down2[v] = down[v];
				down[v] = down[u] + 1;
				whoDown[v] = u;
			} else if (down[u] + 1 > down2[v]) {
				down2[v] = down[u] + 1;
			}
		}
	}

	void dfs2(int v, int p, int curUp) {
		up[v] = curUp;
		
		high[v] = (up[v] > down[v] ? down[v] : (up[v] > down2[v] ? up[v] : down2[v])) + 1;
		high[v] = Math.min(high[v], Math.max(up[v], down[v]) - 1);
		
		for (int u : g[v]) {
			if (u == p) {
				continue;
			}
			int hereUp = whoDown[v] == u ? down2[v] : down[v];
			dfs2(u, v, Math.max(curUp, hereUp) + 1);
		}
	}

	void solve() throws IOException {
		int n = nextInt();
		g = new List[n];
		for (int i = 0; i < n; i++) {
			g[i] = new ArrayList<>();
		}

		for (int i = 0; i < n - 1; i++) {
			int v = nextInt() - 1;
			int u = nextInt() - 1;
			g[v].add(u);
			g[u].add(v);
		}

		String s = nextToken();

		down = new int[n];
		down2 = new int[n];
		whoDown = new int[n];
		par = new int[n];
		Arrays.fill(whoDown, -1);
		up = new int[n];
		
		high = new int[n];

		dfs1(0, 0);
		dfs2(0, 0, 0);
		
		ArrayDeque<Integer> que = new ArrayDeque<>();
		boolean[] inQ = new boolean[n];
		int[] d = new int[n];
		Arrays.fill(d, INF);
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1') {
				d[i] = 0;
				que.add(i);
				inQ[i] = true;
			}
		}
		
		while (!que.isEmpty()) {
			int v = que.poll();
			inQ[v] = false;
			for (int u : g[v]) {
				if (d[v] == 0) {
					int szU = u == par[v] ? up[v] : down[v] + 1;
					if (szU != Math.max(up[v], down[v])) {
						continue;
					}
				}
				int cost = s.charAt(v) == '1' ? high[v] : 1; 
				if (d[u] > d[v] + cost) {
					d[u] = d[v] + cost;
//					que[tail++] = u;
					if (!inQ[u]) {
						que.add(u);
					}
				}
			}
		}
		
//		System.err.println(Arrays.toString(high));
//		System.err.println(Arrays.toString(d));
		
		long ans = 1;
		for (int i = 0; i < n; i++) {
			ans += Math.max(high[i] - d[i] + 1, 0);
		}
		
		out.println(ans);
	}

	Main() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
//		solve();
		Thread t = new Thread(null, new Runnable() {
			
			@Override
			public void run() {
				try {
					solve();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}, "LUL", 1 << 26);
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.close();
	}

	public static void main(String[] args) throws IOException {
		new Main();
	}

	String nextToken() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (Exception e) {
				eof = true;
				return null;
			}
		}
		return st.nextToken();
	}

	String nextString() {
		try {
			return br.readLine();
		} catch (IOException e) {
			eof = true;
			return null;
		}
	}

	int nextInt() throws IOException {
		return Integer.parseInt(nextToken());
	}

	long nextLong() throws IOException {
		return Long.parseLong(nextToken());
	}

	double nextDouble() throws IOException {
		return Double.parseDouble(nextToken());
	}
}