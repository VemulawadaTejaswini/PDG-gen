
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Main {

    public Main() throws IOException {
    }

    public static void main(String[] args) throws IOException {
        new Main().solve();
    }

    //    private final InputStream in = Files.newInputStream(Paths.get("C:\\Users\\ryo.suzuki\\Downloads\\02.txt"));
    private final InputStream in = System.in;
    private final PrintWriter out = new PrintWriter(System.out);
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private void solve() throws IOException {
        try {
//            solveA();
//            solveB();
            solveB2();
//            solveC();
//            solveD();
//            solveE();
//            solveF();
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.flush();
                out.close();
            }
        }

    }

    // mods
    long MOD = (long) Math.pow(10, 9) + 7;

    /**
     * https://atcoder.jp/contests/abc086/tasks/abc086_a
     * A - Product
     */
    private void solveA() {
        int a = nextInt();
        int b = nextInt();
        out.println((a * b) % 2 == 0 ? "Even" : "Odd");
    }

    /**
     * https://atcoder.jp/contests/abc145/tasks/abc145_c
     * C - Average Length
     */
    private void solveB2() {
        int n = nextInt();
        int[][] xy = IntStream.range(0, n).mapToObj(i -> new int[]{nextInt(), nextInt()}).toArray(int[][]::new);
        double res = dfs2(n, 0, xy, new boolean[n], -1, 0.0);
        out.println(res / total);
    }

    private int total = 0;

    /**
     * 1->2->3->4
     * 1->2->4->3
     * @param n
     * @param visitedCnt
     * @param xy
     * @param visited
     * @param prevIndex
     * @param wk
     * @return
     */
    private double dfs2(int n, int visitedCnt, int[][] xy, boolean[] visited, int prevIndex, double wk) {
        if (visitedCnt >= n) {
            total++;
            return wk;
        }
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            if (visited[i])
                continue;
            visited[i] = true;
            double wkTotal = wk;
            /*
             * wkTotal += Math.sqrt(Math.pow(xy[prevIndex][0] - xy[i][0], 2) + Math.pow(xy[prevIndex][1] - xy[i][1], 2));
             * 上記のwkTotalをsumにしてしまうと、
             * 1->2->3->4
             * 1->2->4->3
             * 例えば、↑のような状況で、
             * 1->2の距離+3->4の距離+4->3の距離しか足されない。
             * 本来なら、
             * 1->2の距離+3->4の距離+1->2の距離+4->3の距離
             * という形で、1->2の距離は2回足される必要がある
             */
            if (visitedCnt != 0)
                wkTotal += Math.sqrt(Math.pow(xy[prevIndex][0] - xy[i][0], 2) + Math.pow(xy[prevIndex][1] - xy[i][1], 2));
            sum += dfs2(n, visitedCnt + 1, xy, visited, i, wkTotal);
            visited[i] = false;
        }
        return sum;
    }

    private void solveB() {
        int n = nextInt();
        int[][] xy = IntStream.range(0, n).mapToObj(i -> new int[]{nextInt(), nextInt()}).toArray(int[][]::new);
        double res = permutation(n, 0, xy, new boolean[n], 0, 0);
        out.println(res / totalPerm);
    }

    int totalPerm = 0;

    private double permutation(int n, int baseIdx, int[][] xy, boolean[] visited, double total, int vn) {
        if (vn >= n) {
            totalPerm++;
            return total;
        }
        double sum = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i])
                continue;
            double wkTotal = total;
            if (vn != 0)
                wkTotal += Math.sqrt(Math.pow(xy[baseIdx][0] - xy[i][0], 2) + Math.pow(xy[baseIdx][1] - xy[i][1], 2));
            visited[i] = true;
            sum += permutation(n, i, xy, visited, wkTotal, vn + 1);
            visited[i] = false;
            if (vn == 0)
                out.println(i + " / " + sum);
        }
        return sum;
    }

    /**
     * https://atcoder.jp/contests/abc073/tasks/abc073_c
     * C - Write and Erase
     */
    private void solveC() {
        int n = nextInt();
        Set<Long> wkSet = new HashSet<Long>();
        for (int i = 0; i < n; i++) {
            long key = nextLong();
            if (wkSet.contains(key))
                wkSet.remove(key);
            else
                wkSet.add(key);
        }
        out.println(wkSet.size());

    }

    private void solveD() {

    }

    /**
     * https://atcoder.jp/contests/abc087/submissions/11443528
     */
    private void solveE() {
        int n = nextInt();
        int m = nextInt();
        if (m == 0) {
            out.println("Yes");
            return;
        }
        int[][] lr = IntStream.range(0, m).mapToObj(i -> new int[]{nextInt(), nextInt(), nextInt()}).toArray(int[][]::new);
        Map<Integer, Map<Integer, Integer>> graph = new HashMap<Integer, Map<Integer, Integer>>();
        for (int[] item : lr) {
            int from = item[0] - 1;
            int to = item[1] - 1;
            int dist = item[2];
            graph.put(from, graph.getOrDefault(from, new HashMap<Integer, Integer>()));
            graph.put(to, graph.getOrDefault(to, new HashMap<Integer, Integer>()));
            if (graph.get(from).containsKey(to) && graph.get(from).get(to) != dist) {
                out.println("No");
                return;
            }
            graph.get(from).put(to, dist);
            graph.get(to).put(from, -dist);
        }
        boolean[] visited = new boolean[n];
        int[] dist = new int[n];
        for (int i = 1; i <= n; i++) {
            if (visited[i - 1])
                continue;
            Queue<Integer> queue = new ArrayDeque<Integer>();
            queue.add(i - 1);
            while (!queue.isEmpty()) {
                int cnt = queue.size();
                for (int j = 0; j < cnt; j++) {
                    int from = queue.poll();
                    Map<Integer, Integer> childs = graph.getOrDefault(from, new HashMap<Integer, Integer>());
                    for (Map.Entry<Integer, Integer> item : childs.entrySet()) {
                        if (visited[item.getKey()]) {
                            if (dist[from] + item.getValue() != dist[item.getKey()]) {
                                out.println("No");
                                return;
                            }
                        } else {
                            visited[item.getKey()] = true;
                            dist[item.getKey()] = dist[from] + item.getValue();
                            queue.add(item.getKey());
                        }
                    }
                }
            }
        }
        out.println("Yes");
    }

    private void solveF() {

    }

    static final long CONST_INF = Long.MAX_VALUE / 4;


    private static class VectorCalculation {
        /**
         * 点Pと線(AB)の距離
         *
         * @param p
         * @param a
         * @param b
         * @return
         */
        private double distanceDotAndLine(DoublePair p, DoublePair a, DoublePair b) {
            DoublePair ab = new DoublePair(b.x - a.x, b.y - a.y);
            DoublePair ap = new DoublePair(p.x - a.x, p.y - a.y);

            // ベクトルAB、APの外積の絶対値が平行四辺形Dの面積になる
            double d = Math.abs(crossVector(ab, ap));

            double l = distanceVertex(a, b); // AB間の距離

            double h = d / l;
            return h;
        }

        /**
         * 2点間距離
         *
         * @param p1
         * @param p2
         * @return
         */
        private double distanceVertex(DoublePair p1, DoublePair p2) {
            double dx = p1.x - p2.x;
            double dy = p1.y - p2.y;
            return Math.sqrt(dx * dx + dy * dy);
        }

        /**
         * ベクトル外積
         *
         * @param vl
         * @param vr
         * @return
         */
        private double crossVector(DoublePair vl, DoublePair vr) {
            return vl.x * vr.y - vl.y * vr.x;
        }
    }

    private static class DoublePair implements Comparable<DoublePair> {
        double x;
        double y;

        public DoublePair(double k, double v) {
            this.x = k;
            this.y = v;
        }

        public int compareTo(DoublePair pair) {
            return Double.compare(this.y, pair.y);
        }
    }

    private static class SimplePair implements Comparable<SimplePair> {
        long k;
        long v;

        public SimplePair(int k, int v) {
            this.k = k;
            this.v = v;
        }

        public SimplePair(long k, long v) {
            this.k = k;
            this.v = v;
        }

        public int compareTo(SimplePair pair) {
            return Long.compare(this.v, pair.v);
        }
    }


    private static class SimpleGraphNode {
        private int n;
        private Map<Integer, Integer> childs;

        public SimpleGraphNode(int n) {
            this.n = n;
            childs = new HashMap<Integer, Integer>();
        }

        public void addChild(int child, int d) {
            this.childs.put(child, d);
        }
    }

    private static class SimpleGraph {

        private Map<Integer, SimpleGraphNode> graph;

        public SimpleGraph(int[][] list) {
            graph = new HashMap<Integer, SimpleGraphNode>();
            Arrays.stream(list).forEach(l -> {
                int a = l[0];
                int b = l[1];
                int d = l[2];
                graph.put(a, graph.getOrDefault(a, new SimpleGraphNode(a)));
                graph.get(a).addChild(b, d);
                graph.put(b, graph.getOrDefault(b, new SimpleGraphNode(b)));
                graph.get(b).addChild(a, d);
            });
        }

        public SimpleGraphNode getNode(int i) {
            return graph.getOrDefault(i, new SimpleGraphNode(-1));
        }

    }

    private static class GraphNode {
        private long n;
        private Map<Long, SimplePair> childs;

        public GraphNode(long n) {
            this.n = n;
            childs = new TreeMap<Long, SimplePair>();
        }

        /**
         * not update
         *
         * @param child
         * @param d
         */
        public void addChild(long child, long d) {
            this.childs.put(child, this.childs.getOrDefault(child, new SimplePair(child, d)));
        }

        public SimplePair getChild(long child) {
            return this.childs.getOrDefault(child, new SimplePair(child, CONST_INF));
        }
    }

    private static class Graph {

        private Map<Long, GraphNode> graph;
        int n;

        /**
         * @param n    頂点数
         * @param list
         */
        public Graph(int n, int[][] list) {
            this.n = n;
            graph = new HashMap<Long, GraphNode>();
            /*
            隣接行列作成
            0-indexed
             */
            Arrays.stream(list).forEach(l -> {
                long a = l[0] - 1;
                long b = l[1] - 1;
                long d = l[2];
                graph.put(a, graph.getOrDefault(a, new GraphNode(a)));
                graph.get(a).addChild(b, d);
                graph.put(b, graph.getOrDefault(b, new GraphNode(b)));
                graph.get(b).addChild(a, d);
            });
            /*
            たどり着けない場所はCONST_INFで埋める
            自分へはCOST=0でたどり着ける
             */
            for (long i = 0; i < n; i++) {
                graph.put(i, graph.getOrDefault(i, new GraphNode(i)));
                GraphNode node = graph.get(i);
                for (int j = 0; j < n; j++) {
                    if (i == j)
                        node.addChild(j, 0L);
                    else
                        node.addChild(j, CONST_INF);
                }
            }
        }

        /**
         * ワーシャルフロイド
         */
        public void warshallFloyd() {
            for (long k = 0; k < n; k++) {
                for (long i = 0; i < n; i++) {
                    for (long j = 0; j < n; j++) {
                        long min = Math.min(graph.get(i).getChild(j).v, graph.get(i).getChild(k).v + graph.get(k).getChild(j).v);
                        graph.get(i).getChild(j).v = min;
                    }
                }
            }
        }

        public void partialUpdateAndWarshallFloyd(long x, long y, long w) {
            if (graph.get(x).getChild(y).v > w)
                graph.get(x).getChild(y).v = graph.get(y).getChild(x).v = w;
            long[] l = {x, y};
            for (long k : l) {
                for (long i = 0; i < n; i++) {
                    for (long j = 0; j < n; j++) {
                        if (graph.get(i).getChild(j).v > graph.get(i).getChild(k).v + graph.get(k).getChild(j).v) {
                            graph.get(i).getChild(j).v = graph.get(i).getChild(k).v + graph.get(k).getChild(j).v;
                        }
                    }
                }
            }
        }

        /**
         * 2点間の距離
         *
         * @param from
         * @param to
         * @return
         */
        public long getDistance(long from, long to) {
            return graph.get(from).getChild(to).v;
        }

    }

    public long calcSimpleCombination(long n, long m, long CONST_MOD) {
        long mole = 1;
        for (long i = 1; i <= n + m; i++) {
            mole *= i;
            mole %= CONST_MOD;
        }
        long deno = 1;
        for (long i = 1; i <= n; i++) {
            deno *= i;
            deno %= CONST_MOD;
        }
        for (int i = 1; i <= m; i++) {
            deno *= i;
            deno %= CONST_MOD;
        }
        deno = modInverse(deno, CONST_MOD);
        return (mole * deno) % CONST_MOD;
    }

    long abs(double x) {
        return (long) Math.abs(x);
    }

    long round(double x) {
        return Math.round(x);
    }

    long floor(double x) {
        return (long) Math.floor(x);
    }

    long ceil(double x) {
        return (long) Math.ceil(x);
    }

    double sqrt(double x) {
        return Math.sqrt(x);
    }

    double pow(double x, double y) {
        return Math.pow(x, y);
    }

    long pow(long x, long y) {
        return (long) Math.pow(x, y);
    }

    int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    public long lcmMod(long... ab) {

        Map<Long, Long> ps = new HashMap<Long, Long>();

        for (int abl = 0; abl < ab.length; abl++) {
            long target = ab[abl];
            long l = target;
            for (long p = 2; p * p <= l; p++) {
                long cnt = 0;
                while (target > 1 && target % p == 0) {
                    cnt++;
                    target /= p;
                }
                if (cnt == 0)
                    continue;
                ps.put(p, Long.max(cnt, ps.getOrDefault(p, 0L)));
            }
            if (target > 1)
                ps.put(target, Long.max(1, ps.getOrDefault(target, 0L)));
        }
        long res = 1L;
        for (Map.Entry<Long, Long> e : ps.entrySet()) {
            res *= powMod(e.getKey(), e.getValue());
            res %= MOD;
        }
        return res;
    }

    int upperToInt(char a) {
        return a - 'A';
    }

    int lowerToInt(char a) {
        return a - 'a';
    }

    int numToInt(char a) {
        return a - '0';
    }

    int charToInt(char a) {
        return a >= 'a' ? lowerToInt(a) : a >= 'A' ? upperToInt(a) : numToInt(a);
    }

    char intToUpper(int a) {
        return (char) (a + 'A');
    }

    char intToLower(int a) {
        return (char) (a + 'a');
    }

    char intToNum(int a) {
        return (char) (a + '0');
    }

    void reverse(String array[]) {
        String reversed[] = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[array.length - i - 1] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = reversed[i];
        }
    }

    void reverse(int array[]) {
        int reversed[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[array.length - i - 1] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = reversed[i];
        }
    }

    void reverse(long array[]) {
        long reversed[] = new long[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[array.length - i - 1] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = reversed[i];
        }
    }

    void reverse(double array[]) {
        double reversed[] = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[array.length - i - 1] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = reversed[i];
        }
    }

    void reverse(boolean array[]) {
        boolean reversed[] = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[array.length - i - 1] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = reversed[i];
        }
    }

    void fill(int array[][], int x) {
        for (int a[] : array) {
            Arrays.fill(a, x);
        }
    }

    void fill(long array[][], long x) {
        for (long a[] : array) {
            Arrays.fill(a, x);
        }
    }

    void fill(double array[][], double x) {
        for (double a[] : array) {
            Arrays.fill(a, x);
        }
    }

    void fill(boolean array[][], boolean x) {
        for (boolean a[] : array) {
            Arrays.fill(a, x);
        }
    }

    void fill(int array[][][], int x) {
        for (int a[][] : array) {
            fill(a, x);
        }
    }

    void fill(long array[][][], long x) {
        for (long a[][] : array) {
            fill(a, x);
        }
    }

    void fill(double array[][][], double x) {
        for (double a[][] : array) {
            fill(a, x);
        }
    }

    void fill(boolean array[][][], boolean x) {
        for (boolean a[][] : array) {
            fill(a, x);
        }
    }

    long L_INF = (long) 1e18 + 7;

    boolean isINF(long a) {
        return abs(a) > L_INF / 1000;
    }

    boolean isPlusINF(long a) {
        return a > 0 && isINF(a);
    }

    boolean isMinusINF(long a) {
        return isPlusINF(-a);
    }

    int I_INF = (int) 1e9 + 7;

    boolean isINF(int a) {
        return abs(a) > I_INF / 1000;
    }

    boolean isPlusINF(int a) {
        return a > 0 && isINF(a);
    }

    boolean isMinusINF(int a) {
        return isPlusINF(-a);
    }

    /**
     * 指定したx以下の素数をリストアップする
     */
    public long[] getPrimesUnderX(long x) {
        return LongStream.rangeClosed(2, x)
                .filter(i -> LongStream.rangeClosed(2, (long) Math.sqrt(i)).allMatch(j -> i % j != 0)).toArray();
    }


    public long mod(long i) {
        return i % MOD + ((i % MOD) < 0 ? MOD : 0);
    }

    long powMod(long x, long y) {
        if (y == 0) {
            return 1;
        } else {
            long tmp = powMod(x, y / 2);
            return mod(mod(tmp * tmp) * (y % 2 == 0 ? 1 : x));
        }
    }

    long inv(long x) {
        return powMod(x, MOD - 2);
    }

    int MAX_FACT = 5_000_100;
    long fact[];
    long invFact[];

    /**
     * Combination簡易版
     * 5 C 2
     * 異なる n個のものから r個を選ぶ組み合わせの総数 nCr を求めます。
     * 5!(5*4*3*2*1)
     * /
     * 2!(2*1) *  (5-2)!(3*2*1)
     *
     * @param n
     * @param r
     * @return
     */
    private long getComb(int n, int r) {
        long tmp = 1;
        for (int i = 1; i <= r; i++) {
            tmp *= n - i + 1;
            tmp = mod(tmp);
            tmp *= inv(i);
            tmp = mod(tmp);
        }
        return tmp;
    }

    /**
     * 階乗計算の事前累積和
     * [1, 1, 2, 3, 4, 5, … FACTORIAL_NUM]
     * mod済
     */
    void prepareFact() {
        fact = new long[MAX_FACT];
        Arrays.fill(fact, 0);
        invFact = new long[MAX_FACT];
        Arrays.fill(invFact, 0);
        fact[0] = 1;
        int maxIndex = (int) min(MAX_FACT, (int) MOD);
        for (int i = 1; i < maxIndex; i++) {
            fact[i] = mod(fact[i - 1] * i);
        }
        invFact[maxIndex - 1] = inv(fact[maxIndex - 1]);
        for (int i = maxIndex - 1; i > 0; i--) {
            invFact[i - 1] = mod(invFact[i] * i);
        }
    }

    /**
     * 順列
     * nPk -> n! / (n-k)!
     *
     * @param n
     * @param r
     * @return
     */
    long dfs2(int n, int r) {
        if (n < 0 || r < 0 || n < r) {
            return 0;
        }
        return mod(fact[n] * invFact[n - r]);
    }

    /**
     * 組み合わせ
     * nCk -> n! / k!・(n-k)!
     *
     * @param n
     * @param r
     * @return
     */
    long combination(int n, int r) {
        if (n < 0 || r < 0 || n < r) {
            return 0;
        }
        return mod(dfs2(n, r) * invFact[r]);
    }

    /**
     * 重複組合せ nHr （同次積）
     * nHr = (n+r-1)Cr
     * 異なるn個のものから重複を許してr個取る組合せの総数
     * 例：
     * リンゴ，ミカン，牛肉の3種類の果物があります．これらの中から6個の食材を買って帰ります．
     * このとき，何通りの買い方がありますか？ただし，含まれない食材があってもよいものとします
     *
     * @param n
     * @param r
     * @return
     */
    long homogeneousProduct(int n, int r) {
        return combination((n - 1) + r, r);
    }

    /**
     * 多項係数
     * 文字aをp個,bをq個,cをr個, dをs個 あわせてn個を1列に並べるときの並べ方
     * n! / p!・q!・r!・s!
     *
     * @param n
     * @param strNum
     * @param mod
     * @return
     */

    /**
     * フェルマーの小定理を用いて逆元を求める。
     * ある数xのmod p（pは素数）の逆数x'はx' = x^(p-2)
     * 繰り返し二乗法を用いて計算する。
     * http://satanic0258.hatenablog.com/entry/2016/04/29/004730
     * {@link BigInteger#modInverse(BigInteger)}とどちらが速いか？
     *
     * @param x
     * @return
     */
    private long modInverse(long x, long mod) {
        long res = 1L;
        long k = mod - 2L;
        long y = x;
        while (k != 0) {
            if (k % 2 != 0) {
                res = (res * y) % mod;
            }
            y = (y * y) % mod;
            k /= 2;
        }
        return res;
    }

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

    private void skipUnprintable() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr]))
            ptr++;
    }

    public boolean hasNext() {
        skipUnprintable();
        return hasNextByte();
    }

    public int nextInt() {
        return Integer.parseInt(next());
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

    public long min(long... v) {
        long min = Long.MAX_VALUE;
        for (long i : v) min = Math.min(min, i);
        return min;
    }

    public long max(long... v) {
        long max = Long.MIN_VALUE;
        for (long i : v) max = Math.max(max, i);
        return max;
    }
}
