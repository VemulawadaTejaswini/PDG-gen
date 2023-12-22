/*input
6 15
6 5
5 6
6 4
6 6
3 5
7 2
*/
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author masterbios
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CLinovaAndKingdom solver = new CLinovaAndKingdom();
        solver.solve(1, in, out);
        out.close();
    }

    static class CLinovaAndKingdom {

        final int MAXN = (int) 1e7 + 10;
       
        long dp[][] = new long[102][100005];
        long val[], wet[];

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt(), wt = in.nextInt();
            val = new long[n];
            wet = new long[n];
            int maxval = 0;
            for (int i = 0; i < n; i++) {
                wet[i] = in.nextInt();
                val[i] = in.nextInt();
                maxval += val[i];
            }

            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= maxval; j++) dp[i][j] = -1;
            }

            long ans = 0;
            for (int i = maxval; i >= 0; i--) {
                long weight = solve(0, n, i);
                if (weight <= wt) {
                    ans = i;
                    break;
                }
            }

            out.println(ans);

        }

        public long solve(int idx, int n, int value) {
            if (value <= 0) return 0;
            if (idx == n) return MAXN;
            if (dp[idx][value] != -1) return dp[idx][value];
            long ans = solve(idx + 1, n, value);
            if (val[idx] <= value) {
                ans = min(ans, wet[idx] + solve(idx + 1, n, (int) (value - val[idx])));
            }
            return dp[idx][value] = ans;
        }


        public int max(int ...a) {
            int max = Integer.MIN_VALUE;
            for (int i : a) max = Math.max(max, i);
            return max;
        }

        public int min(int ...a) {
            int min = Integer.MAX_VALUE;
            for (int i : a) min = Math.min(min, i);
            return min;
        }

        public long max(long ...a) {
            long max = Long.MIN_VALUE;
            for (long i : a) max = Math.max(max, i);
            return max;
        }

        public long min(long ...a) {
            long min = Long.MAX_VALUE;
            for (long i : a) min = Math.min(min, i);
            return min;
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreElements()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

