
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(final String[] args) {
        final FastScanner scanner = new FastScanner(System.in);
        final int n = scanner.nextInt();
        final long c = scanner.nextLong();

        int centerIndex = 0;
        final Pair[] pairs = new Pair[n];
        for (int i = 0; i < n; i++) {
            final long length = scanner.nextLong();
            final long value = scanner.nextLong();

            if (centerIndex == 0 && length * 2 > c) {
                centerIndex = i;
            }

            pairs[i] = new Pair(length, value);
        }

        final long[] halfAccumulation = new long[centerIndex];
        if (centerIndex != 0) {
            halfAccumulation[0] = pairs[0].value;
            for (int i = 1; i < centerIndex; i++) {
                halfAccumulation[i] = halfAccumulation[i - 1] + pairs[i].value;
            }
        }
        final long[] otherAccumulation = new long[n - centerIndex];
        if (n - centerIndex != 0) {
            otherAccumulation[0] = pairs[n - 1].value;
            for (int i = 1; i < n - centerIndex; i++) {
                otherAccumulation[i] = otherAccumulation[i - 1] + pairs[n - i - 1].value;
            }
        }

        long result = 0;
        {
            long temp = 0;
            for (int i = 0; i < pairs.length; i++) {
                temp += pairs[i].value;
                result = Math.max(result, temp - pairs[i].length);
            }
        }
        {
            long temp = 0;
            for (int i = pairs.length - 1; i >= 0; i--) {
                temp += pairs[i].value;
                result = Math.max(result, temp - (c - pairs[i].length));
            }
        }

        for (int i = 0; i < centerIndex; i++) {
            for (int j = 0; j < n - centerIndex; j++) {
                long temp = halfAccumulation[i] + otherAccumulation[j];
                temp -= Math.max(c - pairs[n - j - 1].length, pairs[i].length) + 2 * Math.min(c - pairs[n - j - 1].length, pairs[i].length);
                result = Math.max(result, temp);
            }
        }

        System.out.println(Math.max(result, 0));
    }

    static class Pair {
        long length;
        long value;

        Pair(final long length, final long value) {
            this.length = length;
            this.value = value;
        }
    }

    static class FastScanner {
        private final BufferedReader reader;
        private StringTokenizer tokenizer;

        FastScanner(final InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            return tokenizer.nextToken("\n");
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}
