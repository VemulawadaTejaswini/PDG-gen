import java.io.*;
import java.util.*;
import java.math.BigInteger;

class Main{

    void solve(){
        int N = ni();
        MaxFlow maxflow = new MaxFlow(2*N+2);
        int[] a = new int[N];
        int[] b = new int[N];
        int[] c = new int[N];
        int[] d = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = ni();
            b[i] = ni();
        }
        for (int i = 0; i < N; i++) {
            c[i] = ni();
            d[i] = ni();
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(a[i]<c[j] && b[i]<d[j]){
                    maxflow.add_edge(i, N+j, 1);
                }
            }
        }
        for (int i = 0; i < N; i++) {
            maxflow.add_edge(2*N, i, 1);
            maxflow.add_edge(N+i, 2*N+1, 1);
        }
        int ans = maxflow.max_flow(2*N, 2*N+1);
        // maxflow.print_flow();
        out.println(ans);
        out.flush();
    } 


    public static void main(String[] args){
        Main m = new Main();
        m.solve();
    }

    Main(){
        this.scan = new FastScanner();
        this.out = new PrintWriter(System.out);
    }

    private FastScanner scan;
    private PrintWriter out;
    private final int MOD = 1_000_000_007;
    private final int INF = 2_147_483_647;
    private final long LINF = 9223372036854775807L;

    // Scanner
    int ni(){ return scan.nextInt();}
    int[] ni(int n){int[] a = new int[n]; for(int i = 0; i < n; i++){a[i] = ni();} return a;}
    int[][] ni(int y, int x){int[][] a = new int[y][x];
        for(int i = 0; i < y; i++){for(int j = 0; j < x; j++){a[i][j] = ni();}} return a;}
    long nl(){return scan.nextLong();}
    long[] nl(int n){long[] a = new long[n]; for(int i = 0; i < n; i++){a[i] = nl();} return a;}
    long[][] nl(int y, int x){long[][] a = new long[y][x];
        for(int i = 0; i < y; i++){for(int j = 0; j < x; j++){a[i][j] = nl();}} return a;}
    String ns(){return scan.next();}
    String[] ns(int n){String[] a = new String[n]; for(int i = 0; i < n; i++){a[i] = ns();} return a;}
    String[][] ns(int y, int x){String[][] a = new String[y][x];
        for(int i = 0; i < y; i++){for(int j = 0; j < x; j++){a[i][j] = ns();}} return a;}
}
class MaxFlow {
    ArrayList<ArrayList<Edge>> graph;
    boolean[] used;
    public MaxFlow(int node_size){
        this.used = new boolean[node_size];
        this.graph = new ArrayList<>();
        for (int i = 0; i < node_size; i++) {
            this.graph.add(new ArrayList<>());
        }
    }
    public void add_edge(int from, int to, int cap){
        Edge F = new Edge(from, to,cap,graph.get(to).size());
        graph.get(from).add(F);
        Edge T = new Edge(to, from, 0, graph.get(from).size()-1);
        graph.get(to).add(T);
    }
    private Edge redge(Edge e){
        return this.graph.get(e.to).get(e.rev);
    }
    private int dfs(int v, int t, int f){
        if(v==t)return f;
        used[v] = true;
        for (Edge e:graph.get(v)){
            if(!used[e.to] && e.cap>0){
                int d = dfs(e.to, t, Math.min(f,e.cap));
                if(d>0){
                    e.cap -= d;
                    redge(e).cap += d;
                    return d;
                }
            }
        }
        return 0;
    }
    public int max_flow(int s, int t){
        int flow = 0;
        while(true){
            Arrays.fill(used, false);
            int f = dfs(s, t, Integer.MAX_VALUE);
            if(f==0) return flow;
            flow += f;
        }
    }
    public void print_flow(){
        for (int i = 0; i < graph.size(); i++) {
            for (Edge e : graph.get(i)) {
                System.out.println(String.format("from %d, to %d, cap %d", e.from, e.to, e.cap));
            }
        }
    }
    class Edge{
        int from;
        int to;
        int cap;
        int rev;
        public Edge(int from, int to, int cap, int rev){
            this.from = from;
            this.to = to;
            this.cap = cap;
            this.rev = rev;
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
