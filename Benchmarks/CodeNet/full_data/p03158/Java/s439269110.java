import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

class Main {
    static In in = new In();
    static Out out = new Out();
    static long mod = 1000000007;
    static long inf = 0xfffffffffffffffL;

    void solve() {
        int n = in.nextInt();
        int q = in.nextInt();
        long[] a = in.nextLongArray(n);
        long[] s = new long[n + 1];
        long[] os = new long[n + 1];
        long[] es = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            s[i] = s[i - 1] + a[i - 1];
            if (i % 2 == 1) {
                os[i] += a[i - 1];
            } else {
                es[i] += a[i - 1];
            }
            os[i] += os[i - 1];
            es[i] += es[i - 1];
        }
        for (int i = 0; i < q; i++) {
            long x = in.nextLong();
            long left = -1, right = 2000000000;
            int ul = -1, ur = -1;
            while (right - left > 1) {
                long mid = (left + right) / 2;
                int l = lowerBound(a, x - mid);
                int r1 = upperBound(a, x + mid);
                int r2 = lowerBound(a, x + mid);
                if (r1 - l > n - r1) {
                    if (r2 - l <= n - r2) {
                        left = mid;
                        ur = r2;
                        ul = l;
                        break;
                    }
                    right = mid;
                } else {
                    left = mid;
                    ur = r1;
                    ul = l;
                }
            }
            if (ul == -1) {
                if (n % 2 == 0) {
                    out.println(es[n]);
                } else {
                    out.println(os[n]);
                }
            } else {
                out.println(s[n] - s[ur] + (n % 2 == 0 ? es[ul] : os[ul]));
            }
        }
    }

    static int upperBound(long[] array, long value) {
        int left = -1;
        int right = array.length;
        while (right - left > 1) {
            int mid = (left + right) / 2;
            if (array[mid] <= value) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return right;
    }

    static int lowerBound(long[] array, long value) {
        int left = -1;
        int right = array.length;
        while (right - left > 1) {
            int mid = (left + right) / 2;
            if (array[mid] < value) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return right;
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
