

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static Scanner in;
	private static int n;
	private static int[] h;
	private static long[] dp;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		n = in.nextInt();
		h = new int[n];
		
		for(int i=0; i<n; i++) {
			h[i] = in.nextInt();
		}
		dp = new long[n+1];
		
		Arrays.fill(dp, -1);
		
		System.out.println(solve(0));
		

	}
	
	private static long solve(int i) {
		if (i==n-1) return 0;
		
		if (dp[i]!=-1) return dp[i];
		
		return dp[i]=Math.min(Math.abs(h[i]-h[i+1])+solve(i+1), 
				(i+2<n?Math.abs(h[i]-h[i+2])+solve(i+2):(long)1e15));
	}

}
