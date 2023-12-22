import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] s = new int[m][];
        int[] p = new int[m];

        for (int i = 0; i < m; i++) {
            int k = sc.nextInt();
            s[i] = new int[k];
            for (int j = 0; j < k; j++) {
                s[i][j] = sc.nextInt() - 1;
            }
        }

        for (int i = 0; i < m; i++) {
            p[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = 0; i < (1<<n); i++) {
            boolean isOK = true;
            for (int j = 0; j < m; j++) {
                int cnt = 0;
                for (int k = 0; k < s[j].length; k++) {
                    if (((1<<s[j][k])&i) > 0)
                        cnt++;
                }
                if (cnt % 2 != p[j]) {
                    isOK = false;
                    break;
                }
            }
            if (isOK)
                ans++;
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