
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import java.util.*;

public class Main {
    long MOD = (long) 1e9 + 7;

    InputStream in;
    OutputStream out;

    public Main() {
        this(System.in, System.out);
    }

    public Main(InputStream in, OutputStream out) {
        this.in = in;
        this.out = out;
    }

    void run() {
        Scanner sc = new Scanner(this.in);
        PrintWriter out = new PrintWriter(this.out);

        // write your code
        int n = sc.nextInt();
        int[] as = new int[n];
        PriorityQueue<P> q = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            as[i] = sc.nextInt();
            q.add(new P(i, as[i]));
        }

        long[][] dp = new long[n + 1][n + 1];
        Arrays.fill(dp[0], -1);
        dp[0][0] = 0;
        for (int i = 1; i <= n; i++) {
            P cur = q.remove();
//            debug(cur.c, cur.idx);
            for (int j = 0; j <= i; j++) {
                if (j > 0 && dp[i - 1][j - 1] >= 0) {
//                    debug("l", i, j, dp[i - 1][j - 1], Math.abs(cur.idx - j + 1) * cur.c);
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - 1] + 1L * Math.abs(cur.idx - j + 1) * cur.c);
                }
                if (dp[i - 1][j] >= 0) {
//                    debug("r", i, j, dp[i - 1][j], Math.abs(cur.idx - (n - 1 - (i - j - 1))) * cur.c);
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j] + 1L * Math.abs(cur.idx - (n - 1 - (i - j - 1))) * cur.c);
                }
            }
//            debug(dp[i]);
        }

        long ans = 0;
        for (int i = 0; i <= n; i++) {
            ans = Math.max(ans, dp[n][i]);
        }

        out.println(ans);


        out.flush();
    }

    class P implements Comparable<P> {
        int idx, c;
        P(int idx, int c) {
            this.idx = idx;
            this.c = c;
        }

        @Override
        public int compareTo(P o) {
            return o.c - c;
        }
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}