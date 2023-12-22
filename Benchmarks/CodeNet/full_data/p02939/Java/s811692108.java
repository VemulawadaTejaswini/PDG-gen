import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        char[] s=fsc.next().toCharArray();
        fsc.close();
        int n=s.length;
        //RollingHash rh=new RollingHash(s);
        int max1=0;
        char now=' ';
        for(int i=0;i<n;i++){
            if(i==0){
                now=s[i];
            } else{
                if(s[i]==now){
                    i++;
                    now=' ';
                } else{
                    now=s[i];
                }
            }
            max1++;
            if(i==n){
                max1--;
            }
        }
        int max2=0;
        for(int i=0;i<n;i++){
            if(i==0){
                now=' ';
                i++;
            } else{
                if(s[i]==now){
                    i++;
                    now=' ';
                } else{
                    now=s[i];
                }
            }
            max2++;
            if(i==n){
                max2--;
            }
        }
        System.out.println(Math.max(max1, max2));
    }

    static class RollingHash {
        static private final long mod = (1l << 61) - 1;
        static private final long mask31 = (1l << 31) - 1;
        static private final long mask30 = (1l << 30) - 1;
    
        private long base;
        private long[] pow;
        private int length;
    
        // hash[i] is the hash of substring[0, i). (i = 0, 1, ..., length)
        private long[] hash;
    
        RollingHash(char[] ch) {
            Random r = new Random(System.currentTimeMillis());
            do {
                base = r.nextLong();
            } while (base >= mod - 1 || base <= 6000);
            length = ch.length;
            pow = new long[length + 1];
            hash = new long[length + 1];
            for (int i = 0; i < length; i++) {
                hash[i + 1] = calMod(mult(hash[i], base) + ch[i] + 1);
            }
        }
    
        long hash(int begin, int end) {
            long ret = hash[end] - calMod(mult(hash[begin], pow(end - begin)));
            if(ret < 0) ret += mod;
            return ret;
        }
    
        // calc a*b mod 2^61-1 without overflow.
        // use the fact that 2^61 = 1 mod 2^61-1.
        private long mult(long a, long b) {
            // au is upper 30(=61-31) bits of a.
            // ad is lower 31 bits of a.
            // bu is upper 30(=61-31) bits of b.
            // bd is lower 31 bits of b.
            long au = a >> 31;
            long ad = a & mask31;
            long bu = b >> 31;
            long bd = b & mask31;
            // a*b = (au*2^31 + ad) * (bu*2^31 + bd)
            // a*b = au*bu*2^62 + (au*bd + ad*bu)*2^31 + ad*bd.
    
            // au*bu*2^62 = au*bu*2 (mod 2^61-1) because of 2^61 = 1 (mod 2^61-1)
            // au*bu*2 <= 2 * (2^30 - 1) * (2^30 - 1) = 2^61 - 2^32 + 2
            // mid := au*bd + ad*bu <= 2 * (2^30-1) * (2^31-1) = 2^62 - 3*2^31 + 2 <= 61bits
            // mid = midu*2^30 + midd.
            // midu is upper 31(=61-30) bits of b.
            // midd is lower 30 bits of b.
            // mid * 2^31 = midu*2^61 + midd*2^31 = midu + midd*2^31 <= 2^61 + 2^31
            // ad*bd <= (2^31 -1) * (2^31 - 1) = 2^62 - 2^32 + 1
    
            // (au*bu*2) + (midu+midd*2^31) + (ad*bd) <= 2^63 - 3*2^31 + 3 <= Long.MAX_VALUE
            long mid = au * bd + ad * bu;
            long midu = mid >> 30;
            long midd = mid & mask30;
            
            return (au * bu * 2) + (midu + (midd << 31)) + (ad * bd);
        }
    
        private long pow(int k) {
            if (pow[k] > 0) {
                return pow[k];
            } else if (k == 0) {
                return pow[k] = 1;
            } else if (k == 1) {
                return pow[k] = base;
            } else {
                return pow[k] = calMod(mult(pow(k / 2), pow(k - k / 2)));
            }
        }
    
        private long calMod(long l) {
            l = (l & mod) + (l >> 61);
            while (l > mod) {
                l -= mod;
            }
            return l;
        }
    }    

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        private boolean hasNextByte(){
            if(ptr<buflen) return true;
            else{
                ptr = 0;
                try{
                    buflen = in.read(buffer);
                }
                catch(IOException e){
                    e.printStackTrace();
                }
                if(buflen<=0) return false;
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
            if (b < '0' || '9' < b) throw new NumberFormatException();
            while(true){
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                }
                else if(b == -1 || !isPrintableChar(b)) return minus ? -n : n;
                else throw new NumberFormatException();
                b = readByte();
            }
        }
        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }
        public double nextDouble() { return Double.parseDouble(next());}
        public void close(){
            try{in.close();}
            catch(IOException e){e.printStackTrace();}
        }
    }
}
