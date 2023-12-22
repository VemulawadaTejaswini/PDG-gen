import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author cplayer
 */
public class Main {
    public static void main (String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        BYYMMOrMMYY solver = new BYYMMOrMMYY();
        solver.solve(1, in, out);
        out.close();
    }

    static class BYYMMOrMMYY {
        private boolean isMonth (int number) {
            return number >= 1 && number <= 12;
        }

        public void solve (int testNumber, InputReader in, OutputWriter out) {
            int[] digits = ArrayUtils.convertCharArrayToIntArray(in.readCharArray(4));
            int first = digits[0] * 10 + digits[1];
            int second = digits[2] * 10 + digits[3];
            if (isMonth(first) && isMonth(second)) {
                out.println("AMBIGUOUS");
            } else if (isMonth(first) && !isMonth(second)) {
                out.println("MMYY");
            } else if (!isMonth(first) && isMonth(second)) {
                out.println("YYMM");
            } else {
                out.println("NA");
            }
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader (InputStream stream) {
            this.stream = stream;
        }

        public char[] readCharArray (int size) {
            char[] array = new char[size];
            for (int i = 0; i < size; i++) {
                array[i] = readCharacter();
            }
            return array;
        }

        public int read () {
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

        public boolean isSpaceChar (int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace (int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public char readCharacter () {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            return (char) c;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar (int ch);

        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter (OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter (Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void print (Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
        }

        public void println (Object... objects) {
            print(objects);
            writer.println();
        }

        public void close () {
            writer.close();
        }

    }

    static class ArrayUtils {
        public static int[] convertCharArrayToIntArray (char[] arr) {
            int[] res = new int[arr.length];
            for (int i = 0; i < arr.length; ++i) {
                if (arr[i] <= '9' && arr[i] >= '0') {
                    res[i] = arr[i] - '0';
                } else {
                    return null;
                }
            }
            return res;
        }

    }
}

