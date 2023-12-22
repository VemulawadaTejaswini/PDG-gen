import java.util.*;

public class Main {
    static final int MOD = 1000000007;
 	public static void main (String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		int length = arr.length;
		int[][] dp = new int[13][length];
	    for (int i = 0; i < 10; i++) {
	        if (arr[0] == '?' || arr[0] - '0' == i) {
	            dp[i][0] = 1;
	        }
	    }
	    for (int i = 1; i < length; i++) {
	        for (int j = 0; j < 13; j++) {
	            for (int k = 0; k < 10; k++) {
	                if (arr[i] == '?' || arr[i] - '0' == k) {
	                    dp[(j * 10 + k) % 13][i] += dp[j][i - 1];
	                    dp[(j * 10 + k) % 13][i] %= MOD;
	                }
	            }
	        }
	    }
		System.out.println(dp[5][length - 1]);
	}
}
