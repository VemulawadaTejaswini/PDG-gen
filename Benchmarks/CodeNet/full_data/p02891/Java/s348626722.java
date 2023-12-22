import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        char[] s = sc.next().toCharArray();
        long k = sc.nextLong();
        char[] tmp = {'a', 'c', 'e', 'g'};

        int cnt = 0;
        for (int i = 1; i < s.length; i++) {
            if (s[i-1] == s[i]) {
                cnt++;
                for (char c : tmp) {
                    int nextIndex = i+1;
                    if (i+1 > s.length-1)
                        nextIndex = i;
                    if (s[i-1] != c && s[nextIndex] != c)
                        s[i] = c;
                }
            }
        }

        if (s[0] == s[s.length-1]) {
            if (s[s.length-2] != s[s.length-1])
                cnt++;
        }

        System.out.println(cnt * k);
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