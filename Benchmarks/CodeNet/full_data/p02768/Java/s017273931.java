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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        private long MODULO = 1000000007;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            long ans = binPow(2, n) - 1 - c(n, a) - c(n, b);
            for (int i = 0; i < 5; i++)
                ans = mod(ans, MODULO);
            out.println(ans);
        }

        private long c(int n, int k) {
            long res = 1;
            for (int i = 1; i <= k; ++i) {
                res *= (n - k + i);
                res %= MODULO;
                res *= binPow(i, (int) MODULO - 2);
                res %= MODULO;
            }
            return res;
        }

        private long mod(long a, long b) {
            long mod = a % b;
            if (mod >= 0)
                return mod;
            else
                return mod + b;
        }

        private long binPow(long a, int n) {
            if (n == 0)
                return 1;
            if (n == 1)
                return a % MODULO;
            if (n % 2 == 0) {
                long t = binPow(a, n / 2) % MODULO;
                return t * t % MODULO;
            } else
                return a * binPow(a, n - 1) % MODULO;
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

