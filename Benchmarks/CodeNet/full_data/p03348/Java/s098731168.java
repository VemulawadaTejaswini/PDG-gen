import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.OptionalInt;
import java.util.PrimitiveIterator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
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
        var g = new IntArrayList[n];
        for (int i = 0; i < n; i++) {
            g[i] = new IntArrayList();
        }
        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            g[u].add(v);
            g[v].add(u);
        }
        int x = farthestPath(g, 0)[0];
        int[] path = farthestPath(g, x);
        int y = path[0];
        int d = path.length;
        out.write(d / 2 + 1).writeSpace();
        if (d % 2 == 1) {
            long leaves = 2;
            int r1 = path[(d - 1) / 2];
            int r2 = path[(d + 1) / 2];
            int[] dep = new int[n];
            int[] max = new int[(d + 1) / 2];
            Arrays.fill(dep, -1);
            dep[r1] = dep[r2] = 0;
            IntDeque dq = new IntDeque();
            dq.addLast(r1);
            dq.addLast(r2);
            while (dq.size() > 0) {
                int u = dq.removeFirst();
                max[dep[u]] = Math.max(max[dep[u]], g[u].size() - 1);
                for (var it = g[u].iterator(); it.hasNext();) {
                    int v = it.nextInt();
                    if (dep[v] < 0) {
                        dq.addLast(v);
                        dep[v] = dep[u] + 1;
                    }
                }
            }
            for (int i = 0; i < (d - 1) / 2; i++) {
                leaves *= max[i];
            }
            out.writeln(leaves);
        } else {
            long[] leaves = new long[d / 2 + 1];
            int r = path[d / 2];
            int[] dep = new int[n];
            Arrays.fill(dep, -1);
            dep[r] = 0;
            int c = g[r].size();
            leaves[0] = c;
            IntArrayList[] max = new IntArrayList[c];
            IntDeque dq = new IntDeque();
            for (int i = 0; i < c; i++) {
                max[i] = new IntArrayList();
                int ch = g[r].get(i);
                dep[ch] = 1;
                dq.addLast(ch);
                while (dq.size() > 0) {
                    int u = dq.removeFirst();
                    int chs = g[u].size() - 1;
                    if (max[i].size() > dep[u] - 1) {
                        max[i].set(dep[u] - 1, Math.max(max[i].get(dep[u] - 1), chs));
                    } else {
                        max[i].add(chs);
                    }
                    leaves[dep[u]] = Math.max(leaves[dep[u]], chs);
                    for (var it = g[u].iterator(); it.hasNext();) {
                        int v = it.nextInt();
                        if (dep[v] < 0) {
                            dq.addLast(v);
                            dep[v] = dep[u] + 1;
                        }
                    }
                }
            }
            // out.writeln();
            leaves[d / 2] = 1;
            for (int i = d / 2; i > 0; i--) {
                leaves[i - 1] *= leaves[i];
                // out.writeln("l[" + (i - 1) + "] = " + leaves[i - 1]);
            }
            long min = leaves[0];
            IntOrderedMultiSet[] sets = new IntOrderedMultiSet[d / 2 + 1];
            for (int i = 0; i <= d / 2; i++) {
                sets[i] = new IntOrderedMultiSet();
            }
            // out.writeln();
            for (int i = 0; i < c; i++) {
                // out.writeln("ch: " + g[r].get(i));
                for (int j = 0; j < max[i].size(); j++) {
                    sets[j + 1].insertKey(max[i].get(j));
                    // out.writeln("max[" + g[r].get(i) + "][" + (j + 1) + "] = " + max[i].get(j));
                }
            }
            // out.writeln();
            // out.writeln("min = " + min);
            for (int i = 0; i < c; i++) {
                long lvs = 2 * Math.max(c - 1, g[g[r].get(i)].size() - 1);
                int k = max[i].size();
                lvs *= leaves[k];
                // out.writeln(lvs);
                for (int j = 0; j < Math.min(k - 1, d / 2 - 1); j++) {
                    int siz = sets[j + 1].size();
                    int l = sets[j + 1].kthElement(siz - 1);
                    int lij = j + 1 < k ? max[i].get(j + 1) : 0;
                    // out.writeln("lij = " + lij);
                    if (l == max[i].get(j)) {
                        lvs *= Math.max(sets[j + 1].kthElement(siz - 2), lij);
                    } else {
                        lvs *= Math.max(l, lij);
                    }
                }
                // out.writeln("leaves[" + g[r].get(i) + "] = " + lvs);
                min = Math.min(min, lvs);
            }
            out.writeln(min);
        }
    }

    public static int[] farthestPath(IntArrayList[] g, int from) {
        int n = g.length;
        int[] d = new int[n];
        int[] p = new int[n];
        Arrays.fill(d, -1);
        d[from] = 0;
        p[from] = -1;
        int dst = from;
        IntDeque dq = new IntDeque();
        dq.addLast(from);
        while (dq.size() > 0) {
            int u = dq.removeFirst();
            for (var it = g[u].iterator(); it.hasNext();) {
                int v = it.nextInt();
                if (d[v] < 0) {
                    dq.addLast(v);
                    if (d[dst] < (d[v] = d[u] + 1)) dst = v;
                    p[v] = u;
                }
            }
        }
        int len = d[dst];
        int[] path = new int[len];
        for (int v = dst, idx = 0; v != from; v = p[v]) {
            path[idx++] = v;
        }
        return path;
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
    public int hashCode() {
        int hash = 1;
        hash = hash * 31 + fst;
        hash = hash * 31 + snd;
        return hash;
    }
    @Override
    public String toString() {return "(" + this.fst + ", " + this.snd + ")";}
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


class IntRandomizedBinarySearchTree<V> {
    private Node splitLeft, splitRight;
    private Random rnd = new Random();
    Node merge(Node l, Node r) {
        if (l == null) return r;
        if (r == null) return l;
        if (rnd.nextInt(l.size + r.size) < l.size) {
            l.r = merge(l.r, r);
            return l.update();
        } else {
            r.l = merge(l, r.l);
            return r.update();
        }
    }
    void split(Node x, int k) {
        if (k < 0 || k > size(x)) {
            throw new IndexOutOfBoundsException(
                String.format("index %d is out of bounds for the length of %d", k, size(x))
            );
        }
        if (x == null) {
            splitLeft = null;
            splitRight = null;
        } else if (k <= size(x.l)) {
            split(x.l, k);
            x.l = splitRight;
            splitRight = x.update();
        } else {
            split(x.r, k - size(x.l) - 1);
            x.r = splitLeft;
            splitLeft = x.update();
        }
    }
    Node insert(Node t, int k, int key, V val) {
        split(t, k);
        return merge(merge(splitLeft, new Node(key, val)), splitRight);
    }
    Node erase(Node t, int k) {
        split(t, k);
        Node l = splitLeft;
        split(splitRight, 1);
        return merge(l, splitRight);
    }
    int size(Node nd) {return nd == null ? 0 : nd.size;}
    class Node extends IntEntry<V> {
        Node l, r;
        int size;
        private Node(int key, V val) {super(key, val); this.size = 1;}
        private Node update() {
            size = size(l) + size(r) + 1;
            return this;
        }
    }
}

final class Random {
    private static final double DOUBLE_UNIT = 0x1.0p-53;
    private int x = 123456789;
    private int y = 362436069;
    private int z = 521288629;
    private int w = 88675123;
    public int nextInt() {
        int t = x ^ (x << 11);
        x = y; y = z; z = w;
        return w = (w ^ (w >> 19)) ^ (t ^ (t >> 8));
    }
    public long nextLong() {
        return ((long) (nextInt()) << 32) + nextInt();
    }
    public int nextInt(int bound) {
        return nextInt() % bound;
    }
    public boolean nextBoolean() {
        return (nextInt() & 1) == 0;
    }
    public double nextDouble() {
        return (((long) (next(26)) << 27) + next(27)) * DOUBLE_UNIT;
    }
    private int next(int bits) {
        int mask = bits == 32 ? -1 : (1 << bits) - 1;
        return nextInt() & mask;
    }
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
    public static int lowerBound(int[] sorted, int key) {
        int n = sorted.length;
        int l = -1, r = n;
        while (r - l > 1) {
            int m = (l + r) >> 1;
            if (sorted[m] < key) l = m;
            else r = m;
        }
        return r;
    }
    public static int upperBound(int[] sorted, int key) {
        int n = sorted.length;
        int l = -1, r = n;
        while (r - l > 1) {
            int m = (l + r) >> 1;
            if (sorted[m] <= key) l = m;
            else r = m;
        }
        return r;
    }
    public static int countRange(int[] sorted, int fromKey, int toKey) {
        return lowerBound(sorted, toKey) - lowerBound(sorted, fromKey);
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

class IntEntry<V> {
    int key;
    V val;
    IntEntry(int key, V val) {
        this.key = key;
        this.val = val;
    }
    public int getKey() {return key;}
    public V getValue() {return val;}
    public V setValue(V val) {
        V oldValue = this.val;
        this.val = val;
        return oldValue;
    }
    public boolean equals(Object o) {
        if (!(o instanceof IntEntry)) return false;
        IntEntry<?> e = (IntEntry<?>) o;
        return key == e.getKey() && (val == null ? e.val == null : val.equals(e.val));
    }
    public int hashCode() {
        int keyHash = key;
        int valueHash = (val == null ? 0 : val.hashCode());
        return keyHash ^ valueHash;
    }
    public String toString() {return key + "=" + val;}
}

class IntOrderedMultiSet extends IntRandomizedBinarySearchTree<Object> {
    Node root;
    int kthElement(Node t, int k) {
        int c = size(t.l);
        if (k < c) return kthElement(t.l, k);
        if (k == c) return t.key;
        return kthElement(t.r, k - c - 1);
    }
    public int kthElement(int k) {
        if (k < 0 || k >= size()) throw new IndexOutOfBoundsException();
        return kthElement(root, k);
    }
    Node insertKey(Node t, int key) {
        return insert(t, leqCount(t, key), key, null);
    }
    public void insertKey(int key) {
        root = insertKey(root, key);
    }
    Node eraseKey(Node t, int key) {
        if (count(t, key) == 0) return t;
        return super.erase(t, leqCount(t, key) - 1);
    }
    public void eraseKey(int key) {
        root = eraseKey(root, key);
    }
    int count(Node t, int key) {
        return leqCount(t, key) - ltCount(t, key);
    }
    public int count(int key) {
        return count(root, key);
    }
    int leqCount(Node t, int key) {
        if (t == null) return 0;
        if (key < t.key) return leqCount(t.l, key);
        return leqCount(t.r, key) + size(t.l) + 1;
    }
    public int leqCount(int key) {
        return leqCount(root, key);
    }
    int ltCount(Node t, int key) {
        if (t == null) return 0;
        if (key <= t.key) return ltCount(t.l, key);
        return ltCount(t.r, key) + size(t.l) + 1;
    }
    public int ltCount(int key) {
        return ltCount(root, key);
    }
    public int size() {
        return size(root);
    }
    public void clear() {
        this.root = null;
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 * 
 * Implementation of deque for primitive int type, using Ring Buffer.
 */
final class IntDeque implements Iterable<Integer> {
    static final int DEFAULT_CAPACITY = 1 << 6;
    int[] buf;
    int len = 1;
    int mask;
    int head = 0;
    int tail = 0;
    public IntDeque(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException(
                String.format("Capacity %d is negative.", capacity)
            );
        }
        while (this.len < capacity) {
            this.len <<= 1;
        }
        this.mask = this.len - 1;
        this.buf = new int[len];
    }
    public IntDeque() {
        this(DEFAULT_CAPACITY);
    }
    public int getLast() {
        if (size() == 0) throw new NoSuchElementException();
        return buf[(tail - 1) & mask];
    }
    public int getFirst() {
        if (size() == 0) throw new NoSuchElementException();
        return buf[head];
    }
    public int get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException(
                String.format("Index %d out of bounds for length %d.", index, size())
            );
        }
        return buf[(head + index) & mask];
    }
    public void addLast(int v) {
        if (size() == len) grow();
        buf[tail++ & mask] = v;
    }
    public void addFirst(int v) {
        if (size() == len) grow();
        buf[--head & mask] = v;
    }
    public int removeLast() {
        if (size() == 0) throw new NoSuchElementException();
        return buf[--tail & mask];
    }
    public int removeFirst() {
        if (size() == 0) throw new NoSuchElementException();
        return buf[head++ & mask];
    }
    public OptionalInt pollLast() {
        if (size() == 0) return OptionalInt.empty();
        return OptionalInt.of(removeLast());
    }
    public OptionalInt pollFirst() {
        if (size() == 0) return OptionalInt.empty();
        return OptionalInt.of(removeFirst());
    }
    public int size() {
        return tail - head;
    }
    public boolean isEmpty() {
        return size() == 0;
    }
    public void clear() {
        head = tail = 0;
    }
    public int[] toArray() {
        int[] ret = new int[size()];
        PrimitiveIterator.OfInt it = iterator();
        Arrays.setAll(ret, i -> it.nextInt());
        return ret;
    }
    private void grow() {
        int[] newBuf = new int[len << 1];
        head &= mask;
        tail &= mask;
        int len1 = len - head;
        int len2 = head;
        System.arraycopy(buf, head, newBuf, 0, len1);
        System.arraycopy(buf, 0, newBuf, len1, len2);
        this.head = 0;
        this.tail = this.len;
        this.len <<= 1;
        this.mask = this.len - 1;
        this.buf = newBuf;
    }
    public PrimitiveIterator.OfInt iterator() {
        return new PrimitiveIterator.OfInt(){
            int it = head;
            public boolean hasNext() {return it < tail;}
            public int nextInt() {return buf[it++ & mask];}
        };
    }
    public PrimitiveIterator.OfInt descendingIterator() {
        return new PrimitiveIterator.OfInt(){
            int it = tail;
            public boolean hasNext() {return it > head;}
            public int nextInt() {return buf[--it & mask];}
        };
    }

    /***************************** DEBUG *********************************/

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        PrimitiveIterator.OfInt it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) sb.append(',');
        }
        sb.append(']');
        return sb.toString();
    }
}
