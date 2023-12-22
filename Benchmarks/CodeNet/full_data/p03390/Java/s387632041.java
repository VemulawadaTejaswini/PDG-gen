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
        DWorstCase solver = new DWorstCase();
        solver.solve(1, in, out);
        out.close();
    }

    static class DWorstCase {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int q = in.nextInt();
            for (int i = 0; i < q; i++) {
                solve(in, out);
            }
        }

        public void solve(InputReader in, PrintWriter out) {
            long a = in.nextInt(), b = in.nextInt();
            if (a > b) {
                long t = a;
                a = b;
                b = t;
            }
            long score = a * b;
            long sqrt = BinarySearch.binarySearchLong(x -> x * x >= score);
            sqrt--;

            // sqrt*sqrt < score

            long answer;
            if (sqrt * (sqrt + 1) >= score) {
                // then we pair sqrt*sqrt and so forth
                answer = sqrt * 2 - 2;
                // -1 because we paired sqrt*sqrt and -1 for (a, something)
                if (a > sqrt) {
                    answer++;
                }
            } else {
                answer = sqrt * 2 - 1;
                // we pair (s, s+1) and (s-1, s+2) and so forth so it's 2*s
                // -1 because of (a, something)

                if (a > sqrt) {
                    answer++;
                }
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

            for (tooBig = 1; !bigEnough.apply(tooBig); tooBig *= 2) ;

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

    }
}

