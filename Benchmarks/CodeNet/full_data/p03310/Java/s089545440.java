import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.stream.LongStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.OptionalLong;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

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
        LightScanner in = new LightScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DEqualCut solver = new DEqualCut();
        solver.solve(1, in, out);
        out.close();
    }

    static class DEqualCut {
        public void solve(int testNumber, LightScanner in, PrintWriter out) {
            int n = in.ints();
            int[] a = in.ints(n);
            long p = a[0], q = a[1], r = a[2], s = Arrays.stream(a).skip(3).mapToLong(i -> i).sum();
            int ab = 1, bc = 2, cd = 3;
            long ans = Long.MAX_VALUE;
            do {
                while (bc - ab > 1 && Math.abs(p - q) >= Math.abs(p - q + 2 * a[ab])) {
                    p += a[ab];
                    q -= a[ab];
                    ab++;
                }
                while (n - cd > 1 && Math.abs(r - s) >= Math.abs(r - s + 2 * a[cd])) {
                    r += a[cd];
                    s -= a[cd];
                    cd++;
                }
                ans = Math.min(ans, IntMath.max(p, q, r, s) - IntMath.min(p, q, r, s));

                q += a[bc];
                r -= a[bc];
                bc++;
            } while (bc < n - 1);
            out.println(ans);
        }

    }

    static class LightScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int ints() {
            return Integer.parseInt(string());
        }

        public int[] ints(int length) {
            return IntStream.range(0, length).map(x -> ints()).toArray();
        }

    }

    static final class IntMath {
        private IntMath() {
        }

        public static long min(long... v) {
            return Arrays.stream(v).min().orElseThrow(() -> new IllegalArgumentException("Empty argument"));
        }

        public static long max(long... v) {
            return Arrays.stream(v).max().orElseThrow(() -> new IllegalArgumentException("Empty argument"));
        }

    }
}

