
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in) ;
	public static void main(String[]args) {
		Main m = new Main();
		m.run();
	}
	
	long MOD = 998244353;
	
	void run() {
		String s = sc.next();
		int n = s.length();
		
		int b[] = new int[n];
		int r[] = new int[n];
		for(int i = 0; i < n; i++) {
			b[i] = s.charAt(i) - '0';
			r[i] = 2 - b[i];
		}
		
		
		int bb[] = new int[n+1];
		int rr[] = new int[n+1];
		
		for(int i = 0 ; i < n ; i++) {
			bb[i + 1] = bb[i] + b[i];
			rr[i + 1] = rr[i] + r[i];
		}
		
		
		long dp[][] = new long[n+1][n+1];
		dp[0][0] = 1;
		
		for(int i = 0 ; i < n ; i++) {

			for(int rc = 0; rc <= i ; rc++) {
				int bc = i-rc;
				
				if(rr[i+1] >= rc+1) {
					dp[rc+1][bc] += dp[rc][bc];
				}
				if(bb[i+1] >= bc+1) {
					dp[rc][bc+1] += dp[rc][bc];
				}
			}

		}
		

		long res = 0;
		for(int rc = 0 ; rc <= n ; rc++) {
			int bc = n - rc;
			res = nCr(n, rr[n] - rc)
					.multiply( BigInteger.valueOf(dp[rc][bc]))
					.add(BigInteger.valueOf(res))
					.mod(BigInteger.valueOf(MOD))
					.longValue();
		}
		System.out.println(res);
	}
	
	BigInteger[][] ncr = new BigInteger[2001][2001];
//	long[][] ncr = new long[2001][2001];

	BigInteger nCr(int n, int r) {
		if(r > n || r < 0) {
			return BigInteger.ZERO;
		}
		if(n == r || r == 0) {
			return BigInteger.ONE;
		}
		if(r == 1 || r == n-1) {
			return BigInteger.valueOf(n);
		}
		if(ncr[n][r] != null) {
			return ncr[n][r];
		}
		
		ncr[n][r] = (nCr(n-1,r).add(nCr(n-1,r-1)));
		return ncr[n][r] ;
	}
}
