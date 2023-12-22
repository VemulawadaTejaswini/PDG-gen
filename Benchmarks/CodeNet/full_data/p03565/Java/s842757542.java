import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();

        boolean isAns = false;
        for (int i = s.length-1; i >= t.length-1; i--) {
            char[] tmp = s.clone();
            isAns = true;
            for (int j = 0; j < t.length; j++) {
                if (s[i-j] == t[t.length-1-j] || s[i-j] == '?') {
                    tmp[i-j] = t[t.length-1-j];
                } else {
                    isAns = false;
                    break;
                }
            }

            if (isAns) {
                s = tmp;
                break;
            }
        }

        if (isAns) {
            for (char c : s)
                System.out.print(c == '?' ? 'a' : c);
        } else {
            System.out.println("UNRESTORABLE");
        }
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