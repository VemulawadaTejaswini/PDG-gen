import java.util.*;

public class Main {
    private static class Union {
        int n;
        int root[];

        public Union(int n) {
            this.n = n;

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

        public int size(int x) {
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if (isSame(x, root[i])) {
                    cnt++;
                }
            }

            return cnt;
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

        long ans[] = new long[m + 1];
        ans[m] = ((long) n) * (n - 1) / 2;

        Union uni = new Union(n);
        for (int i = m - 1; i >= 0; i--) {
            if (!uni.isSame(a[i], b[i])) {
                ans[i] = ans[i + 1] - ((long) uni.size(a[i])) * uni.size(b[i]);
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
