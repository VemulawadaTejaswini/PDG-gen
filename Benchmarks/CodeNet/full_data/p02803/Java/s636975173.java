
import java.util.*;
import java.io.*;
class Po {
    int x, y,cnt;
    public Po(int x, int y, int cnt) {
        this.x = x;
        this.y = y;
        this.cnt = cnt;
    }
}
class Main {
    static int H,W;
    static char[][] c;
    static char[][] c2;
    static int[][] cc;
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        H = sc.nextInt();
        W = sc.nextInt();
        c = new char[H+2][W+2];
        c2 = new char[H+2][W+2];
        cc = new int[H+2][W+2];
        for(int i = 0; i<H+2; i++) {
            for(int j = 0; j<W+2; j++) {
                if(i==0 || j==0|| i==H+1 || j== W+1) {
                    c[i][j] = '#';
                    c2[i][j] = '#';
                    continue;
                }
            }
        }
        for(int i = 1; i<H+1; i++) {
            String str = sc.next();
            for(int j = 1; j<W+1; j++) {
               c[i][j] = str.charAt(j-1);
                c2[i][j] = c[i][j];
            }
        }
        int max = 0;
        for(int i = 1; i<H+1; i++) {
            for(int j = 1; j<W+1; j++) {
               if(c[i][j] =='.') {
                    for(int ii = 1; ii<H+1; ii++) {
                        for(int ij = 1; ij<W+1; ij++) {
                            cc[ii][ij] = -1;
                            c2[ii][ij] = c[ii][ij];
                        }
                    }
                    bfs(i,j,0);
                    for(int ii = 1; ii<H+1; ii++) {
                        for(int ij = 1; ij<W+1; ij++) {
                            pe("aa"+i+" "+j+" "+ii+" "+ij+" "+cc[ii][ij]);
                            
                            max = Math.max(max, cc[ii][ij]);
                        }
                    }
                    
                    
                    
                }
            }
        }
        p(max);
    }
    public static void bfs(int ii, int ij, int cnt) {
        //pe("aa"+i+" "+j+" "+gi+" "+gj);
        Queue<Po> q = new ArrayDeque<>();
        c2[ii][ij] = '#';
        q.add(new Po(ii,ij,0));
        while(q.size()!=0) {
            Po point = q.poll();
            int i = point.x;
            int j = point.y;
            cc[i][j] = point.cnt;
            if(c2[i+1][j]=='.') {
                c2[i+1][j] = '#';
                q.add(new Po(i+1,j,cc[i][j]+1));
            }
            if(c2[i-1][j]=='.') {
                c2[i-1][j] = '#';
                q.add(new Po(i-1,j,cc[i][j]+1));
            }
            if(c2[i][j+1]=='.') {
                c2[i][j+1] = '#';
                q.add(new Po(i,j+1,cc[i][j]+1));
            }
            if(c2[i][j-1]=='.') {
                c2[i][j-1] = '#';
                q.add(new Po(i,j-1,cc[i][j]+1));
            }
            cnt++;
        }
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