import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();
    static PrintWriter out = new PrintWriter(System.out, true);
    static long mod = 1000000007;

    void solve() {
        String s = scanner.next();
        s = s + s + s;
        String t = scanner.next();
        int[] b = new int[s.length()];
        for (int i = 0; i <= s.length() - t.length(); i++) {
            b[i] = s.substring(i, i + t.length()).equals(t) ? 1 : 0;
        }
        System.out.println(Arrays.toString(b));
        for (int i = 0; i < t.length(); i++) {
            for (int j = i; j < s.length(); j += t.length()) {
                if (j - t.length() >= 0 && b[j] != 0) {
                    b[j] += b[j - t.length()];
                }
            }
        }
        Arrays.stream(b).max().ifPresent(System.out::println);
    }

    public static void main(String[]$) {
        new Main().solve();
        out.close();
    }

    static class Scanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 32768);
        StringTokenizer tokenizer;

        String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(reader.readLine());
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}