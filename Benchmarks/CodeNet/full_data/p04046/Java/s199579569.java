import com.sun.istack.internal.Nullable;

import java.io.*;
import java.util.*;

/**
 * Created by Katushka on 11.03.2020.
 */
public class Main {

    static int[] readArray(int size, InputReader in) {
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = in.nextInt();
        }
        return a;
    }

    static long[] readLongArray(int size, InputReader in) {
        long[] a = new long[size];
        for (int i = 0; i < size; i++) {
            a[i] = in.nextLong();
        }
        return a;
    }

    static long c(int n, int k, long mod, Map<Integer, Map<Integer, Long>> cache, Map<Long, Long> invs) {
        k = Math.min(k, n - k);

        if (cache != null && cache.containsKey(n) && cache.get(n).containsKey(k)) {
            return cache.get(n).get(k);
        }

        long nn = 1;
        for (long i = n - k + 1; i < n + 1; i++) {
            nn = nn * i % mod;
        }
        long kk = 1;
        for (int t = 1; t < k + 1; t++) {
            kk = kk * inv(t, mod, invs) % mod;
        }

        long result = nn * kk % mod;
        if (cache != null) {
            if (!cache.containsKey(n)) {
                cache.put(n, new HashMap<>());
            }
            cache.get(n).put(k, result);
        }
        return result;
    }

    private static long fastPow(long x, long y, long mod) {
        if (x == 1) {
            return 1;
        }
        if (y == 0) {
            return 1;
        }
        long p = fastPow(x, y / 2, mod) % mod;
        p = p * p % mod;
        if (y % 2 == 1) {
            p = p * x % mod;
        }
        return p;
    }

    private static long inv(long x, long mod, @Nullable Map<Long, Long> cache) {
        if (cache != null) {
            if (!cache.containsKey(x)) {
                cache.put(x, fastPow(x, mod - 2, mod));
            }
            return cache.get(x);
        } else {
            return fastPow(x, mod - 2, mod);
        }
    }

    static final long MOD = 1000000007;

    public static void main(String[] args) throws FileNotFoundException {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        int n = in.nextInt();
        int m = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();

        Map<Long, Long> invs = new HashMap<>();
        long prev = c(n - a - 1 + b, b, MOD, null, invs) * c(a + m - b - 1, a, MOD, null, invs) % MOD;
        long ans = prev;
        for (int j = 0; j < Math.min(n - a - 1, m - b - 1); j++) {
            prev = prev * (n - a - j - 1) % MOD;
            prev = prev * (m - b - j - 1) % MOD;
            prev = prev * inv(b + j + 1, MOD, invs) % MOD;
            prev = prev * inv(a + j + 1, MOD, invs) % MOD;
            ans = (ans + prev) % MOD;
        }
        out.println(ans);

        out.close();
    }

    private static boolean solve(int n, long[][] moves) {
        Map<Long, Map<Long, Long>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!graph.containsKey(moves[i][0])) {
                graph.put(moves[i][0], new HashMap<>());
            }
            if (!graph.containsKey(moves[i][1])) {
                graph.put(moves[i][1], new HashMap<>());
            }
            if (graph.get(moves[i][0]).containsKey(moves[i][1]) && graph.get(moves[i][0]).get(moves[i][1]) != moves[i][2]) {
                return false;
            }
            graph.get(moves[i][0]).put(moves[i][1], moves[i][2]);
            graph.get(moves[i][1]).put(moves[i][0], moves[i][2]);
        }

        Set<Long> notVisited = new HashSet<>(graph.keySet());
        while (!notVisited.isEmpty()) {
            long v = notVisited.iterator().next();
            Map<Long, Integer> colors = new HashMap<>();
            colors.put(v, 1);
            if (!dfs(v, graph, notVisited, colors)) {
                return false;
            }
        }
        return true;
    }

    private static boolean dfs(long v, Map<Long, Map<Long, Long>> graph, Set<Long> notVisited, Map<Long, Integer> colors) {
        notVisited.remove(v);

        boolean result = true;
        for (Long u : graph.get(v).keySet()) {
            if (notVisited.contains(u)) {
                if (graph.get(v).get(u) == 1L) {
                    colors.put(u, 1 - colors.get(v));
                } else {
                    colors.put(u, colors.get(v));
                }
                if (!dfs(u, graph, notVisited, colors)) {
                    result = false;
                }
            } else {
                if (graph.get(v).get(u) == 1L && colors.get(v) != 1 - colors.get(u)) {
                    result = false;
                }
                if (graph.get(v).get(u) == 0L && !colors.get(v).equals(colors.get(u))) {
                    result = false;
                }
            }
        }
        return result;
    }


    private static void outputArray(long[] ans, PrintWriter out) {
        StringBuilder str = new StringBuilder();
        for (long an : ans) {
            str.append(an).append(" ");
        }
        out.println(str);
    }

    private static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                createTokenizer();
            }
            return tokenizer.nextToken();
        }

        private void createTokenizer() {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public String nextWord() {
            return next();
        }

        public String nextString() {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public char nextChar() {
            return next().charAt(0);
        }

        public int[] nextInts() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                createTokenizer();
            }
            List<Integer> res = new ArrayList<>();
            while (tokenizer.hasMoreElements()) {
                res.add(Integer.parseInt(tokenizer.nextToken()));
            }
            int[] resArray = new int[res.size()];
            for (int i = 0; i < res.size(); i++) {
                resArray[i] = res.get(i);
            }
            return resArray;
        }
    }
}