import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();

        int[] a = new int[n];
        int[] cnt = new int[200010];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            cnt[a[i]]++;
        }

        long prepSum = 0;
        for (int i = 0; i < cnt.length; i++) {
            int tmp = cnt[i];
            long prep = 0;
            for (int j = 1; j < tmp; j++) {
                prep += tmp - j;
            }
            prepSum += prep;
        }

        for (int i = 0; i < n; i++) {
            if (cnt[a[i]] > 1)
                pw.println(prepSum - cnt[a[i]] + 1);
            else
                pw.println(prepSum);
        }

        pw.flush();
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