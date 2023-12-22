import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.Collection;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Deque;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Rustam Musin (t.me/musin)
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        CLexicographicConstraints solver = new CLexicographicConstraints();
        solver.solve(1, in, out);
        out.close();
    }

    static class CLexicographicConstraints {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.readInt();
            int[] a = in.readIntArray(n);
            MyString2 s = new MyString2();
            s.resize(a[0]);
            for (int i = 1; i < a.length; i++) {
                s.resize(a[i]);
                if (a[i] <= a[i - 1]) {
                    s.increase();
                }
            }
            out.print(s.maxItem + 1);
        }

        Item withWord(int value) {
            Item item = new Item();
            item.isA = false;
            item.value = new ArrayDeque<>();
            item.value.addLast(value);
            return item;
        }

        Item withA(int len) {
            Item item = new Item();
            item.isA = true;
            item.len = len;
            return item;
        }

        class MyString2 {
            int maxItem;
            int size;
            Deque<Item> items = new ArrayDeque<>();

            void increaseLastA() {
                Item last = items.peekLast();
                if (last.len == 1) {
                    items.removeLast();
                    if (items.isEmpty()) {
                        items.add(withWord(1));
                    } else {
                        items.peekLast().value.addLast(1);
                    }
                } else {
                    last.len--;
                    items.addLast(withWord(1));
                }
                maxItem = Math.max(maxItem, 1);
            }

            void increaseLastNotA() {
                Item last = items.peekLast();
                int removed = 0;
                while (!last.value.isEmpty() && last.value.peekLast() == maxItem) {
                    removed++;
                    last.value.removeLast();
                }
                if (!last.value.isEmpty()) {
                    //noinspection ConstantConditions
                    int x = last.value.pollLast();
                    last.value.addLast(x + 1);
                    if (removed > 0) {
                        items.add(withA(removed));
                    }
                    return;
                }
                items.pollLast();
                if (!items.isEmpty()) {
                    increaseLastA();
                    items.addLast(withA(removed));
                    return;
                }
                items.addLast(withWord(++maxItem));
                if (removed > 1) {
                    items.add(withA(removed - 1));
                }
            }

            void increase() {
                Item last = items.peekLast();
                if (last.isA) {
                    increaseLastA();
                } else {
                    increaseLastNotA();
                }
            }

            void resize(int n) {
                while (size > n) {
                    Item last = items.peekLast();
                    if (size - last.len() >= n) {
                        items.pollLast();
                        size -= last.len();
                    } else {
                        int otherSize = size - last.len();
                        last.resize(n - otherSize);
                        size = n;
                    }
                }
                if (size < n) {
                    if (size == 0) {
                        items.add(withA(n));
                    } else if (items.peekLast().isA) {
                        items.peekLast().len += n - size;
                    } else {
                        items.addLast(withA(n - size));
                    }
                    size = n;
                }
            }

        }

        class Item {
            boolean isA;
            int len;
            Deque<Integer> value;

            int len() {
                if (value != null) {
                    return value.size();
                }
                return len;
            }

            void resize(int n) {
                if (value != null) {
                    while (value.size() > n) {
                        value.pollLast();
                    }
                } else {
                    len = n;
                }
            }

            public String toString() {
                if (isA) {
                    return String.format("A, len=%d", len);
                } else {
                    String s = "";
                    for (int x : value) {
                        s += x;
                    }
                    return String.format("%s, len=%d", s, len());
                }
            }

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

        public void print(int i) {
            writer.print(i);
        }

    }
}

