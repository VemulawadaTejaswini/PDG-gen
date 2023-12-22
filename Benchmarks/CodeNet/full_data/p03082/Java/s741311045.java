import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;


public class Main {
    public static void main(String[] args) throws Exception {
        Field f = System.out.getClass().getDeclaredField("autoFlush");
        f.setAccessible(true);
        f.set(System.out, false);
        execute(System.in, System.out);
    }

    public static void execute(InputStream in, OutputStream out) {
        ExtendedScanner s = new ExtendedScanner(in);
        Out o = new Out(out);
        solve(s, o);
        o.flush();
        o.close();
    }

    public static void solve(ExtendedScanner sc, Out out) {
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = sc.ints(n);
        RadixSort.sortDescending(a);
        long mod = TypicalMods.MOD1000000007;
        ModArithmetic ma = new ModArithmetic(mod);
        Combinatorics cm = new Combinatorics(mod);
        long[] f = ma.factorialMemo(n);
        long[] fi = ma.invFactorialMemo(f);
        long[][] dp = new long[n + 1][x + 1];
        dp[0][x] = 1;
        for (int i = 1; i <= n; i++) {
            for (int k = 0; k <= Math.min(x, a[i - 1] - 1); k++) {
                long s = 0;
                for (int j = 0; j < i; j++) {
                    long p = cm.permutation(n - j - 1, i - j - 1, f, fi);
                    long q = 0;
                    for (int l = k; l <= x; l += a[i - 1]) {
                        q += dp[j][l];
                    }
                    s += ma.mul(p, q % mod);
                }
                dp[i][k] = s % mod;
            }
        }
        long ans = 0;
        for (int i = 0; i <= x; i++) {
            ans += ma.mul(dp[n][i], i);
        }
        out.writeln(ans % mod);
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
class BasicScanner {
    private final InputStream in;
    private final byte[] buf = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    public BasicScanner(InputStream in) {this.in = in;}
    private boolean hasNextByte() {
        if (ptr < buflen) return true;
        ptr = 0;
        try {buflen = in.read(buf);}
        catch (final IOException e) {e.printStackTrace();}
        return buflen > 0;
    }
    private int readByte() {return hasNextByte() ? buf[ptr++] : -1;}
    public boolean hasNext() {
        while (hasNextByte() && !(33 <= buf[ptr] && buf[ptr] <= 126)) ptr++;
        return hasNextByte();
    }
    private StringBuilder nextSequence() {
        if (!hasNext()) throw new NoSuchElementException();
        final StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (33 <= b && b <= 126) {sb.appendCodePoint(b); b = readByte();}
        return sb;
    }
    public char nextChar() {
        return (char) readByte();
    }
    public String next() {
        return nextSequence().toString();
    }
    public String next(int len) {
        return new String(nextChars(len));
    }
    public char[] nextChars() {
        final StringBuilder sb = nextSequence();
        int l = sb.length();
        char[] dst = new char[l];
        sb.getChars(0, l, dst, 0);
        return dst;
    }
    public char[] nextChars(int len) {
        if (!hasNext()) throw new NoSuchElementException();
        char[] s = new char[len];
        int i = 0;
        int b = readByte();
        while (33 <= b && b <= 126 && i < len) {s[i++] = (char) b; b = readByte();}
        if (i != len) throw new NoSuchElementException(String.format("length %d is longer than the sequence.", len));
        return s;
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {minus = true; b = readByte();}
        if (b < '0' || '9' < b) throw new NumberFormatException();
        while (true) {
            if ('0' <= b && b <= '9') n = n * 10 + b - '0';
            else if (b == -1 || !(33 <= b && b <= 126)) return minus ? -n : n;
            else throw new NumberFormatException();
            b = readByte();
        }
    }
    public int nextInt() {return Math.toIntExact(nextLong());}
    public double nextDouble() {return Double.parseDouble(next());}
}


/**
 * @author https://atcoder.jp/users/suisen
 */
class Out {
    private final OutputStream out;
    private byte[] buf = new byte[1024];
    private int ptr = 0;
    private static final int AUTO_FLUSH_THRETHOLD = 1 << 17;

    public Out(OutputStream out) {
        this.out = out;
    }

    public void flush() {
        try {
            out.write(buf, 0, ptr);
            out.flush();
            ptr = 0;
        } catch (IOException e) {e.printStackTrace();}
    }

    public void close() {
        try {out.close();} catch (IOException e) {e.printStackTrace();}
    }

    public Out writeln() {return write('\n');}
    public Out writeln(Object o) {return write(o).write('\n');}
    public Out writeln(String s) {return write(s).write('\n');}
    public Out writeln(char[] c) {return write(c).write('\n');}
    public Out writeln(char   c) {return write(c).write('\n');}
    public Out writeln(byte   b) {return write(b).write('\n');}
    public Out writeln(int    x) {return write(x).write('\n');}
    public Out writeln(long   x) {return write(x).write('\n');}
    public Out writeln(double d) {return write(d).write('\n');}

    public Out writeSpace() {return write(' ');}
    
    public Out write(Object o) {
        return write(o.toString());
    }

    public Out write(String s) {
        try {
            Field strValueField = s.getClass().getDeclaredField("value");
            strValueField.setAccessible(true);
            byte[] b = (byte[]) strValueField.get(s);
            int l = s.length();
            if (l > AUTO_FLUSH_THRETHOLD) {
                flush();
                int i = 0;
                while (i + AUTO_FLUSH_THRETHOLD < l) {
                    out.write(b, i, AUTO_FLUSH_THRETHOLD);
                    out.flush();
                    i += AUTO_FLUSH_THRETHOLD;
                }
                ensureCapacity(l - i);
                System.arraycopy(b, i, buf, 0, l - i);
                ptr = l - i;
            } else {
                ensureCapacity(ptr + l);
                System.arraycopy(b, 0, buf, ptr, l);
                ptr += l;
            }
        } catch (Exception e) {e.printStackTrace();}
        return this;
    }

    public Out write(char[] c) {
        int l = c.length;
        if (l > AUTO_FLUSH_THRETHOLD) {
            flush();
            ensureCapacity(AUTO_FLUSH_THRETHOLD);
            int i = 0;
            while (i + AUTO_FLUSH_THRETHOLD < l) {
                for (int j = 0; j < AUTO_FLUSH_THRETHOLD; j++) {
                    buf[ptr++] = (byte) c[i + j];
                }
                flush();
                i += AUTO_FLUSH_THRETHOLD;
            }
            for (; i < l; i++) {
                buf[ptr++] = (byte) c[i];
            }
        } else {
            ensureCapacity(ptr + l);
            for (char ch : c) buf[ptr++] = (byte) ch;
        }
        return this;
    }

    public Out write(char c) {
        ensureCapacity(ptr + 1);
        buf[ptr++] = (byte) c;
        return this;
    }

    public Out write(byte b) {
        ensureCapacity(ptr + 1);
        buf[ptr++] = b;
        return this;
    }

    public Out write(int x) {
        if (x == 0) {
            ensureCapacity(ptr + 1);
            buf[ptr++] = '0';
            return this;
        }
        int d = stringSize(x);
        ensureCapacity(ptr + d);
        if (x < 0) {
            buf[ptr++] = '-';
            x = -x;
            d--;
        }
        int j = ptr + d; 
        while (x > 0) {
            buf[--j] = (byte) ('0' + (x % 10));
            x /= 10;
        }
        ptr += d;
        return this;
    }

    public Out write(long x) {
        if (x == 0) {
            ensureCapacity(ptr + 1);
            buf[ptr++] = '0';
            return this;
        }
        int d = stringSize(x);
        ensureCapacity(ptr + d);
        if (x < 0) {
            buf[ptr++] = '-';
            x = -x;
            d--;
        }
        int j = ptr + d; 
        while (x > 0) {
            buf[--j] = (byte) ('0' + (x % 10));
            x /= 10;
        }
        ptr += d;
        return this;
    }

    public Out write(double d) {
        return write(Double.toString(d));
    }

    private void ensureCapacity(int cap) {
        if (cap > AUTO_FLUSH_THRETHOLD) {
            flush();
        }
        if (cap >= buf.length) {
            int newLength = buf.length;
            while (newLength < cap) newLength <<= 1;
            byte[] newBuf = new byte[newLength];
            System.arraycopy(buf, 0, newBuf, 0, buf.length);
            buf = newBuf;
        }
    }
    private static int stringSize(long x) {
        int d = 1;
        if (x >= 0) {d = 0; x = -x;}
        long p = -10;
        for (int i = 1; i < 19; i++, p *= 10) if (x > p) return i + d;
        return 19 + d;
    }
    private static int stringSize(int x) {
        int d = 1;
        if (x >= 0) {d = 0; x = -x;}
        int p = -10;
        for (int i = 1; i < 10; i++, p *= 10) if (x > p) return i + d;
        return 10 + d;
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
final class ExtendedScanner extends BasicScanner {
    public ExtendedScanner(InputStream in) {super(in);}
    public int[] ints(final int n) {
        final int[] a = new int[n];
        Arrays.setAll(a, $ -> nextInt());
        return a;
    }
    public int[] ints(final int n, final IntUnaryOperator f) {
        final int[] a = new int[n];
        Arrays.setAll(a, $ -> f.applyAsInt(nextInt()));
        return a;
    }
    public int[][] ints(final int n, final int m) {
        final int[][] a = new int[n][];
        Arrays.setAll(a, $ -> ints(m));
        return a;
    }
    public int[][] ints(final int n, final int m, final IntUnaryOperator f) {
        final int[][] a = new int[n][];
        Arrays.setAll(a, $ -> ints(m, f));
        return a;
    }
    public long[] longs(final int n) {
        final long[] a = new long[n];
        Arrays.setAll(a, $ -> nextLong());
        return a;
    }
    public long[] longs(final int n, final LongUnaryOperator f) {
        final long[] a = new long[n];
        Arrays.setAll(a, $ -> f.applyAsLong(nextLong()));
        return a;
    }
    public long[][] longs(final int n, final int m) {
        final long[][] a = new long[n][];
        Arrays.setAll(a, $ -> longs(m));
        return a;
    }
    public long[][] longs(final int n, final int m, final LongUnaryOperator f) {
        final long[][] a = new long[n][];
        Arrays.setAll(a, $ -> longs(m, f));
        return a;
    }
    public char[][] charArrays(final int n) {
        final char[][] c = new char[n][];
        Arrays.setAll(c, $ -> nextChars());
        return c;
    }
    public char[][] charArrays(final int n, final int m) {
        final char[][] c = new char[n][];
        Arrays.setAll(c, $ -> nextChars(m));
        return c;
    }
    public double[] doubles(final int n) {
        final double[] a = new double[n];
        Arrays.setAll(a, $ -> nextDouble());
        return a;
    }
    public double[][] doubles(final int n, final int m) {
        final double[][] a = new double[n][];
        Arrays.setAll(a, $ -> doubles(m));
        return a;
    }
    public String[] strings(final int n) {
        final String[] s = new String[n];
        Arrays.setAll(s, $ -> next());
        return s;
    }
    public String[] strings(final int n, final int m) {
        final String[] s = new String[n];
        Arrays.setAll(s, $ -> next(m));
        return s;
    }
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

/**
 * effective combinatoric calculations.
 * 
 * @author https://atcoder.jp/users/suisen
 */
class Combinatorics {
    private final long MOD;

    public Combinatorics(long mod) {
        this.MOD = mod;
    }

    /**
     * calculate nCr (mod MOD) in O(1).
     * 
     * @param n
     * @param r
     * @param factorial    the array that contains 0!, ..., n! (mod MOD).
     * @param invFactorial the array that contains the inverse of 0!, ..., n! (mod
     *                     MOD).
     * @return nCr (mod MOD).
     */
    public long combination(int n, int r, long[] factorial, long[] invFactorial) {
        return combination(n, r, factorial, invFactorial, MOD);
    }

    /**
     * calculate nCr (mod MOD) in O(min{r, n - r}).
     * 
     * @param n
     * @param r
     * @param invFactorial the array that contains the inverse of 0!, ..., n! (mod
     *                     MOD).
     * @return nCr (mod MOD)
     */
    public long combination(long n, long r, long[] invFactorial) {
        return combination(n, r, invFactorial, MOD);
    }

    /**
     * calculate nCr (mod MOD) in O(min{r, n - r} log MOD).
     * 
     * @param n
     * @param r
     * @return nCr (mod MOD)
     */
    public long combination(long n, long r) {
        return combination(n, r, MOD);
    }

    /**
     * calculate nCr (mod MOD) in O(1).
     * 
     * @param n
     * @param r
     * @param factorial    the array that contains 0!, ..., n! (mod MOD).
     * @param invFactorial the array that contains the inverse of 0!, ..., n! (mod
     *                     MOD).
     * @param MOD
     * @return nCr (mod MOD).
     */
    public static long combination(int n, int r, long[] factorial, long[] invFactorial, long MOD) {
        if (r < 0 || r > n) return 0;
        long inv = (invFactorial[r] * invFactorial[n - r]) % MOD;
        return (factorial[n] * inv) % MOD;
    }

    /**
     * calculate nCr (mod MOD) in O(min{r, n - r}).
     * 
     * @param n
     * @param r
     * @param invFactorial the array that contains the inverse of 0!, ..., n! (mod
     *                     MOD).
     * @param MOD
     * @return nCr (mod MOD)
     */
    public static long combination(long n, long r, long[] invFactorial, long MOD) {
        if (r < 0 || r > n) return 0;
        r = Math.min(r, n - r);
        n %= MOD;
        long res = invFactorial[Math.toIntExact(r)];
        for (long d = 1; d <= r; d++) res = (res * n--) % MOD;
        return res;
    }

    /**
     * calculate nCr (mod MOD) in O(min{r, n - r} log MOD).
     * 
     * @param n
     * @param r
     * @param MOD
     * @return nCr (mod MOD)
     */
    public static long combination(long n, long r, long MOD) {
        if (r < 0 || r > n) return 0;
        r = Math.min(r, n - r);
        n %= MOD;
        long res = 1;
        for (long d = 1; d <= r; d++) {
            long inv = ModArithmetic.inv(d, MOD);
            res = (res * n--) % MOD;
            res = (res * inv) % MOD;
        }
        return res;
    }

    /**
     * calculate nPr (mod MOD) in O(1).
     * 
     * @param n
     * @param r
     * @param factorial    the array that contains 0!, ..., n! (mod MOD).
     * @param invFactorial the array that contains the inverse of 0!, ..., n! (mod
     *                     MOD).
     * @return nPr (mod MOD).
     */
    public long permutation(int n, int r, long[] factorial, long[] invFactorial) {
        return permutation(n, r, factorial, invFactorial, MOD);
    }

    /**
     * calculate nPr (mod MOD) in O(r).
     * 
     * @param n
     * @param r
     * @return nPr (mod MOD).
     */
    public long permutation(long n, long r) {
        return permutation(n, r, MOD);
    }

    /**
     * calculate nPr (mod MOD) in O(1).
     * 
     * @param n
     * @param r
     * @param factorial    the array that contains 0!, ..., n! (mod MOD).
     * @param invFactorial the array that contains the inverse of 0!, ..., n! (mod
     *                     MOD).
     * @param MOD
     * @return nPr (mod MOD).
     */
    public static long permutation(int n, int r, long[] factorial, long[] invFactorial, long MOD) {
        if (r < 0 || r > n) return 0;
        return (factorial[n] * invFactorial[n - r]) % MOD;
    }

    /**
     * calculate nPr (mod MOD) in O(r).
     * 
     * @param n
     * @param r
     * @param MOD
     * @return nPr (mod MOD).
     */
    public static long permutation(long n, long r, long MOD) {
        if (r < 0 || r > n) return 0;
        long res = 1;
        for (long i = n - r + 1; i <= n; i++) res = (res * i) % MOD;
        return res;
    }

    /**
     * calculate a^b (mod MOD) in O(max{MOD, b}).
     * 
     * @param a base
     * @param b index
     * @return a^b (mod MOD)
     */
    public long power(long a, long b) {
        return power(a, b, MOD);
    }

    /**
     * calculate a^b (mod MOD) in O(max{MOD, b}).
     * 
     * @param a   base
     * @param b   index
     * @param MOD
     * @return a^b (mod MOD)
     */
    public static long power(long a, long b, long MOD) {
        a %= MOD;
        b %= (MOD - 1);
        if (b == 0 || a == 1) return 1;
        long res = 1, p = a, c = 1;
        while (b > 0) {
            long lsb = b & -b;
            for (; lsb != c; c <<= 1, p = (p * p) % MOD);
            res = (res * p) % MOD;
            b ^= lsb;
        }
        return res;
    }
}

/**
 * Minimum modulo operations.
 * 
 * @author https://atcoder.jp/users/suisen
 */
class ModArithmetic {
    public final long MOD;

    /**
     * support modulo p arithmetic
     * 
     * @param p p s.t. p is a prime number.
     */
    public ModArithmetic(final long p) {
        this.MOD = p;
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a mod p.
     */
    public static long mod(long a, final long MOD) {
        a %= MOD;
        return a < 0 ? a + MOD : a;
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a + b mod p.
     */
    public static long add(final long a, final long b, final long MOD) {
        final long s = a + b;
        return s < 0 ? s + MOD : s >= MOD ? s - MOD : s;
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a - b mod p.
     */
    public static long sub(final long a, final long b, final long MOD) {
        final long s = a - b;
        return s < 0 ? s + MOD : s >= MOD ? s - MOD : s;
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a * b mod p.
     */
    public static long mul(final long a, final long b, final long MOD) {
        final long ret = (a * b) % MOD;
        return ret < 0 ? ret + MOD : ret;
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ b * x = a mod p.
     */
    public static long div(final long a, final long b, final long MOD) {
        return mul(a, inv(b, MOD), MOD);
    }

    /**
     * Calculate the value b s.t. a * b mod p = 1.
     */
    public static long inv(long a, final long MOD) {
        long b = MOD;
        long u = 1, v = 0;
        while (b >= 1) {
            final long t = a / b;
            a -= t * b;
            final long tmp1 = a; a = b; b = tmp1;
            u -= t * v;
            final long tmp2 = u; u = v; v = tmp2;
        }
        u %= MOD;
        return u < 0 ? u + MOD : u;
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a mod p.
     */
    public long mod(long a) {
        a %= MOD;
        return a < 0 ? a + MOD : a;
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a + b mod p.
     */
    public long add(final long a, final long b) {
        final long s = a + b;
        return s < 0 ? s + MOD : s >= MOD ? s - MOD : s;
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a - b mod p.
     */
    public long sub(final long a, final long b) {
        final long s = a - b;
        return s < 0 ? s + MOD : s >= MOD ? s - MOD : s;
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a * b mod p.
     */
    public long mul(final long a, final long b) {
        final long s = (a * b) % MOD;
        return s < 0 ? s + MOD : s;
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ b * x = a mod p.
     */
    public long div(final long a, final long b) {
        return mul(a, inv(b));
    }

    /**
     * Calculate the value b s.t. a*b mod MOD = 1.
     */
    public long inv(long a) {
        long b = MOD;
        long u = 1, v = 0;
        while (b >= 1) {
            final long t = a / b;
            a -= t * b;
            final long tmp1 = a; a = b; b = tmp1;
            u -= t * v;
            final long tmp2 = u; u = v; v = tmp2;
        }
        return mod(u);
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a_1 + 1_2 + ... + a_k mod p.
     */
    public long sum(final long... a) {
        long ret = 0;
        for (final long c : a) ret += c;
        return mod(ret);
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a_1 * 1_2 * ... * a_k mod p.
     */
    public long prod(final long... a) {
        long ret = 1;
        for (final long c : a) ret = (ret * c) % MOD;
        return ret < 0 ? ret + MOD : ret;
    }

    /**
     * calculate the inverse of [1,n] mod MOD in O(n).
     * 
     * @param n
     * @param MOD
     * @return the array that contains the inverse of [1,n]. (array[0] = 0)
     */
    public static long[] invMemo(int n, long MOD) {
        final long[] memo = new long[n + 1];
        memo[1] = 1;
        for (int i = 2; i <= n; i++) {
            long q = MOD - MOD / i;
            long r = memo[(int) (MOD % i)];
            memo[i] = (q * r) % MOD;
        }
        return memo;
    }

    /**
     * calculate the inverse of a[0], ..., a[n - 1] mod MOD in O(n).
     * 
     * @param a
     * @param MOD
     * @return the array that contains the inverse of a[0], ..., a[n - 1].
     */
    public static long[] invAll(long[] a, long MOD) {
        int n = a.length;
        final long[] dp = new long[n + 1];
        final long[] pd = new long[n + 1];
        dp[0] = pd[n] = 1;
        for (int i = 0; i < n; i++) dp[i + 1] = (dp[i] * a[i]) % MOD;
        for (int i = n; i > 0; i--) pd[i - 1] = (pd[i] * a[i]) % MOD;
        long inv = ModArithmetic.inv(dp[n], MOD);
        long[] ret = new long[n];
        for (int i = 0; i < n; i++) ret[i] = (((dp[i] * pd[i]) % MOD) * inv) % MOD;
        return ret;
    }

    /**
     * calculate 0!, ..., n! (mod MOD) in O(n).
     * 
     * @param n
     * @param MOD
     * @return the array that contains 0!, ..., n! (mod MOD).
     */
    public static long[] factorialMemo(int n, long MOD) {
        final long[] memo = new long[n + 1];
        memo[0] = 1;
        for (int i = 1; i <= n; i++) memo[i] = (memo[i - 1] * i) % MOD;
        return memo;
    }

    /**
     * calculate the inverse of 0!, ..., n! (mod MOD) in O(n).
     * 
     * @param factorial [0!, ..., n!] (mod MOD).
     * @param MOD
     * @return the array that contains the inverse of 0!, ..., n! (mod MOD).
     */
    public static long[] invFactorialMemo(long[] factorial, long MOD) {
        final int n = factorial.length - 1;
        final long[] memo = new long[n + 1];
        memo[n] = ModArithmetic.inv(factorial[n], MOD);
        for (int i = n; i > 0; i--) memo[i - 1] = (memo[i] * i) % MOD;
        return memo;
    }

    /**
     * calculate a^0, ..., a^n (mod MOD) in O(n).
     * 
     * @param a   base
     * @param n   maximum index.
     * @param MOD
     * @return the array that contains the a^0, ..., a^n (mod MOD).
     */
    public static long[] powerMemo(long a, int n, long MOD) {
        if (a == 2) return powerMemo(n, MOD);
        long[] memo = new long[n + 1];
        memo[0] = 1;
        for (int i = 1; i <= n; i++) memo[i] = (memo[i - 1] * a) % MOD;
        return memo;
    }

    /**
     * calculate 2^0, ..., 2^n (mod MOD) in O(n).
     * 
     * @param n   maximum index.
     * @param MOD
     * @return the array that contains the 2^0, ..., 2^n (mod MOD).
     */
    public static long[] powerMemo(int n, long MOD) {
        long[] memo = new long[n + 1];
        memo[0] = 1;
        for (int i = 1; i <= n; i++) memo[i] = (memo[i - 1] << 1) % MOD;
        return memo;
    }

    /**
     * calculate a^b (mod MOD) in O(max{MOD, b}).
     * 
     * @param a   base
     * @param b   index
     * @param MOD
     * @return a^b (mod MOD)
     */
    public static long power(long a, long b, long MOD) {
        a %= MOD;
        b %= (MOD - 1);
        if (b == 0 || a == 1) return 1;
        long res = 1, p = a, c = 1;
        while (b > 0) {
            long lsb = b & -b;
            for (; lsb != c; c <<= 1, p = (p * p) % MOD);
            res = (res * p) % MOD;
            b ^= lsb;
        }
        return res;
    }

    /**
     * calculate the inverse of [1,n] mod MOD in O(n).
     * 
     * @param n
     * @return the array that contains the inverse of [1,n]. (array[0] = 0)
     */
    public long[] invMemo(int n) {
        final long[] memo = new long[n + 1];
        memo[1] = 1;
        for (int i = 2; i <= n; i++) {
            long q = MOD - MOD / i;
            long r = memo[(int) (MOD % i)];
            memo[i] = (q * r) % MOD;
        }
        return memo;
    }

    /**
     * calculate the inverse of a[0], ..., a[n - 1] mod MOD in O(n).
     * 
     * @param a
     * @return the array that contains the inverse of a[0], ..., a[n - 1].
     */
    public long[] invAll(long[] a) {
        int n = a.length;
        long[] dp = new long[n + 1];
        long[] pd = new long[n + 1];
        dp[0] = pd[n] = 1;
        for (int i = 0; i < n; i++) dp[i + 1] = (dp[i] * a[i    ]) % MOD;
        for (int i = n; i > 0; i--) pd[i - 1] = (pd[i] * a[i - 1]) % MOD;
        long inv = inv(dp[n], MOD);
        long[] invs = new long[n];
        for (int i = 0; i < n; i++) {
            long lr = (dp[i] * pd[i + 1]) % MOD;
            invs[i] = (lr * inv) % MOD;
        }
        return invs;
    }

    /**
     * calculate 0!, ..., n! (mod MOD) in O(n).
     * 
     * @param n
     * @return the array that contains 0!, ..., n! (mod MOD).
     */
    public long[] factorialMemo(int n) {
        final long[] memo = new long[n + 1];
        memo[0] = 1;
        for (int i = 1; i <= n; i++) memo[i] = (memo[i - 1] * i) % MOD;
        return memo;
    }

    /**
     * calculate the inverse of 0!, ..., n! (mod MOD) in O(n).
     * 
     * @param factorial [0!, ..., n!] (mod MOD).
     * @return the array that contains the inverse of 0!, ..., n! (mod MOD).
     */
    public long[] invFactorialMemo(long[] factorial) {
        final int n = factorial.length - 1;
        final long[] memo = new long[n + 1];
        memo[n] = ModArithmetic.inv(factorial[n], MOD);
        for (int i = n; i > 0; i--) memo[i - 1] = (memo[i] * i) % MOD;
        return memo;
    }

    /**
     * calculate a^0, ..., a^n (mod MOD) in O(n).
     * 
     * @param a   base
     * @param n   maximum index.
     * @return the array that contains the a^0, ..., a^n (mod MOD).
     */
    public long[] powerMemo(long a, int n) {
        if (a == 2) return powerMemo(n, MOD);
        final long[] memo = new long[n + 1];
        memo[0] = 1;
        for (int i = 1; i <= n; i++) memo[i] = (memo[i - 1] * a) % MOD;
        return memo;
    }

    /**
     * calculate 2^0, ..., 2^n (mod MOD) in O(n).
     * 
     * @param n   maximum index.
     * @return the array that contains the 2^0, ..., 2^n (mod MOD).
     */
    public long[] powerMemo(int n) {
        final long[] memo = new long[n + 1];
        memo[0] = 1;
        for (int i = 1; i <= n; i++) memo[i] = (memo[i - 1] << 1) % MOD;
        return memo;
    }

    /**
     * calculate a^b (mod MOD) in O(max{MOD, b}).
     * 
     * @param a   base
     * @param b   index
     * @return a^b (mod MOD)
     */
    public long power(long a, long b) {
        a %= MOD;
        b %= (MOD - 1);
        if (b == 0 || a == 1) return 1;
        long res = 1, p = a, c = 1;
        while (b > 0) {
            long lsb = b & -b;
            for (; lsb != c; c <<= 1, p = (p * p) % MOD);
            res = (res * p) % MOD;
            b ^= lsb;
        }
        return res;
    }
}

class TypicalMods {
    public static final long MOD1000000007 = 1000000007;
    public static final long MOD1000000009 = 1000000009;
    public static final long MOD998244353  = 998244353 ;
    private TypicalMods() {}
}
