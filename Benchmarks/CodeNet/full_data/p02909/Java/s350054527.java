import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) {
        MyScanner sc = new MyScanner();

        char[] s = sc.next().toCharArray();

        if (s[0] == 'S')
            System.out.println("Cloudy");
        else if (s[0] == 'C')
            System.out.println("Rainy");
        else
            System.out.println("Sunny");
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