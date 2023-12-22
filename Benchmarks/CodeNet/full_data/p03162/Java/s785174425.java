//package sportprogramming;

import java.util.Scanner;

public class Main {
	
	public static void A() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(n == 0) {
			System.out.println(0);
			return;
		}
		int[] height = new int[n];
		for(int i = 0; i < n; i++) {
			height[i] = s.nextInt();
		}
		int[] dp = new int[n];
		dp[dp.length - 1] = 0;
		for(int i = dp.length - 2; i >= 0; i--) {
			dp[i] = Integer.MAX_VALUE;
			for(int j = 1; j <= 2; j++) {
				if(j + i < n) {
					dp[i] = Math.min(dp[i + j] + Math.abs(height[i] - height[i + j]), dp[i]);
				}
			}
		}
		System.out.println(dp[0]);
	}
	
	public static void B() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(n == 0) {
			System.out.println(0);
			return;
		}
		int k = s.nextInt();
		int[] height = new int[n];
		for(int i = 0; i < n; i++) {
			height[i] = s.nextInt();
		}
		int[] dp = new int[n];
		dp[dp.length - 1] = 0;
		for(int i = dp.length - 2; i >= 0; i--) {
			dp[i] = Integer.MAX_VALUE;
			for(int j = 1; j <= k; j++) {
				if(j + i < n) {
					dp[i] = Math.min(dp[i + j] + Math.abs(height[i] - height[i + j]), dp[i]);
				}
			}
		}
		System.out.println(dp[0]);
	}
	
	public static void C() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		long[][] arr = new long[n][3];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 3; j++) {
				arr[i][j] = s.nextLong();
			}
		}
		
		if(n == 0) {
			System.out.println(0);
			return;
		}
		
		long[][] dp = new long[n][3];
		dp[n - 1][0] = Math.max(arr[n - 1][1], arr[n - 1][2]);
		dp[n - 1][1] = Math.max(arr[n - 1][0], arr[n - 1][2]);
		dp[n - 1][2] = Math.max(arr[n - 1][0], arr[n - 1][1]);
		
		for(int i = n - 2; i >= 0; i--) {
			dp[i][0] = arr[i][0] + Math.max(dp[i + 1][1], dp[i + 1][2]);
			
			dp[i][1] = arr[i][1] + Math.max(dp[i + 1][0], dp[i + 1][2]);
			
			dp[i][2] = arr[i][2] + Math.max(dp[i + 1][1], dp[i + 1][0]);
		}
		
		System.out.println(Math.max(dp[0][0], Math.max(dp[0][1], dp[0][2])));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C();
	}

}
