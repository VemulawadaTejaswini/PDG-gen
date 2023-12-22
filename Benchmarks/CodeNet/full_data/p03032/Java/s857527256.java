import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        DEqueue solver = new DEqueue();
        solver.solve(1, in, out);
        out.close();
    }

    static class DEqueue {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt(), K = in.nextInt(), a[] = new int[n], vis[] = new int[n];
            for (int i = 0; i < n; ++i) a[i] = in.nextInt();

            int ans = 0;
            for (int i = 0; i <= Math.min(n, K); ++i) {
                for (int j = 0; i + j <= K && i + j <= n; ++j) {
                    int qt = 0, cur = 0;
                    for (int k = 0; k < i; ++k) {
                        vis[qt++] = a[k];
                        cur += a[k];
                    }
                    for (int k = 0; k < j; ++k) {
                        vis[qt++] = a[n - 1 - k];
                        cur += a[n - 1 - k];
                    }
                    Arrays.sort(vis, 0, qt);

                    int remove = 0;
                    for (int k = 0; k < qt && k < K - i - j && vis[k] < 0; ++k) remove += vis[k];

                    ans = Math.max(ans, cur - remove);
                }
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

