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
            long[] x = new long[n];
            for (int i = 0; i < n; ++i) {
                x[i] = in.nextInt();
            }
            long res = Long.MAX_VALUE;
            for (long trips = n; trips >= 1; --trips) {
                int cnt = 0;
                int val = 5;
                int iter = 0;
                long cur = 0;
                for (int i = n - 1; i >= 0; --i) {
                    if (cnt == trips) {
                        cnt = 0;
                        ++iter;
                        if (iter > 1)
                            val += 2;
                    }
                    ++cnt;
                    cur += val * x[i];
                }
                if (cur >= res) break;
                res = Math.min(res, cur + penalty * trips);
            }
            out.println(res + penalty * n);
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

