import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[M];
        int[] B = new int[M];
        for (int i=0; i<M; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }
        int[] C = new int[K];
        int[] D = new int[K];
        for (int i=0; i<K; i++) {
            C[i] = sc.nextInt();
            D[i] = sc.nextInt();
        }

        int[] ans = solve(N, M, K, A, B, C, D);
        for (int i=0; i<N; i++) {
            if (i != 0) {
                System.out.print(" ");
            }
            System.out.print(ans[i]);
        }
        System.out.println();
    }

    private static int[] solve(int N, int M, int K, int[] A, int[] B, int[] C, int[] D) {
        int[] ans = new int[N];

        UnionFind uf = new UnionFind(N);
        int[] blocked = new int[N+1];
        int[] friend = new int[N+1];

        for (int i=0; i<M; i++) {
            uf.unite(A[i], B[i]);
            friend[A[i]]++;
            friend[B[i]]++;
        }
        for (int i=0; i<K; i++) {
            if (uf.isSame(C[i], D[i])) {
                blocked[C[i]]++;
                blocked[D[i]]++;
            }
        }

        for (int i=0; i<N; i++) {
            ans[i] = uf.size(i+1) - friend[i+1] - blocked[i+1] - 1;
            System.out.println("i=" + i + ": " + uf.size(i+1) + " - " + friend[i+1] + " - " + blocked[i+1] + " - 1 = " + ans[i]);
        }

        return ans;
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
         * 2つの要素が同一グループに属するか
         * @param x
         * @param y
         * @return
         */
        public boolean isSame(int x, int y) {
            return find(x) == find(y);
        }

        public int size(int x) {
            return -parent[find(x)];
        }
    }


}