import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = scanner.nextInt() - 1;
        }

        UnionFind unionFind = new UnionFind(n);
        for (int i = 0; i < m; i++) {
            unionFind.unite(scanner.nextInt() - 1, scanner.nextInt() - 1);
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (unionFind.same(i, p[i])) {
                ans++;
            }
        }
        System.out.println(ans);
    }

    static class UnionFind {
        private int[] parent;

        UnionFind(int n) {
            parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        int root(int n) {
            while (parent[n] != n) {
                n = parent[n] = parent[parent[n]];
            }
            return n;
        }

        void unite(int x, int y) {
            x = root(x);
            y = root(y);
            if (x != y) {
                parent[x] = y;
            }
        }

        boolean same(int x, int y) {
            return root(x) == root(y);
        }
    }
}