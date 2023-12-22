import java.io.*;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.Function;

public class Main {

    static int N, M, K;
    static int[] A;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        K = sc.nextInt();
        A = sc.nextIntArray(N);

        System.out.println(solve());
    }

    static long solve() {
        // iでちょうどK回倒した時の最大値
        long[][] dp = new long[K+1][N];
        for (int i = 0; i < N; i++) {
            dp[1][i] = A[i];
        }

        // スライド最大値
        int[] deq = new int[N];
        SlideMin slide = SlideMin.max(N);
        for (int k = 2; k <= K; k++) {
            slide.reset(dp[k-1], M);
            for (int i = 0; i < N; i++) {
                // debug(Arrays.copyOfRange(deq, s, t));
                if( slide.getIndex() == -1 ) {
                    dp[k][i] = -1;
                } else {
                    dp[k][i] = slide.getvalue() + (long)A[i] * k;
                }

                slide.slide(i);
            }
        }

        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans = Math.max(ans, dp[K][i]);
        }
        return ans;
    }

    public static class SlideMin {

        interface CompareLong {
            boolean lesserThan(long v, long deq);
        }

        static SlideMin min(int n) {
            return new SlideMin(n, (v, deq) -> v < deq);
        }

        static SlideMin max(int n) {
            return new SlideMin(n, (v, deq) -> v > deq);
        }


        private final int[] deq;
        private final CompareLong cmp;
        private int s, t;

        private long[] values;
        private int range;

        public SlideMin(int n, CompareLong cmp) {
            deq = new int[n];
            this.cmp = cmp;
        }

        public void reset(long[] values, int range) {
            this.values = values;
            this.range = range;
            s = 0;
            t = 0;
        }

        public int getIndex() {
            return s == t ? -1 : deq[s];
        }

        public long getvalue() {
            return values[getIndex()];
        }

        public void slide(int i) {
            if( s!=t && (i+1) - deq[s] > range ) {
                s++;
            }

            while(s != t && cmp.lesserThan(values[i], values[deq[t-1]])) {
                t--;
            }
            deq[t++] = i;
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
