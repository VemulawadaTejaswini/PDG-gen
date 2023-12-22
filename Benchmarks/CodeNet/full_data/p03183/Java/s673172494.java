import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		long[][] wsv = new long[n][3];
		for (int i = 0; i < n; i++) {
			long w = sc.nextLong();
			long s = sc.nextLong();
			long v = sc.nextLong();
			wsv[i][0] = w;
			wsv[i][1] = s;
			wsv[i][2] = v;
		}

		Arrays.sort(wsv, Comparator.comparingLong(a -> a[0] + a[1]));

		long[] dp = new long[20001];
		for (int i = 1; i <= n; i++) {
			for (int j = (int) wsv[i - 1][1]; j >= 0; j--) {
				dp[j + (int) wsv[i - 1][0]] = Math.max(
						dp[j + (int) wsv[i - 1][0]], dp[j] + wsv[i - 1][2]);
			}
		}

		long answer = 0;
		for (int i = 0; i < 20001; i++) {
			answer = Math.max(answer, dp[i]);
		}

		System.out.println(answer);
	}
}
