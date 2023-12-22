import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] p = new double[n], q = new double[n];
        for(int i = 0; i < n; i++){
            p[i] = sc.nextDouble();
            q[i] = 1 - p[i];
        }
        double[][] dp = new double[n][n + 1];
        dp[0][0] = q[0];
        dp[0][1] = p[0];
        for(int i = 1; i < n; i++){
            dp[i][0] = dp[i-1][0] * q[i];
            dp[i][i+1] = dp[i-1][i] * p[i];
            for(int j = 1; j <= i; j++){
                dp[i][j] = dp[i-1][j] * q[i] + dp[i-1][j-1] * p[i];
            }
        }
        double ans = 0;
        for(int i = n / 2 + 1; i <= n; i++){
            ans += dp[n-1][i];
        }
        System.out.println(ans);
    }
}