import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();
        int[][] a = new int[h+2][w+2];
        int[][] b = new int[h+2][w+2];
        int cnt = 1;
        int[] f = new int[h+2];
        int[] fc = new int[h+2];
        for(int i = 0; i<h+2; i++) {
            if(i==0||i==h+1) {
                for(int j = 0; j<w+2; j++) {
                    a[i][j] = -1; 
                }
                continue;
            }
            String str = sc.next();
            for(int j = 0; j<w+2; j++) {
                if(j==0||j==w+1) {
                    a[i][j] = -1;
                }else {
                    char c = str.charAt(j-1);
                    if(c=='#') {
                        a[i][j] = cnt;
                        cnt++;
                        f[i]++; 
                        fc[i]++;
                    }
                }
            }
        }
        cnt = 0;
        for(int i = 1; i<h+1; i++) {
            if(f[i]!=0)cnt++;
            for(int j = 1; j<w+1; j++) {
                if(f[i] == 0) {
                    b[i][j] = b[i-1][j];
                    continue;
                }
                if(a[i][j] == cnt) p(a[i][j]);
                if(a[i][j] == cnt) {
                    
                    b[i][j] = a[i][j];
                    if(f[i]!=1)cnt++;
                    f[i] = Math.max(f[i]-1,1);
                }
                else if(f[i]>1) {
                    b[i][j] = cnt; 
                }
                else if(f[i]==1) {
                    b[i][j] = cnt;
                }else {
                    b[i][j] = cnt;
                }
                if(b[i][j] == 0) b[i][j] = 1;
            }
        }
        for(int i = h; i>=1; i--) {
            for(int j = w; j>=1; j--) {
                if(b[i][j] == 0) {
                    b[i][j] = b[i+1][j];
                    continue;
                }
            }
        }

        for(int i = 1; i<h+1; i++) {
            for(int j = 1; j<w+1; j++) {
                pp(a[i][j]);
            }
            p("");
        }
        for(int i = 1; i<h+1; i++) {
            for(int j = 1; j<w+1; j++) {
                pp(b[i][j]);
            }
            p("");
        }
    }
    public static <T> void p(T element) {
	    System.out.println(element);
    }
    public static <T> void pp(T element) {
	    System.out.print(element);
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