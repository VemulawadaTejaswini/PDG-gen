import java.util.*;
import java.io.*;


public class Main{
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int[] friend = new int[N], block = new int[N];
        UnionFindTree relation = new UnionFindTree(N);
        for(int i=0;i<M;i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            friend[a]++;
            friend[b]++;
            relation.unite(a, b);
        }
        for(int i=0;i<K;i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            block[a]++;
            block[b]++;
        }
        for(int i=0;i<N;i++){
            out.print(relation.size[relation.find(i)] - friend[i] -block[i] - 1 + " ");
        }
        out.println(block[0]);



        out.flush();
    }

}

class UnionFindTree {
    int[] root;
    int[] rank;
    int[] size;
    HashSet<Integer>[] edge;
    public UnionFindTree(int n) {
        this.root = new int[n];
        this.rank = new int[n];
        this.size = new int[n];
        for(int i=0;i<n;i++){
            root[i] = i;
            size[i] = 1;
        }
    }

    public int find(int x){
        if(root[x]==x) return x;
        else{
            return root[x] = find(root[x]);
        }
    }

    public void unite(int x, int y){
        x = find(x);
        y = find(y);
        if(x==y) return;
        if(rank[x] < rank[y]){
            size[find(y)] += size[find(x)];
            root[x] = y;
        }
        else{
            size[find(x)] += size[find(y)];
            root[y] = x;
            if(rank[x]==rank[y]){
                rank[x]++;
            }
        }
    }

    public boolean same(int x, int y){
        return find(x) == find(y);
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
