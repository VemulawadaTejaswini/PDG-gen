import java.util.*;
public class Main {
	
	public static int[][] lenearsum(int numval, int sum) {
		int sep = (int)Math.pow(10, 9)+7;
		int[][] dp = new int[numval+1][sum+1];
		for(int i=0;i<sum+1;i++) {
			dp[1][i] = 1;
		}
		for(int i=2;i<numval+1;i++) {
			for(int n=0;n<sum+1;n++) {
				if(n==0) dp[i][n] = 1;
				else dp[i][n] = ((dp[i][n-1])%sep+(dp[i-1][n])%sep)%sep;
			}
		}
		return dp;
	}
	
	public static void calci(int K, int N, int i, int[][] dp) {
		int sep = (int)Math.pow(10, 9)+7;
		if(N-K-(i-1)<0) {
			System.out.println(0);
			return;
		}
		long ret = 1;
		ret *= dp[i][K-i];
		ret %= sep;
		ret *= dp[i+1][N-K-(i-1)];
		ret %= sep;
		System.out.println(ret);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[][] dp = lenearsum(k+1,n+1);
		for(int i=1;i<=k;i++) {
			calci(k,n,i,dp);
		}
	}
}
