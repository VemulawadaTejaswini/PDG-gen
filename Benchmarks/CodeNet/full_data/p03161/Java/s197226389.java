import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
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
		long INF = 100000000000l;
		for(int i = 2; i <= N; i++) {
			dp[i] = INF;
		}
		for(int i = 1; i < N; i++) {
			for(int j = 1; j <= K; j++) {
				if(i + j >= N + 1) break;
				long t = dp[i] + Math.abs(h[i + j] - h[i]);
				dp[i + j] = Math.min(dp[i + j], t);
			}
		}
		System.out.println(dp[N]);
	}
}