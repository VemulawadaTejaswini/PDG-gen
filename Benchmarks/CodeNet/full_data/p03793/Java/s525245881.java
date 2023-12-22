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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            String s = in.next();
            int n = s.length();
            int[][] resolveTo = new int[27][n + 1];
            int[][] jumpToLessThan = new int[27][n + 1];
            for (int[] x : jumpToLessThan) Arrays.fill(x, -1);
            for (int j = n - 1; j >= 0; --j) {
                int u = s.charAt(j) - 'a';
                for (int i = 0; i < 27; ++i) {
                    if (u == i) {
                        resolveTo[i][j] = 1;
                    } else if (u < i) {
                        int l1 = resolveTo[i - 1][j];
                        if (l1 > 0) {
                            int pos = jumpToLessThan[i][j + l1];
                            if (pos >= 0) {
                                int l2 = resolveTo[i - 1][pos];
                                if (l2 > 0) {
                                    resolveTo[i][j] = pos - j + l2;
                                }
                            }
                        }
                    }
                }
                if (resolveTo[26][j] > 0) {
                    int whole = resolveTo[26][j];
                    for (int i = 0; i <= u; ++i) {
                        jumpToLessThan[i][j] = jumpToLessThan[i][j + whole];
                    }
                }
                for (int i = u + 1; i < 27; ++i) {
                    jumpToLessThan[i][j] = j;
                }
            }
            int[][] fullJumps = new int[20][n + 1];
            for (int i = 0; i < n; ++i) {
                fullJumps[0][i] = resolveTo[26][i];
            }
            for (int f = 1; f < fullJumps.length; ++f) {
                for (int i = 0; i < n; ++i) {
                    int l1 = fullJumps[f - 1][i];
                    if (l1 > 0) {
                        int l2 = fullJumps[f - 1][i + l1];
                        if (l2 > 0) {
                            fullJumps[f][i] = l1 + l2;
                        }
                    }
                }
            }
            int q = in.nextInt();
            outer:
            for (int i = 0; i < q; ++i) {
                int l = in.nextInt();
                int r = in.nextInt();
                --l;
                int f = fullJumps.length - 1;
                while (l < r) {
                    int len = fullJumps[f][l];
                    if (len == 0 || i + len > r) {
                        if (f == 0) {
                            out.println("No");
                            continue outer;
                        }
                        --f;
                    } else {
                        l += len;
                    }
                }
                out.println("Yes");
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

