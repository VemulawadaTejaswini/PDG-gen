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

    int[] a, b;
    void solve() {
        int n = in.nextInt();
        a = in.nextIntArray(n);
        b = in.nextIntArray(n);
        long ans = inf;
        for (int i = 0; i < 1 << n; i++) {
            int[] c = new int[n];
            int[] d = new int[n];
            for (int j = 0; j < n; j++) {
                c[j] = ((i >> j) & 1);
                d[j] = get(i, j);
            }
            int count = 0;
            for (int j = 0; j < n; j++) {
                int last = j;
                for (int k = j - 1; k >= 0; k--) {
                    if (d[k] > d[j]) {
                        last = k;
                    }
                }
                for (int k = j; k > last; k--) {
                    count++;
                    c[k]++;
                    c[k - 1]++;
                    int tmp = c[k];
                    c[k] = c[k - 1];
                    c[k - 1] = tmp;
                    tmp = d[k];
                    d[k] = d[k - 1];
                    d[k - 1] = tmp;
                }
            }
            boolean can = true;
            int tmp = c[0] % 2, last = 0;
            for (int j = 1; j < n; j++) {
                if (d[j - 1] == d[j]) {
                    tmp += (1 << j) * (c[j] % 2);
                } else {
                    if (Integer.bitCount(tmp) % 2 == 1) {
                        can = false;
                    } else {
                        count += f(tmp);
                    }
                    tmp = c[j] % 2;
                    last = j;
                }
            }
            if (Integer.bitCount(tmp) % 2 == 1) {
                can = false;
            } else {
                count += f(tmp);
            }
            if (can) {
                ans = Math.min(ans, count);
            }
        }
        out.println(ans == inf ? -1 : ans);
    }

    int f(int i) {
        int res = 0;
        while (i > 0) {
            if ((i & 1) == 1) {
                i ^= 3;
                res++;
            }
            i >>= 1;
        }
        return res;
    }

    int get(int flags, int i) {
        return ((flags >> i) & 1) == 1 ? b[i] : a[i];
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
    private static PrintWriter out = new PrintWriter(System.out);

    void println(Object... a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (Object obj : a) {
            joiner.add(String.valueOf(obj));
        }
        out.println(joiner);
    }

    void flush() {
        out.flush();
    }
}
