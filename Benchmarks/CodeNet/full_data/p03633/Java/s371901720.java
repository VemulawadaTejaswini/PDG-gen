import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        long[] t = new long[n];

        long max = 0;
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextLong();
            max = Math.max(t[i], max);
        }

        long cnt = 0;
        boolean isLoop = true;
        while (isLoop) {
            cnt++;
            isLoop = false;
            long tmp = max * cnt;
            for (int i = 0; i < n; i++) {
                if (tmp % t[i] != 0) {
                    isLoop = true;
                    break;
                }
            }
        }

        System.out.println(max * cnt);
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