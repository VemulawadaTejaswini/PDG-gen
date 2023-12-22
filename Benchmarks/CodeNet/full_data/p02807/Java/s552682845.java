
import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int N = sc.nextInt();
        int mod = 1000000000+7;
        long[] a = new long[N];
        long[] b = new long[N-1];
        for(int i = 0; i<N; i++) {
            a[i] = sc.nextLong();
        }
        if(N==2) {
            p(a[1]-a[0]);
            return;
        }
        for(int i = 0; i<N-1; i++) {
            b[i] = a[N-1] - a[i];
            pe(i+" "+b[i]);
        }
        double kake = 1;
        long sita2 = 1; 
        for(int i = 3; i<=N-1; i++) {
            kake*=(i%mod);
            kake %= mod;
        }
        pe("N-1! "+ kake);
        pe("sita2 最後 " + sita2);
        long kitai = 0;
        for(int i = N-2; i>=1; i--) {
            pe(b[i]);
            kitai += (long)b[i];
            kitai %= mod;
            pe(i+ " "+ b[i]+" kitai "+ (long)kitai);
        }
        pe(b[0]*2);
        kitai += (b[0]*2);
        pe(kitai);
        kitai %= mod;
        pe(kitai);
        kitai *= (long)kake;
        pe(kitai);
        kitai %= mod;
	p(kitai);
    }
    public static <T> void p(T element) {
	System.out.println(element);
    }
    public static <T> void pe(T element) {
        System.err.println(element);
        }
    public static int min(int a, int b, int c) {
	int min = Math.min(a,b);
	min = Math.min(min,c);
	return min;
    }
    public static int max(int a, int b,int c) {
	int max= Math.max(a,b);
	max = Math.max(max,c);
        return max;
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
 
    private boolean isPrintableChar(int c) {
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