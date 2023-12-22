import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jay Leeds
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
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();
            ArrayList<Pair<Integer, Integer>> red = new ArrayList<>();
            ArrayList<Pair<Integer, Integer>> blue = new ArrayList<>();
            for (int i = 0; i < n; i++) red.add(new Pair<>(in.nextInt(), in.nextInt()));
            for (int i = 0; i < n; i++) blue.add(new Pair<>(in.nextInt(), in.nextInt()));
            Collections.sort(blue);
            int count = 0;
            for (int i = 0; i < n; i++) {
                int remIndex = -1;
                int yMax = -1;
                for (int j = 0; j < red.size(); j++) {
                    if (red.get(j).first < blue.get(i).first && red.get(j).second < blue.get(i).second && red.get(j).second > yMax) {
                        remIndex = j;
                        yMax = red.get(j).second;
                    }
                }
                if (remIndex != -1) {
                    count++;
                    red.remove(remIndex);
                }
            }
            out.printLine(count);
        }

    }

    static class Pair<A, B> implements Comparable<Pair<A, B>> {
        public A first;
        public B second;

        public Pair(A firstVal, B secondVal) { //Inspired by Egor Kulikov's GitHub contributions
            this.first = firstVal; //Rewritten and modified by me (Jay Leeds)
            this.second = secondVal;
        }


        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Pair p = (Pair) o;
            return this.compareTo(p) == 0;
        }

        public int compareTo(Pair<A, B> p) {
            if (p.first instanceof Comparable) {
                int firstCompare = ((Comparable<A>) first).compareTo(p.first);
                if (firstCompare != 0) return firstCompare;
            }
            if (p.second instanceof Comparable) {
                return ((Comparable<B>) second).compareTo(p.second);
            }
            return 0;
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

        public void printLine(int i) {
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
            this.stream = stream; //Fast IO by Egor Kulikov, modified by myself
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
            public boolean isSpaceChar(int ch);

        }

    }
}

