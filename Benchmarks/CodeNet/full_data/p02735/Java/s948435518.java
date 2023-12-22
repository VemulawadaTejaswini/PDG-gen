import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner();
        
        int h = sc.nextInt();
        int w = sc.nextInt();
        
        boolean[][] can_go = new boolean[w][h];
        
        String in = "\0";
        for(int i=0; i<h; i++){
            in = sc.next();
            for(int j=0; j<w; j++){
                can_go[j][i] = (in.charAt(j)=='.') ? true : false;
            }
        }
        
        int[][] least_turn = new int[w][h];
        
        least_turn[0][0] = can_go[0][0] ? 0 : 1;
        for(int i=1; i<h; i++){
            least_turn[0][i] = least_turn[0][i-1];
            if(can_go[0][i]!=can_go[0][i-1]) least_turn[0][i]++;
        }
        for(int j=1; j<w; j++){
            least_turn[j][0] = least_turn[j-1][0];
            if(can_go[j][0]!=can_go[j-1][0]) least_turn[j][0]++;
        }
        
        int a=0, b=0;
        for(int i=1; i<h; i++){
            for(int j=1; j<w; j++){
                a = least_turn[j][i-1];
                if(can_go[j][i]!=can_go[j][i-1]) a++;
                b = least_turn[j-1][i];
                if(can_go[j][i]!=can_go[j-1][i]) b++;
                least_turn[j][i] = a<b ? a : b;
            }
        }
        int gap = least_turn[w-1][h-1];
        if(!can_go[w-1][h-1]) gap++;
        gap /=2;
        
        System.out.println(gap);
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