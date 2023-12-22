import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), W = sc.nextInt();
		int item[][] = new int[N][W];
		for(int i=0;i<N;i++) {
			int w = sc.nextInt(), v = sc.nextInt();
			item[i][0] = w;
			item[i][1] = v;
		}
		sc.close();
		int INF = Integer.MAX_VALUE/2;
		int dp[][] = new int[N+1][1000*N+1];
		for(int tmp[]:dp)Arrays.fill(tmp,INF);
		dp[0][0]=0;
		for(int i=0;i<N;i++) {
			int weigh = item[i][0], value = item[i][1];
			for(int j=1000*N-1;j>=0;j--) {
				if(j-value<0)dp[i+1][j]=Math.min(dp[i][j],dp[i+1][j+1]);
				else dp[i+1][j]=Math.min(Math.min(dp[i][j],dp[i][j-value] + weigh),dp[i][j+1]);
			}
		}
		int ans = 0;
		for(int i=0;i<=N;i++) {
			for(int j=0;j<1000*N;j++) {
				if(dp[i][j]<=W)ans = Math.max(ans, j);
			}
		}
		System.out.println(ans);
	}
}
