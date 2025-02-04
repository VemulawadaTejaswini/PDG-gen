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
            int n = in.nextInt(), m = in.nextInt();
            for (int i = 0; i <= n; i++)
                graph.add(new HashSet<>());
            for (int i = 0; i < m; i++) {
                int to = in.nextInt();
                int from = in.nextInt();
                graph.get(to).add(from);
            }
            Set<Integer> visited = new HashSet<>();
            Stack<Integer> stack = new Stack<>();
            for (int i = 1; i < graph.size(); i++)
                dfs(i, stack, visited);

            int[] sorted = new int[graph.size()];
            for (int i = sorted.length - 1; i > 0; i--)
                sorted[i] = stack.pop();

            int[] dp = new int[sorted.length];
            int ans = 0;
            for (int i = 1; i < dp.length; i++) {
                for (int j = 1; j < i; j++) {
                    if (graph.get(sorted[i]).contains(sorted[j])) {
                        dp[i] = Math.max(dp[i], dp[j] + 1);
                    }
                }
                ans = Math.max(ans, dp[i]);
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
}

