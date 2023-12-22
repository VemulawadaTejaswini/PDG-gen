import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        char[] s = sc.next().toCharArray();

        int[] num = new int[s.length+1];
        int tmp = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] == '<') {
                tmp++;
                num[i+1] = tmp;
            } else {
                tmp = 0;
            }
        }

        tmp = 0;
        for (int i = s.length-1; i >= 0; i--) {
            if (s[i] == '>') {
                tmp++;
                num[i] = Math.max(tmp, num[i]);
            } else {
                tmp = 0;
            }
        }

        long ans = 0;
        for (int i : num)
            ans += i;

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