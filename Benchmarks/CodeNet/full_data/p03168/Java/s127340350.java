import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] p = new double[n];
		for(int i=0; i<n; i++){
			p[i] = sc.nextDouble();
		}
		double[][] dp = new double[n+1][n+1];
		dp[0][0] = 1;
		for(int i=1; i<n+1; i++){
			for(int j=0; j<i+1; j++){
				if(j == 0){
					dp[i][j] = dp[i-1][j] * (1 - p[i-1]);
				}
				else{
					dp[i][j] = dp[i-1][j-1] * p[i-1] + dp[i-1][j] * (1 - p[i-1]);
				}
			}
		}
		double ans = 0;
		for(int i=n/2+1; i<n+1; i++){
			ans += dp[n][i];
		}
		System.out.println(ans);
	}
}