import java.io.*;
import java.util.*;
import java.util.function.Function;

public class Main {

    static int N, Q;
    static Edge[] E;
    static int[] X, Y, U, V;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        Q = sc.nextInt();
        E = new Edge[N-1];
        for (int i = 0; i < N - 1; i++) {
            E[i] = new Edge(sc.nextInt()-1, sc.nextInt()-1, sc.nextInt()-1, sc.nextInt());
        }
        X = new int[Q];
        Y = new int[Q];
        U = new int[Q];
        V = new int[Q];

        for (int i = 0; i < Q; i++) {
            X[i] = sc.nextInt()-1;
            Y[i] = sc.nextInt();
            U[i] = sc.nextInt()-1;
            V[i] = sc.nextInt()-1;
        }

        writeLines(solve());
    }

    static int[] solve() {
        int[] A = new int[N-1];
        int[] B = new int[N-1];
        for (int i = 0; i < N - 1; i++) {
            A[i] = E[i].a;
            B[i] = E[i].b;
        }
        int[][] G = adjB(N, A, B);
        Edge[][] EG = adjB_E(N, E);

        LCA lca = new LCA(N);
        lca.init(0, G);

        int[] dists = new int[N];
        Map<Integer, Integer>[] colorNums = new Map[N];
        Map<Integer, Integer>[] colorDists = new Map[N];

        for (Node node : order(N, G, 0, true)) {
            if( node.parent == -1 ) {
                colorNums[0] = new HashMap<>();
                colorDists[0] = new HashMap<>();
                continue;
            }

            int dist = 0;
            Map<Integer, Integer> cn = new HashMap<>();
            Map<Integer, Integer> cd = new HashMap<>();

            for (Edge e : EG[node.a]) {
                int b = e.a == node.a ? e.b : e.a;
                if( b != node.parent ) continue;

                add(cn, e.c, 1);
                add(cd, e.c, e.d);
                dist += e.d;

                cn = merge(cn, colorNums[b]);
                cd = merge(cd, colorDists[b]);
                dist += dists[b];
            }
            colorNums[node.a] = cn;
            colorDists[node.a] = cd;
            dists[node.a] = dist;
        }

        int[] ans = new int[Q];
        for (int i = 0; i < Q; i++) {
            int x = X[i];
            int y = Y[i];
            int u = U[i];
            int v = V[i];

            int s = lca.apply(u, v);

            int uvDist = dists[u] + dists[v] - dists[s] * 2;
            int uvColorNum = colorNums[u].getOrDefault(x, 0) + colorNums[v].getOrDefault(x, 0) - colorNums[s].getOrDefault(x, 0)*2;
            int uvColorDist = colorDists[u].getOrDefault(x, 0) + colorDists[v].getOrDefault(x, 0) - colorDists[s].getOrDefault(x, 0)*2;

            ans[i] = uvDist - uvColorDist + y * uvColorNum;
        }
        return ans;
    }

    static Map<Integer, Integer> merge(Map<Integer, Integer> m1, Map<Integer, Integer> m2) {
        if( m1.size() < m2.size() ) {
            Map<Integer, Integer> t = m1;
            m1 = m2;
            m2 = t;
        }

        for (Map.Entry<Integer, Integer> each : m2.entrySet()) {
            int key2 = each.getKey();
            int value2 = each.getValue();

            add(m1, key2, value2);
        }

        return m1;
    }

    static void add(Map<Integer, Integer> map, int key, int add) {
        map.merge(key, add, (a, b) -> a + b);
    }

    static Edge[][] adjB_E(int n, Edge[] E) {
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

    static int[][] adjB(int n, int[] from, int[] to) {
        int[][] adj = new int[n][];
        int[] cnt = new int[n];
        for (int f : from) {
            cnt[f]++;
        }
        for (int t : to) {
            cnt[t]++;
        }
        for (int i = 0; i < n; i++) {
            adj[i] = new int[cnt[i]];
        }
        for (int i = 0; i < from.length; i++) {
            adj[from[i]][--cnt[from[i]]] = to[i];
            adj[to[i]][--cnt[to[i]]] = from[i];
        }
        return adj;
    }

    static class Node {
        int parent, a;

        public Node(int parent, int a) {
            this.parent = parent;
            this.a = a;
        }
    }

    static Node[] order(int N, int[][] G, int root, boolean fromRoot) {
        Node[] q = new Node[N];
        int u = 0, v = 0;
        Node[] ret = new Node[N];
        int idx = fromRoot ? 0 : N-1;
        int d = fromRoot ? 1 : -1;
        q[v++] = new Node(-1, root);
        while( u != v ) {
            Node n = q[u++];
            ret[idx] = n;
            idx += d;
            for (int b : G[n.a]) {
                if( b == n.parent ) continue;

                q[v++] = new Node(n.a, b);
            }
        }
        return ret;
    }

    static class Edge {
        int a, b, c, d;

        public Edge(int a, int b, int c, int d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
    }

    static class LCA {

        final int V;
        final int LOG_V;
        final int[][] parent;
        final int[] depth;

        public LCA(int V) {
            this.V = V;
            this.LOG_V = Integer.numberOfTrailingZeros(Integer.highestOneBit(V - 1)) + 1;
            this.parent = new int[LOG_V][V];
            this.depth = new int[V];
        }

        // root一つ用
        // 森な場合は initTree*N -> initDoubling と呼ぶ
        void init(int root, int[][] G) {
            initTree(root, G);
            initDoubling();
        }

        void initDoubling() {
            for (int k = 0; k+1 < LOG_V; k++) {
                for (int v = 0; v < V; v++) {
                    if( parent[k][v] < 0 ) {
                        parent[k+1][v] = -1;
                    } else {
                        parent[k+1][v] = parent[k][parent[k][v]];
                    }
                }
            }
        }

        void initTree(int root, int[][] G) {
            ArrayDeque<State> q = new ArrayDeque<>();
            q.add( new State(root, -1, 0) );

            while(!q.isEmpty()) {
                State state = q.poll();

                parent[0][state.v] = state.p;
                depth[state.v] = state.d;

                for (int i = 0; i < G[state.v].length; i++) {
                    if( G[state.v][i] != state.p ) {
                        q.add(new State(G[state.v][i], state.v, state.d+1));
                    }
                }
            }
        }

        static class State {
            int v, p, d;

            public State(int v, int p, int d) {
                this.v = v;
                this.p = p;
                this.d = d;
            }
        }

        int apply(int u, int v) {
            if( depth[u] > depth[v] ) {
                int t = u; u = v; v = t;
            }

            for (int k = 0; k < LOG_V; k++) {
                if(((depth[v] - depth[u]) >> k & 1) == 1) {
                    v = parent[k][v];
                }
            }
            if( u == v ) return u;

            for (int k = LOG_V-1; k >= 0; k--) {
                if( parent[k][u] != parent[k][v] ) {
                    u = parent[k][u];
                    v = parent[k][v];
                }
            }
            return parent[0][u];
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
