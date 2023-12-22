import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.PrimitiveIterator;
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
        int m = In.ni();
        char[] c = In.nc();
        boolean[] s = new boolean[n + 2];
        for (int i = 0; i < n; i++) s[i] = c[i] == 'A';
        s[n] = true;
        IntArrayList[] g = new IntArrayList[n];
        for (int i = 0; i < n; i++) g[i] = new IntArrayList();
        UnionFindTree t = new UnionFindTree(n);
        for (int i = 0; i < m; i++) {
            int u = In.ni() - 1;
            int v = In.ni() - 1;
            g[u].add(v);
            if (v != u) {
                g[v].add(u);
                t.unite(u, v);
            }
        }
        IntHashSet set = new IntHashSet();
        for (int i = 0; i < n; i++) {
            if (t.isRoot(i) && (dfs(g, i, n, s, set) > 0 || dfs(g, i, n + 1, s, set) > 0)) {
                out.append("Yes");
                return;
            }
        }
        out.append("No");
    }

    public static int dfs(IntArrayList[] g, int u, int p, boolean[] s, IntHashSet set) {
        set.add(u);
        PrimitiveIterator.OfInt it = g[u].iterator();
        while (it.hasNext()) {
            int v = it.nextInt();
            if (s[v] ^ s[p] && (set.contains(v) && v != u || dfs(g, v, u, s, set) > 0)) return 1;
        }
        set.remove(u);
        return -1;
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


final class IntHashSet implements Iterable<Integer> {
    private static final int PRIME = 998244353;
    private static final int DEFAULT_SIZE = 64;
    private int size = 1;
    private int max;
    private int mask;

    private int elms = 0;

    private static final int EMPTY = 0;
    private static final int REMOVED = 1;

    private boolean containsZero = false;
    private boolean containsOne = false;

    private int[] hashTable;

    public IntHashSet() {this(DEFAULT_SIZE);}
    public IntHashSet(int capacity) {
        capacity += capacity / 3;
        while (capacity > this.size) this.size <<= 1;
        this.max = (this.size >> 1) | (this.size >> 2);
        this.mask = this.size - 1;
        this.hashTable = new int[this.size];
    }

    private int indexOf(final int key) {
        int ki = (int) ((long) key * PRIME) & mask;
        for (int i = 0; i < size; i++) {
            if (hashTable[ki] == EMPTY) return -1;
            if (hashTable[ki] == key) return ki;
            ki = (ki + 1) & mask;
        }
        return -1;
    }

    public boolean contains(final int key) {
        if (key == 0) return containsZero;
        if (key == 1) return containsOne;
        return indexOf(key) >= 0;
    }

    public void add(final int key) {
        if (key == 0) {containsZero = true; return;}
        if (key == 1) {containsOne = true; return;}
        int ki = (int) ((long) key * PRIME) & mask;
        for (int i = 0; i < size; i++) {
            if (hashTable[ki] == key) {
                return;
            } else if (hashTable[ki] == EMPTY) {
                hashTable[ki] = key;
                if (++elms == max) grow();
                return;
            } else if (hashTable[ki] == REMOVED) {
                hashTable[ki] = key;
                while (++i < size) {
                    ki = (ki + 1) & mask;
                    if (hashTable[ki] == EMPTY) break;
                    else if (hashTable[ki] == key) {hashTable[ki] = REMOVED; return;}
                }
                if (++elms == max) grow();
                return;
            }
            ki = (ki + 1) & mask;
        }
        throw new RuntimeException("failed.");
    }

    public void remove(final int key) {
        if (key == 0) {containsZero = false; return;}
        if (key == 1) {containsOne = false; return;}
        final int ki = indexOf(key);
        if (ki < 0) return;
        hashTable[ki] = REMOVED;
        elms--;
    }

    public int size() {
        return elms + (containsZero ? 1 : 0) + (containsOne ? 1 : 0);
    }

    private void grow() {
        final int newSize = size << 1, newMask = newSize - 1;
        final int[] newHashTable = new int[newSize];
        for (int i = 0; i < size; i++) {
            final int key = hashTable[i];
            if (key != EMPTY && key != REMOVED) {
                int ki = (int) ((long) key * PRIME) & newMask;
                while (newHashTable[ki] != EMPTY && newHashTable[ki] != REMOVED) ki = (ki + 1) & newMask;
                newHashTable[ki] = key;
            }
        }
        size = newSize; max = (size >> 1) | (size >> 2); mask = newMask;
        hashTable = newHashTable;
    }

    public PrimitiveIterator.OfInt iterator() {return new KeyIterator();}

    private class KeyIterator implements PrimitiveIterator.OfInt {
        int i = -2;
        public boolean hasNext() {
            if (i == -2) {
                if (containsZero) return true;
                i = -1;
            }
            if (i == -1) {
                if (containsOne) return true;
                i = 0;
            }
            for (; i < size; i++) if (hashTable[i] != EMPTY && hashTable[i] != REMOVED) return true;
            return false;
        }
        public int nextInt() {
            if (i == -2) {i++; return 0;}
            if (i == -1) {i++; return 1;}
            return hashTable[i++];
        }
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
    public int removeLast() {return a[tail--];}
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
    public void reverse(final int begin, final int end) {IntArrays.reverse(a, begin, end);}
    public void reverse() {IntArrays.reverse(a, 0, tail);}
    public int[] toArray() {
        final int[] ret = new int[tail];
        System.arraycopy(a, 0, ret, 0, tail);
        return ret;
    }
    public boolean addIf(final int v, final IntPredicate p) {
        if (p.test(v)) {add(v); return true;}
        return false;
    }
    public void clear() {tail = 0;}
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
    public static void reverse(final int[] a, final int begin, final int end) {
        for (int i = begin; i < begin + (end - begin) / 2; i++) swap(a, i, begin + end - i - 1);
    }
    public static void reverse(final int[] a) {reverse(a, 0, a.length);}
    public static void sortDescending(final int[] a) {Arrays.sort(a); reverse(a);}
    public static int reduce(final int[] a, final IntBinaryOperator op) {
        int ret = a[0]; for (int i = 1; i < a.length; i++) ret = op.applyAsInt(ret, a[i]);
        return ret;
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
    public static void permute(int[] a, int[] p) {
        int n = p.length;
        boolean[] settled = new boolean[n];
        for (int i = 0; i < n; i++) {
            for (int j = i; !settled[j]; j = p[j]) {
                if (p[j] == i) {
                    settled[j] = true;
                    break;
                }
                swap(a, j, p[j]);
                settled[j] = true;
            }
        }
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
 */
final class UnionFindTree {
    private final int[] data;
    public UnionFindTree(final int n) {this.data = new int[n]; Arrays.fill(data, -1);}
    public int root(final int x) {return data[x] < 0 ? x : (data[x] = root(data[x]));}
    public boolean isSame(final int x, final int y) {return root(x) == root(y);}
    public boolean unite(int x, int y) {
        x = root(x); y = root(y);
        if (x == y) return false;
        if (data[x] > data[y]) {int tmp = x; x = y; y = tmp;}
        data[x] += data[y];
        data[y] = x;
        return true;
    }
    public int size(final int x) {return -data[root(x)];}
    public boolean isRoot(final int x) {return data[x] < 0;}
}
