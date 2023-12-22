import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.PrimitiveIterator;
import java.util.RandomAccess;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        int n = nextInt(sc);
        long c = nextLong(sc);
        long[] h = new long[n];
        for (int i = 0; i < n; i++) h[i] = nextLong(sc);
        long[] dp = new long[n];
        MonotoneConvexHullTrick cht = new MonotoneConvexHullTrick(true, true);
        cht.addLine(-2 * h[n - 1], h[n - 1] * h[n - 1] + dp[n - 1]);
        for (int i = n - 1; i >= 0; i--) {
            dp[i] = cht.query(h[i]) + h[i] * h[i] + c;
            cht.addLine((int) (-2 * h[i]), h[i] * h[i] + dp[i]);
        }
        sb.append(dp[0]);
        pw.write(sb.toString());
        pw.flush();
        pw.close();
    }

    public static int nextInt(Scanner sc) {
        return Integer.parseInt(sc.next());
    }
    public static long nextLong(Scanner sc) {
        return Long.parseLong(sc.next());
    }
}

/**
 * java.util.ArrayDeque<T> の簡易版．次の操作を行うことが出来る
 * 
 *  - 先頭/末尾の追加: amortized O(1)
 *  - 先頭/末尾の取得: O(1)
 *  - 先頭/末尾の削除: O(1)
 *  - ランダムアクセス: O(1) (ArrayDeque では O(N))
 * 
 * 実装は Ring Buffer による．
 * 
 * verified:
 *  - http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP2_1_B
 *  - https://atcoder.jp/contests/arc005/tasks/arc005_3
 * 
 * @author https://atcoder.jp/users/suisen
 * @param <T> Deque に格納するデータの型
 */
@SuppressWarnings("unchecked")
class Deque<T> implements Iterable<T>, RandomAccess {

    /**
     * コンストラクタで初期容量を指定しなかった場合の初期容量
     */
    static final int DEFAULT_CAPACITY = 1 << 6;

    /**
     * Ring Buffer．剰余算を高速化するためにサイズは 2 冪になるようにする．
     */
    T[] buf;

    /**
     * buf のサイズ．
     */
    int len = 1;

    /**
     * 剰余算の代わりに行う論理積演算に用いる mask．
     */
    int mask;

    /**
     * Deque の先頭要素の index．
     * 0 <= head < len は保証されていないので，Deque には mask を通してアクセスする．
     */
    int head = 0;

    /**
     * Deque の末尾要素の index + 1．つまり，[head, tail) の半開区間に要素が入っている．
     * 0 <= tail-1 < len は保証されていないので，Deque には mask を通してアクセスする．
     */
    int tail = 0;

    /**
     * 初期容量を与えて初期化する．
     * 予め必要な容量が分かっている場合はその値を用いて初期化するとメモリ使用量が減る．
     * また，最大容量を与えた場合は追加操作が償却ではなく真に定数時間で行える．
     * @param capacity 初期容量
     */
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

    /**
     * 初期容量をデフォルト値 {@code DEFAULT_CAPACITY = 64} で初期化する．
     * 必要容量の見積もりがつかない場合はこれを使う．
     */
    public Deque() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * Deque の末尾要素を取得する．O(1)
     * @return 末尾要素
     * @throws NoSuchElementException 要素数が 0 の場合
     */
    public T getLast() {
        if (size() == 0) throw new NoSuchElementException();
        return buf[(tail - 1) & mask];
    }

    /**
     * Deque の先頭要素を取得する．O(1)
     * @return 先頭要素
     * @throws NoSuchElementException 要素数が 0 の場合
     */
    public T getFirst() {
        if (size() == 0) throw new NoSuchElementException();
        return buf[head];
    }

    /**
     * Deque へのランダムアクセス．O(1)
     * @param index 先頭から何番目の要素を取得するか (0-indexed)
     * @return 先頭から {@code index} 番目の要素 (0-indexed)
     * @throws IndexOutOfBoundsException {@code index} が負であるか，または要素数以上である場合
     */
    public T get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException(
                String.format("Index %d out of bounds for length %d.", index, size())
            );
        }
        return buf[(head + index) & mask];
    }

    /**
     * Deque の末尾に要素を追加する．amortized O(1)
     * @param v 追加する要素．{@code null} を許容する．
     */
    public void addLast(T v) {
        if (size() == len) grow();
        buf[tail++ & mask] = v;
    }

    /**
     * Deque の先頭に要素を追加する．amortized O(1)
     * @param v 追加する要素．{@code null} を許容する．
     */
    public void addFirst(T v) {
        if (size() == len) grow();
        buf[--head & mask] = v;
    }

    /**
     * Deque の末尾要素を削除する．O(1)
     * @return 削除された要素
     * @throws NoSuchElementException 要素数が 0 の場合
     */
    public T removeLast() {
        if (size() == 0) throw new NoSuchElementException();
        return buf[--tail & mask];
    }

    /**
     * Deque の先頭要素を削除する．O(1)
     * @return 削除された要素
     * @throws NoSuchElementException 要素数が 0 の場合
     */
    public T removeFirst() {
        if (size() == 0) throw new NoSuchElementException();
        return buf[head++ & mask];
    }

    /**
     * Deque の末尾要素を削除する．O(1)
     * @return 末尾要素が存在した場合は削除された要素を返し，存在しない場合は {@code null} を返す．
     */
    public T pollLast() {
        if (size() == 0) return null;
        return removeLast();
    }

    /**
     * Deque の先頭要素を削除する．O(1)
     * @return 先頭要素が存在した場合は削除された要素を返し，存在しない場合は {@code null} を返す．
     */
    public T pollFirst() {
        if (size() == 0) return null;
        return removeFirst();
    }

    /**
     * Deque の要素数を返す．O(1)
     * @return 要素数
     */
    public int size() {
        return tail - head;
    }

    /**
     * Deque が空であるかを判定する．O(1)
     * @return 空であれば {@code true}，そうでなければ {@code false}
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Deque の要素を全て削除する．
     */
    public void clear() {
        head = tail = 0;
    }

    /**
     * Deque の要素を先頭から順に格納した配列を生成する．
     * @param clazz Deque に格納しているデータの {@code class}
     * @return Deque の要素を先頭から順に格納した配列
     */
    public T[] toArray(Class<T> clazz) {
        T[] ret = (T[]) Array.newInstance(clazz, size());
        Iterator<T> it = iterator();
        Arrays.setAll(ret, i -> it.next());
        return ret;
    }

    /**
     * Ring Buffer の容量を 2 倍にする．
     */
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

    /**
     * @return 先頭要素から末尾要素までの順方向イテレータ
     */
    public Iterator<T> iterator() {
        return new Iterator<T>(){
            int it = head;
            public boolean hasNext() {return it < tail;}
            public T next() {return buf[it++ & mask];}
        };
    }

    /**
     * @return 末尾要素から先頭要素までの逆方向イテレータ
     */
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

    /******* Usage *******/

    public static void main(String[] args) {
        Deque<Integer> dq = new Deque<>();
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq);
        dq.removeFirst();
        dq.removeLast();
        System.out.println(dq);
        dq.addFirst(1);
        dq.addFirst(0);
        dq.addFirst(-1);
        System.out.println(dq);
        dq.clear();
        System.out.println(dq);
        System.out.println(dq.pollFirst()); // => null
        // System.out.println(dq.removeFirst()); => NoSuchElementException
    }
}

class MonotoneConvexHullTrick {
    final Deque<LinearFunction> Lines = new Deque<>();
    final boolean MinQuery;
    final boolean Increasing;

    public MonotoneConvexHullTrick(boolean minQuery, boolean increasing) {
        this.MinQuery = minQuery;
        this.Increasing = minQuery ? increasing : !increasing;
    }

    public void addLine(long a, long b) {
        if (!MinQuery) {
            a = -a; b = -b;
        }
        checkMonotonic(a, b);
        if (Increasing) {
            if (Lines.isEmpty()) {
                Lines.addLast(new LinearFunction(a, b));
            } else if (Lines.size() == 1) {
                LinearFunction f = Lines.getFirst();
                if (f.a == a) {
                    f.b = Math.min(f.b, b);
                } else {
                    Lines.addLast(new LinearFunction(a, b));
                }
            } else {
                LinearFunction add = new LinearFunction(a, b);
                LinearFunction last = Lines.getLast();
                if (last.a == a && last.b > b) {
                    last.b = b;
                    add = Lines.pollLast();
                }
                long ar = add.a;
                long br = add.b;
                while (Lines.size() > 1) {
                    int size = Lines.size();
                    long am = Lines.get(size - 1).a;
                    long bm = Lines.get(size - 1).b;
                    long al = Lines.get(size - 2).a;
                    long bl = Lines.get(size - 2).b;
                    if (isNecessary(al, bl, am, bm, ar, br)) break;
                    Lines.pollLast();
                }
                Lines.addLast(add);
            }
        } else {
            if (Lines.isEmpty()) {
                Lines.addLast(new LinearFunction(a, b));
            } else if (Lines.size() == 1) {
                LinearFunction f = Lines.getFirst();
                if (f.a == a) {
                    f.b = Math.min(f.b, b);
                } else {
                    Lines.addFirst(new LinearFunction(a, b));
                }
            } else {
                LinearFunction add = new LinearFunction(a, b);
                LinearFunction first = Lines.getFirst();
                if (first.a == a && first.b > b) {
                    first.b = b;
                    add = Lines.pollFirst();
                }
                long al = add.a;
                long bl = add.b;
                while (Lines.size() > 1) {
                    long am = Lines.get(0).a;
                    long bm = Lines.get(0).b;
                    long ar = Lines.get(1).a;
                    long br = Lines.get(1).b;
                    if (isNecessary(al, bl, am, bm, ar, br)) break;
                    Lines.pollFirst();
                }
                Lines.addFirst(add);
            }
        }
    }

    boolean isNecessary(long al, long bl, long am, long bm, long ar, long br) {
        long l = (ar - am) * (bl - bm);
        long r = (am - al) * (bm - br);
        if (l == r) return false;
        return l > r;
    }

    public long query(long x) {
        int l = 0, r = Lines.size();
        while (r - l > 1) {
            int m = (l + r) >> 1;
            if (Lines.get(m - 1).apply(x) >= Lines.get(m).apply(x)) {
                l = m;
            } else {
                r = m;
            }
        }
        long y = Lines.get(l).apply(x);
        return MinQuery ? y : -y;
    }

    void checkMonotonic(long a, long b) {
        if (Lines.isEmpty()) return;
        if (Increasing) {
            if (Lines.getLast().a > a) throw new IllegalArgumentException(
                "Lines are not monotonic."
            );
        } else {
            if (Lines.getFirst().a < a) throw new IllegalArgumentException(
                "Lines are not monotonic."
            );
        }
    }

    static final class LinearFunction {
        long a, b;
        LinearFunction(long a, long b) {
            this.a = a;
            this.b = b;
        }
        long apply(long x) {
            return a * x + b;
        }
    }
}

class IntObjEntry<V> implements Map.Entry<Integer, V> {
    private int key;
    private V val;
    public IntObjEntry(int key, V val) {
        this.key = key;
        this.val = val;
    }
    public Integer getKey() {
        return key;
    }
    public int getKeyAsInt() {
        return key;
    }
    public V getValue() {
        return val;
    }
    public V setValue(V newValue) {
        V oldValue = val;
        val = newValue;
        return oldValue;
    }
    public String toString() {
        return key + " => " + val;
    }
}

class LongObjEntry<V> implements Map.Entry<Long, V> {
    private long key;
    private V val;
    public LongObjEntry(long key, V val) {
        this.key = key;
        this.val = val;
    }
    public Long getKey() {
        return key;
    }
    public long getKeyAsLong() {
        return key;
    }
    public V getValue() {
        return val;
    }
    public V setValue(V newValue) {
        V oldValue = val;
        val = newValue;
        return oldValue;
    }
}

class MutablePair<T, U> implements java.io.Serializable {
    private static final long serialVersionUID = -2022089021501463539L;
    private T fst;
    private U snd;
    public MutablePair(T fst, U snd) {
        this.fst = fst;
        this.snd = snd;
    }
    public T getFirst() {
        return fst;
    }
    public U getSecond() {
        return snd;
    }
    public T setFirst(T newValue) {
        T oldValue = fst;
        fst = newValue;
        return oldValue;
    }
    public U setSecond(U newValue) {
        U oldValue = snd;
        snd = newValue;
        return oldValue;
    }
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (fst == null ? 0 : fst.hashCode());
        result = 31 * result + (snd == null ? 0 : snd.hashCode());
        return result;
    }
    @Override
    @SuppressWarnings("all")
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof MutablePair) {
            MutablePair p = (MutablePair) o;
            boolean equalsFirst = fst == null ? p.fst == null : fst.equals(p.fst);
            boolean equalsSecond = snd == null ? p.snd == null : snd.equals(p.snd);
            return equalsFirst && equalsSecond;
        }
        return false;
    }
    @Override
    public String toString() {
        return "(" + fst + ", " + snd + ")";
    }
}

class LongOrderedMap<V> implements Iterable<LongObjEntry<V>> {
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
        MutablePair<RBST<V>, RBST<V>> p = RBST.splitUsingIndex(root, k);
        LongOrderedMap<V> fst = new LongOrderedMap<>(p.getFirst());
        root = fst.root;
        LongOrderedMap<V> snd = new LongOrderedMap<>(p.getSecond());
        return snd;
    }
    public LongOrderedMap<V> splitLeftUsingIndex(int k) {
        MutablePair<RBST<V>, RBST<V>> p = RBST.splitUsingIndex(root, k);
        LongOrderedMap<V> fst = new LongOrderedMap<>(p.getFirst());
        LongOrderedMap<V> snd = new LongOrderedMap<>(p.getSecond());
        root = snd.root;
        return fst;
    }
    public LongOrderedMap<V> splitRightUsingKey(long key) {
        MutablePair<RBST<V>, RBST<V>> p = RBST.splitUsingKey(root, key);
        LongOrderedMap<V> fst = new LongOrderedMap<>(p.getFirst());
        root = fst.root;
        LongOrderedMap<V> snd = new LongOrderedMap<>(p.getSecond());
        return snd;
    }
    public LongOrderedMap<V> splitLeftUsingKey(long key) {
        MutablePair<RBST<V>, RBST<V>> p = RBST.splitUsingKey(root, key);
        LongOrderedMap<V> fst = new LongOrderedMap<>(p.getFirst());
        LongOrderedMap<V> snd = new LongOrderedMap<>(p.getSecond());
        root = snd.root;
        return fst;
    }
    public LongObjEntry<V> kthEntry(int k) {
        if (k < 0 || k >= size()) return null;
        return RBST.kthEntry(root, k);
    }
    public LongObjEntry<V> firstEntry() {
        return kthEntry(0);
    }
    public LongObjEntry<V> lastEntry() {
        return kthEntry(size() - 1);
    }
    public LongObjEntry<V> lowerEntry(long key) {
        return kthEntry(RBST.ltCount(root, key) - 1);
    }
    public LongObjEntry<V> floorEntry(long key) {
        return kthEntry(RBST.leqCount(root, key) - 1);
    }
    public LongObjEntry<V> higherEntry(long key) {
        return kthEntry(RBST.leqCount(root, key));
    }
    public LongObjEntry<V> ceilingEntry(long key) {
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
            LongObjEntry<V> e = RBST.getEntry(root, key);
            V oldValue = e.getValue();
            e.setValue(val);
            return oldValue;
        }
        root = RBST.insert(root, key, val);
        return null;
    }
    public V putIfAbsent(long key, V val) {
        LongObjEntry<V> e = RBST.getEntry(root, key);
        if (e != null) return e.getValue();
        put(key, val);
        return null;
    }
    public LongObjEntry<V> removeKthEntry(int k) {
        if (k < 0 || k >= size()) return null;
        MutablePair<RBST<V>, LongObjEntry<V>> nodeAndEntry = RBST.eraseUsingIndex(root, k);
        root = nodeAndEntry.getFirst();
        return nodeAndEntry.getSecond();
    }
    public LongObjEntry<V> remove(long key) {
        if (!containsKey(key)) return null;
        MutablePair<RBST<V>, LongObjEntry<V>> nodeAndEntry = RBST.eraseUsingKey(root, key);
        root = nodeAndEntry.getFirst();
        return nodeAndEntry.getSecond();
    }
    public boolean remove(long key, V value) {
        LongObjEntry<V> e = RBST.getEntry(root, key);
        if (e == null) return false;
        if (Objects.equals(value, e.getValue())) {
            MutablePair<RBST<V>, LongObjEntry<V>> nodeAndEntry = RBST.eraseUsingKey(root, key);
            root = nodeAndEntry.getFirst();
            return true;
        }
        return false;
    }
    public V replace(long key, V newValue) {
        LongObjEntry<V> e = RBST.getEntry(root, key);
        if (e == null) return null;
        V oldValue = e.getValue();
        e.setValue(newValue);
        return oldValue;
    }
    public boolean replace(long key, V oldValue, V newValue) {
        LongObjEntry<V> e = RBST.getEntry(root, key);
        if (e == null) return false;
        V value = e.getValue();
        if (Objects.equals(value, oldValue)) {
            e.setValue(newValue);
            return true;
        }
        return false;
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
    public Set<LongObjEntry<V>> entrySet() {
        return RBST.entrySet(root);
    }
    public Set<LongObjEntry<V>> descendingEntrySet() {
        return RBST.descendingEntrySet(root);
    }
    public Iterator<LongObjEntry<V>> iterator() {
        return RBST.iterator(root);
    }
    public Iterator<LongObjEntry<V>> descendingIterator() {
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
    public Optional<LongObjEntry<V>> safeGetFirstEntry() {
        return size() > 0 ? Optional.of(kthEntry(0)) : Optional.empty();
    }
    public Optional<LongObjEntry<V>> safeGetLastEntry() {
        return size() > 0 ? Optional.of(kthEntry(size() - 1)) : Optional.empty();
    }
    public Optional<LongObjEntry<V>> safeGetLowerEntry(long key) {
        int k = RBST.ltCount(root, key) - 1;
        return k >= 0 ? Optional.of(kthEntry(k)) : Optional.empty();
    }
    public Optional<LongObjEntry<V>> safeGetFloorEntry(long key) {
        int k = RBST.leqCount(root, key) - 1;
        return k >= 0 ? Optional.of(kthEntry(k)) : Optional.empty();
    }
    public Optional<LongObjEntry<V>> safeGetHigherEntry(long key) {
        int k = RBST.leqCount(root, key);
        return k < size() ? Optional.of(kthEntry(k)) : Optional.empty();
    }
    public Optional<LongObjEntry<V>> safeGetCeilingEntry(long key) {
        int k = RBST.ltCount(root, key);
        return k < size() ? Optional.of(kthEntry(k)) : Optional.empty();
    }
    static final class RBST<V> extends LongObjEntry<V> {
		private RBST<V> l, r;
        private int size;
        private RBST(long key, V val) {super(key, val); this.size = 1;}
        private RBST<V> update() {
            size = size(l) + size(r) + 1;
            return this;
        }
        static <V> LongObjEntry<V> getEntry(RBST<V> t, long key) {
            while (t != null) {
                if (t.getKeyAsLong() == key) return t;
                t = t.getKeyAsLong() < key ? t.r : t.l;
            }
            return null;
        }
        static <V> V get(RBST<V> t, long key) {
            while (t != null) {
                if (t.getKeyAsLong() == key) return t.getValue();
                t = t.getKeyAsLong() < key ? t.r : t.l;
            }
            return null;
        }
        static <V> LongObjEntry<V> kthEntry(RBST<V> t, int k) {
            int c = size(t.l);
            if (k < c) return kthEntry(t.l, k);
            if (k == c) return t;
            return kthEntry(t.r, k - c - 1);
        }
        static <V> int leqCount(RBST<V> t, long key) {
            if (t == null) return 0;
            if (key < t.getKeyAsLong()) return leqCount(t.l, key);
            return leqCount(t.r, key) + size(t.l) + 1;
        }
        static <V> int ltCount(RBST<V> t, long key) {
            if (t == null) return 0;
            if (key <= t.getKeyAsLong()) return ltCount(t.l, key);
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
        static <V> MutablePair<RBST<V>, RBST<V>> splitUsingIndex(RBST<V> x, int k) {
            if (k < 0 || k > size(x)) {
                throw new IndexOutOfBoundsException(
                    String.format("index %d is out of bounds for the length of %d", k, size(x))
                );
            }
            if (x == null) {
                return new MutablePair<RBST<V>, RBST<V>>(null, null);
            } else if (k <= size(x.l)) {
                MutablePair<RBST<V>, RBST<V>> p = splitUsingIndex(x.l, k);
                x.l = p.getSecond();
                p.setSecond(x.update());
                return p;
            } else {
                MutablePair<RBST<V>, RBST<V>> p = splitUsingIndex(x.r, k - size(x.l) - 1);
                x.r = p.getFirst();
                p.setFirst(x.update());
                return p;
            }
        }
        static <V> MutablePair<RBST<V>, RBST<V>> splitUsingKey(RBST<V> x, long key) {
            if (x == null) {
                return new MutablePair<RBST<V>, RBST<V>>(null, null);
            } else if (key <= x.getKeyAsLong()) {
                MutablePair<RBST<V>, RBST<V>> p = splitUsingKey(x.l, key);
                x.l = p.getSecond();
                p.setSecond(x.update());
                return p;
            } else {
                MutablePair<RBST<V>, RBST<V>> p = splitUsingKey(x.r, key);
                x.r = p.getFirst();
                p.setFirst(x.update());
                return p;
            }
        }
        static <V> RBST<V> insert(RBST<V> t, long key, V val) {
            MutablePair<RBST<V>, RBST<V>> p = splitUsingKey(t, key);
            return RBST.merge(RBST.merge(p.getFirst(), new RBST<>(key, val)), p.getSecond());
        }
        static <V> MutablePair<RBST<V>, LongObjEntry<V>> eraseUsingIndex(RBST<V> t, int k) {
            MutablePair<RBST<V>, RBST<V>> p = splitUsingIndex(t, k);
            MutablePair<RBST<V>, RBST<V>> q = splitUsingIndex(p.getSecond(), 1);
            return new MutablePair<>(RBST.merge(p.getFirst(), q.getSecond()), q.getFirst());
        }
        static <V> MutablePair<RBST<V>, LongObjEntry<V>> eraseUsingKey(RBST<V> t, long key) {
            MutablePair<RBST<V>, RBST<V>> p = splitUsingKey(t, key);
            MutablePair<RBST<V>, RBST<V>> q = splitUsingIndex(p.getSecond(), 1);
            return new MutablePair<>(RBST.merge(p.getFirst(), q.getSecond()), q.getFirst());
        }
        static <V> boolean contains(RBST<V> t, long key) {
            while (t != null) {
                if (t.getKeyAsLong() == key) return true;
                else if (t.getKeyAsLong() < key) t = t.r;
                else t = t.l;
            }
            return false;
        }
        static <V> int size(RBST<V> nd) {
            return nd == null ? 0 : nd.size;
        }
        static <V> Set<LongObjEntry<V>> entrySet(RBST<V> t) {
            LinkedHashSet<LongObjEntry<V>> set = new LinkedHashSet<>();
            if (t == null) return set;
            ArrayDeque<IntObjEntry<RBST<V>>> stack = new ArrayDeque<>();
            if (t.r != null) stack.addLast(new IntObjEntry<>(0, t.r));
            stack.addLast(new IntObjEntry<>(1, t));
            if (t.l != null) stack.addLast(new IntObjEntry<>(0, t.l));
            while (stack.size() > 0) {
                IntObjEntry<RBST<V>> p = stack.pollLast();
                RBST<V> u = p.getValue();
                if (p.getKeyAsInt() == 1) {
                    set.add(u);
                } else {
                    if (u.r != null) stack.addLast(new IntObjEntry<>(0, u.r));
                    stack.addLast(new IntObjEntry<>(1, u));
                    if (u.l != null) stack.addLast(new IntObjEntry<>(0, u.l));
                }
            }
            return set;
        }
        static <V> Set<LongObjEntry<V>> descendingEntrySet(RBST<V> t) {
            LinkedHashSet<LongObjEntry<V>> set = new LinkedHashSet<>();
            if (t == null) return set;
            ArrayDeque<IntObjEntry<RBST<V>>> stack = new ArrayDeque<>();
            if (t.l != null) stack.addLast(new IntObjEntry<>(0, t.l));
            stack.addLast(new IntObjEntry<>(1, t));
            if (t.r != null) stack.addLast(new IntObjEntry<>(0, t.r));
            while (stack.size() > 0) {
                IntObjEntry<RBST<V>> p = stack.pollLast();
                RBST<V> u = p.getValue();
                if (p.getKeyAsInt() == 1) {
                    set.add(u);
                } else {
                    if (u.l != null) stack.addLast(new IntObjEntry<>(0, u.l));
                    stack.addLast(new IntObjEntry<>(1, u));
                    if (u.r != null) stack.addLast(new IntObjEntry<>(0, u.r));
                }
            }
            return set;
        }
        static <V> Set<Long> keySet(RBST<V> t) {
            Set<Long> set = new LinkedHashSet<>();
            for (LongObjEntry<V> e : entrySet(t)) set.add(e.getKeyAsLong());
            return set;
        }
        static <V> Set<Long> descendingKeySet(RBST<V> t) {
            Set<Long> set = new LinkedHashSet<>();
            for (LongObjEntry<V> e : descendingEntrySet(t)) set.add(e.getKeyAsLong());
            return set;
        }
        static <V> Collection<V> values(RBST<V> t) {
            Collection<V> col = new ArrayList<>();
            for (LongObjEntry<V> e : entrySet(t)) col.add(e.getValue());
            return col;
        }
        static <V> Iterator<LongObjEntry<V>> iterator(RBST<V> t) {
            return entrySet(t).iterator();
        }
        static <V> Iterator<LongObjEntry<V>> descendingIterator(RBST<V> t) {
            return descendingEntrySet(t).iterator();
        }
        static <V> PrimitiveIterator.OfLong keyIterator(RBST<V> t) {
            return new PrimitiveIterator.OfLong(){
                Iterator<LongObjEntry<V>> it = iterator(t);
                public boolean hasNext() {return it.hasNext();}
                public long nextLong() {return it.next().getKeyAsLong();}
            };
        }
        static <V> PrimitiveIterator.OfLong descendingKeyIterator(RBST<V> t) {
            return new PrimitiveIterator.OfLong(){
                Iterator<LongObjEntry<V>> it = descendingIterator(t);
                public boolean hasNext() {return it.hasNext();}
                public long nextLong() {return it.next().getKeyAsLong();}
            };
        }
        public String toString() {
            return "(" + getKey() + " => " + getValue() + ")";
        }
    }

    static final class Random {
        int x = 123456789, y = 362436069, z = 521288629, w = 88675123;
        int nextInt() {
            int t = x ^ (x << 11);
            x = y; y = z; z = w;
            return w = (w ^ (w >> 19)) ^ (t ^ (t >> 8));
        }
    }

    public static void main(String[] args) {
        LongOrderedMap<String> map = new LongOrderedMap<>();
        System.out.println("PUT");
        map.put(0, "a");
        map.put(4, "e");
        map.put(6, "g");
        map.put(4, "ee"); // replace
        map.put(-1, "z");
        for (LongObjEntry<String> e : map) {
            System.out.println(e);
        }
        System.out.println("REMOVE");
        map.removeKthEntry(2); // removing (4, "ee")
        map.removeKthEntry(1); // removing (0, "a")
        for (LongObjEntry<String> e : map) {
            System.out.println(e);
        }
        System.out.println("ADD");
        map.putIfAbsent(-1, "zzz"); // has no effect
        map.replace(0, "a", "aa");  // has no effect
        map.put(2, "c");
        map.replace(2, "cc");       // replace
        map.put(3, "d");
        map.replace(3, "dd", "ddd");// has no effect
        for (LongObjEntry<String> e : map) {
            System.out.println(e);
        }
        System.out.println("GET");
        System.out.println(map.kthEntry(0));
        System.out.println(map.kthEntry(1));
        System.out.println(map.kthEntry(2));
        System.out.println(map.kthEntry(3));
        System.out.println(map.kthEntry(4)); // null
        System.out.println("KEYS");
        for (long key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println("VALUES");
        for (String val : map.values()) {
            System.out.println(val);
        }
        System.out.println("DESC ENTRIES");
        for (LongObjEntry<String> e : map.descendingEntrySet()) {
            System.out.println(e);
        }
        System.out.println("DESC KEYS");
        for (long key : map.descendingKeySet()) {
            System.out.println(key);
        }
        System.out.println("HIGHER/LOWER/CEILING/FLOOR");
        System.out.println(map.higherEntry(3));
        System.out.println(map.lowerEntry(3));
        System.out.println(map.ceilingEntry(3));
        System.out.println(map.floorEntry(3));
        System.out.println(map.lowerEntry(2));
        System.out.println(map.floorEntry(2));
        System.out.println(map.higherEntry(6)); // null
        System.out.println(map.ceilingEntry(7));// null
        System.out.println(map.floorEntry(-2)); // null
        System.out.println(map.lowerEntry(-1)); // null
        System.out.println("L");
        LongOrderedMap<String> l = map.splitLeftUsingIndex(2);
        for (LongObjEntry<String> e : l.descendingEntrySet()) {
            System.out.println(e);
        }
        System.out.println("R");
        for (LongObjEntry<String> e : map.descendingEntrySet()) {
            System.out.println(e);
        }
        map = map.mergeLeft(l);
        LongOrderedMap<String> r = map.splitRightUsingKey(3);
        System.out.println("L");
        for (LongObjEntry<String> e : map.descendingEntrySet()) {
            System.out.println(e);
        }
        System.out.println("R");
        for (LongObjEntry<String> e : r.descendingEntrySet()) {
            System.out.println(e);
        }
    }
}