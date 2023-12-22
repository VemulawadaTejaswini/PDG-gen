import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
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
        Ki solver = new Ki();
        solver.solve(1, in, out);
        out.close();
    }

    static class Ki {
        List<List<Node>> graph;
        long[] cost;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int q = in.nextInt();

            graph = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                graph.add(new ArrayList<>());
            }

            cost = new long[n + 1];
            Arrays.fill(cost, 0);

            for (int i = 1; i <= n - 1; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                (graph.get(a)).add(new Node(b));
                (graph.get(b)).add(new Node(a));
            }
            for (int i = 0; i < q; i++) {
                int p = in.nextInt();
                long x = in.nextLong();
                cost[p] = cost[p] + x;
            }

            dfs(1, -1);
            for (int i = 1; i <= n; i++) {
                out.print(cost[i] + " ");
            }
        }

        public void dfs(int dst, int parent) {
            for (Node child : graph.get(dst)) {
                if (child.num != parent) {
                    cost[child.num] += cost[dst];
                    dfs(child.num, dst);
                }
            }
        }

        class Node {
            public final Integer num;

            Node(Integer num) {
                this.num = num;
            }

        }

    }
}

