import java.io.*;
import java.util.*;
import java.util.function.IntPredicate;

class Main {
    static Scanner scanner = new Scanner();
    static long mod = 1000000007;

    public static void main(String[]$) {
        int n = scanner.nextInt();
        String s = scanner.next();
        int max = binarySearch(n, len -> {
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i <= s.length() - len; i++) {
                String t = s.substring(i, i + len);
                if (map.containsKey(t)) {
                    if (map.get(t) + len <= i) {
                        return true;
                    }
                } else {
                    map.put(t, i);
                }
            }
            return false;
        });
        System.out.println(max);
    }

    static int binarySearch(int max, IntPredicate predicate) {
        int ok = -1, ng = max;
        while (ng - ok > 1) {
            int mid = (ok + ng) / 2;
            if (predicate.test(mid)) {
                ok = mid;
            } else {
                ng = mid;
            }
        }
        return ok;
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