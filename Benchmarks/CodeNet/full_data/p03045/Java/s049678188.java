import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;

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
        OneorTwo solver = new OneorTwo();
        solver.solve(1, in, out);
        out.close();
    }

    static class OneorTwo {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();

            UnionFind uf = new UnionFind(n);
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < m; i++) {
                int x = in.nextInt() - 1;
                int y = in.nextInt() - 1;
                int z = in.nextInt();
                uf.link(x, y);
            }
            for (int i = 0; i < n; i++) {
                set.add(uf.findSet(i));
            }
            out.print(set.size());
        }

        public class UnionFind {
            List<Integer> rank;
            List<Integer> parent;

            public UnionFind() {
            }

            public UnionFind(int size) {
                rank = new ArrayList<>();
                parent = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    makeSet(i);
                }
            }

            public void makeSet(int x) {
                parent.add(x);
                rank.add(0);
            }

            public int findSet(int x) {
                if (x != parent.get(x)) {
                    parent.set(x, findSet(parent.get(x)));
                }
                return parent.get(x);
            }

            public void link(int x, int y) {
                if (rank.get(x) > rank.get(y)) {
                    parent.set(y, parent.get(x));
                } else {
                    parent.set(x, parent.get(y));
                    if (rank.get(x).equals(rank.get(y))) {
                        rank.set(y, rank.get(y) + 1);
                    }
                }
            }

        }

    }
}

