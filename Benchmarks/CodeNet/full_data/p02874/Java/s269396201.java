import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeSet;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
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
        int n = In.ni();
        int[] l = new int[n];
        int[] r = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = In.ni();
            r[i] = In.ni();
        }
        DependentSort.sortDescending(l, r);
        int max = 0;
        int l1 = l[0];
        IntSparseTable t = new IntSparseTable(r, IntAlgebraicStructures.MIN);
        for (int i = 1; i < n; i++) {
            int l2 = l[i];
            int r1 = t.query(0, i);
            int r2 = r[i];
            int mr = t.query(i + 1, n);
            int v1 = (r1 - l1 + 1) + (Math.min(mr, r2) - l2 + 1);
            int v2 = (Math.min(mr, r1) - l1 + 1) + (r2 - l2 + 1);
            int v = Math.max(v1, v2);
            max = Math.max(max, v);
        }
        out.append(max);
    }
}

final class InsertionSort {
    protected static void sort(final int[] a) {
        sort(a, 0, a.length);
    }

    protected static void sort(final int[] a, final int from, final int to) {
        for (int i = from + 1; i < to; i++) {
            final int tmp = a[i];
            if (a[i - 1] > tmp) {
                int j = i;
                do {
                    a[j] = a[j - 1];
                    j--;
                } while (j > from && a[j - 1] > tmp);
                a[j] = tmp;
            }
        }
    }

    protected static void sort(final long[] a) {
        sort(a, 0, a.length);
    }

    protected static void sort(final long[] a, final int from, final int to) {
        for (int i = from + 1; i < to; i++) {
            final long tmp = a[i];
            if (a[i - 1] > tmp) {
                int j = i;
                do {
                    a[j] = a[j - 1];
                    j--;
                } while (j > from && a[j - 1] > tmp);
                a[j] = tmp;
            }
        }
    }
}



class IntAlgebraicStructures {
    
    private IntAlgebraicStructures(){}

    public static final IntAbelianGroup ADD = new IntAbelianGroup(Integer::sum, 0, e -> -e);
    public static final IntAbelianGroup XOR = new IntAbelianGroup((u, v) -> u ^ v, 0, x -> x);
    public static final IntBoundedSemiLattice MAX = new IntBoundedSemiLattice(Integer::max, -Const.IINF);
    public static final IntBoundedSemiLattice MIN = new IntBoundedSemiLattice(Integer::min, Const.IINF);
    public static final IntBoundedSemiLattice AND = new IntBoundedSemiLattice((u, v) -> u & v, 0xffff_ffff);
    public static final IntBoundedSemiLattice OR = new IntBoundedSemiLattice((u, v) -> u | v, 0);
    public static final IntBoundedSemiLattice GCD = new IntBoundedSemiLattice((u, v) -> (int) MathUtil.gcd(u, v), 0);
    public static final IntCommutativeMonoid MUL = new IntCommutativeMonoid((u, v) -> u * v, 1);
    public static final Rewrite RW = new Rewrite((u, v) -> v, -Const.IINF - 1);

    public static final IntField ADD_MUL = new IntField(ADD, MUL);
    public static final IntField XOR_AND = new IntField(XOR, AND);

    private static final class Rewrite extends IntMonoid {
        public Rewrite(final IntBinaryOperator operator, final int e) {
            super(operator, e);
            addProperties(Property.IDEMPOTENT);
        }
    }
}

@FunctionalInterface
interface LongComparator {
    public int compare(long i, long j);

    public default boolean eq(final long i, final long j) {
        return compare(i, j) == 0;
    }

    public default boolean ne(final long i, final long j) {
        return compare(i, j) != 0;
    }

    public default boolean gt(final long i, final long j) {
        return compare(i, j) > 0;
    }

    public default boolean ge(final long i, final long j) {
        return compare(i, j) >= 0;
    }

    public default boolean lt(final long i, final long j) {
        return compare(i, j) < 0;
    }

    public default boolean le(final long i, final long j) {
        return compare(i, j) <= 0;
    }
}


final class ComparativeMergeSort {
    private static int INSERTION_SORT_THRESHOLD = 60;

    public static void sort(final int[] a, final IntComparator comparator) {
        sort(a, 0, a.length, comparator);
    }

    public static void sort(final int[] a, final int begin, final int end, final IntComparator comparator) {
        for (int i = begin;;) {
            final int j = i + INSERTION_SORT_THRESHOLD;
            if (j < end) {
                ComparativeInsertionSort.sort(a, i, j, comparator);
            } else {
                ComparativeInsertionSort.sort(a, i, end, comparator);
                break;
            }
            i = j;
        }
        final int len = end - begin;
        final int[] work = new int[len];
        for (int block = INSERTION_SORT_THRESHOLD; block <= len; block <<= 1) {
            final int twoBlocks = block << 1;
            for (int from = begin, max = end - block; from < max; from += twoBlocks) {
                final int mid = from + block;
                final int to = Math.min(from + twoBlocks, end);
                System.arraycopy(a, from, work, 0, block);
                for (int i = from, wi = 0, ti = mid;; i++) {
                    if (ti == to) {
                        System.arraycopy(work, wi, a, i, block - wi);
                        break;
                    } else if (comparator.gt(work[wi], a[ti])) {
                        a[i] = a[ti++];
                    } else {
                        a[i] = work[wi++];
                        if (wi == block) {
                            break;
                        }
                    }
                }
            }
        }
    }

    public static void sort(final long[] a, final LongComparator comparator) {
        sort(a, 0, a.length, comparator);
    }

    public static void sort(final long[] a, final int begin, final int end, final LongComparator comparator) {
        for (int i = begin;;) {
            final int j = i + INSERTION_SORT_THRESHOLD;
            if (j < end) {
                ComparativeInsertionSort.sort(a, i, j, comparator);
            } else {
                ComparativeInsertionSort.sort(a, i, end, comparator);
                break;
            }
            i = j;
        }
        final int len = end - begin;
        final long[] work = new long[len];
        for (int block = INSERTION_SORT_THRESHOLD; block <= len; block <<= 1) {
            final int twoBlocks = block << 1;
            for (int from = begin, max = end - block; from < max; from += twoBlocks) {
                final int mid = from + block;
                final int to = Math.min(from + twoBlocks, end);
                System.arraycopy(a, from, work, 0, block);
                for (int i = from, wi = 0, ti = mid;; i++) {
                    if (ti == to) {
                        System.arraycopy(work, wi, a, i, block - wi);
                        break;
                    } else if (comparator.gt(work[wi], a[ti])) {
                        a[i] = a[ti++];
                    } else {
                        a[i] = work[wi++];
                        if (wi == block) {
                            break;
                        }
                    }
                }
            }
        }
    }
}


final class FastScanner {
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
            } catch (final IOException e) {
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

    private static boolean isPrintableChar(final int c) {
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
        final StringBuilder sb = new StringBuilder();
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
        final long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
            throw new NumberFormatException();
        }
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}

interface IntInversible {
    public int inverse(int t);
}

@FunctionalInterface
interface IntComparator {
    public int compare(int i, int j);

    public default boolean eq(final int i, final int j) {
        return compare(i, j) == 0;
    }

    public default boolean ne(final int i, final int j) {
        return compare(i, j) != 0;
    }

    public default boolean gt(final int i, final int j) {
        return compare(i, j) > 0;
    }

    public default boolean ge(final int i, final int j) {
        return compare(i, j) >= 0;
    }

    public default boolean lt(final int i, final int j) {
        return compare(i, j) < 0;
    }

    public default boolean le(final int i, final int j) {
        return compare(i, j) <= 0;
    }
}

enum Property {
    ANNIHILATED_BY_ZERO,
    ASSOCIATIVE,
    CANCELLATIVE,
    COMMUTATIVE,
    DISTRIBUTIVE,
    IDEMPOTENT;
}

final class DependentSort {
    public static void sort(int[] a, Object... dependentArrays) {
        sort(a, false, dependentArrays);
    }

    public static void sortDescending(int[] a, Object... dependentArrays) {
        sort(a, true, dependentArrays);
    }

    private static void sort(int[] a, boolean descending, Object... dependentArrays) {
        int n = a.length;
        int[] p;
        if (descending) {
            p = IndexSort.sortDescending(a);
            RadixSort.sortDescending(a);
        } else {
            p = IndexSort.sort(a);
            RadixSort.sort(a);
        }
        boolean[] settled = new boolean[n];
        boolean ok = true;
        for (Object obj : dependentArrays) {
            if (obj instanceof int[]) {
                int[] arr = (int[]) obj;
                for (int i = 0; i < n; i++) {
                    for (int j = i; ok ^ settled[j]; j = p[j]) {
                        if (p[j] == i) {
                            settled[j] = !settled[j];
                            break;
                        }
                        int tmp = arr[j];
                        arr[j] = arr[p[j]];
                        arr[p[j]] = tmp;
                        settled[j] = !settled[j];
                    }
                }
            } else if (obj instanceof long[]) {
                long[] arr = (long[]) obj;
                for (int i = 0; i < n; i++) {
                    for (int j = i; ok ^ settled[j]; j = p[j]) {
                        if (p[j] == i) {
                            settled[j] = !settled[j];
                            break;
                        }
                        long tmp = arr[j];
                        arr[j] = arr[p[j]];
                        arr[p[j]] = tmp;
                        settled[j] = !settled[j];
                    }
                }
            } else {
                throw new UnsupportedOperationException("dependent objects musst be int[] or long[] type.");
            }
            ok = !ok;
        }
    }

    public static void sort(long[] a, Object... dependentArrays) {
        sort(a, false, dependentArrays);
    }

    public static void sortDescending(long[] a, Object... dependentArrays) {
        sort(a, true, dependentArrays);
    }

    private static void sort(long[] a, boolean descending, Object... dependentArrays) {
        int n = a.length;
        int[] p;
        if (descending) {
            p = IndexSort.sortDescending(a);
            RadixSort.sortDescending(a);
        } else {
            p = IndexSort.sort(a);
            RadixSort.sort(a);
        }
        boolean[] settled = new boolean[n];
        boolean ok = true;
        for (Object obj : dependentArrays) {
            if (obj instanceof int[]) {
                int[] arr = (int[]) obj;
                for (int i = 0; i < n; i++) {
                    for (int j = i; ok ^ settled[j]; j = p[j]) {
                        if (p[j] == i) {
                            settled[j] = !settled[j];
                            break;
                        }
                        int tmp = arr[j];
                        arr[j] = arr[p[j]];
                        arr[p[j]] = tmp;
                        settled[j] = !settled[j];
                    }
                }
            } else if (obj instanceof long[]) {
                long[] arr = (long[]) obj;
                for (int i = 0; i < n; i++) {
                    for (int j = i; ok ^ settled[j]; j = p[j]) {
                        if (p[j] == i) {
                            settled[j] = !settled[j];
                            break;
                        }
                        long tmp = arr[j];
                        arr[j] = arr[p[j]];
                        arr[p[j]] = tmp;
                        settled[j] = !settled[j];
                    }
                }
            } else {
                throw new UnsupportedOperationException("dependent objects musst be int[] or long[] type.");
            }
            ok = !ok;
        }
    }
}

interface IntUnital {
    public int identityElement();
}


class IntRing extends IntSemiRing {
    private final IntUnaryOperator additiveInverse;

    public IntRing(final IntAbelianGroup addition, final IntMonoid multiplication) {
        super(addition, multiplication);
        this.additiveInverse = addition::inverse;
    }

    public final int additiveInverse(final int t) {
        return additiveInverse.applyAsInt(t);
    }
}



class IntMonoid extends IntMagma implements IntUnital {
    public final int e;
    
    public IntMonoid(final IntBinaryOperator operator, final int e) {
        super(operator, TypicalPropertySets.MONOID);
        this.e = e;
    }

    @Override
    public int identityElement() {
        return e;
    }

    public static <M extends IntMagma & IntUnital> IntMonoid of(M m) {
        m.requireProperties(TypicalPropertySets.MONOID);
        return new IntMonoid(m.operator, m.identityElement());
    }
}



class IntBoundedSemiLattice extends IntMonoid {
    public IntBoundedSemiLattice(final IntBinaryOperator operator, final int e) {
        super(operator, e);
        addProperties(Property.IDEMPOTENT, Property.COMMUTATIVE);
    }

    public static <M extends IntMagma & IntUnital> IntBoundedSemiLattice of(M m) {
        m.requireProperties(TypicalPropertySets.BOUNDED_SEMI_LATTICE.getProperties());
        return new IntBoundedSemiLattice(m.operator, m.identityElement());
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
final class RadixSort {
    private static final int INT_INSERTION_SORT_THRESHOLD = 120;
    private static final int LONG_INSERTION_SORT_THRESHOLD = 250;

    private static final int BUCKET_SIZE = 256;
    private static final int BUCKET_HALF_SIZE = 128;
    private static final int INT_RECURSION = 4;
    private static final int LONG_RECURSION = 8;
    private static final int SHIFT = 3;
    private static final int MASK = 0xff;

    public static void sort(final int[] a) {
        sort(a, 0, a.length);
    }

    public static void sortDescending(final int[] a) {
        sortDescending(a, 0, a.length);
    }

    public static void sort(final int[] a, final int from, final int to) {
        if (to - from <= INT_INSERTION_SORT_THRESHOLD) {
            InsertionSort.sort(a, from, to);
            return;
        }
        final int len = to - from;
        final int[] bucket = new int[len];
        final int[] cnt = new int[BUCKET_SIZE + 1];
        for (int l = 0;;) {
            final int shift = l << SHIFT;
            for (int i = from; i < to; i++) {
                cnt[((a[i] >>> shift) & MASK) + 1]++;
            }
            for (int i = 0, j = 1; i < BUCKET_SIZE; i = j, j++) {
                cnt[j] += cnt[i];
            }
            final int positive = cnt[BUCKET_HALF_SIZE];
            for (int i = from; i < to; i++) {
                final int v = a[i];
                bucket[cnt[(v >>> shift) & MASK]++] = v;
            }
            if (++l == INT_RECURSION) {
                final int negative = len - positive;
                System.arraycopy(bucket, positive, a, from, negative);
                System.arraycopy(bucket, 0, a, from + negative, positive);
                return;
            }
            System.arraycopy(bucket, 0, a, from, len);
            Arrays.fill(cnt, 0);
        }
    }

    public static void sortDescending(final int[] a, final int from, final int to) {
        sort(a, from, to);
        int l = from, r = to - 1;
        while (l < r) {
            final int tmp = a[l];
            a[l] = a[r];
            a[r] = tmp;
            l++;
            r--;
        }
    }

    public static void sort(final long[] a) {
        sort(a, 0, a.length);
    }

    public static void sortDescending(final long[] a) {
        sortDescending(a, 0, a.length);
    }

    public static void sort(final long[] a, final int from, final int to) {
        if (to - from <= LONG_INSERTION_SORT_THRESHOLD) {
            InsertionSort.sort(a, from, to);
            return;
        }
        final int len = to - from;
        final long[] bucket = new long[len];
        final int[] cnt = new int[BUCKET_SIZE + 1];
        for (int l = 0;;) {
            final int shift = l << SHIFT;
            for (int i = from; i < to; i++) {
                cnt[(int) (((a[i] >>> shift) & MASK) + 1)]++;
            }
            for (int i = 0, j = 1; i < BUCKET_SIZE; i = j, j++) {
                cnt[j] += cnt[i];
            }
            final int positive = cnt[BUCKET_HALF_SIZE];
            for (int i = from; i < to; i++) {
                final int bi = (int) ((a[i] >>> shift) & MASK);
                bucket[cnt[bi]++] = a[i];
            }
            if (++l == LONG_RECURSION) {
                final int negative = len - positive;
                System.arraycopy(bucket, positive, a, from, negative);
                System.arraycopy(bucket, 0, a, from + negative, positive);
                return;
            }
            System.arraycopy(bucket, 0, a, from, len);
            Arrays.fill(cnt, 0);
        }
    }

    public static void sortDescending(final long[] a, final int from, final int to) {
        sort(a, from, to);
        int l = from, r = to - 1;
        while (l < r) {
            final long tmp = a[l];
            a[l] = a[r];
            a[r] = tmp;
            l++; r--;
        }
    }
}



class IntGroup extends IntMonoid implements IntInversible {
    private final IntUnaryOperator inverse;

    public IntGroup(final IntBinaryOperator operator, final int e, final IntUnaryOperator inverse) {
        super(operator, e);
        addProperties(Property.CANCELLATIVE);
        this.inverse = inverse;
    }

    @Override
    public int inverse(final int t) {
        return inverse.applyAsInt(t);
    }
}



abstract class IntExtendedMagma extends PropertyHolder {
    public final int e0;
    public final int e1;
    private final IntBinaryOperator addition;
    private final IntBinaryOperator multiplication;
    protected final EnumSet<Property> additiveProps;
    protected final EnumSet<Property> multiplicativeProps;

    public IntExtendedMagma(IntMonoid addition, IntMonoid multiplication, EnumSet<Property> properties) {
        super(properties);
        this.addition = addition.operator;
        this.multiplication = multiplication.operator;
        this.e0 = addition.identityElement();
        this.e1 = multiplication.identityElement();
        this.additiveProps = addition.getProperties();
        this.multiplicativeProps = multiplication.getProperties();
    }

    public IntExtendedMagma(IntMonoid addition, IntMonoid multiplication, TypicalPropertySets properties) {
        this(addition, multiplication, properties.getProperties());
    }

    public final int add(int t, int u) {
        return addition.applyAsInt(t, u);
    }

    public final int mul(int t, int u) {
        return multiplication.applyAsInt(t, u);
    }
}



abstract class IntMagma extends PropertyHolder {
    protected final IntBinaryOperator operator;

    public IntMagma(final IntBinaryOperator operator, final EnumSet<Property> properties) {
        super(properties);
        this.operator = operator;
    }

    public IntMagma(final IntBinaryOperator operator, final TypicalPropertySets properties) {
        super(properties);
        this.operator = operator;
    }

    public final int apply(final int left, final int right) {
        return operator.applyAsInt(left, right);
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
final class In {
    public static final FastScanner fsc = new FastScanner();

    public static int ni() {
        return fsc.nextInt();
    }

    public static int ni(final IntUnaryOperator f) {
        return f.applyAsInt(fsc.nextInt());
    }

    public static int[] ni(final int n) {
        final int[] a = new int[n];
        Arrays.setAll(a, i -> fsc.nextInt());
        return a;
    }

    public static int[] ni(final int n, final IntUnaryOperator f) {
        final int[] a = new int[n];
        Arrays.setAll(a, i -> ni(f));
        return a;
    }

    public static int[][] ni(final int n, final int m) {
        final int[][] a = new int[n][m];
        Arrays.setAll(a, i -> ni(m));
        return a;
    }

    public static int[][] ni(final int n, final int m, final IntUnaryOperator f) {
        final int[][] a = new int[n][m];
        Arrays.setAll(a, i -> ni(m, f));
        return a;
    }

    public static long nl() {
        return fsc.nextLong();
    }

    public static long nl(final LongUnaryOperator f) {
        return f.applyAsLong(fsc.nextLong());
    }

    public static long[] nl(final int n) {
        final long[] a = new long[n];
        Arrays.setAll(a, i -> fsc.nextLong());
        return a;
    }

    public static long[] nl(final int n, final LongUnaryOperator f) {
        final long[] a = new long[n];
        Arrays.setAll(a, i -> nl(f));
        return a;
    }

    public static long[][] nl(final int n, final int m) {
        final long[][] a = new long[n][m];
        Arrays.setAll(a, i -> nl(m));
        return a;
    }

    public static long[][] nl(final int n, final int m, final LongUnaryOperator f) {
        final long[][] a = new long[n][m];
        Arrays.setAll(a, i -> nl(m, f));
        return a;
    }

    public static char[] nc() {
        return fsc.next().toCharArray();
    }

    public static char[][] nc(final int n, final int m) {
        final char[][] c = new char[n][m];
        Arrays.setAll(c, i -> nc());
        return c;
    }

    public static double nd() {
        return fsc.nextDouble();
    }

    public static double nd(final DoubleUnaryOperator f) {
        return f.applyAsDouble(fsc.nextDouble());
    }

    public static double[] nd(final int n) {
        final double[] a = new double[n];
        Arrays.setAll(a, i -> fsc.nextDouble());
        return a;
    }

    public static double[] nd(final int n, final DoubleUnaryOperator f) {
        final double[] a = new double[n];
        Arrays.setAll(a, i -> nd(f));
        return a;
    }

    public static double[][] nd(final int n, final int m) {
        final double[][] a = new double[n][m];
        Arrays.setAll(a, i -> nd(m));
        return a;
    }

    public static double[][] nd(final int n, final int m, final DoubleUnaryOperator f) {
        final double[][] a = new double[n][m];
        Arrays.setAll(a, i -> nd(m, f));
        return a;
    }

    public static String ns() {
        return fsc.next();
    }

    public static String[] ns(final int n) {
        final String[] s = new String[n];
        Arrays.setAll(s, i -> ns());
        return s;
    }

    public static boolean[][] grid(final int h, final int w, final char trueCharacter) {
        final boolean[][] grid = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            final char[] s = fsc.next().toCharArray();
            for (int j = 0; j < w; j++) {
                grid[i][j] = s[j] == trueCharacter;
            }
        }
        return grid;
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
        for (int i = 2; i <= n; i++)
            if (div[i] == i)
                result.add(i);
        return result;
    }

    /**
     * execute eratosthenes's prime-enumerate algorithm. a[i] holds the greatest
     * divisor of i. if a[i] = i, i is a prime number. This arrary enables you to
     * prime-factorize in O(log n) time.
     * 
     * @param n
     * @return divisor array.
     */
    public static int[] eratosthenesDivisors(final int n) {
        final int[] divisors = new int[n + 1];
        if (n <= 0)
            return null;
        for (int i = 1; i <= n; i++) {
            if ((i & 1) != 0)
                divisors[i] = i;
            else
                divisors[i] = 2;
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
     * 
     * @param n
     * @return {@code HashMap} of {prime: index}
     */
    public static HashMap<Long, Integer> primeFactorization(long n) {
        final HashMap<Long, Integer> primes = new HashMap<>();
        for (long p = 2; p * p <= n; p++) {
            int q = 0;
            while (n % p == 0) {
                n /= p;
                q++;
            }
            if (q > 0)
                primes.put(p, q);
        }
        if (n > 1)
            primes.put(n, 1);
        return primes;
    }

    public static TreeSet<Long> divisors(final long n) {
        final TreeSet<Long> divisors = new TreeSet<>();
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
                divisors.add(n / i);
            }
        }
        return divisors;
    }

    private static HashMap<Long, Integer> lcmMap(final HashMap<Long, Integer> amap, final HashMap<Long, Integer> bmap) {
        if (amap.size() < bmap.size())
            return lcmMap(bmap, amap);
        final HashMap<Long, Integer> lcm = amap;
        for (final Map.Entry<Long, Integer> e : bmap.entrySet()) {
            final long prime = e.getKey();
            if (lcm.containsKey(prime))
                lcm.put(prime, Math.max(lcm.get(prime), e.getValue()));
            else
                lcm.put(prime, e.getValue());
        }
        return lcm;
    }

    private static HashMap<Long, Integer> lcmMap(final HashMap<Long, Integer> amap, final long b) {
        final HashMap<Long, Integer> bmap = primeFactorization(b);
        return lcmMap(amap, bmap);
    }

    public static HashMap<Long, Integer> lcmMap(final long... a) {
        HashMap<Long, Integer> amap = new HashMap<>();
        for (final long c : a)
            amap = lcmMap(amap, c);
        return amap;
    }

    /**
     * calculate lcm(a, b) fast. (NOT considering overflow.)
     */
    public static long lcm(final long a, final long b) {
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
        if (a < b)
            return gcd(b, a);
        if (b == 0)
            return a;
        if (a == 0)
            return b;
        long r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }

    public static long gcd(final long... a) {
        long gcd = 0;
        for (final long c : a)
            gcd = gcd(gcd, c);
        return gcd;
    }

    /**
     * Return one of the solutions to {@code ax+by=gcd(a, b)}.
     * 
     * @return {@code x}, {@code y}, {@code gcd(a, b)}.
     * @param a a of ax+by=gcd(a, b).
     * @param b b of ax+by=gcd(a, b). class ReferenceLong is a reference type of
     *          long.
     */
    public static long[] extGCD(final long a, final long b) {
        final long[] ret = new long[3];
        final long[] xy = new long[2];
        ret[2] = extGCD(a, b, xy);
        ret[0] = xy[0];
        ret[1] = xy[1];
        return ret;
    }

    private static long extGCD(final long a, final long b, final long[] xy) {
        if (b == 0) {
            xy[0] = 1;
            xy[1] = 0;
            return a;
        }
        final long tmp = xy[0];
        xy[0] = xy[1];
        xy[1] = tmp;
        final long d = extGCD(b, a % b, xy);
        xy[1] -= a / b * xy[0];
        return d;
    }

    /**
     * caluculate a ^ b NOT considering overflow. so if you want to calculate a ^ b
     * (mod p), use ModUtil.pow(a, b).
     * 
     * @param a base
     * @param b exponent
     * @return a ^ b
     */
    public static long pow(final int a, long b) {
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
        if (n < r)
            return 0;
        r = Math.min(r, n - r);
        long res = 1;
        for (long d = 1; d <= r; d++) {
            res *= n--;
            res /= d;
        }
        return res;
    }

    public static long ceilSqrt(final long n) {
        long l = -1;
        long r = n;
        while (r - l > 1) {
            final long m = (r + l) >> 1;
            if (m * m >= n) {
                r = m;
            } else {
                l = m;
            }
        }
        return r;
    }

    public static long floorSqrt(final long n) {
        long l = 0;
        long r = n + 1;
        while (r - l > 1) {
            final long m = (r + l) >> 1;
            if (m * m > n) {
                r = m;
            } else {
                l = m;
            }
        }
        return l;
    }

    public static long int2ToLong(final int upper, final int lower) {
        return ((long) upper << Integer.SIZE) | lower;
    }

    public static int upper32(final long l) {
        return (int) (l >>> Integer.SIZE);
    }

    public static int lower32(final long l) {
        return (int) (l & UNDER32_MASK);
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 * 
 * for Static Range Query. (Monoid)
 * build: O(N*logN). query: O(1).
 */
final class IntSparseTable {
    private final int n;
    private final int[][] table;
    private final IntBoundedSemiLattice bsl;
    private final int[] floorExponent;
    
    /**
     * CAUTION: bounded-semilattice meats idempotent law and bond law. bsl is in monoid. (max, min, gcd, lcm, and, or, ...)
     * So, there exists some monoid s.t. Sparse Table cannot handle. (ex. addition, xor, multiplication)
     * @param a int array.
     * @param bsl (max, min, gcd, lcm, and, or, rewrite, ...) NOT (addition, xor, multiplication, ...)
     */
    public IntSparseTable(final int[] a, final IntBoundedSemiLattice bsl) {
        this.n = a.length;
        this.table = new int[n][];
        this.bsl = bsl;
        this.floorExponent = new int[n + 1];
        buildFloorExponent();
        buildTable(a);
    }

    public int query(final int i, final int j) {
        if (j <= i) {
            return bsl.e;
        } else {
            final int exp = floorExponent[j - i];
            return bsl.apply(table[i][exp], table[j - (1 << exp)][exp]);
        }
    }

    private void buildFloorExponent() {
        for (int i = 1, pow = 0, exp = 1; i <= n; i++) {
            if ((i & -i) > exp) {
                pow++;
                exp <<= 1;
            }
            floorExponent[i] = pow;
        }
    }

    private void buildTable(final int[] a) {
        for (int i = 0; i < n; i++) {
            table[i] = new int[floorExponent[n - i] + 1];
            table[i][0] = a[i];
        }
        for (int i = n - 1; i >= 0; i--) {
            final int[] e = table[i];
            for (int j = 1, k = 1; j < e.length; j++, k <<= 1) {
                e[j] = bsl.apply(e[j - 1], table[i + k][j - 1]);
            }
        }
    }
}



class IntSemiRing extends IntExtendedMagma {
    public IntSemiRing(final IntMonoid addition, final IntMonoid multiplication) {
        super(addition, multiplication, TypicalPropertySets.SEMI_RING);
        addition.requireProperties(EnumSet.of(Property.COMMUTATIVE));
    }

    public static IntSemiRing of(IntExtendedMagma m) {
        if (!m.additiveProps.containsAll(TypicalPropertySets.COMMUTATIVE_MONOID.getProperties())) {
            throw new ClassCastException("addition does not meet the conditions of commutative monoid.");
        }
        IntCommutativeMonoid add = new IntCommutativeMonoid(m::add, m.e0);
        IntMonoid mul = new IntMonoid(m::mul, m.e1);
        return new IntSemiRing(add, mul);
    }
}



class IntAbelianGroup extends IntGroup {
    public IntAbelianGroup(final IntBinaryOperator operator, final int e, final IntUnaryOperator inverse) {
        super(operator, e, inverse);
        addProperties(Property.COMMUTATIVE);
    }
}



class IntCommutativeMonoid extends IntMonoid {
    public IntCommutativeMonoid(final IntBinaryOperator operator, final int e) {
        super(operator, e);
        addProperties(Property.COMMUTATIVE);
    }

    public static <M extends IntMagma & IntUnital> IntCommutativeMonoid of(M m) {
        m.requireProperties(TypicalPropertySets.COMMUTATIVE_MONOID.getProperties());
        return new IntCommutativeMonoid(m.operator, m.identityElement());
    }
}


final class IndexSort {
    public static int[] sort(final int[] a) {
        final int[] index = new int[a.length];
        Arrays.setAll(index, IntUnaryOperator.identity());
        ComparativeMergeSort.sort(index, (i, j) -> a[i] - a[j]);
        return index;
    }

    public static int[] sortDescending(final int[] a) {
        final int[] index = new int[a.length];
        Arrays.setAll(index, IntUnaryOperator.identity());
        ComparativeMergeSort.sort(index, (i, j) -> a[j] - a[i]);
        return index;
    }

    public static int[] sort(final long[] a) {
        final int[] index = new int[a.length];
        Arrays.setAll(index, IntUnaryOperator.identity());
        ComparativeMergeSort.sort(index, (i, j) -> Long.compare(a[i], a[j]));
        return index;
    }

    public static int[] sortDescending(final long[] a) {
        final int[] index = new int[a.length];
        Arrays.setAll(index, IntUnaryOperator.identity());
        ComparativeMergeSort.sort(index, (i, j) -> Long.compare(a[j], a[i]));
        return index;
    }
}


enum TypicalPropertySets {
    ABELIAN_GROUP(EnumSet.of(
        Property.ASSOCIATIVE,
        Property.CANCELLATIVE,
        Property.COMMUTATIVE
    )),
    BOUNDED_SEMI_LATTICE(EnumSet.of(
        Property.ASSOCIATIVE,
        Property.COMMUTATIVE,
        Property.IDEMPOTENT
    )),
    COMMUTATIVE_MONOID(EnumSet.of(
        Property.ASSOCIATIVE,
        Property.COMMUTATIVE
    )),
    GROUP(EnumSet.of(
        Property.ASSOCIATIVE,
        Property.CANCELLATIVE
    )),
    MONOID(EnumSet.of(
        Property.ASSOCIATIVE
    )),
    SEMI_GROUP(EnumSet.of(
        Property.ASSOCIATIVE
    )),
    SEMI_LATTICE(EnumSet.of(
        Property.ASSOCIATIVE,
        Property.IDEMPOTENT,
        Property.COMMUTATIVE
    )),
    SEMI_RING(EnumSet.of(
        Property.DISTRIBUTIVE,
        Property.ANNIHILATED_BY_ZERO
    )),
    RING(EnumSet.of(
        Property.DISTRIBUTIVE,
        Property.ANNIHILATED_BY_ZERO
    ));

    private final EnumSet<Property> properties;

    private TypicalPropertySets(EnumSet<Property> properties) {
        this.properties = properties;
    }

    public final EnumSet<Property> getProperties() {
        return properties.clone();
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



class IntField extends IntRing {
    public IntField(final IntAbelianGroup addition, final IntMonoid multiplication) {
        super(addition, multiplication);
        multiplication.requireProperties(EnumSet.of(Property.COMMUTATIVE));
    }
}


final class ComparativeInsertionSort {
    public static void sort(final int[] a, final int from, final int to, final IntComparator comparator) {
        for (int i = from + 1; i < to; i++) {
            final int tmp = a[i];
            if (comparator.gt(a[i - 1], tmp)) {
                int j = i;
                do {
                    a[j] = a[j - 1];
                    j--;
                } while (j > from && comparator.gt(a[j - 1], tmp));
                a[j] = tmp;
            }
        }
    }

    public static void sort(final long[] a, final int from, final int to, final LongComparator comparator) {
        for (int i = from + 1; i < to; i++) {
            final long tmp = a[i];
            if (comparator.gt(a[i - 1], tmp)) {
                int j = i;
                do {
                    a[j] = a[j - 1];
                    j--;
                } while (j > from && comparator.gt(a[j - 1], tmp));
                a[j] = tmp;
            }
        }
    }
}


abstract class PropertyHolder {
    private final EnumSet<Property> properties;

    public PropertyHolder(final EnumSet<Property> properties) {
        this.properties = properties;
    }

    public PropertyHolder(final TypicalPropertySets typicalSet) {
        this(typicalSet.getProperties());
    }

    public final EnumSet<Property> getProperties() {
        return properties;
    }

    public final void addProperties(final Property... props) {
        for (Property prop : props) {
            properties.add(prop);
        }
    }

    public final void addProperties(final EnumSet<Property> props) {
        for (Property prop : props) {
            properties.add(prop);
        }
    }

    public final void addProperties(final TypicalPropertySets props) {
        addProperties(props.getProperties());
    }

    public final boolean hasProperties(final Property... props) {
        for (final Property prop : props) {
            if (!properties.contains(prop)) {
                return false;
            }
        }
        return true;
    }

    public final boolean hasProperties(final EnumSet<Property> props) {
        for (final Property prop : props) {
            if (!properties.contains(prop)) {
                return false;
            }
        }
        return true;
    }

    public final boolean hasProperties(final TypicalPropertySets props) {
        return hasProperties(props.getProperties());
    }

    public final void requireProperties(final EnumSet<Property> props, final Property... ps) {
        final ArrayList<Property> unmet = new ArrayList<>();
        for (final Property prop : props) {
            if (!properties.contains(prop)) {
                unmet.add(prop);
            }
        }
        for (final Property prop : ps) {
            if (!properties.contains(prop)) {
                unmet.add(prop);
            }
        }
        if (unmet.size() > 0) {
            throw new UnsatisfiedRequiredPropertiesException(unmet);
        }
    }

    public final void requireProperties(final TypicalPropertySets props, final Property... ps) {
        requireProperties(props.getProperties(), ps);
    }

    private static final class UnsatisfiedRequiredPropertiesException extends RuntimeException {
        private static final long serialVersionUID = 1L;

        private UnsatisfiedRequiredPropertiesException(final Collection<Property> props) {
            for (final Property prop : props) {
                System.err.println(prop.name() + "should be satisfied.");
            }
        }
    }
}
