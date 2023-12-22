import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    static class UnionFind {
        private int[] parent;

        public UnionFind(int n) {
            parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        private int root(int x) {
            if (parent[x] == x) {
                return x;
            }
            return parent[x] = root(parent[x]);
        }

        private void unite(int x, int y) {
            int rx = root(x);
            int ry = root(y);
            if (rx == ry) {
                return;
            }
            parent[rx] = ry;
        }

        private boolean same(int x, int y) {
            int rx = root(x);
            int ry = root(y);
            return rx == ry;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int[] p = new int[k];
        int[] q = new int[k];
        int[] r = new int[l];
        int[] s = new int[l];
        for (int i = 0; i < k; i++) {
            p[i] = sc.nextInt();
            q[i] = sc.nextInt();
        }
        for (int i = 0; i < l; i++) {
            r[i] = sc.nextInt();
            s[i] = sc.nextInt();
        }
        int[] ans = new int[n + 1];
        UnionFind uf1 = new UnionFind(n + 1);
        UnionFind uf2 = new UnionFind(n + 1);
        for (int i = 0; i < k; i++) {
            uf1.unite(p[i], q[i]);
        }
        for (int i = 0; i < l; i++) {
            uf2.unite(r[i], s[i]);
        }
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (uf1.same(i, j) && uf2.same(i, j)) {
                    ans[i]++;
                    ans[j]++;
                }
            }
        }
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 1; i <= n; i++) {
            sj.add(String.valueOf(ans[i] + 1));
        }
        System.out.println(sj);
    }

}
