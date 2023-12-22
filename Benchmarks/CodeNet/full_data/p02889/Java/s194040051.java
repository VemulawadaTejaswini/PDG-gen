import java.io.*;
import java.util.*;

public class Main{
	public static class FastReader {
		BufferedReader br;
		StringTokenizer root;
		
 
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
 
		String next() {
			while (root == null || !root.hasMoreTokens()) {
				try {
					root = new StringTokenizer(br.readLine());
				} catch (Exception r) {
					r.printStackTrace();
				}
			}
			return root.nextToken();
		}
 
		int nextInt() {
			return Integer.parseInt(next());
		}
 
		double nextDouble() {
			return Double.parseDouble(next());
		}
 
		long nextLong() {
			return Long.parseLong(next());
		}
 
		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (Exception r) {
				r.printStackTrace();
			}
			return str;
		}
	}
	
	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
	static long mod = (long) (1e9+7);
	static long cf = 998244353;
    static final long MAX = (long) 1e15;
   // public static List<Integer>[] edges;
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int m = sc.nextInt();
		long l = sc.nextLong();
		long[][] dis = new long[n][n];
		for(int i=0;i<n;++i) {
			for(int j=0;j<n;++j) {
				dis[i][j] = i == j ? 0 : MAX;
			}
		}
		
		for(int i=0;i<m;++i) {
			int u = sc.nextInt()-1;
			int v = sc.nextInt()-1;
			int w = sc.nextInt();
			dis[u][v] = dis[v][u] = w;
		}
		
		for(int k = 0;k<n;++k) {
			for(int i=0;i<n;++i) {
				for(int j=0;j<n;++j) 
					dis[i][j] = Math.min(dis[i][j],dis[i][k] + dis[k][j]);
			}
		}
		
		
		for(int i=0;i<n;++i) {
			for(int j=0;j<n;++j) {
				if(dis[i][j] <= l) dis[i][j] = 1;
				else dis[i][j] = MAX;
				if(i == j) dis[i][j] = 0;
			}
		}
		
		for(int k = 0;k<n;++k) {
			for(int i=0;i<n;++i) {
				for(int j=0;j<n;++j) 
					dis[i][j] = Math.min(dis[i][j],dis[i][k] + dis[k][j]);
			}
		}
		int q = sc.nextInt();
		while(q-->0) {
			int s = sc.nextInt()-1;
			int t = sc.nextInt()-1;
			if(dis[s][t] >= MAX) out.println(-1);
			else out.println(dis[s][t]-1);
		}
		out.close();
	}
}