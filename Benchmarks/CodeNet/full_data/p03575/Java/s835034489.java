import java.util.*;
import java.io.*;

class Edge{
	int from, to;
	public Edge(int from, int to) {
		super();
		this.from = from;
		this.to = to;
	}
}

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };
	static int n, m, to[][];
	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		n = fs.nextInt();
		m = fs.nextInt();
		to = new int[n][n];
		List<Edge> list = new ArrayList<>();
		for(int i=0;i<m;i++) {
			int a = fs.nextInt()-1, b = fs.nextInt()-1;
			to[a][b]=1;
			to[b][a]=1;
			list.add(new Edge(a,b));
		}
		int ans = 0;
		for(int i=0;i<m;i++) {
			int a = list.get(i).from;
			int b = list.get(i).to;
			to[a][b]=0;
			to[b][a]=0;
			if(!dfs(0,new int[n]))ans++;
			to[a][b]=1;
			to[b][a]=1;
		}
		System.out.println(ans);
	}
	static boolean dfs(int v,int visited[]) {
		visited[v]=1;
		boolean last = true;
		boolean res = false;
		for(int i=0;i<n;i++) {
			if(to[v][i]==1&&visited[i]==0) {
				last = false;
				res |= dfs(i,visited);
			}
		}
		if(last) {
			for(int i=0;i<n;i++) {
				if (visited[i]==0)return false;
			}
			return true;
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