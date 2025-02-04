import java.util.*;
import java.io.*;

public class Main{
    public static long MOD=1000000007;
    static long h[];
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        long m=fsc.nextLong();
        fsc.close();
        h=new long[30];
        HashMap<Long, Integer> primes=new HashMap<Long, Integer>();
        for(long p=2;p<=Math.ceil(Math.sqrt(m));p++){
            int q=0;
            while(m%p==0){
                m/=p;
                q++;
            }
            if(q>0) primes.put(p, q);
        }
        if(m>1) primes.put(m,1);
        long ans=1;
        for(long key:primes.keySet()){
            ans*=h(primes.get(key),n);
            ans%=MOD;
        }
        System.out.println(ans);
    }
    public static long h(int q, int n){
        if(h[q]!=0) return h[q];
        int cl=q+n-1;
        int cr=Math.min(q, n-1);
        long res=1;
        for(int d=1;d<=cr;d++){
            res*=cl;
            res%=MOD;
            cl--;
            res*=modinv(d);
            res%=MOD;
        }
        h[q]=res;
        return h[q];
    }
    public static long modinv(long a){
    long b=MOD, u=1, v=0;
    long tmp;
    while(b>=1){
        long t=a/b;
        a-=t*b;
        tmp=a; a=b; b=tmp;
        u-=t*v;
        tmp=u; u=v; v=tmp;
    }
    u%=MOD;
    if(u<0) u+=MOD;
    return u;
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