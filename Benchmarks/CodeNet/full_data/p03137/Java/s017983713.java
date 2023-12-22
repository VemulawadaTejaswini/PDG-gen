import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Comparator;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author anand.oza
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
            int n = in.nextInt();
            int m = in.nextInt();
            Long[] x = new Long[m];
            for (int i = 0; i < m; i++) {
                x[i] = in.nextLong();
            }
            Arrays.sort(x);

            Long[] diffs = new Long[m - 1];
            for (int i = 0; i < m - 1; i++) {
                diffs[i] = x[i + 1] - x[i];
            }
            Arrays.sort(diffs, Comparator.reverseOrder());
            int remove = n - 1;
            for (int i = 0; i < Math.min(remove, m - 1); i++) {
                diffs[i] = 0L;
            }
            long answer = 0;
            for (long d : diffs) {
                answer += d;
            }

            out.println(answer);
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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

