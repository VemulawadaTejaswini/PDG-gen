import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

public class Main {
    static In in = new In();
    static Out out = new Out();
    static long mod = 1000000007;
    static long inf = 0xfffffffffffffffL;

    void solve() {
        int h = in.nextInt();
        int w = in.nextInt();
        char[][] s = in.nextCharArray(h, w);
        int[][][] dp = new int[h][w][2];
        if (s[0][0] == '#') {
            dp[0][0][1] = 0;
            dp[0][0][0] = 1;
        } else {
            dp[0][0][1] = 1;
            dp[0][0][0] = 0;
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (i != 0 || j != 0) {
                    dp[i][j][0] = 0xfffffff;
                    dp[i][j][1] = 0xfffffff;
                }
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (i > 0) {
                    if (s[i][j] == '#') {
                        dp[i][j][0] = Math.min(dp[i][j][0], dp[i - 1][j][0] + 1);
                        dp[i][j][0] = Math.min(dp[i][j][0], dp[i - 1][j][1] + 1);
                        dp[i][j][1] = Math.min(dp[i][j][1], dp[i - 1][j][1]);
                        dp[i][j][1] = Math.min(dp[i][j][1], dp[i - 1][j][0] + 1);
                    } else {
                        dp[i][j][0] = Math.min(dp[i][j][0], dp[i - 1][j][0]);
                        dp[i][j][0] = Math.min(dp[i][j][0], dp[i - 1][j][1] + 1);
                        dp[i][j][1] = Math.min(dp[i][j][1], dp[i - 1][j][1] + 1);
                        dp[i][j][1] = Math.min(dp[i][j][1], dp[i - 1][j][0] + 1);
                    }
                }
                if (j > 0) {
                    if (s[i][j] == '#') {
                        dp[i][j][0] = Math.min(dp[i][j][0], dp[i][j - 1][0] + 1);
                        dp[i][j][0] = Math.min(dp[i][j][0], dp[i][j - 1][1] + 1);
                        dp[i][j][1] = Math.min(dp[i][j][1], dp[i][j - 1][1]);
                        dp[i][j][1] = Math.min(dp[i][j][1], dp[i][j - 1][0] + 1);
                    } else {
                        dp[i][j][0] = Math.min(dp[i][j][0], dp[i][j - 1][0]);
                        dp[i][j][0] = Math.min(dp[i][j][0], dp[i][j - 1][1] + 1);
                        dp[i][j][1] = Math.min(dp[i][j][1], dp[i][j - 1][1] + 1);
                        dp[i][j][1] = Math.min(dp[i][j][1], dp[i][j - 1][0] + 1);
                    }
                }
            }
        }
        out.println(Math.min(dp[h - 1][w - 1][0], dp[h - 1][w - 1][1] + 1));
    }

    public static void main(String[]$) {
        new Main().solve();
        out.flush();
    }
}

class In {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 0x10000);
    private StringTokenizer tokenizer;

    String next() {
        try {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
        } catch (IOException ignored) {
        }
        return tokenizer.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    char[][] nextCharArray(int n, int m) {
        char[][] a = new char[n][m];
        for (int i = 0; i < n; i++) {
            a[i] = next().toCharArray();
        }
        return a;
    }

    int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }
        return a;
    }

    int[] nextIntArray(int n, IntUnaryOperator op) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = op.applyAsInt(nextInt());
        }
        return a;
    }

    long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextLong();
        }
        return a;
    }

    long[] nextLongArray(int n, LongUnaryOperator op) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = op.applyAsLong(nextLong());
        }
        return a;
    }
}

class Out {
    private PrintWriter out = new PrintWriter(System.out);
    boolean autoFlush = false;

    void println(Object... a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (Object obj : a) {
            joiner.add(String.valueOf(obj));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void println(int[] a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i : a) {
            joiner.add(Integer.toString(i));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void println(long[] a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (long i : a) {
            joiner.add(Long.toString(i));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void flush() {
        out.flush();
    }
}
