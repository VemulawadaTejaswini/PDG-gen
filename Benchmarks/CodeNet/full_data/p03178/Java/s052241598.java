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
    static long[][][] dp;
    static int n,d;
    static char[] s;
    
	public static void main(String[] args) {
	
		s = sc.next().toCharArray();
		d = sc.nextInt();
		n = s.length;
		dp = new long[2][d][n+1];
		
		for(int i=0;i<dp.length;++i) {
			for(int j=0;j<dp[i].length;++j) Arrays.fill(dp[i][j], -1);
		}
	    long ans = (f(1,0,0) - 1 + mod)%mod;
	    out.print(ans);
		out.close();
   }

	private static long f(int l, int m, int i) {
		if(i == s.length) {
			if(m == 0) return 1;
			return 0;
		}
		if(dp[l][m][i] != -1) return dp[l][m][i];
		long o1 = 0;
		int end = (l==1)?s[i]-'0':9;
		for(int dig=0;dig<=end;++dig) {
			o1 = (o1 + f(l&((dig == end)?1:0),(m+dig)%d,i+1))%mod;
		}
		return dp[l][m][i] = o1;
	}
	


    }

