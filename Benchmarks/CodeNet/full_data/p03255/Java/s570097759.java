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
            long penalty = in.nextInt();
            long simple = 0;
            long[] x = new long[n];
            for (int i = 0; i < n; ++i) {
                x[i] = in.nextInt();
            }
            long[] best = new long[n + 1];
            for (int i = 1; i <= n; ++i) {
                best[i] = Long.MAX_VALUE;
                long sofar = penalty + 2 * x[i - 1];
                int cnt = 0;
                for (int from = i - 1; from >= 0; --from) {
                    ++cnt;
                    long delta1 = x[from] * (2 * cnt + 1) + penalty;
                    long delta2 = 2 * penalty + 5 * x[from];
                    if (delta1 >= delta2) break;
                    sofar += delta1;
                    best[i] = Math.min(best[i], best[from] + sofar);
                }
            }
            out.println(best[n]);
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

