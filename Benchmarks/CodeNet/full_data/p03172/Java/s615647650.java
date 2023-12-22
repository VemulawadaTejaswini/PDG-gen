

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static Scanner in;
	
	private static int n;
	private static int k;
	private static int[] a;
	private static long[][] dp;
	private static final int MOD = (int)1e9+7;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		n = in.nextInt();
		k = in.nextInt();
		a =  new int[n];
		for(int i=0; i<n; i++) {
			a[i] = in.nextInt();
		}
		
		dp = new long[n+1][k+1];
		
//		for(int i=0; i<dp.length; i++)
//			Arrays.fill(dp[i], -1);
		
		
		
//		System.out.println(solve(0, n-1, 0));
	
		dp[n][0]=1;
		
		for(int i=n-1; i>=0; i--) {
			long[] prefix = new long[k+1];
			prefix[0] = dp[i+1][0];
			for(int j=1; j<=k; j++) {
				prefix[j] = (prefix[j-1]+dp[i+1][j])%MOD;
			}
			for(int kLeft=0; kLeft<=k; kLeft++) {
				dp[i][kLeft] = (prefix[kLeft]-(kLeft-a[i]-1>=0?prefix[kLeft-a[i]-1]:0)+MOD)%MOD;
			}
			
			
		}
		
		System.out.println(dp[0][k]);
		
	}
	

}
