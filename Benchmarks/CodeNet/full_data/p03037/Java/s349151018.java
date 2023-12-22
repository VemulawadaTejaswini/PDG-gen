package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] L = new int[M + 1];
		int[] R = new int[M + 1];
		for (int i = 1; i < R.length; i++) {
			L[i] = sc.nextInt();
			R[i] = sc.nextInt();

		}
		int[] dp = new int[N+1];
		for (int i = 1; i < R.length; i++) {
			dp[L[i]]++;
			if(i+1<R.length) {
				dp[R[i+1]]--;
			}
		}
		int res = 0;
		for (int i = 1; i < dp.length; i++) {
			dp[i] = dp[i - 1] + dp[i];
			if (dp[i] == M) {
				res++;
			}
		}
		System.out.println(res);

	}
}