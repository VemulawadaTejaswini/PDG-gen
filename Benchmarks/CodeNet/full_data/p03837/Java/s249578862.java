import java.util.*;
import java.io.*;

//別解：最短経路か判定する部分
//エッジがいずれかの頂点間の最短経路であるかいなかの調べ方を
//各エッジについて、全ての出発点と全ての到着点を調べ、その最短経路に使われるか調べる方法

class Edge{
	int from, to, cost;

	public Edge(int from, int to, int cost) {
		super();
		this.from = from;
		this.to = to;
		this.cost = cost;
	}
	
}

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt(), m = fs.nextInt();
		int g[][] = new int[n][n];
		int inf = Integer.MAX_VALUE/2;
		for(int i=0;i<n;i++)for(int j=0;j<n;j++) {
			if(i==j)g[i][j]=0;
			else g[i][j] = inf;
		}
		
		Edge[] es = new Edge[m];
		
		for(int i=0;i<m;i++) {
			int a = fs.nextInt()-1, b = fs.nextInt()-1, c = fs.nextInt();
			g[a][b] = g[b][a] = c;
			es[i] = new Edge(a,b,c);
		}
			
		for(int k=0;k<n;k++) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					g[i][j] = Math.min(g[i][j], g[i][k]+g[k][j]);
				}
			}
		}
		
		int cnt = 0;
		for(Edge e : es) {
			int from = e.from, to = e.to, cost = e.cost;
			boolean ok = false;
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(g[i][j]==g[i][from] + cost + g[to][j])ok = true;
					else if(g[i][j]==g[i][to] + cost + g[from][j])ok=true;
				}
			}
			if(!ok)cnt++;
		}
		System.out.println(cnt);
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
