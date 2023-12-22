import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        PeopleLine solver = new PeopleLine();
        solver.solve(1, in, out);
        out.close();
    }

    static class PeopleLine {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            WeightedUnionFind uf = new WeightedUnionFind(n + 1);
            for (int i = 0; i < m; i++) {
                int l = in.nextInt();
                int r = in.nextInt();
                int w = in.nextInt();
                if (uf.same(l, r)) {
                    int d = uf.diff(l, r);
                    if (d != w) {
                        out.println("No");
                        return;
                    }
                } else {
                    uf.unite(l, r, w);
                }
            }
            out.println("Yes");
        }

        public class WeightedUnionFind {
            private int[] rank;
            private int[] parents;
            private int[] weight;

            public WeightedUnionFind() {
            }

            public WeightedUnionFind(int size) {
                this.rank = new int[size];
                this.parents = new int[size];
                this.weight = new int[size];

                for (int i = 0; i < size; i++) {
                    makeSet(i);
                }
            }

            public void makeSet(int x) {
                parents[x] = x;
                rank[x] = 0;
            }

            public int findSet(int x) {
                if (x != parents[x]) {
                    int r = findSet(parents[x]);
                    weight[x] += weight[parents[x]];
                    parents[x] = r;
                }
                return parents[x];
            }

            public int weight(int x) {
                findSet(x);
                return weight[x];
            }

            public int diff(int x, int y) {
                return weight(y) - weight(x);
            }

            public boolean unite(int x, int y, int w) {
                if (same(x, y)) {
                    return false;
                }
                int px = findSet(x);
                int py = findSet(y);

                if (rank[px] > rank[py]) {
                    // xにくっつける
                    parents[py] = px;
                    weight[py] = w + weight[y] - weight[x];
                } else {
                    // yにくっつける
                    parents[px] = py;
                    weight[px] = -w - weight[y] + weight[x];
                    if (rank[px] == rank[py]) {
                        rank[py]++;
                    }
                }
                return true;
            }

            public boolean same(int x, int y) {
                return findSet(x) == findSet(y);
            }

        }

    }
}

