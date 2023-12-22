import java.util.*;

public class Main {
    static final int MOD = 1000000007;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		int length = arr.length;
		int[][] dp = new int[length + 1][13];
		dp[0][0] = 1;
		for (int i = 1; i <= length; i++) {
		    for (int j = 0; j < 13; j++) {
		        if (arr[i - 1] == '?') {
		            for (int k = 0; k < 10; k++) {
		                dp[i][(j * 10 + k) % 13] += dp[i - 1][j];
		                dp[i][(j * 10 + k) % 13] %= MOD;
		            }
		        } else {
		            dp[i][(j * 10 + arr[i - 1] - '0') % 13] += dp[i - 1][j];
		            dp[i][(j * 10 + arr[i - 1] - '0') % 13] %= MOD;
		        }
		    }
		}
		System.out.println(dp[length][5]);
   }
}
