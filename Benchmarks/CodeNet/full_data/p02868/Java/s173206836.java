import java.util.Arrays;
import java.util.Scanner;

/**
 * Counting of Trees
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            LRC[] lrc = new LRC[M];
            for (int i = 0; i < M; i++) {
                lrc[i] = new LRC();
                lrc[i].L = sc.nextInt() - 1;
                lrc[i].R = sc.nextInt() - 1;
                lrc[i].C = sc.nextLong();
            }

            Arrays.sort(lrc, (o1, o2) -> Integer.compare(o1.L, o2.L));

            long[] dp = new long[N];
            for (int i = 1; i < N; i++) {
                dp[i] = Long.MAX_VALUE;
            }

            for (int i = 0; i < M; i++) {
                for (int j = lrc[i].L + 1; j <= lrc[i].R; j++) {
                    if (dp[lrc[i].L] != Long.MAX_VALUE) {
                        dp[j] = Math.min(dp[j], dp[lrc[i].L] + lrc[i].C);
                    }
                }
            }

            long ans = dp[N - 1];
            if (ans == Long.MAX_VALUE) {
                ans = -1;
            }

            System.out.println(ans);
        }
    }

    static class LRC {

        int L;

        int R;

        long C;

    }

}
