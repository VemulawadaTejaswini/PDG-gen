import java.util.Arrays;
import java.util.Scanner;

class Main{



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int a = sc.nextInt();
		int[] x = new int[n+1];
		for(int i = 1;i <= n;i++){
			x[i] = sc.nextInt();
		}
		Arrays.sort(x);

		int[][][] dp = new int[51][51][50*50+1];

		
		for(int i = 0;i <= n;i++){
			for(int j = 0;j<= n;j++){
				for(int k = 0;k <= 2500;k++){
					if(i == 0 && j == 0 && k == 0){
						dp[i][j][k] = 1;
						
						
					}else if(i >= 1 && k < x[i]){
						
						dp[i][j][k] = dp[i-1][j][k];
					}else if(i >= 1 && j >= 1 && k >= x[i]){
						
						dp[i][j][k] = dp[i-1][j][k] + dp[i-1][j-1][k-x[i]];
					}else{
						
						dp[i][j][k] = 0;
					}
				}
			}
		}
		
		long ans = 0;
		for(int i = 1;i <= n;i++){
			ans += (long)dp[n][i][i*a];
		}

		System.out.println(ans);

	}
}