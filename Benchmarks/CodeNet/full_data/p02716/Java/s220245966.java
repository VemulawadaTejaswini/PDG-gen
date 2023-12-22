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
    static final long mod = 1000000007;
    static final long inf = 0xfffffffffffffffL;
    static final int iinf = 0xfffffff;

    void solve() {
        int n = in.nextInt();
        long[] a = new long[n + 10];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextLong();
        }
        if (n % 2 == 0) {
            long sum = 0, ans = -inf;
            for (int i = 1; i < n; i += 2) {
                sum += a[i];
            }
            for (int i = 0; i < n; i += 2) {
                ans = Math.max(ans, sum);
                sum = sum - a[i + 1] + a[i];
            }
            ans = Math.max(ans, sum);
            out.println(ans);
        } else {
            long[][] dp = new long[n + 4][3];
            dp[0][0] = a[0];
            dp[0][1] = -inf;
            dp[0][2] = -inf;
            dp[1][0] = -inf;
            dp[1][1] = a[1];
            dp[1][2] = -inf;
            dp[2][0] = -inf;
            dp[2][1] = -inf;
            dp[2][2] = a[2];
            for (int i = 3; i < n + 4; i++) {
                dp[i][0] = dp[i][1] = dp[i][2] = -inf;
            }
            for (int i = 0; i < n; i++) {
                dp[i + 2][0] = Math.max(dp[i + 2][0], dp[i][0] + a[i + 2]);
                dp[i + 2][1] = Math.max(dp[i + 2][1], dp[i][1] + a[i + 2]);
                dp[i + 2][2] = Math.max(dp[i + 2][2], dp[i][2] + a[i + 2]);
                dp[i + 3][1] = Math.max(dp[i + 3][1], dp[i][0] + a[i + 3]);
                dp[i + 3][2] = Math.max(dp[i + 3][2], dp[i][1] + a[i + 3]);
                dp[i + 4][2] = Math.max(dp[i + 4][2], dp[i][0] + a[i + 4]);
            }
            out.println(Math.max(dp[n - 1][2], dp[n + 1][2]));
        }
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
