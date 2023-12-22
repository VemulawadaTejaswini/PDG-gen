import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int m = (n - 1) * (n - 2) / 2;
        if (m < k) {
            System.out.println(-1);
        } else {
            System.out.println(n + m - k - 1);
            for (int i = 1; i < n; i++) {
                System.out.println(n + " " + i);
            }
            for (int i = 1; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (m-- == k) {
                        return;
                    }
                    System.out.println(i + " " + j);
                }
            }
        }
    }

    static class Scanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 32768);
        StringTokenizer tokenizer;

        String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(reader.readLine());
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}