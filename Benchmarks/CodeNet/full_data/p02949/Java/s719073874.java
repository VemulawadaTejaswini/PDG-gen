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
            C[i] *= -1;
        }

        long[] distance = new long[N];
        for (int i = 0; i < N; i++) {
            distance[i] = Long.MAX_VALUE;
        }
        distance[0] = 0;
        for (int i = 0; i < N-1; i++) {

            for (int j = 0; j < M; j++) {
                int a = A[j];
                int b = B[j];
                int c = C[j];

                if( distance[a] != Long.MAX_VALUE && distance[b] > distance[a] + c + P) {
                    distance[b] = distance[a] + c + P;
                }
            }
        }
        long ans = distance[N-1];

        // もうN回し、閉路の影響が出口に出るようだとダメな閉路が存在するということになる
        for (int i = 0; i < N; i++) {

            for (int j = 0; j < M; j++) {
                int a = A[j];
                int b = B[j];
                int c = C[j];

                if( distance[a] != Long.MAX_VALUE && distance[b] > distance[a] + c + P) {
                    distance[b] = distance[a] + c + P;
                }
            }
        }
        if( distance[N-1] < ans ) {
            return -1;
        } else {
            return Math.max(0, ans * -1);
        }
    }



    static Edge[][] adjD(int n, List<Edge> es) {
        Edge[][] adj = new Edge[n][];
        int[] cnt = new int[n];

        for (Edge e : es) {
            cnt[e.a]++;
        }
        for (int i = 0; i < n; i++) {
            adj[i] = new Edge[cnt[i]];
        }
        for (Edge e : es) {
            adj[e.a][--cnt[e.a]] = e;
        }
        return adj;
    }

    static class PosLoopDetectException extends RuntimeException {

    }

    static long INF = Long.MIN_VALUE / 2;
    static long EMP = INF+1;

    static long dfs(int a, long[] dp, Edge[][] G, long gain) {
        // debug(a, gain);
        if( a == N-1 ) {
            return gain;
        }

        if( dp[a] == EMP ) {
            dp[a] = gain;

            long ret = INF;
            for (Edge e : G[a]) {
                int b = e.a == a ? e.b : e.a;

                long result = dfs(b, dp, G, gain + e.c - P);
                if( result == INF ) continue;

                ret = Math.max(ret, result);
            }
            dp[a] = EMP;
            return ret;

        } else {
            // 二回目
            if( gain > dp[a] ) {
                throw new PosLoopDetectException();
            } else {
                return INF; // neg loop
            }
        }
    }

    static class Edge {
        int a, b, c;

        public Edge(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    static int[][] adjD(int n, int[] from, int[] to) {
        int[][] adj = new int[n][];
        int[] cnt = new int[n];
        for (int f : from) {
            cnt[f]++;
        }
        for (int i = 0; i < n; i++) {
            adj[i] = new int[cnt[i]];
        }
        for (int i = 0; i < from.length; i++) {
            adj[from[i]][--cnt[from[i]]] = to[i];
        }
        return adj;
    }

    static class SCC {

        int N;
        int[][] G, F;

        boolean[] visited;
        List<Integer> rev;
        int[] nodeId;

        void run(int[][] G, int[][] F) {
            this.N = G.length;
            this.G = G;
            this.F = F;

            visited = new boolean[N];
            rev = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                if( !visited[i] ) {
                    dfs(i);
                }
            }

            int id = 0;
            nodeId = new int[N];
            Arrays.fill(visited, false);

            for (int i = rev.size()-1; i >= 0; i--) {
                if( !visited[rev.get(i)] ) {
                    rdfs(rev.get(i), id);
                    id++;
                }
            }
        }

        void dfs(int a) {
            visited[a] = true;
            for (int b : G[a]) {
                if( !visited[b] ) {
                    dfs(b);
                }
            }
            rev.add(a);
        }

        void rdfs(int a, int id) {
            visited[a] = true;
            nodeId[a] = id;
            for (int b : F[a]) {
                if( !visited[b] ) {
                    rdfs(b, id);
                }
            }
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
