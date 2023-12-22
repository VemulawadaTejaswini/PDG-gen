import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int last = Integer.MAX_VALUE;
        int count = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int h = scanner.nextInt();
            if (last >= h) {
                count++;
            } else {
                max = Math.max(count, max);
                count = 0;
            }
            last = h;
        }
        System.out.println(Math.max(count, max));
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