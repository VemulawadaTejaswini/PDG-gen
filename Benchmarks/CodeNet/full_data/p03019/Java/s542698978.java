import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        long x = sc.nextLong();

        Long[][] t = new Long[n][4]; // b, l, u
        long aSum = 0;      // sum b * l
        for(int i=0; i<n; i++){
            t[i][0] = sc.nextLong();
            t[i][1] = sc.nextLong();
            t[i][2] = sc.nextLong();
            t[i][3] = x * t[i][2] - t[i][0] * (t[i][2] - t[i][1]);
            aSum += t[i][0] * t[i][1];
        }

        Arrays.sort(t, new Comparator<Long[]>() {
            @Override
            public int compare(Long[] a, Long b[]){
                int ret = 0;
                if(a[3] > b[3]) ret = -1;
                else if(a[3] < b[3]) ret = 1;

                return ret;
            }
            
        });

        long lans = 0;
        long rans = n * x;
        out: while(rans > lans+1){
            long mans = (lans + rans) / 2;
            long rem = mans % x;
            for(int i=0; i<n; i++){
                long masum = aSum;
                if(rem <= t[i][0]){
                    masum -= rem * t[i][1];
                }else{
                    masum -= rem * t[i][2] - t[i][0] * (t[i][2] - t[i][1]);
                }
                long count = mans / x;
                for(int j=0; j<count; j++){
                    if(i == j){
                        count++;
                    }else{
                        masum -= t[j][3];
                    }
                }
                if(masum <= 0){
                    rans = mans;
                    continue out;
                }
            }

            lans = mans;
        }

        System.out.println(rans);

    }

    private static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        private boolean hasNextByte() {
            if (ptr < buflen) {
                return true;
            }else{
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
        private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
        private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
        public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
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
            while(true){
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                }else if(b == -1 || !isPrintableChar(b)){
                    return minus ? -n : n;
                }else{
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }
        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }
        public double nextDouble() { return Double.parseDouble(next());}
    }
}
