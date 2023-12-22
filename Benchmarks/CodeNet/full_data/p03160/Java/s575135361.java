package a_Frog1;

import java.util.Scanner;

public class Main {

	static int n = 0;
	static Long[] dp = new Long[10010];
	static Long[] h = new Long[10010];
	static final Long INF = 1010L;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			h[i] = Long.parseLong(sc.next());
		}

		for (int i = 0; i < 10010; i++) {
			dp[i] = INF;
		}

		System.out.println(rec(n - 1));

		sc.close();
	}

	private static Long chmin(Long a, Long b) {
		if (a > b) {
			return b;
		}
		return a;
	}

	private static Long rec(int i) {

		if (dp[i] < INF) {
			return dp[i];
		}
		if (i == 0) {
			return 0L;
		}

		Long res = INF;

		res = chmin(res, rec(i - 1) + Math.abs(h[i] - h[i - 1]));

		if (i > 1) {
			res = chmin(res, rec(i - 2) + Math.abs(h[i] - h[i - 2]));
		}

		return dp[i] = res;

	}

}
