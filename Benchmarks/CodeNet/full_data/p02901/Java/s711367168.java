import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        FS reader = new FS();
        // write reader
        int N = reader.nextInt();
        int M = reader.nextInt();
        int[] a = new int[M];
        int[] c = new int[M];
        for (int i=0; i<M; i++) {
            a[i] = reader.nextInt();
            int b = reader.nextInt();
            int key = 0;
            for (int j=0; j<b; j++) {
                key += (int)Math.pow(2, reader.nextInt()-1);
            }
            c[i] = key;
        }


        // bitDP
        // dp[i][j] -> minimum cost when use till ith keys and open situation(j)
        long[][] dp = new long[M+1][(int)Math.pow(2, N)];
        for (int i=0; i<M+1; i++) {
            Arrays.fill(dp[i], 1000000000000L);
        }
        dp[0][0] = 0;
        for (int i=1; i<M+1; i++) {
            for (int j=0; j<(int)Math.pow(2, N); j++) {
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j]);
                dp[i][j | c[i-1]] = Math.min(dp[i-1][j]+a[i-1], dp[i][j | c[i-1]]);
            }
        }
        if (dp[M][(int)Math.pow(2, N)-1] == 1000000000000L) System.out.println(-1);
        else System.out.println(dp[M][(int)Math.pow(2, N)-1]);
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

