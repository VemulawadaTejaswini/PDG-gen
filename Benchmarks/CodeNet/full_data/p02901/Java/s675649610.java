import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		int INF = 1000000000;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] dp = new int[1 << N][M+1];
		for(int j = 1; j < 1 << N; j++)
			Arrays.fill(dp[j], INF);
		for(int i = 1; i <= M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int x = 0;
			for(int j = 0; j < b; j++)
				x |= 1<<(sc.nextInt()-1);
			for(int j = 0; j < 1 << N; j++) {
				dp[j][i] = Math.min(dp[j][i-1], dp[j][i]);
				dp[j|x][i] = Math.min(dp[j][i-1]+a, dp[j|x][i]);
			}
		}
		System.out.println(dp[(1 << N) - 1][M] == INF ? -1 : dp[(1 << N) - 1][M]);

	}

}