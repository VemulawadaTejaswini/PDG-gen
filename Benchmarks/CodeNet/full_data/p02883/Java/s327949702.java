import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.NoSuchElementException;
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
        EGluttony solver = new EGluttony();
        solver.solve(1, in, out);
        out.close();
    }

    static class EGluttony {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.readInt();
            long k = in.readLong();

            long[] a = in.readLongArray(n);
            long[] f = in.readLongArray(n);
            Arrays.sort(a);
            Arrays.sort(f);
            ArrayUtils.reverse(f);

            long high = Constants.LINF;
            long low = -1;
            while (high - low > 1) {
                long mid = (high + low) / 2;
                long cnt = 0;
                for (int i = 0; i < n; i++) {
                    cnt += Math.max(0, a[i] - mid / f[i]);
                }
                if (cnt <= k) high = mid;
                else low = mid;
            }
            out.printLine(high);
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

        public long[] readLongArray(int size) {
            long[] array = new long[size];
            for (int i = 0; i < size; i++) {
                array[i] = readLong();
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

        public long readLong() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
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

    static interface LongList extends LongReversableCollection {
        public abstract long get(int index);

        public abstract void set(int index, long value);

        public abstract void removeAt(int index);

        default public void swap(int first, int second) {
            if (first == second) {
                return;
            }
            long temp = get(first);
            set(first, get(second));
            set(second, temp);
        }

        default public LongIterator longIterator() {
            return new LongIterator() {
                private int at;
                private boolean removed;

                public long value() {
                    if (removed) {
                        throw new IllegalStateException();
                    }
                    return get(at);
                }

                public boolean advance() {
                    at++;
                    removed = false;
                    return isValid();
                }

                public boolean isValid() {
                    return !removed && at < size();
                }

                public void remove() {
                    removeAt(at);
                    at--;
                    removed = true;
                }
            };
        }

        default public void inPlaceReverse() {
            for (int i = 0, j = size() - 1; i < j; i++, j--) {
                swap(i, j);
            }
        }

    }

    static class Constants {
        public static final long LINF = (long) 1e18 + 1;

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

    static interface LongIterator {
        public long value() throws NoSuchElementException;

        public boolean advance();

        public boolean isValid();

    }

    static interface LongCollection extends LongStream {
        public int size();

    }

    static interface LongStream extends Iterable<Long>, Comparable<LongStream> {
        public LongIterator longIterator();

        default public Iterator<Long> iterator() {
            return new Iterator<Long>() {
                private LongIterator it = longIterator();

                public boolean hasNext() {
                    return it.isValid();
                }

                public Long next() {
                    long result = it.value();
                    it.advance();
                    return result;
                }
            };
        }

        default public int compareTo(LongStream c) {
            LongIterator it = longIterator();
            LongIterator jt = c.longIterator();
            while (it.isValid() && jt.isValid()) {
                long i = it.value();
                long j = jt.value();
                if (i < j) {
                    return -1;
                } else if (i > j) {
                    return 1;
                }
                it.advance();
                jt.advance();
            }
            if (it.isValid()) {
                return 1;
            }
            if (jt.isValid()) {
                return -1;
            }
            return 0;
        }

    }

    static class LongArray extends LongAbstractStream implements LongList {
        private long[] data;

        public LongArray(long[] arr) {
            data = arr;
        }

        public int size() {
            return data.length;
        }

        public long get(int at) {
            return data[at];
        }

        public void removeAt(int index) {
            throw new UnsupportedOperationException();
        }

        public void set(int index, long value) {
            data[index] = value;
        }

    }

    static class ArrayUtils {
        public static void reverse(long[] array) {
            new LongArray(array).inPlaceReverse();
        }

    }

    static interface LongReversableCollection extends LongCollection {
    }

    static abstract class LongAbstractStream implements LongStream {
        public String toString() {
            StringBuilder builder = new StringBuilder();
            boolean first = true;
            for (LongIterator it = longIterator(); it.isValid(); it.advance()) {
                if (first) {
                    first = false;
                } else {
                    builder.append(' ');
                }
                builder.append(it.value());
            }
            return builder.toString();
        }

        public boolean equals(Object o) {
            if (!(o instanceof LongStream)) {
                return false;
            }
            LongStream c = (LongStream) o;
            LongIterator it = longIterator();
            LongIterator jt = c.longIterator();
            while (it.isValid() && jt.isValid()) {
                if (it.value() != jt.value()) {
                    return false;
                }
                it.advance();
                jt.advance();
            }
            return !it.isValid() && !jt.isValid();
        }

        public int hashCode() {
            int result = 0;
            for (LongIterator it = longIterator(); it.isValid(); it.advance()) {
                result *= 31;
                result += it.value();
            }
            return result;
        }

    }
}

