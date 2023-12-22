import java.util.*;

public class Main {
    public static long INF = 1000000000;

    // b and e are indices of the original array as
    // possible return values are b + 1, b + 2, ..., e - 1
    public static int findBreak(long[] accl_as, int b, int e) {
        // find first point where (sum left) - (sum right) >= 0
        if (e - b < 2) {
            return -1;
        }
        long diff = 0;
        int le = b, ri = e - 1;
        while (ri > le + 1) {
            final int m = (ri + le) / 2;
            diff = (accl_as[m] - accl_as[b]) - (accl_as[e] - accl_as[m]);
            if (diff >= 0) {
                ri = m;
            } else {
                le = m;
            }
        }
        int res = ri;
        diff = (accl_as[ri] - accl_as[b]) - (accl_as[e] - accl_as[ri]);
        // also look at the point before ri
        if (ri > b + 1) {
            final long diff2 = (accl_as[ri - 1] - accl_as[b]) - (accl_as[e] - accl_as[ri - 1]);
            if (Math.abs(diff2) < Math.abs(diff)) {
                res = ri - 1;
                diff = diff2;
            }
        }
        // System.out.printf("b = %d, e = %d, res = %d, diff = %d\n", b, e, res, diff);
        return res;
    }

    public static void main(String[] args) {
        // read inputs
        Scanner in = new Scanner(System.in);
        final int N = in.nextInt();
        long[] as = new long[N];
        for (int i = 0; i < N; i++) {
            as[i] = in.nextLong();
        }

        // calculate prefix sum
        long[] accl_as = new long[N + 1];
        accl_as[0] = 0;
        for (int i = 0; i < N; i++) {
            accl_as[i + 1] = accl_as[i] + as[i];
        }

        // try all positions for the 2nd breaking point
        long ans = INF;
        for (int e2 = 2; e2 < N - 1; e2++) {
            // binary search to find the best position for the 1st breaking point
            final int e1 = findBreak(accl_as, 0, e2);
            // binary search to find the best position for the 3rd breaking point
            final int e3 = findBreak(accl_as, e2, N);
            // calculate P, Q, R, S and the difference between the min and max
            final long P = accl_as[e1] - accl_as[0], Q = accl_as[e2] - accl_as[e1],
                    R = accl_as[e3] - accl_as[e2], S = accl_as[N] - accl_as[e3];
            final long mn = Math.min(P, Math.min(Q, Math.min(R, S))),
                    mx = Math.max(P, Math.max(Q, Math.max(R, S)));
            ans = Math.min(ans, mx - mn);
        }
        System.out.printf("%d\n", ans);
    }
}
