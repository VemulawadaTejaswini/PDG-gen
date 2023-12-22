import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;
import static java.lang.Math.max;



public class Main {
    public static void main(String[] args) {
        StringBuilder out = new StringBuilder();
        solve(out);
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(out);
        pw.flush();
        pw.close();
    }

    public static void solve(StringBuilder out) {
        int n = In.ni();
        int[] c = new int[n + 1];
        for (int i = 0; i < n; i++) c[In.ni()]++;
        RadixSort.sort(c);
        int[] b = new int[n + 1];
        b[n] = n;
        int j = c[n] == n ? n : n + 1;
        for (int i = n - 1; i > 0; i--) {
            b[i] = b[i + 1] - (n - j + 1);
            while (c[j - 1] >= i) j--;
        }
        for (int i = 1; i <= n; i++) b[i] /= i;
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) a[b[i]] = i;
        for (int i = n - 1; i >= 0; i--) a[i] = max(a[i], a[i + 1]);
        for (int i = 1; i <= n; i++) out.append(a[i]).append('\n');
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

final class InsertionSort {
    static void sort(final int[] a) {sort(a, 0, a.length);}
    static void sort(final int[] a, final int from, final int to) {
        for (int i = from + 1; i < to; i++) {
            final int tmp = a[i];
            if (a[i - 1] > tmp) {
                int j = i;
                do {a[j] = a[j - 1]; j--;} while (j > from && a[j - 1] > tmp);
                a[j] = tmp;
            }
        }
    }
    static void sort(final long[] a) {sort(a, 0, a.length);}
    static void sort(final long[] a, final int from, final int to) {
        for (int i = from + 1; i < to; i++) {
            final long tmp = a[i];
            if (a[i - 1] > tmp) {
                int j = i;
                do {a[j] = a[j - 1]; j--;} while (j > from && a[j - 1] > tmp);
                a[j] = tmp;
            }
        }
    }
}

/**
 * @author https://atcoder.jp/users/suisen
 */
final class RadixSort {
    private static final int INT_INSERTION_SORT_THRESHOLD = 120;
    private static final int LONG_INSERTION_SORT_THRESHOLD = 250;
    public static void sort(final int[] a) {sort(a, 0, a.length);}
    public static void sortDescending(final int[] a) {sortDescending(a, 0, a.length);}
    public static void sort(final int[] a, final int fr, final int to) {
        if (to - fr <= INT_INSERTION_SORT_THRESHOLD) {InsertionSort.sort(a, fr, to); return;}
        final int n = a.length;
        final int[] c0 = new int[0x101], c1 = new int[0x101], c2 = new int[0x101], c3 = new int[0x101];
        c0[0] = fr; c1[0] = fr; c2[0] = fr; c3[0] = fr;
        for (int i = fr; i < to; i++) {
            final int v = a[i];
            final int b0 = v & 0xff, b1 = v >> 8 & 0xff, b2 = v >> 16 & 0xff, b3 = v >>> 24 ^ 0x80;
            c0[b0 + 1]++; c1[b1 + 1]++; c2[b2 + 1]++; c3[b3 + 1]++;
        }
        for (int i = 0; i < 0x100; i++) {
            c0[i + 1] += c0[i]; c1[i + 1] += c1[i]; c2[i + 1] += c2[i]; c3[i + 1] += c3[i];
        }
        final int[] b = new int[n];
        for (int i = fr; i < to; i++) {final int v = a[i]; b[c0[v        & 0xff]++] = v;}
        for (int i = fr; i < to; i++) {final int v = b[i]; a[c1[v >>> 8  & 0xff]++] = v;}
        for (int i = fr; i < to; i++) {final int v = a[i]; b[c2[v >>> 16 & 0xff]++] = v;}
        for (int i = fr; i < to; i++) {final int v = b[i]; a[c3[v >>> 24 ^ 0x80]++] = v;}
    }
    public static void sortDescending(final int[] a, final int fr, final int to) {
        sort(a, fr, to);
        int l = fr, r = to - 1;
        while (l < r) {final int tmp = a[l]; a[l] = a[r]; a[r] = tmp; l++; r--;}
    }
    public static void sort(final long[] a) {sort(a, 0, a.length);}
    public static void sortDescending(final long[] a) {sortDescending(a, 0, a.length);}
    public static void sort(final long[] a, final int fr, final int to) {
        if (to - fr <= LONG_INSERTION_SORT_THRESHOLD) {InsertionSort.sort(a, fr, to); return;}
        final int n = a.length;
        final int[] c0 = new int[0x101], c1 = new int[0x101], c2 = new int[0x101], c3 = new int[0x101];
        final int[] c4 = new int[0x101], c5 = new int[0x101], c6 = new int[0x101], c7 = new int[0x101];
        c0[0] = fr; c1[0] = fr; c2[0] = fr; c3[0] = fr; c4[0] = fr; c5[0] = fr; c6[0] = fr; c7[0] = fr;
        for (int i = fr; i < to; i++) {
            final long v = a[i];
            final int b0 = (int) (v & 0xff), b1 = (int) (v >> 8 & 0xff), b2 = (int) (v >> 16 & 0xff), b3 = (int) (v >> 24 & 0xff);
            final int b4 = (int) (v >> 32 & 0xff), b5 = (int) (v >> 40 & 0xff), b6 = (int) (v >> 48 & 0xff), b7 = (int) (v >>> 56 ^ 0x80);
            c0[b0 + 1]++; c1[b1 + 1]++; c2[b2 + 1]++; c3[b3 + 1]++; c4[b4 + 1]++; c5[b5 + 1]++; c6[b6 + 1]++; c7[b7 + 1]++;
        }
        for (int i = 0; i < 0x100; i++) {
            c0[i + 1] += c0[i]; c1[i + 1] += c1[i]; c2[i + 1] += c2[i]; c3[i + 1] += c3[i];
            c4[i + 1] += c4[i]; c5[i + 1] += c5[i]; c6[i + 1] += c6[i]; c7[i + 1] += c7[i];
        }
        final long[] b = new long[n];
        for (int i = fr; i < to; i++) {final long v = a[i]; b[c0[(int) (v        & 0xff)]++] = v;}
        for (int i = fr; i < to; i++) {final long v = b[i]; a[c1[(int) (v >>> 8  & 0xff)]++] = v;}
        for (int i = fr; i < to; i++) {final long v = a[i]; b[c2[(int) (v >>> 16 & 0xff)]++] = v;}
        for (int i = fr; i < to; i++) {final long v = b[i]; a[c3[(int) (v >>> 24 & 0xff)]++] = v;}
        for (int i = fr; i < to; i++) {final long v = a[i]; b[c4[(int) (v >>> 32 & 0xff)]++] = v;}
        for (int i = fr; i < to; i++) {final long v = b[i]; a[c5[(int) (v >>> 40 & 0xff)]++] = v;}
        for (int i = fr; i < to; i++) {final long v = a[i]; b[c6[(int) (v >>> 48 & 0xff)]++] = v;}
        for (int i = fr; i < to; i++) {final long v = b[i]; a[c7[(int) (v >>> 56 ^ 0x80)]++] = v;}
    }
    public static void sortDescending(final long[] a, final int fr, final int to) {
        sort(a, fr, to);
        int l = fr, r = to - 1;
        while (l < r) {final long tmp = a[l]; a[l] = a[r]; a[r] = tmp; l++; r--;}
    }
}
