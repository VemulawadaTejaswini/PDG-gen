import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Spandan Mishra
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ERedAndGreenApples solver = new ERedAndGreenApples();
        solver.solve(1, in, out);
        out.close();
    }

    static class ERedAndGreenApples {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int x = in.readInt();
            int y = in.readInt();
            int r = in.readInt();
            int g = in.readInt();
            int c = in.readInt();

            long sum = 0;
            Integer[] red = new Integer[r];
            Integer[] green = new Integer[g];
            Integer[] uncolored = new Integer[c];

            for (int i = 0; i < r; i++)
                red[i] = in.readInt();

            for (int i = 0; i < g; i++)
                green[i] = in.readInt();

            for (int i = 0; i < c; i++)
                uncolored[i] = in.readInt();


            Arrays.sort(red, Collections.reverseOrder());
            Arrays.sort(green, Collections.reverseOrder());
            Integer[] apples = new Integer[x + y + c];

            for (int i = 0; i < x; i++)
                apples[i] = red[i];

            for (int i = 0; i < y; i++)
                apples[x + i] = green[i];

            for (int i = 0; i < c; i++)
                apples[x + y + i] = uncolored[i];

//        for (int xx : apples)
//            System.out.print(xx + " ");
            Arrays.sort(apples, Collections.reverseOrder());

            for (int i = 0; i < x + y; i++)
                sum += apples[i];

            System.out.println(sum);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1)
                throw new RuntimeException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new RuntimeException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int readInt() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}

