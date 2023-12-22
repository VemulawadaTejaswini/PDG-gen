import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.PrimitiveIterator;
import java.util.RandomAccess;
import java.util.Set;
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
        int a = sc.nextInt() - 1;
        int b = sc.nextInt() - 1;
        var utov = new HashMap<Long, LongOrderedMap<Integer>>();
        var vtou = new HashMap<Long, LongOrderedMap<Integer>>();
        var utovrem = new HashMap<Long, LongOrderedMap<Integer>>();
        var vtourem = new HashMap<Long, LongOrderedMap<Integer>>();
        var p = new LongPair[n];
        long ax = -1, ay = -1, bx = -1, by = -1;
        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long u = x + y;
            long v = x - y;
            p[i] = new LongPair(u, v);
            if (i == a) {
                ax = x; ay = y;
            } else if (i == b) {
                bx = x; by = y;
            }
            if (!utov.containsKey(u)) {
                utov.put(u, new LongOrderedMap<>());
                utovrem.put(u, new LongOrderedMap<>());
            }
            if (!vtou.containsKey(v)) {
                vtou.put(v, new LongOrderedMap<>());
                vtourem.put(v, new LongOrderedMap<>());
            }
            utov.get(u).put(v, i);
            utovrem.get(u).put(v, i);
            vtou.get(v).put(u, i);
            vtourem.get(v).put(u, i);
        }
        utovrem.get(p[a].fst).remove(p[a].snd);
        utovrem.get(p[b].fst).remove(p[b].snd);
        vtourem.get(p[a].snd).remove(p[a].fst);
        vtourem.get(p[b].snd).remove(p[b].fst);
        long ans = 0;
        long d = Math.abs(ax - bx) + Math.abs(ay - by);
        var dq = new Deque<LongPair>();
        dq.addLast(p[a]);
        dq.addLast(p[b]);
        while (dq.size() > 0) {
            var point = dq.removeFirst();
            long u = point.fst;
            long v = point.snd;
            {
                var vset = utov.get(u + d);
                var vremset = utovrem.get(u + d);
                if (vset != null) {
                    int cnt = vset.countRange(v - d, v + d);
                    ans += cnt;
                    long curv = v - d - 1;
                    while (true) {
                        var e = vremset.higherEntry(curv);
                        if (e == null || e.getKey() >= v + d) break;
                        curv = e.getKey();
                        var pt = p[e.getValue()];
                        dq.addLast(pt);
                        vremset.remove(curv);
                        vtourem.get(pt.snd).remove(pt.fst);
                    }
                }
            }
            {
                var vset = utov.get(u - d);
                var vremset = utovrem.get(u - d);
                if (vset != null) {
                    int cnt = vset.countRange(v - d + 1, v + d + 1);
                    ans += cnt;
                    long curv = v - d;
                    while (true) {
                        var e = vremset.higherEntry(curv);
                        if (e == null || e.getKey() > v + d) break;
                        curv = e.getKey();
                        var pt = p[e.getValue()];
                        dq.addLast(pt);
                        vremset.remove(curv);
                        vtourem.get(pt.snd).remove(pt.fst);
                    }
                }
            }
            {
                var uset = vtou.get(v + d);
                var uremset = vtourem.get(v + d);
                if (uset != null) {
                    int cnt = uset.countRange(u - d + 1, u + d + 1);
                    ans += cnt;
                    long curu = u - d;
                    while (true) {
                        var e = uremset.higherEntry(curu);
                        if (e == null || e.getKey() > u + d) break;
                        curu = e.getKey();
                        var pt = p[e.getValue()];
                        dq.addLast(pt);
                        uremset.remove(curu);
                        utovrem.get(pt.fst).remove(pt.snd);
                    }
                }
            }
            {
                var uset = vtou.get(v - d);
                var uremset = vtourem.get(v - d);
                if (uset != null) {
                    int cnt = uset.countRange(u - d, u + d);
                    ans += cnt;
                    long curu = u - d - 1;
                    while (true) {
                        var e = uremset.higherEntry(curu);
                        if (e == null || e.getKey() >= u + d) break;
                        curu = e.getKey();
                        var pt = p[e.getValue()];
                        dq.addLast(pt);
                        uremset.remove(curu);
                        utovrem.get(pt.fst).remove(pt.snd);
                    }
                }
            }
        }
        out.writeln(ans / 2);
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
 * 
 * Implementation of deque for generic type, using Ring Buffer.
 */
@SuppressWarnings("unchecked")
class Deque<T> implements Iterable<T>, RandomAccess {
    static final int DEFAULT_CAPACITY = 1 << 6;
    T[] buf;
    int len = 1;
    int mask;
    int head = 0;
    int tail = 0;
    public Deque(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException(
                String.format("Capacity %d is negative.", capacity)
            );
        }
        while (this.len < capacity) {
            this.len <<= 1;
        }
        this.mask = this.len - 1;
        this.buf = (T[]) new Object[len];
    }
    public Deque() {
        this(DEFAULT_CAPACITY);
    }
    public T getLast() {
        if (size() == 0) throw new NoSuchElementException();
        return buf[(tail - 1) & mask];
    }
    public T getFirst() {
        if (size() == 0) throw new NoSuchElementException();
        return buf[head];
    }
    public T get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException(
                String.format("Index %d out of bounds for length %d.", index, size())
            );
        }
        return buf[(head + index) & mask];
    }
    public void addLast(T v) {
        if (size() == len) grow();
        buf[tail++ & mask] = v;
    }
    public void addFirst(T v) {
        if (size() == len) grow();
        buf[--head & mask] = v;
    }
    public T removeLast() {
        if (size() == 0) throw new NoSuchElementException();
        return buf[--tail & mask];
    }
    public T removeFirst() {
        if (size() == 0) throw new NoSuchElementException();
        return buf[head++ & mask];
    }
    public T pollLast() {
        if (size() == 0) return null;
        return removeLast();
    }
    public T pollFirst() {
        if (size() == 0) return null;
        return removeFirst();
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
    public T[] toArray(Class<T> clazz) {
        T[] ret = (T[]) Array.newInstance(clazz, size());
        Iterator<T> it = iterator();
        Arrays.setAll(ret, i -> it.next());
        return ret;
    }
    private void grow() {
        T[] newBuf = (T[]) new Object[len << 1];
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
    public Iterator<T> iterator() {
        return new Iterator<T>(){
            int it = head;
            public boolean hasNext() {return it < tail;}
            public T next() {return buf[it++ & mask];}
        };
    }
    public Iterator<T> descendingIterator() {
        return new Iterator<T>(){
            int it = tail;
            public boolean hasNext() {return it > head;}
            public T next() {return buf[--it & mask];}
        };
    }

    /***************************** DEBUG *********************************/

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) sb.append(',');
        }
        sb.append(']');
        return sb.toString();
    }
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
class LongOrderedMap<V> implements Iterable<LongEntry<V>> {
    private static Random rnd = new Random();
    RBST<V> root;
    public LongOrderedMap() {}
    private LongOrderedMap(RBST<V> root) {this.root = root;}
    public static <V> LongOrderedMap<V> merge(LongOrderedMap<V> l, LongOrderedMap<V> r) {
        return l.mergeRight(r);
    }
    public LongOrderedMap<V> mergeLeft(LongOrderedMap<V> l) {
        return new LongOrderedMap<>(RBST.merge(l.root, root));
    }
    public LongOrderedMap<V> mergeRight(LongOrderedMap<V> r) {
        return new LongOrderedMap<>(RBST.merge(root, r.root));
    }
    public LongOrderedMap<V> splitRightUsingIndex(int k) {
        Pair<RBST<V>, RBST<V>> p = RBST.splitUsingIndex(root, k);
        LongOrderedMap<V> fst = new LongOrderedMap<>(p.fst);
        root = fst.root;
        LongOrderedMap<V> snd = new LongOrderedMap<>(p.snd);
        return snd;
    }
    public LongOrderedMap<V> splitLeftUsingIndex(int k) {
        Pair<RBST<V>, RBST<V>> p = RBST.splitUsingIndex(root, k);
        LongOrderedMap<V> fst = new LongOrderedMap<>(p.fst);
        LongOrderedMap<V> snd = new LongOrderedMap<>(p.snd);
        root = snd.root;
        return fst;
    }
    public LongOrderedMap<V> splitRightUsingKey(long key) {
        Pair<RBST<V>, RBST<V>> p = RBST.splitUsingKey(root, key);
        LongOrderedMap<V> fst = new LongOrderedMap<>(p.fst);
        root = fst.root;
        LongOrderedMap<V> snd = new LongOrderedMap<>(p.snd);
        return snd;
    }
    public LongOrderedMap<V> splitLeftUsingKey(long key) {
        Pair<RBST<V>, RBST<V>> p = RBST.splitUsingKey(root, key);
        LongOrderedMap<V> fst = new LongOrderedMap<>(p.fst);
        LongOrderedMap<V> snd = new LongOrderedMap<>(p.snd);
        root = snd.root;
        return fst;
    }
    public LongEntry<V> kthEntry(int k) {
        if (k < 0 || k >= size()) return null;
        return RBST.kthEntry(root, k);
    }
    public LongEntry<V> firstEntry() {
        return kthEntry(0);
    }
    public LongEntry<V> lastEntry() {
        return kthEntry(size() - 1);
    }
    public LongEntry<V> lowerEntry(long key) {
        return kthEntry(RBST.ltCount(root, key) - 1);
    }
    public LongEntry<V> floorEntry(long key) {
        return kthEntry(RBST.leqCount(root, key) - 1);
    }
    public LongEntry<V> higherEntry(long key) {
        return kthEntry(RBST.leqCount(root, key));
    }
    public LongEntry<V> ceilingEntry(long key) {
        return kthEntry(RBST.ltCount(root, key));
    }
    public V get(long key) {
        return RBST.get(root, key);
    }
    public V getOrDefault(long key, V defaultValue) {
        V res = RBST.get(root, key);
        return res != null ? res : defaultValue;
    }
    public V put(long key, V val) {
        if (RBST.contains(root, key)) {
            LongEntry<V> e = RBST.getEntry(root, key);
            V oldValue = e.getValue();
            e.setValue(val);
            return oldValue;
        }
        root = RBST.insert(root, key, val);
        return null;
    }
    public V putIfAbsent(long key, V val) {
        LongEntry<V> e = RBST.getEntry(root, key);
        if (e != null) return e.getValue();
        put(key, val);
        return null;
    }
    public LongEntry<V> removeKthEntry(int k) {
        if (k < 0 || k >= size()) return null;
        Pair<RBST<V>, LongEntry<V>> nodeAndEntry = RBST.eraseUsingIndex(root, k);
        root = nodeAndEntry.fst;
        return nodeAndEntry.snd;
    }
    public LongEntry<V> remove(long key) {
        if (!containsKey(key)) return null;
        Pair<RBST<V>, LongEntry<V>> nodeAndEntry = RBST.eraseUsingKey(root, key);
        root = nodeAndEntry.fst;
        return nodeAndEntry.snd;
    }
    public boolean remove(long key, V value) {
        LongEntry<V> e = RBST.getEntry(root, key);
        if (e == null) return false;
        if (Objects.equals(value, e.getValue())) {
            Pair<RBST<V>, LongEntry<V>> nodeAndEntry = RBST.eraseUsingKey(root, key);
            root = nodeAndEntry.fst;
            return true;
        }
        return false;
    }
    public V replace(long key, V newValue) {
        LongEntry<V> e = RBST.getEntry(root, key);
        if (e == null) return null;
        V oldValue = e.getValue();
        e.setValue(newValue);
        return oldValue;
    }
    public boolean replace(long key, V oldValue, V newValue) {
        LongEntry<V> e = RBST.getEntry(root, key);
        if (e == null) return false;
        V value = e.getValue();
        if (Objects.equals(value, oldValue)) {
            e.setValue(newValue);
            return true;
        }
        return false;
    }
    public int countLessThan(long key) {
        return RBST.ltCount(root, key);
    }
    public int countLessThanOrEqual(long key) {
        return RBST.leqCount(root, key);
    }
    public int countGreaterThan(long key) {
        return size() - countLessThanOrEqual(key);
    }
    public int countGreaterThanOrEqual(long key) {
        return size() - countLessThan(key);
    }
    public int countRange(long fromKey, long toKey) {
        return countLessThan(toKey) - countLessThan(fromKey);
    }
    public boolean containsKey(long key) {
        return RBST.contains(root, key);
    }
    public int size() {
        return RBST.size(root);
    }
    public boolean isEmpty() {
        return size() == 0;
    }
    public void clear() {
        root = null;
    }
    public Set<LongEntry<V>> entrySet() {
        return RBST.entrySet(root);
    }
    public Set<LongEntry<V>> descendingEntrySet() {
        return RBST.descendingEntrySet(root);
    }
    public Iterator<LongEntry<V>> iterator() {
        return RBST.iterator(root);
    }
    public Iterator<LongEntry<V>> descendingIterator() {
        return RBST.descendingIterator(root);
    }
    public PrimitiveIterator.OfLong keyIterator() {
        return RBST.keyIterator(root);
    }
    public PrimitiveIterator.OfLong descendingKeyIterator() {
        return RBST.descendingKeyIterator(root);
    }
    public Set<Long> keySet() {
        return RBST.keySet(root);
    }
    public Set<Long> descendingKeySet() {
        return RBST.descendingKeySet(root);
    }
    public Collection<V> values() {
        return RBST.values(root);
    }
    public Optional<V> safeGet(long key) {
        V res = get(key);
        return res != null ? Optional.of(res) : Optional.empty();
    }
    public Optional<LongEntry<V>> safeGetFirstEntry() {
        return size() > 0 ? Optional.of(kthEntry(0)) : Optional.empty();
    }
    public Optional<LongEntry<V>> safeGetLastEntry() {
        return size() > 0 ? Optional.of(kthEntry(size() - 1)) : Optional.empty();
    }
    public Optional<LongEntry<V>> safeGetLowerEntry(long key) {
        int k = RBST.ltCount(root, key) - 1;
        return k >= 0 ? Optional.of(kthEntry(k)) : Optional.empty();
    }
    public Optional<LongEntry<V>> safeGetFloorEntry(long key) {
        int k = RBST.leqCount(root, key) - 1;
        return k >= 0 ? Optional.of(kthEntry(k)) : Optional.empty();
    }
    public Optional<LongEntry<V>> safeGetHigherEntry(long key) {
        int k = RBST.leqCount(root, key);
        return k < size() ? Optional.of(kthEntry(k)) : Optional.empty();
    }
    public Optional<LongEntry<V>> safeGetCeilingEntry(long key) {
        int k = RBST.ltCount(root, key);
        return k < size() ? Optional.of(kthEntry(k)) : Optional.empty();
    }
    static final class RBST<V> extends LongEntry<V> {
		private RBST<V> l, r;
        private int size;
        private RBST(long key, V val) {super(key, val); this.size = 1;}
        private RBST<V> update() {
            size = size(l) + size(r) + 1;
            return this;
        }
        static <V> LongEntry<V> getEntry(RBST<V> t, long key) {
            while (t != null) {
                if (t.key == key) return t;
                t = t.key < key ? t.r : t.l;
            }
            return null;
        }
        static <V> V get(RBST<V> t, long key) {
            while (t != null) {
                if (t.key == key) return t.getValue();
                t = t.key < key ? t.r : t.l;
            }
            return null;
        }
        static <V> LongEntry<V> kthEntry(RBST<V> t, int k) {
            int c = size(t.l);
            if (k < c) return kthEntry(t.l, k);
            if (k == c) return t;
            return kthEntry(t.r, k - c - 1);
        }
        static <V> int leqCount(RBST<V> t, long key) {
            if (t == null) return 0;
            if (key < t.key) return leqCount(t.l, key);
            return leqCount(t.r, key) + size(t.l) + 1;
        }
        static <V> int ltCount(RBST<V> t, long key) {
            if (t == null) return 0;
            if (key <= t.key) return ltCount(t.l, key);
            return ltCount(t.r, key) + size(t.l) + 1;
        }
        static <V> RBST<V> merge(RBST<V> l, RBST<V> r) {
            if (l == null) return r;
            if (r == null) return l;
            if (rnd.nextInt() % (l.size + r.size) < l.size) {
                l.r = merge(l.r, r);
                return l.update();
            } else {
                r.l = merge(l, r.l);
                return r.update();
            }
        }
        static <V> Pair<RBST<V>, RBST<V>> splitUsingIndex(RBST<V> x, int k) {
            if (k < 0 || k > size(x)) {
                throw new IndexOutOfBoundsException(
                    String.format("index %d is out of bounds for the length of %d", k, size(x))
                );
            }
            if (x == null) {
                return new Pair<RBST<V>, RBST<V>>(null, null);
            } else if (k <= size(x.l)) {
                Pair<RBST<V>, RBST<V>> p = splitUsingIndex(x.l, k);
                x.l = p.snd;
                p.snd = x.update();
                return p;
            } else {
                Pair<RBST<V>, RBST<V>> p = splitUsingIndex(x.r, k - size(x.l) - 1);
                x.r = p.fst;
                p.fst = x.update();
                return p;
            }
        }
        static <V> Pair<RBST<V>, RBST<V>> splitUsingKey(RBST<V> x, long key) {
            if (x == null) {
                return new Pair<RBST<V>, RBST<V>>(null, null);
            } else if (key <= x.key) {
                Pair<RBST<V>, RBST<V>> p = splitUsingKey(x.l, key);
                x.l = p.snd;
                p.snd = x.update();
                return p;
            } else {
                Pair<RBST<V>, RBST<V>> p = splitUsingKey(x.r, key);
                x.r = p.fst;
                p.fst = x.update();
                return p;
            }
        }
        static <V> RBST<V> insert(RBST<V> t, long key, V val) {
            Pair<RBST<V>, RBST<V>> p = splitUsingKey(t, key);
            return RBST.merge(RBST.merge(p.fst, new RBST<>(key, val)), p.snd);
        }
        static <V> Pair<RBST<V>, LongEntry<V>> eraseUsingIndex(RBST<V> t, int k) {
            Pair<RBST<V>, RBST<V>> p = splitUsingIndex(t, k);
            Pair<RBST<V>, RBST<V>> q = splitUsingIndex(p.snd, 1);
            return new Pair<>(RBST.merge(p.fst, q.snd), q.fst);
        }
        static <V> Pair<RBST<V>, LongEntry<V>> eraseUsingKey(RBST<V> t, long key) {
            Pair<RBST<V>, RBST<V>> p = splitUsingKey(t, key);
            Pair<RBST<V>, RBST<V>> q = splitUsingIndex(p.snd, 1);
            return new Pair<>(RBST.merge(p.fst, q.snd), q.fst);
        }
        static <V> boolean contains(RBST<V> t, long key) {
            while (t != null) {
                if (t.key == key) return true;
                else if (t.key < key) t = t.r;
                else t = t.l;
            }
            return false;
        }
        static <V> int size(RBST<V> nd) {
            return nd == null ? 0 : nd.size;
        }
        static <V> Set<LongEntry<V>> entrySet(RBST<V> t) {
            LinkedHashSet<LongEntry<V>> set = new LinkedHashSet<>();
            if (t == null) return set;
            ArrayDeque<IntEntry<RBST<V>>> stack = new ArrayDeque<>();
            if (t.r != null) stack.addLast(new IntEntry<>(0, t.r));
            stack.addLast(new IntEntry<>(1, t));
            if (t.l != null) stack.addLast(new IntEntry<>(0, t.l));
            while (stack.size() > 0) {
                IntEntry<RBST<V>> p = stack.pollLast();
                RBST<V> u = p.getValue();
                if (p.key == 1) {
                    set.add(u);
                } else {
                    if (u.r != null) stack.addLast(new IntEntry<>(0, u.r));
                    stack.addLast(new IntEntry<>(1, u));
                    if (u.l != null) stack.addLast(new IntEntry<>(0, u.l));
                }
            }
            return set;
        }
        static <V> Set<LongEntry<V>> descendingEntrySet(RBST<V> t) {
            LinkedHashSet<LongEntry<V>> set = new LinkedHashSet<>();
            if (t == null) return set;
            ArrayDeque<IntEntry<RBST<V>>> stack = new ArrayDeque<>();
            if (t.l != null) stack.addLast(new IntEntry<>(0, t.l));
            stack.addLast(new IntEntry<>(1, t));
            if (t.r != null) stack.addLast(new IntEntry<>(0, t.r));
            while (stack.size() > 0) {
                IntEntry<RBST<V>> p = stack.pollLast();
                RBST<V> u = p.getValue();
                if (p.key == 1) {
                    set.add(u);
                } else {
                    if (u.l != null) stack.addLast(new IntEntry<>(0, u.l));
                    stack.addLast(new IntEntry<>(1, u));
                    if (u.r != null) stack.addLast(new IntEntry<>(0, u.r));
                }
            }
            return set;
        }
        static <V> Set<Long> keySet(RBST<V> t) {
            Set<Long> set = new LinkedHashSet<>();
            for (LongEntry<V> e : entrySet(t)) set.add(e.key);
            return set;
        }
        static <V> Set<Long> descendingKeySet(RBST<V> t) {
            Set<Long> set = new LinkedHashSet<>();
            for (LongEntry<V> e : descendingEntrySet(t)) set.add(e.key);
            return set;
        }
        static <V> Collection<V> values(RBST<V> t) {
            Collection<V> col = new ArrayList<>();
            for (LongEntry<V> e : entrySet(t)) col.add(e.getValue());
            return col;
        }
        static <V> Iterator<LongEntry<V>> iterator(RBST<V> t) {
            return entrySet(t).iterator();
        }
        static <V> Iterator<LongEntry<V>> descendingIterator(RBST<V> t) {
            return descendingEntrySet(t).iterator();
        }
        static <V> PrimitiveIterator.OfLong keyIterator(RBST<V> t) {
            return new PrimitiveIterator.OfLong(){
                Iterator<LongEntry<V>> it = iterator(t);
                public boolean hasNext() {return it.hasNext();}
                public long nextLong() {return it.next().key;}
            };
        }
        static <V> PrimitiveIterator.OfLong descendingKeyIterator(RBST<V> t) {
            return new PrimitiveIterator.OfLong(){
                Iterator<LongEntry<V>> it = descendingIterator(t);
                public boolean hasNext() {return it.hasNext();}
                public long nextLong() {return it.next().key;}
            };
        }
        public String toString() {
            return "(" + getKey() + " => " + getValue() + ")";
        }
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
final class Pair<E0, E1> {
    public E0 fst;
    public E1 snd;
    public Pair(final E0 fst, final E1 snd) {this.fst = fst; this.snd = snd;}
    @Override @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (this == o)  return true;
        if (!(o instanceof Pair)) return false;
        final Pair p = (Pair) o;
        return this.fst.equals(p.fst) && this.snd.equals(p.snd);
    }
    @Override
    public int hashCode() {return Objects.hash(this.fst, this.snd);}
    @Override
    public String toString() {return "(" + this.fst.toString() + ", " + this.snd.toString() + ")";}
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
final class LongPair {
    public long fst, snd;
    public LongPair(final long fst, final long snd) {this.fst = fst; this.snd = snd;}
    @Override @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof LongPair)) return false;
        final LongPair p = (LongPair) o;
        return this.fst == p.fst && this.snd == p.snd;
    }
    @Override
    public int hashCode() {return Objects.hash(this.fst, this.snd);}
    @Override
    public String toString() {return "(" + this.fst + ", " + this.snd + ")";}
}

class LongEntry<V> {
    long key;
    V val;
    LongEntry(long key, V val) {
        this.key = key;
        this.val = val;
    }
    public long getKey() {return key;}
    public V getValue() {return val;}
    public V setValue(V val) {
        V oldValue = this.val;
        this.val = val;
        return oldValue;
    }
    public boolean equals(Object o) {
        if (!(o instanceof LongEntry)) return false;
        LongEntry<?> e = (LongEntry<?>) o;
        return key == e.getKey() && (val == null ? e.val == null : val.equals(e.val));
    }
    public int hashCode() {
        int keyHash = (int) (key ^ (key >>> 32));
        int valueHash = (val == null ? 0 : val.hashCode());
        return keyHash ^ valueHash;
    }
    public String toString() {return key + "=" + val;}
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
