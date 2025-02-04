import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        String S = sc.next();
        int Q = Integer.parseInt(sc.next())	;
        StringBuilder str = new StringBuilder(S);
        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();

        boolean reverse = false;
        for (int i = 0; i < Q; i++) {
            int T = sc.nextInt();
            reverse = T == 1 ? !reverse : reverse;
            if (T == 1) {
                continue;
            }
            int F = Integer.parseInt(sc.next())	;
            char C = sc.next().charAt(0);
            if (F == 1) {
                if (reverse) {
                    right.append(C);
                    continue;
                }

                left.insert(0, C);
                continue;
            }
            if (reverse) {
                left.insert(0, C);
                continue;
            }
            right.append(C);
        }
        System.out.println(reverse ? str.reverse().append(left).insert(0,right): str.append(right).insert(0,left));
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