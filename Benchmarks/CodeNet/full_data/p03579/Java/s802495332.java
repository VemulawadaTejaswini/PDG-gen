import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N;
    static int M;
    static Edge[] E;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        E = new Edge[M];
        for (int i = 0; i < M; i++) {
            E[i] = new Edge(sc.nextInt()-1, sc.nextInt()-1);
        }

        System.out.println( solve() );
    }

    static long solve() {
        C = new int[N];
        if( isPartite(N, E) ) {
            int a = 0;
            int b = 0;
            for (int i = 0; i < N; i++) {
                if( C[i] == 1 ) a++;
                else b++;
            }
            return ((long)a * b) - M;

        } else {
            return ((long)N * (N-1) / 2) - M;
        }
    }

    static List<Edge>[] mkRin(int V, Edge[] E) {
        List<Edge>[] rin = new List[V];
        for (Edge e : E) {
            if( rin[e.a] == null ) rin[e.a] = new ArrayList<>();
            if( rin[e.b] == null ) rin[e.b] = new ArrayList<>();
            rin[e.a].add(e);
            rin[e.b].add(e);
        }
        return rin;
    }

    static int[] C;

    static boolean isPartite(int V, Edge[] E) {
        List<Edge>[] rin = mkRin(V, E);

        for (int v = 0; v < V; v++) {
            if( C[v] == 0 ) {
                if( !_isPartite(v, 1, rin) ) {
                    return false;
                }
            }
        }
        return true;
    }

    @SuppressWarnings("BooleanMethodIsAlwaysInverted")
    static boolean _isPartite(int v, int c, List<Edge>[] rin) {
        C[v] = c;

        for (Edge e : rin[v]) {
            int to = e.a == v ? e.b : e.a;

            if( C[to] == c ) {
                return false;
            }
            if( C[to] == 0 && !_isPartite(to, -c, rin) ) {
                return false;
            }
        }
        return true;
    }

    static class Edge {
        int a;
        int b;

        public Edge(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

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
