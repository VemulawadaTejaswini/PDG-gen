import java.util.Scanner;

public class Main {
	static long dp[];

	static long minSteps(int i, int n, int h[], int cost) {
		if (i >= n)
			return Integer.MAX_VALUE;
		else if (i == n - 1)
			return cost;
		long a = Integer.MAX_VALUE;
		if (dp[i] == -1) {
			if (i + 1 < n) {
				a = minSteps(i + 1, n, h, cost + Math.abs(h[i + 1] - h[i]));
			}
			long b = Integer.MAX_VALUE;
			if (i + 2 < n) {
				b = minSteps(i + 2, n, h, cost + Math.abs(h[i + 2] - h[i]));
			}
			return dp[i] = Long.min(a, b);
		} else
			return dp[i];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), h[] = new int[n];
		dp = new long[n];
		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
			dp[i] = -1;
		}
		System.out.println(minSteps(0, n, h, 0));
		sc.close();
	}
}
