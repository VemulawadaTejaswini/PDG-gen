import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {


    private void solve(InputReader in, PrintWriter out) {
        int n = in.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextLong();
        }
        BigInteger res = lcm(arr);
        BigInteger result = BigInteger.ZERO;
        for (long anArr : arr) {
            result = result.add((res.subtract(BigInteger.ONE)).mod(BigInteger.valueOf(anArr)));
        }
        out.println(result);
    }



    private static BigInteger lcm(BigInteger a, BigInteger b) {
        return a.multiply((b.divide((a.gcd(b)))));
    }

    private static BigInteger lcm(long[] input) {
        BigInteger result = BigInteger.valueOf(input[0]);
        for (int i = 1; i < input.length; i++) result = lcm(result, BigInteger.valueOf(input[i]));
        return result;
    }

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        try (
                InputReader in = new InputReader(System.in);
                PrintWriter out = new PrintWriter(System.out)) {
            solve(in, out);
        }
    }


    static class InputReader implements AutoCloseable {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

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

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        @Override
        public void close() {

        }
    }

}
