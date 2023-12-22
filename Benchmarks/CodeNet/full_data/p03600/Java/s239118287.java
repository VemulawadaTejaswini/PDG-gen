import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DRestoringRoadNetwork solver = new DRestoringRoadNetwork();
        solver.solve(1, in, out);
        out.close();
    }

    static class DRestoringRoadNetwork {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long[][] a = new long[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = in.nextInt();
                }
            }

            for (int k = 0; k < n; k++) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (a[i][j] > a[i][k] + a[k][j]) {
                            out.println(-1);
                            return;
                        }
                    }
                }
            }

            DRestoringRoadNetwork.Edge[] edges = new DRestoringRoadNetwork.Edge[n * (n - 1) / 2];
            long answer = 0;
            for (int i = 0, index = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    edges[index++] = new DRestoringRoadNetwork.Edge(i, j, a[i][j]);
                    answer += a[i][j];
                }
            }

//        Arrays.sort(edges, Comparator.comparingLong(e -> -e.length));

            for (DRestoringRoadNetwork.Edge e : edges) {
                for (int k = 0; k < n; k++) {
                    if (k == e.i || k == e.j) {
                        continue;
                    }
                    if (a[e.i][k] + a[k][e.j] == a[e.i][e.j]) {
                        answer -= e.length;
                        break;
                    }
                }
            }

            out.println(answer);
        }

        static class Edge {
            final int i;
            final int j;
            final long length;

            Edge(int i, int j, long length) {
                this.i = i;
                this.j = j;
                this.length = length;
            }

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

