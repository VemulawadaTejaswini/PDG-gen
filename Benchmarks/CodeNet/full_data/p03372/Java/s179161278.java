
import java.util.Arrays;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
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
        for (final Pair pair : pairs) {
            result += pair.value;
        }
        result -= Math.min(pairs[n - 1].length, c - pairs[0].length);

        for (int i = 0; i < centerIndex; i++) {
            for (int j = 0; j < n - centerIndex; j++) {
                long temp = halfAccumulation[i] + otherAccumulation[j];
                temp -= Math.max(c - pairs[n - j - 1].length, pairs[i].length) + 2 * Math.min(c - pairs[n - j - 1].length, pairs[i].length);
                result = Math.max(result, temp);
            }
        }

        System.out.println(Math.max(result,0));
    }

    static class Pair {
        long length;
        long value;

        public Pair(final long length, final long value) {
            this.length = length;
            this.value = value;
        }
    }
}
