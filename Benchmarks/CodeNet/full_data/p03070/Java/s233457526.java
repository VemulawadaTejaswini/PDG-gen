import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Main {

    static final int MOD = 998244353;

    static int divAndCeil(int divident, int divisor) {
        return (divident + divisor - 1) / divisor;
    }

    interface DPBuilder {
        long[][] create(int m);
    }

    static void exec(MyScanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] a = new int[n];
        Arrays.setAll(a, i -> in.nextInt());
        int s = IntStream.of(a).sum();
        long u = LongStream.range(0, n)
                           .reduce(1, (result, e) -> (result * 3) % MOD);
        DPBuilder dpb = m -> {
            long[][] dp = new long[n + 1][s + 1];
            dp[0][0] = 1;
            for (int i = 0; i < n; i += 1) {
                for (int j = 0; j <= s; j += 1) {
                    if (dp[i][j] == 0)
                        continue;
                    dp[i + 1][j] = (dp[i + 1][j] + dp[i][j] * m) % MOD;
                    dp[i + 1][j + a[i]] = dp[i][j];
                }
            }
            return dp;
        };
        long[][] dpRGB = dpb.create(2);
        for (int i = divAndCeil(s, 2); i <= s; i += 1) {
            u -= dpRGB[n][i] * 3;
            while (u < 0)
                u += MOD;
        }
        if (s % 2 == 0) {
            long[][] dpRG = dpb.create(1);
            u = (u + dpRG[n][s / 2] * 3) % MOD;
        }
        out.println(u);
    }

    public static void main(String[] args) {
        PrintWriter w = new PrintWriter(System.out);
        exec(new MyScanner(System.in), w);
        w.flush();
    }

    static final class MyScanner {
        static final int BUFFER_SIZE = 8192;
        private final InputStream in;
        private final byte[] buffer = new byte[BUFFER_SIZE];
        private int point;
        private int readLength;
        MyScanner(InputStream in) {
            this.in = in;
        }
        private int readByte() {
            if (point < readLength) {
                int result = buffer[point];
                point += 1;
                return result;
            }
            try {
                readLength = in.read(buffer);
            } catch (IOException e) {
                throw new AssertionError(null, e);
            }
            if (readLength == -1) {
                return -1;
            }
            point = 1;
            return buffer[0];
        }
        private static boolean isPrintableCharExceptSpace(int c) {
            return 33 <= c && c <= 126;
        }
        String next() {
            StringBuilder b = new StringBuilder();
            int c = readByte();
            while (!(c == -1 || isPrintableCharExceptSpace(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            do {
                b.appendCodePoint(c);
                c = readByte();
            } while (c != -1 && isPrintableCharExceptSpace(c));
            return b.toString();
        }
        long nextLong() {
            int c = readByte();
            while (!(c == -1 || isPrintableCharExceptSpace(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            boolean minus = false;
            if (c == '-') {
                minus = true;
                c = readByte();
            }
            long result = 0L;
            do {
                if (!('0' <= c && c <= '9')) {
                    throw new InputMismatchException();
                }
                result = result * 10L + (c - '0');
                c = readByte();
            } while (c != -1 && isPrintableCharExceptSpace(c));
            return minus ? -result : result;
        }
        int nextInt() {
            long n = nextLong();
            if (Integer.MIN_VALUE <= n && n <= Integer.MAX_VALUE) {
                return (int) n;
            }
            throw new InputMismatchException();
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}
