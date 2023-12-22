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
        TaskK solver = new TaskK();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskK {
        public ArrayList<Integer>[] graph;
        public int[] deg;
        public int[] size;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            graph = new ArrayList[n];
            deg = new int[n];
            size = new int[n];
            for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();
            for (int i = 0; i < n - 1; i++) {
                int a = in.nextInt() - 1, b = in.nextInt() - 1;
                graph[a].add(b);
                graph[b].add(a);
                deg[a]++;
                deg[b]++;
            }
            int root = -1;
            int ans = 0;
            for (int i = 0; i < n; i++) {
                if (deg[i] > 2) {
                    root = i;
                }
                if (deg[i] == 1) ans++;
            }
            if (root == -1) {
                out.println(n);
                return;
            }

            int[] longest = dfs(0, -1);

            out.println(longest[0] + longest[1] + ans);
        }

        public int[] dfs(int node, int par) {
            int[] longest = new int[2];
            size[node] = 1;
            for (int next : graph[node]) {
                if (next == par) continue;
                int[] cand = dfs(next, node);
                for (int j = 0; j < 2; j++) {
                    if (cand[j] > longest[0]) {
                        longest[1] = longest[0];
                        longest[0] = cand[j];
                    } else if (cand[j] > longest[1]) {
                        longest[1] = cand[j];
                    }
                }
                size[node] += size[next];
            }
            if (deg[node] == 2) longest[0]++;
            return longest;
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

