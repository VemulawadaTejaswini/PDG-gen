import java.io.*;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        String s = fs.next();

        String first = s.substring(0,(s.length())/2);
        String last = s.substring((s.length()+1)/2 );

        for( int i = 0 ; i < first.length() ; i++ ){
            char f = first.charAt(i);
            char l = last.charAt( first.length() - i - 1 );
            if( f != l ){
                System.out.println( "No" );
                return;
            }
        }

        String ff = first.substring(0,(first.length())/2);
        String fl = first.substring((first.length()+1)/2);
        for( int i = 0 ; i < ff.length() ; i++ ){
            char f = ff.charAt(i);
            char l = fl.charAt( ff.length() - i - 1 );
            if( f != l ){
                System.out.println( "No" );
                return;
            }
        }

        String lf = last.substring(0,(last.length())/2);
        String ll = last.substring((last.length()+1)/2);
        for( int i = 0 ; i < lf.length() ; i++ ){
            char f = lf.charAt(i);
            char l = ll.charAt( lf.length() - i - 1 );
            if( f != l ){
                System.out.println( "No" );
                return;
            }
        }

        System.out.println("Yes");
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
