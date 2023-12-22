import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.HashMap;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.util.ArrayDeque;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Hamza Hasbi
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        D_Fennec_VS_Snuke solver = new D_Fennec_VS_Snuke();
        solver.solve(1, in, out);
        out.close();
    }

    static class D_Fennec_VS_Snuke {
        private static final int inf = Integer.MAX_VALUE;
        private static int n;
        private static int ans = 0;
        private static HashMap<Integer, ArrayList<Integer>> graph = new HashMap<>();
        private static int[] vis = new int[100005];
        private static int[] parent = new int[100005];
        private static int[] color = new int[100005];

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            n = in.nextInt();
            graph.clear();

            for (int i = 0; i < n - 1; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                if (!graph.containsKey(a)) {
                    graph.put(a, new ArrayList<Integer>());
                }
                if (!graph.containsKey(b)) {
                    graph.put(b, new ArrayList<Integer>());
                }
                graph.get(a).add(b);
                graph.get(b).add(a);
            }
            color[1] = 1;
            color[n] = 2;
            bfs(1);
            int max_dis = vis[n];
            int first = (int) Math.ceil(max_dis / 2.0);
            int second = (int) Math.floor(max_dis / 2.0);
            int des = n;
            Arrays.fill(vis, 0);
            //out.printLine(first+" "+second);
            vis[1] = 1;
            vis[n] = 1;
            while (des > 0) {
                if (parent[des] == -1) break;
                vis[parent[des]] = 1;
                des = parent[des];
            }
            first += dfs(1);
            ans = 0;
            second += dfs(n);
            //out.printLine(first+" "+second);
            out.printLine(first >= second ? "Fennec" : "Snuke");

        }

        public static int dfs(int node) {
            if (vis[node] != 1) ans++;
            vis[node] = 1;

            for (int vertex : graph.get(node)) {
                if (vis[vertex] == 0) {
                    //System.out.println(node+"->"+vertex);
                    dfs(vertex);
                }
            }
            return ans;
        }

        public static void bfs(int node) {
            Arrays.fill(vis, inf);
            Arrays.fill(parent, -1);
            vis[node] = 1;
            ArrayDeque<Integer> q = new ArrayDeque<>();
            q.push(node);
            parent[node] = -1;
            while (!q.isEmpty()) {
                int vertex = q.poll();

                for (int v : graph.get(vertex)) {
                    if (vis[v] == inf) {
                        parent[v] = vertex;
                        vis[v] = vis[vertex] + 1;
                        q.push(v);
                    }
                }

            }
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

        public void printLine(String s) {
            writer.println(s);
        }

        public void close() {
            writer.close();
        }

    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer st;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            st = null;
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String line = reader.readLine();
                    if (line == null) {
                        return null;
                    }
                    st = new StringTokenizer(line);
                } catch (Exception e) {
                    throw new RuntimeException();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

