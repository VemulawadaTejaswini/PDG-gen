import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N;
    static Cord[] C;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        C = new Cord[N];
        for (int i = 0; i < N; i++) {
            C[i] = new Cord(i, sc.nextInt(), sc.nextInt());
        }
        System.out.println( solve() );
    }

    static class Cord {
        int n;
        int x;
        int y;

        public Cord(int n, int x, int y) {
            this.n = n;
            this.x = x;
            this.y = y;
        }
    }

    private static long solve() {
        UnionFind uf = new UnionFind(N);

        Arrays.sort(C, Comparator.comparingInt(c -> c.x));
        Dist[] X = new Dist[N-1];
        for (int i = 0; i < N - 1; i++) {
            int j = i+1;
            X[i] = new Dist(C[i], C[j], (C[j].x - C[i].x) );
        }
        Arrays.sort(X, Comparator.comparingInt(d -> d.d));

        Arrays.sort(C, Comparator.comparingInt(c -> c.y));
        Dist[] Y = new Dist[N-1];
        for (int i = 0; i < N - 1; i++) {
            int j = i+1;
            Y[i] = new Dist(C[i], C[j], (C[j].y - C[i].y) );
        }
        Arrays.sort(Y, Comparator.comparingInt(d -> d.d));

        long total = 0;
        int xi = 0;
        int yi = 0;
        f: for (int i = 0; i < N-1; i++) {
            if( uf.isAllUnite() ) {
                break;
            }

            w: while(true) {
                Dist x = X[xi];
                Dist y = Y[yi];
                if( x.d < y.d ) {
                    boolean u = uf.unite(x.from.n, x.to.n);
                    if( u ) {
                        total += x.d;
                        continue f;
                    } else {
                        xi++;
                        continue w;
                    }

                } else {
                    boolean u = uf.unite(y.from.n, y.to.n);
                    if( u ) {
                        total += y.d;
                        continue f;
                    } else {
                        yi++;
                        continue w;
                    }
                }
            }
        }
        return total;
    }

    static class Dist {
        private Cord from;
        private Cord to;
        private int d;

        public Dist(Cord from, Cord to, int d) {
            this.from = from;
            this.to = to;
            this.d = d;
        }
    }

    static class UnionFind {

        private final int[] parent;
        private final int[] rank;

        public UnionFind(int n) {
            parent = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                rank[i] = 0;
            }
        }

        public boolean isAllUnite() {
            int root = root(0);
            for (int i = 1; i < N; i++) {
                if( root != root(i) ) return false;
            }
            return true;
        }

        public int root(int i) {
            if( parent[i] == i ) {
                return i;
            } else {
                return parent[i] = root(parent[i]);
            }
        }

        public boolean unite(int i, int j) {
            int ri = root(i);
            int rj = root(j);
            if( ri == rj ) return false;

            if( rank[ri] < rank[rj] ) {
                parent[ri] = rj;

            } else {
                parent[rj] = ri;
                if( rank[ri] == rank[rj] ) {
                    rank[ri]++;
                }
            }
            return true;
        }

        public boolean isSame(int a, int b) {
            return root(a) == root(b);
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

        double nextDouble() {
            return Double.parseDouble(next());
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
