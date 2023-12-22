import java.io.*;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        SimpleScanner scanner = new SimpleScanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        int n = scanner.nextInt();
        int m = n * (n - 1) / 2;
        ArrayList<LinkedList<Integer>> links = new ArrayList<>(m);
        for (int i = 0; i < m; ++i)
            links.add(new LinkedList<>());
        int[] inDegree = new int[m];
        for (int x = 0; x < n; ++x) {
            int pre = -1;
            for (int i = 0; i < n - 1; ++i) {
                int y = scanner.nextInt() - 1;
                int cur = (2 * n - Math.min(x, y) - 1) * Math.min(x, y) / 2 + (Math.max(x, y) - Math.min(x, y) - 1);
                if (pre != -1) {
                    links.get(pre).add(cur);
                    ++inDegree[cur];
                }
                pre = cur;
            }
        }
        Queue<Integer> queue = new LinkedList<>();
        int remove = 0;
        int[] depth = new int[m];
        for (int u = 0; u < m; ++u) {
            if (inDegree[u] == 0) {
                queue.offer(u);
                depth[u] = 1;
                ++remove;
            }
        }
        int ans = 0;
        while (!queue.isEmpty()) {
            int u = queue.poll();
            ans = Math.max(ans, depth[u]);
            for (int v : links.get(u)) {
                if (--inDegree[v] == 0) {
                    queue.offer(v);
                    depth[v] = depth[u] + 1;
                    ++remove;
                }
            }
        }
        writer.println(remove == m ? ans : -1);
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
            return Integer.valueOf(next());
        }

        private long nextLong() {
            return Long.valueOf(next());
        }

        private double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}