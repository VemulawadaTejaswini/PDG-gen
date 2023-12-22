import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.PrimitiveIterator;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
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
        int k = 5001;
        long s = In.nl();
        Digraph g = new Digraph(n * k);
        for (int j = 0; j < m; j++) {
            int u = In.ni() - 1;
            int v = In.ni() - 1;
            int a = In.ni();
            long b = In.nl();
            for (int x = a; x < k; x++) {
                g.addEdge(u * k + x, v * k + x - a, b);
                g.addEdge(v * k + x, u * k + x - a, b);
            }
        }
        for (int i = 0; i < n; i++) {
            int c = In.ni();
            int d = In.ni();
            for (int x = c; x < k; x++) {
                g.addEdge(i * k + x - c, i * k + x, d);
            }
        }
        long[] d = dijkstra(g, IntArrayGenerator.indexToInt((int) Math.min(s + 1, k), i -> i));
        for (int i = 1; i < n; i++) {
            long min = Const.LINF;
            for (int x = 0; x < k; x++) {
                min = Math.min(min, d[i * k + x]);
            }
            out.append(min).append('\n');
        }
    }

    private static long[] dijkstra(Digraph g, int... s) {
        long[] d = new long[g.getV()];
        Arrays.fill(d, Const.LINF);
        PriorityQueue<long[]> pq = new PriorityQueue<>((u, v) -> Long.compare(u[0], v[0]));
        for (int st : s) {
            d[st] = 0;
            pq.add(new long[]{0, st});
        }
        while (pq.size() > 0) {
            long[] du = pq.poll();
            int u = (int) du[1];
            if (du[0] != d[u]) {
                continue;
            }
            for (Edge e : g.getEdges(u)) {
                int v = e.to;
                long c = e.cost;
                if (d[u] + c < d[v]) {
                    d[v] = d[u] + c;
                    pq.add(new long[]{d[v], v});
                }
            }
        }
        return d;
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
abstract class AbstractGraph {
    protected final int n;
    protected int m = 0;
    private ArrayList<Edge>[] adj;
    private int[] in;
    private HashMap<Integer, IntArrayList> components;
    private UnionFindTree uft;
    
    @SuppressWarnings("unchecked")
    protected AbstractGraph(int n) {
        this.n = n;
        this.in = new int[n];
        this.adj = new ArrayList[this.n];
        for (int i = 0; i < this.n; i++) {
            this.adj[i] = new ArrayList<>();
        }
        this.uft = new UnionFindTree(this.n);
    }

    protected void addEdge(Edge e) {
        this.adj[e.from].add(e);
        this.in[e.to]++;
        this.uft.unite(e.from, e.to);
    }

    public int in(int i) {
        return this.in[i];
    }

    public int out(int i) {
        return this.adj[i].size();
    }

    public Edge getEdge(int from, int index) {
        return this.adj[from].get(index);
    }

    public ArrayList<Edge> getEdges(int i) {
        return this.adj[i];
    }

    public int getV() {
        return this.n;
    }

    public int getE() {
        return this.m;
    }

    public int getRoot(int i) {
        return uft.root(i);
    }

    public HashMap<Integer, IntArrayList> getComponents() {
        generateComponentsIfAbsent();
        return this.components;
    }

    public IntArrayList getComponent(int i) {
        return getComponents().get(getRoot(i));
    }

    public Set<Integer> getRoots() {
        return getComponents().keySet();
    }

    public Collection<IntArrayList> getComponentSet() {
        return getComponents().values();
    }

    public boolean isConnected() {
        return getComponents().size() == 1;
    }

    public boolean isConnected(int u, int v) {
        return getRoot(u) == getRoot(v);
    }

    public boolean isTree() {
        return m == n - 1 && isConnected();
    }

    private void generateComponentsIfAbsent() {
        if (Objects.isNull(this.components)) {
            HashMap<Integer, IntArrayList> components = new HashMap<>();
            for (int i = 0; i < n; i++) {
                if (!components.containsKey(getRoot(i))) {
                    IntArrayList component = new IntArrayList();
                    component.add(i);
                    components.put(getRoot(i), component);
                } else {
                    components.get(getRoot(i)).add(i);
                }
            }
            this.components = components;
        }
    }
    
    abstract public boolean isBipartite();
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
 */
class UnionFindTree {
    private int[] parent;
    private int[] rank;
    private int[] size;
    private int groupNum;

    public UnionFindTree(int n) {
        this.parent = IntArrayGenerator.indexToInt(n, i -> i);
        this.rank = new int[n];
        this.size = IntArrayGenerator.filled(n, 1);
        this.groupNum = n;
    }

    public int root(int x) {
        if (parent[x] == x) {
            return x;
        }
        return parent[x] = root(parent[x]);
    }

    public boolean isSame(int x, int y) {
        return root(x) == root(y);
    }

    public void unite(int x, int y) {
        int xr = root(x);
        int yr = root(y);
        if (xr == yr) {
            return;
        }
        if (rank[xr] < rank[yr]) {
            parent[xr] = yr;
            size[yr] += size[xr];
        } else {
            parent[yr] = xr;
            size[xr] += size[yr];
            if (rank[xr] == rank[yr]) {
                rank[xr]++;
            }
        }
        groupNum--;
    }

    public int size(int x) {
        return size[root(x)];
    }

    public boolean isRoot(int x) {
        return parent[x] == x;
    }

    public int groupNum() {
        return groupNum;
    }
}



/**
 * @author https://atcoder.jp/users/suisen
 * 
 * (NON-DESTRUCTIVE) methods that returns int array.
 */
class IntArrayGenerator {

    private IntArrayGenerator(){}
    
    public static int[] filled(int n, int init) {
        int[] ret = new int[n];
        Arrays.fill(ret, init);
        return ret;
    }

    public static int[][] filled(int n, int m, int init) {
        int[][] ret = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(ret[i], init);
        }
        return ret;
    }

    public static int[] generate(int n, IntSupplier f) {
        int[] a = new int[n];
        Arrays.setAll(a, i -> f.getAsInt());
        return a;
    }

    public static int[][] generate(int n, int m, IntSupplier f) {
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            a[i] = generate(m, f);
        }
        return a;
    }

    public static int[] indexToInt(int n, IntUnaryOperator f) {
        int[] a = new int[n];
        Arrays.setAll(a, f);
        return a;
    }

    public static int[][] indexToInt(int n, int m, IntBinaryOperator f) {
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            final int ii = i;
            a[i] = indexToInt(m, j -> f.applyAsInt(ii, j));
        }
        return a;
    }

    public static int[] toArray(Collection<? extends Number> collection) {
        int n = collection.size();
        int[] ret = new int[n];
        Object[] coll = collection.toArray();
        for (int i = 0; i < n; i++) {
            ret[i] = ((Number) coll[i]).intValue();
        }
        return ret;
    }

    public static int[] unique(int[] a) {
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
        return b;
    }

    public static int[][] transpose(int[][] a) {
        int n = a.length;
        int m = a[0].length;
        int[][] ret = new int[m][n];
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                ret[j][i] = a[i][j];
            }
        }
        return ret;
    }

    public static int[] count(int[] a, int max) {
        int[] ret = new int[max + 1];
        for (int i = 0; i < a.length; i++) {
            ret[a[i]]++;
        }
        return ret;
    }

    public static int[] map(int[] a, IntUnaryOperator f) {
        int[] b = new int[a.length];
        Arrays.setAll(b, i -> f.applyAsInt(a[i]));
        return b;
    }

    public static int[] filter(int[] a, IntPredicate p) {
        IntArrayList ret = new IntArrayList();
        for (int e : a) {
            ret.addIf(e, p);
        }
        return ret.toArray();
    }

    public static int[] filterIndex(int beginIndex, int endIndex, IntPredicate p) {
        IntArrayList ret = new IntArrayList();
        for (int i = beginIndex; i < endIndex; i++) {
            ret.addIf(i, p);
        }
        return ret.toArray();
    }

    public static int[] filterIndex(int endIndex, IntPredicate p) {
        return filterIndex(0, endIndex, p);
    }

    public static int[] accumulate(int[] a, IntBinaryOperator op) {
        int n = a.length;
        int[] ret = new int[n];
        ret[0] = a[0];
        for (int i = 1; i < n; i++) {
            ret[i] = op.applyAsInt(ret[i - 1], a[i]);
        }
        return ret;
    }

    public static int[] accumulate(int[] a) {
        int n = a.length;
        int[] ret = new int[n];
        ret[0] = a[0];
        for (int i = 1; i < n; i++) {
            ret[i] = ret[i - 1] + a[i];
        }
        return ret;
    }
}



/**
 * @author https://atcoder.jp/users/suisen
 */
class Digraph extends AbstractGraph {
    private Digraph reverse;

    public Digraph(int n) {
        super(n);
    }

    public void addEdge(int from, int to, long cost) {
        Edge e = new Edge(from, to, cost);
        super.addEdge(e);
        this.m++;
    }

    public void addEdge(int from, int to) {
        this.addEdge(from, to, 1);
    }

    @Override
    public void addEdge(Edge e) {
        super.addEdge(e);
        this.m++;
    }

    @Override
    public boolean isBipartite() {
        int[] color = new int[n];
        IntQueue dq = new IntQueue(n);
        for (int root : getRoots()) {
            dq.add(root);
            color[root] = 1;
        }
        while (dq.size() > 0) {
            int now = dq.poll();
            for (Edge e : getEdges(now)) {
                int next = e.to;
                if (color[next] == 0) {
                    color[next] = -color[now];
                    dq.add(next);
                } else if (color[now] == color[next]) {
                    return false;
                }
            }
            for (Edge e : reverse().getEdges(now)) {
                int next = e.to;
                if (color[next] == 0) {
                    color[next] = -color[now];
                    dq.add(next);
                } else if (color[now] == color[next]) {
                    return false;
                }
            }
        }
        return true;
    }

    public Digraph reverse() {
        generateReverseIfAbsent();
        return this.reverse;
    }

    private void generateReverseIfAbsent() {
        if (Objects.isNull(this.reverse)) {
            this.reverse = new Digraph(n);
            for (int i = 0; i < n; i++) {
                for (Edge e : getEdges(i)) {
                    this.reverse.addEdge(e.reverse());
                }
            }
        }
    }
}

/**
 * @author https://atcoder.jp/users/suisen
 */
class Const {
    public static final long MOD7 = 1_000_000_007;
    public static final long MOD9 = 1_000_000_009;
    public static final long MOD99 = 998_244_353;

    public static final long LINF = Long.MAX_VALUE >> 2;
    public static final int IINF = Integer.MAX_VALUE >> 1;
    public static final double DINF = 1e150;

    public static final double SDELTA = 1e-12;
    public static final double DELTA = 1e-9;
    public static final double LDELTA = 1e-6;

    public static final String YES = "YES";
    public static final String NO = "NO";
    public static final String Yes = "Yes";
    public static final String No = "No";
    public static final String POSSIBLE = "POSSIBLE";
    public static final String IMPOSSIBLE = "IMPOSSIBLE";
    public static final String Possible = "Possible";
    public static final String Impossible = "Impossible";

    public static final int[] dx8 = {1, 0, -1, 0, 1, -1, -1, 1};
    public static final int[] dy8 = {0, 1, 0, -1, 1, 1, -1, -1};
    public static final int[] dx = {1, 0, -1, 0};
    public static final int[] dy = {0, 1, 0, -1};

    private Const(){}
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

/**
 * @author https://atcoder.jp/users/suisen
 */
class Edge {
    public int from;
    public int to;
    public long cost;

    public Edge(int from, int to, long cost) {
        this.from = from;
        this.to = to;
        this.cost = cost;
    }

    public Edge(int from, int to) {
        this(from, to, 1);
    }

    public Edge reverse() {
        return new Edge(to, from, cost);
    }
}
