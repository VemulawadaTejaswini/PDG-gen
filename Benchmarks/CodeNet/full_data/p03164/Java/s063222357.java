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
 
	static int mod = (int) (1e9+7),MAX=(int) (2e5);
    static List<Integer>[] edges;
    static long[][] dp;
    static int[] w,v;
	public static void main(String[] args){
	
		 int n = sc.nextInt();
		 long W = sc.nextLong();
		 w = new int[n+1];
		 v = new int[n+1];
		 int totalv = 0;
		 for(int i=0;i<n;++i) {
			 w[i+1] = sc.nextInt();
			 v[i+1] = sc.nextInt();
			 totalv+=v[i+1];
		 }
		 
		 dp = new long[n+1][totalv+1];
		 
		 for(int i=0;i<dp.length;++i) Arrays.fill(dp[i],-1);
		 
		 int ans = 0;
		 for(int vi = 1;vi<=totalv;++vi) {
			 if(f(n,vi) <= W) {
				 ans = vi;
			 }
		 }
		 
		 out.println(ans);
      out.close();
	}
	private static long f(int i, int j) {
		if(i == 0) {
			if(j == 0) return 0;
			else return Integer.MAX_VALUE;
		}
		
		if(dp[i][j] != -1) return dp[i][j];
		long o1 = Integer.MAX_VALUE;
		long o2 = o1;
		if(j-v[i] >= 0) o1 = w[i] + f(i-1,j-v[i]);
		o2 = f(i-1,j);
		return dp[i][j] = Math.min(o1,o2);
	}
	
	
}
