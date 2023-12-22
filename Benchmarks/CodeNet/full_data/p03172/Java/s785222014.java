import java.util.Scanner;

public class EDPC_M_ {

    static int MOD = 1_000_000_007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N+1];
        for(int i = 1; i <= N; i++) A[i] = sc.nextInt();
        // dp[i][j]：ｉ人目まででｊ個の飴を分ける分け方 % MOD
        long[][] dp = new long[N+1][K+1];
        dp[0][0] = 0;
        int sum = 0;
        for(int i = 1; i <= N; i++){
            sum += A[i];
            for(int j = 0; j <= K; j++){
                if(j == 0) dp[i][j] = 1;
                else if(j <= A[i]) dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % MOD;
                else if(j <= sum) dp[i][j] = (dp[i-1][j] + dp[i][j-1] - dp[i-1][j - A[i] -1] + MOD) % MOD;
            }
        }
        System.out.println(dp[N][K]);
        sc.close();
    }

}
