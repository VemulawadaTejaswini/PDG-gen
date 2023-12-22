import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeSet;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
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

    static int[] pow = new int[9];

    public static void solve(ExtendedScanner sc, Out out) {
        long mod = 1000000007;
        var ma = new ModArithmetic(mod);
        int s = sc.nextInt();
        long ans = 0;
        for (long d : MathUtil.divisors(s)) {
            long x = s / d;
            long w = ma.power(10, d) - ma.power(10, d - 1);
            if (d >= 8 || w >= x) {
                ans += w - x + 1;
                if (d >= 8) ans--;
            }
        }
        // out.writeln(ans);
        ans %= mod;
        pow[0] = 1;
        for (int i = 1; i <= 8; i++) {
            pow[i] = 10 * pow[i - 1];
        }
        long[] dsum = new long[9];
        for (int i = 1; i <= 8; i++) {
            dsum[i] = i * 9 * pow[i - 1];
        }
        for (int j = 2; j <= 8; j++) {
            long ds = 0;
            for (int i = 1; i < j; i++) {
                ds += dsum[i];
            }
            long v = s - ds;
            if (v >= 0 && v % j == 0 && v - dsum[j] < 0) {
                ans++;
            }
        }
        // out.writeln(ans);
        for (int y = 1; y <= 7; y++) {
            for (int x = y + 1; x <= 8; x++) {
                int v = s;
                for (int k = y + 1; k < x; k++) {
                    v -= dsum[k];
                }
                if (v < 0) continue;
                long mx = x * (pow[x] - pow[x - 1] - 1);
                long my = y * (pow[y] - pow[y - 1] - 1);
                if (mx + my < v) {
                    continue;
                }
                // long sl = f(x, y, v);
                // out.writeln("x = " + x + ", y = " + y + ", v = " + v + " -> " + sl);
                ans += f(x, y, v);
            }
        }
        // out.writeln(ans);
        ans %= mod;
        ans += s / 8;
        ans %= mod;
        out.writeln(ans < 0 ? ans += mod : ans);
    }

    public static long f(int x, int y, int v) {
        long[] pq = MathUtil.extGCD(x, y);
        long p = pq[0];
        long q = pq[1];
        long g = p * x + q * y;
        if (v % g != 0) return 0;
        long d = v / g;
        p *= d;
        q *= d;
        long xt = Math.abs(y / g);
        long l1 = x > y + 1 ? 0 : 1;
        long r1 = pow[x] - pow[x - 1] - 1;
        long l2 = (v - y * (pow[y] - pow[y - 1])) / x + 1;
        long r2 = x > y + 1 ? v / x : (v - y) / x;
        long l = Math.max(l1, l2);
        long r = Math.min(r1, r2) + 1;
        // int cnt = 0;
        // for (long pp = l; pp < r; pp++) {
        //     long qq = v - pp * x;
        //     if (qq % y != 0) continue;
        //     qq /= y;
        //     if (0 < pp && pp < pow[x] - pow[x - 1] && 0 < qq && qq < pow[y] - pow[y - 1]) {
        //         cnt++;
        //     }
        // }
        if (l >= r) return 0;
        if ((p %= xt) >= 0) p -= xt;
        // System.out.println(cnt);
        return (r - p - 1) / xt - (l - p - 1) / xt;
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


/**
 * @author https://atcoder.jp/users/suisen
 */
final class MathUtil{
    private static final long UNDER32_MASK = 0xffff_ffffl;
    private MathUtil(){}
    /**
     * Enumarate primes equal to or less than n.
     * @param n
     * @return {@code ArrayList} that holds primes.
     */
    public static ArrayList<Integer> eratosthenes(final int n) {
        final int[] div = eratosthenesDivisors(n);
        final ArrayList<Integer> result = new ArrayList<>();
        for (int i = 2; i <= n; i++) if (div[i] == i) result.add(i);
        return result;
    }
    /**
     * execute eratosthenes's prime-enumerate algorithm. a[i] holds the greatest
     * divisor of i. if a[i] = i, i is a prime number. This arrary enables you to
     * prime-factorize in O(log n) time.
     * @param n
     * @return divisor array.
     */
    public static int[] eratosthenesDivisors(final int n) {
        final int[] divisors = new int[n + 1];
        if (n <= 0) return null;
        for (int i = 1; i <= n; i++) {
            if ((i & 1) != 0) divisors[i] = i;
            else divisors[i] = 2;
        }
        for (int i = 3; i <= n; i += 2) {
            if (divisors[i] == i) for (long j = (long) i * i; j <= n; j += i << 1) divisors[(int) j] = i;
        }
        return divisors;
    }
    /**
     * Caluculate prime-factorization in O(sqrt(n)) time.
     * @param n
     * @return {@code HashMap} of {prime: index}
     */
    public static HashMap<Long, Integer> primeFactorization(long n) {
        final HashMap<Long, Integer> primes = new HashMap<>();
        for (long p = 2; p * p <= n; p++) {
            int q = 0;
            while (n % p == 0) {n /= p; q++;}
            if (q > 0) primes.put(p, q);
        }
        if (n > 1) primes.put(n, 1);
        return primes;
    }
    public static TreeSet<Long> divisors(final long n) {
        final TreeSet<Long> divisors = new TreeSet<>();
        for (long i = 1; i * i <= n; i++) if (n % i == 0) {divisors.add(i); divisors.add(n / i);}
        return divisors;
    }
    private static HashMap<Long, Integer> lcmMap(final HashMap<Long, Integer> amap, final HashMap<Long, Integer> bmap) {
        if (amap.size() < bmap.size()) return lcmMap(bmap, amap);
        final HashMap<Long, Integer> lcm = amap;
        for (final Map.Entry<Long, Integer> e : bmap.entrySet()) {
            final long prime = e.getKey();
            if (lcm.containsKey(prime)) lcm.put(prime, Math.max(lcm.get(prime), e.getValue()));
            else lcm.put(prime, e.getValue());
        }
        return lcm;
    }
    private static HashMap<Long, Integer> lcmMap(final HashMap<Long, Integer> amap, final long b) {
        final HashMap<Long, Integer> bmap = primeFactorization(b);
        return lcmMap(amap, bmap);
    }
    public static HashMap<Long, Integer> lcmMap(final long... a) {
        HashMap<Long, Integer> amap = new HashMap<>();
        for (final long c : a) amap = lcmMap(amap, c);
        return amap;
    }
    /**
     * calculate lcm(a, b) fast. (NOT considering overflow.)
     */
    public static long lcm(final long a, final long b) {return (a / gcd(a, b)) * b;}
    /**
     * Caluculate the GCD of (a, b)
     * @param a first value
     * @param b second value
     * @return GCD(a, b)
     */
    public static long gcd(long a, long b) {
        return positiveGCD(Math.abs(a), Math.abs(b));
    }
    private static long positiveGCD(long a, long b) {
        if (a < b) return positiveGCD(b, a);
        if (b == 0) return a;
        if (a == 0) return b;
        long r = a % b;
        while (r != 0) {a = b; b = r; r = a % b;}
        return b;
    }
    public static long gcd(final long... a) {
        long gcd = 0; for (final long c : a) gcd = gcd(gcd, c);
        return gcd;
    }
    /**
     * Return one of the solutions to {@code ax+by=gcd(a, b)}.
     * 
     * @return {@code x}, {@code y}, {@code gcd(a, b)}.
     * @param a a of ax+by=gcd(a, b).
     * @param b b of ax+by=gcd(a, b).
     */
    public static long[] extGCD(final long a, final long b) {
        final long[] ret = new long[3];
        final long[] xy = new long[2];
        ret[2] = extGCD(a, b, xy);
        ret[0] = xy[0]; ret[1] = xy[1];
        return ret;
    }
    private static long extGCD(final long a, final long b, final long[] xy) {
        if (b == 0) {xy[0] = 1; xy[1] = 0; return a;}
        long tmp = xy[0]; xy[0] = xy[1]; xy[1] = tmp;
        final long d = extGCD(b, a % b, xy);
        tmp = xy[0]; xy[0] = xy[1]; xy[1] = tmp;
        xy[1] -= a / b * xy[0];
        return d;
    }
    /**
     * caluculate a ^ b NOT considering overflow. so if you want to calculate a ^ b
     * (mod p), use ModUtil.pow(a, b).
     * @param a base
     * @param b exponent
     * @return a ^ b
     */
    public static long pow(final int a, long b) {
        long ret = 1l;
        for (long c = 1, ac = a; b > 0; ac *= ac, c <<= 1) if ((-b & b) == c) {ret *= ac; b &= ~(-b & b);}
        return ret;
    }
    /**
     * Caluculate the combination nCr NOT considering overflow.
     * 
     * @param n left
     * @param r right
     * @return nCr
     */
    public static long comb(long n, long r) {
        if (n < r) return 0;
        r = Math.min(r, n - r);
        long res = 1; for (long d = 1; d <= r; d++) {res *= n--; res /= d;}
        return res;
    }
    public static long ceilSqrt(final long n) {
        long l = -1, r = n;
        while (r - l > 1) {
            final long m = (r + l) >> 1;
            if (m * m >= n) r = m;
            else l = m;
        }
        return r;
    }
    public static long floorSqrt(final long n) {
        long l = 0, r = n + 1;
        while (r - l > 1) {
            final long m = (r + l) >> 1;
            if (m * m > n) r = m;
            else l = m;
        }
        return l;
    }
    public static long int2ToLong(final int upper, final int lower) {return ((long) upper << Integer.SIZE) | lower;}
    public static int upper32(final long l) {return (int) (l >>> Integer.SIZE);}
    public static int lower32(final long l) {return (int) (l & UNDER32_MASK);}

    public static BigInteger chineseRemainderTheorem(long[] mod, long[] remainder) {
        int n = mod.length;
        long[] t = new long[n];
        t[0] = remainder[0];
        for (int i = 1; i < n; i++) {
            long c = remainder[i];
            long m = mod[i];
            for (int j = 0; j < i; j++) {
                c -= t[j];
                c *= inv(mod[j], m);
                c %= m;
                if (c < 0) c += m;
            }
            t[i] = c;
        }
        BigInteger res = BigInteger.valueOf(t[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            res.multiply(BigInteger.valueOf(mod[i])).add(BigInteger.valueOf(t[i]));
        }
        return res;
    }

    public static long inv(long a, final long mod) {
        long b = mod;
        long u = 1, v = 0;
        while (b >= 1) {
            final long t = a / b;
            a -= t * b;
            final long tmp1 = a; a = b; b = tmp1;
            u -= t * v;
            final long tmp2 = u; u = v; v = tmp2;
        }
        u %= mod;
        return u < 0 ? u + mod : u;
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
 * @author https://atcoder.jp/users/suisen
 */
final class Longs {
    private Longs(){}
    public static long max(long a, long b) {
        return Math.max(a, b);
    }
    public static long max(long a, long b, long c) {
        return Math.max(Math.max(a, b), c);
    }
    public static long max(long a, long b, long c, long d) {
        return Math.max(Math.max(Math.max(a, b), c), d);
    }
    public static long max(long a, long b, long c, long d, long e) {
        return Math.max(Math.max(Math.max(Math.max(a, b), c), d), e);
    }
    public static long max(long a, long b, long c, long d, long e, long f) {
        return Math.max(Math.max(Math.max(Math.max(Math.max(a, b), c), d), e), f);
    }
    public static long max(long a, long b, long c, long d, long e, long f, long g) {
        return Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(a, b), c), d), e), f), g);
    }
    public static long max(long a, long b, long c, long d, long e, long f, long g, long h) {
        return Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(a, b), c), d), e), f), g), h);
    }
    public static long max(long a, long... vals) {
        long ret = a; for (long e : vals) ret = Math.max(ret, e);
        return ret;
    }
    public static long min(long a, long b) {
        return Math.min(a, b);
    }
    public static long min(long a, long b, long c) {
        return Math.min(Math.min(a, b), c);
    }
    public static long min(long a, long b, long c, long d) {
        return Math.min(Math.min(Math.min(a, b), c), d);
    }
    public static long min(long a, long b, long c, long d, long e) {
        return Math.min(Math.min(Math.min(Math.min(a, b), c), d), e);
    }
    public static long min(long a, long b, long c, long d, long e, long f) {
        return Math.min(Math.min(Math.min(Math.min(Math.min(a, b), c), d), e), f);
    }
    public static long min(long a, long b, long c, long d, long e, long f, long g) {
        return Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(a, b), c), d), e), f), g);
    }
    public static long min(long a, long b, long c, long d, long e, long f, long g, long h) {
        return Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(a, b), c), d), e), f), g), h);
    }
    public static long min(long a, long... vals) {
        long ret = a; for (long e : vals) ret = Math.min(ret, e);
        return ret;
    }
    public static long fold(final LongBinaryOperator func, final long... a) {
        long ret = a[0]; for (int i = 1; i < a.length; i++) ret = func.applyAsLong(ret, a[i]);
        return ret;
    }
    public static boolean isPowerOfTwo(final long n) {return n != 0 && (-n & n) == n;}
    public static int ceilExponent(final long n) {return 63 - Long.numberOfLeadingZeros(n) + (isPowerOfTwo(n) ? 0 : 1);}
    public static int floorExponent(final long n) {return 63 - Long.numberOfLeadingZeros(n) + (n == 0 ? 1 : 0);}
    public static int ceilExponent(final long n, final int base) {
        if (base == 2) return ceilExponent(n);
        int i = 0;
        long m = 1;
        while (m < n) {
            i++;
            final long r = m * base;
            if ((m | base) >> 31 != 0 && r / base != m) break;
            m = r;
        }
        return i;
    }
    /**
     * Caluculate the ceil of a/b. Returns the smallest integer greater than or
     * equal to a/b while 'a/b' rounds fractional parts to ZERO.
     * @param a
     * @param b
     * @return the smallest integer greater than or equal to a/b
     */
    public static long cld(final long a, final long b) {
        if (a > 0 && b > 0) return (a + b - 1) / b;
        if (a < 0 && b < 0) return (a + b + 1) / b;
        return a / b;
    }

    /**
     * Caluculate the floor of a/b. Returns the largest integer less than or equal
     * to a/b while 'a/b' rounds fractional parts to ZERO.
     * @param a
     * @param b
     * @return the largest integer less than or equal to a/b
     */
    public static long fld(final long a, final long b) {
        if (a <= 0 && b > 0) return (a - b + 1) / b;
        if (a > 0 && b <= 0) return (a - b - 1) / b;
        return a / b;
    }
    public static String join(final String sep, final long... a) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
            if (i < a.length - 1) sb.append(sep);
        }
        return sb.toString();
    }
}
