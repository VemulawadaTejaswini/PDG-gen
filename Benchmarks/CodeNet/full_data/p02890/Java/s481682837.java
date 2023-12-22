import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Comparator;
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
        FDistinctNumbers solver = new FDistinctNumbers();
        solver.solve(1, in, out);
        out.close();
    }

    static class FDistinctNumbers {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = in.readIntArray(n);
            Integer[] count = new Integer[n];
            Arrays.fill(count, 0);

            for (int x : a) {
                count[x - 1]++;
            }

            Arrays.sort(count, Comparator.reverseOrder());

            int[] remain = new int[n];
            remain[0] = n - count[0];
            for (int i = 1; i < n; i++) {
                remain[i] = remain[i - 1] - count[i];
            }

            out.println(n); // k=1
            for (int kLoop = 2; kLoop <= n; kLoop++) {
                int k = kLoop;
                int bound = n / k;
                int index = BinarySearch.binarySearch((i) -> {
                    if (k - 1 - i <= 0)
                        return true;
                    if (i <= 0)
                        return false;

                    double boundCur = ((double) remain[i]) / (k - 1 - i);
                    double boundPrev = ((double) remain[i - 1]) / (k - 1 - (i - 1));
                    return boundPrev < boundCur;
                });

                index--;
                bound = Math.min(bound, remain[index] / (k - 1 - index));
                out.println(bound);
            }
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

        public int[] readIntArray(int n) {
            int[] x = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = nextInt();
            }
            return x;
        }

    }

    static class BinarySearch {
        public static int binarySearch(Function<Integer, Boolean> bigEnough) {
            int tooSmall = 0, tooBig;
            if (bigEnough.apply(tooSmall)) {
                return tooSmall;
            }

            for (tooBig = 1; !bigEnough.apply(tooBig); tooBig *= 2)
                ;

            if (!bigEnough.apply(tooBig - 1)) {
                return tooBig;
            }

            while (tooBig - tooSmall > 1) {
                int center = tooSmall + (tooBig - tooSmall) / 2;
                if (!bigEnough.apply(center)) {
                    tooSmall = center;
                } else {
                    tooBig = center;
                }
            }

            return tooBig;
        }

    }
}

