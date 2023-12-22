import java.io.*;
import java.util.*;

public class Main {

    static long mod = (long) (1e9 + 7);

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        String s = in.next();
        int n = s.length();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = s.charAt(i) - '0';
        }
        int d = in.nextInt();
        long[][][] dp = new long[n][d][2];
        int dig0 = num[0];
        dp[0][dig0 % d][0] = 1;
        for (int i = 0; i < 10; i++) {
            if (i < dig0)
                dp[0][i % d][1] = 1;
        }
        int last = dig0 % d;
        for (int i = 1; i < n; i++) {
            int dig = num[i];
            dp[i][(last + dig) % d][0] = (dp[i][(last + dig) % d][0] + dp[i - 1][last][0]) % mod;
            last = (last + dig) % d;
            for (int j = 0; j < d; j++) {
                for (int l = 0; l < 10; l++) {
                    dp[i][(j + l) % d][1] = (dp[i][(j + l) % d][1] + dp[i - 1][j][1]) % mod;
                    if (l < dig)
                        dp[i][(j + l) % d][1] = (dp[i][(j + l) % d][1] + dp[i - 1][j][0]) % mod;
                }
            }
        }
        long ans = (dp[n - 1][0][0] + dp[n - 1][0][1]) % mod;
        out.println(((ans - 1) + mod) % mod);
        out.close();
    }

    static long[][] powMat(long[][] a, long pow) {
        if (pow == 1) {
            return a;
        } else {
            if (pow % 2 == 0) {
                return powMat(mul(a, a), pow / 2);
            } else {
                return mul(a, powMat(mul(a, a), pow / 2));
            }
        }
    }

    static long[][] mul(long[][] a, long[][] b) {
        int n = a.length;
        long[][] c = new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    c[i][k] = (c[i][k] + (a[i][j] * b[j][k]) % mod) % mod;
                }
            }
        }
        return c;
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