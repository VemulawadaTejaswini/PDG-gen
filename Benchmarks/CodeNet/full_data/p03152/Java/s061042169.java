import java.io.*;
import java.util.*;

public class Main {
    private static InputStream is;
    private static PrintWriter out;
    private static String INPUT = "";

    long mod = (long) 1e9 + 7;
    int n, m, nm;

    void solve() {
        n = ni();
        m = ni();
        nm = n * m;
        int a[] = na(n);
        int b[] = na(m);
        if (!check(a) || !check(b)) {
            out.println(0);
            return;
        }
        class P {
            int x;
        }
        P p[] = new P[nm];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                P t = p[i * m + j] = new P();
                t.x = Math.min(a[i], b[j]);
            }
        }
        Arrays.sort(p, (r, l) -> r.x - l.x);
        for (int i = 0; i < nm; ++i) {
            P t = p[i];
            if (i + 1 > t.x) {
                out.println(0);
                return;
            }
        }
        long x = 1;
        boolean ca[] = new boolean[nm + 1];
        boolean cb[] = new boolean[nm + 1];
        for (int t : a) ca[t] = true;
        for (int t : b) cb[t] = true;
        int z[] = new int[nm + 1];
        Arrays.fill(z, -1);
        for (int i = 1; i <= nm; ++i) {
            if (ca[i] && cb[i]) {
                z[i] = 1;
            }
            if (ca[i]) {
                z[i] = 0;
                for (int j = 0; j < n; ++j) {
                    if (i == a[j]) {
                        for (int k = 0; k < m; ++k) {
                            if (i < b[k]) z[i]++;
                        }
                    }
                }
            }
            if (cb[i]) {
                z[i] = 0;
                for (int j = 0; j < m; ++j) {
                    if (i == b[j]) {
                        for (int k = 0; k < n; ++k) {
                            if (i < a[k]) z[i]++;
                        }
                    }
                }
            }
        }
        for (int i = nm, j = i - 1; i > 0; --i) {
            while (j > 0 && p[j - 1].x >= i) --j;
            if (ca[i] && cb[i]) continue;
            x *= z[i] != -1 ? z[i] : i - j;
            x %= mod;
        }
        out.println(x);
    }

    boolean check(int[] x) {
        boolean used[] = new boolean[nm + 1];
        for (int t : x) {
            if (used[t]) return false;
            used[t] = true;
        }
        return true;
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
            a[i] = ni();
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