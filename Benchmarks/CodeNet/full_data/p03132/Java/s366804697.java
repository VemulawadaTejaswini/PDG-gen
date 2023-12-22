import java.io.*;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.Function;

public class Main {

    static int N;
    static int[] A;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        A = sc.nextIntArray(N);

        System.out.println(solve());
    }

    static long solve() {
        long[] C = new long[N+1];
        for (int i = 0; i < N; i++) {
            C[i+1] = A[i] + C[i];
        }
        // iから初めて右に行くコスト
        long[] RGO = new long[N+1];
        for (int i = N-1; i >= 0; i--) {
            int cost;
            if( A[i] == 0 ) {
                cost = 1;
            } else {
                cost = A[i]%2 == 1 ? 0 : 1;
            }
            RGO[i] = Math.min(RGO[i+1] + cost, C[N] - C[i]);
        }
        // iから初めて右にいって帰ってくるコスト
        long[] RRET = new long[N+1];
        for (int i = N-1; i >= 0; i--) {
            int cost;
            if( A[i] == 0 ) {
                cost = 2;
            } else {
                cost = A[i]%2 == 0 ? 0 : 1;
            }

            RRET[i] = Math.min(RRET[i+1] + cost, C[N] - C[i]);
        }
        // debug(RGO, RRET);

        long[] LGO = new long[N+1];
        for (int i = 1; i <= N; i++) {
            int cost;
            if( A[i-1] == 0 ) {
                cost = 1;
            } else {
                cost = A[i-1]%2 == 1 ? 0 : 1;
            }
            LGO[i] = Math.min(LGO[i-1] + cost, C[i]);
        }
        long[] LRET = new long[N+1];
        for (int i = 1; i <= N; i++) {
            int cost;
            if( A[i-1] == 0 ) {
                cost = 2;
            } else {
                cost = A[i-1]%2 == 0 ? 0 : 1;
            }
            LRET[i] = Math.min(LRET[i-1] + cost, C[i]);
        }
        // debug(LGO, LRET);

        long ans = Long.MAX_VALUE;
        for (int i = 0; i <= N; i++) {
            ans = Math.min(ans, RRET[i] + LGO[i]);
            ans = Math.min(ans, LRET[i] + RGO[i]);
        }
        return ans;
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
