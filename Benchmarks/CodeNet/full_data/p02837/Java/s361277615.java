import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();

            int[] A = new int[N];
            int[][] X = new int[N][N];
            int[][] Y = new int[N][N];

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                for (int j = 0; j < A[i]; j++) {
                    X[i][j] = sc.nextInt() - 1;
                    Y[i][j] = sc.nextInt();
                }
            }

            int ans = 0;

            for (int i = 1; i < (1 << N); i++) {
                UnionFindTree tree = new UnionFindTree(N);

                for (int j = 0; j < N; j++) {
                    if (((i >> j) & 1) == 1) {
                        tree.unite(N, j);
                    }
                }

                int ans2 = 0;
                for (int j = 0; j < N; j++) {
                    if (tree.same(N, j)) {
                        for (int k = 0; k < A[j]; k++) {
                            int x = X[j][k];
                            int y = Y[j][k];

                            boolean same = tree.same(N, x);

                            if ((same && y == 0) || (!same && y == 1)) {
                                ans2 = -10;
                                j = N;
                                break;
                            }
                        }

                        ans2++;
                    }
                }

                ans = Math.max(ans, ans2);
            }

            System.out.println(ans);
        }
    }

    public static class UnionFindTree {

        private int[] parent;

        private int[] rank;

        public UnionFindTree(int N) {
            parent = new int[N + 1];
            rank = new int[N + 1];
            for (int i = 0; i <= N; i++) {
                parent[i] = i;
                rank[i] = 0;
            }
        }

        public int find(int x) {
            if (parent[x] == x) {
                return x;
            } else {
                int p = find(parent[x]);
                parent[x] = p;
                return p;
            }
        }

        public void unite(int x, int y) {
            x = find(x);
            y = find(y);

            if (x == y) {
                return;
            }

            if (rank[x] < rank[y]) {
                parent[x] = y;
            } else {
                parent[y] = x;
                if (rank[x] == rank[y]) {
                    rank[x]++;
                }
            }
        }

        public boolean same(int x, int y) {
            return find(x) == find(y);
        }

    }

}
