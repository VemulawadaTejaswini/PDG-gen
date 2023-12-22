import java.util.*;
import java.io.*;
class Point {
    int v, w;
    public Point(int v, int w) {
        this.v = v;
        this.w = w;
    }
}
class Main {
    static ArrayList<Point>[] P;
    static int[] iv;
    static int N;
    static int[] reached;
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        N = sc.nextInt();
        P = new ArrayList[N+1];
        for(int i = 1; i<=N; i++) {
            P[i] = new ArrayList<Point>();
        }
        iv = new int[N+1];
        reached = new int[N+1];
        for(int i = 0; i<N-1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            P[u].add(new Point(v,w));
            P[v].add(new Point(u,w));
        }
        dfs(1,0);
        for(int i = 1; i<=N; i++) System.out.println(iv[i]);
    }
    public static void dfs(int current, int len) {
        if(reached[current]==1) return;
        else reached[current] = 1;

        if(len%2 == 0) iv[current] = 0;
        else iv[current] = 1;

        for(Point p : P[current]) { // にぶたんしたい
            dfs(p.v, len+p.w);
        }
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