import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
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
    static final int[] da = {-1, 0, 1, 0, -1, 1, 1, -1, -1};

    void solve() {
        int n = in.nextInt();
        Section[] a = new Section[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Section(in.nextInt(), in.nextInt());
        }
        Arrays.sort(a, Comparator.comparingInt(section -> section.right));
        int[] llm = new int[n];
        llm[0] = a[0].left;
        for (int i = 1; i < n; i++) {
            llm[i] = Math.max(llm[i - 1], a[i].left);
        }
        int[] rlm = new int[n];
        rlm[n - 1] = a[n - 1].left;
        for (int i = n - 2; i >= 0; i--) {
            rlm[i] = Math.max(a[i].left, rlm[i + 1]);
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, f(a[i].left, a[i].right) + f(Math.max(i == 0 ? 0 : llm[i - 1], i + 1 < n ? rlm[i + 1] : 0), i == 0 ? a[1].right : a[0].right));
        }
        for (int i = 0; i < n - 1; i++) {
            ans = Math.max(ans, f(llm[i], a[0].right) + f(rlm[i], a[i + 1].right));
        }
        out.println(ans);
    }

    int f(int left, int right) {
        return Math.max(0, right - left + 1);
    }

    public static void main(String[]$) {
        new Main().solve();
        out.flush();
    }
}

class Section {
    int left, right;

    Section(int left, int right) {
        this.left = left;
        this.right = right;
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
