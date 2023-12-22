import java.io.InputStream;
import java.util.Arrays;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
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
        int n = sc.nextInt();
        var tb = new TreeBuilder(n);
        for (int i = 1; i < n; i++) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            tb.addEdge(u, v);
        }
        var t = tb.build();
        var par = t.parent();
        var sub = new int[n];
        for (int u : t.postOrder()) {
            sub[u] = 1;
            for (int v : t.getEdges(u)) {
                sub[u] += sub[v];
            }
        }
        var ma = new ModArithmetic(Const.MOD1000000007);
        var fac = ma.factorial(n);
        var ifac = ma.factorialInv(n);
        var r = new Rerooting(
            t, 1, new Rerooting.AddChild(){
                @Override
                public long add(long dpSum, long dp) {
                    return ma.mul(dpSum, dp);
                }
            }, new Rerooting.AddSubtreeRoot(){
                @Override
                public long add(long dpSum, int root, int parent) {
                    int subtreeSize = 1;
                    long prd = 1;
                    for (int v : t.getEdges(root)) {
                        if (v == parent) continue;
                        int x = v == par[root] ? n - sub[root] : sub[v];
                        prd = ma.mul(prd, ifac[x]);
                        subtreeSize += x;
                    }
                    return ma.mul(dpSum, prd, fac[subtreeSize - 1]);
                }
            }, new Rerooting.MergeChildren(){
                @Override
                public long merge(long dpSumL, long dpSumR) {
                    return ma.mul(dpSumL, dpSumR);
                }
            }, new Rerooting.AddRoot(){
                @Override
                public long add(long dpSum, int root) {
                    long prd = 1;
                    for (int v : t.getEdges(root)) {
                        int x = v == par[root] ? n - sub[root] : sub[v];
                        prd = ma.mul(prd, ifac[x]);
                    }
                    return ma.mul(dpSum, prd, fac[n - 1]);
                }
            }
        );
        for (long ans : r.dp()) {
            pw.println(ans);
        }
    }
}

/**
 * @author https://atcoder.jp/users/suisen
 */
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

class TreeBuilder {
    private static final class TreeEdge {
        final int from, to;
        final long cost;
        TreeEdge(int from, int to, long cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }
    }
    private final int n;
    private int ptr = 0;
    private final int root;
    private final TreeEdge[] edges;
    private final int[] count;
    private final int[][] adj;
    public TreeBuilder(int n, int root) {
        this.n = n;
        this.root = root;
        this.edges = new TreeEdge[n - 1];
        this.count = new int[n];
        this.adj = new int[n][];
    }
    public TreeBuilder(int n) {
        this(n, 0);
    }
    public void addEdge(int u, int v, long cost) {
        edges[ptr++] = new TreeEdge(u, v, cost);
        count[u]++;
        count[v]++;
    }
    public void addEdge(int u, int v) {
        addEdge(u, v, 1);
    }
    public Tree build() {
        for (int i = 0; i < n; i++) {
            adj[i] = new int[count[i]];
        }
        for (TreeEdge e : edges) {
            int u = e.from;
            int v = e.to;
            adj[u][--count[u]] = v;
            adj[v][--count[v]] = u;
        }
        return new Tree(n, root, adj);
    }
    public WeightedTree buildWeightedTree() {
        long[][] cst = new long[n][];
        for (int i = 0; i < n; i++) {
            adj[i] = new int[count[i]];
            cst[i] = new long[count[i]];
        }
        for (TreeEdge e : edges) {
            int u = e.from;
            int v = e.to;
            adj[u][--count[u]] = v;
            adj[v][--count[v]] = u;
            cst[u][count[u]] = e.cost;
            cst[v][count[v]] = e.cost;
        }
        return new WeightedTree(n, root, adj, cst);
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

/**
 * @author https://atcoder.jp/users/suisen
 */
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

class Const {
    public static final long   LONG   = 1l << 59;
    public static final int    INT    = 1  << 30;
    public static final double DOUBLE = 1e150;
    
    public static final double SMALL  = 1e-12;
    public static final double MEDIUM = 1e-9;
    public static final double LARGE  = 1e-6;

    public static final long MOD1000000007 = 1000000007;
    public static final long MOD1000000009 = 1000000009;
    public static final long MOD998244353  = 998244353 ;
}

/**
 * @author https://atcoder.jp/users/suisen
 */
class ModArithmetic {
    public final long MOD;
    public ModArithmetic(final long p) {
        this.MOD = p;
    }

    /** basic operations */

    public long mod(long a) {
        return (a %= MOD) < 0 ? a + MOD : a;
    }
    public long add(long a, long b) {
        long s = a + b;
        return s < 0 ? s + MOD : s >= MOD ? s - MOD : s;
    }
    public long add(long a, long b, long c) {
        return add(a, add(b, c));
    }
    public long add(long a, long b, long c, long d) {
        return add(a, add(b, add(c, d)));
    }
    public long add(long a, long b, long c, long d, long e) {
        return add(a, add(b, add(c, add(d, e))));
    }
    public long add(long a, long b, long c, long d, long e, long f) {
        return add(a, add(b, add(c, add(d, add(e, f)))));
    }
    public long add(long a, long b, long c, long d, long e, long f, long g) {
        return add(a, add(b, add(c, add(d, add(e, add(f, g))))));
    }
    public long add(long a, long b, long c, long d, long e, long f, long g, long h) {
        return add(a, add(b, add(c, add(d, add(e, add(f, add(g, h)))))));
    }
    public long add(long... xs) {
        long s = 0;
        for (long x : xs) s += x;
        return (s %= MOD) < 0 ? s + MOD : s;
    }
    public long sub(long a, long b) {
        long s = a - b;
        return s < 0 ? s + MOD : s >= MOD ? s - MOD : s;
    }
    public long mul(long a, long b) {
        long s = (a * b) % MOD;
        return s < 0 ? s + MOD : s;
    }
    public long mul(long a, long b, long c) {
        return mul(a, mul(b, c));
    }
    public long mul(long a, long b, long c, long d) {
        return mul(a, mul(b, mul(c, d)));
    }
    public long mul(long a, long b, long c, long d, long e) {
        return mul(a, mul(b, mul(c, mul(d, e))));
    }
    public long mul(long a, long b, long c, long d, long e, long f) {
        return mul(a, mul(b, mul(c, mul(d, mul(e, f)))));
    }
    public long mul(long a, long b, long c, long d, long e, long f, long g) {
        return mul(a, mul(b, mul(c, mul(d, mul(e, mul(f, g))))));
    }
    public long mul(long a, long b, long c, long d, long e, long f, long g, long h) {
        return mul(a, mul(b, mul(c, mul(d, mul(e, mul(f, mul(g, h)))))));
    }
    public long mul(long... xs) {
        long s = 0;
        for (long x : xs) s = mul(s, x);
        return s;
    }
    public long div(long a, long b) {
        long ret = (a * inv(b)) % MOD;
        return ret < 0 ? ret + MOD : ret;
    }
    public long inv(long a) {
        long b = MOD;
        long u = 1, v = 0;
        while (b >= 1) {
            long t = a / b;
            a -= t * b;
            long tmp1 = a; a = b; b = tmp1;
            u -= t * v;
            long tmp2 = u; u = v; v = tmp2;
        }
        return mod(u);
    }
    public long pow(long a, long b) {
        long pow = 1;
        for (long p = a, c = 1; b > 0;) {
            long lsb = b & -b;
            while (lsb != c) {
                c <<= 1;
                p = (p * p) % MOD;
            }
            pow = (pow * p) % MOD;
            b ^= lsb;
        }
        return pow;
    }

    /** array operations */

    public long[] rangeInv(int n) {
        long[] invs = new long[n + 1];
        invs[1] = 1;
        for (int i = 2; i <= n; i++) {
            long q = MOD - MOD / i;
            long r = invs[(int) (MOD % i)];
            invs[i] = (q * r) % MOD;
        }
        return invs;
    }
    public long[] arrayInv(long[] a) {
        int n = a.length;
        long[] dp = new long[n + 1];
        long[] pd = new long[n + 1];
        dp[0] = pd[n] = 1;
        for (int i = 0; i < n; i++) dp[i + 1] = (dp[i] * a[i    ]) % MOD;
        for (int i = n; i > 0; i--) pd[i - 1] = (pd[i] * a[i - 1]) % MOD;
        long inv = inv(dp[n]);
        long[] invs = new long[n];
        for (int i = 0; i < n; i++) {
            long lr = (dp[i] * pd[i + 1]) % MOD;
            invs[i] = (lr * inv) % MOD;
        }
        return invs;
    }
    public long[] factorial(int n) {
        long[] ret = new long[n + 1];
        ret[0] = 1;
        for (int i = 1; i <= n; i++) ret[i] = (ret[i - 1] * i) % MOD;
        return ret;
    }
    public long[] factorialInv(int n) {
        long facN = 1;
        for (int i = 2; i <= n; i++) facN = (facN * i) % MOD;
        long[] invs = new long[n + 1];
        invs[n] = inv(facN);
        for (int i = n; i > 0; i--) invs[i - 1] = (invs[i] * i) % MOD;
        return invs;
    }
    public long[] rangePower(long a, int n) {
        long[] pows = new long[n + 1];
        pows[0] = 1;
        for (int i = 1; i <= n; i++) pows[i] = (pows[i - 1] * a) % MOD;
        return pows;
    }

    /** combinatric operations */

    public long[][] combTable(int n) {
        long[][] comb = new long[n + 1][];
        for (int i = 0; i <= n; i++) {
            comb[i] = new long[i + 1];
            comb[i][0] = comb[i][i] = 1;
            for (int j = 1; j < i; j++) {
                comb[i][j] = add(comb[i - 1][j - 1], comb[i - 1][j]);
            }
        }
        return comb;
    }
    public long comb(int n, int r, long[] factorial, long[] invFactorial) {
        if (r < 0 || r > n) return 0;
        long inv = (invFactorial[r] * invFactorial[n - r]) % MOD;
        return (factorial[n] * inv) % MOD;
    }
    public long naiveComb(long n, long r) {
        if (r < 0 || r > n) return 0;
        r = Math.min(r, n - r);
        n %= MOD;
        long res = 1;
        long[] invs = rangeInv(Math.toIntExact(r));
        for (int d = 1; d <= r; d++) {
            res = (res * n--) % MOD;
            res = (res * invs[d]) % MOD;
        }
        return res;
    }
    public long perm(int n, int r, long[] factorial, long[] invFactorial) {
        if (r < 0 || r > n) return 0;
        return (factorial[n] * invFactorial[n - r]) % MOD;
    }
    public long naivePerm(long n, long r) {
        if (r < 0 || r > n) return 0;
        long res = 1;
        for (long i = n - r + 1; i <= n; i++) res = (res * i) % MOD;
        return res;
    }
}
/**
 * @author https://atcoder.jp/users/suisen
 */
class Tree {
    final int n;
    final int root;
    final int[][] adj;
    final int[] par;
    final int[] pre;
    final int[] pst;
    Tree(int n, int root, int[][] adj) {
        this.n = n;
        this.adj = adj;
        this.root = root;
        this.par = new int[n];
        this.pre = new int[n];
        this.pst = new int[n];
        build();
    }
    private void build() {
        int preOrd = 0, pstOrd = 0;
        java.util.Arrays.fill(par, -1);
        int[] stack = new int[n << 1];
        int ptr = 0;
        stack[ptr++] = ~root;
        stack[ptr++] =  root;
        while (ptr > 0) {
            int u = stack[--ptr];
            if (u >= 0) {
                pre[preOrd++] = u;
                for (int v : adj[u]) {
                    if (v == par[u]) continue;
                    par[v] = u;
                    stack[ptr++] = ~v;
                    stack[ptr++] =  v;
                }
            } else {
                pst[pstOrd++] = ~u;
            }
        }
    }
    public int getV() {
        return n;
    }
    public int getRoot() {
        return root;
    }
    public int[] getEdges(int u) {
        return adj[u];
    }
    public int[] parent() {
        return par;
    }
    public int[] preOrder() {
        return pre;
    }
    public int[] postOrder() {
        return pst;
    }
}



// import java.util.Arrays;
// import java.util.function.LongBinaryOperator;

// import lib.util.collections.IntArrayList;
// import lib.util.collections.IntDeque;
// import lib.util.function.LongIntToLongFunction;

// /**
//  * @author https://atcoder.jp/users/suisen
//  */
// public final class Rerooting {
//     /**
//      * adjacent list of the tree.
//      */
//     private final IntArrayList[] adj;
//     /**
//      * the size of the tree.
//      */
//     private final int n;
//     /**
//      * the identity element of the appender.
//      */
//     private final long e;
//     /**
//      * results + a result
//      */
//     private final LongBinaryOperator appender;
//     /**
//      * results + results
//      */
//     private final LongBinaryOperator leftRightMerger;
//     /**
//      * merged result + root
//      */
//     private final LongIntToLongFunction summarizer;
//     /**
//      * adj[adj[v][i]][inv[v][i]] = v
//      */
//     private final IntArrayList[] inv;
//     /**
//      * par[v] = the parent of v.
//      */
//     private final int[] par;
//     /**
//      * sub[v][i] = the result of the i-th subtree of the vertex v.
//      */
//     private final long[][] sub;
//     /**
//      * ord[i] is the i-th vertex in DFS-visiting order.
//      */
//     private final int[] ord;
//     /**
//      * result of rerooting.
//      */
//     private final long[] res;

//     /**
//      * @param n size of the tree
//      * @param e identity element
//      * @param leftRightMerger function that merges the result cumulated from left and right
//      * @param appender function that merges the cumulated result and a result
//      * @param summarizer function that adds information about the node to the merged result
//      */
//     public Rerooting(int n, long e, LongBinaryOperator appender, LongBinaryOperator leftRightMerger, LongIntToLongFunction summarizer) {
//         this.n = n;
//         this.e = e;
//         this.appender = appender;
//         this.leftRightMerger = leftRightMerger;
//         this.summarizer = summarizer;
//         this.adj = new IntArrayList[n];
//         this.inv = new IntArrayList[n];
//         this.par = new int[n];
//         this.sub = new long[n][];
//         this.ord = new int[n];
//         this.res = new long[n];
//         Arrays.fill(res, e);
//         for (int i = 0; i < n; i++) {
//             adj[i] = new IntArrayList();
//             inv[i] = new IntArrayList();
//         }
//     }

//     public void addEdge(int u, int v) {
//         int su = adj[u].size(), sv = adj[v].size();
//         inv[u].add(sv); inv[v].add(su);
//         adj[u].add(v) ; adj[v].add(u) ;
//     }

//     /**
//      * @return the result of the rerooting.
//      */
//     public long[] rerooting() {
//         for (int u = 0; u < n; u++) sub[u] = new long[adj[u].size()];
//         down();
//         up();
//         calc();
//         return res;
//     }

//     /**
//      * calc dfs-preorder and a parent of each vertex
//      */
//     private void down() {
//         int k = 0;
//         IntDeque st = new IntDeque(n);
//         st.addLast(0);
//         while (st.size() > 0) {
//             int u = st.removeLast();
//             ord[k++] = u; // preorder
//             for (int v : adj[u]) {
//                 if (v == par[u]) continue;
//                 par[v] = u; // parent
//                 st.addLast(v);
//             }
//         }
//     }

//     /**
//      * calc sub[v][i] (i: children of v) in DFS-leaving order.
//      * This method does not calc sub[v][par[v]].
//      */
//     private void up() {
//         for (int i = n - 1; i > 0; i--) { // in reversed order
//             int u = ord[i];
//             long res = e;
//             int pj = -1;
//             for (int j = 0, l = adj[u].size(); j < l; j++) {
//                 int v = adj[u].get(j);
//                 if (v == par[u]) {
//                     pj = j;
//                 } else { // sub[u][j] has already been calculated.
//                     res = appender.applyAsLong(res, sub[u][j]);
//                 }
//             }
//             sub[par[u]][inv[u].get(pj)] = summarizer.apply(res, u);
//         }
//     }

//     /**
//      * calc sub[v][par[v]] and res[v].
//      */
//     private void calc() {
//         for (int u : ord) {
//             int ul = adj[u].size();
//             long[] pd = new long[ul]; // backward cumulating
//             if (ul >= 1) pd[ul - 1] = e;
//             for (int j = ul - 1; j > 0; j--) {
//                 pd[j - 1] = appender.applyAsLong(pd[j], sub[u][j]);
//             }
//             long dp = e; // forward cumulating
//             for (int j = 0; j < ul; j++) {
//                 int v = adj[u].get(j);
//                 long res = summarizer.apply(leftRightMerger.applyAsLong(dp, pd[j]), u);
//                 sub[v][inv[u].get(j)] = res;
//                 dp = appender.applyAsLong(dp, sub[u][j]);
//             }
//             res[u] = summarizer.apply(dp, u);
//         }
//     }
// }

class Rerooting {
    @FunctionalInterface
    public static interface AddChild {
        public long add(long dpSum, long dp);
    }
    @FunctionalInterface
    public static interface AddSubtreeRoot {
        public long add(long dpSum, int root, int parent);
    }
    @FunctionalInterface
    public static interface MergeChildren {
        public long merge(long dpSumL, long dpSumR);
    }
    @FunctionalInterface
    public static interface AddRoot {
        public long add(long dpSum, int root);
    }

    private final Tree t;
    private final int n;
    private final long[] subTreeDP;
    private final long[] childrenDP;
    private final long[] rerooting;
    public Rerooting(Tree t, long e, AddChild addChild, AddSubtreeRoot addSubtreeRoot, MergeChildren mergeChildren, AddRoot addRoot) {
        this.t = t;
        this.n = t.n;
        this.subTreeDP = new long[n];
        this.childrenDP = new long[n];
        this.rerooting = new long[n];
        dfs(e, addChild, addSubtreeRoot);
        bfs(e, addChild, addSubtreeRoot, mergeChildren, addRoot);
    }
    private void dfs(long e, AddChild adCh, AddSubtreeRoot adSubRt) {
        for (int u : t.pst) {
            childrenDP[u] = e;
            for (int v : t.adj[u]) {
                if (v == t.par[u]) continue;
                childrenDP[u] = adCh.add(childrenDP[u], subTreeDP[v]);
            }
            subTreeDP[u] = adSubRt.add(childrenDP[u], u, t.par[u]);
        }
    }
    private void bfs(long e, AddChild adCh, AddSubtreeRoot adSubRt, MergeChildren mgCh, AddRoot adRt) {
        long[] parDP = new long[n];
        rerooting[t.root] = subTreeDP[t.root];
        for (int u : t.pre) {
            int l = t.adj[u].length;
            long sumR = e;
            for (int i = l - 1; i >= 0; i--) {
                int v = t.adj[u][i];
                if (v == t.par[u]) {
                    sumR = adCh.add(sumR, parDP[u]);
                    continue;
                }
                sumR = adCh.add(rerooting[v] = sumR, subTreeDP[v]);
            }
            long sumL = e;
            for (int i = 0; i < l; i++) {
                int v = t.adj[u][i];
                if (v == t.par[u]) {
                    sumL = adCh.add(sumL, parDP[u]);
                    continue;
                }
                sumR = rerooting[v];
                parDP[v] = adSubRt.add(mgCh.merge(sumL, sumR), u, v);
                rerooting[v] = adRt.add(adCh.add(childrenDP[v], parDP[v]), v);
                sumL = adCh.add(sumL, subTreeDP[v]);
            }
        }
    }
    public long[] dp() {
        return rerooting;
    }
}
/**
 * @author https://atcoder.jp/users/suisen
 */
class WeightedTree extends Tree {
    final long[] cst;
    final long[][] adjCost;
    WeightedTree(int n, int root, int[][] adj, long[][] adjCost) {
        super(n, root, adj);
        this.cst = new long[n];
        this.adjCost = adjCost;
        for (int u = 0; u < n; u++) {
            int k = adj[u].length;
            for (int i = 0; i < k; i++) {
                int v = adj[u][i];
                long c = adjCost[u][i];
                if (v == par[u]) {
                    cst[u] = c;
                } else {
                    cst[v] = c;
                }
            }
        }
    }
    public long[] getWeights() {
        return cst;
    }
    public long getWeight(int u, int i) {
        return adjCost[u][i];
    }
}
