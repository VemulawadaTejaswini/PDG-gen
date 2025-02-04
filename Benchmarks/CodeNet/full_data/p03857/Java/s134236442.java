import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	static int N,K,L;
	public static void main(String[] args) {
		SC sc = new SC(System.in);
		N=sc.nextInt();
		K=sc.nextInt();
		L=sc.nextInt();
		UnionFind.init(N);
		int[] den=new int[N];
		for(int i=0;i<K; i++) {
			int f=sc.nextInt()-1;
			int t=sc.nextInt()-1;
			UnionFind.unite(f,t);
		}
		for(int i=0; i<N; i++) {
			den[i]=UnionFind.find(i);
		}
		UnionFind.init(N);
		int[] dou=new int[N];
		for(int i=0;i<K; i++) {
			int f=sc.nextInt()-1;
			int t=sc.nextInt()-1;
			UnionFind.unite(f,t);
		}
		for(int i=0; i<N; i++) {
			dou[i]=UnionFind.find(i);
		}
		HashMap<Long,Integer> num = new HashMap<Long,Integer>();
		long[] id=new long[N];
		for(int i=0; i<N; i++) {
			id[i]=((long)(den[i])*((long) N)+((long)(dou[i])));
			if(num.containsKey(id[i])) {
				num.put(id[i], num.get(id[i])+1);
			}
			else {
				num.put(id[i], 1);
			}
		}
		for(int i=0; i<N; i++) {
			if(i<N-1) {
				p(num.get(id[i])+" ");
			}
			else {
				p(num.get(id[i]));
			}
		}
		pl();
	}
	static class UnionFind {
		static int N;			//頂点数
		static int par[];		//親ノード
		static int rank[];		//ランク　UnionFind木の高さがrankみたい
		public static void init(int n) {		//初期化
			N = n;
			par = new int[N];
			rank = new int[N];
			for(int i = 0; i < N; i++) {		//0処理
				par[i] = i;
				rank[i] = 0;
			}
		}
		public static int find(int x) {		//木の根を求める
			if(par[x] == x) {
				return x;
			} else {
				return par[x] = find(par[x]);
			}
		}
		public static void unite(int x, int y) {		//xとyの属する集合を併合	xにyをという意味合いが強そう		集合に含めるときに unite(114,514);のようにするみたい
			x = find(x);
			y = find(y);
			if(x == y) return;
			if(rank[x] < rank[y]) {
				par[x] = y;
			} else {
				par[y] = x;
				if(rank[x] == rank[y]) rank[x]++;
			}
		}
		public static boolean same(int x, int y) {		//x,yが同じ集合に属するか否か
			return find(x) == find(y);
		}
	}
	static class SC {
		private BufferedReader reader = null;
		private StringTokenizer tokenizer = null;
		public SC(InputStream in) {
			reader = new BufferedReader(new InputStreamReader(in));
		}
		public String next() {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			}
			return tokenizer.nextToken();
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new UncheckedIOException(e);
			}
		}
	}
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
	}
}