import java.io.*;
import java.util.*;
 
 class Main {
 
	static long[][] dp;
 
	public static void main(String[] args)  {
 
		Scanner scn = new Scanner(System.in);
 
		int n = scn.nextInt();
 
		int[] a = new int[n];
 
		for (int i = 0; i < n; i++)
			a[i] = scn.nextInt();
 
		long[] dp = new long[n];
 
		dp[n - 1] = 0;
		dp[n - 2] = Math.abs(a[n - 2] - a[n - 1]);
 
		for (int i = n - 3; i >= 0; i--) {
 
			dp[i] = Math.min(dp[i + 1] + Math.abs(a[i] - a[i + 1]), dp[i + 2] + Math.abs(a[i] - a[i + 2]));
		}
 
		System.out.println(dp[0]);
 
	}
 
}
 
 
