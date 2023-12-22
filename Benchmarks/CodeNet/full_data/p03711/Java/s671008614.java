import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int x = in.nextInt();
            int y = in.nextInt();

            UnionFind uf = new UnionFind();
            uf.init(13);
            uf.unite(1, 3);
            uf.unite(1, 5);
            uf.unite(1, 7);
            uf.unite(1, 8);
            uf.unite(1, 10);
            uf.unite(1, 12);
            uf.unite(4, 6);
            uf.unite(4, 9);
            uf.unite(4, 11);

            System.out.println(uf.isSame(x, y) ? "Yes" : "No");
        }
    }
}

class UnionFind {
    private int[] par;
    private int[] rank;

    public void init(int n) {
        par = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            par[i] = i;
            rank[i] = 0;
        }
    }

    public int getRoot(int x) {
        if (par[x] == x) {
            return x;
        } else {
            par[x] = getRoot(par[x]);
            return par[x];
        }
    }

    public void unite(int x, int y) {
        x = getRoot(x);
        y = getRoot(y);
        if (x == y) {
            return;
        }
        if (rank[x] < rank[y]) {
            par[x] = y;
        } else {
            par[y] = x;
            if (rank[x] == rank[y]) {
                rank[x]++;
            }
        }
    }

    public boolean isSame(int x, int y) {
        return getRoot(x) == getRoot(y);
    }
}