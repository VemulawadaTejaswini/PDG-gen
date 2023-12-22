import java.io.*;
import java.nio.CharBuffer;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        SimpleScanner scanner = new SimpleScanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        char[] s = scanner.next().toCharArray();
        int n = s.length;
        long ans = 0;
        int pre = -2;
        int preCount = 0;
        for (int i = 2; i < n; ++i) {
            if (s[i - 2] == 'A' && s[i - 1] == 'B' && s[i] == 'C') {
                int prefixA = 0;
                int suffixBC = 0;
                int j;
                for (j = i - 2; j >= 0; --j)
                    if (s[j] == 'A')
                        ++prefixA;
                    else
                        break;
                if (j == pre)
                    prefixA += preCount;
                for (j = i; j < n; j += 2)
                    if (s[j - 1] == 'B' && s[j] == 'C')
                        ++suffixBC;
                    else
                        break;
                pre = i = j - 2;
                preCount = prefixA;
                ans += (long) prefixA * suffixBC;
            }
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