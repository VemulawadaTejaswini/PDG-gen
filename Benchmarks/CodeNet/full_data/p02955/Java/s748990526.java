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
        int K = in.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) A[i] = in.nextInt();
        int sum = Arrays.stream(A).sum();

        List<Integer> factors = factors(sum);
        int res = 1;
        int lo = 0, hi = factors.size() - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo + 1) / 2;
            int x = factors.get(mid);

            List<Integer> B = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                int a = A[i] % x;
                if (a != 0) B.add(a);
            }
            Collections.sort(B);

            int op = 0;
            for (int i = 0, j = B.size() - 1; i < j;) {
                int vi = B.get(i), vj = B.get(j);
                int y = min(vi, x - vj);
                vi -= y;
                B.set(i, vi);
                if (vi == 0) i++;
                vj += y;
                B.set(j, vj);
                if (vj == x) j--;
                op += y;
                if (op > K) break;
            }
            if (op > K) hi = mid - 1;
            else lo = mid;
        }
        out.println(factors.get(lo));
    }

    private List<Integer> factors(int x) {
        List<Integer> res = new ArrayList<>();
        res.add(1);
        if (x != 1) res.add(x);
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                res.add(i);
                if (i != x / i) res.add(x / i);
            }
        }
        Collections.sort(res);
        return res;
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
