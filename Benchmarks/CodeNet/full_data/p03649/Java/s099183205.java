import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.function.Function;
import java.io.InputStreamReader;
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
        EDecreaseJudgeVer solver = new EDecreaseJudgeVer();
        solver.solve(1, in, out);
        out.close();
    }

    static class EDecreaseJudgeVer {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long[] a = new long[n];

            long sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
                sum += a[i];
            }

            Function<Long, Boolean> bigEnough = (operations) -> {
                long splash = -operations;
                for (long m : a) {
                    long operationsOnThisElement = (m - splash - (n - 1)) / (n + 1);
                    if (operationsOnThisElement * (n + 1) < (m - splash - (n - 1))) {
                        operationsOnThisElement++;
                    }
                    if (operationsOnThisElement < 0) {
                        operationsOnThisElement = 0;
                    }
                    operations -= operationsOnThisElement;
                }

                return operations >= 0;
            };

            long answer = bigEnough.apply((long) 0) ? 0 : binarySearch(bigEnough);

            out.println(answer);
        }

        long binarySearch(Function<Long, Boolean> bigEnough) {
            long tooSmall = 0, tooBig;
            for (tooBig = 1; !bigEnough.apply(tooBig); tooBig *= 2) ;

            if (!bigEnough.apply(tooBig - 1)) {
                return tooBig;
            }

            while (tooBig - tooSmall > 1) {
                long center = (tooBig + tooSmall) / 2;
                if (!bigEnough.apply(center)) {
                    tooSmall = center;
                } else {
                    if (!bigEnough.apply(center - 1)) {
                        return center;
                    }
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

