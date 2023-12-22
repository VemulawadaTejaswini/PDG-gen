import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.PrimitiveIterator;
import java.util.TreeSet;
import java.util.function.BinaryOperator;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongPredicate;
import java.util.function.LongUnaryOperator;


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
        long l = In.nl();
        long a = In.nl();
        long b = In.nl();
        long m = In.nl();
        
        long[] ld = new long[18];
        long[] rd = new long[18];
        long ten = 1;
        for (int d = 0; d < 18; d++) {
            ld[d] = bs(l, a, b, ten);
            rd[d] = bs(l, a, b, ten *= 10);
        }

        ModuloArithmetic ma = new ModuloArithmetic(m);
        ma.buildPower(10l, 18);
        LongSquareMatrixArithmetic lama = new LongSquareMatrixArithmetic(3, ma);
        LongSquareMatrix aa = lama.e1();
        for (int d = 0; d < 18; d++) {
            LongSquareMatrix mat = new LongSquareMatrix(new long[][]{{ma.pow(d + 1), b % m, a % m}, {0, 1, 1}, {0, 0, 1}});
            aa = lama.mul(lama.pow(mat, rd[d] - ld[d]), aa);
        }
        long ans = lama.mul(aa, new long[]{0, 0, 1})[0];
        out.append(ans);
    }

    public static long bs(long l, long a, long b, long val) {
        long lft = -1, rgt = l;
        while (rgt - lft > 1) {
            long mid = lft + ((rgt - lft) >> 1);
            if (a + b * mid < val) {
                lft = mid;
            } else {
                rgt = mid;
            }
        }
        return rgt;
    }
}



/**
 * @author https://atcoder.jp/users/suisen
 * 
 * (NON-DESTRUCTIVE) methods that returns long array.
 */
class LongArrayGenerator {

    private LongArrayGenerator(){}
    
    public static long[] filled(int n, long init) {
        long[] ret = new long[n];
        Arrays.fill(ret, init);
        return ret;
    }

    public static long[][] filled(int n, int m, long init) {
        long[][] ret = new long[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(ret[i], init);
        }
        return ret;
    }

    public static long[] indexToLong(int n, IntToLongFunction f) {
        long[] a = new long[n];
        Arrays.setAll(a, f);
        return a;
    }

    public static long[] toArray(Collection<? extends Number> collection) {
        int n = collection.size();
        long[] ret = new long[n];
        Object[] coll = collection.toArray();
        for (int i = 0; i < n; i++) {
            ret[i] = ((Number) coll[i]).longValue();
        }
        return ret;
    }

    public static long[] unique(long[] a) {
        HashSet<Long> set = new HashSet<>();
        for (long e : a) {
            set.add(e);
        }
        int m = set.size();
        long[] b = new long[m];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (set.contains(a[i])) {
                b[index++] = a[i];
                set.remove(a[i]);
            }
        }
        return b;
    }

    public static long[][] transpose(long[][] a) {
        int n = a.length;
        int m = a[0].length;
        long[][] ret = new long[m][n];
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                ret[j][i] = a[i][j];
            }
        }
        return ret;
    }

    public static long[] map(long[] a, LongUnaryOperator f) {
        long[] b = new long[a.length];
        Arrays.setAll(b, i -> f.applyAsLong(a[i]));
        return b;
    }

    public static long[] filter(long[] a, LongPredicate p) {
        LongArrayList ret = new LongArrayList();
        for (long e : a) {
            ret.addIf(e, p);
        }
        return ret.toArray();
    }

    public static long[] accumulate(long[] a, LongBinaryOperator op) {
        int n = a.length;
        long[] ret = new long[n];
        ret[0] = a[0];
        for (int i = 1; i < n; i++) {
            ret[i] = op.applyAsLong(ret[i - 1], a[i]);
        }
        return ret;
    }

    public static long[] accumulate(long[] a) {
        int n = a.length;
        long[] ret = new long[n];
        ret[0] = a[0];
        for (int i = 1; i < n; i++) {
            ret[i] = ret[i - 1] + a[i];
        }
        return ret;
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 * 
 * 1. DESTRUCTIVE methods for long arrays.
 * 2. methods that receives arrays and return some results (except for long arrays).
 */
class LongArrays {

    private LongArrays(){}

    public static void swap(long[] a, int u, int v) {
        long tmp = a[u];
        a[u] = a[v];
        a[v] = tmp;
    }

    public static void reverse(long[] a, int begin, int end) {
        for (int i = begin; i < begin + (end - begin) / 2; i++) {
            swap(a, i, begin + end - i - 1);
        }
    }

    public static void reverse(long[] a) {
        reverse(a, 0, a.length);
    }

    public static void sortDescending(long[] a) {
        Arrays.sort(a);
        reverse(a);
    }

    public static long reduce(long[] a, LongBinaryOperator op) {
        long ret = a[0];
        for (int i = 1; i < a.length; i++) {
            ret = op.applyAsLong(ret, a[i]);
        }
        return ret;
    }

    public static void map(long[] a, LongUnaryOperator op) {
        for (int i = 0; i < a.length; i++) {
            a[i] = op.applyAsLong(a[i]);
        }
    }

    public static void filter(long[] src, long[] dst, LongPredicate p) {
        int idx = 0;
        for (long e : src) {
            if (p.test(e)) {
                dst[idx++] = e;
            }
        }
    }

    public static void filterIndex(long[] dst, int beginIndex, int endIndex, LongPredicate p) {
        for (int i = beginIndex, idx = 0; i < endIndex; i++) {
            if (p.test(i)) {
                dst[idx++] = i;
            }
        }
    }

    public static void filterIndex(long dst[], int endIndex, LongPredicate p) {
        filterIndex(dst, 0, endIndex, p);
    }

    public static void accumulate(long[] a, LongBinaryOperator op) {
        for (int i = 1; i < a.length; i++) {
            a[i] = op.applyAsLong(a[i - 1], a[i]);
        }
    }

    public static void accumulate(long[] a) {
        for (int i = 1; i < a.length; i++) {
            a[i] += a[i - 1];
        }
    }

    public static int unique(long[] a) {
        HashSet<Long> set = new HashSet<>();
        for (long e : a) {
            set.add(e);
        }
        int m = set.size();
        long[] b = new long[m];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (set.contains(a[i])) {
                b[index++] = a[i];
                set.remove(a[i]);
            }
        }
        a = b;
        return m;
    }

    public static void transpose(long[][] a) {
        int n = a.length;
        int m = a[0].length;
        long[][] ret = new long[m][n];
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                ret[j][i] = a[i][j];
            }
        }
        a = ret;
    }

    public static int compare(long[] a, long[] b) {
        for (int i = 0; i < a.length; i++) {
            if (i >= b.length) {
                return -1;
            } else if (a[i] > b[i]) {
                return 1;
            } else if (a[i] < b[i]) {
                return -1;
            }
        }
        if (a.length < b.length) {
            return 1;
        } else {
            return 0;
        }
    }

    public static boolean equals(long[] a, long[] b) {
        return compare(a, b) == 0;
    }

    public static String join(long[] a, String sep) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
            if (i < a.length - 1) {
                sb.append(sep);
            }
        }
        return sb.toString();
    }

    public static String joinWithPrefixAndSuffix(long[] a, IntFunction<String> idxToPre, IntFunction<String> idxToSuf, String sep) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(idxToPre.apply(i)).append(a[i]).append(idxToSuf.apply(i));
            if (i < a.length - 1) {
                sb.append(sep);
            }
        }
        return sb.toString();
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
class Monoid<T> {
    public T e;
    private BinaryOperator<T> operator;

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

    public T apply(T t, T u) {
        return operator.apply(t, u);
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
class LongAlgebraicStructure {
    public static final LongAbelianGroup ADDL = new LongAbelianGroup(0l, (u, v) -> u + v, x -> -x);
    public static final LongAbelianGroup XORL = new LongAbelianGroup(0l, (u, v) -> u ^ v, x -> x);

    public static final LongMonoid MULL = new LongMonoid( 1l, (u, v) -> u * v);
    public static final LongMonoid MAXL = new LongMonoid(-Const.LINF, Long::max);
    public static final LongMonoid MINL = new LongMonoid( Const.LINF, Long::min);
    public static final LongMonoid RWL  = new LongMonoid( Const.LINF, (u, v) -> v);
    public static final LongMonoid ANDL = new LongMonoid(-1l, (u, v) -> u & v);
    public static final LongMonoid ORL  = new LongMonoid( 0l, (u, v) -> u | v);
    public static final LongMonoid GCDL = new LongMonoid( 0l, MathUtil::gcd);

    public static final LongRing ADD_MULL = new LongRing(ADDL, MULL);
    public static final LongRing XOR_ANDL = new LongRing(XORL, ANDL);
}


/**
 * @author https://atcoder.jp/users/suisen
 */
class ModuloArithmetic extends LongField {
    public final long MOD;
    private long[] fact;
    private long[] pow;

    /**
     * support modulo p arithmetic
     * 
     * @param p p s.t. p is a prime number.
     */
    public ModuloArithmetic(long p) {
        super(
            new LongAbelianGroup(0l, (u, v) -> add(u, v, p), x -> -x),
            new LongAbelianGroup(1l, (u, v) -> mul(u, v, p), x -> inv(x, p))
        );
        this.MOD = p;
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a + b mod p.
     * 
     * @param a
     * @param b
     * @param mod
     * @return x s.t. 0 <= x < MOD /\ x = a + b mod p.
     */
    private static long add(long a, long b, long mod) {
        long s = a + b;
        return s < 0 ? s + mod : s >= mod ? s - mod : s;
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a * b mod p.
     * 
     * @param a
     * @param b
     * @param mod
     * @return x s.t. 0 <= x < MOD /\ x = a * b mod p.
     */
    private static long mul(long a, long b, long mod) {
        long ret = (a * b) % mod;
        return ret < 0 ? ret + mod : ret;
    }

    /**
     * Calculate the value b s.t. a*b mod MOD = 1.
     * 
     * @param a
     * @return inverse of a
     */
    private static long inv(long a, long mod) {
        long b = mod;
        long u = 1, v = 0;
        while (b >= 1) {
            long t = a / b;
            a -= t * b;
            long tmp1 = a; a = b; b = tmp1;
            u -= t * v;
            long tmp2 = u; u = v; v = tmp2;
        }
        u %= mod;
        return u < 0 ? u + mod : u;
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a mod p.
     * 
     * @param a
     * @return x s.t. 0 <= x < MOD /\ x = a mod p.
     */
    public long mod(long a) {
        a %= MOD;
        return a < 0 ? a + MOD : a;
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a_1 + 1_2 + ... + a_k mod p.
     * 
     * @param a
     * @return x s.t. 0 <= x < MOD /\ x = a_1 + 1_2 + ... + a_k mod p.
     */
    public long sum(long... a) {
        long ret = 0;
        for (long c : a) ret += c;
        return mod(ret);
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a + b mod p.
     * 
     * @param a
     * @param b
     * @return x s.t. 0 <= x < MOD /\ x = a + b mod p.
     */
    public long add(long a, long b) {
        long s = a + b;
        return s < 0 ? s + MOD : s >= MOD ? s - MOD : s;
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a - b mod p.
     * 
     * @param a
     * @param b
     * @return x s.t. 0 <= x < MOD /\ x = a - b mod p.
     */
    public long sub(long a, long b) {
        long s = a - b;
        return s < 0 ? s + MOD : s >= MOD ? s - MOD : s;
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a_1 * 1_2 * ... * a_k mod p.
     * 
     * @param a
     * @return x s.t. 0 <= x < MOD /\ x = a_1 * 1_2 * ... * a_k mod p.
     */
    public long prod(long... a) {
        long ret = 1;
        for (long c : a) {
            ret = (ret * c) % MOD;
        }
        return ret < 0 ? ret + MOD : ret;
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a * b mod p.
     * 
     * @param a
     * @param b
     * @return x s.t. 0 <= x < MOD /\ x = a * b mod p.
     */
    public long mul(long a, long b) {
        return mod(a * b);
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ b * x = a mod p.
     * 
     * @param a
     * @param b
     * @return x s.t. 0 <= x < MOD /\ b * x = a mod p.
     */
    public long div(long a, long b) {
        return mul(a, inv(b));
    }

    /**
     * Calculate the value b s.t. a*b mod MOD = 1.
     * 
     * @param a
     * @return inverse of a
     */
    public long inv(long a) {
        long b = MOD;
        long u = 1, v = 0;
        while (b >= 1) {
            long t = a / b;
            a -= t * b;
            long tmp1 = a; a = b; b = tmp1;
            u -= t * v;
            long tmp2 = u; u = v; v = tmp2;
        }
        return mod(u);
    }

    /**
     * Calculate the permutation nPr.
     * 
     * @param n
     * @param r
     * @return nPr
     */
    public long perm(long n, long r) {
        if (n < r) {
            return 0;
        }
        if (fact != null && n <= fact.length) {
            return div(fact[(int) n], fact[(int) (n - r)]);
        }
        long ret = 1;
        for (long i = n; i > n - r; i--) {
            ret = mul(ret, i);
        }
        return ret;
    }

    /**
     * Calculate the combination nCr.
     * 
     * @param n
     * @param r
     * @return nCr
     */
    public long comb(long n, long r) {
        if (n < r) {
            return 0;
        }
        if (fact != null && n <= fact.length) {
            return div(fact[(int) n], mul(fact[(int) (n - r)], fact[(int) r]));
        }
        r = Math.min(r, n - r);
        long res = 1;
        for (long d = 1; d <= r; d++) {
            res = div(mul(res, n--), d);
        }
        return res;
    }
    
    /**
     * call this method after building factorial array.
     * 
     * @param n
     * @return n! mod p
     */
    public long fact(int n) {
        return fact[n];
    }

    /**
     * call this nethod after building power array.
     * 
     * @param n
     * @return (base)^n
     */
    public long pow(int n) {
        return pow[n];
    }

    /**
     * Calculate a^b (mod {@code MOD}) in O(log b) time.
     * 
     * @param a base
     * @param b index
     * @return a^b (mod {@code MOD})
     */
    public long pow(long a, long b) {
        if (b == 0) {
            return 1;
        }
        long half = pow(a, b >> 1);
        if ((b & 1) == 0) {
            return mul(half, half);
        } else {
            return prod(half, half, a);
        }
    }

    /**
     * build factorial array from 0 to n (closed)
     * 
     * @param n
     */
    public void buildFactorial(int n) {
        this.fact = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i <= 1) {
                fact[i] = 1;
            } else {
                fact[i] = mul(fact[i - 1], i);
            }
        }
    }

    /**
     * build power array based on a from 0 to n (closed)
     * 
     * @param a base of power
     * @param n
     */
    public void buildPower(long a, int n) {
        if (a == 2) {
            buildPower(n);
        } else {
            this.pow = new long[n + 1];
            for (int i = 0; i <= n; i++) {
                if (i == 0) {
                    pow[i] = 1;
                } else {
                    pow[i] = mul(pow[i - 1], a);
                }
            }
        }
    }

    /**
     * build power array based on 2 from 0 to n (closed)
     * 
     * @param n
     */
    public void buildPower(int n) {
        this.pow = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                pow[i] = 1;
            } else {
                pow[i] = pow[i - 1] << 1;
                if (pow[i] >= MOD) {
                    pow[i] -= MOD;
                }
            }
        }
    }
}

/**
 * @author https://atcoder.jp/users/suisen
 */
class LongSemiRing {
    public long e0;
    public long e1;

    private LongMonoid addition;
    private LongMonoid muliplication;

    public LongSemiRing(LongMonoid addition, LongMonoid multiplication) {
        this.addition = addition;
        this.muliplication = multiplication;
        this.e0 = addition.e;
        this.e1 = multiplication.e;
    }

    public long add(long t, long u) {
        return addition.apply(t, u);
    }

    public long mul(long t, long u) {
        return muliplication.apply(t, u);
    }
}

/**
 * @author https://atcoder.jp/users/suisen
 */
class LongField extends LongRing{
    private LongAbelianGroup multiplication;

    public LongField(LongAbelianGroup addition, LongAbelianGroup multiplication) {
        super(addition, multiplication);
        this.multiplication = multiplication;
    }

    public long multiplicativeInverse(long t) {
        return multiplication.inverse(t);
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
class LongGroup extends LongMonoid {
    private LongUnaryOperator inv;

    public LongGroup(long e, LongBinaryOperator operator, LongUnaryOperator inv) {
        super(e, operator);
        this.inv = inv;
    }

    public long inverse(long t) {
        return inv.applyAsLong(t);
    }
}



/**
 * @author https://atcoder.jp/users/suisen
 */
class LongArrayList implements Iterable<Long> {
    private long[] a;
    private int tail = 0;

    private static final int DEFAULT_SIZE = 64;

    public LongArrayList(int capacity) {
        this.a = new long[Math.max(1, capacity)];
    }

    public LongArrayList() {
        this(DEFAULT_SIZE);
    }

    public void add(long v) {
        if (tail == a.length) {
            resize();
        }
        a[tail++] = v;
    }

    public long removeLast() {
        return a[tail--];
    }

    public long get(int i) {
        if (i >= a.length) {
            System.err.println("Error in LongArrayList::get(" + i + "): ArrayIndexOutOfBounds. list size = " + a.length);
        }
        return a[i];
    }

    public void set(int i, long v) {
        if (i >= a.length) {
            System.err.println("Error in LongArrayList::set(" + i + "): ArrayIndexOutOfBounds. list size = " + a.length);
        }
        a[i] = v;
    }

    private void resize() {
        long[] b = new long[a.length << 1];
        System.arraycopy(a, 0, b, 0, a.length);
        a = b;
    }

    public int size() {
        return tail;
    }

    public void reverse(int begin, int end) {
        LongArrays.reverse(a, begin, end);
    }

    public void reverse() {
        LongArrays.reverse(a, 0, tail);
    }

    public long[] toArray() {
        long[] ret = new long[tail];
        System.arraycopy(a, 0, ret, 0, tail);
        return ret;
    }

    public boolean addIf(long v, LongPredicate p) {
        if (p.test(v)) {
            add(v);
            return true;
        }
        return false;
    }

    public PrimitiveIterator.OfLong iterator() {
        return new LongArrayListIterator();
    }

    private class LongArrayListIterator implements PrimitiveIterator.OfLong {
        private int i = 0;
        
        public boolean hasNext() {
            return i < tail;
        }

        public long nextLong() {
            return a[i++];
        }
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
class LongMatrix {
    public final int r;
    public final int c;

    protected long[] a;

    public LongMatrix(int r, int c, long init) {
        this.r = r;
        this.c = c;
        this.a = LongArrayGenerator.filled(r * c, init);
    }

    public LongMatrix(int r, int c) {
        this(r, c, 0);
    }

    public LongMatrix(long[][] a) {
        this.r = a.length;
        this.c = a[0].length;
        this.a = new long[r * c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                this.a[i * this.c + j] = a[i][j];
            }
        }
    }

    protected LongMatrix(long[] a, int r, int c) {
        this.r = r;
        this.c = c;
        this.a = a.clone();
    }

    public long get(int i, int j) {
        return a[i * c + j];
    }

    public void set(int i, int j, long v) {
        a[i * c + j] = v;
    }

    public long[][] toArray() {
        long[][] ret = new long[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ret[i][j] = a[i * c + j];
            }
        }
        return ret;
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
class In {
    public static final FastScanner fsc = new FastScanner();

    public static int ni() {
        return fsc.nextInt();
    }

    public static int ni(IntUnaryOperator f) {
        return f.applyAsInt(fsc.nextInt());
    }

    public static int[] ni(int n) {
        int[] a = new int[n];
        Arrays.setAll(a, i -> fsc.nextInt());
        return a;
    }

    public static int[] ni (int n, IntUnaryOperator f) {
        int[] a = new int[n];
        Arrays.setAll(a, i -> ni(f));
        return a;
    }

    public static int[][] ni(int n, int m) {
        int[][] a = new int[n][m];
        Arrays.setAll(a, i -> ni(m));
        return a;
    }

    public static int[][] ni(int n, int m, IntUnaryOperator f) {
        int[][] a = new int[n][m];
        Arrays.setAll(a, i -> ni(m, f));
        return a;
    }

    public static long nl() {
        return fsc.nextLong();
    }

    public static long nl(LongUnaryOperator f) {
        return f.applyAsLong(fsc.nextLong());
    }

    public static long[] nl(int n) {
        long[] a = new long[n];
        Arrays.setAll(a, i -> fsc.nextLong());
        return a;
    }

    public static long[] nl(int n, LongUnaryOperator f) {
        long[] a = new long[n];
        Arrays.setAll(a, i -> nl(f));
        return a;
    }

    public static long[][] nl(int n, int m) {
        long[][] a = new long[n][m];
        Arrays.setAll(a, i -> nl(m));
        return a;
    }

    public static long[][] nl(int n, int m, LongUnaryOperator f) {
        long[][] a = new long[n][m];
        Arrays.setAll(a, i -> nl(m, f));
        return a;
    }

    public static char[] nc() {
        return fsc.next().toCharArray();
    }

    public static char[][] nc(int n, int m) {
        char[][] c = new char[n][m];
        Arrays.setAll(c, i -> nc());
        return c;
    }

    public static double nd() {
        return fsc.nextDouble();
    }

    public static double nd(DoubleUnaryOperator f) {
        return f.applyAsDouble(fsc.nextDouble());
    }

    public static double[] nd(int n) {
        double[] a = new double[n];
        Arrays.setAll(a, i -> fsc.nextDouble());
        return a;
    }

    public static double[] nd(int n, DoubleUnaryOperator f) {
        double[] a = new double[n];
        Arrays.setAll(a, i -> nd(f));
        return a;
    }

    public static double[][] nd(int n, int m) {
        double[][] a = new double[n][m];
        Arrays.setAll(a, i -> nd(m));
        return a;
    }

    public static double[][] nd(int n, int m, DoubleUnaryOperator f) {
        double[][] a = new double[n][m];
        Arrays.setAll(a, i -> nd(m, f));
        return a;
    }

    public static String ns() {
        return fsc.next();
    }

    public static String[] ns(int n) {
        String[] s = new String[n];
        Arrays.setAll(s, i -> ns());
        return s;
    }

    public static boolean[][] grid(int h, int w, char trueCharacter) {
        boolean[][] grid = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            char[] s = fsc.next().toCharArray();
            for (int j = 0; j < w; j++) {
                grid[i][j] = s[j] == trueCharacter;
            }
        }
        return grid;
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


/**
 * @author https://atcoder.jp/users/suisen
 */
class LongMonoid {
    public long e;
    private LongBinaryOperator operator;

    public LongMonoid(long e, LongBinaryOperator operator) {
        this.e = e;
        this.operator = operator;
    }

    public long apply(long t, long u) {
        return operator.applyAsLong(t, u);
    }
}

/**
 * @author https://atcoder.jp/users/suisen
 */
class LongSquareMatrix extends LongMatrix {
    public final int n;

    public LongSquareMatrix(int n, long init) {
        super(n, n, init);
        this.n = n;
    }

    public LongSquareMatrix(int n) {
        this(n, 0);
    }

    public LongSquareMatrix(long[][] a) {
        super(a);
        this.n = a.length;
    }

    public LongSquareMatrix(long[] a, int n) {
        super(a, n, n);
        this.n = n;
    }

    public double det() {
        double ret = 1.;
        double[][] mat = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = get(i, j);
            }
        }
        double eps = 1e-15;
        boolean swap = false;
        for (int i = 0; i < n; i++) {
            double m = mat[i][i];
            int mj = i;
            for (int j = i + 1; j < n; j++) {
                double v = mat[j][i];
                if (Math.abs(v) > Math.abs(m)) {
                    m = v;
                    mj = j;
                }
            }
            if (Math.abs(m) < eps) {
                return 0;
            }
            ret *= m;
            if (mj != i) {
                double[] tmp = new double[n];
                System.arraycopy(mat[i], 0, tmp, 0, n);
                System.arraycopy(mat[mj], 0, mat[i], 0, n);
                System.arraycopy(tmp, 0, mat[mj], 0, n);
                swap = !swap;
            }
            for (int j = i + 1; j < n; j++) {
                double r = mat[j][i] / mat[i][i];
                for (int k = i; k < n; k++) {
                    mat[j][k] -= mat[i][k] * r;
                }
            }
        }
        return swap ? -ret : ret;
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
class MathUtil{
    private static final long UNDER32_MASK = 0xffff_ffffl;

    private MathUtil(){}
    
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

    public static TreeSet<Long> divisors(long n) {
        TreeSet<Long> divisors = new TreeSet<>();
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
                divisors.add(n / i);
            }
        }
        return divisors;
    }

    private static HashMap<Long, Integer> lcmMap(HashMap<Long, Integer> amap, HashMap<Long, Integer> bmap) {
        if (amap.size() < bmap.size()) return lcmMap(bmap, amap);
        HashMap<Long, Integer> lcm = amap;
        for (Map.Entry<Long, Integer> e : bmap.entrySet()) {
            long prime = e.getKey();
            if (lcm.containsKey(prime)) lcm.put(prime, Math.max(lcm.get(prime), e.getValue()));
            else lcm.put(prime, e.getValue());
        }
        return lcm;
    }

    private static HashMap<Long, Integer> lcmMap(HashMap<Long, Integer> amap, long b) {
        HashMap<Long, Integer> bmap = primeFactorization(b);
        return lcmMap(amap, bmap);
    }

    public static HashMap<Long, Integer> lcmMap(long... a) {
        HashMap<Long, Integer> amap = new HashMap<>();
        for (long c : a) amap = lcmMap(amap, c);
        return amap;
    }

    /**
     * calculate lcm(a, b) fast. (NOT considering overflow.)
     */
    public static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
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
        long[] ret = new long[3];
        long[] xy = new long[2];
        ret[2] = extGCD(a, b, xy);
        ret[0] = xy[0];
        ret[1] = xy[1];
        return ret;
    }

    private static long extGCD(long a, long b, long[] xy) {
        if (b == 0) {
            xy[0] = 1;
            xy[1] = 0;
            return a;
        }
        long tmp = xy[0];
        xy[0] = xy[1];
        xy[1] = tmp;
        long d = extGCD(b, a % b, xy);
        xy[1] -= a / b * xy[0];
        return d;
    }
    
    /**
     * caluculate a ^ b NOT considering overflow.
     * so if you want to calculate a ^ b (mod p), use ModUtil.pow(a, b).
     * @param a base
     * @param b exponent
     * @return a ^ b
     */
    public static long pow(int a, long b) {
        long ret = 1l;
        for (long c = 1, ac = a; b > 0; ac *= ac, c <<= 1) {
            if ((-b & b) == c) {
                ret *= ac;
                b &= ~(-b & b);
            }
        }
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
        long res = 1;
        for (long d = 1; d <= r; d++, n--) res *= n / d;
        return res;
    }

    public static long int2ToLong(int upper, int lower) {
        return ((long) upper << Integer.SIZE) | lower;
    }

    public static int upper32(long l) {
        return (int) (l >>> Integer.SIZE);
    }

    public static int lower32(long l) {
        return (int) (l & UNDER32_MASK);
    }
}

/**
 * @author https://atcoder.jp/users/suisen
 */
class SemiRing<T> {
    public T e0;
    public T e1;

    private Monoid<T> addition;
    private Monoid<T> muliplication;

    public SemiRing(Monoid<T> addition, Monoid<T> multiplication) {
        this.addition = addition;
        this.muliplication = multiplication;
        this.e0 = addition.e;
        this.e1 = multiplication.e;
    }

    public T add(T t, T u) {
        return addition.apply(t, u);
    }

    public T mul(T t, T u) {
        return muliplication.apply(t, u);
    }
}

/**
 * @author https://atcoder.jp/users/suisen
 */
class LongRing extends LongSemiRing{
    private LongAbelianGroup addition;

    public LongRing(LongAbelianGroup addition, LongMonoid multiplication) {
        super(addition, multiplication);
        this.addition = addition;
    }

    public long additiveInverse(long t) {
        return addition.inverse(t);
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
class LongAbelianGroup extends LongGroup{
    public LongAbelianGroup(long e, LongBinaryOperator operator, LongUnaryOperator inv) {
        super(e, operator, inv);
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
class LongSquareMatrixArithmetic extends SemiRing<LongSquareMatrix> {
    private final LongSemiRing semiRing;
    private final int n;
    private final LongSquareMatrix e0;
    private final LongSquareMatrix e1;

    public LongSquareMatrixArithmetic(int n, LongSemiRing semiRing) {
        super(
            new Monoid<>(e0(n, semiRing), (u, v) -> add(u, v, semiRing)), 
            new Monoid<>(e1(n, semiRing), (u, v) -> mul(u, v, semiRing))
        );
        this.n = n;
        this.semiRing = semiRing;
        this.e0 = super.e0;
        this.e1 = super.e1;
    }

    public LongSquareMatrixArithmetic(int n) {
        this(n, LongAlgebraicStructure.ADD_MULL);
    }

    private static LongSquareMatrix add(LongSquareMatrix a, LongSquareMatrix b, LongSemiRing semiRing) {
        int n = a.n;
        LongSquareMatrix ret = new LongSquareMatrix(n, semiRing.e0);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ret.set(i, j, semiRing.add(a.get(i, j), b.get(i, j)));
            }
        }
        return ret;
    }

    private static LongSquareMatrix mul(LongSquareMatrix a, LongSquareMatrix b, LongSemiRing semiRing) {
        int n = a.n;
        LongSquareMatrix ret = new LongSquareMatrix(n, semiRing.e0);
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                for (int j = 0; j < n; j++) {
                    ret.set(i, j, semiRing.add(ret.get(i, j), semiRing.mul(a.get(i, k), b.get(k, j))));
                }
            }
        }
        return ret;
    }

    private static LongSquareMatrix e0(int n, LongSemiRing semiRing) {
        return new LongSquareMatrix(n, semiRing.e0);
    }

    private static LongSquareMatrix e1(int n, LongSemiRing semiRing) {
        LongSquareMatrix ret = new LongSquareMatrix(n, semiRing.e0);
        for (int i = 0; i < n; i++) {
            ret.set(i, i, semiRing.e1);
        }
        return ret;
    }

    public LongSquareMatrix e0() {
        return e0(n, semiRing);
    }

    public LongSquareMatrix e1() {
        return e1(n, semiRing);
    }

    public LongSquareMatrix add(LongSquareMatrix a, LongSquareMatrix b) {
        LongSquareMatrix ret = e0();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ret.set(i, j, semiRing.add(a.get(i, j), b.get(i, j)));
            }
        }
        return ret;
    }

    public LongSquareMatrix mul(LongSquareMatrix a, LongSquareMatrix b) {
        LongSquareMatrix ret = e0();
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                for (int j = 0; j < n; j++) {
                    ret.set(i, j, semiRing.add(ret.get(i, j), semiRing.mul(a.get(i, k), b.get(k, j))));
                }
            }
        }
        return ret;
    }

    public LongSquareMatrix pow(LongSquareMatrix a, long b) {
        LongSquareMatrix ret = e1();
        LongSquareMatrix pow = a;
        for (long c = 1 ; b > 0; pow = mul(pow, pow), c <<= 1) {
            if ((-b & b) == c) {
                ret = mul(ret, pow);
                b &= ~(-b & b);
            }
        }
        return ret;
    }

    public long[] mul(LongSquareMatrix a, long[] x) {
        long[] y = LongArrayGenerator.filled(n, semiRing.e0);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                y[i] = semiRing.add(y[i], semiRing.mul(a.get(i, j), x[j]));
            }
        }
        return y;
    }
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

    public static final String YES = "YES";
    public static final String NO = "NO";
    public static final String Yes = "Yes";
    public static final String No = "No";
    public static final String POSSIBLE = "POSSIBLE";
    public static final String IMPOSSIBLE = "IMPOSSIBLE";
    public static final String Possible = "Possible";
    public static final String Impossible = "Impossible";

    public static final int[] dx8 = {1, 0, -1, 0, 1, -1, -1, 1};
    public static final int[] dy8 = {0, 1, 0, -1, 1, 1, -1, -1};
    public static final int[] dx = {1, 0, -1, 0};
    public static final int[] dy = {0, 1, 0, -1};

    private Const(){}
}
