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
        FLCS solver = new FLCS();
        solver.solve(1, in, out);
        out.close();
    }

    static class FLCS {
        public void solve(int testNumber, inclass in, PrintWriter out) {
            String s1 = in.readLine();
            String s2 = in.readLine();
            int n = s1.length(), m = s2.length();
            int[][] dp = new int[n + 1][m + 1];
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 0;
                    } else {
                        if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                            dp[i][j] = 1 + dp[i - 1][j - 1];
                        } else {
                            dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                        }
                    }
                }
            }
            int i = n, j = m;
            StringBuilder sb = new StringBuilder();
            while (true) {
                if (i == 0 || j == 0) {
                    break;
                }
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    sb.append(s1.charAt(i - 1));
                    i--;
                    j--;
                } else {
                    if (dp[i][j - 1] > dp[i - 1][j]) {
                        j--;
                    } else {
                        i--;
                    }
                }
            }
            out.println(sb.reverse());
        }

    }

    static class inclass {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

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

        private String readLine0() {
            StringBuilder buf = new StringBuilder();
            int c = read();
            while (c != '\n' && c != -1) {
                if (c != '\r') {
                    buf.appendCodePoint(c);
                }
                c = read();
            }
            return buf.toString();
        }

        public String readLine() {
            String s = readLine0();
            while (s.trim().length() == 0) {
                s = readLine0();
            }
            return s;
        }

    }
}

