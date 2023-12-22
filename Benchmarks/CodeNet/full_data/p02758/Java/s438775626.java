import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import static java.util.Arrays.sort;


public class Main {

    public static void main(String[] args) {
        Const.setMod(Const.MOD99);
        FastScanner fsc = new FastScanner();
        int n = fsc.nextInt();
        long[][] xd = new long[n][2];
        for (int i = 0; i < n; i++) {
            long x = fsc.nextLong();
            long d = fsc.nextLong();
            xd[i][0] = x;
            xd[i][1] = d;
        }
        sort(xd, (u, v) -> Long.compare(u[0], v[0]));
        SegmentTree t = new SegmentTree(n, Monoid.MAX);
        int[] r = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            int ps = i;
            int fl = n;
            while(fl - ps > 1) {
                int md = ps + (fl - ps) / 2;
                if (xd[md][0] < xd[i][0] + xd[i][1]) {
                    ps = md;
                } else {
                    fl = md;
                }
            }
            r[i] = (int) Math.max(t.query(i + 1, ps + 1), ps);
            t.apply(i, (u, v) -> v, (long) r[i]);
        }
        long[] dp = new long[n + 1];
        dp[n] = 1;
        for (int i = n - 1; i >= 0; i--) {
            dp[i] = dp[r[i] + 1] + dp[i + 1];
            if (dp[i] >= Const.MOD) {
                dp[i] -= Const.MOD;
            }
        }
        System.out.println(dp[0]);
    }
}


class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        } else {
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }

    private int readByte() {
        if (hasNextByte()) {
            return buffer[ptr++];
        } else {
            return -1;
        }
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
            ptr++;
        }
        return hasNextByte();
    }

    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }

    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
            throw new NumberFormatException();
        }
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}

class ModUtil {
    private static final long MOD = Const.MOD;

    public static long mod(long a) {
        a %= MOD;
        if (a < 0) a += MOD;
        return a;
    }

    public static long add(long... a) {
        long ret = 0;
        for (long c : a) ret += c;
        return mod(ret);
    }

    public static long add(long a, long b) {
        long s = a + b;
        return s >= Const.MOD ? s - Const.MOD : s;
    }

    public static long mul(long... a) {
        long ret = 1;
        for (long c : a) ret = (ret * c) % MOD;
        return ret;
    }

    public static long mul(long a, long b) {
        return (a * b) % Const.MOD;
    }

    public static long div(long a, long... b) {
        long ret = a;
        for (long c : b) ret = mul(ret, inv(c));
        return ret;
    }

    /**
     * Caluculate the value b s.t. a*b mod MOD = 1.
     * 
     * @param a
     * @return inverse of a
     */
    public static long inv(long a) {
        long b = MOD;
        long u = 1, v = 0;
        while (b >= 1) {
            long t = a / b;
            a -= t * b;
            long tmp1 = a; a = b; b = tmp1;
            u -= t * v;
            long tmp2 = u; u = v; v = tmp2;
        }
        u %= MOD;
        return u >= 0 ? u : u + MOD;
    }

    /**
     * Caluculate the combination nCr.
     * 
     * @param n left
     * @param r right
     * @return nCr
     */
    public static long comb(long n, long r) {
        if (n < r) return 0;
        r = Math.min(r, n - r);
        long res = 1;
        for (long d = 1; d <= r; d++) res = div(mul(res, n--), d);
        return res;
    }

    public static long[] fact(int n) {
        long[] fact = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i <= 1) {
                fact[i] = 1;
            } else {
                fact[i] = mul(fact[i - 1], i);
            }
        }
        return fact;
    }

    public static long[] powarr(long a, int n) {
        long[] ret = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                ret[i] = 1;
            } else {
                ret[i] = mul(ret[i - 1], a);
            }
        }
        return ret;
    }

    /**
     * Caluculate a^b (mod {@code MOD}) in O(log b) time.
     * 
     * @param a base
     * @param b index
     * @return a^b (mod {@code MOD})
     */
    public static long pow(long a, long b) {
        if (b == 0) {
            return 1;
        }
        long half = pow(a, b >> 1);
        if ((a & 1) == 0) {
            return mul(half, half);
        } else {
            return mul(half, half, a);
        }
    }
}


class Monoid<T> {
    public static final Monoid<Long> ADD = new Monoid<>( 0l, Long::sum);
    public static final Monoid<Long> MAX = new Monoid<>(-Const.LINF, Long::max);
    public static final Monoid<Long> MIN = new Monoid<>( Const.LINF, Long::min);
    public static final Monoid<Long> RW  = new Monoid<>( Const.LINF, (u, v) -> v);
    public static final Monoid<Long> AND = new Monoid<>(-1l, (u, v) -> u & v);
    public static final Monoid<Long> OR  = new Monoid<>( 0l, (u, v) -> u | v);
    public static final Monoid<Long> XOR = new Monoid<>( 0l, (u, v) -> u ^ v);
    public static final Monoid<Long> GCD = new Monoid<>( 0l, MathUtil::gcd);
    public static final Monoid<Long> ADD_MOD = new Monoid<>(0l, ModUtil::add);
    public static final Monoid<Long> MUL_MOD = new Monoid<>(1l, ModUtil::mul);
    
    public T e;
    public BinaryOperator<T> operator;

    public Monoid(T e, BinaryOperator<T> operator) {
        this.e = e;
        this.operator = operator;
    }

    public Monoid(BinaryOperator<T> operator) {
        this.e = null;
        this.operator = (u, v) -> {
            if (u == null) {
                return v;
            } else if (v == null) {
                return u;
            } else {
                return operator.apply(u, v);
            }
        };
    }
}


class SegmentTree {
    protected long[] tree;
    protected long e;
    protected BinaryOperator<Long> op;
    protected int treeSize;
    protected int leafs;
    protected int leafBias;
    protected int height;

    public SegmentTree(long[] t, Monoid<Long> monoid) {
        this(t, t.length, monoid);
    }

    public SegmentTree(int n, Monoid<Long> monoid) {
        this(new long[0], n, monoid);
    }

    protected SegmentTree(long[] t, int n, Monoid<Long> monoid) {
        this.e = monoid.e;
        this.op = monoid.operator;
        init(n);
        build(t);
    }

    private void init(int n) {
        this.height = MathUtil.minimumExponent(n);
        this.leafs = 1 << this.height;
        this.leafBias = this.leafs - 1;
        this.treeSize = 2 * this.leafs - 1;
        this.tree = new long[this.treeSize];
    }

    private void build(long[] t) {
        for (int i = 0; i < this.leafs; i++) {
            this.tree[this.leafBias + i] = i < t.length ? t[i] : this.e;
        }
        for (int i = this.leafBias - 1; i >= 0; i--) {
            this.tree[i] = op.apply(this.tree[2 * i + 1], this.tree[2 * i + 2]);
        }
    }

    public <E> void apply(int i, BiFunction<Long, E, Long> func, E v) {
        i += this.leafBias;
        tree[i] = func.apply(tree[i], v);
        while (i > 0) {
            i = (i - 1) >> 1;
            tree[i] = op.apply(tree[2 * i + 1], tree[2 * i + 2]);
        }
    }

    public long query(int l, int r) {
        return query(l, r, 0, 0, leafs);
    }

    protected long query(int ql, int qr, int k, int tl, int tr) {
        if (qr <= tl || tr <= ql) {
            return e;
        } else if (ql <= tl && tr <= qr) {
            return tree[k];
        } else {
            long lv = query(ql, qr, 2 * k + 1, tl, (tl + tr) >> 1);
            long rv = query(ql, qr, 2 * k + 2, (tl + tr) >> 1, tr);
            return op.apply(lv, rv);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int h = 0; h <= this.height; h++) {
            for (int i = (1 << h) - 1; i < (1 << (h + 1)) - 1; i++) {
                sb.append(this.tree[i] == e ? "e" : this.tree[i]).append(' ');
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}

class Const {
    public static final long MOD7 = 1_000_000_007;
    public static final long MOD9 = 1_000_000_009;
    public static final long MOD99 = 998_244_353;
    public static long MOD = MOD7;

    public static final long LINF = 1_000_000_000_000_000_000l;
    public static final int IINF = 1_000_000_000;
    public static final double DINF = 1e150;

    public static final double DELTA = 0.000_000_000_1;
    public static final double LDELTA = 0.000_001;

    public static void setMod(long mod) {
        MOD = mod;
    }
}


class MathUtil{
    /**
     * Enumarate primes equal to or less than n.
     * @param n
     * @return {@code ArrayList} that holds primes.
     */
    public static ArrayList<Integer> eratosthenes(int n) {
        int[] div = eratosthenesDivisors(n);
        ArrayList<Integer> result = new ArrayList<>();
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
    public static int[] eratosthenesDivisors(int n) {
        int[] divisors = new int[n + 1];
        if (n <= 0) return null;
        for (int i = 1; i <= n; i++) {
            if ((i & 1) != 0) divisors[i] = i;
            else divisors[i] = 2;
        }
        for (int i = 3; i <= n; i += 2) {
            if (divisors[i] == i) {
                for (long j = (long) i * i; j <= n; j += i << 1) {
                    divisors[(int) j] = i;
                }
            }
        }
        return divisors;
    }

    /**
     * Caluculate prime-factorization in O(sqrt(n)) time.
     * @param n
     * @return {@code HashMap} of {prime: index}
     */
    public static HashMap<Long, Integer> primeFactorization(long n) {
        HashMap<Long, Integer> primes = new HashMap<>();
        for (long p = 2; p * p <= n; p++) {
            int q = 0;
            while (n % p == 0) {
                n /= p;
                q++;
            }
            if (q > 0) primes.put(p, q);
        }
        if (n > 1) primes.put(n, 1);
        return primes;
    }

    private static HashMap<Long, Integer> lcm(HashMap<Long, Integer> amap, HashMap<Long, Integer> bmap) {
        if (amap.size() < bmap.size()) return lcm(bmap, amap);
        HashMap<Long, Integer> lcm = amap;
        for (Map.Entry<Long, Integer> e : bmap.entrySet()) {
            long prime = e.getKey();
            if (lcm.containsKey(prime)) lcm.put(prime, Math.max(lcm.get(prime), e.getValue()));
            else lcm.put(prime, e.getValue());
        }
        return lcm;
    }
    private static HashMap<Long, Integer> lcm(HashMap<Long, Integer> amap, long b) {
        HashMap<Long, Integer> bmap = primeFactorization(b);
        return lcm(amap, bmap);
    }
    public static HashMap<Long, Integer> lcm(long... a) {
        HashMap<Long, Integer> amap = new HashMap<>();
        for (long c : a) amap = lcm(amap, c);
        return amap;
    }

    /**
     * calculate lcm(a, b) fast. (NOT considering overflow.)
     */
    public static long unsafeLCM(long a, long b) {
        return a * b / gcd(a, b);
    }

    /**
     * Caluculate the GCD of (a, b)/
     * 
     * @param a first value
     * @param b second value
     * @return GCD(a, b)
     */
    public static long gcd(long a, long b) {
        if (a < b) return gcd(b, a);
        if (b == 0) return a;
        if (a == 0) return b;
        long r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }
    public static long gcd(long... a){
        long gcd = 0;
        for (long c : a) gcd = gcd(gcd, c);
        return gcd;
    }
    /**
     * Return one of the solutions to {@code ax+by=gcd(a, b)}.
     * @return {@code x}, {@code y}, {@code gcd(a, b)}.
     * @param a a of ax+by=gcd(a, b).
     * @param b b of ax+by=gcd(a, b). class ReferenceLong is a reference type of long.
     */
    public static long[] extGCD(long a, long b) {
        ReferenceLong x = new ReferenceLong();
        ReferenceLong y = new ReferenceLong();
        long[] ret = new long[3];
        ret[2] = extGCD(a, b, x, y);
        ret[0] = x.v;
        ret[1] = y.v;
        return ret;
    }
    private static long extGCD(long a, long b, ReferenceLong x, ReferenceLong y) {
        if (b == 0) {
            x.v = 1;
            y.v = 0;
            return a;
        }
        long d = extGCD(b, a % b, y, x);
        y.v -= a / b * x.v;
        return d;
    }
    private static class ReferenceLong {
        long v = 0;
    }

    public static boolean isPowerOfTwo(long n) {
        return (-n & n) == n;
    }

    public static int minimumExponent(long n) {
        return 63 - Long.numberOfLeadingZeros(n) + (isPowerOfTwo(n) ? 0 : 1);
    }

    public static int minimumExponent(int n) {
        return 31 - Integer.numberOfLeadingZeros(n) + (isPowerOfTwo(n) ? 0 : 1);
    }
    
    public static int minimumExponent(long n, int base) {
        if (base == 2) {
            return minimumExponent(n);
        }
        int i = 0;
        long m = 1;
        while (m < n) {
            i++;
            long r = m * base;
            if ((m | base) >> 31 != 0 && r / base != m) {
                break;
            }
            m = r;
        }
        return i;
    }
    
    /**
     * caluculate a ^ b NOT considering overflow.
     * so if you want to calculate a ^ b (mod p), use ModUtil.pow(a, b).
     * @param a base
     * @param b exponent
     * @return a ^ b
     */
    public static long pow(int a, int b) {
        if (b == 0) return 1;
        long half = pow(a, b >> 1);
        return half * half * ((b & 1) != 0 ? a : 1);
    }
}
