import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();

        int[][] a = new int[n][2];
        int maxE = 0;
        int maxW = 0;
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                a[i][0] += a[i - 1][0];
                a[i][1] += a[i - 1][1];
            }
            if (s[i] == 'E') {
                a[i][0]++;
                maxE++;
            } else {
                a[i][1]++;
                maxW++;
            }
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int turn;
            if (i == 0)
                turn = maxE - a[i][0];
            else
                turn = a[i-1][1] + maxE - a[i][0];
            min = Math.min(min, turn);
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