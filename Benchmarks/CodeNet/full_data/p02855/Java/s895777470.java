import java.io.*;
import java.nio.CharBuffer;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        SimpleScanner scanner = new SimpleScanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int k = scanner.nextInt();
        char[][] grid = new char[h][];
        for (int i = 0; i < h; ++i)
            grid[i] = scanner.next().toCharArray();
        int[][] ans = new int[h][w];
        int idx = 0;
        int pre = 0;
        for (int cur = 0; cur < h; ++cur) {
            boolean empty = true;
            for (int c = 0; c < w; ++c)
                if (grid[cur][c] == '#') {
                    empty = false;
                    break;
                }
            if (!empty) {
                ++idx;
                boolean first = true;
                for (int c = 0; c < w; ++c) {
                    if (grid[cur][c] == '#') {
                        if (first)
                            first = false;
                        else
                            ++idx;
                    }
                    ans[cur][c] = idx;
                }
                for (int r = pre; r < cur; ++r)
                    System.arraycopy(ans[cur], 0, ans[r], 0, w);
                pre = cur + 1;
            }
        }
        if (pre != h) {
            for (int r = pre; r < h; ++r)
                System.arraycopy(ans[pre - 1], 0, ans[r], 0, w);
        }
        for (int r = 0; r < h; ++r) {
            for (int c = 0; c < w; ++c) {
                writer.print(ans[r][c] + " ");
            }
            writer.println();
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