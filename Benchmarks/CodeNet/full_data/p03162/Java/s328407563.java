
import java.util.*;
import java.io.*;
/**
 *
 * @author J
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //for vacation: dp[i][0] = ai + max(dp[i-1][1], dp[i-1][2]);, and etc
        
        InputReader input = new InputReader(System.in);
        int n = input.readInt();
        int [][] dp = new int [n+1][3];
        int [][] vals = new int [n+1][3];
        for (int i = 1; i <= n; i++) {
            vals[i][0] = input.readInt();
            vals[i][1] = input.readInt();
            vals[i][2] = input.readInt();
        }
        for (int i = 1; i <= n; i++) {
            dp[i][0] = vals[i][0] + Math.max(dp[i-1][1], dp[i-1][2]);
            dp[i][1] = vals[i][1] + Math.max(dp[i-1][2], dp[i-1][0]);
            dp[i][2] = vals[i][2] + Math.max(dp[i-1][0], dp[i-1][1]);
        }
        System.out.println(Math.max(Math.max(dp[n][0], dp[n][1]), dp[n][2]));
    }
    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }
        public int read() {
            if (numChars == -1) throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } 
                catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) return -1;
            }
            return buf[curChar++];
        }
        public int readInt() {
            int c = read();
            while (isSpaceChar(c)) c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }
        public long readLong() {
            return Long.parseLong(readString());
        }
        public String readString() {
            int c = read();
            while (isSpaceChar(c)) c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }
        public String readLine() {
            int c = read();
            while (isSpaceChar(c)) c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isNewLine(c));
            return res.toString();
        }
        public boolean isSpaceChar(int c) {
            if (filter != null) return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
        public boolean isNewLine (int c) {
            if (filter!=null) return filter.isSpaceChar(c);
            return c=='\n' || c=='\r' || c==-1;
        }
        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    }
}
