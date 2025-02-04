import java.io.*;
import java.util.*;

public class Main {
    private static InputStream is;
    private static PrintWriter out;
    private static String INPUT = "";
    long mod = 998244353L;

    void solve() {
        int n = ni(), s = 0, a[] = na(n);
        long x = 1;
        for (long i : a) {
            s += i;
            x *= 3;
            x %= mod;
        }
        {
            long dp[][] = new long[n + 1][s + 1];
            dp[0][0] = 1;
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j <= s; ++j) {
                    if (dp[i][j] == 0) continue;
                    dp[i + 1][j] += dp[i][j] * 2;
                    dp[i + 1][j] %= mod;
                    dp[i + 1][j + a[i]] += dp[i][j];
                    dp[i + 1][j + a[i]] %= mod;
                }
            }
            for (int i = (s + 1) / 2; i <= s; ++i) {
                x += mod - 3 * dp[n][i];
                x %= mod;
            }
        }
        if (s % 2 == 0) {
            long dp[][] = new long[n + 1][s + 1];
            dp[0][0] = 1;
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j <= s; ++j) {
                    if (dp[i][j] == 0) continue;
                    dp[i + 1][j] += dp[i][j];
                    dp[i + 1][j] %= mod;
                    dp[i + 1][j + a[i]] += dp[i][j];
                    dp[i + 1][j + a[i]] %= mod;
                }
            }
            x += 3 * dp[n][s / 2];
            x %= mod;
        }
        out.println(x);
    }

    public static void main(String[] args) throws Exception {
        is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
        out = new PrintWriter(System.out);
        new Main().solve();
        out.flush();
    }

    private static boolean eof() {
        if (lenbuf == -1) return true;
        int lptr = ptrbuf;
        while (lptr < lenbuf)
            if (!isSpaceChar(inbuf[lptr++])) return false;

        try {
            is.mark(1000);
            while (true) {
                int b = is.read();
                if (b == -1) {
                    is.reset();
                    return true;
                } else if (!isSpaceChar(b)) {
                    is.reset();
                    return false;
                }
            }
        } catch (IOException e) {
            return true;
        }
    }

    private static byte[] inbuf = new byte[1024];
    static int lenbuf = 0, ptrbuf = 0;

    private static int readByte() {
        if (lenbuf == -1) throw new InputMismatchException();
        if (ptrbuf >= lenbuf) {
            ptrbuf = 0;
            try {
                lenbuf = is.read(inbuf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (lenbuf <= 0) return -1;
        }
        return inbuf[ptrbuf++];
    }

    private static boolean isSpaceChar(int c) {
        return !(c >= 33 && c <= 126);
    }

    private static int skip() {
        int b;
        while ((b = readByte()) != -1 && isSpaceChar(b))
            ;
        return b;
    }

    private static double nd() {
        return Double.parseDouble(ns());
    }

    private static char nc() {
        return (char) skip();
    }

    private static String ns() {
        int b = skip();
        StringBuilder sb = new StringBuilder();
        while (!(isSpaceChar(b))) { // when nextLine, (isSpaceChar(b) && b != ' ')
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    private static char[] ns(int n) {
        char[] buf = new char[n];
        int b = skip(), p = 0;
        while (p < n && !(isSpaceChar(b))) {
            buf[p++] = (char) b;
            b = readByte();
        }
        return n == p ? buf : Arrays.copyOf(buf, p);
    }

    private static char[][] nm(int n, int m) {
        char[][] map = new char[n][];
        for (int i = 0; i < n; i++)
            map[i] = ns(m);
        return map;
    }

    private static int[] na(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = ni();
        return a;
    }

    private static long[] nal(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nl();
        return a;
    }

    private static int ni() {
        int num = 0, b;
        boolean minus = false;
        while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
            ;
        if (b == '-') {
            minus = true;
            b = readByte();
        }

        while (true) {
            if (b >= '0' && b <= '9') {
                num = num * 10 + (b - '0');
            } else {
                return minus ? -num : num;
            }
            b = readByte();
        }
    }

    private static long nl() {
        long num = 0;
        int b;
        boolean minus = false;
        while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
            ;
        if (b == '-') {
            minus = true;
            b = readByte();
        }

        while (true) {
            if (b >= '0' && b <= '9') {
                num = num * 10 + (b - '0');
            } else {
                return minus ? -num : num;
            }
            b = readByte();
        }
    }

    private class XorShift {
        int x = 123456789;
        int y = 362436069;
        int z = 521288629;
        int w = 88675123;

        int nextInt(int n) {
            final int t = x ^ (x << 11);
            x = y;
            y = z;
            z = w;
            w = (w ^ (w >>> 19)) ^ (t ^ (t >>> 8));
            final int r = w % n;
            return r < 0 ? r + n : r;
        }
    }

    private static void tr(Object... o) {
        System.err.println(Arrays.deepToString(o));
    }
}