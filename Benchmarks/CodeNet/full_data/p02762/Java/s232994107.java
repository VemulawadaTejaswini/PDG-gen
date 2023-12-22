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
            private int[] parent;
            private int[] rank;
            private int[] elmsize;

            public UnionFind(int size) {
                parent = new int[size];
                rank = new int[size];
                elmsize = new int[size];

                for (int i = 0; i < size; i++) {
                    makeSet(i);
                }
            }

            public void makeSet(int x) {
                parent[x] = x;
                rank[x] = 0;
                elmsize[x] = 1;
            }

            public void unite(int x, int y) {
                final int xRoot = root(x);
                final int yRoot = root(y);

                if (rank[xRoot] > rank[yRoot]) {
                    parent[yRoot] = xRoot;        //x の木に結合
                    elmsize[xRoot] += elmsize[yRoot];
                } else if (rank[xRoot] < rank[yRoot]) {
                    parent[xRoot] = yRoot;        //y の木に結合
                    elmsize[yRoot] += elmsize[xRoot];
                } else if (xRoot != yRoot) {        //同じ高さで根が違うとき
                    parent[yRoot] = xRoot;        //x の木に結合
                    rank[xRoot]++;                //x の木の高さを加算
                    elmsize[xRoot] += elmsize[yRoot];
                }
            }

            public int root(int x) {
                if (x != parent[x]) {    //根でないとき
                    parent[x] = root(parent[x]);    //直接、根に繋ぐ(経路圧縮)
                }
                return parent[x];
            }

            public boolean same(int x, int y) {
                return root(x) == root(y);
            }

            public long getSize(int x) {
                return elmsize[root(x)];
            }

        }

    }
}

