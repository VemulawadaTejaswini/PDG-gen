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
    TaskD solver = new TaskD();
    solver.solve(1, in, out);
    out.close();
  }

  static class TaskD {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
      char[] s = in.nextString().toCharArray();
      IntList[] positions = new IntList[26];
      for (int i = 0; i < 26; i++) {
        positions[i] = new IntArrayList();
      }
      for (int i = 0; i < s.length; i++) {
        positions[s[i] - 'a'].add(i);
      }
      for (int i = 0; i < 26; i++) {
        int size = positions[i].size();
        for (int j = 0; j < size; j++) {
          int from = positions[i].get(j);
          for (int k = j + 1; k < size; k++) {
            int to = positions[i].get(k);
            int perm = to - from + 1;
            int count = k - j + 1;
            if (count > perm / 2) {
              out.printLine(from + " " + to);
              return;
            }
          }
        }
      }
      out.printLine("-1 -1");
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

  static interface IntIterator {
    int value() throws NoSuchElementException;

    boolean advance();

    boolean isValid();

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

    public String nextString() {
      int c = read();
      while (isSpaceChar(c)) {
        c = read();
      }
      StringBuilder res = new StringBuilder();
      do {
        if (Character.isValidCodePoint(c)) {
          res.appendCodePoint(c);
        }
        c = read();
      } while (!isSpaceChar(c));
      return res.toString();
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

  static interface IntList extends IntReversibleCollection {
    public abstract int get(int index);

    public abstract void addAt(int index, int value);

    public abstract void removeAt(int index);

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

  }

  static interface IntCollection extends IntStream {
    int size();

    default void add(int value) {
      throw new UnsupportedOperationException();
    }

    default IntCollection addAll(IntStream values) {
      for (IntIterator it = values.intIterator(); it.isValid(); it.advance()) {
        add(it.value());
      }
      return this;
    }

  }

  static interface IntReversibleCollection extends IntCollection {
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

  }
}

