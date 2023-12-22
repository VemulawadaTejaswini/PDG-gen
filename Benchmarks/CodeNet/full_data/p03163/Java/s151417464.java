

import java.util.Scanner;

public class Main {

	static class Knapsack {

		int n, w;
		int wt[];
		long value[];
		long dp[][];

		Knapsack(int n, int w) {

			this.n = n;
			wt = new int[n];
			value = new long[n];

			dp = new long[n][w + 1];

			for (int i = 0; i < n; i++) {
				for (int j = 0; j <= w; j++)
					dp[i][j] = -1L;
			}
		}

		long maxprofit(int i, int j) {
			
			if(i == n || j == 0)
				return 0;
			
			
			if(dp[i][j] != -1L)
				return dp[i][j];
			
			
			if(wt[i] <= j) {
				
				long left = value[i] + maxprofit(i + 1, j - wt[i]);
				long right = maxprofit(i + 1, j);
				
				return dp[i][j] = Math.max(left, right);
			}
			
			else
				return dp[i][j] = maxprofit(i + 1, j);
		}
	}

	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w = sc.nextInt();

		Knapsack a = new Knapsack(n, w);

		for (int i = 0; i < n; i++) {

			a.wt[i] = sc.nextInt();
			a.value[i] = sc.nextLong();
		}

		System.out.println(a.maxprofit(0, w));
		sc.close();
	}

}
