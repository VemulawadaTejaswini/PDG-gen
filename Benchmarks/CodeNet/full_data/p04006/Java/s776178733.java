import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.OptionalLong;
import java.util.stream.LongStream;
import java.util.function.IntToLongFunction;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BColorfulSlimes solver = new BColorfulSlimes();
        solver.solve(1, in, out);
        out.close();
    }

    static class BColorfulSlimes {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt(), x = in.nextInt();
            long[] a = LongStream.range(0, n).map(z -> in.nextInt()).toArray();

            IntToLongFunction p = m -> {
                long value = m * x;
                for (int i = 0; i < n; i++) {
                    long min = Long.MAX_VALUE;
                    for (int offset = 0; offset <= m; offset++) {
                        min = Math.min(min, a[(i + n - offset) % n]);
                    }
                    value += min;
                }
                return value;
            };

            int min = 0, max = n - 1;
            while (max - min > 2) {
                // System.out.println(min + "-" + max);
                int low = (min + max) / 3;
                int high = (min + max) * 2 / 3;
                if (p.applyAsLong(low) < p.applyAsLong(high)) {
                    max = high;
                } else {
                    min = low;
                }
            }

            out.println(IntStream.rangeClosed(min, max).mapToLong(p).min().orElse(0));
        }

    }
}

