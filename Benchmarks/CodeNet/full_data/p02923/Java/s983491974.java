import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int[] h = new int[n + 1];
        int[] can = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            h[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            can[i] = h[i] >= h[i + 1] ? 1 : 0;
        }
        for (int i = 1; i <= n; i++) {
            if (can[i] != 0) {
                can[i] += can[i - 1];
            }
        }
        Arrays.stream(can).max().ifPresent(System.out::println);
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