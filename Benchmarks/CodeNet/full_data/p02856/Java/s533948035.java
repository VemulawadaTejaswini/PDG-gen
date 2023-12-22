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
 *
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DDigitSumReplace solver = new DDigitSumReplace();
        solver.solve(1, in, out);
        out.close();
    }

    static class DDigitSumReplace {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int m = in.nextInt();
            int[] d = new int[m];
            long[] c = new long[m];
            for (int i = 0; i < m; i++) {
                d[i] = in.nextInt();
                c[i] = in.nextLong();
            }

//        int tot = 0;
//        for (long x : c)
//            tot += x;
//        int[] digits = new int[tot];
//        for (int i = 0, index = 0; i < m; i++) {
//            for (int j = 0; j < c[i]; j++)
//                digits[index++] = d[i];
//        }
//        out.println(f(digits));

            long answer = 0;
            for (int i = 0; i < m; i++) {
                answer += f(d[i], c[i]);
                int newD = (int) ((d[i] * c[i]) % 9);
                if (newD == 0 && d[i] > 0)
                    newD = 9;
                d[i] = newD;
            }
            answer += f(d);

            out.println(answer);
        }

        private static int twoDigitsResult(int a, int b) {
            int r = a + b;
            int result = 1;
            while (r > 9) {
                a = r / 10;
                b = r % 10;
                r = a + b;
                result++;
            }
            return r;
        }

        private static long twoDigitsCount(int a, int b) {
            int r = a + b;
            int result = 1;
            while (r > 9) {
                a = r / 10;
                b = r % 10;
                r = a + b;
                result++;
            }
            return result;
        }

        private static long f(int d, long c) {
            int curLeft = d;
            long result = 0;
            long cycle = -1;
            int cycleLength = -1;
            int digitsConsumed = 0;
            c--;
            while (digitsConsumed < c) {
                result += twoDigitsCount(curLeft, d);
                curLeft = twoDigitsResult(curLeft, d);
                digitsConsumed++;
                if (curLeft == d && cycle < 0) {
                    cycle = result;
                    cycleLength = digitsConsumed;
                }
                if (cycle > 0 && (c - digitsConsumed) % cycleLength == 0) {
                    break;
                }
            }
            if (digitsConsumed < c) {
                result += cycle * ((c - digitsConsumed) / cycleLength);
            }
            return result;
        }

        private static long f(int[] digits) {
            int cur = digits[0];
            long result = 0;
            for (int i = 1; i < digits.length; i++) {
                result += twoDigitsCount(cur, digits[i]);
                cur = twoDigitsResult(cur, digits[i]);
            }
            return result;
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

