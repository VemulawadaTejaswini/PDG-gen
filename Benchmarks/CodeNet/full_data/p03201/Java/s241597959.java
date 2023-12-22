import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.PrimitiveIterator;
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
        int[] a = sc.ints(n);
        RadixSort.sortDescending(a);
        HashMap<Integer, IntDeque> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(a[i])) {
                map.put(a[i], new IntDeque());
            }
            map.get(a[i]).addLast(i);
        }
        boolean[] ok = new boolean[n];
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (ok[i]) continue;
            int v = a[i];
            int x = 32 - Integer.numberOfLeadingZeros(v);
            int y = Integer.numberOfTrailingZeros(v);
            if (x == y + 1) {
                map.get(v).removeFirst();
            }
            int u = BitUtil.flip(v, y, x);
            u += 1 << y;
            if (map.containsKey(u)) {
                IntDeque dq = map.get(u);
                if (dq.size() > 0) {
                    int j = dq.removeFirst();
                    ok[i] = ok[j] = true;
                    c++;
                }
            }
            if (x != y + 1) {
                map.get(v).removeFirst();
            }
        }
        out.writeln(c);
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
 * @author https://atcoder.jp/users/suisen
 * 
 * Implementation of deque for primitive int type, using Ring Buffer.
 */
final class IntDeque implements Iterable<Integer> {
    private static final int DEFAULT_CAPACITY = 64;
    private int[] ringBuffer;
    private int head;
    private int tail;
    private int len;
    private int mask;
    private int size;
    public IntDeque(int capacity) {
        initialize(capacity);
    }
    public IntDeque() {
        this(DEFAULT_CAPACITY);
    }
    public void addFirst(int val) {
        if (size == len) grow();
        head = (head - 1 + len) & mask;
        ringBuffer[head] = val;
        size++;
    }
    public void addLast(int val) {
        if (size == len) grow();
        ringBuffer[tail] = val;
        tail = (tail + 1) & mask;
        size++;
    }
    public int removeFirst() {
        if (size == 0) throw new NoSuchElementException("Deque is empty.");
        int ret = ringBuffer[head];
        head = (head + 1) & mask;
        size--;
        return ret;
    }
    public int removeLast() {
        if (size == 0) throw new NoSuchElementException("Deque is empty.");
        tail = (tail - 1 + len) & mask;
        int ret = ringBuffer[tail];
        size--;
        return ret;
    }
    public int get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);
        return ringBuffer[(head + index) & mask];
    }
    public int getFirst() {
        if (size == 0) throw new NoSuchElementException("Deque is empty.");
        return ringBuffer[head];
    }
    public int getLast() {
        if (size == 0) throw new NoSuchElementException("Deque is empty.");
        return ringBuffer[(tail - 1 + len) & mask];
    }
    public int size() {
        return size;
    }
    public void clear() {
        head = tail = 0;
    }
    public void clear(int newCapacity) {
        initialize(newCapacity);
    }
    public PrimitiveIterator.OfInt iterator() {
        return new DequeIterator();
    }
    public PrimitiveIterator.OfInt descendingIterator() {
        return new DescendingDequeIterator();
    }
    public int[] toArray() {
        int[] ret = new int[size];
        for (int i = 0; i < size; i++) ret[i] = ringBuffer[(head + i) & mask];
        return ret;
    }
    private void grow() {
        int len1 = len - head, len2 = len - len1;
        int[] newArray = new int[len << 1];
        System.arraycopy(ringBuffer, head, newArray, 0, len1);
        System.arraycopy(ringBuffer, 0, newArray, len1, len2);
        ringBuffer = newArray;
        len <<= 1;
        mask = len - 1;
        head = 0; tail = size;
    }
    private void initialize(int capacity) {
        int k = 1; while (k < capacity) k <<= 1;
        this.len = k;
        this.mask = k - 1;
        this.ringBuffer = new int[k];
        this.head = 0;
        this.tail = 0;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < size; i++) {
            sb.append(ringBuffer[(head + i) & mask]);
            if (i < size - 1) sb.append(',');
        }
        sb.append(']');
        return sb.toString();
    }

    private class DequeIterator implements PrimitiveIterator.OfInt {
        private int it;
        public boolean hasNext() {return it < size;}
        public int nextInt() {return ringBuffer[(head + it++) & mask];}
    }
    private class DescendingDequeIterator implements PrimitiveIterator.OfInt {
        private int it = size;
        public boolean hasNext() {return it > 0;}
        public int nextInt() {return ringBuffer[(head + --it) & mask];}
    }
}

/**
 * @author https://atcoder.jp/users/suisen
 */
final class BitUtil {
    private static final int[] INT_MASK = {
        0x0000_0000,
        0x0000_0001, 0x0000_0003, 0x0000_0007, 0x0000_000f,
        0x0000_001f, 0x0000_003f, 0x0000_007f, 0x0000_00ff,
        0x0000_01ff, 0x0000_03ff, 0x0000_07ff, 0x0000_0fff,
        0x0000_1fff, 0x0000_3fff, 0x0000_7fff, 0x0000_ffff,
        0x0001_ffff, 0x0003_ffff, 0x0007_ffff, 0x000f_ffff,
        0x001f_ffff, 0x003f_ffff, 0x007f_ffff, 0x00ff_ffff,
        0x01ff_ffff, 0x03ff_ffff, 0x07ff_ffff, 0x0fff_ffff,
        0x1fff_ffff, 0x3fff_ffff, 0x7fff_ffff, 0xffff_ffff
    };
    private static final long[] LONG_MASK = {
        0x0000_0000_0000_0000l,
        0x0000_0000_0000_0001l, 0x0000_0000_0000_0003l, 0x0000_0000_0000_0007l, 0x0000_0000_0000_000fl, 
        0x0000_0000_0000_001fl, 0x0000_0000_0000_003fl, 0x0000_0000_0000_007fl, 0x0000_0000_0000_00ffl, 
        0x0000_0000_0000_01ffl, 0x0000_0000_0000_03ffl, 0x0000_0000_0000_07ffl, 0x0000_0000_0000_0fffl,
        0x0000_0000_0000_1fffl, 0x0000_0000_0000_3fffl, 0x0000_0000_0000_7fffl, 0x0000_0000_0000_ffffl, 
        0x0000_0000_0001_ffffl, 0x0000_0000_0003_ffffl, 0x0000_0000_0007_ffffl, 0x0000_0000_000f_ffffl, 
        0x0000_0000_001f_ffffl, 0x0000_0000_003f_ffffl, 0x0000_0000_007f_ffffl, 0x0000_0000_00ff_ffffl, 
        0x0000_0000_01ff_ffffl, 0x0000_0000_03ff_ffffl, 0x0000_0000_07ff_ffffl, 0x0000_0000_0fff_ffffl, 
        0x0000_0000_1fff_ffffl, 0x0000_0000_3fff_ffffl, 0x0000_0000_7fff_ffffl, 0x0000_0000_ffff_ffffl,
        0x0000_0001_ffff_ffffl, 0x0000_0003_ffff_ffffl, 0x0000_0007_ffff_ffffl, 0x0000_000f_ffff_ffffl, 
        0x0000_001f_ffff_ffffl, 0x0000_003f_ffff_ffffl, 0x0000_007f_ffff_ffffl, 0x0000_00ff_ffff_ffffl, 
        0x0000_01ff_ffff_ffffl, 0x0000_03ff_ffff_ffffl, 0x0000_07ff_ffff_ffffl, 0x0000_0fff_ffff_ffffl,
        0x0000_1fff_ffff_ffffl, 0x0000_3fff_ffff_ffffl, 0x0000_7fff_ffff_ffffl, 0x0000_ffff_ffff_ffffl, 
        0x0001_ffff_ffff_ffffl, 0x0003_ffff_ffff_ffffl, 0x0007_ffff_ffff_ffffl, 0x000f_ffff_ffff_ffffl, 
        0x001f_ffff_ffff_ffffl, 0x003f_ffff_ffff_ffffl, 0x007f_ffff_ffff_ffffl, 0x00ff_ffff_ffff_ffffl, 
        0x01ff_ffff_ffff_ffffl, 0x03ff_ffff_ffff_ffffl, 0x07ff_ffff_ffff_ffffl, 0x0fff_ffff_ffff_ffffl, 
        0x1fff_ffff_ffff_ffffl, 0x3fff_ffff_ffff_ffffl, 0x7fff_ffff_ffff_ffffl, 0xffff_ffff_ffff_ffffl
    };
    private BitUtil(){}
    public static boolean test (final long n, final int bit) {return (n & (1l << bit)) != 0;}
    public static boolean test (final int  n, final int bit) {return (n & (1  << bit)) != 0;}

    public static int     get  (final long n, final int bit) {return (n & (1l << bit)) == 0 ? 1 : 0;}
    public static int     get  (final int  n, final int bit) {return (n & (1  << bit)) == 0 ? 1 : 0;}

    public static long    set  (final long n, final int bit)                   {return n | (1l << bit);}
    public static int     set  (final int  n, final int bit)                   {return n | (1  << bit);}
    public static long    set  (final long n, final int from, final int to)    {return n | (LONG_MASK[to - from] << from);}
    public static int     set  (final int  n, final int from, final int to)    {return n | (INT_MASK [to - from] << from);}
    public static long    set  (final long n, final int bit,  final boolean b) {return b ? n | (1l << bit) : n & ~(1l << bit);}
    public static int     set  (final int  n, final int bit,  final boolean b) {return b ? n | (1  << bit) : n & ~(1  << bit);}
    public static long    set  (final long n, final int from, final int to, final boolean b) {return b ? n | (LONG_MASK[to - from] << from) : n & ~(LONG_MASK[to - from] << from);}
    public static int     set  (final int  n, final int from, final int to, final boolean b) {return b ? n | (INT_MASK [to - from] << from) : n & ~(INT_MASK [to - from] << from);}

    public static long    clear(final long n, final int bit)                {return n & ~(1l << bit);}
    public static int     clear(final int  n, final int bit)                {return n & ~(1  << bit);}
    public static long    clear(final long n, final int from, final int to) {return n & ~(LONG_MASK[to - from] << from);}
    public static int     clear(final int  n, final int from, final int to) {return n & ~(INT_MASK [to - from] << from);}

    public static long    flip (final long n, final int bit)                {return n ^ (1l << bit);}
    public static int     flip (final int  n, final int bit)                {return n ^ (1  << bit);}
    public static long    flip (final long n, final int from, final int to) {return n ^ (LONG_MASK[to - from] << from);}
    public static int     flip (final int  n, final int from, final int to) {return n ^ (INT_MASK [to - from] << from);}

    public static long    mask (final long n, final int bit)                {return n & (1l << bit);}
    public static int     mask (final int  n, final int bit)                {return n & (1  << bit);}
    public static long    mask (final long n, final int from, final int to) {return n & (LONG_MASK[to - from] << from);}
    public static int     mask (final int  n, final int from, final int to) {return n & (INT_MASK [to - from] << from);}

    public static int     bsr  (final long n) {return 63 - Long   .numberOfLeadingZeros (n);}
    public static int     bsr  (final int  n) {return 31 - Integer.numberOfLeadingZeros (n);}
}
