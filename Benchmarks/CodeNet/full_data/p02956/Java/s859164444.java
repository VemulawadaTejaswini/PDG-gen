import java.io.*;
import java.util.*;
import java.util.function.Function;

public class Main {

    static int N;
    static Cord[] C;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        C = new Cord[N];
        for (int i = 0; i < N; i++) {
            C[i] = new Cord(sc.nextInt(), sc.nextInt());
        }

        System.out.println(solve());
    }

    static int solve() {
        int[] Y = new int[N];
        for (int i = 0; i < N; i++) {
            Y[i] = C[i].y;
        }
        Zip zip = new Zip(Y);
        Arrays.sort(C, Comparator.comparingInt(c -> c.x));
        // ba
        // cd
        FenwickTree bit = new FenwickTree(N, FenwickTree.SUM);
        for (int i = 0; i < N; i++) {
            Cord c = C[i];

            int lo = (int)bit.query(zip.to_i(c.y));
            int hi = i - lo;
            c.b = hi;
            c.c = lo;
            bit.add(zip.to_i(c.y), 1);
        }
        Arrays.fill(bit.bit, 0);
        for (int i = N-1; i >= 0; i--) {
            Cord c = C[i];

            int lo = (int)bit.query(zip.to_i(c.y));
            int hi = (N-1-i) - lo;
            c.a = hi;
            c.d = lo;
            bit.add(zip.to_i(c.y), 1);
        }

//        for (int i = 0; i < N; i++) {
//            Cord c = C[i];
//            debug(c.x, c.y, c.a, c.b, c.c, c.d);
//        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            Cord cord = C[i];

            for (int a = 0; a < 2; a++) {
                for (int b = 0; b < 2; b++) {
                    for (int c = 0; c < 2; c++) {
                        for (int d = 0; d < 2; d++) {
                            // 自分がoff
                            if( isOk(a, b, c, d) ) {
                                ans += calc(cord, a, b, c, d);
                                ans %= MOD;
                            }

                            // 自分がon
                            ans += calc(cord, a, b, c, d);
                            ans %= MOD;
                        }
                    }
                }
            }
        }
        return ans;
    }

    // ba
    // cd
    static boolean isOk(int a, int b, int c, int d) {
        boolean up =    a==1 || b==1;
        boolean down =  c==1 || d==1;
        boolean left =  b==1 || c==1;
        boolean right = a==1 || d==1;
        return up && down && left && right;
    }

    static int calc(Cord cord, int a, int b, int c, int d) {
        int ca = count(cord.a, a);
        int cb = count(cord.b, b);
        int cc = count(cord.c, c);
        int cd = count(cord.d, d);
        return mul(mul(ca, cb), mul(cc, cd));
    }

    static int count(int n, int on) {
        if( on == 1 ) {
            return sub(pow(2, n), 1);
        } else {
            return 1;
        }
    }

    static int MOD = 998244353;

    static int pow(int base, long exp) {
        if (exp == 0) return 1;

        int ans = 1;
        base %= MOD;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                ans = mul(ans, base);
            }

            base = mul(base, base);
            exp = exp >> 1;
        }
        return ans;
    }

    static int sub(int a, int b) {
        int c = a - b;
        if (c < 0) c += MOD;
        return c;
    }

    static int div(int a, int b) {
        return mul(a, pow(b, MOD - 2));
    }

    static int add(int a, int b) {
        int c = a + b;
        if (c >= MOD) c %= MOD;
        return c;
    }

    static int mul(int a, int b) {
        long c = (long) a * b;
        if (c >= MOD) c %= MOD;
        return (int) c;
    }

    static class FermatCombination {
        private final int size;
        private final int[] factorial; // n -> factorial(n)
        private final int[] inverse;   // n -> inverse(factorial(n))

        FermatCombination(int size) {
            this.size = size;
            factorial = new int[size + 1];
            inverse = new int[size + 1];

            init();
        }

        private void init() {
            factorial[0] = 1;
            factorial[1] = 1;
            inverse[0] = 1;
            inverse[1] = 1;
            for (int i = 2; i <= size; i++) {
                factorial[i] = mul(factorial[i - 1], i);
                inverse[i] = pow(factorial[i], MOD - 2);
            }
        }

        int comb(int n, int k) {
            if (n > size) throw new RuntimeException("wtf : size=" + size + " n=" + n);
            return mul(mul(factorial[n], inverse[k]), inverse[n - k]);
        }

        // 重複組み合わせ
        // k種類からn個選ぶ場合の数
        int hcomb(int k, int n) {
            return comb(k + n - 1, n);
        }

        int group(int n, int g, int k) {
            // C(n, g) * C(n-g, g)... / k!
            // n! / (n-gk)! / g! ^ k / k!
            int ret = factorial[n];             // n!
            ret = mul(ret, inverse[n - g * k]);   // 1 / (n-gk)!
            ret = mul(ret, pow(inverse[g], k)); // 1 / (g! ^ k)
            ret = mul(ret, inverse[k]);         // 1 / k!
            return ret;
        }
    }

    static class Cord {
        int x, y;
        int a, b, c, d;

        public Cord(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static class FenwickTree {

        interface Monoid {
            long identity();
            long apply(long a, long b);
            long inverse(long a);
        }

        static Monoid SUM = new Monoid() {
            public long identity() { return 0; }
            public long apply(long a, long b) { return a+b; }
            public long inverse(long a) { return -a; }
        };

        static Monoid MAX = new Monoid() {
            public long identity() { return 0; }
            public long apply(long a, long b) { return Math.max(a, b); }
            public long inverse(long a) { throw new RuntimeException("no inverse"); }
        };


        int size;
        long[] bit;
        Monoid m;
        long identity;

        FenwickTree(int size, Monoid m) {
            this.size = 1;
            while( this.size < size ) this.size *= 2;
            this.bit = new long[this.size+1];
            this.identity = m.identity();
            if( this.identity != 0 ) {
                Arrays.fill(this.bit, this.identity);
            }
            this.m = m;
        }

        void add(int i, long v) {
            i++; // 0 index -> 1 index

            while( i <= size ) {
                bit[i] = m.apply(bit[i], v);
                i += i & -i;
            }
        }

        // [0, r)
        long query(int r) {
            // 0 index -> 1 index -> -1
            long ret = identity;
            while(r > 0) {
                ret = m.apply(ret, bit[r]);
                r -= r & -r;
            }
            return ret;
        }

        long query(int l, int r) {
            return query(r) + m.inverse(query(l));
        }

        int lowerBound(int v) {
            if( bit[size] < v ) return size;

            int x = 0;
            for (int k = size/2; k > 0; k /= 2 ) {
                if( bit[x + k] < v ) {
                    v -= bit[x+k];
                    x += k;
                }
            }
            return x;
        }
    }

    static class Zip {

        Map<Integer, Integer> toIndex;
        int[] toValue;

        Zip(int[] values) {
            toValue = Arrays.copyOf(values, values.length);
            Arrays.sort(toValue);
            toIndex = new HashMap<>();
            for (int i = 0; i < values.length; i++) {
                toIndex.put(toValue[i], i);
            }
        }

        Zip(Set<Integer> set) {
            toValue = new int[set.size()];
            int idx = 0;
            for (Integer each : set) {
                toValue[idx++] = each;
            }
            Arrays.sort(toValue);
            toIndex = new HashMap<>();
            for (int i = 0; i < set.size(); i++) {
                toIndex.put(toValue[i], i);
            }
        }

        int to_i(int value) {
            return toIndex.get(value);
        }

        int to_v(int index) {
            return toValue[index];
        }
    }

    @SuppressWarnings("unused")
    static class FastScanner {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken("\n");
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        int[] nextIntArray(int n, int delta) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt() + delta;
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }

    static <A> void writeLines(A[] as, Function<A, String> f) {
        PrintWriter pw = new PrintWriter(System.out);
        for (A a : as) {
            pw.println(f.apply(a));
        }
        pw.flush();
    }

    static void writeLines(int[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int a : as) pw.println(a);
        pw.flush();
    }

    static void writeLines(long[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (long a : as) pw.println(a);
        pw.flush();
    }

    static int max(int... as) {
        int max = Integer.MIN_VALUE;
        for (int a : as) max = Math.max(a, max);
        return max;
    }

    static int min(int... as) {
        int min = Integer.MAX_VALUE;
        for (int a : as) min = Math.min(a, min);
        return min;
    }

    static void debug(Object... args) {
        StringJoiner j = new StringJoiner(" ");
        for (Object arg : args) {
            if (arg instanceof int[]) j.add(Arrays.toString((int[]) arg));
            else if (arg instanceof long[]) j.add(Arrays.toString((long[]) arg));
            else if (arg instanceof double[]) j.add(Arrays.toString((double[]) arg));
            else if (arg instanceof Object[]) j.add(Arrays.toString((Object[]) arg));
            else j.add(arg.toString());
        }
        System.err.println(j.toString());
    }
}
