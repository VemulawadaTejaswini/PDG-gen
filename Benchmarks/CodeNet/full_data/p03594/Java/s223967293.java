import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    static InputStream is;
    static PrintWriter out;
    static String INPUT = "";

    void solve() {
        final int h = ni(), w = ni(), d = ni();
        char c[] = {'R', 'Y', 'G', 'B'};
        int bit[][] = new int[h][w];
        for (int i = 0; i < h; ++i) {
            for (int j = 0; j < w; ++j) {
                bit[i][j] = (1 << 4) - 1;
            }
        }
        boolean queuein[][] = new boolean[h][w];
        boolean ok[][] = new boolean[h][w];
        class T {
            int queue[] = new int[h * w], qi, qs;

            void calc(int i, int j) {
                qi = 0;
                qs = 1;
                queue[0] = (i << 16) + j;
                while (qi < qs) {
                    int p = queue[qi++];
                    int a = p >> 16;
                    int b = p & ((1 << 16) - 1);
                    dfs(a, b);
                }
            }

            void _dfs(int a, int b) {
                if (!in(a, b)) return;
                if (ok[a][b]) return;
                ok[a][b] = true;
                int x = 0;
                while ((bit[a][b] & (1 << x)) == 0) ++x;
                bit[a][b] = 1 << x;
                for (int k = 0; k <= d; ++k) {
                    remove(a + k, b + d - k, x);
                    remove(a - k, b + d - k, x);
                    remove(a + k, b - d + k, x);
                    remove(a - k, b - d + k, x);
                }
            }

            void dfs(int a, int b) {
                if (!in(a, b)) return;
                if (ok[a][b]) return;
                ok[a][b] = true;
                int x = 0;
                while ((bit[a][b] & (1 << x)) == 0) ++x;
                bit[a][b] = 1 << x;
                for (int k = 0; k <= d; ++k) {
                    remove(a + k, b + d - k, x);
                    remove(a - k, b + d - k, x);
                    remove(a + k, b - d + k, x);
                    remove(a - k, b - d + k, x);
                }
            }

            void remove(int a, int b, int x) {
                if (in(a, b)) {
                    bit[a][b] &= ~(1 << x);
                    if (!queuein[a][b] && Integer.bitCount(bit[a][b]) == 1) {
                        queuein[a][b] = true;
                        queue[qs++] = (a << 16) + b;
                    }
                }
            }

            boolean in(int a, int b) {
                return 0 <= a && a < h && 0 <= b && b < w;
            }
        }
        T t = new T();
        for (int i = 0; i < h; ++i) {
            for (int j = 0; j < w; ++j) {
                if (bit[i][j] == 0) throw new RuntimeException();
                t.calc(i, j);
            }
        }
        for (int i = 0; i < h; ++i) {
            for (int j = 0; j < w; ++j) {
                if (bit[i][j] == 0) throw new RuntimeException();
                int x = 0;
                while ((bit[i][j] & (1 << x)) == 0) ++x;
                out.print(c[x]);
            }
            out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        long S = System.currentTimeMillis();
        is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
        out = new PrintWriter(System.out);

        new Main().solve();
        out.flush();
        long G = System.currentTimeMillis();
        tr(G - S + " ms");
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

    private static void tr(Object... o) {
        System.err.println(Arrays.deepToString(o));
    }
}