
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        new Main().solve();
    }

    private void solve() throws IOException {
        try {
//            solveA();
//            solveB();
//            solveC();
            solveD();
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

    private void solveA() {
        int n = nextInt();
        out.println(n / 2 + n % 2);
    }

    private void solveB() {
        int[][] card = IntStream.range(0, 3).mapToObj(i -> new int[]{nextInt(), nextInt(), nextInt()}).toArray(int[][]::new);
        int n = nextInt();
        int[] b = IntStream.range(0, n).map(i -> nextInt()).toArray();
        Arrays.stream(b).forEach(
                x -> {
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            if (card[i][j] == x)
                                card[i][j] = -1;
                        }
                    }
                }
        );
        boolean isComplete =
                card[0][0] == -1 && card[0][1] == -1 && card[0][2] == -1
                        || card[1][0] == -1 && card[1][1] == -1 && card[1][2] == -1
                        || card[2][0] == -1 && card[2][1] == -1 && card[2][2] == -1
                        || card[0][0] == -1 && card[1][1] == -1 && card[2][2] == -1
                        || card[0][2] == -1 && card[1][1] == -1 && card[2][0] == -1;
        out.println(isComplete ? "Yes" : "No");
    }

    private void solveC() {
        int n = nextInt();
        int m = nextInt();
        int[][] sc = Stream.generate(() -> new int[]{nextInt(), nextInt()}).limit(m).toArray(int[][]::new);
        Arrays.sort(sc, (x, y) -> Integer.compare(x[0], y[0]) == 0 ? Integer.compare(x[1], y[1]) : Integer.compare(x[0], y[0]));
        int[] res = new int[n];
        for (int[] item : sc) {
            int idx = item[0] - 1;
            if (res[idx] == 0) {
                res[idx] = item[1];
            }
        }
        String wk = Arrays.stream(res).mapToObj(i -> Integer.toString(i)).collect(Collectors.joining(""));
        if (n == 1 || res[0] != 0)
            out.println(wk);
        else
            out.println(-1);
    }

    private void solveD() {
        int n = nextInt();
        int m = nextInt();
        int k = nextInt();
        Map<Integer, Person> friendsMap = new HashMap<Integer, Person>();
        UnionFind unionFind = new UnionFind(n);
        for (int i = 0; i < m; i++) {
            int a = nextInt();
            int b = nextInt();
            if (!friendsMap.containsKey(a))
                friendsMap.put(a, new Person(a));
            friendsMap.get(a).friends.add(b);
            if (!friendsMap.containsKey(b))
                friendsMap.put(b, new Person(b));
            friendsMap.get(b).friends.add(a);
            unionFind.unite(a, b);
        }
        Map<Integer, Person> blockMap = new HashMap<Integer, Person>();
        for (int i = 0; i < k; i++) {
            int c = nextInt();
            int d = nextInt();
            if (!blockMap.containsKey(c))
                blockMap.put(c, new Person(c));
            blockMap.get(c).friends.add(d);
            if (!blockMap.containsKey(d))
                blockMap.put(d, new Person(d));
            blockMap.get(d).friends.add(c);
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            int num = 0;
            Person fPerson = friendsMap.getOrDefault(i, new Person(i));
            Person bPerson = blockMap.getOrDefault(i, new Person(i));
//            for (int j = 1; j <= n; j++) {
//                if (i != j && !fPerson.friends.contains(j) && !bPerson.friends.contains(j) && unionFind.isSame(i, j))
//                    num++;
//            }
            num = unionFind.getSize(i) - 1 - fPerson.friends.size();
            for (int fn : bPerson.friends) {
                if (unionFind.isSame(i, fn))
                    num--;
            }
            builder.append(num).append(" ");
        }
        out.println(builder.toString());
    }

    private class UnionFind {
        int[] pars;

        public UnionFind(int n) {
            pars = new int[n + 1];
            Arrays.fill(pars, -1);
        }

        public int getChilds(int n) {
            int wk = getRoot(n);
            return pars[wk];
        }

        public int getRoot(int n) {
            if (pars[n] < 0)
                return n;
            return pars[n] = getRoot(pars[n]);
        }

        public boolean isSame(int a, int b) {
            return getRoot(a) == getRoot(b);
        }

        private int getSize(int a) {
            return -pars[getRoot(a)];
        }

        public void unite(int a, int b) {
            int wkA = getRoot(a);
            int wkB = getRoot(b);
            if (wkA == wkB)
                return;

            if (getSize(wkA) < getSize(wkB)) {
                int tmp = wkA;
                wkA = wkB;
                wkB = tmp;
            }
            pars[wkA] = pars[wkA] + pars[wkB];
            pars[wkB] = wkA;
        }
    }

    private void solveDold() {

        int n = nextInt();
        int m = nextInt();
        int k = nextInt();
        Map<Integer, Person> friendsMap = new HashMap<Integer, Person>();
        for (int i = 0; i < m; i++) {
            int a = nextInt();
            int b = nextInt();
            friendsMap.putIfAbsent(a, new Person(a));
            friendsMap.get(a).friends.add(b);
            friendsMap.putIfAbsent(b, new Person(b));
            friendsMap.get(b).friends.add(a);
        }
        Map<Integer, Person> blockMap = new HashMap<Integer, Person>();
        for (int i = 0; i < k; i++) {
            int c = nextInt();
            int d = nextInt();
            blockMap.putIfAbsent(c, new Person(c));
            blockMap.get(c).friends.add(d);
            blockMap.putIfAbsent(d, new Person(d));
            blockMap.get(d).friends.add(c);
        }

        StringBuilder builder = new StringBuilder();
//        for (int i = 1; i <= n; i++) {
//            Person fPerson = friendsMap.getOrDefault(i, new Person(i));
//            Person bPerson = blockMap.getOrDefault(i, new Person(i));
//            int num = 0;
//            for (int j = 1; j <= n; j++) {
//                if (i == j)
//                    continue;
//                if (!fPerson.friends.contains(j) && !bPerson.friends.contains(j)
//                        && friendMap.getOrDefault(i, new HashSet<Integer>()).contains(j)) {
//                    num++;
//                }
//            }
//            builder.append(num).append(" ");
//        }

        HashMap<Integer, HashSet<Integer>> friendMap = makeFriendMap(n, friendsMap);
        for (int i = 1; i <= n; i++) {
            Person fPerson = friendsMap.getOrDefault(i, new Person(i));
            Person bPerson = blockMap.getOrDefault(i, new Person(i));
            HashSet<Integer> memo = friendMap.getOrDefault(i, new HashSet<Integer>());
            int num = 0;
            for (int p : memo) {
                if (!fPerson.friends.contains(p) && !bPerson.friends.contains(p)) {
                    num++;
                }
            }
            builder.append(num).append(" ");
        }
        out.println(builder.toString());
    }

    private HashMap<Integer, HashSet<Integer>> makeFriendMap(int n, Map<Integer, Person> map) {
        HashMap<Integer, HashSet<Integer>> memo = new HashMap<Integer, HashSet<Integer>>();
        for (int j = 1; j <= n; j++) {
            HashSet<Integer> visited = new HashSet<Integer>();
            memo.put(j, visited);
            visited.add(j);
            Queue<Person> queue = new ArrayDeque<Person>();
            queue.add(map.getOrDefault(j, new Person(-1)));

            while (queue.size() != 0) {
                int count = queue.size();
                for (int i = 0; i < count; i++) {
                    Person inner = queue.poll();
                    visited.add(inner.n);
                    for (int p : inner.friends) {
                        if (p != j && memo.containsKey(p)) {
                            visited.add(p);
                            visited.addAll(memo.get(p));
                            continue;
                        }
                        if (!visited.contains(p))
                            queue.add(map.get(p));
                    }
                }
            }
            visited.remove(j);
        }
        return memo;
    }

    private static class Person {
        private int n;
        private Set<Integer> friends;

        public Person(int n) {
            this.n = n;
            this.friends = new HashSet<>();
        }

        public void addFriends(int f) {
            friends.add(f);
        }
    }

    private void solveE() {

    }

    private void solveF() {

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

    void fill(int array[], int x) {
        Arrays.fill(array, x);
    }

    void fill(long array[], long x) {
        Arrays.fill(array, x);
    }

    void fill(double array[], double x) {
        Arrays.fill(array, x);
    }

    void fill(boolean array[], boolean x) {
        Arrays.fill(array, x);
    }

    void fill(int array[][], int x) {
        for (int a[] : array) {
            fill(a, x);
        }
    }

    void fill(long array[][], long x) {
        for (long a[] : array) {
            fill(a, x);
        }
    }

    void fill(double array[][], double x) {
        for (double a[] : array) {
            fill(a, x);
        }
    }

    void fill(boolean array[][], boolean x) {
        for (boolean a[] : array) {
            fill(a, x);
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

    long INF = (long) 1e18 + 7;

    boolean isINF(long a) {
        return abs(a) > INF / 1000;
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

    long[] powsMod(long x, int max) {
        long pow[] = new long[max + 1];
        pow[0] = 1;
        for (int i = 0; i < max; i++) {
            pow[i + 1] = mod(pow[i] * x);
        }
        return pow;
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
    long permutation(int n, int r) {
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
        return mod(permutation(n, r) * invFact[r]);
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


    private final PrintWriter out = new PrintWriter(System.out);
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

class Combination {
    static final int MOD = (int) (Math.pow(10, 9) + 7);
    long[] fact;
    long[] invFact;
    long[] inv;

    public Combination(int n) {
        fact = new long[n + 1];
        invFact = new long[n + 1];
        inv = new long[n + 1];
        fact[0] = 1;
        fact[1] = 1;
        invFact[0] = 1;
        invFact[1] = 1;
        inv[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            fact[i] = fact[i - 1] * i % MOD;
            inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
            invFact[i] = invFact[i - 1] * inv[i] % MOD;
        }
    }

    public long combination(int n, int k) {
        if (n < k || n < 0 || k < 0) {
            return 0;
        }
        return fact[n] * (invFact[k] * invFact[n - k] % MOD) % MOD;
    }
}