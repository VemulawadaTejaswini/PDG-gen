import java.io.*;
import java.util.*;

public class Msin {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        long tmp = c - a - b;
        if (tmp > 0 && 4 * a * b < tmp * tmp)
            System.out.println("Yes");
        else
            System.out.println("No");
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