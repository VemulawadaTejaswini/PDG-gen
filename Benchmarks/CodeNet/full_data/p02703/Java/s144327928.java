import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {

    private static final int MOD = 998244353;
    private static final long INF = (long)1e18;
    private int N, M, S;
    private int[][] A, B;
    private int[] C, D;
    private int amax, limit;

    public Main(FastScanner in, PrintWriter out) {
        N = in.nextInt();
        M = in.nextInt();
        S = in.nextInt();

        A = new int[N][N];
        B = new int[N][N];
        amax = 0;
        for (int i = 0; i < M; i++) {
            int u = in.nextInt() - 1;
            int v = in.nextInt() - 1;
            int a = in.nextInt();
            int b = in.nextInt();
            A[u][v] = a;
            A[v][u] = a;
            B[u][v] = b;
            B[v][u] = b;
            amax = Math.max(amax, a);
        }
        limit = amax * (N - 1);

        C = new int[N];
        D = new int[N];
        for (int i = 0; i < N; i++) {
            C[i] = in.nextInt();
            D[i] = in.nextInt();
        }

        S = Math.min(S, limit);
        long[][] time = new long[N][limit + 1];
        for (int i = 0; i < N; i++)
            Arrays.fill(time[i], INF);
        time[0][S] = 0;
        PriorityQueue<State> q = new PriorityQueue<>();
        q.add(new State(0, 0L, S));

        long[] res = new long[N];
        while (!q.isEmpty()) {
            State cur = q.remove();
            int u = cur.u;

            // already processed this state -- vertex u, with cur.silver
            if (time[u][cur.silver] < cur.time)
                continue;

            if (res[u] == 0) {
                res[u] = cur.time;
            }

            for (int v = 0; v < N; v++) {
                if (A[u][v] == 0) continue;
                long cost = B[u][v] + cur.time;
                int coin = cur.silver;
                while (true) {
                    coin = Math.min(limit, coin);
                    if (coin >= A[u][v] && time[v][coin - A[u][v]] > cost) {
                        time[v][coin - A[u][v]] = cost;
                        q.add(new State(v, cost, coin - A[u][v]));
                    }

                    if (coin == limit)
                        break;

                    coin += C[u];
                    cost += D[u];
                }
            }
        }
        for (int i = 1; i < N; i++)
            out.println(res[i]);
        out.flush();
    }

    private static class State implements Comparable<State> {
        long time;
        int silver;
        int u;
        State(int u, long time, int silver) {
            this.time = time;
            this.silver = silver;
            this.u = u;
        }

        public int compareTo(State other) {
            return Long.compare(this.time, other.time);
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
