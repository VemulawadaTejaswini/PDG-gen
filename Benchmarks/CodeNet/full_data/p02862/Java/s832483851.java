import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main implements Runnable {
    public static void main(String[] args) {
        new Thread(null,new Main(), "" ,Runtime.getRuntime().maxMemory()).start();
    }

    // メイン処理
    public void run() {
        FastScanner sc = new FastScanner();
        int x = sc.nextInt();
        int y = sc.nextInt();
        long mod = 1000000007;

        // (i + 1, j + 2)する操作をA、(i + 2, j + 1)する操作をBとする。
        // 操作Aをa回、操作Bをb回行ったとすると、操作終了後の座標は(a + 2b, 2a + b)になる。
        // したがって(x, y)に到達するために必要な操作の回数を以下の連立方程式から導出可能。
        // a + 2b = x, 2a + b = y
        //　これを解くと a = (-x + 2y) / 3, b = (2x - y) / 3
        // 上記の式より(x, y)に到達するために必要な操作Aの回数と操作Bの回数を算出可能。
        // 例えば点(4, 5)はAが2回、Bが1回必要であるから、経路の数は3C1で求められる。
        long ans = 0;
        if((2l * x - y) % 3l == 0 && (-1l * x + 2l * y) % 3l == 0){
            long a = (-1l * x + 2l * y) / 3l;
            long b = (2l * x - y) / 3l;
            if(a >= 0 && b >= 0) ans = modnCm(a + b, b, mod);
        }
        
        PrintWriter out =  new PrintWriter(System.out);
        out.println(ans);
        out.flush();
    }

    // 以下、ユーティリティ
    long nCm(long n, long m) {
        if(n < m) return 0l;
        long c = 1l;
        m = (n - m < m ? n - m : m);
        for(long ns = n - m + 1, ms = 1;ms <= m;ns ++, ms++) {
            c *= ns;
            c /= ms;
        }
        return c;
    }

    long modnCm(long n, long m, long mod) {
        if(n < m) return 0l;
        long upper = 1l;
        long downer = 1l;
        m = (n - m < m ? n - m : m);
        for(long ns = n - m + 1, ms = 1;ms <= m;ns ++, ms++) {
            upper = upper * ns % mod;
            downer = downer * ms % mod;
        }
        return upper * modInv(downer, mod) % mod;
    }

    // mod m での a の逆元 を計算する
    long modInv(long a, long m) {
        long b = m, u = 1, v = 0;
        while(b > 0) {
            long t = a / b;
            a -= t * b;
            long tmp = a;
            a = b;
            b = tmp;
            u -= t * v;
            tmp = u;
            u = v;
            v = tmp;
        }
        u %= m;
        if (u < 0) u += m;
        return u;
    }

    long modPow(long a, long n, long mod) {
        long res = 1l;
        while(n > 0l) {
            if(n % 2l == 1l) res = res * a % mod;
            a = a * a % mod;
            n /= 2l;
        }
        return res;
    }

}

class UnionFind {
    private int[] parent;

    UnionFind(int n) {
        parent = new int[n];
        for(int i = 0;i < n;i++) parent[i] = i;
    }

    public int rootOf(int x) {
        if(parent[x] == x) return x;
        else return parent[x] = rootOf(parent[x]);
    }

    public boolean same(int x, int y) {
        return rootOf(x) == rootOf(y);
    }

    public void unite(int x, int y) {
        x = rootOf(x);
        y = rootOf(y);
        if(x == y) return;
        parent[x] = y;
        return;
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