import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class Main implements Runnable {
    public static void main(String[] args) {
        new Thread(null,new Main(), "" ,Runtime.getRuntime().maxMemory()).start();
    }

    public void run() {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        Map<Integer, List<Integer>> enemyMap = new HashMap<>();
        int[] numFriendOf = new int[n];
        UnionFind uf = new UnionFind(n);
        for(int i = 0;i < m;i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            numFriendOf[a]++;
            numFriendOf[b]++;
            uf.unite(a, b);
        }
        for(int i = 0;i < k;i++) {
            int c = sc.nextInt() - 1;
            int d = sc.nextInt() - 1;
            List<Integer> eMap = enemyMap.get(Integer.valueOf(c));
            if(eMap == null) {
                eMap = new ArrayList<>();
                eMap.add(Integer.valueOf(d));
            }
            else eMap.add(Integer.valueOf(d));
            enemyMap.put(Integer.valueOf(c), eMap);

            eMap = enemyMap.get(Integer.valueOf(d));
            if(eMap == null) {
                eMap = new ArrayList<>();
                eMap.add(Integer.valueOf(c));
            }
            else eMap.add(Integer.valueOf(c));
            enemyMap.put(Integer.valueOf(d), eMap);
        }

        Map<Integer, Integer> numClusterMap = new HashMap<>();
        int[] rootTable = new int[n];
        for(int i = 0;i < n;i++) {
            rootTable[i] = uf.rootOf(i);
            Integer numCluster = numClusterMap.get(Integer.valueOf(rootTable[i]));
            if(numCluster == null) numClusterMap.put(Integer.valueOf(rootTable[i]), Integer.valueOf(1));
            else numClusterMap.put(Integer.valueOf(rootTable[i]), Integer.valueOf(numCluster.intValue() + 1));
        }
        
        Map<Integer, Integer> ans = new HashMap<>();
        for(int i = 0;i < n;i++) {
            Integer root = Integer.valueOf(rootTable[i]);
            Integer numCluster = numClusterMap.get(root);
            Integer num = Integer.valueOf(numCluster.intValue() - 1 - numFriendOf[i]);
            List<Integer> enemies = enemyMap.get(Integer.valueOf(i));
            if(enemies == null) ans.put(Integer.valueOf(i), num);
            else {
                for(Integer enemy : enemies) {
                    if(uf.same(i, enemy.intValue())) num = num.intValue() - 1;
                }
                ans.put(Integer.valueOf(i), num);
            }
        }

        PrintWriter out =  new PrintWriter(System.out);
        for(int i = 0;i < n;i++) {
            out.print(ans.get(Integer.valueOf(i)));
            if(i != n - 1) out.print(" ");
        }
        out.println();
        out.flush();
    }

    long nCm(int n, int m) {
        if(n < m) return 0l;
        long c = 1;
        m = (n - m < m ? n - m : m);
        for(int ns = n - m + 1, ms = 1;ms <= m;ns ++, ms++) {
            c *= ns;
            c /= ms;
        }
        return c;
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