import java.io.*;
import java.util.*;
import java.util.function.Function;

public class Main {

    static int N, M;
    static int[] A, B;
    static int S, T;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        A = new int[M];
        B = new int[M];
        for (int i = 0; i < M; i++) {
            A[i] = sc.nextInt()-1;
            B[i] = sc.nextInt()-1;
        }
        S = sc.nextInt()-1;
        T = sc.nextInt()-1;

        System.out.println(solve());
    }

    static int solve() {
        int[][] G = adjD(N, A, B);

        ArrayDeque<State> q = new ArrayDeque<>();
        int[][] dist = new int[N][6];
        for (int[] row : dist) {
            Arrays.fill(row, 1_000_000_000);
        }
        q.addLast( new State(S, 0, 0) );
        dist[0][0] = 0;
        while( !q.isEmpty() ) {
            State s = q.poll();
            // if( dist[s.a][s.r] != s.d ) continue;
            // debug(s.a, s.d, s.r);
            for (int b : G[s.a]) {
                int nd = s.d + 1;
                int nr = (s.r + 1) % 6;
                if( dist[b][nr] > nd ) {
                    dist[b][nr] = nd;
                    q.addLast(new State(b, nr, nd));
                }
            }
        }

        if( dist[T][0] == 1_000_000_000 && dist[T][3] == 1_000_000_000 ) {
            return -1;
        } else {
            return Math.min(dist[T][0] / 3, dist[T][3] / 3);
        }
    }

    static class State {
        int a, r, d;

        public State(int a, int r, int d) {
            this.a = a;
            this.r = r;
            this.d = d;
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
