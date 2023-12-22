import java.io.*;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;

public class Main {

    static int N;
    static long K;
    static int[][] A;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        K = sc.nextLong();
        A = new int[N][];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextIntArray(N);
        }

        System.out.println(solve());
    }

    static int MOD = 1_000_000_007;

    static int solve() {
        IntMat mat = IntMat.pow(new IntMat(A), K, Main::mul, Main::add);

        IntMat in = new IntMat(1, N);
        for (int i = 0; i < N; i++) {
            in.set(0, i, 1);
        }

        IntMat out = IntMat.dot(in, mat, Main::mul, Main::add);

        int ans = 0;
        for (int i = 0; i < N; i++) {
            ans = add(out.get(0, i), ans);
        }
        return ans;
    }

    static int mul(int a, int b) {
        return (int)((long)a * b % MOD);
    }

    static int add(int a, int b) {
        long c = (long)a + b;
        return (int)(c % MOD);
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

        static IntMat pow(IntMat m, long k, IntBinaryOperator mul, IntBinaryOperator add) {
            IntMat ret = new IntMat(m.row(), m.col());
            for (int i = 0; i < N; i++) {
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
