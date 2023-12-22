import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int W = sc.nextInt();
		int[] w = new int[n];
		int[] v = new int[n];
		for(int i = 0; i < n; i++){
		    w[i] = sc.nextInt();
		    v[i] = sc.nextInt();
		}
		int[][] dp = new int[n][W + 1];
		for(int j = 0; j <= W; j++){
		    if(j - w[0] >= 0){
		        dp[0][j] = v[0];
		    }
		}
		for(int i = 1; i < n; i++){
		    for(int j = 0; j <= W; j++){
		        if(j - w[i] >= 0){
		            dp[i][j] = Math.max(dp[i - 1][j - w[i]] + v[i], dp[i - 1][j]);
		        }else{
		            dp[i][j] = dp[i - 1][j];
		        }
		    }
		}
		System.out.println(dp[n - 1][W]);
	}

}
