import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.PrimitiveIterator;
import java.util.function.Consumer;
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
        char[] s = sc.nextChars();
        int n = s.length;
        int[] cnt = new int[26];
        for (int i = 0; i < n; i++) {
            cnt[s[i] - 'a']++;
        }
        int single = -1;
        for (int i = 0, o = 0; i < 26; i++) {
            if ((cnt[i] & 1) == 1) {
                if (++o > 1) {
                    out.writeln(-1);
                    return;
                } else {
                    single = i;
                }
            }
        }
        long ans = 0;
        int m = n / 2;
        int[] p = new int[26];
        IntArrayList l = new IntArrayList();
        for (int i = 0; i < 26; i++) p[i] = cnt[i] >> 1;
        boolean b = false;
        for (int i = 0; i < n; i++) {
            int ord = s[i] - 'a';
            if (p[ord] > 0) {
                l.add(ord);
                p[ord]--;
                if (b) ans++;
            } else if (ord == single) {
                b = true;
            }
        }
        IntDeque[] dqs = new IntDeque[26];
        for (int i = 0; i < 26; i++) {
            dqs[i] = new IntDeque();
        }
        for (int i = 0; i < n; i++) {
            dqs[s[i] - 'a'].addFirst(i);
        }
        IntTreeMap<Integer> map = new IntTreeMap<>();
        for (int i = 0; i < m; i++) {
            int ord = l.get(i);
            int idx = dqs[ord].removeFirst();
            ans += (n - i - 1) - idx;
            map.put(idx, i);
        }
        int[] x = new int[m];
        int idx = 0;
        for (IntTreeMap.Entry<Integer> e : map) {
            x[idx++] = e.getValue();
        }
        RangeOrderedSet set = new RangeOrderedSet(0, m);
        for (int e : x) {
            ans += set.count(0, e);
            set.add(e);
        }
        out.writeln(ans);
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



class IntTreeMap<V> implements Iterable<IntTreeMap.Entry<V>> {
    private Entry<V> root;
    private int size = 0;
    private int modCount = 0;
    public int size() {return size;}
    public boolean containsKey(int key) {return getEntry(key) != null;}
    public V get(int key) {
        Entry<V> p = getEntry(key);
        return (p == null ? null : p.value);
    }
    final Entry<V> getEntry(int key) {
        Entry<V> p = root;
        while (p != null) {
            if (key < p.key) p = p.left;
            else if (key > p.key) p = p.right;
            else return p;
        }
        return null;
    }
    final Entry<V> getCeilingEntry(int key) {
        Entry<V> p = root;
        while (p != null) {
            if (key < p.key) {
                if (p.left != null) p = p.left;
                else return p;
            } else if (key > p.key) {
                if (p.right != null) {
                    p = p.right;
                } else {
                    Entry<V> parent = p.parent;
                    Entry<V> ch = p;
                    while (parent != null && ch == parent.right) {
                        ch = parent;
                        parent = parent.parent;
                    }
                    return parent;
                }
            } else return p;
        }
        return null;
    }
    final Entry<V> getFloorEntry(int key) {
        Entry<V> p = root;
        while (p != null) {
            if (key > p.key) {
                if (p.right != null) p = p.right;
                else return p;
            } else if (key < p.key) {
                if (p.left != null) {
                    p = p.left;
                } else {
                    Entry<V> parent = p.parent;
                    Entry<V> ch = p;
                    while (parent != null && ch == parent.left) {
                        ch = parent;
                        parent = parent.parent;
                    }
                    return parent;
                }
            } else return p;
        }
        return null;
    }
    final Entry<V> getHigherEntry(int key) {
        Entry<V> p = root;
        while (p != null) {
            if (key < p.key) {
                if (p.left != null) p = p.left;
                else return p;
            } else {
                if (p.right != null) {
                    p = p.right;
                } else {
                    Entry<V> parent = p.parent;
                    Entry<V> ch = p;
                    while (parent != null && ch == parent.right) {
                        ch = parent;
                        parent = parent.parent;
                    }
                    return parent;
                }
            }
        }
        return null;
    }
    final Entry<V> getLowerEntry(int key) {
        Entry<V> p = root;
        while (p != null) {
            if (key > p.key) {
                if (p.right != null) p = p.right;
                else return p;
            } else {
                if (p.left != null) {
                    p = p.left;
                } else {
                    Entry<V> parent = p.parent;
                    Entry<V> ch = p;
                    while (parent != null && ch == parent.left) {
                        ch = parent;
                        parent = parent.parent;
                    }
                    return parent;
                }
            }
        }
        return null;
    }
    public V put(int key, V value) {
        Entry<V> t = root;
        if (t == null) {
            root = new Entry<>(key, value, null);
            size = 1;
            modCount++;
            return null;
        }
        int cmp;
        Entry<V> parent;
        do {
            parent = t;
            cmp = key > t.key ? 1 : key == t.key ? 0 : -1;
            if (cmp < 0) t = t.left;
            else if (cmp > 0) t = t.right;
            else return t.setValue(value);
        } while (t != null);
        Entry<V> e = new Entry<>(key, value, parent);
        if (cmp < 0) parent.left = e;
        else parent.right = e;
        fixAfterInsertion(e);
        size++;
        modCount++;
        return null;
    }
    public V remove(int key) {
        Entry<V> p = getEntry(key);
        if (p == null) return null;
        V oldValue = p.value;
        deleteEntry(p);
        return oldValue;
    }
    public void clear() {
        modCount++;
        size = 0;
        root = null;
    }
    public Entry<V> firstEntry() {return getFirstEntry();}
    public Entry<V> lastEntry()  {return getLastEntry();}
    public Entry<V> pollFirstEntry() {
        Entry<V> p = getFirstEntry();
        Entry<V> result = p;
        if (p != null) deleteEntry(p);
        return result;
    }
    public Entry<V> pollLastEntry() {
        Entry<V> p = getLastEntry();
        Entry<V> result = p;
        if (p != null) deleteEntry(p);
        return result;
    }
    public Entry<V> lowerEntry(int key) {return getLowerEntry(key);}
    public Entry<V> floorEntry(int key) {return getFloorEntry(key);}
    public Entry<V> ceilingEntry(int key) {return getCeilingEntry(key);}
    public Entry<V> higherEntry(int key) {return getHigherEntry(key);}
    public boolean replace(int key, V oldValue, V newValue) {
        Entry<V> p = getEntry(key);
        if (p != null && Objects.equals(oldValue, p.value)) {
            p.value = newValue;
            return true;
        }
        return false;
    }
    public V replace(int key, V value) {
        Entry<V> p = getEntry(key);
        if (p!=null) {
            V oldValue = p.value;
            p.value = value;
            return oldValue;
        }
        return null;
    }
    public void forEach(IntObjConsumer<V> action) {
        Objects.requireNonNull(action);
        int expectedModCount = modCount;
        for (Entry<V> e = getFirstEntry(); e != null; e = successor(e)) {
            action.accept(e.key, e.value);
            if (expectedModCount != modCount) {
                throw new ConcurrentModificationException();
            }
        }
    }
    public Iterator<Entry<V>> iterator() {
        return new EntryIterator(getFirstEntry());
    }
    public Iterator<Entry<V>> descendingIterator() {
        return new DescendingEntryIterator(getLastEntry());
    }
    abstract class PrivateEntryIterator<T> implements Iterator<T> {
        Entry<V> next;
        Entry<V> lastReturned;
        int expectedModCount;
        PrivateEntryIterator(Entry<V> first) {
            expectedModCount = modCount;
            lastReturned = null;
            next = first;
        }
        public final boolean hasNext() {return next != null;}
        final Entry<V> nextEntry() {
            Entry<V> e = next;
            if (e == null) throw new NoSuchElementException();
            if (modCount != expectedModCount) throw new ConcurrentModificationException();
            next = successor(e);
            lastReturned = e;
            return e;
        }
        final Entry<V> prevEntry() {
            Entry<V> e = next;
            if (e == null) throw new NoSuchElementException();
            if (modCount != expectedModCount) throw new ConcurrentModificationException();
            next = predecessor(e);
            lastReturned = e;
            return e;
        }
        public void remove() {
            if (lastReturned == null) throw new IllegalStateException();
            if (modCount != expectedModCount) throw new ConcurrentModificationException();
            if (lastReturned.left != null && lastReturned.right != null) next = lastReturned;
            deleteEntry(lastReturned);
            expectedModCount = modCount;
            lastReturned = null;
        }
    }
    final class EntryIterator extends PrivateEntryIterator<Entry<V>> {
        EntryIterator(Entry<V> first) {super(first);}
        public Entry<V> next() {return nextEntry();}
    }
    final class DescendingEntryIterator extends PrivateEntryIterator<Entry<V>> {
        DescendingEntryIterator(Entry<V> first) {super(first);}
        public Entry<V> next() {return prevEntry();}
    }

    private static final boolean RED   = false;
    private static final boolean BLACK = true;

    public static final class Entry<V> {
        int key;
        V value;
        Entry<V> left;
        Entry<V> right;
        Entry<V> parent;
        boolean color = BLACK;
        Entry(int key, V value, Entry<V> parent) {
            this.key = key;
            this.value = value;
            this.parent = parent;
        }
        public int getKey() {return key;}
        public V getValue() {return value;}
        public V setValue(V value) {
            V oldValue = this.value;
            this.value = value;
            return oldValue;
        }
        public boolean equals(Object o) {
            if (!(o instanceof Entry)) return false;
            Entry<?> e = (Entry<?>) o;
            return key == e.getKey() && (value == null ? e.value == null : value.equals(e.value));
        }
        public int hashCode() {
            int keyHash = key;
            int valueHash = (value == null ? 0 : value.hashCode());
            return keyHash ^ valueHash;
        }
        public String toString() {return key + "=" + value;}
    }
    final Entry<V> getFirstEntry() {
        Entry<V> p = root;
        if (p != null) while (p.left != null) p = p.left;
        return p;
    }
    final Entry<V> getLastEntry() {
        Entry<V> p = root;
        if (p != null) while (p.right != null) p = p.right;
        return p;
    }
    static <V> Entry<V> successor(Entry<V> t) {
        if (t == null) return null;
        else if (t.right != null) {
            Entry<V> p = t.right;
            while (p.left != null) p = p.left;
            return p;
        } else {
            Entry<V> p = t.parent;
            Entry<V> ch = t;
            while (p != null && ch == p.right) {
                ch = p;
                p = p.parent;
            }
            return p;
        }
    }
    static <V> Entry<V> predecessor(Entry<V> t) {
        if (t == null) return null;
        else if (t.left != null) {
            Entry<V> p = t.left;
            while (p.right != null) p = p.right;
            return p;
        } else {
            Entry<V> p = t.parent;
            Entry<V> ch = t;
            while (p != null && ch == p.left) {
                ch = p;
                p = p.parent;
            }
            return p;
        }
    }
    private static <V> boolean colorOf(Entry<V> p) {return p == null ? BLACK : p.color;}
    private static <V> Entry<V> parentOf(Entry<V> p) {return p == null ? null: p.parent;}
    private static <K,V> void setColor(Entry<V> p, boolean c) {if (p != null) p.color = c;}
    private static <V> Entry<V> leftOf (Entry<V> p) {return (p == null) ? null: p.left;}
    private static <V> Entry<V> rightOf(Entry<V> p) {return (p == null) ? null: p.right;}
    private void rotateLeft(Entry<V> p) {
        if (p != null) {
            Entry<V> r = p.right;
            p.right = r.left;
            if (r.left != null) r.left.parent = p;
            r.parent = p.parent;
            if (p.parent == null) root = r;
            else if (p.parent.left == p) p.parent.left = r;
            else p.parent.right = r;
            r.left = p;
            p.parent = r;
        }
    }
    private void rotateRight(Entry<V> p) {
        if (p != null) {
            Entry<V> l = p.left;
            p.left = l.right;
            if (l.right != null) l.right.parent = p;
            l.parent = p.parent;
            if (p.parent == null) root = l;
            else if (p.parent.right == p) p.parent.right = l;
            else p.parent.left = l;
            l.right = p;
            p.parent = l;
        }
    }
    private void fixAfterInsertion(Entry<V> x) {
        x.color = RED;
        while (x != null && x != root && x.parent.color == RED) {
            if (parentOf(x) == leftOf(parentOf(parentOf(x)))) {
                Entry<V> y = rightOf(parentOf(parentOf(x)));
                if (colorOf(y) == RED) {
                    setColor(parentOf(x), BLACK);
                    setColor(y, BLACK);
                    setColor(parentOf(parentOf(x)), RED);
                    x = parentOf(parentOf(x));
                } else {
                    if (x == rightOf(parentOf(x))) {
                        x = parentOf(x);
                        rotateLeft(x);
                    }
                    setColor(parentOf(x), BLACK);
                    setColor(parentOf(parentOf(x)), RED);
                    rotateRight(parentOf(parentOf(x)));
                }
            } else {
                Entry<V> y = leftOf(parentOf(parentOf(x)));
                if (colorOf(y) == RED) {
                    setColor(parentOf(x), BLACK);
                    setColor(y, BLACK);
                    setColor(parentOf(parentOf(x)), RED);
                    x = parentOf(parentOf(x));
                } else {
                    if (x == leftOf(parentOf(x))) {
                        x = parentOf(x);
                        rotateRight(x);
                    }
                    setColor(parentOf(x), BLACK);
                    setColor(parentOf(parentOf(x)), RED);
                    rotateLeft(parentOf(parentOf(x)));
                }
            }
        }
        root.color = BLACK;
    }
    private void deleteEntry(Entry<V> p) {
        modCount++;
        size--;
        if (p.left != null && p.right != null) {
            Entry<V> s = successor(p);
            p.key = s.key;
            p.value = s.value;
            p = s;
        }
        Entry<V> replacement = (p.left != null ? p.left : p.right);
        if (replacement != null) {
            replacement.parent = p.parent;
            if (p.parent == null) root = replacement;
            else if (p == p.parent.left) p.parent.left  = replacement;
            else p.parent.right = replacement;
            p.left = p.right = p.parent = null;
            if (p.color == BLACK) fixAfterDeletion(replacement);
        } else if (p.parent == null) {
            root = null;
        } else {
            if (p.color == BLACK) fixAfterDeletion(p);
            if (p.parent != null) {
                if (p == p.parent.left) p.parent.left = null;
                else if (p == p.parent.right) p.parent.right = null;
                p.parent = null;
            }
        }
    }
    private void fixAfterDeletion(Entry<V> x) {
        while (x != root && colorOf(x) == BLACK) {
            if (x == leftOf(parentOf(x))) {
                Entry<V> sib = rightOf(parentOf(x));
                if (colorOf(sib) == RED) {
                    setColor(sib, BLACK);
                    setColor(parentOf(x), RED);
                    rotateLeft(parentOf(x));
                    sib = rightOf(parentOf(x));
                }
                if (colorOf(leftOf(sib))  == BLACK &&
                    colorOf(rightOf(sib)) == BLACK) {
                    setColor(sib, RED);
                    x = parentOf(x);
                } else {
                    if (colorOf(rightOf(sib)) == BLACK) {
                        setColor(leftOf(sib), BLACK);
                        setColor(sib, RED);
                        rotateRight(sib);
                        sib = rightOf(parentOf(x));
                    }
                    setColor(sib, colorOf(parentOf(x)));
                    setColor(parentOf(x), BLACK);
                    setColor(rightOf(sib), BLACK);
                    rotateLeft(parentOf(x));
                    x = root;
                }
            } else {
                Entry<V> sib = leftOf(parentOf(x));
                if (colorOf(sib) == RED) {
                    setColor(sib, BLACK);
                    setColor(parentOf(x), RED);
                    rotateRight(parentOf(x));
                    sib = leftOf(parentOf(x));
                }
                if (colorOf(rightOf(sib)) == BLACK &&
                    colorOf(leftOf(sib)) == BLACK) {
                    setColor(sib, RED);
                    x = parentOf(x);
                } else {
                    if (colorOf(leftOf(sib)) == BLACK) {
                        setColor(rightOf(sib), BLACK);
                        setColor(sib, RED);
                        rotateLeft(sib);
                        sib = leftOf(parentOf(x));
                    }
                    setColor(sib, colorOf(parentOf(x)));
                    setColor(parentOf(x), BLACK);
                    setColor(leftOf(sib), BLACK);
                    rotateRight(parentOf(x));
                    x = root;
                }
            }
        }
        setColor(x, BLACK);
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


class RangeOrderedSet {
    final int[] cnt;
    final int n;
    final int bias;

    public RangeOrderedSet(final int l, final int r) {
        this.bias = -l;
        int w = r - l;
        int nn = 1; while (nn < w) nn <<= 1;
        this.n = nn;
        this.cnt = new int[n << 1];
    }

    public void add(int i) {
        if (contains(i)) return;
        update(bias + i, 1);
    }

    public void remove(int i) {
        if (!contains(i)) return;
        update(bias + i, 0);
    }

    public int pollFirst() {
        int ret = first();
        remove(ret);
        return ret;
    }

    public int pollLast() {
        int ret = last();
        remove(ret);
        return ret;
    }

    public boolean contains(int i) {
        return cnt[bias + i + n] > 0;
    }

    public int first() {
        if (cnt[1] == 0) throw new NoSuchElementException();
        int k = 1;
        while (k < n) {
            k <<= 1;
            if (cnt[k] == 0) k |= 1;
        }
        return k - n - bias;
    }

    public int last() {
        if (cnt[1] == 0) throw new NoSuchElementException();
        int k = 1;
        while (k < n) {
            k <<= 1;
            if (cnt[k | 1] > 0) k |= 1;
        }
        return k - n - bias;
    }

    public int kthElement(int k) {
        if (cnt[1] <= k) throw new NoSuchElementException();
        int i = 1;
        int s = 0;
        k++;
        while (i < n) {
            i <<= 1;
            if (s + cnt[i] < k) {
                s += cnt[i];
                i |= 1;
            }
        }
        return i - n - bias;
    }

    public int lower(int i) {
        int r = bias + i + n;
        r /= r & -r;
        while (true) {
            if (cnt[--r] > 0) break;
            if (r == 0) throw new NoSuchElementException();
            r /= r & -r;
        }
        while (r < n) {
            r <<= 1;
            if (cnt[r | 1] > 0) r |= 1;
        }
        return r - n - bias;
    }

    public int floor(int i) {return contains(i) ? i : lower(i);}

    public int higher(int i) {
        int l = bias + i + 1 + n;
        l /= l & -l;
        while (true) {
            if (cnt[l] > 0) break;
            if (++l == n << 1) throw new NoSuchElementException();
            l /= l & -l;
        }
        while (l < n) {
            l <<= 1;
            if (cnt[l] == 0) l |= 1;
        }
        return l - n - bias;
    }

    public int ceiling(int i) {return contains(i) ? i : higher(i);}

    public boolean isEmpty() {return cnt[1] == 0;}

    public int size() {return cnt[1];}

    public int count(int l, int r) {
        l += bias; r += bias;
        if (l < 0 || r > n) throw new OutOfRangeException("Out of Range.");
        l += n; r += n;
        int res = 0;
        while (r > l) {
            if ((l & 1) == 1) res += cnt[l++];
            if ((r & 1) == 1) res += cnt[--r];
            l >>= 1; r >>= 1;
        }
        return res;
    }

    void update(int i, final int c) {
        i += n;
        cnt[i] = c;
        while ((i >>= 1) > 0) cnt[i] = cnt[i << 1] + cnt[(i << 1) | 1];
    }

    public PrimitiveIterator.OfInt iterator() {return new AscendingSetIterator();}

    public PrimitiveIterator.OfInt descendingIterator() {return new DescendingSetIterator();}

    class AscendingSetIterator implements PrimitiveIterator.OfInt {
        int it = size() > 0 ? first() : Integer.MAX_VALUE;
        final int max = size() > 0 ? last() : Integer.MIN_VALUE;
        public boolean hasNext() {return it <= max;}
        public int nextInt() {
            int ret = it;
            it = it == max ? Integer.MAX_VALUE : higher(it);
            return ret;
        }
    }
    class DescendingSetIterator implements PrimitiveIterator.OfInt {
        int it = size() > 0 ? last() : Integer.MIN_VALUE;
        final int min = size() > 0 ? first() : Integer.MAX_VALUE;
        public boolean hasNext() {return it >= min;}
        public int nextInt() {
            int ret = it;
            it = it == min ? Integer.MIN_VALUE : lower(it);
            return ret;
        }
    }
    private class OutOfRangeException extends RuntimeException {
        private static final long serialVersionUID = 1437290411625321824L;
        private OutOfRangeException() {super();}
        private OutOfRangeException(String s) {super(s);}
    }
}


@FunctionalInterface
interface IntObjConsumer<T> {
    public void accept(int x, T y);
    public default Consumer<T> curry(final int x) {return y -> accept(x, y);}
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
