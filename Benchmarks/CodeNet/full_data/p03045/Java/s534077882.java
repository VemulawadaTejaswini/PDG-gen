import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int N = fs.nextInt(), M = fs.nextInt();
		int info[][] = new int[M][3];
		for(int i=0;i<M;i++) {
			int x = fs.nextInt()-1, y = fs.nextInt()-1, z = fs.nextInt();
			info[i][0] = x;
			info[i][1] = y;
			info[i][2] = z;
		}
		
		UnionFind uf = new UnionFind(N);
		for(int i=0;i<M;i++) {
			int x = info[i][0];
			int y = info[i][1];
			int z = info[i][2];
			uf.unite(x, y);
		}
		int ans = uf.groupnum();
		System.out.println(ans);
		
	}
}

class UnionFind{
	int parent[];
	UnionFind(int n){
		parent = new int[n];
		Arrays.fill(parent, -1);
	}
	void unite(int x, int y) {
		if(root(x)==root(y))return;
		if(size(x)<size(y))unite(y,x);
		else {
			parent[root(y)] -= size(x);
			parent[root(x)] = root(y);
		}
	}
	int size (int x) {
		return -parent[root(x)];
	}
	
	int root(int x) {
		if(parent[x]<0)return x;
		return parent[x] = root(parent[x]);
	}
	
	int groupnum() {
		int res = 0;
		for(int t:parent) {
			if(t<0)res++;
		}
		return res;
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