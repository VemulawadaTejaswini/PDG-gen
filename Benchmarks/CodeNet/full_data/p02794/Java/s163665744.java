import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    InputStream is;

    int __t__ = 1;
    int __f__ = 0;
    int __FILE_DEBUG_FLAG__ = __f__;
    String __DEBUG_FILE_NAME__ = "src/B2";

    FastScanner in;
    PrintWriter out;

    public void solve() {
        int n = in.nextInt();
        Set<Integer>[] g = new HashSet[n];
        for (int i = 0; i < n; i++) {
            g[i] = new HashSet<>();
        }
        int[] a = new int[n-1];
        int[] b = new int[n-1];
        for (int i = 0; i < n - 1; i++) {
            a[i] = in.nextInt() - 1;
            b[i] = in.nextInt() - 1;
            g[a[i]].add(b[i]);
            g[b[i]].add(a[i]);
        }
        int m = in.nextInt();
        int[] u = new int[m];
        int[] v = new int[m];
        for (int i = 0; i < m; i++) {
            u[i] = in.nextInt() - 1;
            v[i] = in.nextInt() - 1;
        }

        int[] bits = new int[n-1];
        for (int i = 0; i < n - 1; i++) {
            g[a[i]].remove(b[i]);
            g[b[i]].remove(a[i]);

            Set<Integer> hash = new HashSet<>();
            dfs(0, g, hash);
            for (int j = 0; j < m; j++) {
                if ((hash.contains(u[j]) && !hash.contains(v[j]))
                        || (!hash.contains(u[j]) && hash.contains(v[j]))) {
                    bits[i] |= 1 << j;
                }
            }
            g[a[i]].add(b[i]);
            g[b[i]].add(a[i]);
        }

        long[] prev = new long[1<<m];
        long[] next = new long[1<<m];
        prev[0] = 1;
        for (int j = 0; j < n - 1; j++) {
            Arrays.fill(next, 0);
            for (int i = 0; i < 1 << m; i++) {
                next[i] += prev[i];
                next[i|bits[j]] += prev[i];
            }
            long[] tmp = prev; prev = next; next = tmp;
        }
        System.out.println(prev[(1 << m) - 1]);
    }

    private void dfs(int u, Set<Integer>[] g, Set<Integer> res) {
        res.add(u);
        for (int v : g[u]) {
            if (res.contains(v)) continue;
            dfs(v, g, res);
        }
    }

    long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    /* MOD_CALCULATION */
    static long MOD = 1000000007L;

    static long ADD(long a, long b) {
        return (a + b) % MOD;
    }

    static long SUB(long a, long b) {
        return (a - b + MOD) % MOD;
    }

    static long MULT(long a, long b) {
        return (a * b) % MOD;
    }

    static long POW(long a, long x) {
        long res = 1;
        for (; x > 0; x >>= 1) {
            if (x % 2 == 1) res = MULT(res, a);
            a = MULT(a, a);
        }

        return res;
    }

    static long DIV(long a, long b) {
        return MULT(a, POW(b, MOD - 2));
    }
    /* end */

    public void run() {
        if (__FILE_DEBUG_FLAG__ == __t__) {
            try {
                is = new FileInputStream(__DEBUG_FILE_NAME__);
            } catch (FileNotFoundException e) {
                // TODO 自動生成された catch ブロック
                e.printStackTrace();
            }
            System.out.println("FILE_INPUT!");
        } else {
            is = System.in;
        }
        in = new FastScanner(is);
        out = new PrintWriter(System.out);

        solve();
    }

    public static void main(final String[] args) {
        new Main().run();
    }

    class FastScanner {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public FastScanner(InputStream stream) {
            this.stream = stream;
            // stream = new FileInputStream(new File("dec.in"));

        }

        int read() {
            if (numChars == -1)
                throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        boolean isEndline(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; i++)
                array[i] = nextInt();

            return array;
        }

        int[][] nextIntMap(int n, int m) {
            int[][] map = new int[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = in.nextIntArray(m);
            }
            return map;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        long[] nextLongArray(int n) {
            long[] array = new long[n];
            for (int i = 0; i < n; i++)
                array[i] = nextLong();

            return array;
        }

        long[][] nextLongMap(int n, int m) {
            long[][] map = new long[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = in.nextLongArray(m);
            }
            return map;
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        double[] nextDoubleArray(int n) {
            double[] array = new double[n];
            for (int i = 0; i < n; i++)
                array[i] = nextDouble();

            return array;
        }

        double[][] nextDoubleMap(int n, int m) {
            double[][] map = new double[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = in.nextDoubleArray(m);
            }
            return map;
        }

        String next() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        String[] nextStringArray(int n) {
            String[] array = new String[n];
            for (int i = 0; i < n; i++)
                array[i] = next();

            return array;
        }

        String nextLine() {
            int c = read();
            while (isEndline(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isEndline(c));
            return res.toString();
        }
    }
}
