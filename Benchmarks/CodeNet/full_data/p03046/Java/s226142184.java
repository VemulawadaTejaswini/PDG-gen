import java.io.*;
import java.nio.CharBuffer;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        SimpleScanner scanner = new SimpleScanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        if (k < (1 << n)) {
//            if (k == 0) {
//                for (int i = 0; i < 1 << n; ++i)
//                    writer.print(i + " ");
//                for (int i = (1 << n) - 1; i >= 0; --i)
//                    writer.print(i + " ");
//                writer.println();
//            } else {
                for (int i = (1 << n) - 1; i >= 0; --i)
                    if (i != k)
                        writer.print(i + " ");
                writer.print(k + " ");
                for (int i = 0; i < 1 << n; ++i)
                    if (i != k)
                        writer.print(i + " ");
                writer.print(k + " ");
                writer.println();
//            }
        } else
            writer.println(-1);

        writer.close();
    }

    private static int getF(int u, int[] f) {
        return f[u] == u ? u : (f[u] = getF(f[u], f));
    }

    private static class Link {
        final int to;
        final int weight;

        Link(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
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