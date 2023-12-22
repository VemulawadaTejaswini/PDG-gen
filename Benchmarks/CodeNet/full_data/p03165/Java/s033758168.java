

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
	 char[] s = sc.next().toCharArray();
	 char[] t = sc.next().toCharArray();
	 int[][] dp = new int[s.length+1][t.length+1];
	 for(int i=1;i<=s.length;++i) {
		 for(int j=1;j<=t.length;++j) {
			 if(s[i-1] == t[j-1]) {
				 dp[i][j] = dp[i-1][j-1] + 1;
			 }else {
				 dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
			 }
		 }
	 }
	 StringBuilder sb = new StringBuilder();
	 int i = s.length,j = t.length;
	 while(i > 0 && j > 0) {
		 if(s[i-1] == t[j-1]) {
			 sb.append(s[i-1]);
			 --i; --j;
		 }else if(dp[i-1][j] > dp[i][j-1]){
			 --i;
		 }else --j;
	 }
	 sb.reverse();
	 
	 out.print(sb);
	 out.close();
	 
    
	}
	
	
    
	

	
}