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
        Equals solver = new Equals();
        solver.solve(1, in, out);
        out.close();
    }

    static class Equals {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();

            int[] p = new int[n + 1];
            UnionFind uf = new UnionFind(n + 1);

            for (int i = 1; i <= n; i++) {
                p[i] = Integer.parseInt(in.next());
                uf.makeSet(i);
            }

            for (int i = 1; i <= m; i++) {
                int x = Integer.parseInt(in.next());
                int y = Integer.parseInt(in.next());
                uf.unite(x, y);
            }

            long result = 0;
            for (int i = 1; i <= n; i++) {
                int goal = p[i];
                if (uf.same(i, goal)) {
                    result++;
                }
            }
            out.println(result);

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

