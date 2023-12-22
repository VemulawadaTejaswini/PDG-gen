import java.io.*;
import java.util.*;
import java.util.function.Function;

public class Main {

    static int N, M, P;
    static int[] A, B, C;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        P = sc.nextInt();
        A = new int[M];
        B = new int[M];
        C = new int[M];
        for (int i = 0; i < M; i++) {
            A[i] = sc.nextInt()-1;
            B[i] = sc.nextInt()-1;
            C[i] = sc.nextInt();
        }

        System.out.println(solve());
    }

    static long solve() {
        for (int i = 0; i < M; i++) {
            C[i] -= P;
        }

        long INF = Long.MAX_VALUE/2;
        long EMP = Long.MIN_VALUE/2;

        long[] dist = new long[N];
        for (int i = 0; i < N; i++) {
            dist[i] = EMP;
        }
        dist[0] = 0;
        for (int time = 0; time < N; time++) {
            for (int i = 0; i < M; i++) {
                int a = A[i];
                int b = B[i];
                int c = C[i];

                if( dist[a] != EMP && dist[b] < dist[a] + c) {
                    dist[b] = dist[a] + c;
                }
            }
        }
        long ans = dist[N-1];

        // もう一周して駄目な閉路を探す
        for (int time = 0; time < N; time++) {
            for (int i = 0; i < M; i++) {
                int a = A[i];
                int b = B[i];
                int c = C[i];

                // 二週目に増えるのはおかしい
                if( dist[a] != EMP && dist[b] < dist[a] + c) {
                    dist[b] = INF;
                }
            }
        }

        if( dist[N-1] == INF ) {
            return -1;
        } else {
            return Math.max(0, ans);
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
