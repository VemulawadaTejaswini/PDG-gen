import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class Main {

    static final long DIV = 1000000007;
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        long d = sc.nextLong();
        long a = sc.nextLong();
        long[][] x = new long[n][2];

        for (int i = 0; i < x.length; i++) {
            x[i][0] = sc.nextLong();
            x[i][1] = sc.nextLong();
        }

        Arrays.sort(x, (xa, xb)-> Long.compare(xa[0], xb[0]));

        int pos = 0;
        int mpos = 0;
        long ans = 0;

        int size = 1 << 22;
        int size2 = 1 << 20;
        long[] ha = new long[size];
        long[] hb = new long[size];



        if(n == 1){
            long mans = x[0][1] / a;
            if(x[0][1] % a != 0) mans++;
            System.out.println(mans);
            return;
        }

        for (int i = 0; i < n; i++) {
            add(ha, hb, i, i+1, x[i][1], 0, 0, size2);
        }

        out: while(pos < n){
            x[pos][1] = sum(ha, hb, pos, pos+1, 0, 0, size2);
            long num = x[pos][1] / a;
            if(x[pos][1] % a != 0) num++;

            while(x[mpos][0] <= x[pos][0] + 2 * d){
                if(mpos >= n-1) break;
                if(x[mpos+1][0] > x[pos][0] + 2 * d) break;
                mpos++;
            }
            
            // for(; x[mpos+1][0] <= x[pos][0] + 2 * d; mpos++){
            //     if(mpos >= n - 2){
            //         mpos++;
            //         break;
            //     }
            // }

            add(ha, hb, pos, mpos+1, -1*a*num, 0, 0, size2);

            // for (int i = pos; i <= mpos; i++) {
            //     x[i][1] -= a * num;
            // }

            pos++;
            ans += num;
            if(sum(ha, hb, 0, n, 0, 0, size2) == 0) break;
        }

        System.out.println(ans);
    }

    static void add(long[] ha, long[] hb, int a, int b, long x, int k, int l, int r){
        if(a <= l && r <= b){
            ha[k] += x;
        }else if (l < b && a < r){
            hb[k] += (Math.min(b, r) - Math.max(a, l)) * x;
            add(ha, hb, a, b, x, k* 2 + 1, l, (l + r) / 2);
            add(ha, hb, a, b, x, k * 2 + 2, (l + r) / 2, r);
        }
    }

    static long sum(long[] ha, long[] hb, int a, int b, int k, int l, int r){
        if(b <= l || r <= a){
            return 0;
        }else if (a <= l &&  r <= b){
            return ha[k] * (r - l) + hb[k];
        }else{
            long res = (Math.min(b, r) - Math.max(a, l)) * ha[k];
            res += sum(ha, hb, a, b, k * 2 + 1, l, (l + r) / 2);
            res += sum(ha, hb, a, b, k * 2 + 2, (l + r) / 2, r);
            return res;
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

