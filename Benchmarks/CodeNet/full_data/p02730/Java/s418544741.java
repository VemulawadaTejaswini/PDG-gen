import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner();
        String s = sc.next();
        int ln = s.length();
        int q = ln/4;
        boolean is_strong = true;
        char[] cs1 = new char[q];
        char[] cs2 = new char[q];
        char[] cs3 = new char[q];
        char[] cs4 = new char[q];
        if(ln%4 == 1){
            cs1 = s.substring(0, q).toCharArray();
            cs2 = s.substring(q, q*2).toCharArray();
            cs3 = s.substring(q*2+1, q*3+1).toCharArray();
            cs4 = s.substring(q*3+1, q*4+1).toCharArray();
        }else{
            cs1 = s.substring(0, q).toCharArray();
            cs2 = s.substring(q+1, q*2+1).toCharArray();
            cs3 = s.substring(q*2+2, q*3+2).toCharArray();
            cs4 = s.substring(q*3+3, q*4+3).toCharArray();
            if(s.charAt(q) != s.charAt(3*q+2)) is_strong = false;
        }
        
            for(int i=0; i<q; i++){
                if(cs1[i] != cs2[q-i-1]) is_strong = false;
                if(cs1[i] != cs3[i]) is_strong = false;
                if(cs1[i] != cs4[q-i-1]) is_strong = false;
            }
        if(is_strong) System.out.println("Yes");
        else  System.out.println("No");
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
