import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        char[] s = sc.next().toCharArray();
        long k = sc.nextLong();
        
        boolean[] isChange = new boolean[s.length];
        long ans = 0;
        for (int i = 1; i < s.length; i++) {
            if (s[i-1] == s[i]) {
                if (!isChange[i-1]) {
                    ans++;
                    isChange[i] = true;
                }
            }
        }
        ans *= k;
        
        if (s[s.length-1] == s[0] && !isChange[s.length-1]) {
            ans += k-1;
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