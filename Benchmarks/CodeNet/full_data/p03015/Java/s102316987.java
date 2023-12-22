import java.util.*;

public class Main {
    static int MOD = 1000000007;
    
    public static void main(String[] args) throws Exception {
        // Your code here! 
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c[] = str.toCharArray();
        int n = c.length;
        
        // dp[n][0] + dp[n][1] = n桁までで非0がm個ある数の個数
        int[][] dp = new int[n+1][2];
        dp[0][0] = 1;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < 2; k++) {
                int d = c[i] - '0';
                
                if (k == 0) {
                    if (d == 0) {
                        dp[i+1][0] += dp[i][k];
                    } else {
                        dp[i+1][0] += dp[i][k] * 2;
                        dp[i+1][1] += dp[i][k];
                    }
                } else {
                    if (d == 0) {
                        dp[i+1][1] += dp[i][k] * 3;
                    } else {
                        dp[i+1][1] += dp[i][k] * 3;
                    }
                }
                
                dp[i+1][0] %= MOD;
                dp[i+1][1] %= MOD;
            }
        }
        
        System.out.println(dp[n][0] + dp[n][1]);
    }
}