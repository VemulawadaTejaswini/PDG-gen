
import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = fs.nextInt();
        }
        Map<Integer,Integer> gcd = new HashMap<>();
        Map<Integer,Integer> factorA;
        Integer fac;
        for (int i = 0; i < n; i++) {
            factorA = prime_factor(a[i]);
            for(Map.Entry<Integer,Integer> entry : factorA.entrySet()){
                fac = gcd.get(entry.getKey());
                if(fac!=null){
                    gcd.put(entry.getKey(),Math.max(fac,entry.getValue()));
                }else{
                    gcd.put(entry.getKey(),entry.getValue());
                }
            }
        }
        long gcdMod = 1;
        int mod = 1000000007;
        for(Map.Entry<Integer,Integer> entry : gcd.entrySet()){
            gcdMod*=MOD.getPowMod(entry.getKey(),entry.getValue(),mod);
            gcdMod%=mod;
        }
        long res = 0;
        MOD.COMinit(1000001);
        for(int i=0;i<n;i++){
            res+=gcdMod*MOD.inv[a[i]];
            res%=mod;
        }
        System.out.println(res);
    }

    public static Map<Integer,Integer> prime_factor(long l){

        Map<Integer,Integer> map = new HashMap<>();
        long num = l;
        int count;
        for(int i=2;i*i<=num;i++){
            if(l%i==0){
                count = 0;
                while(l%i==0){
                    count++;
                    l/=i;
                }
                map.put(i,count);
            }
        }
        if(l!=1)map.put((int)l,1);
        return map;
    }

    static class FastScanner {
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
            if (hasNextByte()) return buffer[ptr++];
            else return -1;
        }

        private boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
            return hasNextByte();
        }

        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (isPrintableChar(b)) {
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
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}
class MOD {
    static long[] fac,inv,finv;
    static int mod = 1000000007;

    public static long getPowMod(long a, long x,long mod){
        long res = 1;
        while(x > 0){
            if((x&1)==1){
                res = (res*a)%mod;
            }
            x>>=1;
            a = (a*a)%mod;
        }
        return res;
    }
    public static long getFactorialMod(long n,long mod){
        if(n==0){
            return 1;
        }else{
            return (n*getFactorialMod(n-1, mod))%mod;
        }
    }

    public static long nCkMod(long n,long k,long mod){
        if(n < k){
            return 0;
        }else{
            long nMod = getFactorialMod(n, mod);
            long kinvMod = getPowMod(getFactorialMod(k, mod), mod-2, mod);
            long n_kinvMod = getPowMod(getFactorialMod(n-k, mod), mod-2, mod);
            long x = (nMod*kinvMod)%mod;
            return (x*n_kinvMod)%mod;
        }
    }

    public static void COMinit(int max){
        fac = new long[max];
        inv = new long[max];
        finv = new long[max];
        fac[0] = fac[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;
        for(int i=2;i<max;i++){
            fac[i] = fac[i-1]*i%mod;
            inv[i] = mod-inv[mod%i]*(mod/i)%mod;
            finv[i] = finv[i-1]*inv[i]%mod;
        }
    }
    public static long nCkMod2(int n,int k){
        if(n < k)return 0;
        return fac[n]*(finv[k]*finv[n-k]%mod)%mod;
    }
}