import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();

    public static void main(String[]$) throws IOException {
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    int k = i / j;
                    if (j < 10 && k < 10 && j * 10 + k <= d) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    static class Scanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;

        String next() throws IOException {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
            return tokenizer.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    }
}