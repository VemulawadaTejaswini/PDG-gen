import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int W = sc.nextInt();
		int[] w = new int[N];
		long[] v = new long[N];
		long[][] dp = new long[N][W+1];
		for(int i = 0;i < N;i++){
			w[i] = sc.nextInt();
			v[i] = sc.nextLong();
		}
		Arrays.fill(dp[0],0);
		for(int i = 0;i < N;i++){
			for(int j = 0;j < W + 1;j++){
				if(j > w[i]){
					dp[i + 1][j] = Math.max(dp[i][j - w[i]] + v[i],dp[i][j]);
				}else{
					dp[i + 1][j] = dp[i][j];
				}
			}
		}
		System.out.println(dp[N - 1][W]);
	}
}