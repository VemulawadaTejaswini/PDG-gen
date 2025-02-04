import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
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
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ProblemE_MajorityOfBalls solver = new ProblemE_MajorityOfBalls();
        solver.solve(1, in, out);
        out.close();
    }

    static class ProblemE_MajorityOfBalls {
        FastScanner in;
        PrintWriter out;
        int n;
        char[] ans;
        List<Edge>[] edges;
        int knownR;

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            this.in = in;
            this.out = out;
            n = in.nextInt();
            ans = new char[2 * n];
            edges = new List[2 * n];
            for (int i = 0; i < edges.length; i++) {
                edges[i] = new ArrayList<>();
            }

            int[][] order = new int[2][2 * n + 1];
            for (int i = 0; i < order[0].length; i++) {
                order[0][i] = i;
            }

            int ptr = 0;
            for (int i = 0; i < 2 * n; i += 2) {
                order[1][2 * i] = ptr++;
            }

            for (int i = 1; i < 2 * n; i += 2) {
                order[1][2 * i] = ptr++;
            }

            knownR = -1;

            for (int step = 0; step < 2; step++) {
                char prev = '.';
                for (int i = 0; i <= n; i++) {
                    char cur = send(order[step], i, i + n);
                    if (i > 0) {
                        int u = order[step][i];
                        int v = order[step][(i + n) % (2 * n)];
                        addEdge(u, v, prev == cur);
                        if (prev != cur) {
                            if (cur == 'R') {
                                knownR = v;
                            } else {
                                knownR = u;
                            }
                        }
                    }
                    prev = cur;
                }
            }

            Arrays.fill(ans, '.');
            if (knownR < 0) {
                throw new AssertionError();
            }
            dfs(knownR, 'R');
            for (char c : ans) {
                if (c == '.') {
                    throw new AssertionError();
                }
            }

            sendAns();
        }

        private void dfs(int v, char c) {
            ans[v] = c;
            for (Edge e : edges[v]) {
                int u = e.dst;
                if (ans[u] != '.') {
                    continue;
                }
                char oc = (char) (c ^ 'R' ^ 'B');
                dfs(u, e.same ? c : oc);
            }
        }

        private void addEdge(int a, int b, boolean c) {
            edges[a].add(new Edge(b, c));
            edges[b].add(new Edge(a, c));
        }

        private char send(int[] a, int l, int r) {
            out.print("?");
            for (int i = l; i < r; i++) {
                out.print(" " + (a[i] + 1));
            }
            out.println();
            out.flush();
            return in.next().equals("Red") ? 'R' : 'B';
        }

        private void sendAns() {
            out.println("! " + new String(ans));
            out.flush();
        }

        class Edge {
            int dst;
            boolean same;

            Edge(int dst, boolean same) {
                this.dst = dst;
                this.same = same;
            }

        }

    }

    static class FastScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public FastScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String rl = in.readLine();
                    if (rl == null) {
                        return null;
                    }
                    st = new StringTokenizer(rl);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

