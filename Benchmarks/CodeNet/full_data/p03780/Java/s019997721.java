import java.util.*;
import java.io.*;
import java.util.function.*;

class Main {
    static In in = new In();
    static Out out = new Out();
    static long mod = 1000000007;
    static long inf = 0xfffffffffffffffL;

    void solve() {
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = in.nextIntArray(n);
        BitSet[] dpL = new BitSet[n + 1];
        BitSet[] dpR = new BitSet[n + 1];
        for (int i = 0; i <= n; i++) {
            dpL[i] = new BitSet(k + 1);
            dpR[i] = new BitSet(k + 1);
        }
        dpL[0].set(0);
        dpR[n].set(0);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= k; j++) {
                if (dpL[i].get(j)) {
                    if (j + a[i] <= k) {
                        dpL[i + 1].set(j + a[i]);
                    }
                    dpL[i + 1].set(j);
                }
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= k; j++) {
                if (dpR[i + 1].get(j)) {
                    if (j + a[i] <= k) {
                        dpR[i].set(j + a[i]);
                    }
                    dpR[i].set(j);
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int count = dpR[i + 1].get(Math.max(0, k - a[i]), k).cardinality();
            boolean need = dpL[i].get(0) && count > 0;
            for (int j = 1; j <= k; j++) {
                if (dpR[i + 1].get(k - j + 1)) {
                    count--;
                }
                if (0 <= k - a[i] - j && dpR[i + 1].get(k - a[i] - j)) {
                    count++;
                }
                need |= dpL[i].get(j) && count > 0;
            }
            if (!need) {
                ans++;
            }
        }
        out.println(ans);
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
