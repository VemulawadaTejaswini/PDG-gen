import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;
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
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            HashMap<Integer, List<Integer>> map = new HashMap<>();
            int[] indegree = new int[n];
            for (int i = 0; i < m; i++) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                List<Integer> t = map.getOrDefault(a, new ArrayList<>());
                t.add(b);
                map.put(a, t);
                indegree[b]++;
            }
            int[] dist = new int[n];
            Arrays.fill(dist, -1);
            for (int i = 0; i < n; i++) {
                if (dist[i] == -1 && indegree[i] == 0) {
                    dist[i] = 0;
                    dfs(dist, i, map, indegree);
                }
            }
            int ans = 0;
            for (int dd : dist) ans = Math.max(ans, dd);

            out.println(ans);
        }

        private void dfs(int[] dist, int from, HashMap<Integer, List<Integer>> map, int[] indegree) {
            int d = dist[from];
            for (int j = 0; j < map.getOrDefault(from, new ArrayList<>()).size(); j++) {
                int to = map.get(from).get(j);
                dist[to] = Math.max(dist[to], d + 1);
                indegree[to]--;
                if (indegree[to] == 0) dfs(dist, to, map, indegree);
            }
        }

    }
}

