// Frog 1

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
	public static int frogJumpCost(int[] arr, int n) {
		int[] dp = new int[n];
		dp[n-1] = 0;
		dp[n-2] = Math.abs(arr[n-1]-arr[n-2]);
		for(int i = n-3; i >= 0; i--) {
			dp[i] = min(dp[i+1]+Math.abs(arr[i]-arr[i+1]), dp[i+2]+Math.abs(arr[i]-arr[i+2]));
		}
		return dp[0];
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split(" ");

		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}

		System.out.println(frogJumpCost(arr, n));

	}
	public static int min(int...arr) {
		int min = Integer.MAX_VALUE;
		for(int i: arr) {
			if(i < min)
				min = i;
		}
		return min;
	}
}