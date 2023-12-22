import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        int[] h = new int[n];

        int max = 0;
        int tmp = 0;
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        for (int i = n-1; i > 0; i--) {
            if (h[i] <= h[i-1]) {
                tmp++;
            } else {
                max = Math.max(tmp, max);
                tmp = 0;
            }
        }

        max = Math.max(tmp, max);
        System.out.println(max);
    }

    static class MyScanner {
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