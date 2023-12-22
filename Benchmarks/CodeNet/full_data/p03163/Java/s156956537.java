

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static Scanner in;
	private static int n;
	private static int W;
	private static int[] w;
	private static int[] v;
	private static long[][] dp;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		n = in.nextInt();
		W = in.nextInt();
		w = new int[n];
		v = new int[n];
		
		for(int i=0; i<n; i++) {
			w[i] = in.nextInt();
			v[i] = in.nextInt();
		}
		dp = new long[n+1][W+1];
		
		for(int i=0; i<dp.length; i++) {
			Arrays.fill(dp[i], -1);
		}
		System.out.println(solve(0, W));

	}
	
	private static long solve(int i, int wLeft) {
//		System.out.println(i+" "+f);
		if (wLeft<0) return -(long)1e15;
		if (i==n) return 0;
		
		if (dp[i][wLeft]!=-1) return dp[i][wLeft];
		
		long ans = 0;
		
		ans = Math.max(ans, solve(i+1, wLeft-w[i])+v[i]);
		ans = Math.max(ans, solve(i+1, wLeft));
		
		return dp[i][wLeft]=ans;
	}

}
