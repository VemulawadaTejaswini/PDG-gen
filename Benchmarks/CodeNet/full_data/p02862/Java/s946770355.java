import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int x = fs.nextInt();
        int y = fs.nextInt();
        if(!((2*x-y)%3 == 0 && (-x+2*y)%3 == 0)) {
            System.out.println(0);
            System.exit(0);
        }
        //大きい方をm
        int m,n;
        if(x>y) {
            m = (2*x-y)/3;
            n = (-x+2*y)/3;
        }else {
            m = (-x+2*y)/3;
            n = (2*x-y)/3;
        }


        if(!(m>=0 && n>=0)) {
            System.out.println(0);
            System.exit(0);
        }

        long ans = comMod(m+n, n, (long)Math.pow(10,9)+7);
        System.out.println(ans);
        
    }

    public static long comMod(int n,int k, long p) {
        long[] fac = new long[n+1]; //階乗
        long[] inv = new long[n+1]; //逆元
        long[] ifac = new long[n+1]; //逆元の階乗

        fac[0] = ifac[0] = 1;
        fac[1] = ifac[1] = 1;
        inv[1] = 1;

        for(int i=2; i<n+1; i++) {
            fac[i] = (fac[i-1] * i) % p;
            inv[i] = p - inv[(int)p%i] * (p/i) % p;
            ifac[i] = ifac[i-1] * inv[i] % p;
         }

         return fac[n] * (ifac[k] * ifac[n-k] % p) % p;
    }

}
class FastScanner {
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
        if (hasNextByte())
            return buffer[ptr++];
        else
            return -1;
    }
 
    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }
 
    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr]))
            ptr++;
        return hasNextByte();
    }
 
    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
 
    public long nextLong() {
        if (!hasNext())
            throw new NoSuchElementException();
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
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }
 
    public double nextDouble() {
        return Double.parseDouble(next());
    }
}
