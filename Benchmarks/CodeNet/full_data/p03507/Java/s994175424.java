import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.math.BigInteger;
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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            BigInteger k = BigInteger.valueOf(in.nextInt());

            long[] w = new long[n];
            long[] d = new long[n];
            for (int i = 0; i < n; i++) {
                w[i] = in.nextLong();
                d[i] = in.nextLong();
            }

            BigInteger high = BigInteger.valueOf(Long.MAX_VALUE / 2);
            BigInteger low = BigInteger.ZERO;
            while (high.subtract(low).longValue() > 1) {
                BigInteger mid = high.add(low).shiftRight(1);

                BigInteger sum = BigInteger.ZERO;
                for (int i = 0; i < n; i++) {
                    if (mid.longValue() < w[i]) continue;
                    sum = sum.add(BigInteger.valueOf((mid.longValue() - w[i]) / d[i] + 1));
                }

                if (sum.compareTo(k) >= 0) {
                    high = mid;
                } else {
                    low = mid;
                }
            }

            out.println(high);
        }

    }

    static class InputReader {
        BufferedReader in;
        StringTokenizer tok;

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

        public long nextLong() {
            return Long.parseLong(nextString());
        }

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
            tok = new StringTokenizer("");
        }

    }
}

