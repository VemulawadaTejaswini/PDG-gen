import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        int mod = 1_000_000_007;
        long[][] dp = new long[N+1][K+1];
        int[] a = new int[N];
        for (int i=0;i<N;i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        dp[0][0] = 1;
        for (int i=0;i<N;i++) {
            for (int j=0;j<K+1;j++) {
                long tmp = 0;
                for (int k=Math.max(0, j-a[i]);k<=j;k++) {
                    tmp = (tmp+dp[i][k])%mod;
                }
                dp[i+1][j] = tmp;
            }
        }
        System.out.println(dp[N][K]);
    }
}