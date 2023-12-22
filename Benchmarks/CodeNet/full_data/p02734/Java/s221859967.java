import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S = sc.nextInt();
        int[] A = new int[N];
        int mod = 998244353;
        long[] ruiseki = new long[N+1];
        for (int i=0;i<N;i++) {
            A[i] = sc.nextInt();
            ruiseki[i+1] = ruiseki[i]+A[i];
        }

        long[][][] dp = new long[3][N+1][S+1];
        dp[0][0][0] = 1;
        for (int i=0;i<N;i++) {
            for (int j=0;j<=S;j++) {
                dp[0][i+1][j] = (dp[0][i+1][j]+dp[0][i][j])%mod;
                dp[1][i+1][j] = (dp[1][i+1][j]+dp[1][i][j])%mod;
                dp[2][i+1][j] = (dp[2][i+1][j]+dp[2][i][j])%mod;
                if (j+A[i]<=S) {
                    if (j+A[i]!=S) {
                        dp[1][i+1][j+A[i]] = (dp[1][i+1][j+A[i]]+dp[0][i][j]*(i+1)%mod)%mod;
                    } else {
                        dp[2][i+1][j+A[i]] = (dp[1][i+1][j+A[i]]+dp[0][i][j]*(i+1)*(N-i)%mod)%mod;
                    }
                    if (j+A[i]!=S) {
                        dp[1][i+1][j+A[i]] = (dp[1][i+1][j+A[i]]+dp[1][i][j])%mod;
                    } else {
                        dp[2][i+1][j+A[i]] = (dp[1][i+1][j+A[i]]+dp[1][i][j]*(N-i)%mod)%mod;
                    }
                }
            }
        }
        System.out.println(dp[2][N][S]);
    }
}