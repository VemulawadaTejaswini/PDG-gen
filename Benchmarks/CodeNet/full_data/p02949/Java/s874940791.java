// template for atcode
import java.util.*;
import java.io.*;
import static java.lang.Math.*;
import java.util.stream.Collectors;

public class Main {

    private static final int MOD = (int)1e9 + 7; //998244353;
    // private static final long INF = (long)1e17;
    private static final int INF = (int)1e9;

    public Main(FastScanner in, PrintWriter out) {
        int N = in.nextInt();
        int M = in.nextInt();
        int P = in.nextInt();
        Edge[] E = new Edge[M];
        for (int i = 0; i < M; i++) {
            int v = in.nextInt() - 1;
            int w = in.nextInt() - 1;
            int c = in.nextInt();
            E[i] = new Edge(v, w, P - c);
        }

        // remove nodes that cannot reach target
        // O(N*M)
        Queue<Integer> q = new ArrayDeque<>();
        q.add(N - 1);
        boolean[] marked = new boolean[N];
        marked[N - 1] = true;

        while (!q.isEmpty()) {
            int w = q.remove();
            for (Edge e : E) {
                if (e.to == w && !marked[e.from]) {
                    marked[e.from] = true;
                    q.add(e.from);
                }
            }
        }

        List<Edge> ne = Arrays.stream(E)
            .filter(e -> marked[e.from] && marked[e.to])
            .collect(Collectors.toList());

        // Bellman Ford O(N*M)
        int[] dist = new int[N];
        Arrays.fill(dist, INF);
        dist[0] = 0;
        for (int i = 0; i < N - 1; i++) {
            boolean updated = false;
            for (Edge e : ne) {
                int v = e.from, w = e.to, c = e.weight;
                // do not update points not reachable from start
                // c could be negative, if we update such vertex,
                // we cannot tell at the end which vertex cannot be reached
                // such node might be in a negative cycle
                if (dist[v] == INF) continue;
                if (dist[w] > dist[v] + c) {
                    updated = true;
                    dist[w] = dist[v] + c;
                }
            }
            if (!updated) break;
        }
        for (Edge e : ne) {
            int v = e.from, w = e.to, c = e.weight;
            // dist[v] >= INF -- vertex not reachable from start
            if (dist[v] < INF && dist[v] + c < dist[w]) {
                out.println(-1);
                return;
            }
        }
        out.print(max(0, -dist[N - 1]));
    }

    class Edge {
        int from, to, weight;
        Edge(int from, int to, int weight) {
            this.from = from;
            this.to = to;
            this.weight = weight;
        }
        public String toString() {
            return String.format("(%d, %d, %d)", from, to, weight);
        }
    }

    private int gcd(int a, int b) {
        while (true) {
            if (b == 0) return a;
            int tmp = a;
            a = b;
            b = tmp % b;
        }
    }

    private long gcd(long a, long b) {
        while (true) {
            if (b == 0) return a;
            long tmp = a;
            a = b;
            b = tmp % b;
        }
    }

    private long powm(long x, long p) {
        long res = 1;
        while (p > 0) {
            if (p % 2 == 1)
                res = res * x % MOD;
            x = x * x % MOD;
            p /= 2;
        }
        return res;
    }

    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        // Scanner in = new Scanner(
                // new BufferedReader(new InputStreamReader(System.in)));
        FastScanner in = new FastScanner(System.in);

        Main sol = new Main(in, out);
        out.close();
    }
}

// Pair
class Pair<T extends Comparable<? super T>, U extends Comparable<? super U>> implements Comparable<Pair<T, U>> {
    T a;
    U b;
    Pair() { }
    Pair(T a, U b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() { return "("+a.toString()+", "+b.toString()+")"; }

    @Override
    public int hashCode() { return Objects.hash(a, b); }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;
        Pair that = (Pair) obj;
        if(this.a.getClass() != that.a.getClass()) return false;
        if(this.b.getClass() != that.b.getClass()) return false;
        if(!this.a.equals(that.a)) return false;
        if(!this.b.equals(that.b)) return false;
        return true;
    }

    @Override
    public int compareTo(Pair<T, U> that) {
        int c = (this.a).compareTo(that.a);
        if(c == 0) c = (this.b).compareTo(that.b);
        return c;
    }
}


class FastScanner{
    private InputStream stream;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;

    public FastScanner(InputStream stream)
    {
        this.stream = stream;
    }

    int read()
    {
        if (numChars == -1)
            throw new InputMismatchException();
        if (curChar >= numChars){
            curChar = 0;
            try{
                numChars = stream.read(buf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (numChars <= 0)
                return -1;
        }
        return buf[curChar++];
    }

    boolean isSpaceChar(int c)
    {
        return c==' '||c=='\n'||c=='\r'||c=='\t'||c==-1;
    }

    boolean isEndline(int c)
    {
        return c=='\n'||c=='\r'||c==-1;
    }

    int nextInt()
    {
        return Integer.parseInt(next());
    }

    long nextLong()
    {
        return Long.parseLong(next());
    }

    double nextDouble()
    {
        return Double.parseDouble(next());
    }

    String next(){
        int c = read();
        while (isSpaceChar(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do{
            res.appendCodePoint(c);
            c = read();
        }while(!isSpaceChar(c));
        return res.toString();
    }

    String nextLine(){
        int c = read();
        while (isEndline(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do{
            res.appendCodePoint(c);
            c = read();
        }while(!isEndline(c));
        return res.toString();
    }
}
