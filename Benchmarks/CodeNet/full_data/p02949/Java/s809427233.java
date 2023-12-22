class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner();
        FastPrintStream pw = new FastPrintStream();
        solve(sc, pw);
        sc.close();
        pw.flush();
        pw.close();
    }

    public static void solve(FastScanner sc, FastPrintStream pw) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        long p = sc.nextLong();
        Digraph<SimpleEdge> g = new Digraph<>(n);
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            long c = sc.nextLong();
            g.addEdge(new SimpleEdge(u, v, p - c));
        }
        BellmanFord<SimpleEdge> bf = new BellmanFord<>(g, 0);
        if (bf.isNegInf(n - 1)) {
            pw.println(-1);
        } else {
            pw.println(Math.max(0, -bf.distance(n - 1)));
        }
    }
}

abstract class AbstractGraph<T extends AbstractEdge> {
    final int n;
    int m = 0;
    final java.util.ArrayList<T> edges;
    final java.util.ArrayList<java.util.ArrayList<T>> adj;
    public AbstractGraph(int n) {
        this.n = n;
        this.edges = new java.util.ArrayList<>(n);
        this.adj = new java.util.ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            adj.add(new java.util.ArrayList<>());
        }
    }
    public void addEdge(T edge) {
        m++;
    }
    public java.util.ArrayList<T> getEdges(int u) {
        return adj.get(u);
    }
    public java.util.ArrayList<T> getEdges() {
        return edges;
    }
    public int getV() {
        return n;
    }
    public int getE() {
        return m;
    }
}

@SuppressWarnings("unchecked")
class Graph<T extends AbstractEdge> extends AbstractGraph<T> {
    public Graph(int n) {
        super(n);
    }
    public void addEdge(T edge) {
        super.addEdge(edge);
        T rev = (T) edge.reverse();
        adj.get(edge.from).add(edge);
        adj.get(edge.to).add(rev);
    }
}

class Digraph<T extends AbstractEdge> extends AbstractGraph<T> {
    public Digraph(int n) {
        super(n);
    }
    public void addEdge(T edge) {
        super.addEdge(edge);
        adj.get(edge.from).add(edge);
    }
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

final class SimpleEdge extends AbstractEdge {
    public SimpleEdge(int from, int to, long cost) {
        super(from, to, cost);
    }
    public SimpleEdge(int from, int to) {
        super(from, to);
    }
    @Override
    public SimpleEdge reverse() {
        return new SimpleEdge(to, from, cost);
    }
}

class BellmanFord<T extends AbstractEdge> {
    public static final long UNREACHABLE = Long.MAX_VALUE;
    public static final long NEG_INF = Long.MIN_VALUE;

    private final AbstractGraph<T> g;
    private final int n;
    private final int s;
    private final long[] dist;
    private final java.util.ArrayList<T> prev;

    public BellmanFord(AbstractGraph<T> g, int s) {
        this.g = g;
        this.n = g.getV();
        this.s = s;
        this.dist = new long[n];
        this.prev = new java.util.ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            prev.add(null);
        }
        solve();
    }

    private void solve() {
        java.util.Arrays.fill(dist, UNREACHABLE);
        dist[s] = 0;
        for (int $ = 1; $ < n; $++) {
            for (int u = 0; u < n; u++) {
                if (dist[u] == UNREACHABLE) continue;
                for (T e : g.getEdges(u)) {
                    int v = e.to;
                    if (dist[u] + e.cost < dist[v]) {
                        dist[v] = dist[u] + e.cost;
                        prev.set(v, e);
                    }
                }
            }
        }
        for (int $ = 0; $ < n; $++) {
            for (int u = 0; u < n; u++) {
                if (dist[u] == UNREACHABLE) continue;
                for (T e : g.getEdges(u)) {
                    int v = e.to;
                    if (dist[u] == NEG_INF || dist[u] + e.cost < dist[v]) {
                        dist[u] = dist[v] = NEG_INF;
                    }
                }
            }
        }
    }

    public java.util.ArrayList<T> path(int t) {
        if (dist[t] == UNREACHABLE || dist[t] == NEG_INF) return null;
        java.util.ArrayList<T> path = new java.util.ArrayList<>();
        for (int v = t; v != s; v = prev.get(v).from) {
            path.add(prev.get(v));
        }
        int m = path.size();
        for (int l = 0, r = m - 1; l < r; l++, r--) {
            T tmp = path.get(l);
            path.set(l, path.get(r));
            path.set(r, tmp);
        }
        return path;
    }

    public long[] distances() {
        return dist;
    }

    public long distance(int i) {
        return dist[i];
    }

    public boolean isReachable(int t) {
        return dist[t] != UNREACHABLE;
    }

    public boolean isNegInf(int t) {
        return dist[t] == NEG_INF;
    }
}

class FastPrintStream implements AutoCloseable {
    private static final int BUF_SIZE = 1 << 15;
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
                return print((byte[]) strField.get(s));
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
        d += Math.pow(10, -d) / 2;
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

class FastScanner implements AutoCloseable {
    private final java.io.InputStream in;
    private final byte[] buf = new byte[2048];
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

