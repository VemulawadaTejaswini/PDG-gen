import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(in, out);
        out.close();
    }

    static class Task {
        void solve(InputReader in, PrintWriter out) {
            int H = in.nextInt();
            int W = in.nextInt();

            FloydWarshall fws = new FloydWarshall(10);
            for (int i = 0; i <= 9; ++i) {
                for (int j = 0; j <= 9; ++j) {
                    int c = in.nextInt();
                    fws.addEdge(i, j, c);
                }
            }

            fws.setDistances();

            int ans = 0;
            for (int i = 0; i < H; ++i) {
                for (int j = 0; j < W; ++j) {
                    int a = in.nextInt();
                    if (a != -1) {
                        ans += fws.getDistance(a, 1);
                    }
                }
            }
            out.println(ans);
        }
    }

    static class FloydWarshall {
        private static int INF = Integer.MAX_VALUE;
        private int size;
        private int[][] d;

        public FloydWarshall(int n) {
            this.size = n;
            this.d = new int[n][n];
            for (int i = 0; i < n; ++i)
                for (int j = 0; j < n; ++j)
                    d[i][j] = i == j ? 0 : INF;
        }

        public void addEdge(int src, int dest, int weight) {
            d[src][dest] = weight;
        }

        public int getDistance(int src, int dest) {
            return d[src][dest];
        }

        public void setDistances() {
            for (int k = 0; k < size; ++k) {
                for (int i = 0; i < size; ++i) {
                    if (d[i][k] == INF) continue;
                    for (int j = 0; j < size; ++j) {
                        if (d[k][j] == INF) continue;
                        d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
                    }
                }
            }
        }

        public boolean hasNegativeCycle() {
            for (int i = 0; i < size; ++i) {
                if (d[i][i] < 0) return true;
            }
            return false;
        }
    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            tokenizer = null;
        }

        String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}