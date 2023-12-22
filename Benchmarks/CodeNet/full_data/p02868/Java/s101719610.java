import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] c = new int[m][3];
        for (int i = 0; i < m; i++) {
            c[i][0] = sc.nextInt()-1;
            c[i][1] = sc.nextInt()-1;
            c[i][2] = sc.nextInt();
        }

        Arrays.sort(c, (a, b)-> (a[0] - b[0]));

        int sizen = 4;
        int size = (int)Math.pow(2, sizen);
        int[] map = new int[size];
        Arrays.fill(map, Integer.MAX_VALUE / 2);
        map[size / 2 - 1] = 0;


        for (int i = 0; i < m; i++) {
            int len = get(map, c[i][0], 0, 0, size/2) + c[i][2];
            update(map, c[i][0], c[i][1]+1, len, 0, 0, size/2);
        }

        int ans = get(map, n-1, 0, 0, size/2);
        if(ans >= Integer.MAX_VALUE/2) ans = -1;

        System.out.println();
    }


    public static void update(int[] data, int a, int b, int x, int k, int l, int r){
        if(a <= l && b >= r && data[k] >= x){
            data[k] = x;
        }else if(r-l == 1){
        }else{
            update(data, a, b, x, k*2+1, l, (l+r)/2);
            update(data, a, b, x, k*2+2, (l+r)/2, r);
        }
    }

    public static int get(int[] data, int a, int k, int l, int r){
        if(a < l || a >= r){
            return Integer.MAX_VALUE;
        }else if(a == l && a == r-1){
            return data[k];
        }else{
            int tmp1 = get(data, a, k*2+1, l, (l+r)/2);
            int tmp2 = get(data, a, k*2+2, (l+r)/2, r);
            return Math.min(tmp1, Math.min(tmp2, data[k]));
        }
    }


    private static class FastScanner {
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
