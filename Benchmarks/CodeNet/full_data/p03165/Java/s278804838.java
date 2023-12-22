import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        FS reader = new FS();
        // write reader
        String s = reader.next();
        String t = reader.next();
        int[][] dp = new int[s.length()+1][t.length()+1];
        for (int i=0; i<=s.length(); i++) {
            dp[i][0] = 0;
        }
        for (int i=0; i<=t.length(); i++) {
            dp[0][i] = 0;
        }

        for (int i=1; i<=s.length(); i++) {
            for (int j=1; j<=t.length(); j++) {
                if (s.charAt(i-1) == t.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        int len = dp[s.length()][t.length()];
        char[] c = new char[len];
        int x = s.length();
        int y = t.length();
        while (true) {
            if (len == 0) break;
            if (s.charAt(x-1) == t.charAt(y-1)) {
                c[len-1] = s.charAt(x-1);
                len--;
                x--;
                y--;
                continue;
            }
            if (dp[x-1][y] < dp[x][y-1]) {
                y--;
            } else {
                x--;
            }
        }
        for (int i=0; i<c.length; i++) {
            System.out.print(c[i]);
        }
        System.out.println();
    }

    // Read Class
    static class FS {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        private boolean hasNextByte() {
            if (ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0) {
                    return false;
                }
            }
            return true;
        }
    
        private int readByte() { return hasNextByte() ? buffer[ptr++] : -1;}
        private boolean isPrintableChar(int c) {return 33 <= c && c <= 126;}
        private void skipUnprintable() {while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
    
        public boolean hasNext() { skipUnprintable(); return hasNextByte();}
        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while(isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }
        public int nextInt() {
            return (int)nextLong();
        }
        public long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || '9' < b) {
                throw new NumberFormatException();
            }
            while(true) {
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                } else if(b == -1 || !isPrintableChar(b)) {
                    return minus ? -n : n;
                } else {
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }
    }
}

