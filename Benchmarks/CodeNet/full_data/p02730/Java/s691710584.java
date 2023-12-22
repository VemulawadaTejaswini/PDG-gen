import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        char[] s = sc.next().toCharArray();

        int n = s.length - 1;
        int l = 0;
        int r = (n - 1) / 2;
        boolean isAns = true;

        for (int i = l; i <= r / 2; i++) {
            if (s[i] != s[r - i]) {
                isAns = false;
                break;
            }
        }

        l = (n + 3) / 2;
        r = n;

        for (int i = l; i <= r; i++) {
            if (s[i] != s[r - i]) {
                isAns = false;
                break;
            }
        }

        System.out.println(isAns ? "Yes" : "No");
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