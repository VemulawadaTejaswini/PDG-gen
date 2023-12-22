import java.io.*;
import java.nio.CharBuffer;
import java.util.NoSuchElementException;

public class Main {

    private static final int MOD = 998244353;

    public static void main(String[] args) {
        SimpleScanner scanner = new SimpleScanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        int n = scanner.nextInt();
        int[] d = new int[n];
        int[] cnt = new int[n];
        int maxD = 0;
        for (int i = 0; i < n; ++i) {
            d[i] = scanner.nextInt();
            ++cnt[d[i]];
            maxD = Math.max(maxD, d[i]);
        }
        if (d[0] != 0)
            writer.println(0);
        else if (cnt[0] != 1)
            writer.println(0);
        else {
            long ans = 1;
            for (int i = 1; i <= maxD; ++i) {
                if (cnt[i] == 0) {
                    ans = 0;
                    break;
                }
                ans = ans * pow(cnt[i - 1], cnt[i]) % MOD;
            }
            writer.println(ans);
        }
        writer.close();
    }

    private static long pow(int a, int b) {
        if (a == 1)
            return 1;
        long result = 1;
        long base = a;
        for (int i = 1; i <= b; i <<= 1) {
            if ((b & i) > 0)
                result = result * base % MOD;
            base = base * base % MOD;
        }
        return result;
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