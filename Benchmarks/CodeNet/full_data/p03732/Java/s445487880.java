import java.util.*;

class Abc060d
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int[] w = new int[N];
        int[] v = new int[N];
        for(int i = 0; i < N; i++){
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }

        long[][] dp = new long[W+1][N];

        for(int j = 1; j < W; j++){
            dp[j][0] = (w[0] > j) ? 0 : v[0];
        }
        dp[0][0] = (w[0] > 1)? 0 : v[0];
        for(int i = 1; i < W+1; i++){
            for(int j = 1; j < N; j++){
                long x = (i-w[j] >= 0) ? dp[i-w[j]][j-1] + v[j] : dp[0][j-1];
                dp[i][j] = Math.max(dp[i][j-1], x);
            }
        }
        System.out.println(dp[W][N-1]);
    }
}