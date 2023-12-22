import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.function.DoublePredicate;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;
import static java.lang.Math.max;
import static java.lang.Math.min;



public class Main {
    public static void main(String[] args) {
        StringBuilder out = new StringBuilder();
        solve(out);
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(out);
        pw.flush();
        pw.close();
    }

    static long constXmin = +Const.LINF;
    static long constXmax = -Const.LINF;
    static long constYmin = +Const.LINF;
    static long constYmax = -Const.LINF;
    static long lXmin = +Const.LINF;
    static long lXmax = -Const.LINF;
    static long rXmin = +Const.LINF;
    static long rXmax = -Const.LINF;
    static long uYmin = +Const.LINF;
    static long uYmax = -Const.LINF;
    static long dYmin = +Const.LINF;
    static long dYmax = -Const.LINF;

    public static void solve(StringBuilder out) {
        long n = In.ni();
        for (long i = 0; i < n; i++) {
            long x = In.ni();
            long y = In.ni();
            char d = In.nc()[0];
            if (d == 'L') {
                lXmin = min(lXmin, x);
                lXmax = max(lXmax, x);
                constYmax = max(constYmax, y);
                constYmin = min(constYmin, y);
            } else if (d == 'R') {
                rXmin = min(rXmin, x);
                rXmax = max(rXmax, x);
                constYmax = max(constYmax, y);
                constYmin = min(constYmin, y);
            } else if (d == 'U') {
                uYmin = min(uYmin, y);
                uYmax = max(uYmax, y);
                constXmax = max(constXmax, x);
                constXmin = min(constXmin, x);
            } else if (d == 'D') {
                dYmin = min(dYmin, y);
                dYmax = max(dYmax, y);
                constXmax = max(constXmax, x);
                constXmin = min(constXmin, x);
            }
        }
        double txl = binarySearch(0, 1e9, t -> dx(t) < 0);
        double txr = binarySearch(0, 1e9, t -> dx(t) <= 0);
        double tyl = binarySearch(0, 1e9, t -> dy(t) < 0);
        double tyr = binarySearch(0, 1e9, t -> dy(t) <= 0);
        double l = txr < tyl || tyr < txl ? max(txl, tyl) : 0;
        double r = 1e9;
        while (true) {
            double m1 = l + (r - l) / 3;
            double m2 = r - (r - l) / 3;
            if (l == m1 || r == m2) break;
            if (ds(m1, m2) >= 0) {
                r = m2;
            } else {
                l = m1;
            }
        }
        System.out.println(s(r));
    }

    public static double binarySearch(double l, double r, DoublePredicate p) {
        while (true) {
            double m = (l + r) / 2;
            if (l == m || r == m) break;
            if (p.test(m)) {
                l = m;
            } else {
                r = m;
            }
        }
        return r;
    }

    public static double xmax(double t) {
        return max(constXmax, max(rXmax + t, lXmax - t));
    }

    public static double xmin(double t) {
        return min(constXmin, min(lXmin - t, rXmin + t));
    }

    public static double ymax(double t) {
        return max(constYmax, max(uYmax + t, dYmax - t));
    }

    public static double ymin(double t) {
        return min(constYmin, min(dYmin - t, uYmin + t));
    }

    public static double x(double t) {
        return xmax(t) - xmin(t);
    }

    public static double y(double t) {
        return ymax(t) - ymin(t);
    }

    public static double s(double t) {
        return x(t) * y(t);
    }

    public static double dx(double t) {
        return x(t + 1e-5) - x(t);
    }

    public static double dy(double t) {
        return y(t + 1e-5) - y(t);
    }

    public static double ds(double t1, double t2) {
        return s(t2) - s(t1);
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
final class In {
    public static final FastScanner fsc = new FastScanner();
    public static int ni() {return fsc.nextInt();}
    public static int[] ni(final int n) {
        final int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = fsc.nextInt();
        return a;
    }
    public static int[] ni(final int n, final IntUnaryOperator f) {
        final int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = f.applyAsInt(fsc.nextInt());
        return a;
    }
    public static int[][] ni(final int n, final int m) {
        final int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) a[i] = ni(m);
        return a;
    }
    public static int[][] ni(final int n, final int m, final IntUnaryOperator f) {
        final int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) a[i] = ni(m, f);
        return a;
    }
    public static long nl() {return fsc.nextLong();}
    public static long[] nl(final int n) {
        final long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = fsc.nextLong();
        return a;
    }
    public static long[] nl(final int n, final LongUnaryOperator f) {
        final long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = f.applyAsLong(fsc.nextLong());
        return a;
    }
    public static long[][] nl(final int n, final int m) {
        final long[][] a = new long[n][m];
        for (int i = 0; i < n; i++) a[i] = nl(m);
        return a;
    }
    public static long[][] nl(final int n, final int m, final LongUnaryOperator f) {
        final long[][] a = new long[n][m];
        for (int i = 0; i < n; i++) a[i] = nl(m, f);
        return a;
    }
    public static char[] nc() {return fsc.next().toCharArray();}
    public static char[][] nc(final int n) {
        final char[][] c = new char[n][];
        for (int i = 0; i < n; i++) c[i] = nc();
        return c;
    }
    public static double nd() {return fsc.nextDouble();}
    public static double[] nd(final int n) {
        final double[] a = new double[n];
        for (int i = 0; i < n; i++) a[i] = fsc.nextDouble();
        return a;
    }
    public static double[][] nd(final int n, final int m) {
        final double[][] a = new double[n][m];
        for (int i = 0; i < n; i++) a[i] = nd(m);
        return a;
    }
    public static String ns() {return fsc.next();}
    public static String[] ns(final int n) {
        final String[] s = new String[n];
        for (int i = 0; i < n; i++) s[i] = fsc.next();
        return s;
    }
    public static boolean[][] grid(final int h, final int w, final char trueCharacter) {
        final boolean[][] grid = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            final char[] s = fsc.next().toCharArray();
            for (int j = 0; j < w; j++) grid[i][j] = s[j] == trueCharacter;
        }
        return grid;
    }
}


final class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) return true;
        ptr = 0;
        try {buflen = in.read(buffer);}
        catch (final IOException e) {e.printStackTrace();}
        return buflen > 0;
    }
    private int readByte() {return hasNextByte() ? buffer[ptr++] : -1;}
    public boolean hasNext() {
        while (hasNextByte() && !(33 <= buffer[ptr] && buffer[ptr] <= 126)) ptr++;
        return hasNextByte();
    }
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        final StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (33 <= b && b <= 126) {sb.appendCodePoint(b); b = readByte();}
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {minus = true; b = readByte();}
        if (b < '0' || '9' < b) throw new NumberFormatException();
        for (; ; b = readByte()) {
            if ('0' <= b && b <= '9') n = n * 10 + b - '0';
            else if (b == -1 || !(33 <= b && b <= 126)) return minus ? -n : n;
            else throw new NumberFormatException();
        }
    }
    public int nextInt() {return Math.toIntExact(nextLong());}
    public double nextDouble() {return Double.parseDouble(next());}
}

/**
 * @author https://atcoder.jp/users/suisen
 */
class Const {
    public static final long MOD7 = 1_000_000_007;
    public static final long MOD9 = 1_000_000_009;
    public static final long MOD99 = 998_244_353;

    public static final long LINF = Long.MAX_VALUE >> 2;
    public static final int IINF = Integer.MAX_VALUE >> 1;
    public static final double DINF = 1e150;

    public static final double SDELTA = 1e-12;
    public static final double DELTA = 1e-9;
    public static final double LDELTA = 1e-6;

    public static final int[] dx8 = {1, 0, -1, 0, 1, -1, -1, 1};
    public static final int[] dy8 = {0, 1, 0, -1, 1, 1, -1, -1};
    public static final int[] dx4 = {1, 0, -1, 0};
    public static final int[] dy4 = {0, 1, 0, -1};

    private Const(){}
}
