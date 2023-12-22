import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.regex.Pattern;

class Main {
    static In in = new In();
    static Out out = new Out();
    static long mod = 1000000007;
    static long inf = 0xfffffffffffffffL;

    void solve() {
        char[] a = in.next().toCharArray();
        char[] b = in.next().toCharArray();
        char[] c = in.next().toCharArray();
        int a1 = solve(a, b, c);
        int a2 = solve(a, c, b);
        int a3 = solve(b, a, c);
        int a4 = solve(b, c, a);
        int a5 = solve(c, a, b);
        int a6 = solve(c, b, a);
        out.println(Math.min(Math.min(Math.min(Math.min(Math.min(a1, a2), a3), a4), a5), a6));
    }

    int solve(char[] a, char[] b, char[] c) {
        int an = a.length, bn = b.length, cn = c.length;
        for (int ci = 0; ci <= an + bn; ci++) {
            int n = ci + cn;
            boolean can = true;
            for (int i = ci; i < an; i++) {
                can &= check(a[i], c[i - ci]);
            }
            if (!can) {
                continue;
            }
            StringBuilder builder1 = new StringBuilder();
            StringBuilder builder2 = new StringBuilder();
            for (int i = 0; i < n; i++) {
                char ch = get(i, ci, a, c);
                builder1.append(ch);
            }
            for (int i = 0; i < bn; i++) {
                if (b[i] == '?') {
                    builder2.append('.');
                } else {
                    builder2.append("[").append(b[i]).append("?]");
                }
            }
            can = Pattern.compile(builder2.toString()).matcher(builder1).find();
            if (can) {
                return n;
            }
        }
        return 0xfffffff;
    }

    char get(int i, int ci, char[] a, char[] c) {
        if (i < a.length) {
            return a[i];
        } else if (ci <= i) {
            return c[i - ci];
        } else {
            return '?';
        }
    }

    boolean check(char a, char b) {
        return a == '?' || b == '?' || a == b;
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
