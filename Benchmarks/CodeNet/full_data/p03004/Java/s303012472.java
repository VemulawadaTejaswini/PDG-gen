import java.io.*;
import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;

public class Main {

    static int N;
    static Cord[] C;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        C = new Cord[N];
        for (int i = 0; i < N; i++) {
            C[i] = new Cord(sc.nextInt()*2, sc.nextInt()*2, sc.next().charAt(0));
        }

        // jikken();

        System.out.println(BigDecimal.valueOf(solve()).toPlainString());
    }

    static void jikken() {
        for (int a = 0; a <= 100; a++) {
            double d = a * 0.25;

            double minW = calcX(C[0], d);
            double minH = calcY(C[0], d);
            double maxW = minW;
            double maxH = minH;
            for (int i = 1; i < N; i++) {
                double w = calcX(C[i], d);
                double h = calcY(C[i], d);
                minH = Math.min(minH, h);
                minW = Math.min(minW, w);
                maxH = Math.max(maxH, h);
                maxW = Math.max(maxW, w);
            }

            debug();
            debug("h", (maxH - minH));
            debug("w", (maxW - minW));
            debug(d, (maxH - minH) * (maxW - minW) / 4);
        }
    }

    static double solve(int n, int[] x, int[] y, char[] d) {
        N = n;
        C = new Cord[N];
        for (int i = 0; i < N; i++) {
            C[i] = new Cord(x[i]*2, y[i]*2, d[i]);
        }
        return solve();
    }

    static double solve() {
        int wmx1 = findMaximum(Main::calcX, Math::max, (m0, m1) -> m0 > m1);
        int wmx2 = findMinimum(Main::calcX, Math::max, (m0, m1) -> m0 < m1);
        int wmn1 = findMaximum(Main::calcX, Math::min, (m0, m1) -> m0 < m1);
        int wmn2 = findMinimum(Main::calcX, Math::min, (m0, m1) -> m0 > m1);
        int hmx1 = findMaximum(Main::calcY, Math::max, (m0, m1) -> m0 > m1);
        int hmx2 = findMinimum(Main::calcY, Math::max, (m0, m1) -> m0 < m1);
        int hmn1 = findMaximum(Main::calcY, Math::min, (m0, m1) -> m0 < m1);
        int hmn2 = findMinimum(Main::calcY, Math::min, (m0, m1) -> m0 > m1);

        // debug(wmx1, wmx2, wmn1, wmn2, hmx1, hmx2, hmn1, hmn2);
        Set<Integer> set = new HashSet<>(Arrays.asList(0, wmx1, wmx2, wmn1, wmn2, hmx1, hmx2, hmn1, hmn2));
        set.remove(-1);
        set.remove(1_000_000_000);
        // debug(set);

        long ans = Long.MAX_VALUE;
        for (int a : set) {
            int minW = calcX(C[0], a);
            int minH = calcY(C[0], a);
            int maxW = minW;
            int maxH = minH;
            for (int i = 1; i < N; i++) {
                int w = calcX(C[i], a);
                int h = calcY(C[i], a);
                minW = Math.min(minW, w);
                minH = Math.min(minH, h);
                maxW = Math.max(maxW, w);
                maxH = Math.max(maxH, h);
            }

            ans = Math.min(ans, (long)(maxH - minH) * (maxW - minW));
        }
        return (double)ans/4;
    }

    interface CalcDist {
        int calc(Cord c, int a);
    }

    interface BiIntPredicate {
        boolean test(int m0, int m1);
    }

    static int findMaximum(CalcDist calcDist, IntBinaryOperator minMax, BiIntPredicate p) {
        return maximize(0, 1_000_000_000, a -> {
            int m0 = calcDist.calc(C[0], a-1);
            int m1 = calcDist.calc(C[0], a);
            for (int i = 1; i < N; i++) {
                m0 = minMax.applyAsInt(m0, calcDist.calc(C[i], a-1));
                m1 = minMax.applyAsInt(m1, calcDist.calc(C[i], a));
            }

            return p.test(m0, m1);
        });
    }

    static int findMinimum(CalcDist calcDist, IntBinaryOperator minMax, BiIntPredicate p) {
        return minimize(0, 1_000_000_000, a -> {
            int m0 = calcDist.calc(C[0], a);
            int m1 = calcDist.calc(C[0], a+1);
            for (int i = 1; i < N; i++) {
                m0 = minMax.applyAsInt(m0, calcDist.calc(C[i], a));
                m1 = minMax.applyAsInt(m1, calcDist.calc(C[i], a+1));
            }

            return p.test(m0, m1);
        });
    }

    static int calcY(Cord c, int a) {
        if( c.d == 'U' ) {
            return c.y + a;
        } else if( c.d == 'D' ) {
            return c.y - a;
        } else {
            return c.y;
        }
    }

    static double calcY(Cord c, double a) {
        if( c.d == 'U' ) {
            return c.y + a;
        } else if( c.d == 'D' ) {
            return c.y - a;
        } else {
            return c.y;
        }
    }

    static int calcX(Cord c, int a) {
        if( c.d == 'L' ) {
            return c.x - a;
        } else if( c.d == 'R' ) {
            return c.x + a;
        } else {
            return c.x;
        }
    }

    static double calcX(Cord c, double a) {
        if( c.d == 'L' ) {
            return c.x - a;
        } else if( c.d == 'R' ) {
            return c.x + a;
        } else {
            return c.x;
        }
    }

    static int maximize(int lo, int hi, IntPredicate p) {
        while(lo < hi) {
            int x = ((hi - lo) >>> 1) + lo;
            if( p.test(x) ) {
                lo = x + 1;
            } else {
                hi = x;
            }
        }
        return lo - 1;
    }

    static int minimize(int lo, int hi, IntPredicate p) {
        while(lo < hi) {
            int x = ((hi - lo) >>> 1) + lo;
            if( p.test(x) ) {
                hi = x;
            } else {
                lo = x + 1;
            }
        }
        return lo;
    }

    static class Cord {
        int x, y;
        char d;

        public Cord(int x, int y, char d) {
            this.x = x;
            this.y = y;
            this.d = d;
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
