

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;
import java.util.Stack;

public class Main {
	
	public static class FastReader {
		BufferedReader br;
		StringTokenizer st;
	

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (Exception r) {
					r.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());//converts string to integer
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
   
  // static Scanner sc = new Scanner(System.in);
  
    private final static int mod = (int) (1e9 + 7);
    private final static int N = (int) (1e6);
	public static void main(String[] args) {
	   
	 FastReader sc = new FastReader();
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] h = new int[n];
		for(int i=0;i<n;++i) h[i] = sc.nextInt();
		int[] dp = new int[n];
		dp[0] = 0;
		
		for(int i=1;i<n;++i) {
			int best = Integer.MAX_VALUE;
			for(int j=i-1;j>=Math.max(0,i-k);--j)
			    best = Math.min(best,dp[j] + Math.abs(h[j]-h[i]));
				
				dp[i] = best;
		}
		out.print(dp[n-1]);
	 out.close();
    
	}

	private static long pow(long a, int b) {
		if(b == 0) return 1;
		long temp = pow(a,b/2);
		temp = (temp*temp)%mod;
		if((b&1) == 1) temp = (a*temp)%mod;
		return temp;
	}
}