//master
import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

class Pair {
    int a,b;
    Pair(int a, int b){
        this.a = a;
        this.b = b;
    }
}
public class Main {
    static int[][] memo;
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        String[] c = new String[n];
        for(int i = 0; i<n; i++) {
            char[] cc = sc.next().toCharArray();
            Arrays.sort(cc);
            c[i] = new String(cc);
        }
        Arrays.sort(c);
        //for(String s:c)p(s);
        int ans = 0;
        int cnt = 1;
        for(int i = 0; i<n-1; i++) {
            //p(c[i]);
            if(!c[i].equals(c[i+1])) {
                ans +=(cnt)*(cnt-1)/2;
                cnt=0;
            }
            cnt++;
        }
        ans +=(cnt)*(cnt-1)/2;
        p(ans);
    }

    public static <T> void p(T message) {
        System.out.println(message);
    }

    public static <T> void pe(T message) {
        System.err.println(message);
    }

    public static <T> void pp(T message) {
        System.out.print(message);
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
