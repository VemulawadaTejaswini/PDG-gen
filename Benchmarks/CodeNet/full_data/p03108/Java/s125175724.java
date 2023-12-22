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
        DecayedBridges solver = new DecayedBridges();
        solver.solve(1, in, out);
        out.close();
    }

    static class DecayedBridges {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[] aa = new int[m];
            int[] bb = new int[m];
            long[] score = new long[m + 1];

            for (int i = 0; i < m; i++) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                aa[i] = a;
                bb[i] = b;
            }

            UnionFind uf = new UnionFind(n);
            long point = n * (n - 1) / 2;
            for (int i = m; 0 < i; i--) {
                score[i] = point;

                int a = aa[i - 1];
                int b = bb[i - 1];
                boolean isSame = uf.same(a, b);
                if (isSame) {
                    continue;
                }

                point = point - uf.size(a) * uf.size(b);
                uf.unite(a, b);

            }

            for (int i = 1; i <= m; i++) {
                out.println(score[i]);
            }
        }

        public class UnionFind {
            private int[] size;
            private int[] parents;

            public UnionFind() {
            }

            public UnionFind(int size) {
                this.size = new int[size];
                this.parents = new int[size];
                for (int i = 0; i < size; i++) {
                    makeSet(i);
                }
            }

            public void makeSet(int x) {
                parents[x] = x;
                size[x] = 1;
            }

            public int findSet(int x) {
                if (x != parents[x]) {
                    parents[x] = findSet(parents[x]);
                }
                return parents[x];
            }

            public boolean unite(int x, int y) {
                if (same(x, y)) {
                    return false;
                }
                link(findSet(x), findSet(y));
                return true;
            }

            public long size(int x) {
                return size[findSet(x)];
            }

            public boolean same(int x, int y) {
                return findSet(x) == findSet(y);
            }

            private void link(int x, int y) {
                if (size[x] > size[y]) {
                    parents[y] = parents[x];
                    size[x] += size[y];
                } else {
                    parents[x] = parents[y];
                    size[y] += size[x];
                }
            }

        }

    }
}

