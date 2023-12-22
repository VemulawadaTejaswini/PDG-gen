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
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        static int ans[];

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            int m = Integer.parseInt(in.next());
            int k = Integer.parseInt(in.next());

            UnionFind uf = new UnionFind(n);

            ans = new int[n];

            int like[][] = new int[m][2];
            for (int i = 0; i < m; i++) {
                like[i][0] = Integer.parseInt(in.next()) - 1;
                like[i][1] = Integer.parseInt(in.next()) - 1;
                uf.unite(like[i][0], like[i][1]);
            }
            int dislike[][] = new int[k][2];
            for (int i = 0; i < k; i++) {
                dislike[i][0] = Integer.parseInt(in.next()) - 1;
                dislike[i][1] = Integer.parseInt(in.next()) - 1;
            }
            for (int i = 0; i < n; i++) {
                ans[i] = (int) uf.getSize(i) - 1;
            }
            for (int i = 0; i < m; i++) {
                ans[like[i][0]]--;
                ans[like[i][1]]--;
            }
            for (int i = 0; i < k; i++) {
                if (uf.same(dislike[i][0], dislike[i][1])) {
                    ans[dislike[i][0]]--;
                    ans[dislike[i][1]]--;
                }
            }
            for (int i = 0; i < n; i++) {
                out.printf("%d ", ans[i]);
            }
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

            public long getSize(int x) {
                return elmsize.get(root(x));
            }

        }

    }
}

