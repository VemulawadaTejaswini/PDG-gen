import java.util.*;
import java.io.*;

class Main{
    static long MOD=998244353;
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        long n=fsc.nextLong();
        long a=fsc.nextLong(), b=fsc.nextLong();
        long k=fsc.nextLong();
        fsc.close();
        if(a*n+b*n<k){
            System.out.println(0);
            return;
        }
        if(k==0){
            System.out.println(1);
            return;
        }
        long[] fact=new long[(int)n+1];
        for(int i=0;i<=n;i++){
            if(i==0){
                fact[i]=1;
            } else{
                fact[i]=mul(fact[i-1], i);
            }
        }

        long gcd=gcd(a, gcd(b, k));
        a/=gcd;
        b/=gcd;
        k/=gcd;
        if(gcd(a, b)>1){
            System.out.println(0);
            return;
        }
        L lx=new L();
        L ly=new L();
        extGCD(a, b, lx, ly);
        long x=lx.v;
        long y=ly.v;
        x*=k;
        y*=k;
        long maxpt=floorDiv(n-x, b);
        long maxqt=floorDiv(y, a);
        long minpt=ceilDiv(-x, b);
        long minqt=ceilDiv(y-n, a);
        long max=Math.min(maxpt, maxqt);
        long min=Math.max(minpt, minqt);
        // System.out.println("(x, y): ("+x+", "+y+")");
        // System.out.println("(min, max): ("+min+", "+max+")");
        // (x, y): (47293763998600, -17453955335159)
        // -521839190, -521839190
        long ans=0;
        for(long t=min;t<=max;t++){
            long p=b*t+x;
            long q=-a*t+y;
            long c=Math.min(p, q);
            long f=Math.max(0, p+q-n);
            // System.out.println("(p, q): ("+p+", "+q+")");
            // System.out.println("(f, c): ("+f+", "+c+")");
            // (p, q): (48090, 52771)
            // (f, c): (10780, 48090)
            for(long i=f;i<=c;i++){
                ans+=div(fact[(int)n], mul(fact[(int)i], fact[(int)(p-i)], fact[(int)(q-i)], fact[(int)(n-p-q+i)]));
                ans%=MOD;
            }
        }
        System.out.println(ans);
    }
    public static boolean pass(long p, long q, long n){
        return p>=0 && q>=0 && p<=n && q<=n;
    }
    public static long ceilDiv(long a, long b){
        if((a>0 && b>0) || (a<0 && b<0)){
            if(b>0){
                return (a+b-1)/b;
            } else{
                return (a+b+1)/b;
            }
        } else{
            return a/b;
        }
    }
    public static long floorDiv(long a, long b){
        if((a>0 && b>0) || (a<0 && b<0)){
            return a/b;
        } else{
            if(b>0){
                return (a-b+1)/b;
            } else{
                return (a-b-1)/b;
            }
        }
    }
    public static long gcd(long a, long b) {
        if(a==0){
            return b;
        } else if(b==0){
            return a;
        }
        if (a < b){
            return gcd(b, a);
        }
        long r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }
    public static long modinv(long a) {
        long b = MOD;
        long u = 1, v = 0;
        while (b >= 1) {
            long t = a / b;
            a -= t * b;
            long tmp1 = a;
            a = b;
            b = tmp1;
            u -= t * v;
            long tmp2 = u;
            u = v;
            v = tmp2;
        }
        u %= MOD;
        return u >= 0 ? u : u + MOD;
    }
    public static long comb(long n, long r) {
        if (n < r){
            return 0;
        }
        r = Math.min(r, n - r);
        long res = 1;
        for (long d = 1; d <= r; d++) {
            res *= n;
            res %= MOD;
            n--;
            res *= modinv(d);
            res %= MOD;
        }
        return res;
    }
    static long extGCD(long a, long b, L x, L y) {
        if (b == 0) {
            x.v = 1;
            y.v = 0;
            return a;
        }
        long d = extGCD(b, a%b, y, x);
        y.v -= a/b * x.v;
        return d;
    }
    public static long mul(long a, long... b){
        long ret=a;
        for(long c:b){
            ret*=c;
            ret%=MOD;
        }
        return ret;
    }
    public static long div(long a, long... b){
        long ret=a;
        for(long c:b){
            ret*=modinv(c);
            ret%=MOD;
        }
        return ret;
    }
    static class L{
        long v=0;
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
