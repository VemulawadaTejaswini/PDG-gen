import java.util.Scanner;

public class Main {

    private static int N;
    private static int M;
    private static int A[];
    private static int B[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        A = new int[M];
        B = new int[M];
        for (int i = 0; i < M; i++) {
            A[i] = sc.nextInt()-1;
            B[i] = sc.nextInt()-1;
        }
        System.out.println(solve());
    }

    static int solve() {
        int ans = 0;
        for (int i = 0; i < M; i++) {
            if( isBridge(i) ) {
                ans++;
            }
        }
        return ans;
    }

    static boolean isBridge(int exclude) {
        int a_ex = A[exclude];
        int b_ex = B[exclude];

        UnionFind uf = new UnionFind(N);
        for (int i = 0; i < M; i++) {
            if( a_ex == A[i] && b_ex == B[i] ) continue;

            uf.unite(A[i], B[i]);
        }

        int rootZero = uf.root(0);
        for (int i = 1; i < N; i++) {
            if( uf.root(i) != rootZero ) {
                return true;
            }
        }
        return false;
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

        int root(int i) {
            if( parent[i] == i ) {
                return i;
            } else {
                parent[i] = root(parent[i]);
                return parent[i];
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
}
