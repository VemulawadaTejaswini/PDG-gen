import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
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
        OutputWriter out = new OutputWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        int blocked;
        int[] visited;
        List<Integer>[] graph;
        int[][] edges;
        double count;
        double sum;

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int N = in.nextInt(), M = in.nextInt();
            graph = new List[N];
            for (int i = 0; i < N; i++) {
                graph[i] = new ArrayList();
            }
            visited = new int[N];
            edges = new int[M][2];
            for (int i = 0; i < M; i++) {
                int u = in.nextInt() - 1, v = in.nextInt() - 1;
                edges[i][0] = u;
                edges[i][1] = v;
                graph[u].add(v);
            }
            blocked = -1;
            count = 0;
            sum = 0;
            dfs(0, 0);
            double ans = 0;
            if (count > 0) {
                ans = sum / count;
            }
            for (int i = 0; i < M; i++) {
                blocked = i;
                sum = 0;
                count = 0;
                dfs(0, 0);
                if (count > 0) {
                    ans = Math.min(ans, sum / count);
                }
//            DebugUtils.debug(sum ,count, ans, i);
            }
            out.printLine(ans);
        }

        public void dfs(int node, int depth) {
            if (node == visited.length - 1) {
                sum += depth;
                count++;
                return;
            }
            for (int v : graph[node]) {
                if (blocked != -1 && edges[blocked][0] == node && edges[blocked][1] == v) {
                    continue;
                }
                dfs(v, depth + 1);
            }
        }

    }

    static class OutputWriter {
        PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
        }

        public void printLine(Object... objects) {
            print(objects);
            writer.println();
        }

        public void close() {
            writer.close();
        }

    }

    static class InputReader {
        BufferedReader in;
        StringTokenizer tokenizer = null;

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
        }

        public String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(in.readLine());
                }
                return tokenizer.nextToken();
            } catch (IOException e) {
                return null;
            }
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

