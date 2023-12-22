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
 * @author maheshwari29
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        EKnapsack2 solver = new EKnapsack2();
        solver.solve(1, in, out);
        out.close();
    }

    static class EKnapsack2 {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int i, j;
            int n = in.ni();
            int w = in.ni();
            long a[] = new long[n];
            long b[] = new long[n];
            for (i = 0; i < n; i++) {
                a[i] = in.nl();
                b[i] = in.nl();
            }
            boolean visited[][] = new boolean[n][100001];
            long temp[][] = new long[n][100001];
            long cost[] = new long[100001];
            temp[0][(int) b[0]] = a[0];
            visited[0][(int) b[0]] = true;
            for (i = 0; i < n; i++)
                visited[i][0] = true;
            for (i = 1; i < n; i++) {
                long value = b[i];
                //out.println("i="+i);
                for (j = 1; j <= 100000; j++) {
                    if (visited[i - 1][j])
                        visited[i][j] = true;
                    temp[i][j] = temp[i - 1][j];
                    if (j - value >= 0 && visited[i - 1][j - (int) value] == true) {   //out.print(j+" ");
                        if (temp[i][j] == 0)
                            temp[i][j] = temp[i - 1][j - (int) value] + a[i];
                        else
                            temp[i][j] = Math.min(temp[i][j], temp[i - 1][j - (int) value] + a[i]);
                        visited[i][j] = true;
                    }
                }
                //for(j=1;j<=100000;j++)
                //    if(visited[i][j])
                //        out.print(j+" "+temp[i][j]+"  ");
                //out.println();
            }
            for (i = 100000; i >= 0; i--)
                if (visited[n - 1][i] && temp[n - 1][i] <= w) {
                    out.println(i);
                    return;
                }
            //out.println(0);
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

        public long nl() {
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

        public void println(int i) {
            writer.println(i);
        }

    }
}

