import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
            int n = in.nextInt(), m = in.nextInt(), mat[][] = new int[n + 2][m + 2];
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < m; ++j) {
                    mat[i][j] = in.nextInt();
                }
            }
            int cnt = 0;
            ArrayList<Integer> r = new ArrayList<>(), c = new ArrayList<>(), r1 = new ArrayList<>(), c1 = new ArrayList<>();
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < m - 1; ++j) {
                    if ((mat[i][j] & 1) == 1) {
                        r.add(i + 1);
                        c.add(j + 1);
                        r1.add(i + 1);
                        c1.add(j + 2);
                        ++mat[i][j + 1];
                        ++cnt;
                    }
                }
            }

            for (int i = 0; i < n - 1; ++i) {
                if ((mat[i][m - 1] & 1) == 1) {
                    r.add(i + 1);
                    c.add(m);
                    r1.add(i + 2);
                    c1.add(m);
                    ++mat[i + 1][m - 1];
                    ++cnt;
                }
            }

            out.println(cnt);
            for (int i = 0; i < r.size(); ++i) out.printf("%d %d %d %d\n", r.get(i), c.get(i), r1.get(i), c1.get(i));
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

