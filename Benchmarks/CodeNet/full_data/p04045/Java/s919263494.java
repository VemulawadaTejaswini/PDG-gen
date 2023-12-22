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
 * @author GYSHGX868
 */
public class Main {
  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    InputReader in = new InputReader(inputStream);
    OutputWriter out = new OutputWriter(outputStream);
    TaskC solver = new TaskC();
    solver.solve(1, in, out);
    out.close();
  }

  static class TaskC {
    private boolean[] valid;
    private IntList combination;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
      int n = in.nextInt();
      int k = in.nextInt();
      valid = new boolean[10];
      Arrays.fill(valid, true);
      for (int i = 0; i < k; i++) {
        valid[in.nextInt()] = false;
      }
      combination = new IntArrayList();
      int[] digits = IntegerUtils.getDigits(n);
      int numDigits = digits.length;
      for (int i = 1; i < 10; i++) {
        if (!valid[i]) {
          continue;
        }
        dfs(i, numDigits, 1);
      }
      combination.sort();
      for (IntIterator iterator = combination.intIterator(); iterator.isValid();
          iterator.advance()) {
        if (iterator.value() >= n) {
          out.printLine(iterator.value());
          return;
        }
      }
    }

    private void dfs(int current, int tarLength, int curLength) {
      if (curLength - tarLength > 1) {
        return;
      }
      if (curLength >= tarLength) {
        combination.add(current);
      }
      for (int i = 0; i < 10; i++) {
        if (!valid[i]) {
          continue;
        }
        dfs(current * 10 + i, tarLength, curLength + 1);
      }
    }

  }

  static interface IntReversibleCollection extends IntCollection {
  }

  static interface IntComparator {
    IntComparator DEFAULT = (first, second) -> {
      if (first < second) {
        return -1;
      }
      if (first > second) {
        return 1;
      }
      return 0;
    };

    int compare(int first, int second);

  }

  static interface IntList extends IntReversibleCollection {
    public abstract int get(int index);

    public abstract void set(int index, int value);

    public abstract void addAt(int index, int value);

    public abstract void removeAt(int index);

    public default void swap(int first, int second) {
      if (first == second) {
        return;
      }
      int temp = get(first);
      set(first, get(second));
      set(second, temp);
    }

    public default IntIterator intIterator() {
      return new IntIterator() {
        private int at;
        private boolean removed;


        public int value() {
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

    public default void add(int value) {
      addAt(size(), value);
    }

    public default IntList sort() {
      sort(IntComparator.DEFAULT);
      return this;
    }

    public default IntList sort(IntComparator comparator) {
      Sorter.sort(this, comparator);
      return this;
    }

    public default void inPlaceReverse() {
      for (int i = 0, j = size() - 1; i < j; i++, j--) {
        swap(i, j);
      }
    }

  }

  static interface IntIterator {
    int value() throws NoSuchElementException;

    boolean advance();

    boolean isValid();

  }

  static class IntegerUtils {
    private IntegerUtils() {
    }

    public static int[] getDigits(int number) {
      return getDigits((long) number);
    }

    public static int[] getDigits(long number) {
      IntList results = new IntArrayList(20);
      number = Math.abs(number);
      while (number >= 10) {
        results.add((int) number % 10);
        number /= 10;
      }
      results.add((int) number);
      results.inPlaceReverse();
      return results.toArray();
    }

  }

  static interface IntCollection extends IntStream {
    int size();

    default void add(int value) {
      throw new UnsupportedOperationException();
    }

    default int[] toArray() {
      int size = size();
      int[] array = new int[size];
      int i = 0;
      for (IntIterator it = intIterator(); it.isValid(); it.advance()) {
        array[i++] = it.value();
      }
      return array;
    }

    default IntCollection addAll(IntStream values) {
      for (IntIterator it = values.intIterator(); it.isValid(); it.advance()) {
        add(it.value());
      }
      return this;
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

    public void printLine(int i) {
      writer.println(i);
    }

  }

  static class IntArrayList extends IntAbstractStream implements IntList {
    private int size;
    private int[] data;

    public IntArrayList() {
      this(3);
    }

    public IntArrayList(int capacity) {
      data = new int[capacity];
    }

    public IntArrayList(IntCollection c) {
      this(c.size());
      addAll(c);
    }

    public IntArrayList(IntStream c) {
      this();
      if (c instanceof IntCollection) {
        ensureCapacity(((IntCollection) c).size());
      }
      addAll(c);
    }

    public IntArrayList(IntArrayList c) {
      size = c.size();
      data = c.data.clone();
    }

    public IntArrayList(int[] arr) {
      size = arr.length;
      data = arr.clone();
    }

    public int size() {
      return size;
    }

    public int get(int at) {
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

    public void addAt(int index, int value) {
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

    public void set(int index, int value) {
      if (index >= size) {
        throw new IndexOutOfBoundsException("at = " + index + ", size = " + size);
      }
      data[index] = value;
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

    public int nextInt() {
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
      boolean isSpaceChar(int ch);

    }

  }

  static class Sorter {
    private static final int INSERTION_THRESHOLD = 16;

    private Sorter() {
    }

    public static void sort(IntList list, IntComparator comparator) {
      quickSort(list, 0, list.size() - 1,
          (Integer.bitCount(Integer.highestOneBit(list.size()) - 1) * 5) >> 1, comparator);
    }

    private static void quickSort(IntList list, int from, int to, int remaining,
        IntComparator comparator) {
      if (to - from < INSERTION_THRESHOLD) {
        insertionSort(list, from, to, comparator);
        return;
      }
      if (remaining == 0) {
        heapSort(list, from, to, comparator);
        return;
      }
      remaining--;
      int pivotIndex = (from + to) >> 1;
      int pivot = list.get(pivotIndex);
      list.swap(pivotIndex, to);
      int storeIndex = from;
      int equalIndex = to;
      for (int i = from; i < equalIndex; i++) {
        int value = comparator.compare(list.get(i), pivot);
        if (value < 0) {
          list.swap(storeIndex++, i);
        } else if (value == 0) {
          list.swap(--equalIndex, i--);
        }
      }
      quickSort(list, from, storeIndex - 1, remaining, comparator);
      for (int i = equalIndex; i <= to; i++) {
        list.swap(storeIndex++, i);
      }
      quickSort(list, storeIndex, to, remaining, comparator);
    }

    private static void heapSort(IntList list, int from, int to, IntComparator comparator) {
      for (int i = (to + from - 1) >> 1; i >= from; i--) {
        siftDown(list, i, to, comparator, from);
      }
      for (int i = to; i > from; i--) {
        list.swap(from, i);
        siftDown(list, from, i - 1, comparator, from);
      }
    }

    private static void siftDown(IntList list, int start, int end, IntComparator comparator,
        int delta) {
      int value = list.get(start);
      while (true) {
        int child = ((start - delta) << 1) + 1 + delta;
        if (child > end) {
          return;
        }
        int childValue = list.get(child);
        if (child + 1 <= end) {
          int otherValue = list.get(child + 1);
          if (comparator.compare(otherValue, childValue) > 0) {
            child++;
            childValue = otherValue;
          }
        }
        if (comparator.compare(value, childValue) >= 0) {
          return;
        }
        list.swap(start, child);
        start = child;
      }
    }

    private static void insertionSort(IntList list, int from, int to, IntComparator comparator) {
      for (int i = from + 1; i <= to; i++) {
        int value = list.get(i);
        for (int j = i - 1; j >= from; j--) {
          if (comparator.compare(list.get(j), value) <= 0) {
            break;
          }
          list.swap(j, j + 1);
        }
      }
    }

  }

  static abstract class IntAbstractStream implements IntStream {
    public String toString() {
      return toString(" ");
    }

    public String toString(String separator) {
      StringBuilder builder = new StringBuilder();
      boolean first = true;
      for (IntIterator it = intIterator(); it.isValid(); it.advance()) {
        if (first) {
          first = false;
        } else {
          builder.append(separator);
        }
        builder.append(it.value());
      }
      return builder.toString();
    }

    public boolean equals(Object o) {
      if (!(o instanceof IntStream)) {
        return false;
      }
      IntStream c = (IntStream) o;
      IntIterator it = intIterator();
      IntIterator jt = c.intIterator();
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
      for (IntIterator it = intIterator(); it.isValid(); it.advance()) {
        result *= 31;
        result += it.value();
      }
      return result;
    }

  }

  static interface IntStream extends Iterable<Integer>, Comparable<IntStream> {
    IntIterator intIterator();

    default Iterator<Integer> iterator() {
      return new Iterator<Integer>() {
        private IntIterator it = intIterator();


        public boolean hasNext() {
          return it.isValid();
        }


        public Integer next() {
          if (!hasNext()) {
            throw new NoSuchElementException();
          }
          int result = it.value();
          it.advance();
          return result;
        }
      };
    }

    default int compareTo(IntStream c) {
      IntIterator it = intIterator();
      IntIterator jt = c.intIterator();
      while (it.isValid() && jt.isValid()) {
        int i = it.value();
        int j = jt.value();
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
}

