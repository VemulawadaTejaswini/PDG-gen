import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.LinkedList;

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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            int m = Integer.parseInt(in.next());
            int[][] edge = new int[m][2];
            for (int i = 0; i < m; i++) {
                edge[i][0] = Integer.parseInt(in.next()) - 1;
                edge[i][1] = Integer.parseInt(in.next()) - 1;
            }
            int ans = 0;
            for (int i = 0; i < m; i++) {
                UnionFind uf = new UnionFind(n);
                for (int j = 0; j < m; j++) {
                    if (j != i) {
                        uf.unite(edge[j][0], edge[j][1]);
                    }
                }
                if (!uf.same(edge[i][0], edge[i][1])) {
                    ans++;
                }
            }
            // 出力
            out.println(ans);

        }

        public class UnionFind {
            private List<Integer> parent = new LinkedList<Integer>();
            private List<Integer> rank = new LinkedList<Integer>();
            private List<Integer> elmsize = new LinkedList<Integer>();

            public UnionFind() {
            }

            public UnionFind(int size) {
                for (int i = 0; i < size; i++) {
                    parent.add(i);
                    rank.add(0);
                    elmsize.add(1);
                }
            }

            public void unite(int x, int y) {
                final int xRoot = root(x);
                final int yRoot = root(y);

                if (rank.get(xRoot) > rank.get(yRoot)) {
                    parent.set(yRoot, xRoot);    //x の木に結合
                    elmsize.set(xRoot, elmsize.get(xRoot) + elmsize.get(yRoot));
                } else if (rank.get(xRoot) < rank.get(yRoot)) {
                    parent.set(xRoot, yRoot);    //y の木に結合
                    elmsize.set(yRoot, elmsize.get(yRoot) + elmsize.get(xRoot));
                } else if (xRoot != yRoot) {        //同じ高さで根が違うとき
                    parent.set(yRoot, xRoot);    //x の木に結合
                    rank.set(xRoot, rank.get(xRoot) + 1);    //x の木の高さを加算
                    elmsize.set(xRoot, elmsize.get(xRoot) + elmsize.get(yRoot));
                }
            }

            public int root(int x) {
                if (x != parent.get(x)) {    //根でないとき
                    parent.set(x, root(parent.get(x)));    //直接、根に繋ぐ(経路圧縮)
                }
                return parent.get(x);
            }

            public boolean same(int x, int y) {
                return root(x) == root(y);
            }

        }

    }
}

