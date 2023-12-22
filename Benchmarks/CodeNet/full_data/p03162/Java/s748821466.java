import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double[][] a = new double[n+1][3];
		for(int i=1;i<=n;i++) {
			for(int j=0;j<3;j++) {
				a[i][j] = in.nextInt();
			}
		}
		double[][][] dp = new double[n+1][3][3];
		for(int i=1;i<=n;i++) {
			for(int j=0;j<3;j++) {
				dp[i][j][0] = Math.max(Math.max(dp[i-1][j][2], dp[i-1][(j-1+3)%3][2])+a[i][(j+1+3)%3], Math.max(dp[i-1][(j+1+3)%3][2],dp[i-1][j][2])+a[i][(j-1+3)%3]);
				dp[i][j][1] = Math.max(0, dp[i-1][j][0]+a[i][j]);
				dp[i][j][2] = Math.max(0, dp[i-1][j][1]+a[i][j]);
				/*
				System.out.println(j+":");
				for(int k=0;k<3;k++) {
					System.out.print(dp[i][j][k]+" ");
				}
				System.out.println();
				*/
			}
		}
		System.out.println((int)Math.max(dp[n][0][1], Math.max(dp[n][1][1], dp[n][2][1])));
	}
}