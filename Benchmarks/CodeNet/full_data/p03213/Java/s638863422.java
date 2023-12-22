import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        fsc.close();
        ArrayList<Integer> primes=eratosthenes(n);
        int s=primes.size();
        int p,q,r;
        int ans=0;
        for(int i=0;i<s-2;i++) for(int j=i+1;j<s-1;j++) for(int k=j+1;k<s;k++)
            for(int l=0;l<3;l++){
                if(l==0){
                    p=primes.get(i);
                    q=primes.get(j);
                    r=primes.get(k);
                }
                else if(l==1){
                    q=primes.get(i);
                    r=primes.get(j);
                    p=primes.get(k);
                }
                else{
                    r=primes.get(i);
                    p=primes.get(j);
                    q=primes.get(k);
                }
                if(isOK(2,p,n)&&isOK(4,q,n)&&isOK(4,r,n)) ans++;
            }
        for(int i=0;i<s-1;i++) for(int j=i+1;j<s;j++)
            for(int l=0;l<2;l++){
                if(l==0){
                    p=primes.get(i);
                    q=primes.get(j);
                }
                else{
                    q=primes.get(i);
                    p=primes.get(j);
                }
                if(isOK(2,p,n)&&isOK(24,q,n)) ans++;
                if(isOK(4,p,n)&&isOK(14,q,n)) ans++;
            }
        for(int i=0;i<s;i++){
            p=primes.get(i);
            if(isOK(74,p,n)) ans++;
        }
        System.out.println(ans);
    }
    static boolean isOK(int req, int pr, int n){
        int count=0;
        while(n>=1){
            count+=n/pr;
            n/=pr;
        }
        if(count<req) return false;
        return true;
    }
    public static ArrayList<Integer> eratosthenes(int n){
        boolean primes[]=new boolean[n];
        ArrayList<Integer> result =new ArrayList<Integer>();
        if(n>=2) result.add(Integer.valueOf(2));
        for(int i=3;i<n;i+=2){
            if(!primes[i]){
                result.add(Integer.valueOf(i));
                for(int j=i*i;j<n;j+=2*i){
                    if(j<0) break;
                    primes[j]=true;
                }
            }
        }
        return result;
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