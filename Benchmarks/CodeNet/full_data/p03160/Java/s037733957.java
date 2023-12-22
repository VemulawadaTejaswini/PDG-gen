package dp;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for(int i = 0; i < n; i++) {
        	h[i] = sc.nextInt();
        }

        System.out.println(solve(n,h)[n-1]);

    }



	private static int[] solve(int n, int[] h) {
		int[] dp = new int[n];

		dp[0] = 0;
		dp[1] = Math.abs(h[0] - h[1]);
		for(int i = 2; i < n; i++)
			dp[i] = Math.min(dp[i-1]+Math.abs(h[i-1]-h[i]), dp[i-2]+Math.abs(h[i-2]-h[i]));

		return dp;

	}
}