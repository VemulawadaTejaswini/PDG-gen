import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author ankur
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        atcoderdec solver = new atcoderdec();
        solver.solve(1, in, out);
        out.close();
    }

    static class atcoderdec {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
//        System.out.println(1);
            int n = in.nextInt();
            int ar[] = in.nextIntArray(n);
            int ct = 0;
            int min = in.min(ar);
            int max = in.max(ar);
            int xi = -1;
            int ni = -1;
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < ar.length; i++) {
                if (ar[i] == min) {
                    ni = i;
                    //   break;
                }
                if (ar[i] == max)
                    xi = i;
            }
            if (Math.abs(max) > Math.abs(min)) {
                for (int i = 0; i < n; i++) {
                    if (ar[i] != max) {
                        ar[i] += max;
                        list.add(xi);
                        list.add(i);
                    }

                }


            } else {
                for (int i = 0; i < n; i++) {
                    if (ar[i] != min) {
                        ar[i] += min;
                        list.add(ni);
                        list.add(i);
                    }

                }
            }

            for (int i = 1; i < n; i++) {
                if (ar[i] < ar[i - 1]) {
                    ar[i] += ar[i - 1];
                    ct++;
                    list.add(i - 1);
                    list.add(i);
                }

            }
            out.println(list.size() / 2);
            for (int i = 0; i < list.size(); i += 2) {
                out.println(list.get(i) + " " + list.get(i + 1));
            }
            //System.out.println(Math.max(ctr-k,0));
        }

    }

    static class InputReader {
        private final InputStream stream;
        private final byte[] buf = new byte[8192];
        private int curChar;
        private int snumChars;

        public InputReader(InputStream st) {
            this.stream = st;
        }

        public int read() {
            if (snumChars == -1)
                throw new InputMismatchException();
            if (curChar >= snumChars) {
                curChar = 0;
                try {
                    snumChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (snumChars <= 0)
                    return -1;
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
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public int[] nextIntArray(int n) {
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }

        public int max(int ar[]) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < ar.length; i++) {
                max = Math.max(max, ar[i]);
            }
            return max;
        }

        public int min(int ar[]) {
            int min = Integer.MAX_VALUE;
            for (int x : ar)
                min = Math.min(min, x);
            return min;
        }

        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}

