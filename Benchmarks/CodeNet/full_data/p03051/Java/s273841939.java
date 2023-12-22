import java.io.*;
import java.nio.CharBuffer;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        SimpleScanner scanner = new SimpleScanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        final int MAX = 1 << 20;
        final int MOD = 1000000007;
        int n = scanner.nextInt();
        long[] f = new long[MAX];
        long[] g = new long[MAX];
        int[] last = new int[MAX];
        int[] zeroCount = new int[n + 1];
        int xor = 0;
//        int[] debugX = new int[n], debugXor = new int[n];
        for (int i = 1; i <= n; ++i) {
            int x = scanner.nextInt();
            xor = xor ^ x;
//            debugX[i] = x;
//            debugXor[i] = xor;
            if (xor != 0) {
                zeroCount[i] = zeroCount[i - 1];
                if (last[xor] == 0) {
                    f[xor] = g[xor] = 1;
                } else {
                    g[xor] = (g[xor] + f[xor] * (zeroCount[i] - zeroCount[last[xor]]) % MOD) % MOD;
                    f[xor] = (f[xor] + g[xor]) % MOD;
                }
                last[xor] = i;
            } else {
                zeroCount[i] = zeroCount[i - 1] + 1;
            }
        }
//        writer.println(Arrays.toString(debugX));
//        writer.println(Arrays.toString(debugXor));
//        writer.flush();
        if (xor != 0) {
            writer.println(g[xor]);
        } else {
            long ans = 1;
            for (int i = 1; i < zeroCount[n]; ++i)
                ans = (ans * 2) % MOD;
            for (int i = 1; i < MAX; ++i)
                ans = (ans + f[i]) % MOD;
            writer.println(ans);
        }

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

        void checkEof() {
            if (eof)
                throw new NoSuchElementException();
        }

        char nextChar() {
            checkEof();
            char b = read();
            checkEof();
            return b;
        }

        String next() {
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

        int nextInt() {
            return Integer.valueOf(next());
        }

        long nextLong() {
            return Long.valueOf(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}