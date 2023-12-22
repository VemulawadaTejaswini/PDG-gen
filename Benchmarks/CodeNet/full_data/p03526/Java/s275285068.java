import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.util.InputMismatchException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            Pair[] pairs = new Pair[n];
            for (int i = 0; i < n; i++) {
                long h = in.nextLong();
                long p = in.nextLong();
                pairs[i] = new Pair(h, p);
            }
            Arrays.sort(pairs);

            long[] dp = new long[n + 1];
            Arrays.fill(dp, Long.MAX_VALUE);
            dp[0] = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i; j >= 0; j--) {
                    if (dp[j] <= pairs[i].x) {
                        dp[j + 1] = Math.min(dp[j + 1], dp[j] + pairs[i].y);
                    }
                }
            }

            for (int i = n; i >= 0; i--) {
                if (dp[i] != Long.MAX_VALUE) {
                    out.println(i);
                    return;
                }
            }
        }

        public class Pair implements Comparable<Pair> {
            long x;
            long y;

            Pair(long x, long y) {
                this.x = x;
                this.y = y;
            }

            public int compareTo(Pair p) {
                return Long.compare(Math.min(x, y), Math.min(p.x, p.y));
            }

        }

    }

    static class InputReader {
        BufferedReader in;
        StringTokenizer tok;

        public String nextString() {
            while (!tok.hasMoreTokens()) {
                try {
                    tok = new StringTokenizer(in.readLine(), " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
            return tok.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

        public long nextLong() {
            return Long.parseLong(nextString());
        }

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
            tok = new StringTokenizer("");
        }

    }
}

