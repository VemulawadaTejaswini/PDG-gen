import java.util.*;

public class Main{
	public static void main(String args[]){
		int mod = 1000000007;
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int K = sc.nextInt();
		
		if(W==1){
			System.out.print("1");
			return;
		}
		
		long[][] dp = new long[H+1][W+1];
		dp[0][1] = 1;
		for(int i=2; i<=W; i++){
			dp[0][i] = 0;
		}
		for(int i=1; i<=H; i++){
			dp[i][1] = ((dp[i-1][1]*f(W-2)) + (dp[i-1][2]*f(W-3)))%mod;
			dp[i][W] = ((dp[i-1][W]*f(W-2)) + (dp[i-1][W-1]*f(W-3)))%mod;
			for(int j=1; j<=W-1; j++){
				dp[i][j] = ((dp[i-1][j-1]*f(j-3)*f(W-j-1)) + (dp[i-1][j]*f(j-2)*f(W-j-1)) + (dp[i-1][j+1]*f(j-2)*f(W-j-2)))%mod;
			}
		}
		System.out.print(dp[H][K]);
		return;
	}

	public static int f(int a){
		if(a<0){
			return 1;
		}
		switch(a){
			case 0: return 1;
			case 1: return 2;
			case 2: return 3;
			case 3: return 5;
			case 4: return 8;
			case 5: return 13;
			case 6: return 21;
			case 7: return 34;
			default: return 0;
		}
	}
}