import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        if (a[0] > 0) {
            System.out.println(-1);
        } else {
            long ans = 0;
            long[] b = new long[n];
            for (int i = n - 1; i > 0; i--) {
                if (i < n - 1) {
                    b[i] = b[i + 1] - 1;
                }
                if (a[i] < b[i]) {
                    System.out.println(-1);
                } else if (a[i] > b[i]) {
                    ans += a[i];
                    b[i] = a[i];
                }
            }
            System.out.println(ans);
        }
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