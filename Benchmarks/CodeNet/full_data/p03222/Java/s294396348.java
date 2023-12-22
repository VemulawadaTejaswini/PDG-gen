import java.util.*;

public class Main {
    static final int MOD = 1000000007;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int kk = sc.nextInt();
		int[][] dp = new int[h + 1][w];
		dp[0][0] = 1;
		for (int i = 1; i <= h; i++) {
		    for (int j = 0; j < (1 << (w - 1)); j++) {
		        boolean flag = true;
		        for (int k = 0; k < w - 2; k++) {
		            if ((j & (1 << k)) != 0 && (j & (1 << (k + 1))) != 0) {
		                flag = false;
		                break;
		            } 
		        }
		        if (!flag) {
		            continue;
		        }
		        for (int k = 0; k <= w - 1; k++) {
		            if (k == 0) {
		                if ((j & (1 << k)) != 0) {
		                    dp[i][k] += dp[i - 1][k + 1];
		                } else {
		                    dp[i][k] += dp[i - 1][k];
		                }
		            } else if (k == w - 1) {
		                if ((j & (1 << (k - 1))) != 0) {
		                    dp[i][k] += dp[i - 1][k - 1];
		                } else {
		                    dp[i][k] += dp[i - 1][k];
		                }
		            } else {
		                if ((j & (1 << k)) != 0) {
		                    dp[i][k] += dp[i - 1][k + 1];
		                } else if ((j & (1 << (k - 1))) != 0) {
		                    dp[i][k] += dp[i - 1][k - 1];
		                } else {
		                    dp[i][k] += dp[i - 1][k];
		                }
		            }
		            dp[i][k] %= MOD;
		        }
		    }
		}
		System.out.println(dp[h][kk - 1]);
    }
}

