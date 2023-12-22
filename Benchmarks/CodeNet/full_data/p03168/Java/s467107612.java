/**
 * @author derrick20
 */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = sc.nextInt();
        double[] p = new double[N];
        for (int i = 0; i < p.length; i++) {
            p[i] = sc.nextDouble();
        }

        double[] dp = new double[N + 1];
        // dp[i] stores probability to get i heads, N - i tails
        // We implicitly store, with how many coins can we achieve this outcome
        // But really, we just go through all the coins and transition
        // the current heads to the new state, of using 1 more coin.
        dp[0] = 1;
        for (int coin = 0; coin < N; coin++) {
            for (int heads = N; heads >= 0; heads--) {
                // We must go downwards, because at each position,
                // we must rely on the answer for a smaller problem, then
                // update us!
                // In order to preserve this # heads, it's harder
                dp[heads] *= (1 - p[coin]);

                // There's a new way to reach this
                if (heads > 0) {
                    dp[heads] += dp[heads - 1] * p[coin];
                }
            }
        }
        double sum = 0;
        for (int heads = N / 2 + 1; heads <= N; heads++) {
            sum += dp[heads];
        }
        out.println(sum);
        out.close();
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        FastScanner(FileReader s) {
            br = new BufferedReader(s);
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        String nextLine() throws IOException { return br.readLine(); }

        double nextDouble() throws IOException { return Double.parseDouble(next()); }

        int nextInt() throws IOException { return Integer.parseInt(next()); }

        long nextLong() throws IOException { return Long.parseLong(next()); }
    }
}