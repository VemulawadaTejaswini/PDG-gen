import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.PrimitiveIterator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
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
        int[] l = new int[n];
        int[] r = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }
        int[] p = IntArrayFactory.indexToInt(n, i -> i);
        ComparativeMergeSort.sort(p, (u, v) -> {
            if (l[u] == l[v]) {
                return r[u] - r[v];
            } else {
                return l[u] - l[v];
            }
        });
        if (n % 2 == 0) {
            long a = 0;
            int x = 0;
            int i = 0, j = n / 2;
            for (int k = 0; k < n / 2; k++) {
                int s = p[i + k], t = p[j + k];
                if (x < l[s]) {
                    a += l[s] - x;
                    x = l[s];
                } else if (x > r[s]) {
                    a += x - r[s];
                    x = r[s];
                }
                if (x < l[t]) {
                    a += l[t] - x;
                    x = l[t];
                } else if (x > r[t]) {
                    a += x - r[t];
                    x = r[t];
                }
            }
            a += Math.abs(x);
            out.writeln(a);
        } else {
            long a1 = 0;
            int x = 0;
            int i = 0, j = n / 2;
            for (int k = 0; k < n / 2; k++) {
                int s = p[i + k], t = p[j + k];
                if (x < l[t]) {
                    a1 += l[t] - x;
                    x = l[t];
                } else if (x > r[t]) {
                    a1 += x - r[t];
                    x = r[t];
                }
                if (x < l[s]) {
                    a1 += l[s] - x;
                    x = l[s];
                } else if (x > r[s]) {
                    a1 += x - r[s];
                    x = r[s];
                }
            }
            if (x < l[p[n - 1]]) {
                a1 += l[p[n - 1]] - x;
                x = l[p[n - 1]];
            } else if (x > r[p[n - 1]]) {
                a1 += x - r[p[n - 1]];
                x = r[p[n - 1]];
            }
            a1 += Math.abs(x);

            long a2 = 0;
            x = 0;
            i = 0; j = n / 2 + 1;
            for (int k = 0; k < n / 2; k++) {
                int s = p[i + k], t = p[j + k];
                if (x < l[s]) {
                    a2 += l[s] - x;
                    x = l[s];
                } else if (x > r[s]) {
                    a2 += x - r[s];
                    x = r[s];
                }
                if (x < l[t]) {
                    a2 += l[t] - x;
                    x = l[t];
                } else if (x > r[t]) {
                    a2 += x - r[t];
                    x = r[t];
                }
            }
            if (x < l[p[n / 2]]) {
                a2 += l[p[n / 2]] - x;
                x = l[p[n / 2]];
            } else if (x > r[p[n / 2]]) {
                a2 += x - r[p[n / 2]];
                x = r[p[n / 2]];
            }
            a2 += Math.abs(x);
            out.writeln(Math.max(a1, a2));
        }
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

@FunctionalInterface
interface IntComparator {
    public int compare(int i, int j);
    public default boolean eq(final int i, final int j) {return compare(i, j) == 0;}
    public default boolean ne(final int i, final int j) {return compare(i, j) != 0;}
    public default boolean gt(final int i, final int j) {return compare(i, j) > 0;}
    public default boolean ge(final int i, final int j) {return compare(i, j) >= 0;}
    public default boolean lt(final int i, final int j) {return compare(i, j) < 0;}
    public default boolean le(final int i, final int j) {return compare(i, j) <= 0;}
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

@FunctionalInterface
interface LongComparator {
    public int compare(long i, long j);
    public default boolean eq(final long i, final long j) {return compare(i, j) == 0;}
    public default boolean ne(final long i, final long j) {return compare(i, j) != 0;}
    public default boolean gt(final long i, final long j) {return compare(i, j) > 0;}
    public default boolean ge(final long i, final long j) {return compare(i, j) >= 0;}
    public default boolean lt(final long i, final long j) {return compare(i, j) < 0;}
    public default boolean le(final long i, final long j) {return compare(i, j) <= 0;}
}


final class ComparativeMergeSort {
    private static int INSERTION_SORT_THRESHOLD = 60;
    public static void sort(final int[] a, final IntComparator comparator) {sort(a, 0, a.length, comparator);}
    public static void sort(final int[] a, final int begin, final int end, final IntComparator comparator) {
        for (int i = begin;;) {
            final int j = i + INSERTION_SORT_THRESHOLD;
            if (j < end) ComparativeInsertionSort.sort(a, i, j, comparator);
            else {ComparativeInsertionSort.sort(a, i, end, comparator); break;}
            i = j;
        }
        final int len = end - begin;
        final int[] work = new int[len];
        for (int block = INSERTION_SORT_THRESHOLD; block <= len; block <<= 1) {
            final int twoBlocks = block << 1;
            for (int from = begin, max = end - block; from < max; from += twoBlocks) {
                final int mid = from + block, to = Math.min(from + twoBlocks, end);
                System.arraycopy(a, from, work, 0, block);
                for (int i = from, wi = 0, ti = mid;; i++) {
                    if (ti == to) {System.arraycopy(work, wi, a, i, block - wi); break;}
                    if (comparator.gt(work[wi], a[ti])) a[i] = a[ti++];
                    else {a[i] = work[wi++]; if (wi == block) break;}
                }
            }
        }
    }
    public static void sort(final long[] a, final LongComparator comparator) {sort(a, 0, a.length, comparator);}
    public static void sort(final long[] a, final int begin, final int end, final LongComparator comparator) {
        for (int i = begin;;) {
            final int j = i + INSERTION_SORT_THRESHOLD;
            if (j < end) ComparativeInsertionSort.sort(a, i, j, comparator);
            else {ComparativeInsertionSort.sort(a, i, end, comparator); break;}
            i = j;
        }
        final int len = end - begin;
        final long[] work = new long[len];
        for (int block = INSERTION_SORT_THRESHOLD; block <= len; block <<= 1) {
            final int twoBlocks = block << 1;
            for (int from = begin, max = end - block; from < max; from += twoBlocks) {
                final int mid = from + block, to = Math.min(from + twoBlocks, end);
                System.arraycopy(a, from, work, 0, block);
                for (int i = from, wi = 0, ti = mid;; i++) {
                    if (ti == to) {System.arraycopy(work, wi, a, i, block - wi); break;}
                    if (comparator.gt(work[wi], a[ti])) a[i] = a[ti++];
                    else {a[i] = work[wi++]; if (wi == block) break;}
                }
            }
        }
    }
}


final class ComparativeInsertionSort {
    static void sort(final int[] a, final int from, final int to, final IntComparator comparator) {
        for (int i = from + 1; i < to; i++) {
            final int tmp = a[i];
            if (comparator.gt(a[i - 1], tmp)) {
                int j = i;
                do {a[j] = a[j - 1]; j--;} while (j > from && comparator.gt(a[j - 1], tmp));
                a[j] = tmp;
            }
        }
    }
    static void sort(final long[] a, final int from, final int to, final LongComparator comparator) {
        for (int i = from + 1; i < to; i++) {
            final long tmp = a[i];
            if (comparator.gt(a[i - 1], tmp)) {
                int j = i;
                do {a[j] = a[j - 1]; j--;} while (j > from && comparator.gt(a[j - 1], tmp));
                a[j] = tmp;
            }
        }
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
final class IntPair {
    public int fst, snd;
    public IntPair(final int fst, final int snd) {this.fst = fst; this.snd = snd;}
    @Override @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof IntPair)) return false;
        final IntPair p = (IntPair) o;
        return this.fst == p.fst && this.snd == p.snd;
    }
    @Override
    public int hashCode() {return Objects.hash(this.fst, this.snd);}
    @Override
    public String toString() {return "(" + this.fst + ", " + this.snd + ")";}
}



/**
 * @author https://atcoder.jp/users/suisen
 */
final class IntArrayList implements Iterable<Integer> {
    private int[] a;
    private int tail = 0;
    private static final int DEFAULT_SIZE = 64;
    public IntArrayList(final int capacity) {this.a = new int[Math.max(1, capacity)];}
    public IntArrayList() {this(DEFAULT_SIZE);}
    public void add(final int v) {
        if (tail == a.length) grow();
        a[tail++] = v;
    }
    public int removeLast() {return a[--tail];}
    public int get(final int i) {
        if (i >= tail) throw new IndexOutOfBoundsException("Index " + i + " out of bounds for length " + size());
        return a[i];
    }
    public void set(final int i, final int v) {
        if (i >= tail) throw new IndexOutOfBoundsException("Index " + i + " out of bounds for length " + size());
        a[i] = v;
    }
    private void grow() {
        final int[] b = new int[a.length << 1];
        System.arraycopy(a, 0, b, 0, a.length);
        a = b;
    }
    public int size() {return tail;}
    public void clear() {tail = 0;}
    public void reverse(final int begin, final int end) {IntArrays.reverse(a, begin, end);}
    public void reverse() {IntArrays.reverse(a, 0, tail);}
    public int[] toArray() {
        final int[] ret = new int[tail];
        System.arraycopy(a, 0, ret, 0, tail);
        return ret;
    }
    public void sort() {Arrays.sort(a, 0, tail);}
    public boolean addIf(final int v, final IntPredicate p) {
        if (p.test(v)) {add(v); return true;}
        return false;
    }
    public PrimitiveIterator.OfInt iterator() {return new IntArrayListIterator();}
    private class IntArrayListIterator implements PrimitiveIterator.OfInt {
        private int i = 0;
        public boolean hasNext() {return i < tail;}
        public int nextInt() {return a[i++];}
    }
}



/**
 * @author https://atcoder.jp/users/suisen
 * 
 * 1. DESTRUCTIVE methods for int arrays.
 * 2. methods that receives arrays and return some results (except for int arrays).
 */
final class IntArrays {
    private IntArrays(){}
    public static void swap(final int[] a, final int u, final int v) {
        final int tmp = a[u]; a[u] = a[v]; a[v] = tmp;
    }
    public static void reverse(final int[] a, int begin, int end) {
        while (end - begin > 1) swap(a, begin++, --end);
    }
    public static void reverse(final int[] a) {reverse(a, 0, a.length);}
    public static void sortDescending(final int[] a) {Arrays.sort(a); reverse(a);}
    public static int fold(final int[] a, final IntBinaryOperator op) {
        int ret = a[0]; for (int i = 1; i < a.length; i++) ret = op.applyAsInt(ret, a[i]);
        return ret;
    }
    public static int sum(final int[] a) {return fold(a, Integer::sum);}
    public static int max(final int[] a) {return fold(a, Integer::max);}
    public static int min(final int[] a) {return fold(a, Integer::min);}
    public static IntPair maxWithIndex(final int[] a) {
        int max = max(a); return new IntPair(find(a, max), max);
    }
    public static IntPair minWithIndex(final int[] a) {
        int min = min(a); return new IntPair(find(a, min), min);
    }
    public static int find(final int[] a, final int v) {
        for (int i = 0; i < a.length; i++) if (a[i] == v) return i;
        return -1;
    }
    public static void map(final int[] a, final IntUnaryOperator op) {Arrays.setAll(a, i -> op.applyAsInt(a[i]));}
    public static int filter(final int[] src, final int[] dst, final IntPredicate p) {
        int idx = 0;
        for (final int e : src) if (p.test(e)) dst[idx++] = e;
        return idx;
    }
    public static int filterIndex(final int[] dst, final int beginIndex, final int endIndex, final IntPredicate p) {
        int idx = 0;
        for (int i = beginIndex; i < endIndex; i++) if (p.test(i)) dst[idx++] = i;
        return idx;
    }
    public static int filterIndex(final int dst[], final int endIndex, final IntPredicate p) {
        return filterIndex(dst, 0, endIndex, p);
    }
    public static void accumulate(final int[] a, final IntBinaryOperator op) {
        for (int i = 1; i < a.length; i++) a[i] = op.applyAsInt(a[i - 1], a[i]);
    }
    public static void accumulate(final int[] a) {
        for (int i = 1; i < a.length; i++) a[i] += a[i - 1];
    }
    public static void permute(int[] p, int[] a) {
        int n = p.length;
        boolean[] settled = new boolean[n];
        for (int i = 0; i < n; i++) {
            for (int j = i; !settled[j]; j = p[j]) {
                if (p[j] == i) {
                    settled[j] = true;
                    break;
                }
                int tmp = a[j]; a[j] = a[p[j]]; a[p[j]] = tmp;
                settled[j] = true;
            }
        }
    }
    public static void permute2(int[] p, int[] a, int[] b) {
        int n = p.length;
        boolean[] settled = new boolean[n];
        for (int i = 0; i < n; i++) {
            for (int j = i; !settled[j]; j = p[j]) {
                if (p[j] == i) {
                    settled[j] = true;
                    break;
                }
                int tmp;
                tmp = a[j]; a[j] = a[p[j]]; a[p[j]] = tmp;
                tmp = b[j]; b[j] = b[p[j]]; b[p[j]] = tmp;
                settled[j] = true;
            }
        }
    }
    public static void permute3(int[] p, int[] a, int[] b, int[] c) {
        int n = p.length;
        boolean[] settled = new boolean[n];
        for (int i = 0; i < n; i++) {
            for (int j = i; !settled[j]; j = p[j]) {
                if (p[j] == i) {
                    settled[j] = true;
                    break;
                }
                int tmp;
                tmp = a[j]; a[j] = a[p[j]]; a[p[j]] = tmp;
                tmp = b[j]; b[j] = b[p[j]]; b[p[j]] = tmp;
                tmp = c[j]; c[j] = c[p[j]]; c[p[j]] = tmp;
                settled[j] = true;
            }
        }
    }
    public static void permuteN(int[] p, int[]... as) {
        for (int[] a : as) permute(p, a);
    }
    public static int compare(final int[] a, final int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (i >= b.length) return -1;
            if (a[i] > b[i]) return 1;
            if (a[i] < b[i]) return -1;
        }
        return a.length < b.length ? 1 : 0;
    }
    public static boolean equals(final int[] a, final int[] b) {return compare(a, b) == 0;}
    public static String join(final int[] a, final String sep) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
            if (i < a.length - 1) sb.append(sep);
        }
        return sb.toString();
    }
    public static String joinWithPrefixAndSuffix(final int[] a, final IntFunction<String> idxToPre, final IntFunction<String> idxToSuf, final String sep) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(idxToPre.apply(i)).append(a[i]).append(idxToSuf.apply(i));
            if (i < a.length - 1) sb.append(sep);
        }
        return sb.toString();
    }
}



/**
 * @author https://atcoder.jp/users/suisen
 * 
 * (NON-DESTRUCTIVE) methods that returns int array.
 */
final class IntArrayFactory {
    private IntArrayFactory() {}
    public static int[] filled(final int n, final int init) {
        final int[] ret = new int[n];
        Arrays.fill(ret, init);
        return ret;
    }
    public static int[][] filled(final int n, final int m, final int init) {
        final int[][] ret = new int[n][m];
        for (int i = 0; i < n; i++) Arrays.fill(ret[i], init);
        return ret;
    }
    public static int[] generate(final int n, final IntSupplier f) {
        final int[] a = new int[n];
        Arrays.setAll(a, i -> f.getAsInt());
        return a;
    }
    public static int[][] generate(final int n, final int m, final IntSupplier f) {
        final int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) a[i] = generate(m, f);
        return a;
    }
    public static int[] indexToInt(final int n, final IntUnaryOperator f) {
        final int[] a = new int[n];
        Arrays.setAll(a, f);
        return a;
    }
    public static int[][] indexToInt(final int n, final int m, final IntBinaryOperator f) {
        final int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            final int ii = i;
            a[i] = indexToInt(m, j -> f.applyAsInt(ii, j));
        }
        return a;
    }
    public static int[] toArray(final Collection<? extends Number> collection) {
        final int n = collection.size();
        final int[] ret = new int[n];
        final Object[] coll = collection.toArray();
        for (int i = 0; i < n; i++) {
            ret[i] = ((Number) coll[i]).intValue();
        }
        return ret;
    }
    public static int[] unique(final int[] a) {
        final HashSet<Integer> set = new HashSet<>();
        for (final int e : a) set.add(e);
        final int m = set.size();
        final int[] b = new int[m];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (set.contains(a[i])) {
                b[index++] = a[i];
                set.remove(a[i]);
            }
        }
        return b;
    }
    public static int[][] transpose(final int[][] a) {
        final int n = a.length;
        final int m = a[0].length;
        final int[][] ret = new int[m][n];
        for (int j = 0; j < m; j++) for (int i = 0; i < n; i++) ret[j][i] = a[i][j];
        return ret;
    }
    public static int[] count(final int[] a, final int max) {
        final int[] ret = new int[max + 1];
        for (int i = 0; i < a.length; i++) ret[a[i]]++;
        return ret;
    }
    public static int[] map(final int[] a, final IntUnaryOperator f) {
        final int[] b = new int[a.length];
        Arrays.setAll(b, i -> f.applyAsInt(a[i]));
        return b;
    }
    public static int[] filter(final int[] a, final IntPredicate p) {
        final IntArrayList ret = new IntArrayList();
        for (final int e : a) ret.addIf(e, p);
        return ret.toArray();
    }
    public static int[] filterIndex(final int beginIndex, final int endIndex, final IntPredicate p) {
        final IntArrayList ret = new IntArrayList();
        for (int i = beginIndex; i < endIndex; i++) ret.addIf(i, p);
        return ret.toArray();
    }
    public static int[] filterIndex(final int endIndex, final IntPredicate p) {
        return filterIndex(0, endIndex, p);
    }
    public static int[] accumulateFromHead(final int[] a, final IntBinaryOperator op, final int e) {
        final int n = a.length;
        final int[] ret = new int[n + 1];
        ret[0] = e;
        for (int i = 0; i < n; i++) ret[i + 1] = op.applyAsInt(ret[i], a[i]);
        return ret;
    }
    public static int[] accumulateFromTail(final int[] a, final IntBinaryOperator op, final int e) {
        final int n = a.length;
        final int[] ret = new int[n + 1];
        ret[n] = e;
        for (int i = n - 1; i >= 0; i--) ret[i] = op.applyAsInt(ret[i + 1], a[i]);
        return ret;
    }
}
