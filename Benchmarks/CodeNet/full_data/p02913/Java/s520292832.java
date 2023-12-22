import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

public class Main {
    static In in = new In();
    static Out out = new Out();
    static final long mod = 1000000007;
    static final long inf = 0x1fffffffffffffffL;
    static final int iinf = 0x3fffffff;
    static final int[] da = {-1, 0, 1, 0, -1, 1, 1, -1, -1};

    void solve() {
        int n = in.nextInt();
        String s = in.next();
        StringBuilder builder = new StringBuilder(s);
        ZAlgorithm za = new ZAlgorithm();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int[] table = za.build(builder.toString());
            for (int j = 1; j < n - i; j++) {
                ans = Math.max(ans, Math.min(j, table[j]));
            }
            builder.deleteCharAt(0);
        }
        out.println(ans);
    }

    public static void main(String[]$) {
        new Main().solve();
        out.flush();
    }
}

class ZAlgorithm {
    int[] build(String s) {
        int n = s.length();
        int[] z = new int[n];
        int c = 0;
        for (int i = 1; i < n; i++) {
            if (i + z[i - c] < c + z[c]) {
                z[i] = z[i - c];
            } else {
                int j = Math.max(0, c + z[c] - i);
                while (i + j < n && s.charAt(j) == s.charAt(i + j)) {
                    j++;
                }
                z[i] = j;
                c = i;
            }
        }
        z[0] = n;
        return z;
    }

    int firstIndexOf(String s, String t) {
        int n = s.length();
        int m = n + t.length() + 1;
        int[] table = build(s + '$' + t);
        for (int i = n + 1; i < m; i++) {
            if (table[i] == n) {
                return i;
            }
        }
        return -1;
    }

    int lastIndexOf(String s, String t) {
        int n = s.length();
        int m = n + t.length() + 1;
        int[] table = build(s + '$' + t);
        for (int i = m - 1; i > n; i--) {
            if (table[i] == n) {
                return i;
            }
        }
        return -1;
    }

    List<Integer> indexOf(String s, String t) {
        int n = s.length();
        int m = n + t.length() + 1;
        int[] table = build(s + '$' + t);
        List<Integer> res = new ArrayList<>();
        for (int i = n + 1; i < m; i++) {
            if (table[i] == n) {
                res.add(i);
            }
        }
        return res;
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
