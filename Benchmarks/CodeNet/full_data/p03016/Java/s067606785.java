import java.io.*;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class Main {

    static long L, A, B;
    static int MOD;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        L = sc.nextLong();
        A = sc.nextLong();
        B = sc.nextLong();
        MOD = sc.nextInt();

        System.out.println(solve());
    }

    static int solve() {
        int ans = 0;
        long kk = 0;
        for (int k = 18; k >= 1; k--) {
            final int fk = k;
            long first = minimize(0, L, idx -> String.valueOf(val(idx)).length() >= fk);
            long last = maximize(0, L, idx -> String.valueOf(val(idx)).length() <= fk);

            long n = last-first+1;
            if( n > 0 ) {
                int c = calc(val(first), k, n);
                ans = add(ans, mul(c, pow(10, kk)));

                kk += k * n; // longの範囲を超えない…よね？
            }
        }

        return ans;
    }

    static long val(long idx) {
        return A + B * idx;
    }

    static long maximize(long lo, long hi, LongPredicate p) {
        while(lo < hi) {
            long x = ((hi - lo) >>> 1) + lo;
            if( p.test(x) ) {
                lo = x + 1;
            } else {
                hi = x;
            }
        }
        return lo - 1;
    }

    static long minimize(long lo, long hi, LongPredicate p) {
        while(lo < hi) {
            long x = ((hi - lo) >>> 1) + lo;
            if( p.test(x) ) {
                hi = x;
            } else {
                lo = x + 1;
            }
        }
        return lo;
    }

    static int calc(long start, int k, long n) {
        IntMat m = new IntMat(3, 3);

        // (a, b) -> (a*10^k + b, b+B)
        // のように定数を入れたい場合にうまいことやるテクニック
        //　高校時代にやったようなやってないような…

        // (10^k, 0, 0)
        // (1,    1, 0)
        // (0,    B, 1)
        m.set(0, 0, pow(10, k));
        m.set(1, 0, 1);
        m.set(1, 1, 1);
        m.set(2, 1, (int)(B%MOD));
        m.set(2, 2, 1);

        IntMat in = new IntMat(1, 3);
        in.set(0, 0, 0);
        in.set(0, 1, (int)(start%MOD));
        in.set(0, 2, 1);

        IntMat p = IntMat.pow(m, n, Main::mul, Main::add);
        IntMat out = IntMat.dot(in, p, Main::mul, Main::add);
        return out.get(0, 0);
    }

    static class IntMat {

        final int[][] mat;

        IntMat(int r, int c) {
            mat = new int[r][c];
        }

        IntMat(int[][] mat) {
            this.mat = mat;
        }

        IntMat(int[] vec) {
            mat = new int[vec.length][1];
            for (int i = 0; i < vec.length; i++) {
                mat[i][0] = vec[i];
            }
        }

        static IntMat pow(IntMat m, long k, int mod) {
            if( m.row() != m.col() ) throw new IllegalArgumentException("row != col : " + m.row() + " " + m.col());

            int n = m.row();
            IntMat ret = new IntMat(n, n);
            for (int i = 0; i < n; i++) {
                ret.set(i, i, 1);
            }
            if( k == 0 ) return ret; // どうだろ...

            while( k > 0 ) {
                if( (k & 1) == 1 ) {
                    ret = IntMat.dot(ret, m, mod);
                }

                m = IntMat.dot(m, m, mod);
                k = k >> 1L;
            }
            return ret;
        }

        static IntMat pow(IntMat m, long k, IntBinaryOperator mul, IntBinaryOperator add) {
            if( m.row() != m.col() ) throw new IllegalArgumentException("row != col : " + m.row() + " " + m.col());

            int n = m.row();
            IntMat ret = new IntMat(n, n);
            for (int i = 0; i < n; i++) {
                ret.set(i, i, 1);
            }
            if( k == 0 ) return ret; // どうだろ...

            while( k > 0 ) {
                if( (k & 1) == 1 ) {
                    ret = IntMat.dot(ret, m, mul, add);
                }

                m = IntMat.dot(m, m, mul, add);
                k = k >> 1L;
            }
            return ret;
        }

        static IntMat dot(IntMat a, IntMat b) {
            return dot(a, b, (i, j) -> i*j, (i, j) -> i+j);
        }

        static IntMat dot(IntMat a, IntMat b, IntBinaryOperator mul, IntBinaryOperator add) {
            int[][] ret = new int[a.row()][b.col()];

            for (int r = 0; r < a.row(); r++) {
                for (int c = 0; c < b.col(); c++) {
                    int sum = 0;
                    for (int i = 0; i < b.row(); i++) {
                        sum = add.applyAsInt(sum, mul.applyAsInt(a.get(r, i), b.get(i, c)));
                    }
                    ret[r][c] = sum;
                }
            }
            return new IntMat(ret);
        }

        static IntMat dot(IntMat a, IntMat b, int mod) {
            long m2 = (long)mod * mod;

            int ar = a.row();
            int bc = b.col();
            int br = b.row();
            int[][] ret = new int[ar][bc];

            for (int r = 0; r < ar; r++) {
                for (int c = 0; c < bc; c++) {
                    long sum = 0;
                    for (int i = 0; i < br; i++) {
                        long ab = (long)a.mat[r][i] * b.mat[i][c];
                        sum += ab;
                        if( sum >= m2 ) {
                            sum -= m2;
                        }
                    }
                    ret[r][c] = (int)(sum % mod);
                }
            }
            return new IntMat(ret);
        }

        void set(int r, int c, int n) {
            mat[r][c] = n;
        }

        int get(int r, int c) {
            try {
                return mat[r][c];
            } catch( ArrayIndexOutOfBoundsException e ) {
                throw new RuntimeException("wrong index : r=" + r + " c=" + c + " row=" + row() + " col=" + col());
            }
        }

        int row() {
            return mat.length;
        }

        int col() {
            return mat[0].length;
        }
    }

    static int pow(int base, long exp) {
        if( exp == 0 ) return 1;

        int ans = 1;
        base %= MOD;
        while( exp > 0 ) {
            if( (exp & 1) == 1 ) {
                ans = mul(ans, base);
            }

            base = mul(base, base);
            exp = exp >> 1;
        }
        return ans;
    }

    static int sub(int a, int b) {
        int c = a - b;
        if( c <= 0 ) c += MOD;
        return c;
    }

    static int div(int a, int b) {
        return mul(a, pow(b, MOD-2));
    }

    static int add(int a, int b) {
        int c = a + b;
        if( c >= MOD ) c %= MOD;
        return c;
    }

    static int mul(int a, int b) {
        long c = (long)a * b;
        if( c >= MOD ) c %= MOD;
        return (int)c;
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
                factorial[i] = mul(factorial[i-1], i);
                inverse[i] = pow(factorial[i], MOD - 2);
            }
        }

        int comb(int n, int k) {
            if( n > size ) throw new RuntimeException("wtf : size=" + size + " n=" + n);
            return mul(mul(factorial[n], inverse[k]), inverse[n - k]);
        }

        // 重複組み合わせ
        // k種類からn個選ぶ場合の数
        int hcomb(int k, int n) {
            return comb(k+n-1, n);
        }

        int group(int n, int g, int k) {
            // C(n, g) * C(n-g, g)... / k!
            // n! / (n-gk)! / g! ^ k / k!
            int ret = factorial[n];             // n!
            ret = mul(ret, inverse[n - g*k]);   // 1 / (n-gk)!
            ret = mul(ret, pow(inverse[g], k)); // 1 / (g! ^ k)
            ret = mul(ret, inverse[k]);         // 1 / k!
            return ret;
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
