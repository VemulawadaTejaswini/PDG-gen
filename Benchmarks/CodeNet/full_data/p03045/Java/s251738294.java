import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int M = in.nextInt();
            int[] X = new int[M];
            int[] Y = new int[M];
            int[] Z = new int[M];
            for (int i = 0; i < M; i++) {
                X[i] = in.nextInt() - 1;
                Y[i] = in.nextInt() - 1;
                Z[i] = in.nextInt() & 1;
            }

            UnionFind uf = new UnionFind();
            uf.init(N);
            for (int i = 0; i < M; i++) {
                uf.unite(X[i], Y[i]);
            }
            int count2 = 0;
            boolean[] used = new boolean[N];
            for (int i = 0; i < N; i++) {
                if (used[uf.find(i)]) {
                    continue;
                }
                used[uf.find(i)] = true;
                count2++;
            }

            System.out.println(count2);

        }
    }
}

class UnionFind {
    private int[] par;
    private int[] rank;
    private int[] size;

    public void init(int n) {
        par = new int[n];
        rank = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            par[i] = i;
            rank[i] = 0;
            size[i] = 1;
        }
    }

    public int find(int x) {
        if (par[x] == x) {
            return x;
        } else {
            par[x] = find(par[x]);
            return par[x];
        }
    }

    public int size(int x) {
        return size[find(x)];
    }

    public void unite(int x, int y) {
        x = find(x);
        y = find(y);
        if (x == y) {
            return;
        }
        if (rank[x] < rank[y]) {
            par[x] = y;
            size[x] += size[y];
            size[y] = size[x];
        } else {
            par[y] = x;
            if (rank[x] == rank[y]) {
                rank[x]++;
            }
            size[y] += size[x];
            size[x] = size[y];
        }
    }

    public boolean same(int x, int y) {
        return find(x) == find(y);
    }
}
