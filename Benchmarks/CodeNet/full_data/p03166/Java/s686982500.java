import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.Set;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Gabriel Carrillo
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        GLongestPath solver = new GLongestPath();
        solver.solve(1, in, out);
        out.close();
    }

    static class GLongestPath {
        List<Set<Integer>> graph = new ArrayList<>();

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            Set<Integer> visited = new HashSet<>();
            Stack<Integer> stack = new Stack<>();
            int n = in.nextInt(), m = in.nextInt();
            int[] sorted = new int[n + 1];
            int[] dp = new int[n + 1];
            int ans = 0;

            for (int i = 0; i <= n; i++)
                graph.add(new HashSet<>());
            for (int i = 0; i < m; i++) {
                int from = in.nextInt();
                int to = in.nextInt();
                graph.get(from).add(to);
            }

            for (int i = 1; i < graph.size(); i++)
                dfs(i, stack, visited);
            for (int i = 1; i <= n; i++)
                sorted[i] = stack.pop();

            for (int i = 1; i < dp.length; i++) {
                int from = sorted[i];
                for (int to : graph.get(from)) {
                    dp[to] = Math.max(dp[to], dp[from] + 1);
                    ans = Math.max(ans, dp[to]);
                }
            }

            out.println(ans);
        }

        void dfs(int node, Stack<Integer> stack, Set<Integer> visited) {
            if (visited.contains(node))
                return;
            visited.add(node);
            Set<Integer> neighbors = graph.get(node);
            for (Integer next : neighbors)
                dfs(next, stack, visited);
            stack.push(node);
        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void close() {
            writer.close();
        }

        public void println(int i) {
            writer.println(i);
        }

    }

    static class InputReader {
        BufferedReader br;
        StringTokenizer st;

        public InputReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public InputReader(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

