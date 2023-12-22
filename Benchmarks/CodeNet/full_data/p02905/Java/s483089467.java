import java.io.*;
import java.nio.CharBuffer;
import java.util.*;

public class Main {

    private static int MOD = 998244353;

    public static void main(String[] args) {
        SimpleScanner scanner = new SimpleScanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        int n = scanner.nextInt();
        Map<Integer, Integer> divisorSumMap = new HashMap<>();
        long ans = 0;
        for (int i = 0; i < n; ++i) {
            int t = scanner.nextInt();
            ArrayList<Integer> divisors = new ArrayList<>((int) Math.log1p(t));
            for (int j = 1; j * j <= t; ++j) {
                if (t % j == 0) {
                    divisors.add(j);
                    if (j * j != t)
                        divisors.add(t / j);
                }
            }
            divisors.sort(Comparator.reverseOrder());
            Map<Integer, Integer> tDivisorSumMap = new HashMap<>();
            for (int j = 0; j < divisors.size(); ++j) {
                Integer sum = divisorSumMap.get(divisors.get(j));
                if (sum != null) {
                    for (int k = 0; k < j; ++k) {
                        if (divisors.get(k) % divisors.get(j) == 0)
                            sum = (sum - tDivisorSumMap.getOrDefault(divisors.get(k), 0) + MOD) % MOD;
                    }
                    tDivisorSumMap.put(divisors.get(j), sum);
                    ans = (ans + (long) t / divisors.get(j) * sum) % MOD;
                }
            }
            for (int divisor : divisors)
                divisorSumMap.compute(divisor, (k, v) -> v == null ? t : (v + t) % MOD);
        }
        writer.println(ans);

        writer.close();
    }

    private static class SimpleScanner {

        private static final int BUFFER_SIZE = 10240;

        private Readable in;
        private CharBuffer buffer;
        private boolean eof;

        SimpleScanner(InputStream in) {
            this.in = new BufferedReader(new InputStreamReader(in));
            buffer = CharBuffer.allocate(BUFFER_SIZE);
            buffer.limit(0);
            eof = false;
        }


        private char read() {
            if (!buffer.hasRemaining()) {
                buffer.clear();
                int n;
                try {
                    n = in.read(buffer);
                } catch (IOException e) {
                    n = -1;
                }
                if (n <= 0) {
                    eof = true;
                    return '\0';
                }
                buffer.flip();
            }
            return buffer.get();
        }

        private void checkEof() {
            if (eof)
                throw new NoSuchElementException();
        }

        private char nextChar() {
            checkEof();
            char b = read();
            checkEof();
            return b;
        }

        private String next() {
            char b;
            do {
                b = read();
                checkEof();
            } while (Character.isWhitespace(b));
            StringBuilder sb = new StringBuilder();
            do {
                sb.append(b);
                b = read();
            } while (!eof && !Character.isWhitespace(b));
            return sb.toString();
        }

        private int nextInt() {
            return Integer.parseInt(next());
        }

        private long nextLong() {
            return Long.parseLong(next());
        }

        private double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}