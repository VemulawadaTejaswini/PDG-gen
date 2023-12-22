import java.util.*;

public class Main {
	static final int MOD = 1000000007;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int kk = sc.nextInt();
		long[][] dp = new long[h + 1][w];
		dp[0][0] = 1;
		for (int i = 1; i <= h; i++) {
	        for (int k = 0; k < Math.pow(2, w - 1); k++) {
	            boolean[] bars = toBitArray(k, w - 1);
	            if (bars == null) {
	                continue;
	            }
    		    for (int j = 0; j < w; j++) {
		            if (j != 0 && bars[j - 1]) {
		                dp[i][j] += dp[i - 1][j - 1];
		            } else if (j != w - 1 && bars[j]) {
		                dp[i][j] += dp[i - 1][j + 1];
		            } else {
		                dp[i][j] += dp[i - 1][j];
		            }
		            dp[i][j] %= MOD;
		        }
		    }
		}
		System.out.println(dp[h][kk - 1]);
	}
	
	static boolean[] toBitArray(int x, int size) {
	    boolean[] ans = new boolean[size];
	    boolean prev = false;
	    int idx = 0;
	    while (x > 0) {
	        ans[idx] = (x % 2 == 1);
	        if (ans[idx] && prev) {
	            return null;
	        }
	        prev = ans[idx];
	        x /= 2;
	        idx++;
	    }
	    return ans;
	}
	
}
