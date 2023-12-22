import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Collection;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Queue;
import java.util.LinkedList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Wolfgang Beyer
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        SplatterPainting solver = new SplatterPainting();
        solver.solve(1, in, out);
        out.close();
    }

    static class SplatterPainting {
        int[][] g;
        int[] nodeColor;
        int[] coloredDistance;
        int n;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            n = in.nextInt();
            int m = in.nextInt();
            int[] u = new int[m];
            int[] v = new int[m];
            int[] degree = new int[n];
            for (int i = 0; i < m; i++) {
                u[i] = in.nextInt() - 1;
                v[i] = in.nextInt() - 1;
                degree[u[i]]++;
                degree[v[i]]++;
            }
            int q = in.nextInt();
            int[] origin = new int[q];
            int[] dist = new int[q];
            int[] color = new int[q];
            for (int i = 0; i < q; i++) {
                origin[i] = in.nextInt() - 1;
                dist[i] = in.nextInt();
                color[i] = in.nextInt();
            }

            g = new int[n][];
            for (int i = 0; i < n; i++) {
                g[i] = new int[degree[i]];
            }
            int[] pointers = new int[n];
            for (int i = 0; i < m; i++) {
                g[u[i]][pointers[u[i]]++] = v[i];
                g[v[i]][pointers[v[i]]++] = u[i];
            }

            nodeColor = new int[n];
            coloredDistance = new int[n];

            for (int i = q - 1; i >= 0; i--) {
                bfs(origin[i], dist[i], color[i]);
            }

            for (int i = 0; i < n; i++) {
                out.println(nodeColor[i] + " ");
            }
        }

        void bfs(int node, int dist, int color) {
            boolean[] visited = new boolean[n];
            Queue<Element> stack = new LinkedList<>();
            stack.add(new Element(node, dist));
            visited[node] = true;
            while (!stack.isEmpty()) {
                Element currentElement = stack.remove();
                if (nodeColor[currentElement.node] == 0) {
                    nodeColor[currentElement.node] = color;
                }
                if (currentElement.dist > coloredDistance[currentElement.node]) {
                    coloredDistance[currentElement.node] = currentElement.dist;
                    for (int neighbor : g[currentElement.node]) {
                        //if (!visited[neighbor]) {
                        if (currentElement.dist - 1 >= coloredDistance[neighbor]) {
                            stack.add(new Element(neighbor, currentElement.dist - 1));
                            visited[neighbor] = true;
                        }
                    }
                }
            }
        }

        class Element {
            int node;
            int dist;

            public Element(int n, int d) {
                node = n;
                dist = d;
            }

        }

    }

    static class InputReader {
        private static BufferedReader in;
        private static StringTokenizer tok;

        public InputReader(InputStream in) {
            this.in = new BufferedReader(new InputStreamReader(in));
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String next() {
            try {
                while (tok == null || !tok.hasMoreTokens()) {
                    tok = new StringTokenizer(in.readLine());
                    //tok = new StringTokenizer(in.readLine(), ", \t\n\r\f"); //adds commas as delimeter
                }
            } catch (IOException ex) {
                System.err.println("An IOException was caught :" + ex.getMessage());
            }
            return tok.nextToken();
        }

    }
}

