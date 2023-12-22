import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
		}

		int[] dp = new int[H + 1];
		Arrays.fill(dp, Integer.MAX_VALUE);

		dp[0] = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= H; j++) {
				if (j - A[i] <= 0) {
					dp[j] = Math.min(dp[j], B[i]);
					continue;
				}

				if (dp[j - A[i]] == Integer.MAX_VALUE) continue;
				dp[j] = Math.min(dp[j], dp[j - A[i]] + B[i]);
			}
		}

		System.out.println(dp[H]);
	}
}
