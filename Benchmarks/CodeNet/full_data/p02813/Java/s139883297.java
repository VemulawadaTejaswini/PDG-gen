



import java.io.*;
import java.math.*;
import java.util.*;
import java.lang.*;

public class Main implements Runnable {
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
            if (numChars == -1)
                throw new InputMismatchException();

            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        public int nextInt() {
            int c = read();

            while (isSpaceChar(c))
                c = read();

            int sgn = 1;

            if (c == '-') {
                sgn = -1;
                c = read();
            }

            int res = 0;
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
        new Thread(null, new Main(), "Main", 1 << 26).start();
    }

    static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    static long modPow(long a, long p, long m) {
        if (a == 1) return 1;
        long ans = 1;
        while (p > 0) {
            if (p % 2 == 1) ans = (ans * a) % m;
            a = (a * a) % m;
            p >>= 1;
        }
        return ans;
    }

    static long modInv(long a, long m) {
        return modPow(a, m - 2, m);
    }


    static class Radix {


        static int getMax(int arr[], int n) {
            int mx = arr[0];
            for (int i = 1; i < n; i++)
                if (arr[i] > mx)
                    mx = arr[i];
            return mx;
        }

        static void countSort(int arr[], int n, int exp) {
            int output[] = new int[n];
            int i;
            int count[] = new int[10];
            Arrays.fill(count, 0);

            for (i = 0; i < n; i++)
                count[(arr[i] / exp) % 10]++;

            for (i = 1; i < 10; i++)
                count[i] += count[i - 1];

            for (i = n - 1; i >= 0; i--) {
                output[count[(arr[i] / exp) % 10] - 1] = arr[i];
                count[(arr[i] / exp) % 10]--;
            }

            for (i = 0; i < n; i++)
                arr[i] = output[i];
        }

        static void radixsort(int arr[], int n) {
            int m = getMax(arr, n);

            for (int exp = 1; m / exp > 0; exp *= 10)
                countSort(arr, n, exp);
        }

    }

    class DSU {
        int par[], size[], connectedComponent;

        DSU(int n) {
            par = new int[n];
            size = new int[n];
            for (int i = 0; i < n; i++) {
                size[i] = 1;
                par[i] = i;
            }
            connectedComponent = n;
        }

        int root(int n) {
            if (n == par[n]) return n;
            return par[n] = root(par[n]);
        }

        boolean union(int u, int v) {
            return f_union(root(u), root(v));
        }

        boolean f_union(int u, int v) {
            if (u == v) return false;
            if (size[u] > size[v]) {
                size[u] += size[v];
                par[v] = u;
            } else {
                size[v] += size[u];
                par[u] = v;
            }
            connectedComponent--;
            return true;
        }

        DSU clone_DSU() {
            DSU t = new DSU(par.length);
            t.connectedComponent = connectedComponent;
            for (int i = 0; i < par.length; i++) {
                t.par[i] = par[i];
                t.size[i] = size[i];
            }
            return t;
        }
    }


    class segmentTree {
        long query(int cur, int l, int r, int start, int end, long tree[], long a[], long[] lazy) {
            if (l > end || r < start) return 0;
            if (lazy[cur] != 0) {
                tree[cur] += lazy[cur];
                if (l != r) {
                    lazy[2 * cur + 1] += lazy[cur];
                    lazy[2 * cur + 2] += lazy[cur];
                }
                lazy[cur] = 0;
            }
            if (l >= start && r <= end) return tree[cur];
            int mid = (l + r) >> 1;
            long p1 = query(2 * cur + 1, l, mid, start, end, tree, a, lazy);
            long p2 = query(2 * cur + 2, mid + 1, r, start, end, tree, a, lazy);
            return p1 + p2;
        }

        void build(int cur, int l, int r, long tree[], long a[]) {
            if (l == r) {
                tree[cur] = a[l];
                return;
            }
            int mid = (l + r) >> 1;
            build(2 * cur + 1, l, mid, tree, a);
            build(2 * cur + 2, mid + 1, r, tree, a);
            tree[cur] = tree[2 * cur + 1] + tree[2 * cur + 2];
        }

        void update(int cur, int start, int end, long val, int l, int r, long tree[], long a[], long[] lazy) {
            if (l > end || r < start) return;
            if (lazy[cur] != 0) {
                tree[cur] += (r - l + 1) * lazy[cur];
                if (l != r) {
                    lazy[2 * cur + 1] += lazy[cur];
                    lazy[2 * cur + 2] += lazy[cur];
                }
                lazy[cur] = 0;
            }
            if (l >= start && r <= end) {
                tree[cur] += (r - l + 1) * val;
                if (l != r) {
                    lazy[cur * 2 + 1] += val;
                    lazy[cur * 2 + 2] += val;
                }
                return;
            }
            int mid = (l + r) >> 1;
            update(2 * cur + 1, start, end, val, l, mid, tree, a, lazy);
            update(2 * cur + 2, start, end, val, mid + 1, r, tree, a, lazy);
            tree[cur] = tree[2 * cur + 1] + tree[2 * cur + 2];
        }
    }


    public void run() {
        InputReader sc = new InputReader(System.in);
        // Scanner sc=new Scanner(System.in);
        //  Random sc=new Random();
        PrintWriter out = new PrintWriter(System.out);

        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]=i+1;
        }
        int b[][]=new int[2][n];
        for (int i = 0; i < n; i++) {
            b[0][i]=sc.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            b[1][i]=sc.nextInt();
        }


        int ans=1;
        while (!equal(a,b[0])){
            ans++;
            a=findNextPermutation(a);
        }

        for (int i = 0; i <n ; i++) {
            a[i]=i+1;
        }
        int ans2=1;
        while (!equal(a,b[1])){
            ans2++;
            a=findNextPermutation(a);
        }
        out.println(Math.abs(ans-ans2));






        out.close();
    }

    boolean equal(int a[],int b[]){
        for (int i = 0; i <a.length ; i++) {
            if(a[i]!=b[i])return false;
        }
        return true;
    }


    public static int[] swap(int data[], int left, int right)
    {

        // Swap the data
        int temp = data[left];
        data[left] = data[right];
        data[right] = temp;

        // Return the updated array
        return data;
    }

    // Function to reverse the sub-array
    // starting from left to the right
    // both inclusive
    public static int[] reverse(int data[], int left, int right)
    {

        // Reverse the sub-array
        while (left < right) {
            int temp = data[left];
            data[left++] = data[right];
            data[right--] = temp;
        }

        // Return the updated array
        return data;
    }

    // Function to find the next permutation
    // of the given integer array
    public static int[] findNextPermutation(int data[])
    {


        // If the given dataset is empty
        // or contains only one element
        // next_permutation is not possible
        if (data.length <= 1)
            return data;

        int last = data.length - 2;

        // find the longest non-increasing suffix
        // and find the pivot
        while (last >= 0) {
            if (data[last] < data[last + 1]) {
                break;
            }
            last--;
        }

        // If there is no increasing pair
        // there is no higher order permutation
        if (last < 0)
            return new int[data.length];

        int nextGreater = data.length - 1;

        // Find the rightmost successor to the pivot
        for (int i = data.length - 1; i > last; i--) {
            if (data[i] > data[last]) {
                nextGreater = i;
                break;
            }
        }

        // Swap the successor and the pivot
        data = swap(data, nextGreater, last);

        // Reverse the suffix
        data = reverse(data, last + 1, data.length - 1);

        // Return true as the next_permutation is done
        return data;
    }

    // Driver Code



}
