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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        int n;
        int m;

        boolean border(int x, int y) {
            return x >= 0 && x < n && y >= 0 && y < m;
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            n = in.nextInt();
            m = in.nextInt();
            int q = in.nextInt();

            int[] dx = {0, 1, 0, -1, 0};
            int[] dy = {1, 0, -1, 0, 1};

            int[][] g = new int[n][m];
            int cur = 0;
            int x = 0, y = 0;
            for (int k = 0; k < q; ++k) {
                int p = in.nextInt();
                while (p-- > 0) {
                    g[x][y] = k + 1;
                    if (!border(x + dx[cur], y + dy[cur]) || g[x + dx[cur]][y + dy[cur]] > 0) {
                        ++cur;
                    }
                    if (cur == 5) break;
                    x += dx[cur];
                    y += dy[cur];
                }
            }
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < m; ++j) {
                    out.print(g[i][j] + " ");
                }
                out.println();
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

