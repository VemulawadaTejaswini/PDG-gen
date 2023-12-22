import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i=0;i<N;i++) {
            A[i] = sc.nextInt();
        }

        if (N%2==0) {
            long tmp_1 = 0L;
            long tmp_2 = 0L;
            for (int i=0;i<N;i++) {
                if (i%2==0) tmp_1+=A[i];
                else tmp_2+=A[i];
            }
            System.out.println(Math.max(tmp_1, tmp_2));
        } else {
            long[][] dp = new long[N][3];
            long INF = 2_000_000_000_000_000_000L;
            for (int i=0;i<N;i++) {
                for (int j=0;j<3;j++) {
                    dp[i][j] = -INF;
                }
            }
            dp[0][0] = A[0];
            dp[0][1] = 0L;
            dp[0][2] = 0L;
            dp[1][1] = A[1];
            for (int i=1;i<N;i++) {
                dp[i][1] = Math.max(dp[i][1], dp[i-1][0]);
                dp[i][2] = Math.max(dp[i][2], dp[i-1][1]);
                if (i-2>=0) {
                    dp[i][0] = Math.max(dp[i][0], dp[i-2][0]+A[i]);
                    dp[i][1] = Math.max(dp[i][1], dp[i-2][1]+A[i]);
                    dp[i][2] = Math.max(dp[i][2], dp[i-2][2]+A[i]);
                }
            }
            long ans = dp[N-1][0];
            ans = Math.max(ans, dp[N-1][1]);
            ans = Math.max(ans, dp[N-1][2]);
            System.out.println(ans);
        }
    }
}