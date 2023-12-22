import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[m];
        int b[] = new int[m];
        UFtree uft = new UFtree(n);
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt() - 1;
            b[i] = sc.nextInt() - 1;
        }
        int cnt = 0;
        for (int i = 0; i < m; i++) {
            // 繰り返す階数
            uft = new UFtree(n);
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    continue;
                } else {
                    uft.unit(a[j], b[j]);
                }
            }
            if (uft.count() != 1) {
                cnt++;
            }

        }
        System.out.println(cnt);
        sc.close();
    }
}

/**
 * UFtree;
 */
class UFtree {
    // 親の番号
    int parent[];

    int size;

    UFtree(int n) {
        parent = new int[n];
        init();
        size = n;
    }

    void init() {
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }
    }

    // 数値xの親を調べる
    int root(int x) {
        if (parent[x] == x) {
            return x;
        } else {
            return parent[x] = root(parent[x]);
        }
    }

    // xとyをグルーピング
    void unit(int x, int y) {
        int rootX = root(x);
        int rootY = root(y);
        if (rootX == rootY) {
            return;
        }
        parent[rootX] = rootY;
    }

    // xとyが同じグループかどうか
    boolean same(int x, int y) {
        return root(x) == root(y);
    }

    // グループの数
    int count() {
        boolean[] check = new boolean[size];
        for (int i = 0; i < size; i++) {
            check[root(i)] = true;
        }
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (check[i])
                count++;
        }
        return count;
    }
}
