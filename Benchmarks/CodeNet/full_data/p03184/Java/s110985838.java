import java.io.*;
import java.util.*;

public class Main {

    static long mod = (long) (1e9 + 7);
    static long[] fac = new long[1000001];
    static long[] invfac = new long[1000001];


    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int h = in.nextInt();
        int w = in.nextInt();
        int n = in.nextInt();
        List<Pair> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            list.add(new Pair(x, y));
        }
        list.add(new Pair(h, w));
        long start = System.currentTimeMillis();
        fac[0] = 1;
        invfac[0] = 1;
        for (int i = 1; i < 1000001; i++) {
            fac[i] = mul(fac[i - 1], i);
            invfac[i] = inv(fac[i]);
        }

        Collections.sort(list);
        long[] dp = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            Pair p = list.get(i);
            long tmp = bino((p.x + p.y - 2), p.x - 1);
            for (int j = 0; j < i; j++) {
                Pair p1 = list.get(j);
                if (p.x >= p1.x && p.y >= p1.y) {
                    int n1 = (p.x - p1.x);
                    int n2 = (p.y - p1.y);
                    tmp = sub(tmp, mul(dp[j], bino((n1 + n2), n1)));
                }
            }
            dp[i] = tmp;
        }
        long end = System.currentTimeMillis();
        //out.println(end - start);
        out.println(dp[n]);
        out.close();
    }

    static class Pair implements Comparable<Pair> {
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Pair o) {
            if ((x + y) == (o.x + o.y)) {
                return x - o.x;
            } else {
                return Integer.compare((x + y), (o.x + o.y));
            }
        }
    }

    static long bino(int a, int b) {
        if (a < 0 || b < 0 || b > a) {
            return 0;
        }
        return mul(mul(fac[a], invfac[b]), invfac[a - b]);
    }

    static long power(long a, long pow) {
        if (pow == 1) {
            return a % mod;
        } else {
            if (pow % 2 == 0) {
                return power(mul(a, a), pow / 2) % mod;
            } else {
                return mul(a, power(mul(a, a), pow / 2) % mod);
            }
        }
    }

    static long inv(long a) {
        return power(a, mod - 2);
    }

    static long mul(long a, long b) {
        return (a * b) % mod;
    }

    static long sub(long a, long b) {
        long ans = (a - b);
        if (ans < 0) {
            ans += mod;
        }
        return ans % mod;
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}