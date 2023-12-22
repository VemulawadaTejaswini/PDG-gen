import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int W = sc.nextInt();
		int[] w = new int[N];
		int[] v = new int[N];
		int ans = 0;
		for(int i = 0; i < N; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}
		int w1 = w[0]-1;
		for(int i = 0; i < N; i++)
			w[i] -= w1;
		for(int i = 1; i <= N; i++) {
			int wmax = W - w1 * i;
			if(wmax <= 0)
				break;
			int[][][] dp = new int[N+1][wmax+1][2];
			for(int j = 0; j < N; j++) {
				for(int k = 0; k <= wmax; k++) {
					if(k+w[j] <= wmax && dp[j+1][k+w[j]][0] < dp[j][k][0]+v[j] && dp[j][k][1] < i) {
						dp[j+1][k+w[j]][0] = dp[j][k][0] + v[j];
						dp[j+1][k+w[j]][1] = dp[j][k][1] + 1;
					}
					dp[j+1][k][0] = Math.max(dp[j+1][k][0], dp[j][k][0]);
					dp[j+1][k][1] = Math.max(dp[j+1][k][1], dp[j][k][1]);
				}
			}
			int temp = 0;
			for(int j = 0; j <= wmax; j++)
				if(dp[N][j][1] <= i)
					temp = Math.max(temp, dp[N][j][0]);
			ans = Math.max(ans, temp);
		}
		System.out.println(ans);
	}

}