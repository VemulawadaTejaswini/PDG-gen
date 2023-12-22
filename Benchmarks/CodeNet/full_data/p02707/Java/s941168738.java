import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        int[] a = In.ni(n - 1, e -> e - 1);
        int[] ans = new int[n];
        for (int i = 0; i < n - 1; i++) {
            ans[a[i]]++;
        }
        out.append(IntArrays.join(ans, "\n"));
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


/**
 * @author https://atcoder.jp/users/suisen
 */
class Tree {
    public final int n;
    public final int root;

    private final IntArrayList[] adj;
    private final int[] par;
    private final int[] dep;

    protected boolean bfs = false;

    public Tree(int n, int root) {
        this.n = n;
        this.root = root;
        this.adj = new IntArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new IntArrayList();
        }
        this.par = new int[n];
        this.dep = new int[n];
    }

    public Tree(int n) {
        this(n, 0);
    }

    public void addEdge(int from, int to) {
        adj[from].add(to);
        adj[to].add(from);
    }

    public int getEdge(int from, int index) {
        return adj[from].get(index);
    }

    public IntArrayList getEdges(int i) {
        return adj[i];
    }

    public int out(int i) {
        return adj[i].size();
    }

    public int parent(int i) {
        return parent()[i];
    }

    public int[] parent() {
        if (!bfs) {
            bfs();
            bfs = true;
        }
        return par;
    }

    public int dep(int i) {
        return dep()[i];
    }

    public int[] dep() {
        if (!bfs) {
            bfs();
            bfs = true;
        }
        return dep;
    }

    private void bfs() {
        IntDeque que = IntDeque.asQueue(n);
        que.addLast(root);
        par[root] = root;
        while (que.size() > 0) {
            int v = que.pollFirst();
            PrimitiveIterator.OfInt iter = getEdges(v).iterator();
            while (iter.hasNext()) {
                int u = iter.nextInt();
                if (u != par[v]) {
                    dep[u] = dep[v] + 1;
                    par[u] = v;
                    que.addLast(u);
                }
            }
        }
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
class IntDeque implements Cloneable {
    private int head = -1;
    private int tail = 0;
    private int pSize;
    private int nSize;
    private int p[];
    private int n[];

    private static final int DEFAULT_SIZE = 64;

    public IntDeque(int initialSize) {
        this(Math.max(1, initialSize - initialSize / 2), Math.max(1, initialSize / 2));
        if (initialSize <= 0) {
            throw new IllegalArgumentException("Error in IntDeque::new. initial size must be positive.");
        }
    }

    private IntDeque(int pSize, int nSize) {
        this.pSize = pSize;
        this.nSize = nSize;
        this.p = new int[this.pSize];
        this.n = new int[this.nSize];
    }

    public IntDeque() {
        this(DEFAULT_SIZE);
    }

    public static IntDeque asDeque(int initialSize) {
        return new IntDeque(initialSize);
    }

    public static IntDeque asDeque() {
        return new IntDeque(DEFAULT_SIZE);
    }

    public static IntDeque asQueue(int initialSize) {
        return new IntDeque(Math.max(1, initialSize), 1);
    }

    public static IntDeque asQueue() {
        return new IntDeque(DEFAULT_SIZE, 1);
    }

    public static IntDeque asStack(int initialSize) {
        return new IntDeque(1, Math.max(1, initialSize));
    }

    public static IntDeque asStack() {
        return new IntDeque(1, DEFAULT_SIZE);
    }

    public void addLast(int v) {
        putByRawIndex(tail++, v);
    }

    public void addFirst(int v) {
        putByRawIndex(head--, v);
    }

    public int pollFirst() {
        if (size() == 0) {
            throw new NoSuchElementException("Error in IntDeque::pollFirst. Deque is empty.");
        }
        return getByRawIndex(++head);
    }

    public int pollLast() {
        if (size() == 0) {
            throw new NoSuchElementException("Error in IntDeque::pollLast. Deque is empty.");
        }
        return getByRawIndex(--tail);
    }

    public int get(int index) {
        index += head + 1;
        if (index >= tail) {
            throw new IndexOutOfBoundsException("Error in IntDeque::get(" + index + "). the size of IntDeque is " + size() + ".");
        }
        return getByRawIndex(index);
    }

    public int getFirst() {
        return get(0);
    }

    public int getLast() {
        return get(size() - 1);
    }

    public void apply(int index, IntUnaryOperator f) {
        index += head + 1;
        if (index >= tail) {
            throw new IndexOutOfBoundsException("Error in IntDeque::apply(" + index + "). the size of IntDeque is " + size() + ".");
        }
        applyByRawIndex(index, f);
    }

    public void applyFirst(IntUnaryOperator f) {
        apply(0, f);
    }

    public void applyLast(IntUnaryOperator f) {
        apply(size() - 1, f);
    }


    public int size() {
        return tail - head - 1;
    }

    public void clear() {
        head = -1;
        tail = 0;
    }

    public int[] toArray() {
        int[] a = new int[size()];
        for (int i = 0; i < size(); i++) {
            a[i] = get(i);
        }
        return a;
    }

    private void resize(boolean positive) {
        if (positive) {
            int[] pCopy = new int[pSize << 1];
            System.arraycopy(p, 0, pCopy, 0, pSize);
            p = pCopy;
            pSize <<= 1;
        } else {
            int[] nCopy = new int[nSize << 1];
            System.arraycopy(n, 0, nCopy, 0, nSize);
            n = nCopy;
            nSize <<= 1;
        }
    }

    private int getByRawIndex(int index) {
        if (index >= 0) {
            return p[index];
        } else {
            return n[-(index + 1)];
        }
    }

    private void putByRawIndex(int index, int v) {
        if (index < 0) {
            if (index <= -(nSize + 1)) {
                resize(false);
            }
            n[-(index + 1)] = v;
        } else {
            if (index >= pSize) {
                resize(true);
            }
            p[index] = v;
        }
    }

    private void applyByRawIndex(int index, IntUnaryOperator f) {
        if (index >= 0) {
            p[index] = f.applyAsInt(p[index]);
        } else {
            n[-(index + 1)] = f.applyAsInt(n[-(index + 1)]);
        }
    }


    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean nonEmpty() {
        return size() != 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < size(); i++) {
            sb.append(get(i));
            if (i < size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }
}
