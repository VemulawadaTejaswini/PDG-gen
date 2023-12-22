
import java.util.*;
import java.io.*;
class Po {
    int x, y;
    public Po(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class Main {
    static long[] cost;
    static int n;
    static Po[] p;
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        n = sc.nextInt();
        int q = sc.nextInt();
        p = new Po[n-1];
        cost = new long[n+1];
        for(int i = 0; i<n-1; i++) {
            p[i] = new Po(sc.nextInt(),sc.nextInt());
        }
        for(int i = 0; i<q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            cost[x] += y;
        }
        dfs(1);
        for(int i = 1; i<=n; i++) pp(cost[i]+" ");
        p("");
    }
    public static void dfs(int i) {
        // p(i);
        if(i == -1) return;
        for(int j = 0; j<n-1; j++) {
            if(p[j].x == i) {
                // p("i= "+p[j].x+" "+p[j].y);
                if(p[j].y == -1) continue;
                // p(" "+p[j].y);
                cost[p[j].y] += cost[i];
                p[j].x = -1;
                dfs(p[j].y);
            }
            if(p[j].y == i) {
                // p("i= "+p[j].y+" "+p[j].x);
                if(p[j].x == -1) continue;
                // p(" "+p[j].x);
                cost[p[j].x] += cost[i];
                p[j].y = -1;
                dfs(p[j].x);
            }
        }
    }
    public static <T> void p(T element) {
	System.out.println(element);
    }
    public static <T> void pp(T element) {
        System.out.print(element);
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