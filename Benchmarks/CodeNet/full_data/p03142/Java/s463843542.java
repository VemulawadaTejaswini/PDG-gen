import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DRestoreTheTree solver = new DRestoreTheTree();
        solver.solve(1, in, out);
        out.close();
    }

    static class DRestoreTheTree {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

        /*
            辺の追加はM本ある
            これは難しい…
            グラフの辺の数の合計は N + M < = 10^5となっている
            つまり50000 + 50000 が最もn,mともに大きいパターンとなっている…
            なるほど、子孫しか見ていないということは、親は必ず定まっていて、幅優先で更新していけばいいことがわかるな
            まず親に向かうグラフを考えて親を求めて、そこからbfsすればいいか
         */

            // in
            int n = in.nextInt();
            int m = in.nextInt();
            Graph par = new Graph(n);
            Graph chi = new Graph(n);
            for (int i = 0; i < n + m - 1; i++) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                // a->bの有効辺
                par.addEdge(new Edge(b, a, 1));
                chi.addEdge(new Edge(a, b, 1));
            }


            // find the root
            int root = 0;
            ArrayList<Edge>[] e = par.getAdj();
            while (e[root].size() != 0) {
                root = e[root].get(0).getTo();
            }

            // bfs
            e = chi.getAdj();
            int[] prev = new int[n];
            Arrays.fill(prev, -1);
            ArrayDeque<Integer> q = new ArrayDeque<>();
            q.push(root);
            while (!q.isEmpty()) {
                int now = q.peek();
                q.poll();
                for (Edge edge : e[now]) {
                    prev[edge.getTo()] = now;
                    q.push(edge.getTo());
                }
            }

            // out
            for (int i = 0; i < n; i++) {
                out.println(prev[i] + 1);
            }


        }

    }

    static class Edge {
        int from;
        int to;
        long cost;

        public Edge(int to) {
            this.to = to;
        }

        public Edge(int to, long cost) {
            this.to = to;
            this.cost = cost;
        }

        public Edge(int from, int to, long cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }

        public int getTo() {
            return to;
        }

        public String toString() {
            return "Edge{" +
                    "from=" + from +
                    ", to=" + to +
                    ", cost=" + cost +
                    '}';
        }

    }

    static class Graph {
        int n;
        ArrayList<Edge>[] adj;
        long[] vertexCost;

        public Graph(int size) {
            n = size;
            adj = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                adj[i] = new ArrayList<>();
            }
            vertexCost = new long[n];
        }

        public void addEdge(Edge e) {
            adj[e.from].add(e);
        }

        public ArrayList<Edge>[] getAdj() {
            return adj;
        }

    }
}

