import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.PrimitiveIterator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;
import static java.lang.Math.max;



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
        LongHashMap sm = new LongHashMap();
        LongHashMap tm = new LongHashMap();
        int n = In.ni();
        for (int i = 0; i < n; i++) {
            long key = toLong(In.ns());
            sm.put(key, sm.getOrDefault(key, 0) + 1);
        }
        int m = In.ni();
        for (int j = 0; j < m; j++) {
            long key = toLong(In.ns());
            tm.put(key, tm.getOrDefault(key, 0) + 1);
        }
        long max = 0;
        for (LongHashMap.Entry e : sm) {
            long sn = e.getValue();
            long tn = tm.getOrDefault(e.getKey(), 0);
            max = max(max, sn - tn);
        }
        out.append(max);
    }

    public static long toLong(String s) {
        long ret = 0l;
        for (int i = 0, l = s.length(); i < l; i++) ret = ret * 26 + s.charAt(i) - 'a';
        return ret;
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


final class LongHashMap implements Iterable<LongHashMap.Entry> {
    private static final int PRIME = 998244353;
    private static final int DEFAULT_SIZE = 64;
    private int size = 1;
    private int max;
    private int mask;

    private int elms = 0;

    private static final long EMPTY = 0;
    private static final long REMOVED = 1;

    private boolean containsZero = false;
    private boolean containsOne = false;
    private long valueOfZero;
    private long valueOfOne;

    private long[] hashTable;
    private long[] values;

    public LongHashMap() {this(DEFAULT_SIZE);}
    public LongHashMap(int capacity) {
        capacity += capacity / 3;
        while (capacity > size) this.size <<= 1;
        this.max = (size >> 1) | (size >> 2);
        this.mask = size - 1;
        this.hashTable = new long[size];
        this.values = new long[size];
    }

    private int indexOf(final long key) {
        int ki = (int) ((key ^ (key >>> 32)) * PRIME) & mask;
        for (int i = 0; i < size; i++) {
            if (hashTable[ki] == EMPTY) return -1;
            if (hashTable[ki] == key) return ki;
            ki = (ki + 1) & mask;
        }
        return -1;
    }

    public boolean contains(final long key) {
        if (key == 0) return containsZero;
        if (key == 1) return containsOne;
        return indexOf(key) >= 0;
    }

    public long get(final long key) {
        if (key == 0) {
            if (!containsZero) throw new NoSuchElementException("cannot find the key.");
            return valueOfZero;
        }
        if (key == 1) {
            if (!containsOne) throw new NoSuchElementException("cannot find the key.");
            return valueOfOne;
        }
        final int ki = indexOf(key);
        if (ki >= 0) return values[ki];
        throw new NoSuchElementException("cannot find the key.");
    }

    public long getOrDefault(final long key, final long defaultValue) {
        if (key == 0) return containsZero ? valueOfZero : defaultValue;
        if (key == 1) return containsOne ? valueOfOne : defaultValue;
        final int ki = indexOf(key);
        return ki >= 0 ? values[ki] : defaultValue;
    }

    public void put(final long key, final long value) {
        if (key == 0) {
            if (!containsZero) {elms++; containsZero = true;}
            valueOfZero = value; return;
        }
        if (key == 1) {
            if (!containsOne) {elms++; containsOne = true;}
            valueOfOne = value; return;
        }
        int ki = (int) ((key ^ (key >>> 32)) * PRIME) & mask;
        for (int i = 0; i < size; i++) {
            if (hashTable[ki] == key) {
                values[ki] = value;
                return;
            } else if (hashTable[ki] == EMPTY) {
                hashTable[ki] = key; values[ki] = value;
                if (++elms == max) grow();
                return;
            } else if (hashTable[ki] == REMOVED) {
                hashTable[ki] = key; values[ki] = value;
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

    public void putIfAbsent(final long key, final long value) {
        if (contains(key)) return;
        put(key, value);
    }

    public void remove(final long key) {
        if (key == 0) {
            if (containsZero) elms--;
            containsZero = false; return;
        } else if (key == 1) {
            if (containsOne) elms--;
            containsOne = false; return;
        }
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
        final long[] newHashTable = new long[newSize], newValues = new long[newSize];
        for (int i = 0; i < size; i++) {
            final long key = hashTable[i];
            if (key != EMPTY && key != REMOVED) {
                int ki = (int) ((key ^ (key >>> 32)) * PRIME) & newMask;
                while (newHashTable[ki] != EMPTY && newHashTable[ki] != REMOVED) ki = (ki + 1) & newMask;
                newHashTable[ki] = key; newValues[ki] = values[i];
            }
        }
        size = newSize; max = (size >> 1) | (size >> 2); hashTable = newHashTable; values = newValues;
    }

    public Iterator<Entry> iterator() {return new EntryIterator();}
    public PrimitiveIterator.OfLong keyIterator() {return new KeyIterator();}
    public PrimitiveIterator.OfLong valueIterator() {return new ValueIterator();}

    private class KeyIterator implements PrimitiveIterator.OfLong {
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
        public long nextLong() {
            if (i == -2) {i++; return 0;}
            if (i == -1) {i++; return 1;}
            return hashTable[i++];
        }
    }

    private class ValueIterator extends KeyIterator {
        @Override
        public long nextLong() {
            if (i == -2) {i++; return valueOfZero;}
            if (i == -1) {i++; return valueOfOne;}
            return values[i++];
        }
    }

    private class EntryIterator implements Iterator<Entry> {
        private final ValueIterator iter = new ValueIterator();
        public boolean hasNext() {return iter.hasNext();}
        public Entry next() {
            if (iter.i == -2) return new Entry(0, iter.nextLong());
            if (iter.i == -1) return new Entry(1, iter.nextLong());
            return new Entry(hashTable[iter.i], iter.nextLong());
        }
    }

    public static final class Entry {
        private final long key, value;
        private Entry(long key, long value) {this.key = key; this.value = value;}
        public long getKey() {return key;}
        public long getValue() {return value;}
    }
}
