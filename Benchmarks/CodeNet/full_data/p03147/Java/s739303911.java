import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        inclass in = new inclass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CGrandGarden solver = new CGrandGarden();
        solver.solve(1, in, out);
        out.close();
    }

    static class CGrandGarden {
        public void solve(int testNumber, inclass in, PrintWriter out) {
            int n = in.nextInt();
            int arr[] = new int[n + 2];
            for (int i = 1; i < n + 1; i++) {
                arr[i] = in.nextInt();
            }
            int ans = 0;
            while (true) {
                int flag = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] != 0) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) break;
                int f1 = 0, s = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == 0 && f1 == 1) {
                        int min = find_min(s, i, arr);
                        if (min != 0) ans += min;
                        for (int j = s + 1; j < i; j++) {
                            arr[j] = arr[j] - min;
                        }
                        f1 = 1;
                        s = i;
                    } else if (arr[i] == 0 && f1 == 0) {
                        f1 = 1;
                        s = i;
                    }
                }
            }
            out.println(ans);
        }

        private int find_min(int s, int i, int arr[]) {
            int min = arr[s + 1];
            for (int j = s + 2; j < i; j++) {
                min = Math.min(min, arr[j]);
            }
            return min;
        }

    }

    static class inclass {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private inclass.SpaceCharFilter filter;

        public inclass(InputStream stream) {
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

