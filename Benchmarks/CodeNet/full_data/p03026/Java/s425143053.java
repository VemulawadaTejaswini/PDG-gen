import java.io.*;
import java.nio.CharBuffer;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        SimpleScanner scanner = new SimpleScanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        int n = scanner.nextInt();
        ArrayList<LinkedList<Integer>> links = new ArrayList<>(n);
        for (int i = 0; i < n; ++i)
            links.add(new LinkedList<>());
        for (int i = 1; i < n; ++i) {
            int u = scanner.nextInt() - 1;
            int v = scanner.nextInt() - 1;
            links.get(u).add(v);
            links.get(v).add(u);
        }
        ArrayList<Integer> w = new ArrayList<>(n);
        int sum = 0;
        for (int i = 0; i < n; ++i) {
            int t = scanner.nextInt();
            sum += t;
            w.add(t);
        }
        w.sort(Comparator.reverseOrder());
        int[] ans = new int[n];
        Arrays.fill(ans, 0);
        dfs(0, links, w.iterator(), ans);
        writer.println(sum - w.get(0));
        for (int i = 0; i < n; ++i)
            writer.print(ans[i] + " ");
        writer.println();
        writer.close();
    }

    private static void dfs(int u, List<LinkedList<Integer>> links, Iterator<Integer> iterator, int[] ans) {
        ans[u] = iterator.next();
        for (int v : links.get(u)) {
            if (ans[v] == 0) {
                dfs(v, links, iterator, ans);
            }
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