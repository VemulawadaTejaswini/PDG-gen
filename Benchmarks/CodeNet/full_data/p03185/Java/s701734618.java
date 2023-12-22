

import java.util.Scanner;

public class Main {

	static long mincost(int i, long c, long[] ar, long[] dp) {

		if (i == ar.length - 1)
			return 0;

		if (dp[i] != -1)
			return dp[i];

		long mincost = Long.MAX_VALUE;
		
		for(int index = i + 1; index < ar.length; index++)
			mincost = Math.min(mincost, ((Math.abs(ar[i] - ar[index]) * Math.abs(ar[i] - ar[index])) + c + mincost(index, c, ar, dp)));

		return dp[i] = mincost;
	}

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long c = sc.nextLong();
		long ar[] = new long[n];
		long dp[] = new long[n];

		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextLong();
			dp[i] = -1;
		}

		System.out.println(mincost(0, c, ar, dp));
		sc.close();
	}

}