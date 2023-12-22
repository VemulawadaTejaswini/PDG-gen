import java.util.*;

public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			int N = sc.nextInt();
			int W = sc.nextInt();
			int[] weight = new int[N+1];
			long[] value = new long[N+1];
			weight[0] = 0;
			value[0] = 0;
			for(int i=1;i<=N;i++){
				weight[i] = sc.nextInt();
				value[i] = sc.nextInt();
			}

			long[][] dp = new long[N+1][W+1];
			for(int j=0;j<=W;j++){
				dp[0][j] = 0;
			}

			for(int i=1;i<=N;i++){
				for(int j=0;j<=W;j++){
					if(j-weight[i]<0){
						dp[i][j] = dp[i-1][j];
					}else{
						long dp1 = dp[i-1][j];
						long dp2 = dp[i-1][j-weight[i]]+value[i];
						if(dp1>dp2){
							dp[i][j] = dp1;
						}else{
							dp[i][j] = dp2;
						}
					}
				}
			}
			System.out.println(dp[N][W]);
	}
}
