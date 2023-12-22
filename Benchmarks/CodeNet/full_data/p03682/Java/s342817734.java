import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner(System.in);
		int n = sc.nextInt();
		Pair[] x = new Pair[n];
		Pair[] y = new Pair[n];
		for(int i=0; i<n; i++) {
			int _x = sc.nextInt(); int _y = sc.nextInt();
			x[i] = new Pair(_x, i); y[i] = new Pair(_y, i);
		}
		Arrays.sort(x, new Comparator<Pair>() {
			public int compare(Pair p1, Pair p2) {
				return p1.fst - p2.fst;
			}
		});
		Arrays.sort(y, new Comparator<Pair>() {
			public int compare(Pair p1, Pair p2) {
				return p1.fst - p2.fst;
			}
		});
		Edge[] es = new Edge[2*n-2];
		for(int i=1; i<n; i++) {
			es[i-1] = new Edge(x[i-1].snd, x[i].snd, Math.abs(x[i].fst-x[i-1].fst));
			es[i-1+n-1] = new Edge(y[i-1].snd, y[i].snd, Math.abs(y[i-1].fst-y[i].fst));
		}
		Arrays.sort(es, new Comparator<Edge>() {
			public int compare(Edge e0, Edge e1) {
				long w0 = e0.w; long w1 = e1.w;
				if(w0>w1) {
					return 1;
				} else if(w0==w1) {
					return 0;
				} else {
					return -1;
				}
			}
		});
		int[] par = new int[n];
		init(par, n);
		int cnt = 0;
		int ans = 0;
		for(int i=0; i<2*n-2&&cnt<n; i++) {
			Edge e = es[i];
			int from = e.from; int to = e.to; 
			if(same(from, to, par)) {
				;
			} else {
				ans += e.w;
				cnt++;
				unite(from, to, par);
			}
		}
		System.out.println(ans);
	}
	
	static void init(int[] par, int n) {
		for(int i=0; i<n; i++) par[i] = i;
	}
	
	static int root(int x, int[] par) {
		if(par[x] == x) return x;
		return par[x] = root(par[x], par);
	}
	
	static boolean same(int x, int y, int[] par) {
		return root(x, par) == root(y, par);
	}
	
	static void unite(int x, int y, int[] par) {
		x = root(x, par);
		y = root(y, par);
		if(x == y) return;
		par[x] = y;
	}
	
	static class Pair {
		int fst; int snd;
		Pair(int _f, int _s) {
			fst = _f; snd = _s;
		}
	}
	
	static class Edge {
		int from; int to; long w;
		Edge(int _f, int _t, long _w) {
			from = _f; to = _t; w = _w;
		}
	}

	static class MyScanner
	{
		BufferedReader br;
		StringTokenizer st;
		public MyScanner(InputStream s)
		{
			br=new BufferedReader(new InputStreamReader(s));
		}
		public String nextLine() throws IOException
		{
			return br.readLine();
		}
		public String next() throws IOException
		{
			while(st==null || !st.hasMoreTokens())
				st=new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		public int nextInt() throws IOException
		{
			return Integer.parseInt(next());
			
		}
		public double nextDouble() throws IOException
		{
			return Double.parseDouble(next());
		}
		public boolean ready() throws IOException
		{
			return br.ready();
		}
		public long nextLong() throws IOException
		{
			return Long.parseLong(next());
		}
	}
}