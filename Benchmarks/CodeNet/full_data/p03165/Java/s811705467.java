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
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskF solver = new TaskF();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskF {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            String s = in.next();
            String t = in.next();

            LongestCommonSubsequence lcs = new LongestCommonSubsequence(s, t);
            out.println(lcs.read());
        }

    }

    static class FastScanner {
        private InputStream in;
        private byte[] buffer = new byte[1024];
        private int bufPointer;
        private int bufLength;

        public FastScanner(InputStream in) {
            this.in = in;
        }

        private int readByte() {
            if (bufPointer >= bufLength) {
                if (bufLength == -1)
                    throw new InputMismatchException();

                bufPointer = 0;
                try {
                    bufLength = in.read(buffer);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (bufLength <= 0)
                    return -1;
            }
            return buffer[bufPointer++];
        }

        private static boolean isPrintableChar(int c) {
            return c >= 33 && c <= 126;
        }

        public String next() {
            StringBuilder sb = new StringBuilder();

            int b = readByte();
            while (!isPrintableChar(b))
                b = readByte();

            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }

            return sb.toString();
        }

    }

    static class LongestCommonSubsequence {
        private char[] s;
        private char[] t;
        private int[][] lenDP;

        public LongestCommonSubsequence(String s, String t) {
            this.s = s.toCharArray();
            this.t = t.toCharArray();
            setLenDP();
        }

        public LongestCommonSubsequence(char[] s, char[] t) {
            this.s = s;
            this.t = t;
            setLenDP();
        }

        private void setLenDP() {
            lenDP = new int[this.s.length + 1][this.t.length + 1];
            for (int i = 1; i <= s.length; i++)
                for (int j = 1; j <= t.length; j++)
                    lenDP[i][j] = (s[i - 1] == t[j - 1]) ? (lenDP[i - 1][j - 1] + 1) : Math.max(lenDP[i - 1][j], lenDP[i][j - 1]);
        }

        public String read() {
            int cs = s.length;
            int ct = t.length;
            char[] lcs = new char[lenDP[cs][ct]];
            while (lenDP[cs][ct] > 0) {
                if (lenDP[cs - 1][ct] == lenDP[cs][ct])
                    cs--;
                else if (lenDP[cs][ct - 1] == lenDP[cs][ct])
                    ct--;
                else
                    lcs[lenDP[--cs][--ct]] = s[cs];
            }
            return new String(lcs);
        }

    }
}

