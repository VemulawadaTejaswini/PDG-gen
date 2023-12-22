import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner(System.in);
//		HashSet<Integer> set = new HashSet<>();
		int n = sc.nextInt(); int m = sc.nextInt();
		int[] p = new int[n+1];
		int[] par = new int[n+1];
		init(par, n+1);
		for(int i=1; i<=n; i++) {
			p[i] = sc.nextInt();
		}
		for(int i=0; i<m; i++) {
//			set.add(sc.nextInt());
//			set.add(sc.nextInt());
			unite(sc.nextInt(), sc.nextInt(), par);
		}
//		HashSet<Integer> pos = new HashSet<>();
//		for(int e : set) {
//			pos.add(p[e]);
//		}
		int cnt = 0;
		for(int i=1; i<=n; i++) {
			if(same(p[i], i, par)) cnt++;
		}
		System.out.println(cnt);
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
