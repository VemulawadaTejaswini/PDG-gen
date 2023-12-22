import java.util.*;
import java.io.*;

class UnionFind {
	int parent[];

	UnionFind(int N) {
		parent = new int[N];
		Arrays.fill(parent, -1);
	}

	boolean same(int x, int y) {
		return root(x) == root(y);
	}

	int root(int x) {
		if (parent[x] < 0)
			return x;
		return parent[x] = root(parent[x]);
	}

	int size(int x) {
		return -parent[root(x)];
	}

	void unite(int x, int y) {
		if (size(x) < size(y)) {
			int tmp = x;
			x = y;
			y = tmp;
		}
		int rx = root(x);
		int ry = root(y);
		if (rx == ry)
			return;
		parent[rx] += parent[ry];
		parent[ry] = rx;
	}
}

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };
	static final int INF = Integer.MAX_VALUE / 3;
	static final long LINF = Long.MAX_VALUE / 3;

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt(), m = fs.nextInt(), k = fs.nextInt();
		UnionFind uf = new UnionFind(n);
		
		//List<Integer> fr[] = new ArrayList[n];
		int frs[] = new int[n];
		List<Integer> bl[] = new ArrayList[n];
		for(int i=0;i<n;i++) bl[i] = new ArrayList<>();
		
		for(int i=0;i<m;i++) {
			int a = fs.nextInt()-1, b = fs.nextInt()-1;
			frs[a]++; frs[b]++;
			uf.unite(a,b);
		}
		
		for(int i=0;i<k;i++) {
			int c = fs.nextInt()-1, d = fs.nextInt()-1;
			bl[c].add(d);
			bl[d].add(c);
		}
		
		int ans[] = new int[n];
		for(int i=0;i<n;i++) {
			int t = uf.size(i);
			t -= frs[i];
			for(int s:bl[i]) {
				if(uf.same(i, s))t--;
			}
			ans[i] = t - 1;
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n;i++) {
			sb.append(ans[i] + " ");
		}
		System.out.println(sb.toString());
		
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