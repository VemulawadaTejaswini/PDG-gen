import java.io.*;
import java.util.*;

class Main {
	static final long M = 1000000007;

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}

		int[] cs = new int[3];
		long[] dp = new long[n + 1];
		dp[0] = 1;

		for (int i = 0; i < n; i++) {
			int t = 0;
			for (int j = 0; j < 3; j++) {
				if (cs[j] == a[i]) t++;
			}

			for (int j = 0; j < 3; j++) {
				if (cs[j] == a[i]) {
					cs[j]++;
					break;
				}
			}

			dp[i + 1] = (dp[i] * t) % M;
		}

		System.out.println(dp[n]);
	}
}
