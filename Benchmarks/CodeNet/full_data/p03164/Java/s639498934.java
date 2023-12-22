

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
    public static List<Integer>[] edges ;
    public static long[][] dp;
    
	public static void main(String[] args) {
	   
	 FastReader sc = new FastReader();
	 int n = sc.nextInt();
	 long W = sc.nextLong();
	 int[] w = new int[n+1];
	 int[] v = new int[n+1];
	 int totalv = 0;
	 for(int i=0;i<n;++i) {
		 w[i+1] = sc.nextInt();
		 v[i+1] = sc.nextInt();
		 totalv+=v[i+1];
	 }
	 
	 long[] dp = new long[totalv+1];
	 Arrays.fill(dp,Integer.MAX_VALUE);
	 dp[0] = 0;
	 for(int i=1;i<=n;++i) {
		 for(int j = totalv;j>=v[i];--j) {
			 dp[j] = Math.min(dp[j],dp[j-v[i]] + w[i]);
		 }
	 }
	
	 int ans = 0;
	 for(int i = 1;i<=totalv;++i) {
		 if(dp[i] <= W) {
			 ans = i;
		 }
	 }
	 
	 out.println(ans);
	 out.close();
	 
    
	}
	
	
    
	

	
}