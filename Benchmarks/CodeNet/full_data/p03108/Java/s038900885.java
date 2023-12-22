import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[m];
        int[] b = new int[m];

        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt() - 1;
            b[i] = sc.nextInt() - 1;
        }

        sc.close();

        long[] ans = new long[m];
        ans[m - 1] = n * (n - 1) / 2;

        UnionFind uni = new UnionFind(n);

        for (int i = m - 1; i >= 1; i--) {
            ans[i - 1] = ans[i];

            if (uni.root(a[i]) != uni.root(b[i])) {
                ans[i - 1] -= uni.size(a[i]) * uni.size(b[i]);
                uni.unite(a[i], b[i]);
            }
        }
        for (int i = 0; i < m; i++) {
            System.out.println(ans[i]);
        }
    }

    static class UnionFind {
        List<Integer> par;

        // 初期化
        UnionFind(int n) {
            par = new ArrayList<Integer>();
            Integer[] values = new Integer[n];
            Arrays.fill(values, -1);
            par.addAll(Arrays.asList(values));
        }

        // 根を求める
        int root(int x) {
            if (par.get(x) < 0) {
                return x;
            }
            int root = root(par.get(x));
            par.set(x, root);
            return root;
        }

        int size(int x) {
            return -par.get(root(x));
        }

        // 同じ根をもつか判定
        boolean same(int x, int y) {
            return root(x) == root(y);
        }

        // 併合
        boolean unite(int x, int y) {
            x = root(x);
            y = root(y);
            if (x == y) {
                return false;
            }

            if (size(x) < size(y)) {
                int temp = x;
                x = y;
                y = temp;
            }

            par.set(x, par.get(x) + par.get(y));
            par.set(y, x);

            return true;
        }
    }
}