import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
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
        private static final long INF = (long) 1e18;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[][] cost = new int[n + 1][n + 1];
            for (int i = 1; i <= n; ++i) {
                for (int j = 1; j <= n; ++j) {
                    if (i != j) cost[i][j] = in.nextInt();
                }
            }
            long[][] best = new long[n + 1][n + 1];
            long[] suffix = new long[n + 1];
            for (int i = 1; i <= n; ++i) {
                for (int j = 1; j < i; ++j) {
                    suffix[j] += cost[i][j];
                }
            }
            for (long[] x : best) Arrays.fill(x, INF);
            best[0][0] = 0;
            for (int a = 1; a <= n; ++a) {
                long inside = 0;
                for (int j = 1; j < a; ++j) {
                    suffix[j] -= cost[a][j];
                }
                for (int b = a - 1; b >= 0; --b) {
                    long outside = 0;
                    for (int c = b; c >= 0; --c) {
                        if (best[b][c] < INF) {
                            best[a][b] = Math.min(best[a][b], best[b][c] + outside + inside);
                        }
                        outside += suffix[c];
                    }
                    for (int c = a; c > b; --c) {
                        inside += cost[b][c];
                    }
                }
            }
            long res = INF;
            for (int a = 1; a <= n; ++a) {
                res = Math.min(res, best[n][a]);
            }
            out.println(res);
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
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
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

