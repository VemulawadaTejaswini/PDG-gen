import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.function.Function;
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
        FSmallProducts solver = new FSmallProducts();
        solver.solve(1, in, out);
        out.close();
    }

    static class FSmallProducts {
        private static final long mod = 1_000_000_007L;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            long n = in.nextLong();
            int k = in.nextInt();

            int sqrtN = (int) BinarySearch.binarySearchLong(i -> i * i > n);

            long[][] dpSmall = new long[k + 1][sqrtN];
            long[][] dpBig = new long[k + 1][sqrtN];

            dpSmall[0][1] = 1;

            for (int i = 0; i < k; i++) {
                for (int j = 1; j < sqrtN; j++) {
                    dpSmall[i][j] += dpSmall[i][j - 1];
                    dpSmall[i][j] %= mod;
                }
                for (int j = sqrtN - 2; j > 0; j--) {
                    dpBig[i][j] += dpBig[i][j + 1];
                    dpBig[i][j] %= mod;
                }
                for (int j = 1; j < sqrtN; j++) {
                    dpBig[i + 1][j] = dpSmall[i][j] * (n / j - n / (j + 1));
                    if (n / j == j)
                        dpBig[i + 1][j] = 0;
                    dpBig[i + 1][j] %= mod;
                }
                for (int j = 1; j < sqrtN; j++) {
                    dpSmall[i + 1][j] = dpBig[i][j] + dpSmall[i][sqrtN - 1];
                    dpSmall[i + 1][j] %= mod;
                }
            }

            long answer = 0;
            for (long x : dpSmall[k]) {
                answer += x;
                answer %= mod;
            }
            for (long x : dpBig[k]) {
                answer += x;
                answer %= mod;
            }

            out.println(answer);
        }

    }

    static class BinarySearch {
        public static long binarySearchLong(Function<Long, Boolean> bigEnough) {
            long tooSmall = 0, tooBig;
            if (bigEnough.apply(tooSmall)) {
                return tooSmall;
            }

            for (tooBig = 1; !bigEnough.apply(tooBig); tooBig *= 2)
                ;

            if (!bigEnough.apply(tooBig - 1)) {
                return tooBig;
            }

            while (tooBig - tooSmall > 1) {
                long center = (tooBig + tooSmall) / 2;
                if (!bigEnough.apply(center)) {
                    tooSmall = center;
                } else {
                    tooBig = center;
                }
            }

            return tooBig;
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

