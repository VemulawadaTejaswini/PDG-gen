import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();

    static int dx, dy;
    public static void main(String[]$) {
        int k = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        dx = x < 0 ? -1 : 1;
        dy = y < 0 ? -1 : 1;
        x = Math.abs(x);
        y = Math.abs(y);
        int n = (int)Math.ceil((double)(x + y) / k);
        if (k % 2 == 0 && (x + y) % 2 == 1) {
            System.out.println(-1);
            return;
        } else if (x + y < k) {
            if ((x + y) % 2 == 1) {
                System.out.println(3);
                print(x, k - x);
                print(x + (k + x - y) / 2, k - x + (k - x + y) / 2);
                print(x, y);
                return;
            } else {
                n = 2;
            }
        } else if ((k - (x + y) % k) % k % 2 == 1) {
            n++;
        }
        System.out.println(n);
        int m = (k * n - x - y) / 2;
        for (int i = 1; i <= n; i++) {
            if (m > k * i) {
                print(-k * i, 0);
            } else if (x + m > k * i) {
                print(-m, k * i - m);
            } else {
                print(k * i - m - x - 1, x);
            }
        }
    }

    static void print(int x, int y) {
        System.out.println(dx * x + " " + dy * y);
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