import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.InputMismatchException;
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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[] x = in.nextIntArray(n);
            int[] y = in.nextIntArray(m);

            long MOD = 1000000007;

            long xSum = 0;
            for (int i = 0; i < n - 1; i++) {
                long cnt = (long) (i + 1) * (n - 1 - i) % MOD;
                long sum = (x[i + 1] - x[i]) * cnt % MOD;
                xSum = (xSum + sum) % MOD;
            }

            long ySum = 0;
            for (int i = 0; i < m - 1; i++) {
                long cnt = (long) (i + 1) * (m - 1 - i) % MOD;
                long sum = (y[i + 1] - y[i]) * cnt % MOD;
                ySum = (ySum + sum) % MOD;
            }

            long ans = xSum * ySum % MOD;
            out.println(ans);
        }

    }

    static class InputReader {
        private BufferedReader in;
        private StringTokenizer tok;

        public String nextString() {
            while (!tok.hasMoreTokens()) {
                try {
                    tok = new StringTokenizer(in.readLine(), " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
            return tok.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

        public int[] nextIntArray(int n) {
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt();
            }
            return res;
        }

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
            tok = new StringTokenizer("");
        }

    }
}

