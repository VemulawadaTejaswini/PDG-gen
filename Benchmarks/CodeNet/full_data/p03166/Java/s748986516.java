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
        private ArrayList<ArrayList<Integer>> g;
        private boolean[] used;
        private ArrayList<Integer> topSort;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            g = new ArrayList<>();
            for (int i = 0; i < n; i++)
                g.add(new ArrayList<>());
            for (int i = 0; i < m; i++) {
                int from = in.nextInt() - 1;
                int to = in.nextInt() - 1;
                g.get(from).add(to);
            }
            topSort = new ArrayList<>();
            used = new boolean[n];
            for (int i = 0; i < n; i++)
                if (!used[i])
                    dfs(i);
            int[] dp = new int[n];
            for (int i = 0; i < n; i++) {
                int from = topSort.get(i);
                for (int to : g.get(from))
                    dp[from] = Math.max(dp[from], dp[to] + 1);
            }
            int max = 0;
            for (int v : dp)
                max = Math.max(max, v);
            out.println(max);
        }

        private void dfs(int v) {
            used[v] = true;
            for (int to : g.get(v))
                if (!used[to])
                    dfs(to);
            topSort.add(v);
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

