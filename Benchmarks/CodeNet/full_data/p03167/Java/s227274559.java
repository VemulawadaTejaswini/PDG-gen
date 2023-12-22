/*input
20 20
....................
....................
....................
....................
....................
....................
....................
....................
....................
....................
....................
....................
....................
....................
....................
....................
....................
....................
....................
....................
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

        final long MOD = (long) (1e9) + 7;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int r = in.nextInt(), c = in.nextInt();
            long dp[][] = new long[r][c];
            char a[][] = new char[r][c];

            for (int i = 0; i < r; i++) {
                a[i] = in.next().toCharArray();
            }

            for (int i = 1; i < r; i++) {
                if (a[i][0] == '#') break;
                else dp[i][0] = 1;
            }

            for (int j = 1; j < c; j++) {
                if (a[0][j] == '#') break;
                else dp[0][j] = 1;
            }


            for (int i = 1; i < r; i++) {
                for (int j = 1; j < c; j++) {
                    if (a[i][j] == '#') continue;
                    if (dp[i - 1][j] != 0) {
                        dp[i][j] += dp[i - 1][j];
                        dp[i][j] %= MOD;
                    }
                    if (dp[i][j - 1] != 0) {
                        dp[i][j] += dp[i][j - 1];
                        dp[i][j] %= MOD;
                    }

                }
            }

            out.println(dp[r - 1][c - 1]);

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

