import java.io.*;
import java.nio.CharBuffer;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        SimpleScanner scanner = new SimpleScanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<LinkedList<Integer>> links = new ArrayList<>();
        for (int i = 0; i < n; ++i)
            links.add(new LinkedList<>());
        for (int i = 0; i < m; ++i) {
            int u = scanner.nextInt() - 1;
            int v = scanner.nextInt() - 1;
            links.get(u).add(v);
        }
        int s = scanner.nextInt() - 1;
        int t = scanner.nextInt() - 1;
        int[][] d = new int[n][3];
        for (int i = 0; i < n; ++i)
            Arrays.fill(d[i], -1);
        d[s][0] = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{s, 0});
        while (!queue.isEmpty()) {
            int[] p = queue.poll();
            int u = p[0];
            int mod = p[1];
            int nextMod = (mod + 1) % 3;
            for (int v : links.get(u)) {
                if (d[v][nextMod] < 0) {
                    d[v][nextMod] = d[u][mod] + 1;
                    queue.offer(new int[]{v, nextMod});
                }
            }
        }
        writer.println(d[t][0] >= 0 ? d[t][0] / 3 : -1);

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