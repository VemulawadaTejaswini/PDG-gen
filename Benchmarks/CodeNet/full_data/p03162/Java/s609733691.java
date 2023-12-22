import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N][3];
		int[][] dp = new int[N][3];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		dp[0] = Arrays.copyOf(arr[0],3);
		for(int i = 1; i < N; i++) {
			dp[i][0] = arr[i][0] + Math.max(dp[i-1][1],dp[i-1][2]);
			dp[i][1] = arr[i][1] + Math.max(dp[i-1][0],dp[i-1][2]);
			dp[i][2] = arr[i][2] + Math.max(dp[i-1][0],dp[i-1][1]);
		}
		int ans = 0;
		for(int i = 0; i < 3; i++) {
				ans = Math.max(ans,dp[N-1][i]);
		}
		System.out.println(ans);
	}
}