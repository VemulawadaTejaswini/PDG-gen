import org.omg.PortableServer.AdapterActivator;

import java.io.*;
import java.lang.reflect.Array;
import java.net.CookieHandler;
import java.util.*;
import java.math.*;
import java.lang.*;
import java.util.concurrent.LinkedBlockingDeque;

import static java.lang.Math.*;

public class Main implements Runnable {
    long m = (int)1e9+7;
    PrintWriter w;
    ArrayList<Integer> prime;
    boolean is_prime[];
    InputReader c;

    public void run() {
        c = new InputReader(System.in);
        w = new PrintWriter(System.out);
        int n = c.nextInt();
        int a[][] = new int[n][n-1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++)
                a[i][j] = c.nextInt()-1;
        }

        int res[] = new int[n];
        int maxdays=1;
        int pointer[] = new int[n];
        int k = n*(n-1);
        HashSet<pair> hs = new HashSet<>();
        while (k>0){
            int prevk = k;
            for(int i=0;i<n;i++) {
                if(pointer[i] >= n-1) continue;
                int t = a[i][pointer[i]];
                if(i == a[t][pointer[t]]) {
                    if (res[i] != maxdays && !hs.contains(new pair(i, a[i][pointer[i]]))) {
                        if (res[a[i][pointer[i]]] != maxdays) {
                            //w.println(i+" "+a[i][pointer[i]]);
                            res[i] = maxdays;
                            res[a[i][pointer[i]]] = maxdays;
                            hs.add(new pair(i, a[i][pointer[i]]));
                            pointer[t]++;
                            pointer[i]++;
                            k--;
                        }
                    } else if (hs.contains(new pair(i, a[i][pointer[i]]))) {
                        pointer[i]++;
                    }
                }
            }
            if(prevk==k){
                boolean check = false;
                for(int i=0;i<n;i++) if(pointer[i] < n-1) check = true;
                if(check) {
                    maxdays = 0;
                }
                break;
            }
            maxdays++;
        }

        w.println(--maxdays);

        w.close();
    }
    /*Template Stuff*/
    class pair{
        int x,y;

        public pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            pair pair = (pair) o;
            return (x == pair.x && y == pair.y) || (x==pair.y && y==pair.x);
        }

        @Override
        public int hashCode() {
            return Objects.hash(x*y - (x+ y));
        }
    }
    ArrayList<Integer> getDiv(int num){
        int square_root = (int) sqrt(num) + 1;
        ArrayList<Integer>  l = new ArrayList<>();
        for (int i = 1; i < square_root; i++) {
            if (num % i == 0&&i*i!=num) {
                l.add(i);
                l.add(num / i);
            }
            if (num % i == 0&&i*i==num)
                l.add(i);
        }
        return l;
    }
    static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
    void sieve(int n) {
        is_prime = new boolean[n+10];
        prime = new ArrayList<>();
        for(int i=2;i<=n;i++)
            is_prime[i] = true;

        for (int i = 2; i <= n; ++i) {
            if (is_prime[i]) prime.add(i);
            for (int j = 0; j < prime.size () && i * prime.get(j) < n; ++j) {
                is_prime[i * prime.get(j)] = false;
                if (i % prime.get(j) == 0) break;
            }
        }
    }
    public static void sortbyColumn(int arr[][], int col){
        Arrays.sort(arr, new Comparator<int[]>()
        {
            public int compare(int[] o1, int[] o2){
                return(Integer.valueOf(o1[col]).compareTo(o2[col]));
            }
        });

    }
    public static class DJSet {
        public int[] upper;

        public DJSet(int n) {
            upper = new int[n];
            Arrays.fill(upper, -1);
        }

        public int root(int x) {
            return upper[x] < 0 ? x : (upper[x] = root(upper[x]));
        }

        public boolean equiv(int x, int y) {
            return root(x) == root(y);
        }

        public boolean union(int x, int y) {
            x = root(x);
            y = root(y);
            if (x != y) {
                if (upper[y] < upper[x]) {
                    int d = x;
                    x = y;
                    y = d;
                }
                upper[x] += upper[y];
                upper[y] = x;
            }
            return x == y;
        }
    }
    public static int[] radixSort(int[] f)    {
        int[] to = new int[f.length];
        {
            int[] b = new int[65537];
            for(int i = 0;i < f.length;i++)b[1+(f[i]&0xffff)]++;
            for(int i = 1;i <= 65536;i++)b[i]+=b[i-1];
            for(int i = 0;i < f.length;i++)to[b[f[i]&0xffff]++] = f[i];
            int[] d = f; f = to;to = d;
        }
        {
            int[] b = new int[65537];
            for(int i = 0;i < f.length;i++)b[1+(f[i]>>>16)]++;
            for(int i = 1;i <= 65536;i++)b[i]+=b[i-1];
            for(int i = 0;i < f.length;i++)to[b[f[i]>>>16]++] = f[i];
            int[] d = f; f = to;to = d;
        }
        return f;
    }
    public void printArray(int[] a){
        for(int i=0;i<a.length;i++)
            w.print(a[i]+" ");
        w.println();
    }
    public int[] scanArrayI(int n){
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i] = c.nextInt();
        return a;
    }
    public long[] scanArrayL(int n){
        long a[] = new long[n];
        for(int i=0;i<n;i++)
            a[i] = c.nextLong();
        return a;
    }
    public void printArray(long[] a){
        for(int i=0;i<a.length;i++)
            w.print(a[i]+" ");
        w.println();
    }
    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;
        private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars==-1)
                throw new InputMismatchException();

            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                }
                catch (IOException e) {
                    throw new InputMismatchException();
                }

                if(numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
        public int nextInt() {
            int c = read();

            while(isSpaceChar(c))
                c = read();

            int sgn = 1;

            if (c == '-') {
                sgn = -1;
                c = read();
            }

            int res = 0;
            do {
                if(c<'0'||c>'9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));

            return res * sgn;
        }

        public long nextLong() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;

            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));
            return res * sgn;
        }

        public double nextDouble() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            double res = 0;
            while (!isSpaceChar(c) && c != '.') {
                if (c == 'e' || c == 'E')
                    return res * Math.pow(10, nextInt());
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            if (c == '.') {
                c = read();
                double m = 1;
                while (!isSpaceChar(c)) {
                    if (c == 'e' || c == 'E')
                        return res * Math.pow(10, nextInt());
                    if (c < '0' || c > '9')
                        throw new InputMismatchException();
                    m /= 10;
                    res += (c - '0') * m;
                    c = read();
                }
            }
            return res * sgn;
        }

        public String readString() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            }
            while (!isSpaceChar(c));

            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public String next() {
            return readString();
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    }
    public static void main(String args[]) throws Exception {
        new Thread(null, new Main(),"Main",1<<26).start();
    }
}