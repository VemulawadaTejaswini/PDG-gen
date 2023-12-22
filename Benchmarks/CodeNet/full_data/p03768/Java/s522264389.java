import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.InputMismatchException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.ArrayList;

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
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        Graph graph;
        int[][] dp;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            graph = new Graph(n);

            int m = in.nextInt();
            for (int i = 0; i < m; i++) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                graph.addEdge(a, b);
            }

            dp = new int[100010][11];

            int q = in.nextInt();
            int[] v = new int[q];
            int[] d = new int[q];
            int[] c = new int[q];
            for (int i = 0; i < q; i++) {
                v[i] = in.nextInt() - 1;
                d[i] = in.nextInt();
                c[i] = in.nextInt();
            }
            for (int i = q - 1; i >= 0; i--) {
                rec(v[i], d[i], c[i]);
            }

            for (int i = 0; i < n; i++) {
                out.println(dp[i][0]);
            }
        }

        void rec(int v, int d, int c) {
            if (dp[v][d] > 0) return;

            dp[v][d] = c;
            if (d == 0) return;

            for (int to : graph.get(v)) {
                rec(to, d - 1, c);
            }
            rec(v, d - 1, c);
        }

    }

    static class Graph {
        int n;
        ArrayList<Integer>[] G;

        public Graph(int n) {
            this.n = n;
            G = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                G[i] = new ArrayList<>();
            }
        }

        public void addEdge(int from, int to) {
            G[from].add(to);
            G[to].add(from);
        }

        public ArrayList<Integer> get(int from) {
            return G[from];
        }

    }

    static class InputReader {
        BufferedReader in;
        StringTokenizer tok;

        public String nextString() {
            while (!tok.hasMoreTokens()) {
                try {
                    tok = new StringTokenizer(in.readLine(), " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
            return tok.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
            tok = new StringTokenizer("");
        }

    }
}

