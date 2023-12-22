import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.stream.IntStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.stream.LongStream;
import java.io.BufferedWriter;
import java.util.PriorityQueue;
import java.util.AbstractQueue;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.OptionalLong;
import java.util.List;
import java.util.stream.Stream;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        D3NNumbers solver = new D3NNumbers();
        solver.solve(1, in, out);
        out.close();
    }

    static class D3NNumbers {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.readInt();
            int[] a = in.readIntArray(3 * n);

            int[] s1 = Arrays.copyOf(a, n);
            List<Integer> t1 = Arrays.stream(a, n, 2 * n)
                    .boxed()
                    .collect(Collectors.toList());
            List<Long> a1 = f(n, s1, t1);

            int[] s2 = Arrays.stream(a, 2 * n, 3 * n)
                    .map(x -> -x)
                    .toArray();
            List<Integer> t2 = IntStream.range(0, n)
                    .map(i -> -a[2 * n - 1 - i])
                    .boxed()
                    .collect(Collectors.toList());
            List<Long> a2 = f(n, s2, t2);

            long ans = IntStream.rangeClosed(0, n)
                    .mapToLong(i -> a1.get(i) + a2.get(n - i))
                    .max()
                    .getAsLong();
            out.printLine(ans);
        }

        private List<Long> f(int n, int[] s, List<Integer> t) {
            PriorityQueue<Integer> q = new PriorityQueue<>();
            q.addAll(Arrays.stream(s).boxed().collect(Collectors.toList()));
            long sum = Arrays.stream(s).sum();
            List<Long> ret = new ArrayList<>();
            ret.add(sum);
            for (int x : t) {
                q.add(x);
                sum += x;
                sum -= q.poll();
                ret.add(sum);
            }
            return ret;
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

        public int[] readIntArray(int size) {
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = readInt();
            }
            return array;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int readInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

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

        public void close() {
            writer.close();
        }

        public void printLine(long i) {
            writer.println(i);
        }

    }
}

