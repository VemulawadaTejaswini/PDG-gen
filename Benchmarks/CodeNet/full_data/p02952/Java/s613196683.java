import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        int digit = String.valueOf(n).length();
        int count = 0;
        for (int i = 1; i < digit; i++) {
            if (i % 2 == 1) {
                int ten = 1;
                for (int j = 1; j < i; j++) {
                    ten *= 10;
                }
                count += 9 * ten;
            }
        }
        if (digit % 2 == 1) {
            int ten = 1;
            for (int i = 1; i < digit; i++) {
                ten *= 10;
            }

            count += ((n / ten - 1) * ten) + n % ten + 1;
        }

        System.out.println(count);
    }


    static class FastScanner {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        public FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        public String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            return tokenizer.nextToken("\n");
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }


        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}