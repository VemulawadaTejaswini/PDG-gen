import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author L_aka_ryuga
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        CPrison solver = new CPrison();
        solver.solve(1, in, out);
        out.close();
    }

    static class CPrison {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.ni(), m = in.ni();
            gate[] object = new gate[m];

            for (int i = 0; i < m; ++i) {
                int l = in.ni(), r = in.ni();
                object[i] = new gate(l, r);
            }
            checker check = new checker();
            Arrays.sort(object, check);

       /* for(int i = 0;i < m;++i){
            out.println(object[i].val1+"  "+object[i].val2);
        }
*/

        /*
        int[] arr = new int[100003];

        for(int i = 0;i < m;++i){

            arr[l] = r;

        }
        */
            int[][] gates = new int[m][2];
            int k = 0;
            for (int i = 0; i < m; ++i) {
                gates[k][0] = object[i].val1;
                gates[k++][1] = object[i].val2;
            }

            int a = gates[0][0], b = gates[0][1];
//        out.println(a+" "+b);
            int val = b - a + 1, ans = val;
            for (int i = 1; i < m; ++i) {
                int c = gates[i][0], d = gates[i][1];
//            out.println(c+"  "+d);
                if (c > b) ans = 0;
                else {
                    if (d >= b) ans = (b - c + 1);
                    else ans = (d - c + 1);
                }
                val = Math.min(val, ans);
            }

            out.println(val);

        }

    }

    static class checker implements Comparator {
        public int compare(Object o, Object t1) {
            gate ob = (gate) o;
            gate ob2 = (gate) t1;
            int v = (int) ob.val1, t = (int) ob2.val1;
            if (v <= t)
                return -1;
            else return 1;
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

        public void println(int i) {
            writer.println(i);
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

        public int ni() {
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

    static class gate {
        int val1;
        int val2 = 0;

        gate(int val1, int val2) {
            this.val1 = val1;
            this.val2 = val2;
        }

    }
}

