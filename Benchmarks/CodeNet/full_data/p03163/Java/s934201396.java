import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int W = sc.nextInt();
		int[] w = new int[N];
		long[] v = new long[N];
		for(int i=0; i<N; i++){
			w[i] = sc.nextInt();
			v[i] = sc.nextLong();
		}
		long[][] dp = new long[N+1][W+1];
		for(int i=1; i<N+1; i++){
			for(int j=1; j<W+1; j++){
				if(j < w[i-1]){
					dp[i][j] = dp[i-1][j];
				}
				else{
					dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w[i-1]] + v[i-1]);
				}
			}
		}
		System.out.println(dp[N][W]);
	}
}