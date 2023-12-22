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
        IntArrayList[] adj = new IntArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new IntArrayList();
        }
        for (int i = 0; i < n - 1; i++) {
            int u = In.ni() - 1;
            int v = In.ni() - 1;
            adj[u].add(v);
            adj[v].add(u);
        }
        out.append(diameter(adj) % 3 == 1 ? "Second" : "First");
    }

    public static int diameter(IntArrayList[] adj) {
        int n = adj.length;
        IntQueue q = new IntQueue(n);
        q.add(0);
        int[] d = new int[n];
        Arrays.fill(d, -1);
        d[0] = 0;
        int max = 0;
        int maxv = 0;
        while (q.size() > 0) {
            int u = q.poll();
            if (d[u] > max) {
                max = d[u];
                maxv = u;
            }
            PrimitiveIterator.OfInt iter = adj[u].iterator();
            while (iter.hasNext()) {
                int v = iter.nextInt();
                if (d[v] < 0) {
                    d[v] = d[u] + 1;
                    q.add(v);
                }
            }
        }
        return bfs(adj, maxv);
    }

    public static int bfs(IntArrayList[] adj, int r) {
        int n = adj.length;
        IntQueue q = new IntQueue(n);
        q.add(r);
        int[] d = new int[n];
        Arrays.fill(d, -1);
        d[r] = 0;
        int max = 0;
        while (q.size() > 0) {
            int u = q.poll();
            max = Math.max(max, d[u]);
            PrimitiveIterator.OfInt iter = adj[u].iterator();
            while (iter.hasNext()) {
                int v = iter.nextInt();
                if (d[v] < 0) {
                    d[v] = d[u] + 1;
                    q.add(v);
                }
            }
        }
        return max;
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
        Arrays.setAll(a, i -> op.applyAsInt(a[i]));
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
 * 
 * Queue for int type.
 */
class IntQueue implements Iterable<Integer> {
    private static final int DEFAULT_SIZE = 64;

    private int[] q;
    private int head = 0;
    private int tail = 0;

    public IntQueue(int capacity) {
        this.q = new int[capacity];
    }

    public IntQueue() {
        this(DEFAULT_SIZE);
    }

    public void add(int v) {
        if (tail == q.length) {
            grow();
        }
        q[tail++] = v;
    }

    public int poll() {
        if (head == tail) {
            throw new NoSuchElementException("No Elements.");
        }
        return q[head++];
    }

    public int size() {
        return tail - head;
    }

    private void grow() {
        int[] grown = new int[q.length << 1];
        int len = size();
        System.arraycopy(q, head, grown, 0, len);
        q = grown;
        tail = len;
        head = 0;
    }

    public PrimitiveIterator.OfInt iterator() {
        return new IntQueueIterator();
    }

    private class IntQueueIterator implements PrimitiveIterator.OfInt {
        private int i = head;

        public boolean hasNext() {
            return i < tail;
        }

        public int nextInt() {
            return q[i++];
        }
    }
}
