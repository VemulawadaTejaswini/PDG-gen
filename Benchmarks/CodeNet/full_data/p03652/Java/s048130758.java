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
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[][] a = new int[m][n];
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < m; ++j) {
                    a[in.nextInt() - 1][i] = j;
                }
            }
            boolean[] removed = new boolean[m];
            int ans = Integer.MAX_VALUE;
            for (int rep = 0; rep < m; ++rep) {
                int[] mins = new int[m];
                for (int i = 0; i < n; ++i) {
                    int min = Integer.MAX_VALUE;
                    int mj = -1;
                    for (int j = 0; j < m; ++j)
                        if (!removed[j]) {
                            if (a[j][i] < min) {
                                min = a[j][i];
                                mj = j;
                            }
                        }
                    ++mins[mj];
                }
                int maxMin = -1;
                int mj = -1;
                for (int j = 0; j < m; ++j)
                    if (mins[j] > maxMin) {
                        maxMin = mins[j];
                        mj = j;
                    }
                ans = Math.min(ans, maxMin);
                removed[mj] = true;
            }
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

