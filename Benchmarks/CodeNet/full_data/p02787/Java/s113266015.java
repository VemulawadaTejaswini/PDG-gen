import java.util.*;

class Main {
	Scanner sc;
	int H, N;
	int[] A, B;
	
	private void calc() {
		sc = new Scanner(System.in);
		H = sc.nextInt();
		N = sc.nextInt();
		A = new int[N];
		B = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
		}
		
		// [hp] : min mp
		int[] dp = new int[H+1];
		dp[0] = 0;
		for (int i = 1; i <= H; i++) {
			dp[i] = Integer.MAX_VALUE;
			for (int j = 0; j < N; j++) {
				dp[i] = Math.min(dp[i], dp[Math.max(0, i-A[j])] + B[j]);
			}
		}
		
		System.out.println(dp[H]);
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}
}
