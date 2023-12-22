import java.util.* ;

class Main{
	private static long go(int N, int W, Scanner sc) {
		
		/**
		 * dp[i] = Maximum value by having exact weight of i
		 */
		long[] dp = new long[W + 1];
		for (int i = 0; i < N; i++) {
			dp[i] = -1;
			int w = sc.nextInt();
			int v = sc.nextInt();
			for (int existing_wt = W - w; existing_wt >= 0; existing_wt--) {
				dp[existing_wt + w] = Math.max(dp[existing_wt + w], dp[existing_wt] + v);
			}
		}

		long ans = 0;
		for (int i = 0; i < W + 1; i++)
			ans = Math.max(ans, dp[i]);

		return ans;
	}

	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int N, W;
		N = sc.nextInt();
		W = sc.nextInt();
		System.out.println(go(N, W, sc));
	}
}