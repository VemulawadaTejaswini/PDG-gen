import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();

        int[][] cnt = new int[n][2];
        for (int i = 0; i < n; i++) {
            if (s[i] == 'E')
                cnt[i][0]++;
            else
                cnt[i][1]++;

            if (i > 0) {
                cnt[i][0] += cnt[i-1][0];
                cnt[i][1] += cnt[i-1][1];
            }
        }

        int min = Math.min(cnt[n-1][0], cnt[n-1][1]);
        for (int i = 1; i < n-1; i++) {
            int tmp = cnt[i-1][1] + (cnt[n-1][0] - cnt[i][0]);
            min = Math.min(tmp, min);
        }

        System.out.println(min);
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