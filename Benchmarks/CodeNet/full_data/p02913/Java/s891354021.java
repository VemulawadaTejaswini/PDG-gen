import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.lang.Math;

public class Main {
    // max common length with S and S[i:N]
    // N = S.length()
    public static int[] zIndex(int N, String S) {
        int[] A = new int[N];
        A[0] = N;
        int i = 1;
        int j = 0;
        while (i < N) {
            while (i+j < N && S.charAt(j) == S.charAt(i+j)) ++j;
            A[i] = j;
            if (j == 0) {
                ++i;
                continue;
            }
            int k = 1;
            while (i+k < N && k+A[k] < j) {
                A[i+k] = A[k];
                ++k;
            }
            i += k;
            j -= k;
        }
        return A;
    }

    public static void main(String[] args) {
        FS reader = new FS();
        // write reader
        int N = reader.nextInt();
        String S = reader.next();
        int ans = 0;

        for (int t=0; t<N-1; t++) {
            int n = N-t;
            String s = S.substring(t);
            int[] A = zIndex(n, s);
            for (int i=0; i<n; i++) {
                ans = Math.max(ans, Math.min(A[i],i));
            }
        }
        System.out.println(ans);
    }
    
    public static void solver() {
        // write logic
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

