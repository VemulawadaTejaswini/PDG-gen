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

    static long[][] c(int n, long mod) {
        long[][] res = new long[n + 1][n + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == 0 || j == 0) {
                    res[i][j] = 1;
                } else {
                    res[i][j] = (res[i - 1][j] + res[i - 1][j - 1]) % mod;
                }
            }
        }

        return res;
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

    private static final long MOD = 1000000007;

    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        final long n = in.nextLong() + 1;
        String binaryN = Long.toBinaryString(n);
        long[][] c = c(70, MOD);

        long ans = 0;
        for (int i = 0; i < binaryN.length(); i++) {
            if (binaryN.charAt(i) == '1') {
                ans = (ans + solvePart(binaryN, i, c)) % MOD;
            }
        }
        out.println(ans);

//      out.println("Time:" + (System.currentTimeMillis() - startTime));
        out.close();
    }

    private static long solvePart(String binaryN, int start, long[][] c) {
        long ans = 0;
        ans = (ans + getAnswerZeroRequired(binaryN, start, c)) % MOD;

        long[][] zeroOneSequences = countZeroOneSequences(binaryN, start);
        for (int i = start + 1; i < binaryN.length(); i++) {
            if (binaryN.charAt(i) == '1') {
                ans = (ans + getAnswerZeroRequired(binaryN, i, c) * zeroOneSequences[i - 1][1] % MOD) % MOD;
                ans = (ans + getAnswerZeroRequired(binaryN, i, c) * zeroOneSequences[i - 1][0] % MOD) % MOD;
                ans = (ans + getAnswerOneRequired(binaryN, i, c) * zeroOneSequences[i - 1][1] % MOD) % MOD;
            }
        }
        return ans;
    }

    private static long[][] countZeroOneSequences(String binaryN, int start) {
        long[][] dp = new long[binaryN.length()][2];
        dp[start][0] = 0;
        dp[start][1] = 1;
        for (int i = start + 1; i < binaryN.length(); i++) {
            if (binaryN.charAt(i) == '1') {
                dp[i][0] = dp[i - 1][0];
                dp[i][1] = (dp[i - 1][0] + dp[i - 1][1]) % MOD;
            } else {
                dp[i][1] = dp[i - 1][1];
                dp[i][0] = (dp[i - 1][0] + dp[i - 1][1]) % MOD;
            }
        }
        return dp;
    }

    private static long getAnswerZeroRequired(String binaryN, int start, long[][] c) {
        int len = binaryN.length() - 1 - start;
        long ans = 0;
        for (int i = 0; i <= len; i++) {
            ans = (ans + c[len][i] * fastPow(2, Math.max(0, len - i - 1), MOD) % MOD) % MOD;
        }
        return ans;
    }

    private static long getAnswerOneRequired(String binaryN, int start, long[][] c) {
        int len = binaryN.length() - 1 - start;
        long ans = 0;
        for (int i = 0; i <= len - 1; i++) {
            ans = (ans + c[len][i] * fastPow(2, Math.max(0, len - i - 1), MOD) % MOD) % MOD;
        }
        return ans;
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
