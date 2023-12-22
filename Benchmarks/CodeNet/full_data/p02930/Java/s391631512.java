import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();

    public static void main(String[]$) throws IOException {
        int n = scanner.nextInt();
        for (int i = n - 1; i > 0; i--) {
            boolean b = false;
            for (int j = 1, k = (n + 1) / 2; j <= i; j++) {
                System.out.println(k);
                if (!b && k == 1 && n % 2 == 0) {
                    b = true;
                } else if (b || k == 1) {
                    b = true;
                    k++;
                } else {
                    k--;
                }
            }
        }
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