// Frog 2

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
	public static int frogJumpCost2(int[] arr, int n, int k) {
		int[] dp = new int[n];
		dp[n-1] = 0;
		dp[n-2] = Math.abs(arr[n-1]-arr[n-2]);
		for(int i = n-3; i >= 0; i--) {
			int min = Integer.MAX_VALUE;
			for(int j = 1; j <= k && (i+j) < n; j++) {
				int x = dp[i+j]+Math.abs(arr[i]-arr[i+j]);
				if(x < min)
					min = x;
			}
			dp[i] = min;
		}
		return dp[0];
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		String[] s1 = br.readLine().split(" ");

		int n = Integer.parseInt(s[0]);
		int k = Integer.parseInt(s[1]);

		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(s1[i]);
		}

		System.out.println(frogJumpCost2(arr, n, k));

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