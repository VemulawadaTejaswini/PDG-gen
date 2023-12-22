import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };

	static int n, c[], s[], f[];
	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		n = fs.nextInt();
		c = new int[n-1];
		s = new int[n-1];
		f = new int[n-1];
		for(int i=0;i<n-1;i++) {
			c[i] = fs.nextInt();
			s[i] = fs.nextInt();
			f[i] = fs.nextInt();
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n;i++) {
			sb.append(dfs(i, 0));
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
	static int dfs(int v,int sum) {
		if(v==n-1) {
			return sum;
		}
		int t = (sum + f[v] - 1) / f[v];
		int now = Math.max(s[v], t*f[v]);
		return dfs(v+1, now + c[v]);
	}
}

class UnionFind{
	int parent[];
	UnionFind(int N){
		parent = new int[N];
		Arrays.fill(parent, -1);
	}
	
	boolean same(int x, int y){
		return root(x)==root(y);
	}
	int root(int x) {
		if(parent[x]<0)return x;
		return parent[x] = root(parent[x]);
	}
	int size(int x) {
		return -parent[root(x)];
	}
	void unite(int x, int y) {
		if(size(x)<size(y)) {
			int tmp = x;
			x = y;
			y = tmp;
		}
		int rx = root(x);
		int ry = root(y);
		if(rx==ry)return;
		parent[rx] += parent[ry];
		parent[ry] = rx;
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