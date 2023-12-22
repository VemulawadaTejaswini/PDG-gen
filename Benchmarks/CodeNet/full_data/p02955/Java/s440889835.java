import java.io.*;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        SimpleScanner scanner = new SimpleScanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        int n = scanner.nextInt();
        int maxOps = scanner.nextInt();
        int[] x = new int[n];
        int sum = 0;
        for (int i = 0; i < n; ++i) {
            x[i] = scanner.nextInt();
            sum += x[i];
        }
        int ans = 1;
        for (int i = 1; i * i <= sum; ++i) {
            if (sum % i == 0) {
                if (check(i, x, maxOps))
                    ans = Math.max(ans, i);
                if (check(sum / i, x, maxOps))
                    ans = Math.max(ans, sum / i);
            }
        }
        writer.println(ans);
        writer.close();
    }

    private static boolean check(int g, int[] x, int maxOps) {
        int n = x.length;
        ArrayList<Integer> remainders = new ArrayList<>();
        long change = 0;
        long ops = 0;
        for (int value : x) {
            int r = value % g;
            remainders.add(r);
            change -= r;
            ops += r;
        }
        remainders.sort(Comparator.reverseOrder());
        if (change % g != 0)
            throw new RuntimeException();
        for (int remainder : remainders) {
            if (change == 0)
                break;
            change += g;
            ops -= remainder;
            ops += g - remainder;
        }
        return ops <= 2 * maxOps;
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