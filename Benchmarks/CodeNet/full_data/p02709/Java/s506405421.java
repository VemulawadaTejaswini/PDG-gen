import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.PrimitiveIterator;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
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
        long[] a = In.nl(n);
        int[] index = IntArrayGenerator.indexToInt(n, i -> i);
        ParallelSort.sortDescending(a, index);
        long[][] dp = new long[n + 1][n + 1];
        for (int s = 1; s <= n; s++) {
            for (int l = 0, r = s; l <= s; l++, r--) {
                int i = s - 1;
                long vl = l == 0 ? 0 : dp[l - 1][r] + a[i] * (index[i] - l + 1);
                long vr = r == 0 ? 0 : dp[l][r - 1] + a[i] * (n - r - index[i]);
                dp[l][r] = Math.max(vl, vr);
            }
        }
        long max = 0;
        for (int l = 0, r = n; l <= n; l++, r--) {
            max = Math.max(max, dp[l][r]);
        }
        out.append(max);
    }
}

class ParallelSort {
    public static void sort(int[] a, int[] index) {
        ComparativeMergeSort.sort(index, (i, j) -> a[i] - a[j]);
        MergeSort.sort(a);
    }

    public static void sortDescending(int[] a, int[] index) {
        ComparativeMergeSort.sort(index, (i, j) -> a[j] - a[i]);
        MergeSort.sortDescending(a);
    }

    public static void sort(long[] a, int[] index) {
        ComparativeMergeSort.sort(index, (i, j) -> Long.compare(a[i], a[j]));
        MergeSort.sort(a);
    }

    public static void sortDescending(long[] a, int[] index) {
        ComparativeMergeSort.sort(index, (i, j) -> Long.compare(a[j], a[i]));
        MergeSort.sortDescending(a);
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

final class MergeSort {
    private static int INSERTION_SORT_THRESHOLD = 60;

    public static void sort(int[] a) {
        sort(a, 0, a.length);
    }

    public static void sortDescending(int[] a) {
        sortDescending(a, 0, a.length);
    }

    public static void sort(int[] a, final int begin, final int end) {
        for (int i = begin, j = i + 1, cnt = 0, threshold = ((end - begin) << 2) / 5; j < end; i = j, j++) {
            if (a[i] > a[j] && ++cnt >= threshold) {
                int l = begin, r = end - 1;
                while (r > l) {
                    int tmp = a[l]; a[l] = a[r]; a[r] = tmp;
                    l++; r--;
                }
                break;
            }
        }
        for (int i = begin;;) {
            int j = i + INSERTION_SORT_THRESHOLD;
            if (j < end) {
                InsertionSort.sort(a, i, j);
            } else {
                InsertionSort.sort(a, i, end);
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
                System.arraycopy(a, begin, work, 0, block);
                for (int i = from, wi = 0, ti = mid;; i++) {
                    if (ti == to) {
                        System.arraycopy(work, wi, a, i, block - wi);
                        break;
                    } else if (work[wi] > a[ti]) {
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

    public static void sortDescending(int[] a, final int from, final int to) {
        sort(a, from, to);
        int l = from, r = to - 1;
        while (l < r) {
            int tmp = a[l]; a[l] = a[r]; a[r] = tmp;
            l++; r--;
        }
    }

    public static void sort(long[] a) {
        sort(a, 0, a.length);
    }

    public static void sortDescending(long[] a) {
        sortDescending(a, 0, a.length);
    }

    public static void sort(long[] a, final int begin, final int end) {
        for (int i = begin, j = i + 1, cnt = 0, threshold = ((end - begin) << 2) / 5; j < end; i = j, j++) {
            if (a[i] > a[j] && ++cnt >= threshold) {
                int l = begin, r = end - 1;
                while (r > l) {
                    long tmp = a[l]; a[l] = a[r]; a[r] = tmp;
                    l++; r--;
                }
                break;
            }
        }
        for (int i = begin;;) {
            int j = i + INSERTION_SORT_THRESHOLD;
            if (j < end) {
                InsertionSort.sort(a, i, j);
            } else {
                InsertionSort.sort(a, i, end);
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
                System.arraycopy(a, begin, work, 0, block);
                for (int i = from, wi = 0, ti = mid;; i++) {
                    if (ti == to) {
                        System.arraycopy(work, wi, a, i, block - wi);
                        break;
                    } else if (work[wi] > a[ti]) {
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

    public static void sortDescending(long[] a, final int from, final int to) {
        sort(a, from, to);
        int l = from, r = to - 1;
        while (l < r) {
            long tmp = a[l]; a[l] = a[r]; a[r] = tmp;
            l++; r--;
        }
    }
}

final class InsertionSort {
    protected static void sort(int[] a) {
        sort(a, 0, a.length);
    }

    protected static void sort(int[] a, final int from, final int to) {
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

    protected static void sort(long[] a) {
        sort(a, 0, a.length);
    }

    protected static void sort(long[] a, final int from, final int to) {
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



/**
 * @author https://atcoder.jp/users/suisen
 */
class IntArrayList implements Iterable<Integer> {
    private int[] a;
    private int tail = 0;

    private static final int DEFAULT_SIZE = 64;

    public IntArrayList(int capacity) {
        this.a = new int[Math.max(1, capacity)];
    }

    public IntArrayList() {
        this(DEFAULT_SIZE);
    }

    public void add(int v) {
        if (tail == a.length) {
            resize(2);
        }
        a[tail++] = v;
    }

    public int removeLast() {
        return a[tail--];
    }

    public int get(int i) {
        if (i >= this.tail) {
            System.err.println("Error in IntArrayList::get(" + i + "): ArrayIndexOutOfBounds. list size = " + tail);
        }
        return a[i];
    }

    public void set(int i, int v) {
        if (i >= this.tail) {
            System.err.println("Error in IntArrayList::set(" + i + "): ArrayIndexOutOfBounds. list size = " + tail);
        }
        a[i] = v;
    }

    private void resize(double grow) {
        int[] b = new int[(int) Math.ceil(a.length * grow)];
        System.arraycopy(a, 0, b, 0, a.length);
        a = b;
    }

    public int size() {
        return tail;
    }

    public void reverse(int begin, int end) {
        IntArrays.reverse(a, begin, end);
    }

    public void reverse() {
        IntArrays.reverse(a, 0, tail);
    }

    public int[] toArray() {
        int[] ret = new int[tail];
        System.arraycopy(a, 0, ret, 0, tail);
        return ret;
    }

    public boolean addIf(int v, IntPredicate p) {
        if (p.test(v)) {
            add(v);
            return true;
        }
        return false;
    }

    public PrimitiveIterator.OfInt iterator() {
        return new IntArrayListIterator();
    }

    private class IntArrayListIterator implements PrimitiveIterator.OfInt {
        private int i = 0;

        public boolean hasNext() {
            return i < tail;
        }

        public int nextInt() {
            return a[i++];
        }
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 * 
 * 1. DESTRUCTIVE methods for int arrays.
 * 2. methods that receives arrays and return some results (except for int arrays).
 */
class IntArrays {

    private IntArrays(){}

    public static void swap(int[] a, int u, int v) {
        int tmp = a[u];
        a[u] = a[v];
        a[v] = tmp;
    }

    public static void reverse(int[] a, int begin, int end) {
        for (int i = begin; i < begin + (end - begin) / 2; i++) {
            swap(a, i, begin + end - i - 1);
        }
    }

    public static void reverse(int[] a) {
        reverse(a, 0, a.length);
    }

    public static void sortDescending(int[] a) {
        Arrays.sort(a);
        reverse(a);
    }

    public static int reduce(int[] a, IntBinaryOperator op) {
        int ret = a[0];
        for (int i = 1; i < a.length; i++) {
            ret = op.applyAsInt(ret, a[i]);
        }
        return ret;
    }

    public static void map(int[] a, IntUnaryOperator op) {
        for (int i = 0; i < a.length; i++) {
            a[i] = op.applyAsInt(a[i]);
        }
    }

    public static void filter(int[] src, int[] dst, IntPredicate p) {
        int idx = 0;
        for (int e : src) {
            if (p.test(e)) {
                dst[idx++] = e;
            }
        }
    }

    public static void filterIndex(int[] dst, int beginIndex, int endIndex, IntPredicate p) {
        for (int i = beginIndex, idx = 0; i < endIndex; i++) {
            if (p.test(i)) {
                dst[idx++] = i;
            }
        }
    }

    public static void filterIndex(int dst[], int endIndex, IntPredicate p) {
        filterIndex(dst, 0, endIndex, p);
    }

    public static void accumulate(int[] a, IntBinaryOperator op) {
        for (int i = 1; i < a.length; i++) {
            a[i] = op.applyAsInt(a[i - 1], a[i]);
        }
    }

    public static void accumulate(int[] a) {
        for (int i = 1; i < a.length; i++) {
            a[i] += a[i - 1];
        }
    }

    public static int unique(int[] a) {
        HashSet<Integer> set = new HashSet<>();
        for (int e : a) {
            set.add(e);
        }
        int m = set.size();
        int[] b = new int[m];
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

    public static void transpose(int[][] a) {
        int n = a.length;
        int m = a[0].length;
        int[][] ret = new int[m][n];
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                ret[j][i] = a[i][j];
            }
        }
        a = ret;
    }

    public static int compare(int[] a, int[] b) {
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

    public static boolean equals(int[] a, int[] b) {
        return compare(a, b) == 0;
    }

    public static String join(int[] a, String sep) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
            if (i < a.length - 1) {
                sb.append(sep);
            }
        }
        return sb.toString();
    }

    public static String joinWithPrefixAndSuffix(int[] a, IntFunction<String> idxToPre, IntFunction<String> idxToSuf, String sep) {
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

@FunctionalInterface
interface IntComparator {
    public int compare(int i, int j);

    public default boolean eq(int i, int j) {
        return compare(i, j) == 0;
    }

    public default boolean ne(int i, int j) {
        return compare(i, j) != 0;
    }

    public default boolean gt(int i, int j) {
        return compare(i, j) > 0;
    }

    public default boolean ge(int i, int j) {
        return compare(i, j) >= 0;
    }

    public default boolean lt(int i, int j) {
        return compare(i, j) < 0;
    }

    public default boolean le(int i, int j) {
        return compare(i, j) <= 0;
    }
}



/**
 * @author https://atcoder.jp/users/suisen
 * 
 * (NON-DESTRUCTIVE) methods that returns int array.
 */
class IntArrayGenerator {

    private IntArrayGenerator(){}
    
    public static int[] filled(int n, int init) {
        int[] ret = new int[n];
        Arrays.fill(ret, init);
        return ret;
    }

    public static int[][] filled(int n, int m, int init) {
        int[][] ret = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(ret[i], init);
        }
        return ret;
    }

    public static int[] indexToInt(int n, IntUnaryOperator f) {
        int[] a = new int[n];
        Arrays.setAll(a, f);
        return a;
    }

    public static int[] toArray(Collection<? extends Number> collection) {
        int n = collection.size();
        int[] ret = new int[n];
        Object[] coll = collection.toArray();
        for (int i = 0; i < n; i++) {
            ret[i] = ((Number) coll[i]).intValue();
        }
        return ret;
    }

    public static int[] unique(int[] a) {
        HashSet<Integer> set = new HashSet<>();
        for (int e : a) {
            set.add(e);
        }
        int m = set.size();
        int[] b = new int[m];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (set.contains(a[i])) {
                b[index++] = a[i];
                set.remove(a[i]);
            }
        }
        return b;
    }

    public static int[][] transpose(int[][] a) {
        int n = a.length;
        int m = a[0].length;
        int[][] ret = new int[m][n];
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                ret[j][i] = a[i][j];
            }
        }
        return ret;
    }

    public static int[] count(int[] a, int max) {
        int[] ret = new int[max + 1];
        for (int i = 0; i < a.length; i++) {
            ret[a[i]]++;
        }
        return ret;
    }

    public static int[] map(int[] a, IntUnaryOperator f) {
        int[] b = new int[a.length];
        Arrays.setAll(b, i -> f.applyAsInt(a[i]));
        return b;
    }

    public static int[] filter(int[] a, IntPredicate p) {
        IntArrayList ret = new IntArrayList();
        for (int e : a) {
            ret.addIf(e, p);
        }
        return ret.toArray();
    }

    public static int[] filterIndex(int beginIndex, int endIndex, IntPredicate p) {
        IntArrayList ret = new IntArrayList();
        for (int i = beginIndex; i < endIndex; i++) {
            ret.addIf(i, p);
        }
        return ret.toArray();
    }

    public static int[] filterIndex(int endIndex, IntPredicate p) {
        return filterIndex(0, endIndex, p);
    }

    public static int[] accumulate(int[] a, IntBinaryOperator op) {
        int n = a.length;
        int[] ret = new int[n];
        ret[0] = a[0];
        for (int i = 1; i < n; i++) {
            ret[i] = op.applyAsInt(ret[i - 1], a[i]);
        }
        return ret;
    }

    public static int[] accumulate(int[] a) {
        int n = a.length;
        int[] ret = new int[n];
        ret[0] = a[0];
        for (int i = 1; i < n; i++) {
            ret[i] = ret[i - 1] + a[i];
        }
        return ret;
    }
}

@FunctionalInterface
interface LongComparator {
    public int compare(long i, long j);

    public default boolean eq(long i, long j) {
        return compare(i, j) == 0;
    }

    public default boolean ne(long i, long j) {
        return compare(i, j) != 0;
    }

    public default boolean gt(long i, long j) {
        return compare(i, j) > 0;
    }

    public default boolean ge(long i, long j) {
        return compare(i, j) >= 0;
    }

    public default boolean lt(long i, long j) {
        return compare(i, j) < 0;
    }

    public default boolean le(long i, long j) {
        return compare(i, j) <= 0;
    }
}


final class ComparativeMergeSort {
    private static int INSERTION_SORT_THRESHOLD = 60;

    public static void sort(int[] a, final IntComparator comparator) {
        sort(a, 0, a.length, comparator);
    }

    public static void sort(int[] a, final int begin, final int end, final IntComparator comparator) {
        for (int i = begin, j = i + 1, cnt = 0, threshold = ((end - begin) << 2) / 5; j < end; i = j, j++) {
            if (comparator.gt(a[i], a[j]) && ++cnt >= threshold) {
                int l = begin, r = end - 1;
                while (r > l) {
                    int tmp = a[l]; a[l] = a[r]; a[r] = tmp;
                    l++; r--;
                }
                break;
            }
        }
        for (int i = begin;;) {
            int j = i + INSERTION_SORT_THRESHOLD;
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
                System.arraycopy(a, begin, work, 0, block);
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

    public static void sort(long[] a, final LongComparator comparator) {
        sort(a, 0, a.length, comparator);
    }

    public static void sort(long[] a, final int begin, final int end, final LongComparator comparator) {
        for (int i = begin, j = i + 1, cnt = 0, threshold = ((end - begin) << 2) / 5; j < end; i = j, j++) {
            if (comparator.gt(a[i], a[j]) && ++cnt >= threshold) {
                int l = begin, r = end - 1;
                while (r > l) {
                    long tmp = a[l]; a[l] = a[r]; a[r] = tmp;
                    l++; r--;
                }
                break;
            }
        }
        for (int i = begin;;) {
            int j = i + INSERTION_SORT_THRESHOLD;
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
                System.arraycopy(a, begin, work, 0, block);
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


final class ComparativeInsertionSort {
    public static void sort(int[] a, final int from, final int to, final IntComparator comparator) {
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

    public static void sort(long[] a, final int from, final int to, final LongComparator comparator) {
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
