import java.io.IOException;
import java.io.InputStream;
import java.util.*;

class Edge {
    int from, to;

    public Edge(int from, int to) {
        this.from = from;
        this.to = to;
    }
}

public class Main {

    static void dfs(int at) {
        if (visited[at]) return;
        visited[at] = true;

        for (Edge e : graph.get(at)) {
            if (visited[e.to]) continue;
            counter[e.to] += counter[e.from];
            dfs(e.to);
        }
    }

    static int N, Q;
    static List<List<Edge>> graph;
    static boolean[] visited;
    static int[] counter;

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        N = fs.nextInt();
        Q = fs.nextInt();
        graph = new ArrayList<>();
        counter = new int[N];
        visited = new boolean[N];
        for (int i = 0; i < N; ++i) graph.add(new ArrayList<>());

        for (int i = 0; i < N-1; ++i) {
            int a = fs.nextInt() - 1;
            int b = fs.nextInt() - 1;
            graph.get(a).add(new Edge(a, b));
            graph.get(b).add(new Edge(b, a));

        }

        for (int i = 0; i < Q; ++i) {
            int p = fs.nextInt() - 1;
            int x = fs.nextInt();
            counter[p] += x;
        }

        dfs(0);

        for (int i = 0; i < N; ++i) {
            System.out.print(counter[i] + " ");
        }
        System.out.println();
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



























