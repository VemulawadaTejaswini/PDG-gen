import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] X = new int[M];
        int[] Y = new int[M];
        int[] Z = new int[M];
        for (int i=0; i<M; i++) {
            X[i] = sc.nextInt();
            Y[i] = sc.nextInt();
            Z[i] = sc.nextInt();
        }

        System.out.println(solve(N, M, X, Y, Z));
    }

    private static int solve(int N, int M, int[] X, int[] Y, int[] Z) {
        UnionFind uf = new UnionFind(N);
        for (int i=0; i<M; i++) {
            uf.unite(X[i]-1, Y[i]-1);
        }

        Set<Integer> set = new HashSet();
        for (int i=0; i<N; i++) {
            set.add(uf.find(i));
        }

        return set.size();
    }

    public static class UnionFind {
        /**
         * 各要素のrootを示す．対象要素がrootの場合は木の要素数を負の値で表現する
         */
        int[] parent;

        public UnionFind(int N) {
            parent = new int[N+1];
            Arrays.fill(parent, -1);
        }

        /**
         * xとyの木を併合する
         * @param x
         * @param y
         */
        public void unite(int x, int y) {
            int rootx = find(x);
            int rooty = find(y);

            // XとYが同一木なら何もしない
            if (rootx == rooty) return;

            // 小さい木を大きい木に併合したいので
            // Xの方が小さい場合はXとYを入れ替えてYをXに併合する
            if (size(x) < size(y)) {
                unite(y, x);
                return;
            }

            parent[rootx] += parent[rooty];
            parent[rooty] = x;
        }

        /**
         * UnionFind木のルートを求める
         * @param x
         * @return
         */
        public int find(int x){
            if (parent[x] < 0) {
                return x;
            }

            return parent[x] = find(parent[x]);
        }

        /**
         * 2つの要素が同一木に属するか
         * @param x
         * @param y
         * @return
         */
        public boolean isSame(int x, int y) {
            return find(x) == find(y);
        }

        /**
         * 要素xが属する木の要素数を返す
         * @param x
         * @return
         */
        public int size(int x) {
            return -parent[find(x)];
        }
    }
}
