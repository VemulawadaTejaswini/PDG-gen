import java.io.*;
import java.util.*;
import java.util.function.Function;

public class Main {

    static int N;
    static Edge[] E;
    static int M;
    static int[] U, V;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        E = new Edge[N-1];
        for (int i = 0; i < N-1; i++) {
            E[i] = new Edge(i, sc.nextInt()-1, sc.nextInt()-1);
        }
        M = sc.nextInt();
        U = new int[M];
        V = new int[M];
        for (int i = 0; i < M; i++) {
            U[i] = sc.nextInt()-1;
            V[i] = sc.nextInt()-1;
        }

        System.out.println(solve());
    }

    static long solve() {
        // 包除を使って求めよって問題に書いておいてほしい
        //   書いてあるだろうという気もするが...

        Edge[][] G = adjB(N, E);

        long[] dp = new long[1 << M];
        for (int i = 0; i < M; i++) {
            dp[1 << i] = getPath(G, U[i], V[i]);
        }

        for (int s = 1; s < 1 << M; s++) {
            if( Integer.bitCount(s) == 1 ) continue;

            Set<Integer> set = new HashSet<>();
            int hi = Integer.highestOneBit(s);
            int other = s - hi;
            dp[s] = dp[hi] | dp[other];
        }

        long[] POW = new long[N+1];
        POW[0] = 1;
        for (int i = 1; i <= N; i++) {
            POW[i] = POW[i-1] * 2;
        }

        long ret = 0;
        for (int s = 1; s < 1 << M; s++) {
            int sign = Integer.bitCount(s)%2 == 1 ? 1 : -1;

            // A\/B = 条件A, Bに属する辺が全部白ならx それ以外はok
            int size = Long.bitCount(dp[s]);
            ret += (POW[N-1] - POW[(N-1)-size]) * sign;
        }

        return ret;
    }

    static long getPath(Edge[][] G, int u, int v) {
        ArrayDeque<Edge> route = new ArrayDeque<>();
        dfs(G, -1, u, v, route);

        long ret = 0;
        for (Edge e : route) {
            ret |= 1L << e.i;
        }
        return ret;
    }

    static boolean dfs(Edge[][] G, int prev, int a, int goal, ArrayDeque<Edge> route) {
        if( a == goal ) return true;

        for (Edge e : G[a]) {
            int b = e.a == a ? e.b : e.a;
            if( b == prev ) continue;
            route.addLast(e);
            boolean ok = dfs(G, a, b, goal, route);
            if( ok ) {
                return true;
            } else {
                route.removeLast();
            }
        }
        return false;
    }

    static Edge[][] adjB(int n, Edge[] E) {
        Edge[][] adj = new Edge[n][];
        int[] cnt = new int[n];
        for (Edge e : E) {
            cnt[e.a]++;
            cnt[e.b]++;
        }
        for (int i = 0; i < n; i++) {
            adj[i] = new Edge[cnt[i]];
        }
        for (Edge e : E) {
            adj[e.a][--cnt[e.a]] = e;
            adj[e.b][--cnt[e.b]] = e;
        }
        return adj;
    }

    static class Edge {
        int i, a, b;

        public Edge(int i, int a, int b) {
            this.i = i;
            this.a = a;
            this.b = b;
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
            else if (arg == null) j.add("null");
            else j.add(arg.toString());
        }
        System.err.println(j.toString());
    }
}
