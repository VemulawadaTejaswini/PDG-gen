import java.io.*;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        SimpleScanner scanner = new SimpleScanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        int n = scanner.nextInt();
        List<List<Integer>> links = new ArrayList<>();
        for (int i = 0; i < n; ++i)
            links.add(new ArrayList<>());
        for (int i = 0; i < n - 1; ++i) {
            int u = scanner.nextInt() - 1;
            int v = scanner.nextInt() - 1;
            links.get(u).add(v);
            links.get(v).add(u);
        }
        int[] r = bfs(n, links, 0);
        r = bfs(n, links, r[0]);

        writer.println((r[1] + 1) % 3 == 2 ? "Second" : "First");
        writer.close();
    }

    private static int[] bfs(int n, List<List<Integer>> links, int k) {
        int[] queue = new int[n];
        int p, q;
        p = q = 0;
        queue[q++] = k;
        int[] d = new int[n];
        Arrays.fill(d, -1);
        d[k] = 0;
        while (p < q) {
            int u = queue[p];
            for (int v : links.get(u)) {
                if (d[v] < 0) {
                    d[v] = d[u] + 1;
                    queue[q++] = v;
                }
            }
            ++p;
        }
        return new int[]{queue[q - 1], d[queue[q - 1]]};
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