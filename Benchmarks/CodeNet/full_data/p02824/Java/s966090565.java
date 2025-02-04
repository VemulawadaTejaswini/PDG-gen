import java.util.*;
import java.io.*;

class Main{
    static int n, v, p;
    static long m;
    static long[] a;
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        n=fsc.nextInt();
        m=fsc.nextLong();
        v=fsc.nextInt();
        p=fsc.nextInt();
        a=new long[n];
        for(int i=0;i<n;i++){
            a[i]=fsc.nextLong();
        }
        fsc.close();
        revSort(a);
        int pass=p-1;
        int fail=n;
        while(fail-pass>1){
            int mid=pass+(fail-pass)/2;
            if(pass(mid)) pass=mid;
            else fail=mid;
        }
        System.out.println(pass+1);
    }
    static boolean pass(int k){
        if(p-1+n-k>=v){
            if(a[k]+m>=a[p-1]) return true;
            else return false;
        }
        int restNo=v-(p-1+n-k);
        long now=0;
        for(int i=k-1;i>=p-1;i--){
            if(a[k]+m-a[i]>=m){
                restNo--;
            }
            else{
                long c=a[k]+m-a[i];
                if(now+c>=m) restNo--;
                now=(now+c)%m;
            }
        }
        return restNo<=0;
    }
    static void revSort(long[] a){
        Arrays.sort(a);
        int l=a.length;
        long tmp;
        for(int i=0;i<l/2;i++){
            tmp=a[i];
            a[i]=a[l-i-1];
            a[l-i-1]=tmp;
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
