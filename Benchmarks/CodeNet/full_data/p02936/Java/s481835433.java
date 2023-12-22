import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
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
        List<List<Integer>> graph;
        long[] cost;

        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int n = in.nextInt();
            int q = in.nextInt();

            graph = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                graph.add(new ArrayList<>());
            }

            cost = new long[n + 1];

            for (int i = 1; i <= n - 1; i++) {
                int a = Integer.parseInt(in.next());
                int b = Integer.parseInt(in.next());
                graph.get(a).add(b);
                graph.get(b).add(a);
            }

            for (int i = 0; i < q; i++) {
                int p = Integer.parseInt(in.next());
                long x = Long.parseLong(in.next());
                cost[p] = cost[p] + x;
            }

            dfs(1, -1);
            for (int i = 1; i <= n; i++) {
                out.print(cost[i] + " ");
            }
        }

        public void dfs(int dst, int parent) {
            for (Integer num : graph.get(dst)) {
                if (num != parent) {
                    cost[num] += cost[dst];
                    dfs(num, dst);
                }
            }
        }

    }
}

