import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.util.function.*;
// import lib.util.*;
// import lib.graph.*;
// import lib.io.*;
// import lib.math.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        long K = sc.nextLong();
        for (int i = 0; i < Math.min(K, 1_000_000_0); i++) {
            if (s[i] == '1') {
                continue;
            } else {
                System.out.println(s[i]);
                return;
            }
        }
        System.out.println("1");
    }
}

class UnionFindTree {
    int[] root;
    int[] rank;
    int[] size;
    int m;

    public UnionFindTree(int n) {
        this.root = new int[n];
        this.rank = new int[n];
        this.size = new int[n];
        this.m = n;
        for (int i = 0; i < n; i++) {
            root[i] = i;
            size[i] = 1;
        }
    }

    public int find(int x) {
        if (root[x] == x)
            return x;
        else {
            return root[x] = find(root[x]);
        }
    }

    public void unite(int x, int y) {
        x = find(x);
        y = find(y);
        if (x == y)
            return;
        if (rank[x] < rank[y]) {
            size[find(y)] = size[find(x)];
            root[x] = y;
        } else {
            size[find(x)] = size[find(y)];
            root[y] = x;
            if (rank[x] == rank[y])
                rank[x]++;
        }
        m--;
    }

    public boolean same(int x, int y) {
        return find(x) == find(y);
    }

    public int size(int i) {
        return this.size[find(i)];
    }
}

class Dijkstra {
    private static int prev[];
    private static long dist[];

    public Dijkstra(AbstractGraph graph, int s) {
        prev = new int[graph.n];
        dist = new long[graph.n];
        Arrays.fill(prev, -1);
        Arrays.fill(dist, Long.MAX_VALUE);
        PriorityQueue<Integer> searching = new PriorityQueue<>((x, y) -> Long.compare(dist[x], dist[y]));
        dist[s] = 0;
        searching.add(s);
        while (searching.size() > 0) {
            int now = searching.poll();
            for (Edge e : graph.getEdges(now)) {
                int next = e.to;
                long c = e.cost;
                if (dist[now] + c < dist[next]) {
                    dist[next] = dist[now] + c;
                    prev[next] = now;
                    searching.add(next);
                }
            }
        }
    }

    public int[] path(int to) {
        ArrayList<Integer> rev = new ArrayList<>();
        for (int now = to; now != -1; now = this.prev[now]) {
            rev.add(now);
        }
        int[] path = new int[rev.size()];
        for (int i = 0; i < path.length; i++) {
            path[i] = rev.get(path.length - i - 1);
        }
        return path;
    }

    public long getDist(int t) {
        return dist[t];
    }
}

class WF {
    private static long[][] dist;

    public WF(AbstractGraph graph) {
        dist = new long[graph.n][graph.n];
        for (int i = 0; i < dist.length; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }
        for (int i = 0; i < graph.n; i++) {
            for (Edge e : graph.getEdges(i)) {
                dist[i][e.to] = e.cost;
            }
            dist[i][i] = 0;
        }
        for (int k = 0; k < graph.n; k++) {
            for (int i = 0; i < graph.n; i++) {
                for (int j = 0; j < graph.n; j++) {
                    if (dist[i][k] != Integer.MAX_VALUE && dist[k][j] != Integer.MAX_VALUE) {
                        dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                    }
                }
            }
        }
    }

    public static long getShortest(int s, int t) {
        return dist[s][t];
    }

    public static long[][] getAllDist() {
        return dist;
    }

    public static boolean isNegativeLoop() {
        for (int i = 0; i < dist.length; i++) {
            if (dist[i][i] < 0) {
                return true;
            }
        }
        return false;
    }
}

class Edge {
    int from, to;
    long cost;

    public Edge(int from, int to, long cost) {
        this.from = from;
        this.to = to;
        this.cost = cost;
    }

    public Edge(int from, int to) {
        this.from = from;
        this.to = to;
        this.cost = 1;
    }

    public Edge reverse() {
        return new Edge(to, from, cost);
    }
}

@SuppressWarnings("unchecked")
abstract class AbstractGraph {
    int n;
    int m;
    ArrayList<Edge>[] edges;

    public AbstractGraph(int n) {
        this.n = n;
        this.m = 0;
        this.edges = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            this.edges[i] = new ArrayList<Edge>();
        }
    }

    public void addEdge(Edge e) {
        this.m++;
        this.edges[e.from].add(e);
    }

    public int getV() {
        return this.n;
    }

    public int getE() {
        return this.m;
    }

    public ArrayList<Edge> getEdges(int v) {
        return this.edges[v];
    }

    abstract public boolean isBipartite();

    public boolean isTree() {
        // require Modifying.
        return false;
    }
}

class Graph extends AbstractGraph {
    int n;
    int m;
    // array of edges which is connect to the node
    ArrayList<Edge>[] edges;

    public Graph(int n) {
        super(n);
    }

    public void addEdge(int from, int to, int cost) {
        Edge e = new Edge(from, to, cost);
        super.addEdge(e);
        super.addEdge(e.reverse());
        this.m++;
    }

    @Override
    public void addEdge(Edge e) {
        this.edges[e.from].add(e);
        this.edges[e.to].add(e.reverse());
        this.m++;
    }

    public int getV(int v) {
        return n;
    }

    public int getE() {
        return m;
    }

    public boolean isBipartite() {
        int[] color = new int[n];
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        HashSet<Integer> visited = new HashSet<>();
        queue.add(0);
        color[0] = 1;
        while (queue.size() > 0) {
            int now = queue.poll();
            visited.add(now);
            for (Edge e : getEdges(now)) {
                if (visited.contains(e.to)) {
                    continue;
                }
                if (color[e.to] == color[now])
                    return false;
                queue.add(e.to);
                if (color[e.to] == 0)
                    color[e.to] = -1 * color[now];
            }
        }
        return true;
    }
}

class DirectedGraph extends AbstractGraph {
    private int n;
    private int m;
    private int[] ind;
    // array of edges which is connect to the node
    ArrayList<Edge>[] edges;

    public DirectedGraph(int n) {
        super(n);
        this.ind = new int[n];
    }

    public void addEdge(int from, int to, int cost) {
        Edge e = new Edge(from, to, cost);
        super.addEdge(e);
        this.m++;
        this.ind[to]++;
    }

    @Override
    public void addEdge(Edge e) {
        this.edges[e.from].add(e);
        this.m++;
        this.ind[e.to]++;
    }

    public int getV(int v) {
        return this.n;
    }

    public int getE() {
        return this.m;
    }

    public int[] getInDimension() {
        return this.ind;
    }

    public int getInDimension(int v) {
        return this.ind[v];
    }

    public boolean isBipartite() {
        // need to rewrite to work
        return false;
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
        } else {
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

    private int readByte() {
        if (hasNextByte())
            return buffer[ptr++];
        else
            return -1;
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr]))
            ptr++;
        return hasNextByte();
    }

    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext())
            throw new NoSuchElementException();
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
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }

    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}

class MyMath {
    public static long gcm(long a, long b) {

        // if (a < b)
        // return gcm(b, a);

        // if (b == 0 || a % b == 0)
        // return b;

        // return gcm(b, a % b);
        if (a < b) {
            long tmp = a;
            a = b;
            b = tmp;
        }
        long r = -1;
        while (r != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static long summation(long a, long b) {
        return b * (b + 1) / 2 - a * (a - 1) / 2;
    }

    public static long factorial(long n, long m) {

        if (n <= 1)
            return 1;
        else
            return factorial(n - 1, m) * n % m;
    }

    public static long[][] binomialTable(int a, long m) {
        long[][] table = new long[a + 1][a + 1];
        for (int i = 0; i < a + 1; i++) {
            table[0][a] = 0;
            table[i][0] = 1;
            table[i][i] = 1;
        }
        for (int i = 1; i < a + 1; i++) {
            for (int j = 1; j < a + 1; j++) {
                if (i < j)
                    table[i][j] = 0;
                else {
                    table[i][j] = (table[i - 1][j - 1] + table[i - 1][j]) % m;
                }
            }
        }
        return table;
    }

    public static long binomial(int n, int k, long m) {
        long res = 1;
        for (int l = n - k + 1; l <= n; l++) {
            res = (res % m) * (l % m) % m;
        }
        for (int r = 1; r <= k; r++) {
            res = (res % m) * modinv(r, m) % m;
        }
        return res;
    }

    public static long binomial(long[] facttable, long[] invtable, int n, int k, long m) {
        if (n < k)
            return 0;
        else
            return (facttable[n] % m * (invtable[n - k] % m) * invtable[k] % m) % m;
    }

    public static long pow(long a, long n, long p) {
        if (n == 0)
            return 1;
        if (n == 1)
            return a % p;
        if (n % 2 == 1)
            return a * pow(a, n - 1, p) % p;
        long tmp = pow(a, n / 2, p) % p;
        return tmp * tmp % p;
    }

    public static long modinv(long a, long p) {
        long b, x, u, q, abs_p, tmp;
        abs_p = Math.abs(p);
        b = p;
        x = 1;
        u = 0;
        while (b > 0) {
            q = a / b;
            tmp = u;
            u = x - q * u;
            x = tmp;
            tmp = b;
            b = a - q * b;
            a = tmp;
        }
        return (x < 0) ? abs_p + x : x;
    }

    public static Long[] eratosthenes(int n) {
        Long[] factor_table = new Long[n];
        for (long i = 1; i <= n; i++) {
            factor_table[(int) (i - 1)] = i;
        }
        for (long i = 1; i <= n; i++) {
            if (factor_table[(int) (i - 1)] == i) {
                int j = 2;
                while (i * j <= n) {
                    factor_table[(int) (i * j - 1)] = i;
                    j++;
                }
            }
        }

        return factor_table;
    }

    public static HashMap<Long, Integer> primeFactorization(long n) {
        HashMap<Long, Integer> primes = new HashMap<>();
        for (long p = 2; p * p <= n; p++) {
            int q = 0;
            while (n % p == 0) {
                n /= p;
                q++;
            }
            if (q > 0)
                primes.put(p, q);
        }
        if (n > 1)
            primes.put(n, 1);
        return primes;
    }

    public static ArrayList<Integer> divisor(int n) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                ret.add(i);
                // n=PQ+0→ PもQも約数. ただし、Q=Pは↑で登録済みなので登録しない
                if (i != n / i)
                    ret.add(n / i);
            }
        }
        return ret;
    }
}

class nextPermutation {
    public static int[] swap(int data[], int left, int right) {

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
    public static int[] reverse(int data[], int left, int right) {

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
    public static boolean findNextPermutation(int data[]) {

        // If the given dataset is empty
        // or contains only one element
        // next_permutation is not possible
        if (data.length <= 1)
            return false;

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
            return false;

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
        return true;
    }
}

class ArrayUtil {
    private static long INF = 1_000_000_000_0L;

    public static int UpperBound(long[] array, long obj) {
        int l = 0, r = array.length - 1;
        while (r - l >= 0) {
            int c = (l + r) / 2;
            if (obj < array[c]) {
                r = c - 1;
            } else {
                l = c + 1;
            }
        }
        return l;
    }

    public static int LowerBound(long[] array, long obj) {
        int l = 0, r = array.length - 1;
        while (r - l >= 0) {
            int c = (l + r) / 2;
            if (obj <= array[c]) {
                r = c - 1;
            } else {
                l = c + 1;
            }
        }
        return l;
    }

    // return the length of array's LIS
    public static int LIS(long[] array) {
        long[] dp = new long[array.length + 1];
        Arrays.fill(dp, INF);
        for (int i = 0; i < array.length; i++) {
            int idx = LowerBound(dp, array[i]);
            dp[idx] = array[i];
        }
        return LowerBound(dp, INF - 1);
    }

    public static int StrictLIS(long[] array) {
        long[] dp = new long[array.length + 1];
        Arrays.fill(dp, INF);
        for (int i = 0; i < array.length; i++) {
            int idx = UpperBound(dp, array[i]);
            dp[idx] = array[i];
        }
        return UpperBound(dp, INF - 1);
    }

    public static void debug(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class BinaryIndexedTree {
    int[] data;
    long[] tree;
    int n;

    public BinaryIndexedTree(int[] data) {
        this.data = data;
        this.n = data.length;
        this.tree = new long[n + 1];
        buildTree();
    }

    public void buildTree() {
        for (int i = 0; i < n; i++) {
            add(i + 1, data[i]);
        }
    }

    public void add(int index, int value) {
        for (int i = index; i <= n; i += i & -i) {
            tree[i] += value;
        }
    }

    public long sum(int from, int to) {
        return sum(to) - sum(from - 1);
    }

    public long sum(int index) {
        int sum = 0;
        for (int i = index; i > 0; i -= i & -i) {
            sum += tree[i];
        }
        return sum;
    }
}

class TopologicalSort {
    private DirectedGraph g;
    private int[] in;
    private int n, m;

    public TopologicalSort(DirectedGraph g) {
        this.g = g;
        this.in = g.getInDimension();
        this.n = g.getV();
        this.m = g.getE();
    }

    public int[] sort() {
        int[] ret = new int[this.n];
        ArrayDeque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < this.n; i++) {
            if (in[i] == 0) {
                q.push(i);
            }
        }
        int k = 0;
        while (q.size() > 0) {
            int v = q.pollFirst();
            ret[k] = v;
            k++;
            for (Edge e : g.getEdges(v)) {
                if (--in[e.to] == 0)
                    q.push(e.to);
            }
        }
        return ret;
    }
}