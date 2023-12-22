import java.util.*;
import java.io.*;
//Bellman Ford
public class Main {
	static int N, M, P;
	static List<ArrayList<Integer>> to, rto;
	static List<int[]> edges;
	static boolean reachableFrom1[];
	static boolean reachableToN[];
	static int INF = Integer.MAX_VALUE/2;
	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int N = fs.nextInt(), M = fs.nextInt(), P = fs.nextInt();
		to = new ArrayList<>();
		rto = new ArrayList<>();
		edges = new ArrayList<>();
		for(int i=0;i<N;i++) {
			to.add(new ArrayList<Integer>());
			rto.add(new ArrayList<Integer>());
		}
		for(int i=0;i<M;i++) {
			int a = fs.nextInt()-1, b = fs.nextInt()-1, c = fs.nextInt();
			to.get(a).add(b);
			rto.get(b).add(a);
			c -= P; //コストを辺から引くことで時間を意識しなくてよくなる
			c = -c; //最短経路問題にする
			int t[] = {a, b, c};
			edges.add(t);
		}
		
		//startからたどり着けないノードと、goalにたどり着けないノードを事前に消去する
		reachableFrom1 = new boolean[N];
		reachableToN = new boolean[N];
		dfs(0);
		rdfs(N-1);
		boolean ok[] = new boolean[N];
		for(int i=0;i<N;i++) {
			if(reachableFrom1[i]&&reachableToN[i])ok[i]=true;
		}
		
		//Bellman Ford
		int d[] = new int[N];
		Arrays.fill(d, INF);
		d[0]=0;
		boolean upd = true;
		int loopcnt = 0;
		while(upd) {
			upd = false;
			for(int i=0;i<M;i++) {
				int a = edges.get(i)[0];
				int b = edges.get(i)[1];
				int c = edges.get(i)[2];
				if(!ok[a] || !ok[b])continue;
				int newD = d[a]+c;
				if(newD < d[b]) {
					d[b] = newD;
					upd = true;
				}				
			}
			loopcnt ++;
			if(loopcnt > N+3) {//Nでいいはずだけど余裕を持って
				System.out.println(-1);
				return;
			}
		}
		int ans = Math.max(0, -d[N-1]);
		System.out.println(ans);
		
	}
	static void dfs(int v) {
		if(reachableFrom1[v])return;
		reachableFrom1[v]=true;
		for(int t:to.get(v)) {
			dfs(t);
		}
	}
	static void rdfs(int v) {
		if(reachableToN[v])return;
		reachableToN[v]=true;
		for(int t:rto.get(v)) {
			rdfs(t);
		}
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