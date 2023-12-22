import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        int[] l = new int[n];

        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }

        Arrays.sort(l);

        int ans = 0;
        for (int i = n-1; i > 1; i--) {
            int x = i-2;
            int y = 0;
            for (int j = i-1; j > 0; j--) {
                int max = l[i] + l[j];
                int min = l[i] - l[j];

                if (x == j)
                    x--;
                for (int k = x; k >= 0; k--) {
                    if (l[k] < max) {
                        x = k;
                        break;
                    }
                }
                if (l[x] >= max)
                    break;

                if (y == x || y == j)
                    y = Math.max(y-1, 0);
                for (int k = y; k <= x; k++) {
                    if (l[k] > min) {
                        y = k;
                        break;
                    }
                }
                if (l[y] <= min)
                    break;

                ans += x - y + 1;
            }
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