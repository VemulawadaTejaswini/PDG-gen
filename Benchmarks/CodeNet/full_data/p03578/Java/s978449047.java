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
 * @author Yuan Lei
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task1001 solver = new Task1001();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task1001 {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; ++i) {
                a[i] = in.nextInt();
            }
            int m = in.nextInt();
            int[] b = new int[m];
            for (int i = 0; i < m; ++i) {
                b[i] = in.nextInt();
            }
            Arrays.sort(a);
            Arrays.sort(b);
            int now = 0;
            for (int i = 0; i < m; ++i) {
                while (a[now] < b[i]) {
                    ++now;
                }
                if (a[now] > b[i]) {
                    out.println("NO");
                    return;
                } else {
                    ++now;
                }
            }
            out.println("YES");
        }

    }

    static class InputReader {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public boolean hasNext() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    final String line = reader.readLine();
                    if (line == null) return false;
                    tokenizer = new StringTokenizer(line);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return true;
        }

        public String next() {
            if (hasNext()) return tokenizer.nextToken();
            return null;
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

