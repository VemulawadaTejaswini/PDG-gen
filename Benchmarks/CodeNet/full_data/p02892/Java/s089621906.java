import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BGraphPartition solver = new BGraphPartition();
        solver.solve(1, in, out);
        out.close();
    }

    static class BGraphPartition {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            UnionFind uftree = new UnionFind();
            int[][] dist = new int[n][n];
            uftree.Init(n * 2);
            for (int i = 0; i < n; i++) {
                String tmp = in.next();
                for (int j = 0; j < n; j++) {
                    if (tmp.charAt(j) == '1') {
                        // i <-> j : edge exists
                        // i <-> j+n, i+n <-> j musubu
                        uftree.Union(i, j + n);
                        uftree.Union(i + n, j);
                        dist[i][j] = 1;
                    } else {
                        if (i == j) {
                            dist[i][j] = 0;
                        } else {
                            dist[i][j] = 114514;
                        }
                    }
                }
            }
            boolean isNibuGraph = true;
            for (int i = 0; i < n; i++) {
                if (uftree.Same(i, i + n)) {
                    isNibuGraph = false;
                }
            }
            if (!isNibuGraph) {
                out.println(-1);
            } else {
                for (int k = 0; k < n; k++) {
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                        }
                    }
                }
                int res = -1;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        res = Math.max(res, dist[i][j]);
                        // out.println("dist(" + i + ", " + j + ") = " + dist[i][j]);
                    }
                }
                out.println(res + 1);
            }

        }

    }

    static class UnionFind {
        private int MAX_N = 100000;
        int[] parent = new int[MAX_N];

        void Init(int size) {
            for (int i = 0; i < size; i++) {
                parent[i] = i;
            }
        }

        int Find(int x) {
            if (parent[x] == x) {
                // X is Root
                return x;
            } else {
                return parent[x] = Find(parent[x]);
            }
        }

        boolean Same(int x, int y) {
            return Find(x) == Find(y);
        }

        void Union(int x, int y) {
            x = Find(x);
            y = Find(y);
            if (x == y) {
                return;
            } else {
                parent[x] = y;
            }
        }

    }
}

