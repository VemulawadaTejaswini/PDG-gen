
import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.Map.Entry;
import java.util.Stack;


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
 
	static int mod = (int) (998244353);
	static List<Integer>[] edges ;
	//static long[] dp;
	
	final static int MAX = Integer.MAX_VALUE/10 ;

	public static void main(String[] args) {
		  
		int n = sc.nextInt();
		int m = sc.nextInt();
        int[][] tab = new int[n+1][m+1];
        for(int i=1;i<=n;++i) {
        	char[] s = sc.next().toCharArray();
        	for(int j=1;j<=m;++j) {
        		if(s[j-1] == '#') tab[i][j] = 1;
        	}
        }
        int[][] dp = new int[n+1][m+1]; // min number of contigous block of black cells
        for(int i=1;i<=n;++i) dp[i][0] = MAX;
        for(int j=1;j<=m;++j) dp[0][j] = MAX;
       
        dp[1][1] = tab[1][1];
        
        for(int i=1;i<=n;++i) {
            for(int j=1;j<=m;++j) {
                if(i==1 && j==1) continue;
                int up = dp[i-1][j];
                int down = dp[i][j-1];
                if(tab[i][j]!=0 && tab[i-1][j] == 0) up++;
                if(tab[i][j]!=0 && tab[i][j-1] == 0) down++;
                dp[i][j] = Math.min(up,down);
            }
        }
       out.print(dp[n][m]);
	out.close();
}
	
}

