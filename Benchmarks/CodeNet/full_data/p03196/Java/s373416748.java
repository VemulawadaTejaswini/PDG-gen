

import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        long n = fs.nextLong();
        long p = fs.nextLong();
        Map<Long,Integer> map = prime_factor(p);
        long res = 1;
        for(Map.Entry<Long,Integer> entry : map.entrySet()){
            long cnt = entry.getValue()/n;
            res *= mpow(entry.getKey(),cnt);
        }

        System.out.println(res);
    }

    public static long mpow(long a, long x){
        long res = 1;
        long base = a;
        while(x > 0){
            if((x&1)==1){
                res*=base;
            }
            base*=base;
            x>>=1;
        }
        return res;
    }

    public static Map<Long,Integer> prime_factor(long l){
        Map<Long,Integer> map = new HashMap<>();
        for(long i=2;i*i<=l;i++){
            if(l%i==0){
                int count = 0;
                while(l%i==0){
                    count++;
                    l/=i;
                }
                map.put(i,count);
            }
        }
        if(l!=1)map.put(l,1);
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
