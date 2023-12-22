import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        long n = sc.nextLong();

        List<Long> list1 = new ArrayList<>();
        List<Long> list2 = new ArrayList<>();

        for (long i = 1; i < (long)Math.sqrt(n)+1; i++) {
            if (n % i == 0) {
                list1.add(i);
                list2.add(n / i);
            }
        }

        long ans = Long.MAX_VALUE;
        for (int i = 0; i < list1.size(); i++) {
            long a = list1.get(i);
            long b = list2.get(i);
            ans = Math.min(ans, a + b - 2);
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