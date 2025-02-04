import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        long[] in = new long[n];
        ArrayDeque<Long> ap = new ArrayDeque<Long>();
        ArrayDeque<Long> an = new ArrayDeque<Long>();
        long[][] ans = new long[n-1][2];

        for(int i=0; i<n; i++){
            in[i] = sc.nextLong();
        }

        Arrays.sort(in);

        for(int i=0; i<n; i++){
            long tmp = in[i];
            if(tmp>=0) ap.add(tmp);
            else an.add(tmp);
        }

        int count = 0;
        if(ap.size() == 0){
            long t1 = an.pollLast();
            long t2 = an.poll();
            long t3 = t1 - t2;
            ans[count][0] = t1;
            ans[count][1] = t2;
            ap.add(t3);
            count++;
        }
        if(an.size() == 0){
            long t2 = ap.poll();
            long t1 = ap.poll();
            long t3 = t1 - t2;
            ans[count][0] = t1;
            ans[count][1] = t2;
            an.add(t3);
            count++;
        }

        for(; count<n-1; count++){
            if(ap.size() > an.size()){
                long t1 = an.poll();
                long t2 = ap.poll();
                long t3 = t1 - t2;
                ans[count][0] = t1;
                ans[count][1] = t2;
                an.add(t3);
            }else{
                long t1 = ap.poll();
                long t2 = an.poll();
                long t3 = t1 - t2;
                ans[count][0] = t1;
                ans[count][1] = t2;
                ap.add(t3);
            }
        }

        if(ap.size() == 0) ap.add(an.poll());

        System.out.println(ap.poll());

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n-1; i++){
            sb.append(ans[i][0] + " " + ans[i][1] + "\n");
        }
        System.out.print(sb.toString());

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
