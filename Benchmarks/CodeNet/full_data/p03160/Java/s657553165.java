import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] h = new int[N + 1];
		for(int i = 0; i < N; i++) {
			h[i + 1] = sc.nextInt();
		}
		sc.close();
		if(N == 2) {
			System.out.println(Math.abs(h[2] - h[1]));
			System.exit(0);
		}
		long[] dp = new long[N + 1];
		for(int i = 1; i < N; i++) {
			if(i == 1) {
				dp[2] = Math.abs(h[2] - h[1]);
				dp[3] = Math.abs(h[3] - h[1]);
			}else if(i == N - 1) {
				long t = dp[N - 1] + Math.abs(h[N] - h[N - 1]);
				dp[N] = Math.min(dp[N], t);
			}else {
				dp[i + 2] = dp[i] + Math.abs(h[i + 2] - h[i]);
				long t = Math.abs(h[i + 1] - h[i]);
				dp[i + 1] = Math.min(dp[i + 1], t);
			}
		}
		System.out.println(dp[N]);
	}
}