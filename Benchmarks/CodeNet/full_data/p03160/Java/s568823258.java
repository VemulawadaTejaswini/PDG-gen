package com.atcoder.dp;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public int minCost(int N, int[] height) {
		
		if(N<=1) return 0;
		
		int[] dp = new int[N+1];

		dp[0] = 0;
		dp[1] = Math.abs(height[1]-height[0]);
		
		for(int i=2; i<N; i++) {
			dp[i] = Math.min(dp[i-2]+Math.abs(height[i]-height[i-2]), dp[i-1]+Math.abs(height[i]-height[i-1]));
		}
		return dp[N-1];
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
         
		Main obj = new Main();
		int result = obj.minCost(N, arr);
		System.out.println(result);
	}
}
