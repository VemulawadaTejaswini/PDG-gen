import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Aman Kumar Singh
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DFaceProducesUnhappiness solver = new DFaceProducesUnhappiness();
        solver.solve(1, in, out);
        out.close();
    }

    static class DFaceProducesUnhappiness {
        PrintWriter out;
        InputReader in;

        int fun(char[] ar1, int n, int k) {
            ArrayList<Integer> ar = new ArrayList<>();
            char last = ar1[0];
            int cnt = 1;
            int i = 0;
            for (i = 1; i < n; i++) {
                if (ar1[i] != last) {
                    ar.add(cnt);
                    last = ar1[i];
                    cnt = 1;
                } else {
                    cnt++;
                }
            }
            ar.add(cnt);
            int[] freq = new int[ar.size()];
            int[] lol = new int[ar.size()];
            int sum = 0;
            int sum1 = 0;
            for (i = 0; i < ar.size(); i++) {
                sum += ar.get(i);
                sum1 += ar.get(i) - 1;
                lol[i] = sum1;
                freq[i] = sum;
            }
            int max = 0;
            for (i = 0; i < ar.size(); i++) {
                int next = Math.min(ar.size() - 1, i + 2 * k);
                int curr = freq[next];
                if (i > 0)
                    curr -= freq[i - 1];
                curr--;
                if (next != ar.size() - 1)
                    curr += lol[ar.size() - 1] - lol[next];
                if (i > 0)
                    curr += lol[i - 1];
                max = Math.max(max, curr);
            }
            return max;
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            this.out = out;
            this.in = in;
            int n = ni();
            int k = ni();
            String st = n();
            char[] ar1 = st.toCharArray();
            char[] ar2 = st.toCharArray();
            int i = 0;
            for (i = 0; i < n; i++)
                ar2[i] = ar1[n - 1 - i];
            pn(Math.max(fun(ar1, n, k), fun(ar2, n, k)));
        }

        String n() {
            return in.next();
        }

        int ni() {
            return in.nextInt();
        }

        void pn(long zx) {
            out.println(zx);
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
            if (numChars == -1) {
                throw new UnknownError();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new UnknownError();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String next() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuffer res = new StringBuffer();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));

            return res.toString();
        }

        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}

