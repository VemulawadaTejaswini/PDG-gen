import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
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
        int p = in.nextInt();
        mod = p;
        String s = new StringBuilder(in.next()).reverse().toString();
        int[] a = new int[n + 1];
        int[] pow = new int[n + 2];
        int[] rev = new int[n + 2];
        pow[0] = 1;
        rev[0] = 1;
        for (int i = 1; i < n + 2; i++) {
            pow[i] = pow[i - 1] * 10 % p;
            rev[i] = (int)pow(pow[i], p - 2);
        }
        Map<Integer, Integer> map = new HashMap<>();
        int[] count1 = new int[p];
        int[] count2 = new int[p];
        a[1] = (s.charAt(0) - '0') % p;
        for (int i = 2; i <= n; i++) {
            a[i] = (a[i - 1] * 10 + (s.charAt(i - 1) - '0')) % p;
        }
        for (int i = 0; i <= n; i++) {
            map.compute(a[i] * p + pow[i], (key, value) -> value == null ? 1 : value + 1);
            count1[a[i]]++;
            count2[pow[i]]++;
        }
        long ans = 0;
        for (int i = 0; i <= n; i++) {
            map.compute(a[i] * p + pow[i], (key, value) -> value == 1 ? null : value - 1);
            count1[a[i]]--;
            count2[pow[i]]--;
            if (map.get(a[i] * p) != null) {
                ans -= map.get(a[i] * p);
            }
            ans += count1[a[i]] + count2[0];
        }
        out.println(ans);
    }

    static long pow(long a, long b) {
        if (a == 0) {
            return 0;
        }
        long x = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                x = x * a % mod;
                b--;
            } else {
                a = a * a % mod;
                b /= 2;
            }
        }
        return x;
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
