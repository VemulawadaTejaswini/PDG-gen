import java.io.*;
import java.util.*;

public class Main implements Runnable {


    long m = (int)1e9+7;
    PrintWriter rw;
    ArrayList<Integer> prime;
    ArrayList<Integer> factors;
    boolean is_prime[];
    InputReader sc;
    public void run() {
        sc = new InputReader(System.in);
        rw = new PrintWriter(System.out);

        int n = sc.nextInt();
        int[] a = scanArrayI(n);
        HashMap<Integer,Integer> hashMap[] = new HashMap[n];
        HashMap<Integer,Integer> finalHashMap = new HashMap<>();
        for(int i = 0; i < n; i++){
            int q = a[i];
            hashMap[i] = new HashMap<>();
            for(int j = 2; j * j <= q; j++){
                int cnt = 0;
                while(q % j == 0){
                    cnt++;
                    q /= j;
                }
                if(cnt > 0){
                    hashMap[i].put(j,cnt);
                    if(finalHashMap.getOrDefault(j,0) < cnt){
                        finalHashMap.put(j,cnt);
                    }
                }
            }
            if(q != 1){
                hashMap[i].put(q,1);
                if(finalHashMap.getOrDefault(q,0) < 1){
                    finalHashMap.put(q,1);
                }
            }
        }

        long lcm = 1;
        for(Map.Entry<Integer,Integer> entry: finalHashMap.entrySet()){
            lcm *= power(entry.getKey(), entry.getValue(), m);
            lcm %= m;
        }
        long ans = 0;
        for(int i = 0; i < n; i++){
            ans += lcm * modInverse(a[i],m);
            ans %= m;
        }

        rw.println(ans);
        rw.close();
    }

    public static long modInverse(long a, long m) {
        return power(a, m - 2, m);
    }

    public static long power(long x, long y, long p) {
        long res = 1;
        x = x % p;
        while (y > 0) {
            if ((y & 1) == 1) {
                res = (res * x) % p;
            }
            y = y >> 1;
            x = (x * x) % p;
        }
        return res;
    }

    private static int maxIndex(List<Integer> list) {
        Integer i=0, maxIndex=-1, max=null;
        for (Integer x : list) {
            if ((x!=null) && ((max==null) || (x>max))) {
                max = x;
                maxIndex = i;
            }
            i++;
        }
        return maxIndex;
    }

    public void factor(int n){
        factors = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                factors.add(i);
            }
        }
    }

    public void merge(int[] left, int[] right, int[] a){
        int nLeft = left.length;
        int nRight = right.length;
        int i = 0, j = 0, k = 0;
        while(i < nLeft && j < nRight) {
            if (left[i] <= right[j]) {
                a[k] = left[i];
                k++;
                i++;
            } else {
                a[k] = right[j];
                k++;
                j++;
            }
        }
        while (i < nLeft) {
            a[k] = left[i];
            i++;
            k++;
        }
        while (j < nRight) {
            a[k] = right[j];
            j++;
            k++;
        }
    }

    public void mergeSort(int[] a){
        int n = a.length;
        if(n < 2){
            return;
        }
        int mid = n/2;
        int[] left = new int[mid];
        int[] right = new int[n-mid];
        for(int i = 0; i < mid; i++){
            left[i] = a[i];
        }
        for(int i = mid; i < n; i++){
            right[i-mid] = a[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(left,right,a);
    }

    static int smallest(int[] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    static int largest(int[] arr) {
        int i;
        int max = arr[0];
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
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
            rw.print(a[i]+" ");
        rw.println();
    }
    public int[] scanArrayI(int n){
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        return a;
    }

    public int[][] scan2dArrayI(int n, int m){
        int [][] a = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                a[i][j] = sc.nextInt();
            }
        }
        return  a;
    }
    public void print2dArrayI(int[][] a){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                rw.print(a[i][j] + " ");
            }
            rw.println();
        }
    }
    public long[] scanArrayL(int n){
        long[] a = new long[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextLong();
        return a;
    }
    public void printArray(long[] a){
        for(int i=0;i<a.length;i++)
            rw.print(a[i]+" ");
        rw.println();
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
