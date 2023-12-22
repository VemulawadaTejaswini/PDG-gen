import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.Stack;

public class Main implements Runnable {
    public static void main(String[] args) {
        new Thread(null,new Main(), "" ,Runtime.getRuntime().maxMemory()).start();
    }

    // メイン処理
    public void run() {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int[][] ab = new int[n - 1][2];
        Map<Integer, Set<Integer>> childrenMap = new HashMap<>(n);
        for(int i = 0;i < n - 1;i++) {
            ab[i][0] = sc.nextInt() - 1;
            ab[i][1] = sc.nextInt() - 1;

            Set<Integer> childrenA = childrenMap.get(Integer.valueOf(ab[i][0]));
            Set<Integer> childrenB = childrenMap.get(Integer.valueOf(ab[i][1]));
            if(childrenA == null) childrenA = new HashSet<>(n);
            childrenA.add(Integer.valueOf(ab[i][1]));
            childrenMap.put(Integer.valueOf(ab[i][0]), childrenA);
            if(childrenB == null) childrenB = new HashSet<>(n);
            if(ab[i][0] != 0) childrenB.add(Integer.valueOf(ab[i][0]));
            childrenMap.put(Integer.valueOf(ab[i][1]), childrenB);
        }

        int[] nextColor = new int[n];
        int[] edgeColor = new int[n];
        int[] parent = new int[n];
        Arrays.fill(edgeColor, -1);
        Arrays.fill(parent, -1);
        Set<Integer> alreadyChecked = new HashSet<>(n);
        Set<Integer> usedColor = new HashSet<>(n);
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(Integer.valueOf(0));
        alreadyChecked.add(Integer.valueOf(0));
        while(!stack.isEmpty()) {
            Integer i = stack.pop();
            Set<Integer> children = childrenMap.get(i);
            children.removeAll(alreadyChecked);

            for(Integer j : children) {
                if(nextColor[i.intValue()] == edgeColor[i.intValue()]) nextColor[i.intValue()]++;
                edgeColor[j.intValue()] = nextColor[i.intValue()];
                usedColor.add(Integer.valueOf(nextColor[i.intValue()]));
                nextColor[i.intValue()]++;
                stack.push(j);
                alreadyChecked.add(j);
                parent[j.intValue()] = i.intValue();
            }
        }

        PrintWriter out =  new PrintWriter(System.out);
        out.println(usedColor.size());
        for(int i = 0;i < n - 1;i++) {
            if(parent[ab[i][0]] == ab[i][1]) out.println(edgeColor[ab[i][0]] + 1);
            else out.println(edgeColor[ab[i][1]] + 1);
        }
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

    long modnCm(int n, int m, int mod) {
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