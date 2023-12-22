import java.io.*;
import java.util.*;

public class panasonic2020 {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        long h = sc.nextLong();
        long w = sc.nextLong();

        long ans = h * (w / 2);
        if (w % 2 == 1) {
            if (h % 2 == 0)
                ans += h / 2;
            else
                ans += h / 2 + 1;
        }

        System.out.println(ans);
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