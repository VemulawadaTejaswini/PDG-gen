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
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ARangeFlipFindRoute solver = new ARangeFlipFindRoute();
        solver.solve(1, in, out);
        out.close();
    }

    static class ARangeFlipFindRoute {
        int ans = Integer.MAX_VALUE;
        int[][] a;
        int h;
        int w;

        public void dfs(int i, int j, int prev, int c) {
            if (a[i][j] != prev && a[i][j] == 0) c++;
            if (i == h - 1 && j == w - 1) {
                ans = Math.min(ans, c);
                return;
            }
            if (i < h - 1) {
                dfs(i + 1, j, a[i][j], c);
            }
            if (j < h - 1) {
                dfs(i, j + 1, a[i][j], c);
            }
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            h = in.nextInt();
            w = in.nextInt();
            a = new int[h][w];
            for (int i = 0; i < h; i++) {
                String x = in.next();
                for (int j = 0; j < w; j++) {
                    if (x.charAt(j) == '.')
                        a[i][j] = 1;
                }
            }
            dfs(0, 0, 1, 0);
            out.println(ans);
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

