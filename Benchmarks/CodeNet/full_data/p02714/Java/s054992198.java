import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Collections;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DRGBTriplets solver = new DRGBTriplets();
        solver.solve(1, in, out);
        out.close();
    }

    static class DRGBTriplets {
        public void solve(int testNumber, FastReader s, PrintWriter out) {
            int n = s.nextInt();
            String str = s.nextString();

            ArrayList<Integer> rSet = new ArrayList<>();
            ArrayList<Integer> bSet = new ArrayList<>();
            ArrayList<Integer> gSet = new ArrayList<>();
            HashSet<Integer> rSet1 = new HashSet<>();
            HashSet<Integer> gSet1 = new HashSet<>();
            HashSet<Integer> bSet1 = new HashSet<>();

            for (int i = 0; i < n; i++) {
                if (str.charAt(i) == 'R') {
                    rSet.add(i);
                    rSet1.add(i);
                } else if (str.charAt(i) == 'G') {
                    gSet.add(i);
                    gSet1.add(i);
                } else {
                    bSet.add(i);
                    bSet1.add(i);
                }
            }

            long ans = 0l;
            ans += func(rSet, gSet, bSet, rSet1, gSet1, bSet1);
            ans += func(rSet, bSet, gSet, rSet1, bSet1, gSet1);
            ans += func(gSet, rSet, bSet, gSet1, rSet1, bSet1);
            ans += func(gSet, bSet, rSet, gSet1, bSet1, rSet1);
            ans += func(bSet, gSet, rSet, bSet1, gSet1, rSet1);
            ans += func(bSet, rSet, gSet, bSet1, rSet1, gSet1);
            out.println(ans);
        }

        private long func(ArrayList<Integer> rSet, ArrayList<Integer> gSet, ArrayList<Integer> bSet, HashSet<Integer> rSet1, HashSet<Integer> gSet1, HashSet<Integer> bSet1) {
            long ans = 0l;
            for (int i = 0; i < rSet.size(); i++) {
                for (int j = 0; j < gSet.size(); j++) {
                    if (gSet.get(j) > rSet.get(i)) {
                        long pos = Collections.binarySearch(bSet, gSet.get(j));
                        pos = (pos + 1) * -1;
                        ans += (bSet.size() - pos);
                        if (bSet1.contains((2 * gSet.get(j) - rSet.get(i)))) {
                            ans--;
                        }
                    }
                }
            }
            return ans;
        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastReader.SpaceCharFilter filter;

        public FastReader(InputStream stream) {
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

        public String nextString() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                if (Character.isValidCodePoint(c)) {
                    res.appendCodePoint(c);
                }
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
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

