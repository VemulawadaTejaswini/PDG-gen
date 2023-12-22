import java.util.*;
import java.io.*;


public class Main{
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int white[][] = new int[2*K][2*K];
        int black[][] = new int[2*K][2*K];
        for(int i=0;i<N;i++){
            int x = sc.nextInt() % (2*K);
            int y = sc.nextInt() % (2*K);
            if(sc.next().charAt(0) == 'B') black[x][y]++;
            else white[x][y]++;
        }

        int w[][] = new int[K][K];
        int b[][] = new int[K][K];
        for(int i=0;i<2*K;i++){
            for(int j=0;j<2*K;j++){
                if((i<K && j<K) || (i>=K && j>= K)){
                    w[i%K][j%K] += white[i][j];
                    b[i%K][j%K] += black[i][j];
                }
                else{
                    w[i%K][j%K] += black[i][j];
                    b[i%K][j%K] += white[i][j];
                }
            }
        }

        int res = 0;
        for(int i=0;i<K;i++){
            for(int j=0;j<K;j++){
                res += Math.max(w[i][j], b[i][j]);
            }
        }

        out.println(res);
        out.flush();
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