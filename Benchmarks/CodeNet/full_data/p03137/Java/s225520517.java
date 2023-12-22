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
        CStreamline solver = new CStreamline();
        solver.solve(1, in, out);
        out.close();
    }

    static class CStreamline {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt(), m = in.nextInt(), a[] = new int[m], diff[] = new int[m];
            if (n >= m) {
                out.println(0);
                return;
            }
            --n;
            for (int i = 0; i < m; ++i) a[i] = in.nextInt();
            Arrays.sort(a);
            for (int i = 1; i < m; ++i) diff[i] = a[i] - a[i - 1];
            Arrays.sort(diff);
            int ans = 0;
            for (int i = 0; i < n; ++i) ans += diff[m - 1 - i];
            out.println(a[m - 1] - a[0] - ans);
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

