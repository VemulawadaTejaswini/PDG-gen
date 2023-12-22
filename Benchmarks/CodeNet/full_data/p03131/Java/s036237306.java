import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int K = Integer.parseInt(sc.next());
	static int A = Integer.parseInt(sc.next());
	static int B = Integer.parseInt(sc.next());
	static int Y = (K+1)/(A+2);
//	static long[][] dp = new long[K+1][Y+1];
	static long[] dp = new long[K+1];
	public static void main(String[] args) {
		if (A >= B || Y <= 0) {
			System.out.println(K+1);
			return;
		}
//		long ans = K+1 + (Y * (B-A-2));
//		System.out.println(ans);
//		Arrays.fill(dp[0], 1);
//		Arrays.fill(dp[1], 2);
		dp[0] = 1; dp[1] = 2;
		for (int k = 0; k < K-1; k++) {
//			for (int j = Y-1; j >= 0; j--) {
//				System.out.println`(dp[k][j]);
//			dp[k+2][0] = Math.max(dp[k+1][0] + 1, dp[k][0]+B-A);
			dp[k+2] = Math.max(dp[k+1] + 1, dp[k]+B-A-1);
//			}
		}
		System.out.println(dp[K]);
	}
}