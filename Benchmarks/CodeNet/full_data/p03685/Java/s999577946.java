import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.Collection;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.stream.Collectors;
import java.util.Stack;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.Vector;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.Comparator;
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
        EConnected solver = new EConnected();
        solver.solve(1, in, out);
        out.close();
    }

    static class EConnected {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int r = in.readInt();
            int c = in.readInt();
            int n = in.readInt();

            List<IntIntPair> list1 = new ArrayList<>();
            List<IntIntPair> list2 = new ArrayList<>();
            List<IntIntPair> list3 = new ArrayList<>();
            List<IntIntPair> list4 = new ArrayList<>();

            out:
            for (int i = 0; i < n; i++) {
                int[][] a = in.readIntTable(2, 2);
                for (int j = 0; j < 2; j++) {
                    if (a[j][0] != 0 && a[j][0] != r && a[j][1] != 0 && a[j][1] != c) continue out;
                }
                for (int j = 0; j < 2; j++) {
                    if (a[j][0] > 0 && a[j][1] == 0) list1.add(new IntIntPair(a[j][0], i));
                    if (a[j][0] == r && a[j][1] > 0) list2.add(new IntIntPair(a[j][1], i));
                    if (a[j][0] < r && a[j][1] == c) list3.add(new IntIntPair(a[j][0], i));
                    if (a[j][0] == 0 && a[j][1] < c) list4.add(new IntIntPair(a[j][1], i));
                }
            }

            list1.sort(Comparator.naturalOrder());
            list2.sort(Comparator.naturalOrder());
            list3.sort(Comparator.reverseOrder());
            list4.sort(Comparator.reverseOrder());

            List<Integer> all = Stream.of(list1, list2, list3, list4)
                    .flatMap(Collection::stream)
                    .map(p -> p.second)
                    .collect(Collectors.toList());

            Stack<Integer> stack = new Stack<>();
            for (int x : all) {
                if (stack.empty() || x != stack.peek()) {
                    stack.push(x);
                } else {
                    stack.pop();
                }
            }

            out.printLine(stack.size() == 0 ? "YES" : "NO");
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

        public int[][] readIntTable(int rowCount, int columnCount) {
            int[][] table = new int[rowCount][];
            for (int i = 0; i < rowCount; i++) {
                table[i] = readIntArray(columnCount);
            }
            return table;
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

    static class IntIntPair implements Comparable<IntIntPair> {
        public final int first;
        public final int second;

        public IntIntPair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            IntIntPair pair = (IntIntPair) o;

            return first == pair.first && second == pair.second;
        }

        public int hashCode() {
            int result = first;
            result = 31 * result + second;
            return result;
        }

        public String toString() {
            return "(" + first + "," + second + ")";
        }

        public int compareTo(IntIntPair o) {
            int value = Integer.compare(first, o.first);
            if (value != 0) {
                return value;
            }
            return Integer.compare(second, o.second);
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

        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
        }

        public void printLine(Object... objects) {
            print(objects);
            writer.println();
        }

        public void close() {
            writer.close();
        }

    }
}

