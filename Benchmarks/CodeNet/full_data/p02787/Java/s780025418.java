import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int N = sc.nextInt();
		int A[][] = new int[N][2];
		int max_A = 0;
		for(int i = 0; i < N; i++) {
			A[i][0] = sc.nextInt();
			A[i][1] = sc.nextInt();
			max_A = Math.max(max_A, A[i][0]);
		}
		
		int dp[][] = new int[N + 1][H + max_A + 1];
		for(int i = 0; i < N + 1; i++) {
			Arrays.fill(dp[i], Integer.MAX_VALUE / 100);
		}
		dp[0][0] = 0;
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < H + max_A; j++) {
				if(A[i][0] <= j) {
					dp[i + 1][j] = Math.min(dp[i][j], dp[i + 1][j - A[i][0]] + A[i][1]);
				} else {
					dp[i + 1][j] = dp[i][j];
				}
			}
		}
		
		int ans = Integer.MAX_VALUE;
		for(int i = H; i < H + max_A; i++) {
			ans = Math.min(dp[N][i], ans);
		}
		System.out.println(ans);
	}
}
