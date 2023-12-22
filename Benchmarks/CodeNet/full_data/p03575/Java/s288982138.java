import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Vector;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Stack;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Pradyumn
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        List<Integer>[] graph;
        boolean[] visited;
        Stack<Integer> stack;
        int time;
        int[] tin;
        int[] lowlink;
        List<List<Integer>> components;
        List<Integer> cutPoints;
        List<String> bridges;

        public void solve(int testNumber, FastReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            List<Integer>[] graph = new List[n];
            for (int i = 0; i < n; i++) {
                graph[i] = new ArrayList<>();
            }
            for (int i = 0; i < m; i++) {
                int x = in.nextInt() - 1;
                int y = in.nextInt() - 1;
                graph[x].add(y);
                graph[y].add(x);
            }
            biconnectedComponents(graph);
            out.println(bridges.size());
        }

        public List<List<Integer>> biconnectedComponents(List<Integer>[] graph) {
            int n = graph.length;
            this.graph = graph;
            visited = new boolean[n];
            stack = new Stack<>();
            time = 0;
            tin = new int[n];
            lowlink = new int[n];
            components = new ArrayList<>();
            cutPoints = new ArrayList<>();
            bridges = new ArrayList<>();

            for (int u = 0; u < n; u++)
                if (!visited[u])
                    dfs(u, -1);

            return components;
        }

        void dfs(int u, int p) {
            visited[u] = true;
            lowlink[u] = tin[u] = time++;
            stack.add(u);
            int children = 0;
            boolean cutPoint = false;
            for (int v : graph[u]) {
                if (v == p)
                    continue;
                if (visited[v]) {
                    // lowlink[u] = Math.min(lowlink[u], lowlink[v]);
                    lowlink[u] = Math.min(lowlink[u], tin[v]);
                } else {
                    dfs(v, u);
                    lowlink[u] = Math.min(lowlink[u], lowlink[v]);
                    cutPoint |= lowlink[v] >= tin[u];
                    //if (lowlink[v] == tin[v])
                    if (lowlink[v] > tin[u])
                        bridges.add("(" + u + "," + v + ")");
                    ++children;
                }
            }
            if (p == -1)
                cutPoint = children >= 2;
            if (cutPoint)
                cutPoints.add(u);
            if (lowlink[u] == tin[u]) {
                List<Integer> component = new ArrayList<>();
                while (true) {
                    int x = stack.pop();
                    component.add(x);
                    if (x == u)
                        break;
                }
                components.add(component);
            }
        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[8192];
        private int curChar;
        private int pnumChars;
        private FastReader.SpaceCharFilter filter;

        public FastReader(InputStream stream) {
            this.stream = stream;
        }

        private int pread() {
            if (pnumChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= pnumChars) {
                curChar = 0;
                try {
                    pnumChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (pnumChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = pread();
            while (isSpaceChar(c))
                c = pread();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = pread();
            }
            int res = 0;
            do {
                if (c == ',') {
                    c = pread();
                }
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = pread();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        private boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        private static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        private interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

