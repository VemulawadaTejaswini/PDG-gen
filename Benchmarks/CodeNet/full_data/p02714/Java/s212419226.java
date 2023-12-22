import java.io.*;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {

        FastScanner fs = new FastScanner();

        int n = fs.nextInt();
        String[] ss = fs.next().split("");

        int rCount = 0;
        int gCount = 0;
        int bCount = 0;
        for( int i = 0 ; i < n ; i++ ){
            if( "R".equals( ss[i] ) ){
                rCount++;
                continue;
            }
            if( "G".equals( ss[i] ) ){
                gCount++;
                continue;
            }
            if( "B".equals( ss[i] ) ){
                bCount++;
            }
        }
        String minColor;
        int calc = Math.min( rCount , Math.min( gCount , bCount ) );
        if( rCount == calc ){
            minColor = "R";
        }
        else if( gCount == calc ){
            minColor = "G";
        }
        else {
            minColor = "B";
        }

        String middleColor;
        if( "R".equals( minColor ) ){
            middleColor = Math.min( gCount , bCount )== gCount ? "G" : "B";
        }
        else if( "G".equals( minColor ) ){
            middleColor = Math.min( rCount , bCount )== rCount ? "R" : "B";
        }
        else {
            middleColor = Math.min( gCount , rCount )== gCount ? "G" : "R";
        }

        String maxColor;
        int maxCount;
        if( !"R".equals( minColor ) && !"R".equals(middleColor) ){
            maxColor = "R";
            maxCount = rCount;
        }
        else if( !"G".equals( minColor ) && !"G".equals(middleColor) ){
            maxColor = "G";
            maxCount = gCount;
        }
        else{
            maxColor = "B";
            maxCount = bCount;
        }

        long ans = 0;
        for( int i = 0 ; i < ss.length ; i++ ){
            if( !ss[i].equals( minColor ) ){
                continue;
            }
            for( int j = 0 ; j < ss.length ; j++ ){
                if( !ss[j].equals( middleColor ) ){
                    continue;
                }
                ans += maxCount;
                int abs = Math.abs( i - j );
                if( j < i ) {
                    if (i + abs < ss.length && maxColor.equals(ss[i + abs])) {
                        ans--;
                    }
                    if( 0 <= j - abs && maxColor.equals( ss[ j - abs ] ) ){
                        ans--;
                    }
                }
                else {
                    if( 0 <= i - abs && maxColor.equals(ss[i - abs ]) ){
                        ans--;
                    }
                    if( j + abs < ss.length && maxColor.equals(ss[ j + abs ] ) ){
                        ans--;
                    }
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

}
