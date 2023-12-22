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

        long[][][] dp = new long[N+1][S+1][3];
        dp[0][0][0] = 1;
        for (int i=0;i<N;i++) {
            for (int j=0;j<=S;j++) {
                dp[i+1][j][0] = (dp[i+1][j][0]+dp[i][j][0])%mod;
                dp[i+1][j][1] = (dp[i+1][j][1]+dp[i][j][1])%mod;
                dp[i+1][j][2] = (dp[i+1][j][2]+dp[i][j][2])%mod;
                if (j+A[i]<=S) {
                    dp[i+1][j+A[i]][1] = (dp[i+1][j+A[i]][1]+dp[i][j][0]*(i+1)%mod)%mod;
                    if (j+A[i]!=S) {
                        dp[i+1][j+A[i]][1] = (dp[i+1][j+A[i]][1]+dp[i][j][1])%mod;
                    } else {
                        dp[i+1][j+A[i]][2] = (dp[i+1][j+A[i]][1]+dp[i][j][1]*(N-i)%mod)%mod;
                    }
                }
            }
        }
        System.out.println(dp[N][S][2]);
    }
}