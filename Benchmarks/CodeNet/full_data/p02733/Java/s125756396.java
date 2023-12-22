import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.PriorityBlockingQueue;

public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();
        int[][] map = new int[h][w+1];
        for (int i = 0; i < h; i++) {
            String s = sc.next();
            for (int j = 0; j < w; j++) {
                if(s.charAt(j) == '0'){
                    map[i][j] = 0;
                }else{
                    map[i][j] = 1;
                }
            }
        }

        // int[][] sum = new int[h][w+1];
        // for (int i = 0; i < h; i++) {
        //     for (int j = 0; j < w; j++) {
        //         sum[i][j+1] = sum[i][j] + map[i][j];
        //     }
        // }

        int ans = 100000000;

        for (int i = 0; i < 1<<(h-1); i++){ 
            int mans = 0;
            String s = "0000000000" + Integer.toBinaryString(i);
            boolean[] cuth = new boolean[h];
            cuth[0] = true;
            for (int j = 1; j < cuth.length; j++) {
                if(s.charAt(s.length() - j) == '1'){
                    cuth[j] = true;
                    mans++;
                }
            }

            long[] cur = new long[h];
            long[] next = new long[h];
            
            boolean valid = true;
            for (int j = 0; j < w+1; j++) {
                boolean over = false;
                for (int j2 = 0; j2 < h; j2++) {
                    next[j2] = cur[j2] + map[j2][j];
                    if(!cuth[j2]){
                        next[j2] += next[j2-1];
                    }
                    if(next[j2] > k) over = true;
                }

                if(over){
                    mans++;
                    long[] msum = new long[h];
                    for (int l = 0; l < h; l++) {
                        cur[l] = map[l][j];
                        msum[l] = cur[l];
                        if(!cuth[l]) msum[l] += msum[l-1];
                        if(msum[l] > k) valid = false;
                    }

                }else{
                    for (int l = 0; l < h; l++) {
                        cur[l] = cur[l] + map[l][j];
                    }
                }
            }

            if(valid) ans = Math.min(ans, mans);
        }

        System.out.println(ans);

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

