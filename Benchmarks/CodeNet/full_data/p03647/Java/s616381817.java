import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Queue;
import java.util.LinkedList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author vikas.k
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int N = in.nextInt();
            int M = in.nextInt();

            BFS bfs = new BFS(N);
            for (int i = 1; i <= M; i++) {
                int x = in.nextInt();
                int y = in.nextInt();

                bfs.addEdge(x, y, false);
            }

            bfs.runProcess(1, N);
            int[] dist = bfs.getDistanceArray();
            if (dist[N] == 2) {
                out.print("POSSIBLE");
                return;
            }
            out.print("IMPOSSIBLE");
        }

        private class BFS {
            private ArrayList<Integer>[] G;
            private int N;
            private int[] visited;
            private int[] distance;
            private int color;

            private BFS(int countVertices) {
                N = countVertices;
                G = new ArrayList[N + 1];

                for (int i = 1; i <= N; i++) {
                    G[i] = new ArrayList<>();
                }
                visited = new int[N + 1];
            /*
              mark all vertices as unvisited & distance as Integer max value
             */
                Arrays.fill(visited, 0);
                distance = new int[N + 1];
                Arrays.fill(distance, Integer.MAX_VALUE);
                color = 1;
            }

            private void addEdge(int u, int v, boolean directed) {
                G[u].add(v);
                if (!directed) {
                    G[v].add(u);
                }
            }

            private void runProcess(int start, int end) {
                Queue<Integer> queue = new LinkedList<>();
                distance[start] = 0;
                queue.add(start);

                while (!queue.isEmpty()) {
                    int u = queue.poll();

                    if (visited[u] > 0) continue;
                    visited[u] = color;

                    if (end != Integer.MAX_VALUE && u == end) break;

                    int d = distance[u];
                    for (int v : G[u]) {
                        if (visited[v] > 0) continue;
                        if (distance[v] == Integer.MAX_VALUE || distance[v] > d + 1) {
                            distance[v] = d + 1;
                            queue.add(v);
                        }
                    }
                }
            }

            private int[] getDistanceArray() {
                return distance;
            }

        }

    }

    static class FastScanner {
        private BufferedReader bufferedReader;
        private StringTokenizer stringTokenizer;

        public FastScanner(InputStream inputStream) {
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        }

        public String next() {
            if (stringTokenizer == null || !stringTokenizer.hasMoreElements()) {
                try {
                    stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return stringTokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

