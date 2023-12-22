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
        int m = scanner.nextInt();
        ArrayList<Integer> x = new ArrayList<>(n);
        for (int i = 0; i < n; ++i)
            x.add(scanner.nextInt());
        x.sort(Comparator.reverseOrder());
        ArrayList<Pair> y = new ArrayList<>(m);
        for (int i = 0; i < m; ++i) {
            int num = scanner.nextInt();
            int value = scanner.nextInt();
            y.add(new Pair(num, value));
        }
        y.sort((pair1, pair2) -> pair2.value == pair1.value ? pair2.num - pair1.num : pair2.value - pair1.value);
        long sum = 0;
        for (int i = 0, j = 0, left = n; left > 0; ) {
            if (j >= m || x.get(i) > y.get(j).value) {
                sum += x.get(i);
                ++i;
                --left;
            } else {
                if (y.get(j).num > left) {
                    sum += (long) left * y.get(j).value;
                    left = 0;
                } else {
                    sum += (long) y.get(j).num * y.get(j).value;
                    left -= y.get(j).num;
                    ++j;
                }
            }
        }
        writer.println(sum);
        writer.close();
    }

    private static class Pair {
        final int num, value;

        Pair(int num, int value) {
            this.num = num;
            this.value = value;
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