import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {

    static final int MOD = 1000000007;
    static final int INF = 1 << 30;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        long ans = 0;
        int N = sc.nextInt();
        int[] a = sc.nextIntArray(N);
        HashMap<Integer, Integer> summap = new HashMap<Integer, Integer>();
        ArrayList<HashMap<Integer, Integer>> all = new ArrayList<HashMap<Integer, Integer>>();
        for (int i = 0; i < N; i++) {
            HashMap<Integer, Integer> map = primeFactor(a[i]);
            all.add(map);
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (summap.getOrDefault(entry.getKey(), 0) < entry.getValue()) {
                    summap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        for (int i = 0; i < N; i++) {
            HashMap<Integer, Integer> map = all.get(i);
            long pls = 1;
            for (Map.Entry<Integer, Integer> entry : summap.entrySet()) {
                // System.out.println(entry);
                int k = entry.getKey();
                int v = entry.getValue();
                int d = v - map.getOrDefault(k, 0);
                if (d > 0) {
                    pls *= (long) Math.pow(k, d) % MOD;
                }
                pls %= MOD;
            }
            ans += pls;
            ans %= MOD;
        }
        System.out.println(ans);
    }

    public static final HashMap<Integer, Integer> primeFactor(int n) {
        final HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        if (n < 2) {
            return map;
        }

        while (n != 1 && n % 2 == 0) {
            map.put(2, map.getOrDefault(2, 0) + 1);
            n >>>= 1;
        }

        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                map.put(i, map.getOrDefault(i, 0) + 1);
                n /= i;
            }
        }

        if (n != 1) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        return map;
    }
}

class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;

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

    public ArrayList<Integer> nextIntList(int n) {
        ArrayList<Integer> a = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++)
            a.add(nextInt());
        return a;
    }

    public ArrayList<Long> nextLongList(int n) {
        ArrayList<Long> a = new ArrayList<Long>(n);
        for (int i = 0; i < n; i++)
            a.add(nextLong());
        return a;
    }

    public int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = nextInt();
        return a;
    }

    public long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nextLong();
        return a;
    }
}