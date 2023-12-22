import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

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
				} catch (Exception addd) {
					addd.printStackTrace();
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
			} catch (Exception addd) {
				addd.printStackTrace();
			}
			return str;
		}
	}
	
	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
	
	public static FastReader sc = new FastReader();
 
	static int mod = (int) (1e9+7),MAX=(int) (2e5+100);
    static List<Integer>[] edges;
    static long[] ans,dp;
    static int n,m;

	public static void main(String[] args) {
	    n = sc.nextInt();
	    m = sc.nextInt();
	    edges = new ArrayList[n+1];
	    ans = new long[n+1];
	    dp = new long[n+1];
	    
	    for(int i=0;i<edges.length;++i) edges[i] = new ArrayList<>();
	    for(int i=1;i<n;++i) {
	    	int u = sc.nextInt();
	    	int v = sc.nextInt();
	    	edges[u].add(v);
	    	edges[v].add(u);
	    }
	    
	    dfs(1,0);
	    reroot(1,0,0);
	    for(int i=1;i<=n;++i) out.println(ans[i]);
		out.close();
   }

	private static void reroot(int v, int par, long pans) {
		long val = pans+1;
		for(int child : edges[v]) {
			if(child != par) {
				long vans = (dp[v]/(dp[child]+1))%m;
				vans = (((pans+1)%m)*vans)%m;
				reroot(child,v,vans);
				val = (val%m)*((dp[child]+1)%m);
			}
		}
	  ans[v] = val;
		
	}

	private static void dfs(int v, int par) {
		dp[v] = 1;
		for(int child : edges[v]) {
			if(child != par) {
				dfs(child,v);
				dp[v] = ((dp[v]%m)*((dp[child]+1)%m))%m;
			}
		}
		
	}

	
}

