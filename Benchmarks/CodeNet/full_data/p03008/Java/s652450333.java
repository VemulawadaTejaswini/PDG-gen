import java.util.*;
import java.io.*;

public class Main {
    static long n, ga, gb, sa, sb, ba, bb, ng, ns, nb;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        n = sc.nextLong();
        ga = sc.nextLong();
        sa = sc.nextLong();
        ba = sc.nextLong();
        gb = sc.nextLong();
        sb = sc.nextLong();
        bb = sc.nextLong();
        ng = 0;
        ns = 0;
        nb = 0;


        long[] dp = new long[(int)n+1];
        dp[0] = 0;
        for(int i=1; i<dp.length; i++){
            dp[i] = dp[i-1] + 1;
            if(i >= ga) dp[i] = Math.max(dp[i], dp[i-(int)ga] + gb);
            if(i >= sa) dp[i] = Math.max(dp[i], dp[i-(int)sa] + sb);
            if(i >= ba) dp[i] = Math.max(dp[i], dp[i-(int)ba] + bb);
        }

        n = dp[dp.length-1];

        dp = new long[(int)n+1];
        dp[0] = 0;
        for(int i=1; i<dp.length; i++){
            dp[i] = dp[i-1] + 1;
            if(i >= gb) dp[i] = Math.max(dp[i], dp[i-(int)gb] + ga);
            if(i >= sb) dp[i] = Math.max(dp[i], dp[i-(int)sb] + sa);
            if(i >= bb) dp[i] = Math.max(dp[i], dp[i-(int)bb] + ba);
        }

        n = dp[dp.length-1];

        System.out.println(n);

        // double g1 = (double)gb / (double)ga;
        // double s1 = (double)sb / (double)sa;
        // double b1 = (double)bb / (double)ba;

        // if(g1 > s1){
        //     if(s1 > b1){
        //         buya(1);
        //         buya(2);
        //         buya(3);
        //     }else{
        //         if(g1 > b1){
        //             buya(1);
        //             buya(3);
        //             buya(2);
        //         }else{
        //             buya(2);
        //             buya(3);
        //             buya(1);
        //         }
        //     }
        // }else{
        //     if(g1 > b1){
        //         if(s1 > b1){
        //             buya(2);
        //             buya(1);
        //             buya(3);
        //         }else{
        //             buya(3);
        //             buya(2);
        //             buya(1);
        //         }
        //     }else{
        //         buya(3);
        //         buya(1);
        //         buya(2);
        //     }
        // }

        // n += ng * gb + ns * sb + nb * bb;

        // g1 = (double)ga / (double)gb;
        // s1 = (double)sa / (double)sb;
        // b1 = (double)ba / (double)bb;

        // if(g1 > s1){
        //     if(s1 > b1){
        //         buyb(1);
        //         buyb(2);
        //         buyb(3);
        //     }else{
        //         if(g1 > b1){
        //             buyb(1);
        //             buyb(3);
        //             buyb(2);
        //         }else{
        //             buyb(2);
        //             buyb(3);
        //             buyb(1);
        //         }
        //     }
        // }else{
        //     if(g1 > b1){
        //         if(s1 > b1){
        //             buyb(2);
        //             buyb(1);
        //             buyb(3);
        //         }else{
        //             buyb(3);
        //             buyb(2);
        //             buyb(1);
        //         }
        //     }else{
        //         buyb(3);
        //         buyb(1);
        //         buyb(2);
        //     }
        // }

        // n += ng * ga + ns * sa + nb * ba;

        // System.out.println(n);

    }

    static void buya(int in){
        if(in == 1){
            if(gb / ga >= 1){
                ng = n / ga;
                n = n % ga;
            }
        }else if(in == 2){
            if(sb / sa >= 1){
                ns = n / sa;
                n = n % sa;
            }
        }else{
            if(bb / ba >= 1){
                nb = n / ba;
                n = n % ba;
            }
        }
    }

    static void buyb(int in){
        if(in == 1){
            if(ga / gb >= 1){
                ng = n / gb;
                n = n % gb;
            }
        }else if(in == 2){
            if(sa / sb >= 1){
                ns = n / sb;
                n = n % sb;
            }
        }else{
            if(ba / bb >= 1){
                nb = n / bb;
                n = n % bb;
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
