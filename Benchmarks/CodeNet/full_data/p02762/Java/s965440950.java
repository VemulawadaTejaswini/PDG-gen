import java.util.*;

import java.io.*;

public class Main {
	static PrintWriter out;
	static StringBuilder sb;
	static long mod = 1000000007;
	static int inf = (int) 1e15;
	static ArrayList<Integer>[] adL, adH;
	static int n, m, k, total;
	static int[] ans;
	static boolean[] vis,vis1;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		n = sc.nextInt();
		m = sc.nextInt();
		k = sc.nextInt();
		adL = new ArrayList[n];
		for (int i = 0; i < n; i++)
			adL[i] = new ArrayList<>();
		adH = new ArrayList[n];
		for (int i = 0; i < n; i++)
			adH[i] = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			adL[a].add(b);
			adL[b].add(a);
		}
		for (int i = 0; i < k; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			adH[a].add(b);
			adH[b].add(a);
		}
		vis=new boolean [n];
		vis1=new boolean [n];
		ans=new int [n];
		for (int i = 0; i < n; i++) {
			if (!vis[i]) {
				total = 0;
				hs = new HashSet<>();
				dfs(i);
				dfs1(i);
			}
		}
		for(int i=0;i<n;i++)
			out.print(ans[i]+" ");
		out.flush();
	}

	static HashSet<Integer> hs;

	static void dfs(int u) {
		total++;
		hs.add(u);
		vis[u] = true;
		for (int v : adL[u])
			if (!vis[v])
				dfs(v);
	}

	static void dfs1(int u) {
		vis1[u] = true;
		int h=0;
		for (int v : adL[u])
			if (!vis1[v])
				dfs1(v);
		for(int v:adH[u])
			if(hs.contains(v))
				h++;
		ans[u]=-1+total-adL[u].size()-h;
	}

	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}

		public Scanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public char nextChar() throws IOException {
			return next().charAt(0);
		}

		public Long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
}