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
        JoisinoTravel solver = new JoisinoTravel();
        solver.solve(1, in, out);
        out.close();
    }

    static class JoisinoTravel {
        int[] rr;
        int[][] map;
        long result = Long.MAX_VALUE;

        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int n = in.nextInt();
            int m = in.nextInt();
            int r = in.nextInt();
            rr = new int[r];
            for (int i = 0; i < r; i++) {
                rr[i] = Integer.parseInt(in.next());
            }
            map = new int[n + 1][n + 1];
            warshallFloydInit(map);

            for (int i = 0; i < m; i++) {
                int a = Integer.parseInt(in.next());
                int b = Integer.parseInt(in.next());
                int c = Integer.parseInt(in.next());
                map[a][b] = c;
                map[b][a] = c;
            }
            warshallFloyd(map);
            for (int i = 0; i < rr.length; i++) {
                ArrayList<Integer> init = new ArrayList<>();
                init.add(rr[i]);
                dfs(init, 0L);
            }
            out.println(result);

        }

        public void dfs(List<Integer> already, long cost) {
            if (already.size() == rr.length) {
                result = Math.min(result, cost);
                return;
            }
            for (int i = 0; i < rr.length; i++) {
                ArrayList<Integer> tmp = new ArrayList<>(already);
                if (tmp.contains(rr[i])) {
                    continue;
                }
                int from = tmp.get(tmp.size() - 1);
                int to = rr[i];
                int add = map[from][to];
                tmp.add(to);
                dfs(tmp, cost + add);
            }

        }

        static void warshallFloydInit(int[][] g) {
            int n = g.length;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    g[i][j] = (i == j) ? 0 : Integer.MAX_VALUE;
                }
            }
        }

        static void warshallFloyd(int[][] g) {
            int n = g.length;
            // グラフのNodeは0始まりの場合
            for (int k = 0; k < n; k++) {
                for (int i = 0; i < n; i++) {
                    if (g[i][k] == Integer.MAX_VALUE) {
                        continue;
                    }
                    for (int j = 0; j < n; j++) {
                        if (g[k][j] == Integer.MAX_VALUE) {
                            continue;
                        }
                        g[i][j] = Math.min(g[i][j], g[i][k] + g[k][j]);
                    }
                }
            }
        }

    }
}

