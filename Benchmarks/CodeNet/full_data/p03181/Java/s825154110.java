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
    static long[][] pre,suff;

	public static void main(String[] args) {
	    n = sc.nextInt();
	    m = sc.nextInt();
	    edges = new ArrayList[n+1];
	    ans = new long[n+1];
	    dp = new long[n+1];
	    pre = new long[n+1][];
	    suff = new long[n+1][];
	    
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
		for(int i=1;i<=edges[v].size();++i) {
			int child = edges[v].get(i-1);
			if(child != par) {
				long vans = mul(pans+1,mul(pre[v][i-1],suff[v][i+1]));
				reroot(child,v,vans);
				val = mul(val,dp[child]+1);
			}
		}
	  ans[v] = val;
		
	}

	private static void dfs(int v, int par) {
		dp[v] = 1;
		long[] p = new long[edges[v].size()+1];
		long[] s = new long[edges[v].size()+2];
		p[0] = 1;
		s[s.length-1] = 1;
		
		for(int i=1;i<=edges[v].size();++i) {
			int child = edges[v].get(i-1);
			if(child != par) {
				dfs(child,v);
				p[i] = mul(p[i-1],dp[child]+1);
				dp[v] = mul(dp[v],dp[child]+1);
			}else p[i] = p[i-1];
		}
		
		for(int i=edges[v].size();i>=1;--i) {
			int child = edges[v].get(i-1);
			if(child != par) {
				s[i] = mul(s[i+1],dp[child]+1);
			}else s[i] = s[i+1];
		}
		
		pre[v] = p;
		suff[v] = s;
	}

	private static long mul(long a, long b) {
		return ((a%m) * (b%m))%m;
	}

	
}

