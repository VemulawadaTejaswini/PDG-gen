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
    static long[][] dp = new long[3010][3010];
    static int n,d;
    static char[] s;
    /*
     * dp(i,remain,small,greater)-> dp(i,g)-> remain = N-i+1, remain = small + greater
     * for "<" dp(i,g) => for(j 1..g) sum of dp(i+1,g-j)
     * for ">" dp(i,g) => for(j 0..s-1) sum of dp(i+1,g+j) 
     * Time is O(n^3)
     * 
     * for O(n^2)
     * expand dp(i,g+1) then we can see relation 
     * for "<" dp(i,g+1) => dp(i,g) + dp(i+1,g)
     * for ">" dp(i,g+1) => dp(i,g) - dp(i+1,g)
     */
	public static void main(String[] args) {
	
		int n=sc.nextInt();
		char s[]=("#"+sc.next()).toCharArray();
		
		// for last pos -> if we have 0 greater than only 1 smaller is left
		// or for 1 greater 0 smaller is left
		
		dp[n][0] = (s[n-1]=='>')?1:0;
		dp[n][1] = (s[n-1]=='<')?1:0;
		
		
		for(int i=n-1;i>=2;i--){
			int tot=n-i+1;
			for(int g=0;g<=tot;g++){
				if(g == 0){
					dp[i][g]=0;
					if(s[i-1] == '<')	continue;
					for(int j=1;j<=tot;j++) dp[i][g] = (dp[i][g] + dp[i+1][tot-j])%mod;
					
				}else{
					
					if(s[i-1] == '<') dp[i][g] = (dp[i][g-1] + dp[i+1][g-1])%mod;
					else dp[i][g] = (dp[i][g-1] - dp[i+1][g-1] + mod)%mod;	
				}
			}
			
		}
		long ans=0;
		for(int i=1;i<=n;i++)
			ans=(ans+dp[2][n-i])%mod;
		
	    out.println(ans);
		out.close();
   }
	
}

