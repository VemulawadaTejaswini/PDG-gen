import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N;
    static int K;
    static Edge[] E;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        E = new Edge[N-1];
        for (int i = 0; i < N-1; i++) {
            E[i] = new Edge(sc.nextInt() - 1, sc.nextInt() - 1);
        }

        System.out.println(solve());
    }

    static int solve() {
        List<Edge>[] G = new List[N];
        for (int i = 0; i < N; i++) {
            G[i] = new ArrayList<>();
        }
        for (Edge e : E) {
            G[e.x].add(e);
            G[e.y].add(e);
        }

        Result r = diameter(N, G, 0);

        int ans = 0;
        while( r.d > K ) {
            // 両端のよりコストの少なくなりそうなほうを削る
            int ca = countSiblings(r.a, G);
            int cb = countSiblings(r.b, G);

            if( ca > cb ) {
                asRemoved(r.b, G);
                ans++;
                r = diameter(N, G, r.a);
            } else {
                asRemoved(r.a, G);
                ans++;
                r = diameter(N, G, r.b);
            }
        }
        return ans;
    }

    static void asRemoved(int a, List<Edge>[] G) {
        for (Edge e : G[a]) {
            e.removed = true;
        }
    }

    static int countSiblings(int a, List<Edge>[] G) {
        int pa = -1;
        for (Edge e : G[a]) {
            if( !e.removed ) {
                pa = e.opposite(a);
                break;
            }
        }

        int cnt = 0;
        for (Edge e : G[pa]) {
            if( !e.removed ) {
                cnt ++;
            }
        }
        return cnt;
    }

    static class Edge {
        int x;
        int y;
        boolean removed;

        public Edge(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int opposite(int a) {
            return a == x ? y : x;
        }
    }

    static Result diameter(int N, List<Edge>[] G, int s) {
        Result u = maxDistance(s, N, G);
        return maxDistance(u.b, N, G);
    }

    static Result maxDistance(int a, int N, List<Edge>[] G) {
        ArrayDeque<State> q = new ArrayDeque<>();
        int[] dist = new int[N];
        Arrays.fill(dist, -1);
        dist[a] = 0;
        q.add(new State(a, 0));
        while(!q.isEmpty()) {
            State s = q.poll();
            if( dist[s.a] != s.d ) continue;

            for (Edge e : G[s.a]) {
                if( e.removed ) continue;

                int b = e.opposite(s.a);
                if( dist[b] == -1 ) {
                    q.add( new State(b, s.d+1) );
                    dist[b] = s.d + 1;
                }
            }
        }

        int v = -1;
        int maxd = -1;
        for (int i = 0; i < N; i++) {
            if( dist[i] > maxd ) {
                v = i;
                maxd = dist[i];
            }
        }
        return new Result(a, v, maxd);
    }

    static class State {
        int a;
        int d;

        public State(int a, int d) {
            this.a = a;
            this.d = d;
        }
    }

    static class Result {
        int a;
        int b;
        int d;

        public Result(int a, int b, int d) {
            this.a = a;
            this.b = b;
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

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}
