import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] a = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int tmp = sc.nextInt();
                a[i][j] = Math.abs(a[i][j] - tmp);
            }
        }

        int msize = 81*81;
        boolean[][][] dp = new boolean[h+1][w+1][msize];
        dp[0][1][0] = true;
        dp[1][0][0] = true;
        for (int i = 1; i < h+1; i++) {
            for (int j = 1; j < w+1; j++) {
                int mm = a[i-1][j-1];
                for (int k = 0; k < msize - 100; k++) {
                    dp[i][j][k] = dp[i-1][j][k + mm]
                                    || dp[i-1][j][Math.abs(k-mm)]
                                    || dp[i][j-1][k+mm]
                                    || dp[i][j-1][Math.abs(k-mm)];
                }
            }
        }

        for (int i = 0; i < msize; i++) {
            if(dp[h][w][i]){
                System.out.println(i);
                return;   
            }
            
        }
    }



    private static class FastScanner {
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

        private int readByte() {
            if (hasNextByte())
                return buffer[ptr++];
            else
                return -1;
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr]))
                ptr++;
            return hasNextByte();
        }

        public String next() {
            if (!hasNext())
                throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        public long nextLong() {
            if (!hasNext())
                throw new NoSuchElementException();
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
            while (true) {
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                } else if (b == -1 || !isPrintableChar(b)) {
                    return minus ? -n : n;
                } else {
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }

        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
                throw new NumberFormatException();
            return (int) nl;
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }

}

