import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static int N;
    private static int[] A;
    private static int[] B;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);

        N = sc.nextInt();
        A = new int[N];
        B = new int[N];
        for (int i = 0; i < N-1; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }
        System.out.println(solve());
    }

    private static String solve() {
        Rin r = mkRin();
        Path path = findPath(1, N, r);

        List<Integer> nodes = path.nodes;

        boolean fene = true;
        while(nodes.size() > 2) {
            if( fene ) {
                nodes.remove(0);
                fene = false;
            } else {
                nodes.remove(nodes.size() - 1);
                fene = true;
            }
        }

        int cut1 = nodes.get(0);
        int cut2 = nodes.get(1);

        UnionFind uf = new UnionFind(N);
        for (int i = 0; i < N-1; i++) {
            int a = A[i];
            int b = B[i];

            if( cut1 == a && cut2 == b || cut1 == b && cut2 == a ) {
                continue;
            }

            uf.unite(a-1, b-1);
        }

        int fRoot = uf.root(0);
        int f = 0;
        for (int i = 0; i < N; i++) {
            if( uf.root(i) == fRoot ) {
                f++;
            }
        }

        int s = N - f;

        if( f > s ) {
            return "Fennec";
        } else {
            return "Snuke";
        }
    }

    private static Path findPath(int from, int to, Rin r) {
        boolean[] used = new boolean[N];
        Queue<Path> q = new ArrayDeque<>();
        q.add(Path.single(from));
        while(!q.isEmpty()) {
            Path path = q.poll();

            for (int n : r.get(path.last())) {
                if( n == to ) {
                    return path.add(n);
                } else if( !used[n] ){
                    q.add( path.add(n) );
                    used[n] = true;
                }
            }
        }
        throw new RuntimeException("wtf");
    }

    private static Rin mkRin() {
        Rin r = new Rin(N);
        for (int i = 0; i < N-1; i++) {
            r.set(A[i], B[i]);
        }
        return r;
    }

    // 隣接リスト
    private static class Rin {

        private final List[] array;

        public Rin(int n) {
            array = new List[n];
        }

        public void set(int a, int b) {
            get(a).add(b);
            get(b).add(a);
        }

        public List<Integer> get(int n) {
            if( array[n - 1] == null ) {
                array[n - 1] = new ArrayList();
            }
            //noinspection unchecked
            return (List<Integer>)array[n - 1];
        }
    }

    public static class Path {

        public static Path single(int n) {
            return new Path(Collections.singletonList(n));
        }

        private final List<Integer> nodes;

        public Path(List<Integer> nodes) {
            this.nodes = nodes;
        }

        public Path add(int n) {
            List<Integer> list = new ArrayList<>(nodes.size() + 1);
            list.addAll(nodes);
            list.add(n);
            return new Path(list);
        }

        public int last() {
            return nodes.get(nodes.size() - 1);
        }
    }

    static class UnionFind {

        private int[] parent;
        private int[] rank;

        public UnionFind(int n) {
            parent = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                rank[i] = 0;
            }
        }

        int root(int n) {
            if( parent[n] == n ) {
                return n;
            } else {
                parent[n] = root(parent[n]);
                return parent[n];
            }
        }

        void unite(int x, int y) {
            x = root(x);
            y = root(y);
            if( x == y ) return;

            if( rank[x] < rank[y] ) {
                parent[x] = y;
            } else {
                parent[y] = x;
                if( rank[x] == rank[y]) rank[x]++;
            }
        }
    }

    static class FastScanner {

        private final BufferedReader reader;
        private StringTokenizer tokenizer;

        public FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        public String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            return tokenizer.nextToken("\n");
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
