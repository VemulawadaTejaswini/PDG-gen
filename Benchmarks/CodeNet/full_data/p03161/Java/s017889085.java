import java.util.*;

public class Main {

    private static final int INF = 2_000_000_000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] h = new int[N];
        for (int i = 0; i < N; i++) {
            h[i] = sc.nextInt();
        }
        int[][] dp = new int[N][K];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < K; j++) {
                dp[i][j] = INF;
            }
        }
        for (int j = 0; j < K; j++) {
            dp[0][j] = 0;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < K; j++) {
                if (i >= j+1) {
                    int pi = i-(j+1);
                    int min = INF;
                    for (int pj = 0; pj < K; pj++) {
                        min = Math.min(min, dp[pi][pj]);
                    }
                    dp[i][j] = min + Math.abs(h[i]-h[pi]);
                }
            }
        }

        int ans = INF;
        for (int j = 0; j < K; j++) {
            ans = Math.min(ans, dp[N-1][j]);
        }

        System.out.println(ans);
    }
}

