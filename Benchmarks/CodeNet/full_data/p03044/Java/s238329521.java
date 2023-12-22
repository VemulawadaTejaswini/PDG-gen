import java.io.*;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        SimpleScanner scanner = new SimpleScanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        int n = scanner.nextInt();
        LinkedList<Link>[] links = new LinkedList[n];
        for (int i = 0; i < n; ++i)
            links[i] = new LinkedList<>();
        for (int i = 0; i < n - 1; ++i) {
            int u = scanner.nextInt() - 1;
            int v = scanner.nextInt() - 1;
            int w = scanner.nextInt();
            links[u].add(new Link(v, w));
            links[v].add(new Link(u, w));
        }
        int[] color = new int[n];
        Arrays.fill(color, -1);
        color[0] = 0;
        dfs(0, links, color);
        for (int i = 0; i < n; ++i)
            writer.println(color[i]);

        writer.close();
    }

    private static void dfs(int u, LinkedList<Link>[] links, int[] color) {
        for (Link link : links[u]) {
            if (color[link.to] < 0) {
                color[link.to] = link.weight % 2 == 0 ? color[u] : color[u] ^ 1;
                dfs(link.to, links, color);
            }
        }
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