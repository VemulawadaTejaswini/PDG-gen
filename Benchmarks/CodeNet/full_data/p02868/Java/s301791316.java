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

            LRC[] lrcs = new LRC[M];
            for (int i = 0; i < M; i++) {
                LRC lrc = new LRC();
                lrc.L = sc.nextInt() - 1;
                lrc.R = sc.nextInt() - 1;
                lrc.C = sc.nextLong();
                lrcs[i] = lrc;
            }

            Arrays.sort(lrcs, (o1, o2) -> {
                int compare = Integer.compare(o1.L, o2.L);
                if (compare != 0) {
                    return compare;
                }
                return Long.compare(o1.C, o2.C);
            });

            long[] d = new long[N];
            for (int i = 1; i < N; i++) {
                d[i] = Long.MAX_VALUE;
            }

//            int L = -1;
//            int R = -1;
            for (int i=0;i<M;i++) {
                if (d[lrcs[i].L] == Long.MAX_VALUE) {
                    break;
                }

//                int t = lrcs[i].L + 1;
//                if (L == lrcs[i].L) {
//                    if (R >= lrcs[i].R) {
//                        continue;
//                    }
//                    t = R + 1;
//                }

                for (int j = lrcs[i].R; j >= lrcs[i].L + 1; j--) {
                    if (d[j] < d[lrcs[i].L] + lrcs[i].C) {
                        break;
                    }
                    d[j] = d[lrcs[i].L] + lrcs[i].C;
                }

//                L = lrcs[i].L;
//                R = lrcs[i].R;
            }

            long ans = d[N - 1];
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
