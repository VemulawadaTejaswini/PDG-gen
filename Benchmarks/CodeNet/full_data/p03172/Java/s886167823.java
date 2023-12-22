import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

public class Main {
    static In in = new In();
    static Out out = new Out();
    static final long inf = 0x1fffffffffffffffL;
    static final int iinf = 0x3fffffff;
    static final double eps = 1e-9;
    static long mod = 1000000007;

    void solve() {
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = in.nextIntArray(n);
        Bit[] dp = new Bit[n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i] = new Bit(m + 1);
        }
        dp[0].set(0, 1);
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                dp[i].set(j, dp[i - 1].getSum(Math.max(0, j - a[i - 1]), j + 1));
            }
        }
        out.println(dp[n].get(m));
    }

    public static void main(String[]$) {
        new Main().solve();
        out.flush();
    }
}

class Bit {
    private int n;
    private long[] table;

    Bit(int n) {
        this.n = n;
        this.table = new long[n];
    }

    Bit(long[] a) {
        this(a.length);
        for (int i = 0; i < n; i++) {
            table[i] = a[i];
            int j = i + (i & -i);
            if (j < n) {
                table[j] = (table[j] + table[i]) % Main.mod;
            }
        }
    }

    private long getSum(int i) {
        long sum = 0;
        for (; i > 0; i -= i & -i) {
            sum = (sum + table[i - 1]) % Main.mod;
        }
        return sum;
    }

    void add(int i, long x) {
        for (i++; i <= n; i += i & -i) {
            table[i - 1] = (table[i - 1] + x) % Main.mod;
        }
    }

    void set(int i, long x) {
        add(i, (x - get(i) + Main.mod) % Main.mod);
    }

    long get(int i) {
        return (getSum(i + 1) - getSum(i) + Main.mod) % Main.mod;
    }

    long getSum(int l, int r) {
        return l >= r ? 0 : (getSum(r) - getSum(l) + Main.mod) % Main.mod;
    }

    int lowerBound(long x) {
        if (x <= 0) {
            return 0;
        }
        int i = 0;
        for (int j = Integer.highestOneBit(n); j > 0; j /= 2) {
            if (i + j <= n && table[i + j - 1] < x) {
                x = (x + Main.mod - table[i + j - 1]) % Main.mod;
                i += j;
            }
        }
        return i;
    }

    int upperBound(long x) {
        if (x <= 0) {
            return 0;
        }
        int i = 0;
        for (int j = Integer.highestOneBit(n); j > 0; j /= 2) {
            if (i + j <= n && table[i + j] <= x) {
                x = (x + Main.mod - table[i]) % Main.mod;
                i += j;
            }
        }
        return i;
    }

    long[] getAll() {
        long[] res = new long[n];
        for (int i = 0; i < n; i++) {
            res[i] = get(i);
        }
        return res;
    }

    @Override
    public String toString() {
        return Arrays.toString(getAll());
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

    char[] nextCharArray() {
        return next().toCharArray();
    }

    char[][] nextCharGrid(int n, int m) {
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

    List<List<Integer>> nextEdges(int n, int m) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            res.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int u = nextInt() - 1;
            int v = nextInt() - 1;
            res.get(u).add(v);
            res.get(v).add(u);
        }
        return res;
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

    void println(char[] s) {
        out.println(String.valueOf(s));
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
