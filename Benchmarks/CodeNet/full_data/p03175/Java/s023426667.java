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
 
	static int mod = (int) (1e9+7),MAX=(int) (3e5);
    static List<Integer>[] edges;
    static Long[][] dp;
    
	public static void main(String[] args) {
	
	    int n = sc.nextInt();
	    dp = new Long[n+1][2];
	    edges = new ArrayList[n+1];
	    for(int i=0;i<edges.length;++i) edges[i] = new ArrayList<>();
	    for(int i=1;i<n;++i) {
	    	int u = sc.nextInt();
	    	int v = sc.nextInt();
	    	edges[u].add(v);
	    	edges[v].add(u);
	    }
	    dfs(1,0);
	    long ans = (dp[1][1] + dp[1][0])%mod;
	    out.print(ans);
		out.close();
   }

	private static void dfs(int v, int par) {
		long o1=1,o2=1;
	    for(int child : edges[v]) {
	    	if(child != par) {
	    		dfs(child,v);
	    		o1 = ((o1%mod) * (dp[child][0]%mod))%mod;
	    		o2=((o2%mod)*(dp[child][0] + dp[child][1]))%mod;
	    	}
	    }
	    dp[v][1] = o1;
	    dp[v][0] = o2;
		
	}

    }

