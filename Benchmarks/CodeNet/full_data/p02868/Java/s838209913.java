import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Counting of Trees
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            PriorityQueue<LRC> queue = new PriorityQueue<>((o1, o2) -> {
                int comp = Long.compare(o1.C, o2.C);
                if (comp == 0) {
                    comp = Integer.compare(o1.L, o2.L);
                    if (comp == 0) {
                        comp = Integer.compare(o1.R, o2.R);
                    }
                }
                return comp;
            });

            for (int i = 0; i < M; i++) {
                LRC lrc = new LRC();
                lrc.L = sc.nextInt() - 1;
                lrc.R = sc.nextInt() - 1;
                lrc.C = sc.nextLong();
                queue.add(lrc);
            }

            long[] dp = new long[N];
            for (int i = 1; i < N; i++) {
                dp[i] = Long.MAX_VALUE;
            }

            int r = 0;
            List<LRC> tmp = new ArrayList<>();
            while (queue.size() > 0) {
                LRC lrc = queue.poll();
                if (r < lrc.L) {
                    tmp.add(lrc);
                    continue;
                }

                if (lrc.R <= r) {
                    continue;
                }

                for (int i = lrc.L + 1; i <= lrc.R; i++) {
                    dp[i] = Math.min(dp[i], dp[lrc.L] + lrc.C);
                }

                r = lrc.R;

                queue.addAll(tmp);
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
