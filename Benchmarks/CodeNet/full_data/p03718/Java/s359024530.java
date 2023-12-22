import java.io.InputStream;
import java.util.Arrays;
import java.util.PrimitiveIterator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;


public class Main {
    public static void main(String[] args) throws Exception {
        ExtendedScanner sc = new ExtendedScanner();
        FastPrintStream pw = new FastPrintStream();
        solve(sc, pw);
        sc.close();
        pw.flush();
        pw.close();
    }

    public static void solve(ExtendedScanner sc, FastPrintStream pw) {
        int h = sc.nextInt();
        int w = sc.nextInt();
        int si = -1, sj = -1, ti = -1, tj = -1;
        boolean[][] grid = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            char[] gi = sc.nextChars();
            for (int j = 0; j < w; j++) {
                if (gi[j] == 'S') {
                    si = i; sj = j;
                    grid[i][j] = true;
                } else if (gi[j] == 'T') {
                    ti = i; tj = j;
                    grid[i][j] = true;
                } else if (gi[j] == 'o') {
                    grid[i][j] = true;
                }
            }
        }
        int hw = h * w;
        int s = si * w + sj;
        int t = ti * w + tj + hw;
        PushRelabel pr = new PushRelabel(2 * h * w);
        // Digraph<CapEdge> g = new Digraph<>(2 * h * w);
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (!grid[i][j]) continue;
                int u = i * w + j;
                pr.addEdge(u + hw, u, 1);
                for (int r = 0; r < h; r++) {
                    if (r == i) continue;
                    if (grid[r][j]) {
                        pr.addEdge(u, r * w + j + hw, hw);
                    }
                }
                for (int c = 0; c < w; c++) {
                    if (c == j) continue;
                    if (grid[i][c]) {
                        pr.addEdge(u, i * w + c + hw, hw);
                    }
                }
            }
        }
        // MaxFlow mf = new MaxFlow(g);
        long flow = pr.maxFlow(s, t);
        pw.println(flow >= hw ? -1 : flow);
    }
}

class PushRelabel {
    public class CapEdge {
        private final int from, to;
        private long cap;
        private final int rev;
        CapEdge(int from, int to, long cap, int rev) {
            this.from = from;
            this.to = to;
            this.cap = cap;
            this.rev = rev;
        }
        public int getFrom()  {return from;}
        public int getTo()    {return to;}
        public long getCap()  {return cap;}
        public long getFlow() {return g[to][rev].cap;}
    }

    private static final long INF = Long.MAX_VALUE;

    private final int n;
    private int m;
    private final java.util.ArrayList<CapEdge> edges;
    private final int[] count;
    private final CapEdge[][] g;

    private final int[] cnt;
    private final int[] label;
    private final long[] excess;
    private final IntArrayList[] hs;
    private int relabels = 0;
    private int high = 0;

    public PushRelabel(int n) {
        this.n = n;
        this.edges = new java.util.ArrayList<>();
        this.count = new int[n];
        this.g = new CapEdge[n][];
        this.cnt = new int[n + 1];
        this.label = new int[n];
        this.excess = new long[n];
        this.hs = new IntArrayList[n];
        for (int i = 0; i < n; i++) {
            hs[i] = new IntArrayList();
        }
    }

    public int addEdge(int from, int to, long cap) {
        rangeCheck(from, 0, n);
        rangeCheck(to, 0, n);
        nonNegativeCheck(cap, "Capacity");
        CapEdge e = new CapEdge(from, to, cap, count[to]);
        count[from]++; count[to]++;
        edges.add(e);
        return m++;
    }

    private void buildGraph() {
        for (int i = 0; i < n; i++) {
            g[i] = new CapEdge[count[i]];
        }
        int[] idx = new int[n];
        for (CapEdge e : edges) {
            g[e.to][idx[e.to]++] = new CapEdge(e.to, e.from, 0, idx[e.from]);
            g[e.from][idx[e.from]++] = e;
        }
    }

    private void updateHeight(int idx, int nextHeight) {
        ++relabels;
        if (label[idx] != n + 1) {
            cnt[label[idx]]--;
        }
        label[idx] = nextHeight;
        if (label[idx] != n + 1) {
            high = nextHeight;
            cnt[nextHeight]++;
            if (excess[idx] > 0) {
                hs[nextHeight].add(idx);
            }
        }
    }
    
    private void globalRelabel(int idx) {
        for (int i = 0; i <= high; i++) hs[i].clear();
        relabels = 0;
        high = 0;
        Arrays.fill(label, n + 1);
        Arrays.fill(cnt, 0);
        int[] que = new int[n];
        int hd = 0, tl = 0;
        que[tl++] = idx;
        label[idx] = 0;
        while (tl > hd) {
            int p = que[hd++];
            for(CapEdge e : g[p]) {
                if(label[e.to] == n + 1 && g[e.to][e.rev].cap > 0) {
                    que[tl++] = e.to;
                    high = label[p] + 1;
                    updateHeight(e.to, high);
                }
            }
        }
    }
    
    private void push(int idx, CapEdge e) {
        if(label[e.to] == n + 1) return;
        if(excess[e.to] == 0) {
            hs[label[e.to]].add(e.to);
        }
        long df = Math.min(excess[idx], e.cap);
        e.cap -= df;
        g[e.to][e.rev].cap += df;
        excess[idx] -= df;
        excess[e.to] += df;
    }
    
    private void discharge(int idx) {
        int nextHeight = (int) n + 1;
        for(CapEdge e : g[idx]) {
            if (e.cap > 0) {
                if (label[idx] == label[e.to] + 1) {
                    push(idx, e);
                    if(excess[idx] <= 0) return;
                } else {
                    nextHeight = Math.min(nextHeight, label[e.to] + 1);
                }
            }
        }
        if(cnt[label[idx]] > 1) {
            updateHeight(idx, nextHeight);
        } else {
            for(; high >= label[idx]; hs[high--].clear()) {
            for(int j : hs[high]) updateHeight(j, n + 1);
            }
        }
    }
    
    public long maxFlow(int s, int t) {
        buildGraph();
        Arrays.fill(excess, 0);
        excess[s] = INF;
        excess[t] = -INF;
        globalRelabel(t);
        for (CapEdge e : g[s]) push(s, e);
        for (; high >= 0; high--) {
            while (hs[high].size() > 0) {
                int idx = hs[high].removeLast();
                discharge(idx);
                if (relabels >= n * 4) globalRelabel(t);
            }
        }
        return excess[t] + INF;
    }

    public CapEdge getEdge(int i) {
        rangeCheck(i, 0, m);
        return edges.get(i);
    }

    public void changeEdge(int i, long newCap, long newFlow) {
        rangeCheck(i, 0, m);
        nonNegativeCheck(newCap, "Capacity");
        if (newFlow > newCap) {
            throw new IllegalArgumentException(
                String.format("Flow %d is greater than capacity %d.", newCap, newFlow)
            );
        }
        CapEdge e = edges.get(i);
        CapEdge er = g[e.to][e.rev];
        e.cap = newCap - newFlow;
        er.cap = newFlow;
    }

    public java.util.ArrayList<CapEdge> getEdges() {
        return edges;
    }

    public boolean[] minCut(int s) {
        rangeCheck(s, 0, n);
        boolean[] reachable = new boolean[n];
        int[] stack = new int[n];
        int ptr = 0;
        stack[ptr++] = s;
        reachable[s] = true;
        while (ptr > 0) {
            int u = stack[--ptr];
            for (CapEdge e : g[u]) {
                int v = e.to;
                if (reachable[v] || e.cap <= 0) continue;
                reachable[v] = true;
                stack[ptr++] = v;
            }
        }
        return reachable;
    }

    private void rangeCheck(int i, int minInlusive, int maxExclusive) {
        if (i < 0 || i >= maxExclusive) {
            throw new IndexOutOfBoundsException(
                String.format("Index %d out of bounds for length %d", i, maxExclusive)
            );
        }
    }

    private void nonNegativeCheck(long cap, String attribute) {
        if (cap < 0) {
            throw new IllegalArgumentException(
                String.format("%s %d is negative.", attribute, cap)
            );
        }
    }
}

/**
 * @verified
 * - https://atcoder.jp/contests/practice2/tasks/practice2_d
 */
class MaxFlow {
    private static final int INF = Integer.MAX_VALUE;

    private final Digraph<? extends CapEdge> dig;
    private final int n;
    private final int[] count;
    private final CapEdge[][] g;

    public MaxFlow(Digraph<? extends CapEdge> capDiraph) {
        this.dig = capDiraph;
        this.n = capDiraph.getV();
        this.count = new int[n];
        this.g = new CapEdge[n][];
        buildGraph();
    }

    public int getFlow(CapEdge e) {
        return g[e.to][e.rev].cap;
    }

    private void buildGraph() {
        int[] idx = new int[n];
        for (int i = 0; i < n; i++) {
            count[i] = idx[i] = dig.deg(i);
        }
        for (CapEdge e : dig.getEdges()) {
            int j = e.to;
            count[j]++;
        }
        for (int i = 0; i < n; i++) {
            g[i] = new CapEdge[count[i]];
        }
        for (int u = 0; u < n; u++) {
            int k = dig.deg(u);
            for (int i = 0; i < k; i++) {
                CapEdge e = dig.getEdge(u, i);
                int v = e.to;
                e.rev = idx[v]++;
                CapEdge r = new CapEdge(v, u, 0);
                r.rev = i;
                g[u][i] = e;
                g[v][e.rev] = r;
            }
        }
    }

    public int maxFlow(int s, int t) {
        return flow(s, t, INF);
    }

    public int flow(int s, int t, int flowLimit) {
        rangeCheck(s, 0, n);
        rangeCheck(t, 0, n);
        buildGraph();
        int flow = 0;
        int[] level = new int[n];
        int[] que = new int[n];
        int[] iter = new int[n];
        while (true) {
            java.util.Arrays.fill(level, -1);
            dinicBFS(s, t, level, que);
            if (level[t] < 0) return flow;
            java.util.Arrays.fill(iter, 0);
            while (true) {
                int d = dinicDFS(t, s, flowLimit - flow, iter, level);
                if (d <= 0) break;
                flow += d;
                if (flow == flowLimit) return flow;
            }
        }
    }

    private void dinicBFS(int s, int t, int[] level, int[] que) {
        int hd = 0, tl = 0;
        que[tl++] = s;
        level[s] = 0;
        while (tl > hd) {
            int u = que[hd++];
            for (CapEdge e : g[u]) {
                int v = e.to;
                if (e.cap <= 0 || level[v] >= 0) continue;
                level[v] = level[u] + 1;
                if (v == t) return;
                que[tl++] = v;
            }
        }
    }

    private int dinicDFS(int cur, int s, int f, int[] iter, int[] level) {
        if (cur == s) return f;
        int res = 0;
        while (iter[cur] < count[cur]) {
            CapEdge er = g[cur][iter[cur]++];
            int u = er.to;
            CapEdge e = g[u][er.rev];
            if (level[u] >= level[cur] || e.cap <= 0) continue;
            int d = dinicDFS(u, s, Math.min(f - res, e.cap), iter, level);
            if (d <= 0) continue;
            e.cap -= d;
            er.cap += d;
            res += d;
            if (res == f) break;
        }
        return res;
    }

    public int fordFulkersonMaxFlow(int s, int t) {
        return fordFulkersonFlow(s, t, INF);
    }

    public int fordFulkersonFlow(int s, int t, int flowLimit) {
        rangeCheck(s, 0, n);
        rangeCheck(t, 0, n);
        buildGraph();
        boolean[] used = new boolean[n];
        int flow = 0;
        while (true) {
            java.util.Arrays.fill(used, false);
            int f = fordFulkersonDFS(s, t, flowLimit - flow, used);
            if (f <= 0) return flow;
            flow += f;
        }
    }

    private int fordFulkersonDFS(int cur, int t, int f, boolean[] used) {
        if (cur == t) return f;
        used[cur] = true;
        for (CapEdge e : g[cur]) {
            if (used[e.to] || e.cap <= 0) continue;
            int d = fordFulkersonDFS(e.to, t, Math.min(f, e.cap), used);
            if (d <= 0) continue;
            e.cap -= d;
            g[e.to][e.rev].cap += d;
            return d;
        }
        return 0;
    }

    public boolean[] minCut(int s) {
        rangeCheck(s, 0, n);
        boolean[] reachable = new boolean[n];
        int[] stack = new int[n];
        int ptr = 0;
        stack[ptr++] = s;
        reachable[s] = true;
        while (ptr > 0) {
            int u = stack[--ptr];
            for (CapEdge e : g[u]) {
                int v = e.to;
                if (reachable[v] || e.cap <= 0) continue;
                reachable[v] = true;
                stack[ptr++] = v;
            }
        }
        return reachable;
    }

    private void rangeCheck(int i, int minInlusive, int maxExclusive) {
        if (i < 0 || i >= maxExclusive) {
            throw new IndexOutOfBoundsException(
                String.format("Index %d out of bounds for length %d", i, maxExclusive)
            );
        }
    }
}

/**
 * @author https://atcoder.jp/users/suisen
 */
class FastScanner implements AutoCloseable {
    private final java.io.InputStream in;
    private final byte[] buf = new byte[1 << 13];
    private int ptr = 0;
    private int buflen = 0;

    public FastScanner(java.io.InputStream in) {
        this.in = in;
    }

    public FastScanner() {
        this(System.in);
    }

    private boolean hasNextByte() {
        if (ptr < buflen) return true;
        ptr = 0;
        try {
            buflen = in.read(buf);
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
        return buflen > 0;
    }

    private int readByte() {
        return hasNextByte() ? buf[ptr++] : -1;
    }

    public boolean hasNext() {
        while (hasNextByte() && !(32 < buf[ptr] && buf[ptr] < 127)) ptr++;
        return hasNextByte();
    }

    private StringBuilder nextSequence() {
        if (!hasNext()) throw new java.util.NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        for (int b = readByte(); 32 < b && b < 127; b = readByte()) {
            sb.appendCodePoint(b);
        }
        return sb;
    }

    public String next() {
        return nextSequence().toString();
    }

    public String next(int len) {
        return new String(nextChars(len));
    }

    public char nextChar() {
        if (!hasNextByte()) throw new java.util.NoSuchElementException();
        return (char) readByte();
    }

    public char[] nextChars() {
        StringBuilder sb = nextSequence();
        int l = sb.length();
        char[] dst = new char[l];
        sb.getChars(0, l, dst, 0);
        return dst;
    }
    public char[] nextChars(int len) {
        if (!hasNext()) throw new java.util.NoSuchElementException();
        char[] s = new char[len];
        int i = 0;
        int b = readByte();
        while (32 < b && b < 127 && i < len) {
            s[i++] = (char) b; b = readByte();
        }
        if (i != len) {
            throw new java.util.NoSuchElementException(
                String.format("Next token has smaller length than expected.", len)
            );
        }
        return s;
    }
    public long nextLong() {
        if (!hasNext()) throw new java.util.NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) throw new NumberFormatException();
        while (true) {
            if ('0' <= b && b <= '9') {
                n = n * 10 + b - '0';
            } else if (b == -1 || !(32 < b && b < 127)) {
                return minus ? -n : n;
            } else throw new NumberFormatException();
            b = readByte();
        }
    }
    public int nextInt() {
        return Math.toIntExact(nextLong());
    }
    public double nextDouble() {
        return Double.parseDouble(next());
    }
    public void close() {
        try {
            in.close();
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
final class ExtendedScanner extends FastScanner {
    public ExtendedScanner() {super();}
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

abstract class AbstractGraph<Edg extends AbstractEdge> {
    final int n;
    final java.util.ArrayList<Edg> edges;
    final java.util.ArrayList<java.util.ArrayList<Edg>> adj;
    public AbstractGraph(int n) {
        this.n = n;
        this.edges = new java.util.ArrayList<>(n);
        this.adj = new java.util.ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            adj.add(new java.util.ArrayList<>());
        }
    }
    public abstract void addEdge(Edg edge);
    public Edg getEdge(int u, int i) {
        return adj.get(u).get(i);
    }
    public java.util.ArrayList<Edg> getEdges(int u) {
        return adj.get(u);
    }
    public java.util.ArrayList<Edg> getEdges() {
        return edges;
    }
    public int deg(int u) {
        return adj.get(u).size();
    }
    public int getV() {
        return n;
    }
    public int getE() {
        return edges.size();
    }
}

/**
 * @author https://atcoder.jp/users/suisen
 */
class FastPrintStream implements AutoCloseable {
    private static final int BUF_SIZE = 1 << 13;
    private final byte[] buf = new byte[BUF_SIZE];
    private int ptr = 0;
    private final java.lang.reflect.Field strField;
    private final java.nio.charset.CharsetEncoder encoder;

    private java.io.OutputStream out;

    public FastPrintStream(java.io.OutputStream out) {
        this.out = out;
        java.lang.reflect.Field f;
        try {
            f = java.lang.String.class.getDeclaredField("value");
            f.setAccessible(true);
        } catch (NoSuchFieldException | SecurityException e) {
            f = null;
        }
        this.strField = f;
        this.encoder = java.nio.charset.StandardCharsets.US_ASCII.newEncoder();
    }

    public FastPrintStream(java.io.File file) throws java.io.IOException {
        this(new java.io.FileOutputStream(file));
    }

    public FastPrintStream(java.lang.String filename) throws java.io.IOException {
        this(new java.io.File(filename));
    }

    public FastPrintStream() {
        this(System.out);
        try {
            java.lang.reflect.Field f = java.io.PrintStream.class.getDeclaredField("autoFlush");
            f.setAccessible(true);
            f.set(System.out, false);
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException e) {
            // ignore
        }
    }

    public FastPrintStream println() {
        if (ptr == BUF_SIZE) internalFlush();
        buf[ptr++] = (byte) '\n';
        return this;
    }

    public FastPrintStream println(java.lang.Object o) {
        return print(o).println();
    }

    public FastPrintStream println(java.lang.String s) {
        return print(s).println();
    }

    public FastPrintStream println(char[] s) {
        return print(s).println();
    }

    public FastPrintStream println(char c) {
        return print(c).println();
    }

    public FastPrintStream println(int x) {
        return print(x).println();
    }

    public FastPrintStream println(long x) {
        return print(x).println();
    }

    public FastPrintStream println(double d, int precision) {
        return print(d, precision).println();
    }

    private FastPrintStream print(byte[] bytes) {
        int n = bytes.length;
        if (ptr + n > BUF_SIZE) {
            internalFlush();
            try {
                out.write(bytes);
            } catch (java.io.IOException e) {
                throw new RuntimeException();
            }
        } else {
            System.arraycopy(bytes, 0, buf, ptr, n);
            ptr += n;
        }
        return this;
    }

    public FastPrintStream print(java.lang.Object o) {
        return print(o.toString());
    }

    public FastPrintStream print(java.lang.String s) {
        if (strField == null) {
            return print(s.getBytes());
        } else {
            try {
                Object value = strField.get(s);
                if (value instanceof byte[]) {
                    return print((byte[]) value);
                } else {
                    return print((char[]) value);
                }
            } catch (IllegalAccessException e) {
                return print(s.getBytes());
            }
        }
    }

    public FastPrintStream print(char[] s) {
        try {
            return print(encoder.encode(java.nio.CharBuffer.wrap(s)).array());
        } catch (java.nio.charset.CharacterCodingException e) {
            byte[] bytes = new byte[s.length];
            for (int i = 0; i < s.length; i++) {
                bytes[i] = (byte) s[i];
            }
            return print(bytes);
        }
    }

    public FastPrintStream print(char c) {
        if (ptr == BUF_SIZE) internalFlush();
        buf[ptr++] = (byte) c;
        return this;
    }

    public FastPrintStream print(int x) {
        if (x == 0) {
            if (ptr == BUF_SIZE) internalFlush();
            buf[ptr++] = '0';
            return this;
        }
        int d = len(x);
        if (ptr + d > BUF_SIZE) internalFlush();
        if (x < 0) {
            buf[ptr++] = '-';
            x = -x;
            d--;
        }
        int j = ptr += d; 
        while (x > 0) {
            buf[--j] = (byte) ('0' + (x % 10));
            x /= 10;
        }
        return this;
    }

    public FastPrintStream print(long x) {
        if (x == 0) {
            if (ptr == BUF_SIZE) internalFlush();
            buf[ptr++] = '0';
            return this;
        }
        int d = len(x);
        if (ptr + d > BUF_SIZE) internalFlush();
        if (x < 0) {
            buf[ptr++] = '-';
            x = -x;
            d--;
        }
        int j = ptr += d; 
        while (x > 0) {
            buf[--j] = (byte) ('0' + (x % 10));
            x /= 10;
        }
        return this;
    }

    public FastPrintStream print(double d, int precision) {
        if (d < 0) {
            print('-');
            d = -d;
        }
        d += Math.pow(10, -precision) / 2;
        print((long) d).print('.');
        d -= (long) d;
        for(int i = 0; i < precision; i++){
            d *= 10;
            print((int) d);
            d -= (int) d;
        }
        return this;
    }

    private void internalFlush() {
        try {
            out.write(buf, 0, ptr);
            ptr = 0;
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void flush() {
        try {
            out.write(buf, 0, ptr);
            out.flush();
            ptr = 0;
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void close() {
        try {
            out.close();
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int len(int x) {
        int d = 1;
        if (x >= 0) {d = 0; x = -x;}
        int p = -10;
        for (int i = 1; i < 10; i++, p *= 10) if (x > p) return i + d;
        return 10 + d;
    }

    private static int len(long x) {
        int d = 1;
        if (x >= 0) {d = 0; x = -x;}
        long p = -10;
        for (int i = 1; i < 19; i++, p *= 10) if (x > p) return i + d;
        return 19 + d;
    }
}
/**
 * @author https://atcoder.jp/users/suisen
 */
class Digraph<Edg extends AbstractEdge> extends AbstractGraph<Edg> {
    public Digraph(int n) {
        super(n);
    }
    @Override
    public void addEdge(Edg edge) {
        adj.get(edge.from).add(edge);
        edges.add(edge);
    }
}

class Const {
    public static final long   LINF   = 1l << 59;
    public static final int    IINF   = (1  << 30) - 1;
    public static final double DINF   = 1e150;
    
    public static final double SMALL  = 1e-12;
    public static final double MEDIUM = 1e-9;
    public static final double LARGE  = 1e-6;

    public static final long MOD1000000007 = 1000000007;
    public static final long MOD998244353  = 998244353 ;
    public static final long MOD754974721  = 754974721 ;
    public static final long MOD167772161  = 167772161 ;
    public static final long MOD469762049  = 469762049 ;

    public static final int[] dx8 = {1, 0, -1, 0, 1, -1, -1, 1};
    public static final int[] dy8 = {0, 1, 0, -1, 1, 1, -1, -1};
    public static final int[] dx4 = {1, 0, -1, 0};
    public static final int[] dy4 = {0, 1, 0, -1};
}

abstract class AbstractEdge implements Comparable<AbstractEdge> {
    public final int from, to;
    public final long cost;
    public AbstractEdge(int from, int to, long cost) {
        this.from = from;
        this.to = to;
        this.cost = cost;
    }
    public AbstractEdge(int from, int to) {
        this(from, to, 1l);
    }
    public abstract AbstractEdge reverse();
    public int compareTo(AbstractEdge o) {
        return Long.compare(cost, o.cost);
    }
}

class CapEdge extends AbstractEdge {
    int cap;
    int rev;
    public CapEdge(int from, int to, int cap, int cost) {
        super(from, to, cost);
        this.cap = cap;
    }
    public CapEdge(int from, int to, int cap) {
        this(from, to, cap, 1);
    }
    @Override
    public final AbstractEdge reverse() {
        throw new UnsupportedOperationException();
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
