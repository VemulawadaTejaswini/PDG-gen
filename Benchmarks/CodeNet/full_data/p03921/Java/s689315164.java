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
import java.util.TreeSet;
import java.io.InputStream;
/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Alex
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
        void dfs(int kind, int index, int[][] personToLanguage, TreeSet<Integer>[] languageToPerson, boolean[] personVisited, boolean[] languageVisited) {
            if (kind == 0) if (personVisited[index]) return;
            if (kind == 1) if (languageVisited[index]) return;
            if (kind == 0) personVisited[index] = true;
            if (kind == 1) languageVisited[index] = true;
            if (kind == 0) for (int language : personToLanguage[index])
                dfs(1, language, personToLanguage, languageToPerson, personVisited, languageVisited);
            if (kind == 1) for (int person : languageToPerson[index])
                dfs(0, person, personToLanguage, languageToPerson, personVisited, languageVisited);
        }
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.readInt(), m = in.readInt();
            int[][] personToLanguage = new int[n][];
            TreeSet<Integer>[] languageToPerson = new TreeSet[m];
            for (int i = 0; i < languageToPerson.length; i++) languageToPerson[i] = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                int len = in.readInt();
                int[] temp = IOUtils.readIntArray(in, len);
                MiscUtils.decreaseByOne(temp);
                for (int language : temp) {
                    languageToPerson[language].add(i);
                }
                personToLanguage[i] = temp;
            }
            boolean[] personVisited = new boolean[n], languageVisited = new boolean[m];
            dfs(0, 0, personToLanguage, languageToPerson, personVisited, languageVisited);
            for (boolean b : personVisited)
                if (!b) {
                    out.printLine("NO");
                    return;
                }
            out.printLine("YES");
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
    static class MiscUtils {
        public static void decreaseByOne(int[]... arrays) {
            for (int[] array : arrays) {
                for (int i = 0; i < array.length; i++) {
                    array[i]--;
                }
            }
        }
    }
    static class IOUtils {
        public static int[] readIntArray(InputReader in, int size) {
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = in.readInt();
            }
            return array;
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

