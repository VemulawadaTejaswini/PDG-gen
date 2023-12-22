import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();
    static long mod = 1000000007;

    public static void main(String[]$) {
        int n = scanner.nextInt();
        String s = scanner.next();
        for (int len = 0; len < n; len++) {
            boolean b = false;
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i <= s.length() - len; i++) {
                String t = s.substring(i, i + len);
                if (map.containsKey(t)) {
                    if (map.get(t) + len <= i) {
                        b = true;
                    }
                } else {
                    map.put(t, i);
                }
            }
            if (!b) {
                System.out.println(len - 1);
                break;
            }
        }
    }

    static class Scanner {
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