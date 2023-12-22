

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static Scanner in;
	
	private static int n;
	private static int[] a;
	private static long[][] dp;
	private static final int MOD = (int)1e9+7;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		n = in.nextInt();
		a =  new int[n];
		for(int i=0; i<n; i++) {
			a[i] = in.nextInt();
		}
		
		dp = new long[n+1][n+1];
		
		for(int i=0; i<dp.length; i++)
			Arrays.fill(dp[i], -1);
		
		System.out.println(solve(0, n-1));
		
	}
	
	
	private static long solve(int l, int r) {
		if (l>=r) return 0;
		
		if (dp[l][r]!=-1) return dp[l][r];
		
		
		long sum = 0;
		for(int i=l; i<=r; i++) sum+=a[i];
		
		long ans = (long)1e15;
		for(int i=l; i<r; i++) {
			ans = Math.min(ans, solve(l, i)+solve(i+1, r)+sum);
		}
		
		return dp[l][r]=ans;
	}

}
