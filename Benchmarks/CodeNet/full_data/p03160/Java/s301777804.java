package AtCoderDP_Problems;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println(solve(arr, n));
	}

	public static int solve(int[] arr, int n) {

		int[] dp = new int[n];
		dp[0] = 0;
		for (int i = 1; i < dp.length; i++) {

			int option1 = Math.abs(arr[i] - arr[i - 1]) + dp[i - 1];
			int option2 = (i == 1) ? Integer.MAX_VALUE : Math.abs(arr[i] - arr[i - 2]) + dp[i - 2];

			dp[i] = Math.min(option1, option2);
		}
		return dp[n - 1];

	}

}
