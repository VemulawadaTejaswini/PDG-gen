import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        int[] point = new int[n];

        int cnt = 0;
        for (int i = 0; i < q; i++) {
            int a = sc.nextInt();
            point[a-1]++;
            cnt++;
        }

        for (int i = 0; i < n; i++) {
            if (k - cnt + point[i] > 0)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
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