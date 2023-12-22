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
 * @author __shangu__
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DMakeThemEven solver = new DMakeThemEven();
        solver.solve(1, in, out);
        out.close();
    }

    static class DMakeThemEven {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt(), m = in.nextInt(), mat[][] = new int[n][m], cnt = 0;
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < m; ++j) {
                    mat[i][j] = in.nextInt();
                    if (i != n - 1 || j != m - 1) cnt += mat[i][j];
                }
            }

            out.println(cnt);
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < m - 1; ++j) {
                    for (int k = 0; k < mat[i][j]; ++k) {
                        out.printf("%d %d %d %d\n", i + 1, j + 1, i + 1, j + 2);
                    }
                    mat[i][j + 1] += mat[i][j];
                }
            }

            for (int i = 0; i < n - 1; ++i) {
                out.printf("%d %d %d %d\n", i + 1, m, i + 2, m);
                mat[i + 1][m - 1] += mat[i][m - 1];
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

