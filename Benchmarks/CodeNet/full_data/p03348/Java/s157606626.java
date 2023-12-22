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
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[][] d = new int[n][n];
            for (int i = 0; i < n; ++i) Arrays.fill(d[i], (int) 1e9);
            for (int i = 0; i < n; ++i) d[i][i] = 0;
            for (int i = 0; i < n - 1; ++i) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                d[a][b] = d[b][a] = 1;
            }
            for (int k = 0; k < n; ++k) {
                for (int i = 0; i < n; ++i) {
                    for (int j = 0; j < n; ++j) {
                        d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
                    }
                }
            }
            Solver solver = new Solver(n, d).invoke();
            int res = solver.getRes();
            long ret = solver.getRet();
            for (int a = 0; a < n; ++a) {
                int[][] dd = new int[n + 1][n + 1];
                for (int i = 0; i < n; ++i) {
                    for (int j = 0; j < n; ++j) {
                        dd[i][j] = d[i][j];
                    }
                    dd[i][n] = dd[n][i] = 1 + d[a][i];
                }
                Solver s1 = new Solver(n + 1, dd).invoke();
                if (s1.res == res && s1.ret < ret)
                    ret = s1.ret;
            }
            out.println(res + " " + ret);
        }

        private class Solver {
            private int n;
            private int[][] d;
            private int res;
            private long ret;

            public Solver(int n, int[][] d) {
                this.n = n;
                this.d = d;
            }

            public int getRes() {
                return res;
            }

            public long getRet() {
                return ret;
            }

            public Solver invoke() {
                int mi = -1;
                int mj = -1;
                int max = -1;
                for (int i = 0; i < n; ++i) {
                    for (int j = 0; j < n; ++j) {
                        if (d[i][j] > max) {
                            max = d[i][j];
                            mi = i;
                            mj = j;
                        }
                    }
                }
                int ci = -1;
                int cj = -1;
                if (max % 2 == 0) {
                    for (int i = 0; i < n; ++i)
                        if (d[i][mi] == max / 2 && d[i][mj] == max / 2) {
                            if (ci >= 0) throw new RuntimeException();
                            ci = i;
                            cj = i;
                        }
                } else {
                    for (int i = 0; i < n; ++i)
                        if (d[i][mi] == max / 2 && d[i][mj] == max / 2 + 1) {
                            if (ci >= 0) throw new RuntimeException();
                            ci = i;
                        }
                    for (int i = 0; i < n; ++i)
                        if (d[i][mi] == max / 2 + 1 && d[i][mj] == max / 2) {
                            if (cj >= 0) throw new RuntimeException();
                            cj = i;
                        }
                }
                res = max / 2 + 1;
                int[] maxDeg = new int[res];
                for (int i = 0; i < n; ++i) {
                    int dist = Math.min(d[i][ci], d[i][cj]);
                    int deg = 0;
                    for (int j = 0; j < n; ++j) if (d[i][j] == 1) ++deg;
                    maxDeg[dist] = Math.max(maxDeg[dist], deg);
                }
                ret = 1;
                for (int i = 0; i < res - 1; ++i) {
                    long by = maxDeg[i];
                    if (i > 0 || max % 2 != 0)
                        --by;
                    ret *= by;
                }
                if (max % 2 != 0) ret *= 2;
                return this;
            }

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

