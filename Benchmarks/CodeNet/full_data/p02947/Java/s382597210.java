import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();

    public static void main(String[]$) throws IOException {
        int n = scanner.nextInt();
        Map<String, Long> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char[] s = scanner.next().toCharArray();
            Arrays.sort(s);
            map.compute(String.valueOf(s), (key, value) -> value == null ? 1 : value + 1);
        }
        long ans = 0;
        for (long value : map.values()) {
            ans += value * (value - 1) / 2;
        }
        System.out.println(ans);
    }

    static class Scanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 32768);
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

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }
    }
}