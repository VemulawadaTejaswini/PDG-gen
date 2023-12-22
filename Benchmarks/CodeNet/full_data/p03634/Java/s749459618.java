import java.io.*;
import java.util.*;
import java.util.function.*;

public class Main {

	static MyReader sc = new MyReader();
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		solve();
		out.close();
	}

	static void solve() throws IOException {
		int n = sc.nextInt();
		List<Pair>[] list = new ArrayList[n];
		for(int i=0;i<n;i++){
			list[i] = new ArrayList<>();
		}
		for(int i=0;i<n-1;i++){
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			long c = sc.nextInt();
			list[a].add(new Pair(b,c));
			list[b].add(new Pair(a,c));
		}
		int q = sc.nextInt();
		int k = sc.nextInt()-1;
		long dist[] = new long[n];
		dist[k] = 0;
		Queue<Integer> que = new ArrayDeque<>();
		que.add(k);
		boolean[] check = new boolean[n];
		check[k] = true;
		while(!que.isEmpty()){
			int pos = que.poll();
			for(Pair e : list[pos]){
				if(!check[e.getN()]){
					check[e.getN()] = true;
					dist[e.getN()] = dist[pos]+e.getDist();
					que.add(e.getN());
				}
			}
		}
		for(int i=0;i<q;i++){
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			out.println(dist[x]+dist[y]);
		}


	}

	//GCD
	static int GCD(int n, int m) {
		if(m > n)
			return GCD(m, n);
		if(n % m == 0)
			return m;
		else {
			return GCD(m, n % m);
		}
	}

}

class Pair{
	private int v;
	private long dist;

	protected Pair(int n, long c){
		v=n;
		dist=c;
	}

	public int getN(){
		return v;
	}
	public long getDist(){
		return dist;
	}
}

class MyReader {
	private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	private static String[] line = new String[0];
	private static int num = 0;

	protected MyReader() {

	}

	private void nextline() throws IOException {
		String s = in.readLine();
		line = s.split(" ");
	}

	protected String next() throws IOException {
		if(num == line.length) {
			nextline();
			num = 0;
		}
		String ret = line[num];
		num++;
		return ret;
	}

	protected int nextInt() throws IOException {
		if(num == line.length) {
			nextline();
			num = 0;
		}
		int ret = Integer.valueOf(line[num]);
		num++;
		return ret;
	}

	protected long nextLong() throws IOException {
		if(num == line.length) {
			nextline();
			num = 0;
		}
		long ret = Long.valueOf(line[num]);
		num++;
		return ret;
	}

}

// Combination
class Combination {
	public static int MAX = 510000;
	public static int MOD = 1000000007;

	public static long[] f = new long[MAX];
	public static long[] finv = new long[MAX];
	public static long[] inv = new long[MAX];

	protected Combination() {
		f[0] = f[1] = 1;
		finv[0] = finv[1] = 1;
		inv[1] = 1;
		for(int i = 2; i < MAX; i++) {
			f[i] = f[i - 1] * i % MOD;
			inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
			finv[i] = finv[i - 1] * inv[i] % MOD;
		}
	}

	public long Com(int n, int k) {
		if(n < k)
			return 0;
		if(n < 0 || k < 0)
			return 0;
		return f[n] * (finv[k] * finv[n - k] % MOD) % MOD;
	}

	public long Inverse(int n) {
		return inv[n];
	}

	public long Factorial(int n) {
		return f[n];
	}
}

// Graph
class Graph {
	private int n;
	private List<Integer>[] v;
	private int[][] dist;

	protected Graph(int num) {
		n = num;
		v = new ArrayList[n];
		for(int i = 0; i < n; i++) {
			v[i] = new ArrayList<>();
		}
		dist = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i == j)
					dist[i][j] = 0;
				else
					dist[i][j] = 10000000;
			}
		}
	}

	public void Add(int i, int j) {
		v[i].add(j);
		v[j].add(i);
		dist[i][j] = 1;
		dist[j][i] = 1;
	}

	public void Add(int i, int j, int c){
		v[i].add(j);
		v[j].add(i);
		dist[i][j] = c;
		dist[j][i] = c;
	}

	public int BFS(int i, int j) {
		boolean[] check = new boolean[n];
		Arrays.fill(check, false);
		check[i] = true;
		Queue<Integer> queue = new ArrayDeque<>();
		queue.add(i);
		while(!queue.isEmpty()) {
			int tmp = queue.poll();
			for(Integer e : v[tmp]) {
				if(!check[e]) {
					dist[i][e] = dist[i][tmp] + 1;
					queue.add(e);
				}
			}
		}
		return dist[i][j];
	}

	public void WarshalFloyd() {
		for(int k = 0; k < n; k++) {
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
				}
			}
		}
	}

	public int getDist(int i, int j){
		return dist[i][j];
	}

}

// union-find木
class UnionFind {
	private int[] parent;
	private int[] depth;
	private int[] size;

	protected UnionFind(int n) {
		super();
		parent = new int[n];
		for(int i = 0; i < n; i++) {
			parent[i] = i;
		}
		depth = new int[n];
		size = new int[n];
		for(int i = 0; i < n; i++) {
			depth[i] = 1;
			size[i] = 1;
		}
	}

	public int Parent(int n) {
		if(parent[n] == n) {
			return n;
		} else {
			return Parent(parent[n]);
		}
	}

	public void Union(int a, int b) {
		int pa = Parent(a);
		int pb = Parent(b);
		if(pa != pb) {
			if(depth[pa] > depth[pb]) {
				parent[pb] = pa;
				size[pa] += pb;
			} else if(depth[pa] == depth[pb]) {
				parent[pb] = pa;
				size[pa] += pb;
				depth[pa]++;
			} else {
				parent[pa] = pb;
				size[pb] += pa;
			}
		}
	}

	public int Size(int n) {
		return size[Parent(n)];
	}

}
