import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.AbstractCollection;
import java.util.PriorityQueue;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Comparator;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Hamza Hasbi  "hamzahasbi.me"
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();
            long[] a = new long[3 * n + 1];
            long[] p = new long[3 * n + 1];


            for (int i = 0; i < 3 * n; i++) {
                a[i] = in.nextLong();

            }
            PriorityQueue<Long> left = new PriorityQueue<>();
            PriorityQueue<Long> right = new PriorityQueue<Long>(new Comparator<Long>() {
                public int compare(Long int1, Long int2) {
                    return int2.compareTo(int1);
                }
            });
            long[] b = new long[2 * n + 1];
            int index = (n % 2 == 0) ? 3 * n / 2 : 3 * n / 2 + 1;
            for (int i = 0; i < index; i++) {
                left.offer(a[i]);
            }
            for (int i = index; i < 3 * n; i++) {
                right.offer(a[i]);
            }
            long ans = 0;
            int r = n;
            boolean f = true;
            while (n > 0) {
                if (f) {
                    left.poll();
                    f = !f;
                } else {
                    right.poll();
                    f = !f;
                }
                n--;
            }
            while (!left.isEmpty()) {
                //out.print(left.peek()+" ");
                ans += left.poll();
            }
            //out.printLine();
            while (!right.isEmpty()) {
                //out.print(right.peek()+" ");
                ans -= right.poll();
            }
            out.printLine(ans);
        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void printLine(long i) {
            writer.println(i);
        }

        public void close() {
            writer.close();
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) return -1;
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public long nextLong() {
            int c = read();
