import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int mod = 1_000_000_007;
        int[][] a = new int[N][N];
        for (int i=0;i<N;i++) {
            for (int j=0;j<N;j++) {
                a[i][j] = Integer.parseInt(sc.next());
            }
        }

        long[][] dp = new long[N+1][1<<N];
        dp[0][0] = 1;
        for (int i=0;i<N;i++) {
            for (int j=0;j<(1<<N);j++) {
                int tmp = j;
                for (int k=0;k<N;k++) {
                    if ((tmp&1)==0) {
                        if (a[i][k]==1) {
                            dp[i+1][j+(1<<k)] = (dp[i+1][j+(1<<k)]+dp[i][j])%mod;
                        }
                    }
                    tmp=(tmp>>1);
                }
            }
        }
        System.out.println(dp[N][(1<<N)-1]);
        // System.out.println(Arrays.deepToString(dp));
    }
}