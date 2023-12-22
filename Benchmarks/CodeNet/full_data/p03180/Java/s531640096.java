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
    static Long[] dp;
    static int n,d;
    static int[][] adj;
    static long[] cost;

	public static void main(String[] args) {
	    n = sc.nextInt();
	    adj = new int[n][n];
	    cost = new long[1<<n];
	    for(int i=0;i<n;++i) {
	    	for(int j=0;j<n;++j)
	    		adj[i][j] = sc.nextInt();
	    }
	    dp = new Long[1<<n];
	    for(int mask=1;mask < 1<<n;++mask) {
	    	cost[mask] = get(mask);
	    }
	    
	    long ans = f((1<<n)-1);
	    out.print(ans);
		out.close();
   }

	private static long get(int mask) {
		long val = 0;
		for(int i=0;i<n;++i) {
			for(int j=i+1;j<n;++j) {
				if(((mask>>i)&1) == 1 && ((mask>>j)&1) == 1)
					val+=adj[i][j];
			}
		}
		return val;
	}

	private static long f(int mask) {
		if(dp[mask] != null) return dp[mask];
		long ans = 0;
		/*
		 * brutforcing some people in group + f(remaining people)
		 * remaining people = mask - submask 
		 */
		for(int submask=mask; submask!=0; submask = (submask-1)&mask)
			ans = Math.max(ans, cost[submask] + f(mask^submask));
		return dp[mask] = ans;
	}
	
}

