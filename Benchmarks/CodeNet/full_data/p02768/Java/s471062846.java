
import java.util.*;
import static java.lang.System.*;
import java.io.*;
import java.math.*;

public class Main {
	static final long INF = 1000000007;
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt();
		int a =sc.nextInt();
		int b =sc.nextInt();
		long cnt = 1;
		int m = n - 1;
		long x = 1, y = 1;
		int i = 1;
		
		for (i = 1; i <= m/2; i++) {
			x =( x * (n - i + 1)) % INF;
			y =( y * i) % INF;
			cnt +=( (x / y )%INF);
			cnt +=( (x / y )%INF);
			if (a == i || a == (n - 1)) {
				cnt -=( x * y) % INF;
			}
			if (i == b || i == (n - b)) {
				cnt -= (x * y )% INF;
			}
		}
		if (m % 2 == 1 && m/2+1 != a && m/2+1 !=b) {
			cnt +=( (x * (n - i + 1 )) / (y * i)) % INF;
		}

		if (n == a || n == b)
			cnt--;
		
		out.println(cnt % INF);
		
       out.close();
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
