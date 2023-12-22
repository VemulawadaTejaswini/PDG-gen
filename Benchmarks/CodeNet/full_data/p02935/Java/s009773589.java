import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();

    public static void main(String[]$) throws IOException {
        int n = scanner.nextInt();
        double[] d = new double[n];
        for (int i = 0; i < n; i++) {
            d[i] = scanner.nextInt();
        }
        Arrays.sort(d);
        double a = d[0];
        for (int i = 1; i < n; i++) {
            a = (a + d[i]) / 2;
        }
        System.out.println(a);
    }

    static class Scanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;

        String next() throws IOException {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
            return tokenizer.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    }
}