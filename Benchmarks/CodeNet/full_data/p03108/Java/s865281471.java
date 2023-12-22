import java.util.*;

public class Main {
    private static class Union {
        int root[];

        public Union(int n) {
            root = new int[n];
            for (int i = 0; i < n; i++) {
                root[i] = i;
            }
        }

        public int root(int x) {
            return (root[x] == x) ? x : (root[x] = root(root[x]));
        }

        public void unite(int x, int y) {
            int rx = root(x);
            int ry = root(y);
            if (rx != ry) {
                root[rx] = ry;
            }
        }

        public boolean isSame(int x, int y) {
            return (root[x] = root(x)) == (root[y] = root(y));
        }
    }

    public void main(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[m];
        int b[] = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt() - 1;
            b[i] = sc.nextInt() - 1;
        }
        Union uni = new Union(n);

        int cnt[] = new int[n];
        for (int i = 0; i < n; i++) {
            cnt[i] = 1;
        }

        long ans[] = new long[m + 1];
        ans[m] = ((long) n) * (n - 1) / 2;

        for (int i = m - 1; i >= 0; i--) {
            if (!uni.isSame(a[i], b[i])) {
                int ca = cnt[uni.root(a[i])];
                int cb = cnt[uni.root(b[i])];

                ans[i] = ans[i + 1] - ca * cb;

                cnt[uni.root(a[i])] = ca + cb;
                cnt[uni.root(b[i])] = ca + cb;
            } else {
                ans[i] = ans[i + 1];
            }
            uni.unite(a[i], b[i]);
        }

        for (int i = 1; i <= m; i++) {
            System.out.println(ans[i]);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            new Main().main(sc);
        } catch (Exception e) {
            throw e;
        }
    }
}
