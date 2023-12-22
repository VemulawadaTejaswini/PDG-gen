
import java.util.*;
import java.io.*;
class Edge{
    int to,cost;

    Edge(int to,int cost){
        this.to = to;
        this.cost = cost;
    }
}
public class Main {

    public static void main(String[] args) {
        List<List<Edge>> graph = new ArrayList<>();
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        for(int i=0;i<n;i++)graph.add(new LinkedList<>());
        int a,b,c;
        for(int i=0;i<n-1;i++){
            a = fs.nextInt()-1;
            b = fs.nextInt()-1;
            c = fs.nextInt();
            graph.get(a).add(new Edge(b,c));
            graph.get(b).add(new Edge(a,c));
        }
        int q = fs.nextInt();
        int k = fs.nextInt()-1;

        Queue<Edge> queue = new ArrayDeque<>();
        long[] dist = new long[n];
        Arrays.fill(dist,-1);
        queue.add(new Edge(k,0));
        dist[k] = 0;
        Edge now ;
        int v;
        while(queue.size()> 0){
            now = queue.poll();
            v = now.to;
            for(Edge e: graph.get(v)){
                if(dist[e.to]==-1){
                    dist[e.to] = dist[v] + e.cost;
                    queue.add(e);
                }
            }
        }
        PrintWriter out = new PrintWriter(System.out);
        int x,y;
        for(int i=0;i<q;i++){
            x = fs.nextInt()-1;
            y = fs.nextInt()-1;
            out.println(dist[x]+dist[y]);
        }
        out.flush();
    }
    static class FastScanner {
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
}
