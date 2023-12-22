import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();

    public static void main(String[]$) throws IOException {
        int n = scanner.nextInt();
        int[] u = new int[n];
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            u[i] = x + y;
            v[i] = x - y;
            if (i != 0 && Math.abs(u[i - 1] % 2) != Math.abs(u[i] % 2)) {
                System.out.println(-1);
                return;
            }
        }
        int r = 1 ^ Math.abs(u[0] % 2);
        System.out.println(31 + r);
        if (r == 1) {
            System.out.println(1);
        }
        for (long i = 1; i >> 31 != 1; i <<= 1) {
            System.out.println(i);
        }

        long b = (1L << 31) - 1 - r;
        char[] d = {'L', 'D', 'U', 'R'};
        for (int i = 0; i < n; i++) {
            if (r > 0) {
                System.out.print("R");
            }
            long u1 = (u[i] + b) / 2;
            long v1 = (v[i] + b) / 2;
            for (int j = 0; j < 31; j++, u1 /= 2, v1 /= 2) {
                System.out.print(d[(int)(Math.abs(u1 % 2) * 2 + Math.abs(v1 % 2))]);
            }
            System.out.println();
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

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }
    }
}