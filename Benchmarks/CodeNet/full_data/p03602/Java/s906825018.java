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
 * @author HossamDoma
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
        public void solve(int testNumber, InputReader in, PrintWriter out) {

            int n = in.nextInt();

            int[][] a = new int[n + 1][n + 1];
            for (int i = 1; i <= n; ++i) {
                for (int j = 1; j <= n; ++j) {
                    a[i][j] = in.nextInt();
                }
            }

            boolean[][] bad = new boolean[n + 1][n + 1];

            for (int i = 1; i <= n; ++i) {
                for (int j = 1; j <= n; ++j) {
                    for (int k = 1; k <= n; ++k) {
                        if (i == k || j == k) continue;
                        if (a[i][j] > a[i][k] + a[k][j]) {
                            out.println(-1);
                            return;
                        } else if (a[i][j] == a[i][k] + a[k][j])
                            bad[i][j] = true;
                    }
                }
            }


            long ans = 0;
            for (int i = 1; i <= n; ++i) {
                for (int j = i + 1; j <= n; ++j) {
                    if (bad[i][j]) continue;
                    else ans += a[i][j];
                }
            }

            out.println(ans);


        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;
        public String test_string;

        public InputReader(InputStream test_stringeam) {
            reader = new BufferedReader(new InputStreamReader(test_stringeam), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    String line = null;
                    if (test_string != null) {
                        line = test_string;
                        test_string = null;
                    } else
                        line = reader.readLine();

                    tokenizer = new StringTokenizer(line);
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

