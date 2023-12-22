import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int g_A = sc.nextInt();
		int s_A = sc.nextInt();
		int b_A = sc.nextInt();
		int g_B = sc.nextInt();
		int s_B = sc.nextInt();
		int b_B = sc.nextInt();

		int[] dp = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			dp[i] = i;
			if (g_A <= i) dp[i] = Math.max(dp[i], dp[i - g_A] + g_B);
			if (s_A <= i) dp[i] = Math.max(dp[i], dp[i - s_A] + s_B);
			if (b_A <= i) dp[i] = Math.max(dp[i], dp[i - b_A] + b_B);
		}
		int M = dp[N];
		dp = new int[M + 1];
		for (int i = 1; i <= M; i++) {
			dp[i] = i;
			if (g_B <= i) dp[i] = Math.max(dp[i], dp[i - g_B] + g_A);
			if (s_B <= i) dp[i] = Math.max(dp[i], dp[i - s_B] + s_A);
			if (b_B <= i) dp[i] = Math.max(dp[i], dp[i - b_B] + b_A);
		}

		System.out.println(dp[M]);
	}
}
