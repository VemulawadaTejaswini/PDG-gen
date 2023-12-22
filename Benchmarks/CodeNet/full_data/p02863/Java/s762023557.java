// template for atcoder
import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {

    private static final int MOD = (int)1e9 + 7; //998244353;
    private static final long INF = (long)1e15;


    public Main(FastScanner in, PrintWriter out) {
        int N = in.nextInt();
        int T = in.nextInt();
        int[][] D = new int[N][];
        for (int i = 0; i < N; i++) {
            D[i] = new int[]{in.nextInt(), in.nextInt()};
        }
        Arrays.sort(D, Comparator.comparingInt(a -> a[0]));
        int[][] dp = new int[T][N + 1];
        for (int t = 1; t < T; t++) {
            for (int i = 1; i <= N; i++) {
                int c = D[i - 1][0], d = D[i - 1][1];
                dp[t][i] = dp[t][i - 1];
                if (t >= c)
                    dp[t][i] = Math.max(dp[t][i], dp[t - c][i - 1] + d);
            }
        }
        int res = 0, maxD = 0;
        for (int i = N; i >= 0; i--) {
            res = Math.max(res, dp[T - 1][i] + maxD);
            if (i > 0)
                maxD = Math.max(maxD, D[i - 1][1]);
        }
        out.println(res);
    }

    public void Main0(FastScanner in, PrintWriter out) {
        int N = in.nextInt();
        int T = in.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
            B[i] = in.nextInt();
        }
        int[][] dp = new int[T + 1][N + 1];
        // for (int t = 0; t <= T; t++) {
        for (int t = 1; t <= T; t++) {
            for (int i = 1; i <= N; i++) {
                // dp[t][i] = Math.max(dp[t][i], dp[t][i - 1]);
                // if (t < T) {
                    // int nt = Math.min(T, t + A[i - 1]);
                    // int d = B[i - 1];
                    // dp[nt][i] = Math.max(dp[nt][i], dp[t][i - 1] + d);
                // }
                int c = A[i - 1], d = B[i - 1];
                dp[t][i] = dp[t][i - 1];
                if (t >= c)
                    dp[t][i] = Math.max(dp[t][i], dp[t - c][i - 1] + d);
            }
        }
        int res = dp[T][N];
        for (int t = T - 1; t > 0; t--) {
            int max = 0, i = N, j = t;
            while (i > 0) {
                if (dp[j][i] == dp[j][i - 1]) {
                    max = Math.max(max, B[i - 1]);
                } else {
                    j -= A[i - 1];
                }
                i--;
            }
            res = Math.max(res, dp[t][N] + max);
        }
        out.println(res);
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
