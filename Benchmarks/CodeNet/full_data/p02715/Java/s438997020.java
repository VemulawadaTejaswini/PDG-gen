

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
//        int t = in.nextInt();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
        public void solve(int testNumber, InputReader in, PrintWriter out) throws IOException {
            int n = in.nextInt();
            int k = in.nextInt();
            double mod = (Math.pow(10, 9) + 7);
            long[] dp = new long[k+1];
            for (int i = k; i >= 1; i--) {
                long temp = (long) Math.pow(k/i, n);
                temp %= mod;
                temp %= mod;
                long extra = 0;
                for (int j = i*2; j <= k; j+=i) {
                    extra = (long) ((extra + dp[j]) % mod);
                }
                dp[i] = (long) ((temp - extra + mod) % mod);
            }
            long ans = 0;
            for (int i = 1; i <= k; i++) {
                int add = (int) ((dp[i] % mod * i % mod) % mod);
                ans += add;
                ans %= mod;
            }
            out.println(ans);
        }
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

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public char nextChar() {
            return next().charAt(0);
        }

        public String nextLine() throws IOException {
            return reader.readLine().trim();
        }
    }
}
