import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        int m = sc.nextInt();

        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        Map<Long, Integer> map = new TreeMap<>();
        for (int i = 0; i < m; i++) {
            int b = sc.nextInt();
            long c = sc.nextLong();
            if (map.containsKey(c))
                map.put(c, map.get(c) + b);
            else
                map.put(c, b);
        }

        Arrays.sort(a);

        long ans = 0;
        Object[] keys = map.keySet().toArray();
        int keysIndex = keys.length-1;
        for (int i = 0; i < n; i++) {
            long key = -1;
            if (keysIndex >= 0)
                key = (long)keys[keysIndex];

            if (a[i] < key) {
                ans += key;
                map.put(key, map.get(key)-1);
            } else {
                ans += a[i];
            }

            if (key >= 0 && map.get(key) <= 0)
                keysIndex = Math.max(-1, keysIndex-1);
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