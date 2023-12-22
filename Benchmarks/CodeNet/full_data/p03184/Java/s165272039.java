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
    static long[] dp,fac,inv;
    static int n,m;
	public static void main(String[] args) {
		fac = new long[MAX+1];
		inv = new long[MAX+1];
		precompute(MAX);
	    int h = sc.nextInt();
	    int w = sc.nextInt();
	    int n = sc.nextInt();
	    Pair[] p = new Pair[n+1];
	    for(int i=0;i<n;++i) {
	    	p[i] = new Pair(sc.nextInt(),sc.nextInt());
	    }
	    p[n] = new Pair(h,w);
	    Arrays.sort(p);
	    dp = new long[n+1]; // paths that goes from top to x,y without blocking
	    for(int i=0;i<=n;++i) {
	    	int x = p[i].x;
	    	int y = p[i].y;
	    	dp[i] = ncr(x+y-2,x-1);
	    	
	    	for(int j=0;j<i;++j) {
	    		int a = p[j].x;
	    		int b = p[j].y;
	    		if(a <= x && b <= y)
	    		dp[i] = (dp[i] - mul(dp[j],ncr(x+y-a-b,x-a)) + mod)%mod;
	    	}
	    }
       out.print(dp[n]);
		out.close();
   }
	static class Pair implements Comparable<Pair>{
		int x;
		int y;
		Pair(int x,int y){
			this.x = x;
			this.y = y;
		}
		@Override
		public int compareTo(Pair o) {
			return (this.x + this.y) - (o.x + o.y);
		}
		
	}
	static void precompute(int n){

		 fac = new long[n+1];
	     inv = new long[n+1];
		 fac[0]=fac[1]=1;
		for(int i=2;i<fac.length;i++)
		{
			fac[i]=fac[i-1]*i;
			fac[i]%=mod;
		}
		
		inv[n]=pow(fac[n],(int) (mod-2));
		for(int i=n-1;i>=0;i--)
		{
			inv[i]=inv[i+1]*(i+1);
			inv[i]%=mod;
		}
	}
	
	 private static long pow(long a, int b) {
			return BigInteger.valueOf(a).modPow(BigInteger.valueOf(b), BigInteger.valueOf(mod)).longValue();
		}
		 
		private static long ncr(int n , int r) {
			return mul(fac[n],inv[r],inv[n-r]);
		}
		
		 private static long mul(long ... a) {
				long ans = 1;
				for(long x : a) ans = ((ans%mod) * (x%mod))%mod;
				return ans;
			}
}

