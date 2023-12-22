import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;


public class Main {
    public static void main(String[] args) {
        FastScanner fsc = new FastScanner();
        int n = fsc.nextInt();
        long[] x = new long[n];
        for (int i = 0; i < n; i++) {
            x[i] = fsc.nextLong();
        }
        long l = fsc.nextLong();
        int p = minimumPowerOfTwo(n);
        int[][] right = new int[n][p];
        int u = 0, v = 0;
        while (u < n) {
            while (v < n && x[v] - x[u] <= l) {
                v++;
            }
            right[u][0] = v - 1;
            u++;
        }
        for (int k = 1; k < p; k++) {
            for (int i = 0; i < n; i++) {
                right[i][k] = right[right[i][k - 1]][k - 1];
            }
        }
        StringBuilder sb = new StringBuilder();
        int q = fsc.nextInt();
        for (int i = 0; i < q; i++) {
            int a = fsc.nextInt() - 1;
            int b = fsc.nextInt() - 1;
            if (a > b) {
                int tmp = a;
                a = b;
                b = tmp;
            }
            int day = 0;
            int now = a;
            while (now < b) {
                int fail = -1, pass = p;
                while (pass - fail > 1) {
                    int mid = fail + (pass - fail) / 2;
                    if (right[now][mid] >= b) {
                        pass = mid;
                    } else {
                        fail = mid;
                    }
                }
                if (fail == -1) {
                    day++;
                    break;
                }
                day += 1 << fail;
                now = right[now][fail];
            }
            sb.append(day).append('\n');
        }
        System.out.print(sb);
    }

    private static int minimumPowerOfTwo(int n) {
        int i = 0;
        while (1 << ++i < n)
            ;
        return i;
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
