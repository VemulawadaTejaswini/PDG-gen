import java.io.*;
import java.util.*;

public class Main {

    static int N, M, L;
    static int[] A, B, C;
    static int Q;
    static int[] S, T;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        L = sc.nextInt();
        A = new int[M];
        B = new int[M];
        C = new int[M];
        for (int i = 0; i < M; i++) {
            A[i] = sc.nextInt()-1;
            B[i] = sc.nextInt()-1;
            C[i] = sc.nextInt();
        }
        Q = sc.nextInt();
        S = new int[Q];
        T = new int[Q];
        for (int i = 0; i < Q; i++) {
            S[i] = sc.nextInt()-1;
            T[i] = sc.nextInt()-1;
        }

        PrintWriter pw = new PrintWriter(System.out);
        solve(pw);
        pw.flush();
    }

    static void solve(PrintWriter pw) {
        long[][] W = wf(N, A, B, C, false);
        int[][] G = oneStepGrapth(W);

        int[][] dists = new int[N][];
        for (int i = 0; i < N; i++) {
            dists[i] = dist(N, G, i);
        }

        for (int i = 0; i < Q; i++) {
            int d = dists[S[i]][T[i]];
            if( d == -1 ) {
                pw.println(-1);
            } else {
                pw.println(d-1);
            }
        }
    }

    private static final long INF = Long.MAX_VALUE;

    static long[][] wf(int N, int[] A, int[] B, int[] C, boolean directed) {
        long[][] dist = new long[N][N];
        for (long[] arr : dist) Arrays.fill(arr, INF);
        for (int i = 0; i < N; i++) dist[i][i] = 0;

        for (int i = 0; i < A.length; i++) {
            dist[A[i]][B[i]] = C[i];
            if( !directed ) {
                dist[B[i]][A[i]] = C[i];
            }
        }

        for (int k = 0; k < N; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if( dist[i][k] == INF || dist[k][j] == INF ) continue;

                    if( dist[i][k] + dist[k][j] < dist[i][j] ) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        return dist;
    }

    static int[][] oneStepGrapth(long[][] W) {
        int[][] G = new int[N][];
        for (int i = 0; i < N; i++) {

            int cnt = 0;
            for (int j = 0; j < N; j++) {
                if( i == j ) continue;
                if( W[i][j] <= L ) cnt++;
            }
            int[] adj = new int[cnt];
            int idx = 0;
            for (int j = 0; j < N; j++) {
                if( i == j ) continue;
                if( W[i][j] <= L ) adj[idx++] = j;
            }
            G[i] = adj;
        }
        return G;
    }

    static class State {
        int a;
        int fuel;

        public State(int a, int fuel) {
            this.a = a;
            this.fuel = fuel;
        }
    }

    static int[] dist(int N, int[][] G, int start) {
        int[] dist = new int[N];
        Arrays.fill(dist, -1);
        dist[start] = 0;

        int[] q = new int[N];
        int u = 0, v = 0;
        q[v++] = start;
        while( u != v ) {
            int a = q[u++];
            for (int b : G[a]) {
                if( dist[b] == -1 ) {
                    dist[b] = dist[a]+1;
                    q[v++] = b;
                }
            }
        }
        return dist;
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
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        int[] nextIntArray(int n, int delta) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt() + delta;
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = nextLong();
            return a;
        }
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

    static void writeSingleLine(int[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int i = 0; i < as.length; i++) {
            if (i != 0) pw.print(" ");
            pw.print(as[i]);
        }
        pw.println();
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
            if (arg == null) j.add("null");
            else if (arg instanceof int[]) j.add(Arrays.toString((int[]) arg));
            else if (arg instanceof long[]) j.add(Arrays.toString((long[]) arg));
            else if (arg instanceof double[]) j.add(Arrays.toString((double[]) arg));
            else if (arg instanceof Object[]) j.add(Arrays.toString((Object[]) arg));
            else j.add(arg.toString());
        }
        System.err.println(j.toString());
    }

    static void printSingleLine(int[] array) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int i = 0; i < array.length; i++) {
            if (i != 0) pw.print(" ");
            pw.print(array[i]);
        }
        pw.println();
        pw.flush();
    }

    static int lowerBound(int[] array, int value) {
        int lo = 0, hi = array.length, mid;
        while (lo < hi) {
            mid = (hi + lo) / 2;
            if (array[mid] < value) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }

    static int upperBound(int[] array, int value) {
        int lo = 0, hi = array.length, mid;
        while (lo < hi) {
            mid = (hi + lo) / 2;
            if (array[mid] <= value) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }
}
