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
        TaskH solver = new TaskH();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskH {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long[] arr = new long[n + 1];
            for (int i = 1; i < n; i++) arr[i] = in.nextInt();
            int m = in.nextInt();
            if (m != 1) System.exit(1);
            arr[n] = in.nextInt();
            long[] psum = new long[n + 1];
            for (int i = 1; i <= n; i++) psum[i] = psum[i - 1] + arr[i];

            long[] f = new long[n + 1];
            f[n] = arr[n];
            long cmax = arr[n] - psum[n - 1];
            for (int i = n - 1; i >= 1; i--) {
                long cur = arr[i] - f[i + 1] - psum[i - 1];
                cmax = Math.max(cur, cmax);
                f[i] = cmax + psum[i - 1];
            }
            out.println(f[3] + arr[1] - arr[2]);
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

