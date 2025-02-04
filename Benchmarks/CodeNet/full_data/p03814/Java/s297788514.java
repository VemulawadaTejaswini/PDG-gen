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
 * @author Sandeep Pandey
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            char[] input = in.readString().toCharArray();
            int bestAPos = 0;
            for (int from = 0; from < input.length; from++) {
                if (input[from] == 'A') {
                    bestAPos = from;
                    break;
                }
            }

            int bestZPos = input.length - 1;
            for (int from = input.length - 1; from >= 0; from--) {
                if (input[from] == 'Z') {
                    bestZPos = from;
                    break;
                }
            }

            out.printLine(bestZPos - bestAPos + 1);
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

            if (numChars == -1)

                throw new InputMismatchException();

            if (curChar >= numChars) {

                curChar = 0;

                try {

                    numChars = stream.read(buf);

                } catch (IOException e) {

                    throw new InputMismatchException();

                }

                if (numChars <= 0)

                    return -1;

            }

            return buf[curChar++];

        }

        public String readString() {

            int c = read();

            while (isSpaceChar(c))

                c = read();

            StringBuffer res = new StringBuffer();

            do {

                res.appendCodePoint(c);

                c = read();

            } while (!isSpaceChar(c));

            return res.toString();

        }

        public boolean isSpaceChar(int c) {

            if (filter != null)

                return filter.isSpaceChar(c);

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

        public void print(Object... objects) {

            for (int i = 0; i < objects.length; i++) {

                if (i != 0)

                    writer.print(' ');

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

