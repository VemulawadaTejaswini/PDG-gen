import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int MOD = 1000000007;

        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        long[][] dp = new long[r2 + 1][c2 + 1];
        dp[0][0] = 1;
        for(int i = 1; i <= r2; i++)
        	dp[i][0] = 1;
        for(int i = 1; i <= c2; i++)
        	dp[0][i] = 1;

        for(int i = 1; i <= r2; i++) {
        	for(int j = 1; j <= c2; j++)
        		dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % MOD;
        }
        long sum = 0;
        for(int i = r1; i <= r2; i++)
        	for(int j = c1; j <= c2; j++)
        		sum += ((dp[i][j] % MOD) % MOD);
        System.out.println(sum % MOD);
    }
}
