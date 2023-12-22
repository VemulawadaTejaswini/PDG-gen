import java.util.Scanner;

public class Main {
	private final static long mod = 1_000_000_007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] a = new int[M];
		long[] dp = new long[N];
		for (int i = 0; i < M; i++) {
			a[i] = sc.nextInt();
			dp[a[i] - 1] = -1;
		}
		sc.close();

		// --test
		// System.out.print("# ");
		// for (int i = 0; i < dp.length; i++) {
		// 	System.out.print(dp[i] + " ");
		// }
		// System.out.println("");
		// --test

		// 最後の段に1を設定
		dp[dp.length - 1] = 1;
		// 最後の1段前が壊れていなければ1を設定
		if (dp[dp.length - 2] == 0) dp[dp.length - 2] = 1;
		// 壊れている段を飛ばして最後の段までのパターンを取得する
		for (int i = dp.length - 3; i >= 0; i--) {
			if (dp[i] == -1) continue;
			// 1段上に行ける場合
			if (dp[i + 1] >= 0) dp[i] += dp[i + 1];
			// 2段上に行ける場合
			if (dp[i + 2] >= 0) dp[i] += dp[i + 2];
			dp[i] %= mod;
		}

		// --test
		// System.out.print("# ");
		// for (int i = 0; i < dp.length; i++) {
		// 	System.out.print(dp[i] + " ");
		// }
		// System.out.println("");
		// --test

		// 結果出力
		long p1 = dp[0] == -1 ? 0 : dp[0];
		long p2 = dp[1] == -1 ? 0 : dp[1];
		System.out.println(p1 + p2);
	}
}
