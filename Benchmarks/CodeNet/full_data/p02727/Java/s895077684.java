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
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] p = new int[a];
        int[] q = new int[b];
        int[] r = new int[c];

        for (int i = 0; i < a; i++) {
            p[i] = sc.nextInt();
        }
        for (int i = 0; i < b; i++) {
            q[i] = sc.nextInt();
        }
        for (int i = 0; i < c; i++) {
            r[i] = sc.nextInt();
        }

        Arrays.sort(p);
        Arrays.sort(q);
        Arrays.sort(r);

        // int[] psum = new int[a+1];
        // int[] qsum = new int[b+1];
        long[] rsum = new long[c+1];

        // for (int i = 1; i < psum.length; i++) {
        //     psum[i] = psum[i-1] + p[a-i];
        // }
        // for (int i = 1; i < qsum.length; i++) {
        //     qsum[i] = qsum[i-1] + q[b-i];
        // }
        for (int i = 1; i < rsum.length; i++) {
            rsum[i] = rsum[i-1] + r[c-i];
        }

        long[] pqsum = new long[x+y+1];
        int pnum = 0;
        int qnum = 0;
        for (int i = 1; i < pqsum.length; i++) {
            if(pnum >= x || (qnum < y && (q[b-qnum-1] >= p[a-pnum-1]))){
                qnum++;
                pqsum[i] = pqsum[i-1] + q[b-qnum];
            }else{
                if(pnum < x){
                    pnum++;
                    pqsum[i] = pqsum[i-1] + p[a-pnum];
                }else{
                    qnum++;
                    pqsum[i] = pqsum[i-1] + q[b-qnum];
                }
            }
        }

        long ans = 0;
        for (int i = 0; i <= c; i++) {
            ans = Math.max(ans, rsum[i] + pqsum[x+y-i]);
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

