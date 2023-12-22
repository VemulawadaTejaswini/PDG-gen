
import java.util.*;
import java.io.*;
/**
 *
 * @author J
 */
public class Main {
    static int n;
    static long w;
    static long [][] dp;
    static int [] weights;
    static int [] vals;
    public static void main(String[] args) {
        // TODO code application logic here
        //total weight too large to model by dp
        //but max value = 10^5
        //so let the state be dp[i][k] = min capacity for first i items to make value k, where i = 0-1 item i and k = to get value k
        //dp[i][k] = min(dp[i-1][k], dp[i-1][k-vi]+wi);
        
        //similar to Power Eggs on dmoj
        
        //PRobably correct, submit when have account
        //https://atcoder.jp/contests/dp/tasks/dp_e
        InputReader input = new InputReader(System.in);
        n = input.readInt();
        w = input.readLong();
        dp = new long [n+1][10001];
        weights = new int [n+1];
        vals = new int [n+1];
        for (int i = 1; i <= n; i++) {
            weights[i] = input.readInt();
            vals[i] = input.readInt();
        }
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], (int)1E9+1);
        }
        dp[0][0] = 0;
        int max = -1;
        for (int i = 1; i <= n; i++) {
            dp[i][0] = 0;
            for (int k = 1; k <= 10000; k++) {
                if (k-vals[i]<=10000 && k-vals[i]>=0) { 
                    dp[i][k] = Math.min(dp[i-1][k], dp[i-1][k-vals[i]] + weights[i]);
                    if (dp[i][k]<=w) {
                        //System.out.println(Arrays.toString(dp[i]));
                        max = Math.max(max, k);
                    }
                }
                else {
                    dp[i][k] = dp[i-1][k];
                }
            }
        }
        System.out.println(max);
    }
//        int max = -1;
//        for (int k = 10000; k >= 0; k--) {
//            fun(1, k);
//            if (dp[n][k]!=(int)1E9) max = Math.max(max, k);
//        }
//        System.out.println(max);
//    }
//    public static long fun (int i, int k) {
//        if (k<=10000 && k>=0) {
//            if (dp[i][k]!=1E9) return dp[i][k];
//            return Math.min(fun(i-1, k), fun(i-1, k-vals[i])+weights[i]);
//        }
//        else return (int)1E9;
//    }
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
