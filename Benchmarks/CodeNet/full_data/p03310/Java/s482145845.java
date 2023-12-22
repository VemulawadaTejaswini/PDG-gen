import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();

    public static void main(String[]$) {
        int n = scanner.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = b[i] = scanner.nextInt();
            if (i > 0) {
                b[i] += b[i - 1];
            }
        }
        long min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int j = 0, k = i;
            while (++j <= i && b[j] * 2 <= b[i]);
            while (++k < n && (b[k] - b[i]) * 2 <= b[n - 1] - b[i]);
            for (int j1 = j - 1, l = 0; l < 3; j1++, l++) {
                for (int k1 = k - 1, m = 0; m < 3; k1++, m++) {
                    min = Math.min(min, f(b, j1, i, k1));
                }
            }
        }

        System.out.println(min);
    }

    static long f(long[] array, int i, int j, int k) {
        if (i < j && j < k && 0 < i && k < array.length) {
            long a = array[i - 1];
            long b = array[j - 1] - array[i - 1];
            long c = array[k - 1] - array[j - 1];
            long d = array[array.length - 1] - array[k - 1];
            return Math.max(Math.max(Math.max(a, b), c), d) - Math.min(Math.min(Math.min(a, b), c), d);
        }
        return Integer.MAX_VALUE;
    }

    static class Scanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;

        String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(reader.readLine());
                }
            } catch (IOException ignored) {
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}