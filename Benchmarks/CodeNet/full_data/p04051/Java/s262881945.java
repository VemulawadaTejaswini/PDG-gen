import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		final int MAX = 1000;
		final long MOD = (long)1e9+7;
		
		int[][] dp = new int[MAX*4+1][MAX*2+1];
		for(int i=0; i<=MAX*4; i++) {
			dp[i][0] = 1;
			if(i<=MAX*2)
				dp[i][i] = 1;
			for(int j=1; j<=Math.min(i, MAX*2); j++)
				dp[i][j] = (int)((dp[i-1][j-1]+dp[i-1][j])%MOD);
		}
		
		long sum = 0;
		int[][] p = new int[MAX*2+1][MAX*2+1];
		for(int i=0; i<N; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			p[MAX+A][MAX+B]--;
			p[MAX-A][MAX-B]++;
			sum -= dp[A*2+B*2][A*2];
			if(sum<0)
				sum += MOD;
		}
		
		for(int i=0; i<=MAX*2; i++)
			Arrays.fill(dp[i], 0);
		
		for(int i=0; i<=MAX*2; i++) {
			for(int j=0; j<=MAX*2; j++) {
				dp[i][j] = (int)(((i>0 ? dp[i-1][j] : 0) + (j>0 ? dp[i][j-1] : 0) + Math.max(p[i][j],0))%MOD);
				if(p[i][j]<0)
					sum = (sum -(p[i][j]*dp[i][j]))%MOD;
			}
		}
		
		System.out.println(sum%2==0 ? sum/2 : (sum+MOD)/2);
		
		sc.close();
	}
}