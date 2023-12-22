import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        int[] d = new int[n];
        int[] cnt = new int[n];

        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
            cnt[d[i]]++;
        }

        if (cnt[0] != 0) {
            System.out.println(0);
            return;
        }

        int maxIndex = 0;
        for (int i = n-1; i > 0; i--) {
            if (cnt[i] > 0) {
                maxIndex = i;
                break;
            }
        }

        long ans = 1;
        for (int i = 1; i <= maxIndex; i++) {
            ans = ans * exp(cnt[i-1], cnt[i]) % 998244353;
        }

        System.out.println(ans);
    }


    // aのb乗を計算する(998244353で割った値を返す)
    static long exp(int a, int b) {
        long tmp = a;
        for (int i = 2; i <= b; i++) {
            tmp = tmp * a % 998244353;
        }

        return tmp % 998244353;
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