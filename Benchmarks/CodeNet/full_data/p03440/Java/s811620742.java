import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N;
    static int M;
    static int[] A;
    static int[] X;
    static int[] Y;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        A = sc.nextIntArray(N);
        X = new int[M];
        Y = new int[M];
        for (int i = 0; i < M; i++) {
            X[i] = sc.nextInt();
            Y[i] = sc.nextInt();
        }
        System.out.println(solve());
    }

    static String solve() {
        List<Tree> forest = buildForest();

        long cost = 0;
        while(forest.size() > 1 ) {
            for (Tree tree : forest) {
                if( tree.nodeCosts.length == 0 ) return "Impossible";
            }

            forest.sort(Comparator.comparingInt(f -> f.nodeCosts[0]));

            List<Tree> newForest = new ArrayList<>();
            int p = forest.size() / 2;
            for (int i = 0; i < p; i++) {
                Tree t1 = forest.get(i*2);
                Tree t2 = forest.get(i*2 + 1);
                Result result = t1.merge(t2);
                cost += result.cost;
                newForest.add( result.tree );
            }

            if( forest.size() % 2 == 1 ) {
                newForest.add( forest.get(forest.size()-1) );
            }

            forest = newForest;
        }
        return "" + cost;
    }

    static List<Tree> buildForest() {
        UnionFind uf = new UnionFind(N);
        for (int i = 0; i < M; i++) {
            uf.unite(X[i], Y[i]);
        }

        List<Integer>[] forestCosts = new List[N];
        for (int i = 0; i < N; i++) {
            int root = uf.root(i);
            if( forestCosts[root] == null ) {
                forestCosts[root] = new ArrayList<>();
            }
            forestCosts[root].add(A[i]); // cost
        }

        List<Tree> forest = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if( forestCosts[i] != null ) {
                forestCosts[i].sort(Comparator.naturalOrder());
                int[] nodes = new int[forestCosts[i].size()];
                for (int j = 0; j < nodes.length; j++) {
                    nodes[j] = forestCosts[i].get(j);
                }
                forest.add( new Tree(nodes) );
            }
        }
        return forest;
    }

    static class Tree {
        int[] nodeCosts; // node cost

        public Tree(int[] nodeCosts) {
            this.nodeCosts = nodeCosts;
        }

        public Result merge(Tree tree) {
            if( nodeCosts.length == 0 || tree.nodeCosts.length == 0 ) return null;

            long cost = (long)nodeCosts[0] + tree.nodeCosts[0];
            int[] newNodeCosts = new int[nodeCosts.length + tree.nodeCosts.length - 2];

            int i = 1;
            int j = 1;
            for (int k = 0; k < newNodeCosts.length; k++) {
                if( tree.nodeCosts.length == j || nodeCosts.length != i && nodeCosts[i] < tree.nodeCosts[j] ) {
                    newNodeCosts[k] = nodeCosts[i];
                    i++;
                } else {
                    newNodeCosts[k] = tree.nodeCosts[j];
                    j++;
                }
            }

            return new Result(cost, new Tree(newNodeCosts));
        }
    }

    static class Result {
        long cost;
        Tree tree;

        public Result(long cost, Tree tree) {
            this.cost = cost;
            this.tree = tree;
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

        public int root(int i) {
            if( parent[i] == i ) {
                return i;
            } else {
                return parent[i] = root(parent[i]);
            }
        }

        public void unite(int i, int j) {
            int ri = root(i);
            int rj = root(j);
            if( ri == rj ) return;

            if( rank[ri] < rank[rj] ) {
                parent[ri] = rj;

            } else {
                parent[rj] = ri;
                if( rank[ri] == rank[rj] ) {
                    rank[ri]++;
                }
            }
        }

        public boolean isSame(int a, int b) {
            return root(a) == root(b);
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
