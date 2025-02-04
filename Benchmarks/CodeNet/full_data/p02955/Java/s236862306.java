import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.io.OutputStreamWriter;
import java.util.NoSuchElementException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.stream.LongStream;
import java.util.Iterator;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.List;
import java.io.Writer;
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
        EMaxGCD solver = new EMaxGCD();
        solver.solve(1, in, out);
        out.close();
    }

    static class EMaxGCD {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.readInt();
            long k = in.readLong();
            long[] a = in.readLongArray(n);

            long sum = LongStream.of(a).sum();

            long ans = 0;
            for (long i : IntegerUtils.getDivisors(sum)) {
                long[] b = LongStream.of(a).map(x -> x % i).sorted().toArray();

                long[] c = new long[n + 1];
                long[] d = new long[n + 1];
                for (int j = 0; j < n; j++) {
                    c[j + 1] = c[j] + b[j];
                    d[n - 1 - j] = d[n - j] + (i - b[n - 1 - j]);
                }
                for (int j = 0; j <= n; j++) {
                    if (c[j] == d[j] && c[j] <= k) {
                        ans = Math.max(ans, i);
                    }
                }
            }

            out.printLine(ans);
        }

    }

    static interface LongList extends LongReversableCollection {
        public abstract long get(int index);

        public abstract void addAt(int index, long value);

        public abstract void removeAt(int index);

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

        default public void add(long value) {
            addAt(size(), value);
        }

    }

    static interface net_egork_generated_collections_LongStream extends Iterable<Long>, Comparable<net_egork_generated_collections_LongStream> {
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

        default public int compareTo(net_egork_generated_collections_LongStream c) {
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

    static interface LongCollection extends net_egork_generated_collections_LongStream {
        public int size();

        default public void add(long value) {
            throw new UnsupportedOperationException();
        }

        default public LongCollection addAll(net_egork_generated_collections_LongStream values) {
            for (LongIterator it = values.longIterator(); it.isValid(); it.advance()) {
                add(it.value());
            }
            return this;
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

    static abstract class LongAbstractStream implements net_egork_generated_collections_LongStream {
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
            if (!(o instanceof net_egork_generated_collections_LongStream)) {
                return false;
            }
            net_egork_generated_collections_LongStream c = (net_egork_generated_collections_LongStream) o;
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

    static interface LongIterator {
        public long value() throws NoSuchElementException;

        public boolean advance();

        public boolean isValid();

    }

    static interface LongReversableCollection extends LongCollection {
    }

    static class IntegerUtils {
        public static List<LongIntPair> factorize(long number) {
            List<LongIntPair> result = new ArrayList<>();
            for (long i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    int power = 0;
                    do {
                        power++;
                        number /= i;
                    } while (number % i == 0);
                    result.add(LongIntPair.makePair(i, power));
                }
            }
            if (number != 1) {
                result.add(LongIntPair.makePair(number, 1));
            }
            return result;
        }

        public static LongList getDivisors(long number) {
            List<LongIntPair> primeDivisors = factorize(number);
            return getDivisorsImpl(primeDivisors, 0, 1, new LongArrayList());
        }

        private static LongList getDivisorsImpl(List<LongIntPair> primeDivisors, int index, long current, LongList result) {
            if (index == primeDivisors.size()) {
                result.add(current);
                return result;
            }
            long p = primeDivisors.get(index).first;
            int power = primeDivisors.get(index).second;
            for (int i = 0; i <= power; i++) {
                getDivisorsImpl(primeDivisors, index + 1, current, result);
                current *= p;
            }
            return result;
        }

    }

    static class LongArrayList extends LongAbstractStream implements LongList {
        private int size;
        private long[] data;

        public LongArrayList() {
            this(3);
        }

        public LongArrayList(int capacity) {
            data = new long[capacity];
        }

        public LongArrayList(LongCollection c) {
            this(c.size());
            addAll(c);
        }

        public LongArrayList(net_egork_generated_collections_LongStream c) {
            this();
            if (c instanceof LongCollection) {
                ensureCapacity(((LongCollection) c).size());
            }
            addAll(c);
        }

        public LongArrayList(LongArrayList c) {
            size = c.size();
            data = c.data.clone();
        }

        public LongArrayList(long[] arr) {
            size = arr.length;
            data = arr.clone();
        }

        public int size() {
            return size;
        }

        public long get(int at) {
            if (at >= size) {
                throw new IndexOutOfBoundsException("at = " + at + ", size = " + size);
            }
            return data[at];
        }

        private void ensureCapacity(int capacity) {
            if (data.length >= capacity) {
                return;
            }
            capacity = Math.max(2 * data.length, capacity);
            data = Arrays.copyOf(data, capacity);
        }

        public void addAt(int index, long value) {
            ensureCapacity(size + 1);
            if (index > size || index < 0) {
                throw new IndexOutOfBoundsException("at = " + index + ", size = " + size);
            }
            if (index != size) {
                System.arraycopy(data, index, data, index + 1, size - index);
            }
            data[index] = value;
            size++;
        }

        public void removeAt(int index) {
            if (index >= size || index < 0) {
                throw new IndexOutOfBoundsException("at = " + index + ", size = " + size);
            }
            if (index != size - 1) {
                System.arraycopy(data, index + 1, data, index, size - index - 1);
            }
            size--;
        }

    }

    static class LongIntPair implements Comparable<LongIntPair> {
        public final long first;
        public final int second;

        public static LongIntPair makePair(long first, int second) {
            return new LongIntPair(first, second);
        }

        public LongIntPair(long first, int second) {
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

            LongIntPair pair = (LongIntPair) o;

            return first == pair.first && second == pair.second;
        }

        public int hashCode() {
            int result = Long.hashCode(first);
            result = 31 * result + Integer.hashCode(second);
            return result;
        }

        public String toString() {
            return "(" + first + "," + second + ")";
        }

        public int compareTo(LongIntPair o) {
            int value = Long.compare(first, o.first);
            if (value != 0) {
                return value;
            }
            return Integer.compare(second, o.second);
        }

    }
}

