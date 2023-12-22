import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskG solver = new TaskG();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskG {
        private int n;
        private int m;
        private ArrayList<ArrayList<Integer>> g;
        private int[] dp;
        private boolean[] used;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            n = in.nextInt();
            m = in.nextInt();
            g = new ArrayList<>();
            for (int i = 0; i < n; i++)
                g.add(new ArrayList<>());
            for (int i = 0; i < m; i++) {
                int from = in.nextInt() - 1;
                int to = in.nextInt() - 1;
                g.get(from).add(to);
            }
            dp = new int[n];
            for (int i = 0; i < n; i++) {
                used = new boolean[n];
                dfs(i, dp[i]);
            }
            int max = 0;
            for (int v : dp)
                max = Math.max(max, v);
            out.println(max);
        }

        private void dfs(int v, int len) {
            used[v] = true;
            dp[v] = Math.max(dp[v], len);
            for (int to : g.get(v))
                if (!used[to])
                    dfs(to, len + 1);
                else
                    dp[to] = Math.max(dp[to], len + 1);
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

