import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        long m=fsc.nextLong();
        long[] a=new long[n];
        long lcm=0;
        int two=0;
        for(int i=0;i<n;i++){
            a[i]=fsc.nextLong()/2;
            if(i==0){
                lcm=a[i];
                long tmp=a[i];
                while(tmp%2==0){
                    tmp/=2;
                    two++;
                }
            } else {
                long gcd=euclideanGCD(lcm, a[i]);
                lcm=lcm*a[i]/gcd;
                if(lcm>m){
                    System.out.println(0);
                    return;
                }
                long tmp=a[i];
                int cnt=0;
                while(tmp%2==0){
                    tmp/=2;
                    cnt++;
                }
                if(cnt!=two){
                    System.out.println(0);
                    return;
                }
            }
        }
        fsc.close();
        long pass=-1, fail=1_000_000_000l;
        while(fail-pass>1){
            long mid=pass+(fail-pass)/2;
            if(lcm*mid<=m) pass=mid;
            else fail=mid;
        }
        long ans=(pass+1)/2;
        System.out.println(ans);
    }
    public static long euclideanGCD(long a, long b) {
        if(a < b) return euclideanGCD(b, a);
        long r=a%b;
        while (r!=0) {
          a = b;
          b = r;
          r=a%b;
        }
        return b;
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
