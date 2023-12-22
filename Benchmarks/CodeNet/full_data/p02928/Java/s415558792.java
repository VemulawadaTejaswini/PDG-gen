import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();
    static long mod = 1000000007;

    public static void main(String[]$) throws IOException {
        int n = scanner.nextInt();
        long ans = 0;
        long k = scanner.nextLong();
        long[] count = new long[2001];
        long[] b = new long[n];
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            count[a[i] - 1]++;
            for (int j = a[i]; j <= 2000; j++) {
                b[i] += count[j];
            }
        }
        for (int i = 2000; i > 0; i--) {
            count[i - 1] += count[i];
        }
        for (int i = 0; i < n; i++) {
            ans = (ans + ((k * (k - 1) / 2) % mod * count[a[i]] % mod + b[i] * k % mod)) % mod;
        }
        System.out.println(ans);
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