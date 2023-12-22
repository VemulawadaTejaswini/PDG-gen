import java.util.*;
import java.io.*;

class Main {
	static long [][] c = new long [2002][2002];
	static long [] fac = new long [2002]; 
	static final int mod = 924844033;
	static long [][] dp = new long [4002][4002];
	
	public static void main (String[] args) {
		Reader in = new Reader();
		int n = in.nextInt();
		int k = in.nextInt();
		
		fac[0] = 1;
		for(int i = 1; i <= n; i++) {
			fac[i] = fac[i - 1] * i;
			fac[i] %= mod;
		}
		for(int i = 0; i <= n; i++) {
			c[i][0] = 1;
			for(int j = 1; j <= i; j++) {
				c[i][j] = c[i - 1][j - 1] + c[i - 1][j];
				c[i][j] %= mod;
			}
		}
		ArrayList <Integer> chain = new ArrayList <> ();
		for(int i = 1; i <= k; i++) {
			int sz = 0;
			int cur = i;
			while(cur <= n) {
				++sz;
				cur += k;
			}
			chain.add(sz);
			chain.add(sz);
		}
		dp[0][0] = 1;
		for(int i = 1; i <= chain.size(); i++) {
			int sz = chain.get(i - 1);
			for(int j = 0; j <= n; j++) {
				for(int x = 0; x <= Math.min(j, sz); x++) {
					dp[i][j] += dp[i - 1][j - x] * c[sz - x][x];
					dp[i][j] %= mod;
				}
			}
		}
		
		long ans = 0;
		for(int i = 0; i <= n; i++) {
			if(i % 2 == 1) {
				ans -= fac[n - i] * dp[chain.size()][i];
			} else {
				ans += fac[n - i] * dp[chain.size()][i];
			}
			ans %= mod;
		}
		if(ans < 0) ans += mod;
		System.out.println(ans);
	}
	static class Reader {
		private BufferedReader a;
		private StringTokenizer b;
		Reader() {
			a = new BufferedReader (new InputStreamReader (System.in));
		} 
		public String next () {
			while(b == null || !b.hasMoreTokens()) {
				try {
					 b = new StringTokenizer (a.readLine());
				 } catch (IOException e) {
					 e.printStackTrace();
				 }
			 }
			 return b.nextToken();
		}
		public int nextInt () {
		     return Integer.parseInt(next());
		}
		public long nextLong () {
			return Long.parseLong(next());
		}
		public double nextDouble () {
			return Double.parseDouble(next());
		}
		public String nextLine () {
		 	try {
		 		return a.readLine();
		 	} catch (IOException e) {
		 		e.printStackTrace ();
		 	}
		 	return "##";
		}
	}
}
