
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int m = Integer.parseInt(scan.next());
        int[] a = new int[m];
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = Integer.parseInt(scan.next());
            b[i] = Integer.parseInt(scan.next());
            a[i]--;
            b[i]--;
        }
        scan.close();

        int ans = 0;
        for (int i = 0; i < m; i++) {
            UnionFind uf = new UnionFind(n);
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    continue;
                }
                uf.unite(a[j], b[j]);
            }

            int root = uf.getRoot(0);
            for (int k = 1; k < n; k++) {
                if (uf.getRoot(k) != root) {
                    ans++;
                    break;
                }
            }
        }

        System.out.println(ans);
    }

    static class UnionFind {

        /** ルートノード */
        private int[] roots;

        /**
         * コンストラクタ.
         *
         * @param n ノード数
         */
        public UnionFind(int n) {
            roots = new int[n];
            for (int i = 0; i < n; i++) {
                roots[i] = i;
            }
        }

        /**
         * 各々のノードが属するグループを結合する.
         *
         * @param x
         * @param y
         */
        public void unite(int x, int y) {
            roots[getRoot(y)] = getRoot(x);
        }

        /**
         * 各々のノードが属するグループが同じかどうかを判定する.
         *
         * @param x
         * @param y
         * @return 同じグループに属するならtrue
         */
        public boolean same(int x, int y) {
            return getRoot(x) == getRoot(y);
        }

        /**
         * ルートノードを返す.<br>
         * 再帰によって経路圧縮を行っている.
         *
         * @param x
         * @return ルートノード
         */
        public int getRoot(int x) {
            int parent = roots[x];
            if (x != parent) {
                roots[x] = getRoot(parent);
            }
            return roots[x];
        }

    }

}
