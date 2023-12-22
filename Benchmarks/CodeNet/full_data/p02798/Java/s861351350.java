import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		int INF = Integer.MAX_VALUE/2;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		Arrays.setAll(A, i -> sc.nextInt());
		int[] B = new int[N];
		Arrays.setAll(B, i -> sc.nextInt());
		int ans = INF;
		int[][] dp = new int[1<<N][51];
		for(int i = 0; i < 1<<N; i++)
			Arrays.fill(dp[i], INF);
		dp[0][0] = 0;
		for(int S = 0; S < 1<<N; S++) {
			int j = Integer.bitCount(S);
			int c = 0;
			for(int i = 0; i < N; i++) {
				if((S & 1<<i) == 0) {
					int k = (i - j) % 2 == 0 ? A[i] : B[i];
					for(int l = 0; l <= k; l++)
						dp[S|1<<i][k] = Math.min(dp[S|1<<i][k], dp[S][l]+c);
					c++;
				}
			}
		}
		for(int i : dp[(1<<N)-1])
			ans = Math.min(ans, i);
		System.out.println(ans == INF ? -1 : ans);
	}

}
