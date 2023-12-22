// 参考 -> #7422186
// dp[w+1] になっていてメモリ量が節約されているのでとても頭がいい

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int N = sc.nextInt();
        int W = sc.nextInt();
        int[] w = new int[N];
        long[] v = new long[N];

        for (int i = 0; i < N; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextLong();
        }

        long[] dp = new long[W+1];

        for (int i = 0; i < N; i++) {
            for (int j = W; j >= 0; j--) {
                if (j - w[i] >= 0) {
                    dp[j] = Math.max(dp[j], dp[j - w[i]] + v[i]);
                }
            }
        }

        long ans = 0;
        for (long i : dp)
            ans = Math.max(ans, i);

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