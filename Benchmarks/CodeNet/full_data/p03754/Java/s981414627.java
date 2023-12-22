import java.util.*;
import java.io.*;

public class Main {
	static final int mod = (int) 1e9 + 7;
	static final int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };
	static final int[] DX8 = { -1, -1, -1, 0, 0, 1, 1, 1 }, DY8 = { -1, 0, 1, -1, 1, -1, 0, 1 };
	static final int INF = Integer.MAX_VALUE / 3;
	static final long LINF = Long.MAX_VALUE / 3;
	static final String nextLine = "\n";

	static int n;
	static int MAX_N = 150100;
	static List<Integer> graph[];
	static double dp1[] = new double[MAX_N], dp2[] = new double[MAX_N];
	static double ans[] = new double[MAX_N];
	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		n = fs.nextInt();
		graph = new ArrayList[n];
		for(int i=0;i<n;i++)graph[i] = new ArrayList<>();
		for(int i=0;i<n-1;i++) {
			int u = fs.nextInt()-1, v = fs.nextInt()-1;
			graph[u].add(v);
			graph[v].add(u);
		}
		dfs1(0,-1);
		dfs2(0,-1);
		for(int i=0;i<n;i++) {
			int child = graph[i].size()-1;
			if(i==0)child ++;
			ans[i] = dp2[i];
			ans[i] += child * dp1[i];
			ans[i] /= graph[i].size();
			System.out.println(ans[i]);
		}
	}

	static void dfs1(int v, int p) {
		for(int to:graph[v]) {
			if(to == p)continue;
			dfs1(to, v);
			dp1[v] += dp1[to]+1;
		}
		if(graph[v].size()>1) {
			dp1[v] /= (graph[v].size()-1+(p==-1?1:0));
		}
	}
	
	static void dfs2(int v, int p) {
		if(p == -1)dp2[v] = 0;
		double tot = dp2[v];
		for(int to:graph[v]) {
			if(to == p)continue;
			tot += (dp1[to] + 1);
		}
		for(int to:graph[v]) {
			if(to == p)continue;
			dp2[to] = tot - (dp1[to] + 1);
			if(graph[v].size()>1)dp2[to] /= (graph[v].size()-1);
			dp2[to] += 1;
			dfs2(to, v);
		}
	}
	
	//MOD culculations
	static long plus(long x, long y) {
		long res = (x + y) % mod;
		return res < 0 ? res + mod : res;
	}

	static long sub(long x, long y) {
		long res = (x - y) % mod;
		return res < 0 ? res + mod : res;
	}

	static long mul(long x, long y) {
		long res = (x * y) % mod;
		return res < 0 ? res + mod : res;
	}

	static long div(long x, long y) {
		long res = x * pow(y, mod - 2) % mod;
		return res < 0 ? res + mod : res;
	}

	static long pow(long x, long y) {
		if (y < 0)
			return 0;
		if (y == 0)
			return 1;
		if (y % 2 == 1)
			return (x * pow(x, y - 1)) % mod;
		long root = pow(x, y / 2);
		return root * root % mod;
	}
}

//高速なScanner
class FastScanner {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScanner(InputStream in) {
		reader = new BufferedReader(new InputStreamReader(in));
		tokenizer = null;
	}

	public String next() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public String nextLine() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken("\n");
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public int nextInt() {
		return Integer.parseInt(next());
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
}