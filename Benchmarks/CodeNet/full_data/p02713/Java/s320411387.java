import java.io.*;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {

    private static int gcd( int a , int b ){
        int x;
        int y;
        if (a > b) {
            x = a;
            y = b;
        } else {
            x = b;
            y = a;
        }
        int tmp;
        while ((tmp = x % y) != 0) {
            x = y;
            y = tmp;
        }
        return y;
    }

    public static void main(String[] args) {

        FastScanner fs = new FastScanner();

        int k = fs.nextInt();
        int[][] mDp = new int[k+1][k+1];
        int[][][] dp = new int[k+1][k+1][k+1];
        long ans = 0;

        for( int i1 = 1 ; i1 <= k ; i1++ ){
            for( int i2 = 1 ; i2 <= k ; i2++ ){
                for( int i3 = 1 ; i3 <= k ; i3++ ){

                    // 既に作ったことがある値ならDPより取得
                    int[] abc = new int[]{ i1 , i2 , i3 };
                    Arrays.sort( abc );
                    if( dp[abc[0]][abc[1]][abc[2]] != 0 ){
                        ans += dp[abc[0]][abc[1]][abc[2]];
                        continue;
                    }

                    // aとbについて
                    // 既に作ったことがある値ならmDPより取得
                    // 作ってなければ最大公約数を算出
                    if( mDp[abc[0]][abc[1]] == 0 ){
                        mDp[abc[0]][abc[1]] = gcd(abc[0],abc[1]);
                    }

                    // ab とcについて
                    // 既に作ったことがある値ならmDPより取得
                    // 作ってなければ最大公約数を算出
                    if( mDp[mDp[abc[0]][abc[1]]][abc[2]] == 0 ){
                        mDp[mDp[abc[0]][abc[1]]][abc[2]] = gcd(mDp[abc[0]][abc[1]],abc[2]);
                    }

                    ans += mDp[mDp[abc[0]][abc[1]]][abc[2]];
                }
            }
        }

        System.out.println(ans);
    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int bufferLength = 0;

        private boolean hasNextByte() {
            if (ptr < bufferLength) {
                return true;
            } else {
                ptr = 0;
                try {
                    bufferLength = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return bufferLength > 0;
            }
        }

        private int readByte() {
            if (hasNextByte()) {
                return buffer[ptr++];
            } else {
                return -1;
            }
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
                ptr++;
            }
            return hasNextByte();
        }

        String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        long nextLong() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
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
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
                throw new NumberFormatException();
            }
            return (int) nl;
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}
