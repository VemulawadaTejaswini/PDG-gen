import java.io.*;

import static java.lang.Math.*;
import static java.lang.Math.min;

import java.math.BigDecimal;
import java.util.*;

import java.util.stream.*;

import static java.util.Arrays.*;


/**
 * @author baito
 */
@SuppressWarnings("unchecked")
public class Main {
    static boolean DEBUG = true;
    static StringBuilder sb = new StringBuilder();
    static int INF = 1234567890;
    static int MINF = -1234567890;
    static long LINF = 123456789123456789L;
    static long MLINF = -123456789123456789L;
    static long MOD = 1000000007;
    static double EPS = 1e-10;
    static int[] y4 = {0, 1, 0, -1};
    static int[] x4 = {1, 0, -1, 0};
    static int[] y8 = {0, 1, 0, -1, -1, 1, 1, -1};
    static int[] x8 = {1, 0, -1, 0, 1, -1, 1, -1};
    static ArrayList<Long> Fa;
    static boolean[] isPrime;
    static ArrayList<Integer> primes;
    static char[][] ban;
    static long maxRes = Long.MIN_VALUE;
    static long minRes = Long.MAX_VALUE;

    static int N, M;
    static char[] s;

    public static void solve() throws Exception {
        //longを忘れるなオーバーフローするぞ
        N = ni();
        M = ni();
        s = nca();
        cou = new int[N][2];
        initNodes(N);
        for (int i = 0; i < M; i++) {
            int f = ni() - 1, t = ni() - 1;
            addEdge(f, t);
            cou[f][s[t] - 'A']++;
            cou[t][s[f] - 'A']++;
        }
        ok = new boolean[N];
        for (int i = 0; i < N; i++) {
            if (cou[i][0] > 0 && cou[i][1] > 0) ok[i] = true;
        }
        used = new boolean[N];
        for (int i = 0; i < N; i++) {
            if (!ok[i]) dfs(i);
        }
        if (cou(ok) > 0) System.out.println("Yes");
        else System.out.println("No");
    }

    public static void dfs(int f) {
        if (used[f]) return;
        used[f] = true;
        for (Integer t : nodes[f]) {
            if (!ok[t]) continue;
            if (--cou[t][s[f] - 'A'] <= 0) {
                ok[t] = false;
                dfs(t);
            }
        }
    }

    static int[][] cou;
    static boolean[] used;
    static boolean[] ok;
    //連結グラフ
    static ArrayList<Integer>[] nodes;

    static void initNodes(int v) {
        nodes = Stream.generate(ArrayList::new).limit(v).toArray(ArrayList[]::new);
    }

    static void addEdge(int f, int t) {
        nodes[f].add(t);
        nodes[t].add(f);
    }


    public static boolean calc(long va) {
        //貪欲にギリギリセーフを選んでいく。
        int v = (int) va;
        return true;
    }

    //条件を満たす最大値、あるいは最小値を求める
    static int mgr(long ok, long ng) {
        //int ok = 0; //解が存在する
        //int ng = N; //解が存在しない
        while (Math.abs(ok - ng) > 1) {
            long mid;
            if (ok < 0 && ng > 0 || ok > 0 && ng < 0) mid = (ok + ng) / 2;
            else mid = ok + (ng - ok) / 2;

            if (calc(mid)) {
                ok = mid;
            } else {
                ng = mid;
            }
        }
        if (calc(ok)) return (int) ok;
        else return -1;
    }

    static ArrayList<Integer> divisors(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                res.add(i);
                if (i != n / i) res.add(n / i);
            }
        }
        return res;
    }

    static ArrayList<Long> divisors(long n) {
        ArrayList<Long> res = new ArrayList<>();
        for (long i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                res.add(i);
                if (i != n / i) res.add(n / i);
            }
        }
        return res;
    }

    static ArrayList<Integer> factorization(int n) {
        if (primes == null) setPrimes();
        ArrayList<Integer> fact = new ArrayList<>();
        for (int p : primes) {
            if (n % p == 0) fact.add(p);
            while (n % p == 0) n /= p;
            if (n == 1) break;
        }
        if (n != 1) fact.add(n);
        return fact;
    }

    boolean equal(double a, double b) {
        return a == 0 ? abs(b) < EPS : abs((a - b) / a) < EPS;
    }

    public static void matPrint(long[][] a) {
        for (int hi = 0; hi < a.length; hi++) {
            for (int wi = 0; wi < a[0].length; wi++) {
                System.out.print(a[hi][wi] + " ");
            }
            System.out.println("");
        }
    }

    //rにlを掛ける l * r
    public static long[][] matMul(long[][] l, long[][] r) throws IOException {
        int lh = l.length;
        int lw = l[0].length;
        int rh = r.length;
        int rw = r[0].length;
        //lwとrhが,同じである必要がある
        if (lw != rh) throw new IOException();
        long[][] res = new long[lh][rw];
        for (int i = 0; i < lh; i++) {
            for (int j = 0; j < rw; j++) {
                for (int k = 0; k < lw; k++) {
                    res[i][j] = mSum(res[i][j], mMul(l[i][k], r[k][j]));
                }
            }
        }
        return res;
    }

    public static long[][] matPow(long[][] a, int n) throws IOException {
        int h = a.length;
        int w = a[0].length;
        if (h != w) throw new IOException();
        long[][] res = new long[h][h];
        for (int i = 0; i < h; i++) {
            res[i][i] = 1;
        }
        long[][] pow = a.clone();
        while (n > 0) {
            if (bget(n, 0)) res = matMul(pow, res);
            pow = matMul(pow, pow);
            n >>= 1;
        }
        return res;
    }

    public static void chMax(long v) {
        maxRes = Math.max(maxRes, v);
    }

    public static void chMin(long v) {
        minRes = Math.min(minRes, v);
    }

    //便利系
    //左端、右端の情報をもたせる。
    public static void setLR(int[] a, ArrayList<Integer> l, ArrayList<Integer> r) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                int j = i;
                while (a[j] > 0) j++;
                l.add(i);
                r.add(j);
                i = j - 1;
            }
        }
    }

    public static long[] rui(int[] a) {
        long[] res = new long[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            res[i + 1] = a[i];
        }
        for (int i = 0; i < a.length; i++) {
            res[i + 1] += res[i];
        }
        return res;
    }

    //p[i].x := i番目に小さいｖの値 p[i].y := その個数
    //0個の物は除く
    public static P[] mato(int[] a) {
        CouMap map = new CouMap(a);
        P[] res = new P[map.size()];
        int i = 0;
        for (Map.Entry<Long, Long> m : map.map.entrySet()) {
            res[i++] = new P((int) (long) m.getKey(), (int) (long) m.getValue());
        }
        sort(res);
        return res;
    }

    public static int[] imosu(int[] f, int[] t, int n) {
        int[] imosu = new int[n + 1];
        for (int i = 0; i < f.length; i++) {
            imosu[f[i]]++;
            imosu[t[i] + 1]--;
        }
        for (int i = 0; i < n; i++) {
            imosu[i + 1] += imosu[i];
        }
        return imosu;
    }

    static int[] inverse(int[] a) {
        int[] res = new int[a.length];
        for (int i = 0; i < a.length; i++)
            res[a[i]] = i;
        return res;
    }

    //2点間の行き先を配列に持たせる
    static int[][] packE(int n, int[] from, int[] to) {
        int[][] g = new int[n][];
        int[] p = new int[n];
        for (int f : from)
            p[f]++;
        for (int t : to)
            p[t]++;
        for (int i = 0; i < n; i++)
            g[i] = new int[p[i]];
        for (int i = 0; i < from.length; i++) {
            g[from[i]][--p[from[i]]] = to[i];
            g[to[i]][--p[to[i]]] = from[i];
        }
        return g;
    }

    public static String notE(double v) {
        return BigDecimal.valueOf(v).toPlainString();
    }

    public static void print(char[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }
    }

    public static <T> void print(ArrayList<T> a) {
        for (T t : a) {
            System.out.println(t);
        }
    }

    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }

    public static void print(long[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }

    public static void print(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }
    }

    //bit関連
    public static boolean bget(BitSet bit, int keta) {
        return bit.nextSetBit(keta) == keta;
    }

    public static boolean bget(long bit, int keta) {
        return ((bit >> keta) & 1) == 1;
    }


    public static int restoreHashA(long key) {
        return (int) (key >> 32);
    }

    public static int restoreHashB(long key) {
        return (int) (key & -1);
    }

    //正の数のみ
    public static long getHashKey(int a, int b) {
        return (long) a << 32 | b;
    }
    //数学関係--------------------------------

    //a/bを返す
    public static long ceil(long a, long b) {
        return (a % b == 0) ? a / b : a / b + 1;
    }

    public static long sqrt(long v) {
        long res = (long) Math.sqrt(v);
        while (res * res > v) res--;
        return res;
    }

    static long ncr2(int a, int b) {
        if (b == 0) return 1;
        else if (a < b) return 0;
        long res = 1;
        for (int i = 0; i < b; i++) {
            res *= a - i;
            res /= i + 1;
        }
        return res;
    }

    static double[][] PER_DP;

    static double ncrPer(int n, int r) {
        if (n < r) return 0;
        if (PER_DP == null) {
            PER_DP = new double[5001][5001];
            PER_DP[0][0] = 1;
            for (int ni = 0; ni < PER_DP.length - 1; ni++) {
                for (int ri = 0; ri < ni + 1; ri++) {
                    PER_DP[ni + 1][ri] += PER_DP[ni][ri] / 2;
                    PER_DP[ni + 1][ri + 1] += PER_DP[ni][ri] / 2;
                }
            }
        }
        return PER_DP[n][r];
    }

    public static int mod(int a, int m) {
        return a >= 0 ? a % m : (int) (a + ceil(-a, m) * m) % m;
    }

    static long mNcr(int n, int r) {
        if (n < 0 || r < 0 || n < r) return 0;
        if (Fa == null || Fa.size() <= n) factorial(n);
        long result = Fa.get(n);
        result = mMul(result, mInv(Fa.get(n - r)));
        result = mMul(result, mInv(Fa.get(r)));
        return result;
    }

    public static long mSum(long... lar) {
        long res = 0;
        for (long l : lar)
            res = (res + l % MOD) % MOD;
        return (res + MOD) % MOD;
    }

    public static long mDiff(long... lar) {
        long res = lar[0] % MOD;
        for (int i = 1; i < lar.length; i++) {
            res = (res - lar[i] % MOD) % MOD;
        }
        return (res + MOD) % MOD;
    }

    public static long mMul(long... lar) {
        long res = 1;
        for (long l : lar)
            res = (res * (l % MOD)) % MOD;
        return (res + MOD) % MOD;
    }

    public static long mDiv(long... lar) {
        long res = lar[0] % MOD;
        for (int i = 1; i < lar.length; i++) {
            res = mMul(res, mInv(lar[i]));
        }
        return (res + MOD) % MOD;
    }

    static long mInv(long n) {
        return mPow(n, MOD - 2);
    }

    static long mPow(long x, long n) {
        long res = 1L;
        while (n > 0) {
            if ((n & 1) == 1) {
                res = res * x % MOD;
            }
            x = x * x % MOD;
            n >>= 1;
        }
        return (res + MOD) % MOD;
    }

    static void factorial(int n) {
        if (Fa == null) {
            Fa = new ArrayList<>();
            Fa.add(1L);
            Fa.add(1L);
        }
        for (int i = Fa.size(); i <= n; i++) {
            Fa.add((Fa.get(i - 1) * i) % MOD);
        }
    }


    //↑nCrをmod計算するために必要
    static long lcm(long n, long r) {
        return n / gcd(n, r) * r;
    }

    static int gcd(int n, int r) {
        return r == 0 ? n : gcd(r, n % r);
    }

    static long gcd(long n, long r) {
        return r == 0 ? n : gcd(r, n % r);
    }

    public static int u0(int a) {
        if (a < 0) return 0;
        return a;
    }

    public static long u0(long a) {
        if (a < 0) return 0;
        return a;
    }

    public static boolean[][] tbt(char[][] s, char c) {
        boolean[][] res = new boolean[s.length][s[0].length];
        for (int hi = 0; hi < s.length; hi++)
            for (int wi = 0; wi < s[0].length; wi++)
                if (s[hi][wi] == c) res[hi][wi] = true;
        return res;
    }

    public static int[] tia(int a) {
        int[] res = new int[keta(a)];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = a % 10;
            a /= 10;
        }
        return res;
    }

    public static int[][] tit(char[][] a) {
        int[][] res = new int[a.length][a[0].length];
        for (int hi = 0; hi < a.length; hi++) {
            for (int wi = 0; wi < a[0].length; wi++) {
                res[hi][wi] = a[hi][wi] - '0';
            }
        }
        return res;
    }

    public static Integer[] toIntegerArray(int[] ar) {
        Integer[] res = new Integer[ar.length];
        for (int i = 0; i < ar.length; i++) {
            res[i] = ar[i];
        }
        return res;
    }

    public static long bitGetCombSizeK(int k) {
        return (1 << k) - 1;
    }

    //k個の次の組み合わせをビットで返す 大きさに上限はない 110110 -> 111001
    public static long bitNextComb(long comb) {
        long x = comb & -comb; //最下位の1
        long y = comb + x; //連続した下の1を繰り上がらせる
        return ((comb & ~y) / x >> 1) | y;
    }

    public static int keta(long num) {
        int res = 0;
        while (num > 0) {
            num /= 10;
            res++;
        }
        return res;
    }

    public static int ketaSum(long num) {
        int res = 0;
        while (num > 0) {
            res += num % 10;
            num /= 10;
        }
        return res;
    }

    public static boolean isOutofIndex(int x, int y, int w, int h) {
        if (x < 0 || y < 0) return true;
        if (w <= x || h <= y) return true;
        return false;
    }

    public static boolean isOutofIndex(int x, int y, char[][] ban) {
        if (x < 0 || y < 0) return true;
        if (ban[0].length <= x || ban.length <= y) return true;
        return false;
    }

    public static int arrayCount(int[] a, int v) {
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == v) res++;
        }
        return res;
    }

    public static int arrayCount(long[] a, int v) {
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == v) res++;
        }
        return res;
    }

    public static int arrayCount(int[][] a, int v) {
        int res = 0;
        for (int hi = 0; hi < a.length; hi++) {
            for (int wi = 0; wi < a[0].length; wi++) {
                if (a[hi][wi] == v) res++;
            }
        }
        return res;
    }

    public static int arrayCount(long[][] a, int v) {
        int res = 0;
        for (int hi = 0; hi < a.length; hi++) {
            for (int wi = 0; wi < a[0].length; wi++) {
                if (a[hi][wi] == v) res++;
            }
        }
        return res;
    }

    public static int arrayCount(char[][] a, char v) {
        int res = 0;
        for (int hi = 0; hi < a.length; hi++) {
            for (int wi = 0; wi < a[0].length; wi++) {
                if (a[hi][wi] == v) res++;
            }
        }
        return res;
    }

    public static void setPrimes() {
        int n = 100001;
        isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (!isPrime[i]) continue;
            for (int j = i * 2; j < n; j += i) {
                isPrime[j] = false;
            }
        }
        primes = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) primes.add(i);
        }
    }

    public static void revSort(int[] a) {
        Arrays.sort(a);
        reverse(a);
    }

    public static void revSort(long[] a) {
        Arrays.sort(a);
        reverse(a);
    }

    public static P[] clone(P[] ar) {
        P[] res = new P[ar.length];
        for (int i = 0; i < ar.length; i++) {
            res[i] = new P(ar[i].x, ar[i].y);
        }
        return res;
    }

    public static int[][] clone(int[][] ar) {
        int[][] nr = new int[ar.length][ar[0].length];
        for (int i = 0; i < ar.length; i++)
            for (int j = 0; j < ar[0].length; j++)
                nr[i][j] = ar[i][j];
        return nr;
    }

    public static long[][] clone(long[][] ar) {
        long[][] nr = new long[ar.length][ar[0].length];
        for (int i = 0; i < ar.length; i++)
            for (int j = 0; j < ar[0].length; j++)
                nr[i][j] = ar[i][j];
        return nr;
    }

    public static double[][] clone(double[][] ar) {
        double[][] nr = new double[ar.length][ar[0].length];
        for (int i = 0; i < ar.length; i++)
            for (int j = 0; j < ar[0].length; j++)
                nr[i][j] = ar[i][j];
        return nr;
    }

    public static boolean[][] clone(boolean[][] ar) {
        boolean[][] nr = new boolean[ar.length][ar[0].length];
        for (int i = 0; i < ar.length; i++)
            for (int j = 0; j < ar[0].length; j++)
                nr[i][j] = ar[i][j];
        return nr;
    }

    public static char[][] clone(char[][] ar) {
        char[][] nr = new char[ar.length][ar[0].length];
        for (int i = 0; i < ar.length; i++)
            for (int j = 0; j < ar[0].length; j++)
                nr[i][j] = ar[i][j];
        return nr;
    }

    public static int[][][] clone(int[][][] ar) {
        int[][][] nr = new int[ar.length][ar[0].length][ar[0][0].length];
        for (int i = 0; i < ar.length; i++)
            for (int j = 0; j < ar[0].length; j++)
                for (int k = 0; k < ar[0][0].length; k++)
                    nr[i][j][k] = ar[i][j][k];
        return nr;
    }

    public static long[][][] clone(long[][][] ar) {
        long[][][] nr = new long[ar.length][ar[0].length][ar[0][0].length];
        for (int i = 0; i < ar.length; i++)
            for (int j = 0; j < ar[0].length; j++)
                for (int k = 0; k < ar[0][0].length; k++)
                    nr[i][j][k] = ar[i][j][k];
        return nr;
    }

    public static double[][][] clone(double[][][] ar) {
        double[][][] nr = new double[ar.length][ar[0].length][ar[0][0].length];
        for (int i = 0; i < ar.length; i++)
            for (int j = 0; j < ar[0].length; j++)
                for (int k = 0; k < ar[0][0].length; k++)
                    nr[i][j][k] = ar[i][j][k];
        return nr;
    }

    public static boolean[][][] clone(boolean[][][] ar) {
        boolean[][][] nr = new boolean[ar.length][ar[0].length][ar[0][0].length];
        for (int i = 0; i < ar.length; i++)
            for (int j = 0; j < ar[0].length; j++)
                for (int k = 0; k < ar[0][0].length; k++)
                    nr[i][j][k] = ar[i][j][k];
        return nr;
    }

    public static char[][][] clone(char[][][] ar) {
        char[][][] nr = new char[ar.length][ar[0].length][ar[0][0].length];
        for (int i = 0; i < ar.length; i++)
            for (int j = 0; j < ar[0].length; j++)
                for (int k = 0; k < ar[0][0].length; k++)
                    nr[i][j][k] = ar[i][j][k];
        return nr;
    }

    /**
     * <h1>指定した値以上の先頭のインデクスを返す</h1>
     * <p>配列要素が０のときは、０が返る。</p>
     *
     * @return<b>int</b> ： 探索した値以上で、先頭になるインデクス
     * 値が無ければ、挿入できる最小のインデックス
     */
    public static <T extends Number> int lowerBound(final List<T> lis, final T value) {
        int low = 0;
        int high = lis.size();
        int mid;

        while (low < high) {
            mid = ((high - low) >>> 1) + low;    //(low + high) / 2 (オーバーフロー対策)
            if (lis.get(mid).doubleValue() < value.doubleValue()) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    //v未満で最大のiを返す。ただしvを満たすiがあるなら最小のiを返す
    public static <T extends Number> int rlowerBound(final List<T> lis, final T value) {
        int ind = lowerBound(lis, value);
        if (ind == lis.size() || !lis.get(ind).equals(value)) ind--;
        return ind;
    }

    /**
     * <h1>指定した値より大きい先頭のインデクスを返す</h1>
     * <p>配列要素が０のときは、０が返る。</p>
     *
     * @return<b>int</b> ： 探索した値より上で、先頭になるインデクス
     * 値が無ければ、挿入できる最小のインデックス
     */
    public static <T extends Number> int upperBound(final List<T> lis, final T value) {
        int low = 0;
        int high = lis.size();
        int mid;
        while (low < high) {
            mid = ((high - low) >>> 1) + low;    //(low + high) / 2 (オーバーフロー対策)
            if (lis.get(mid).doubleValue() < value.doubleValue()) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public static int lowerBound(final int[] arr, final int value) {
        int low = 0;
        int high = arr.length;
        int mid;

        while (low < high) {
            mid = ((high - low) >>> 1) + low;    //(low + high) / 2 (オーバーフロー対策)
            if (arr[mid] < value) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public static int rlowerBound(final int[] arr, final int value) {
        int ind = lowerBound(arr, value);
        if (ind == arr.length || arr[ind] != value) ind--;
        return ind;
    }


    public static int upperBound(final int[] arr, final int value) {
        int low = 0;
        int high = arr.length;
        int mid;
        while (low < high) {
            mid = ((high - low) >>> 1) + low;    //(low + high) / 2 (オーバーフロー対策)
            if (arr[mid] <= value) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public static int lowerBound(final long[] arr, final long value) {
        int low = 0;
        int high = arr.length;
        int mid;
        while (low < high) {
            mid = ((high - low) >>> 1) + low;    //(low + high) / 2 (オーバーフロー対策)
            if (arr[mid] < value) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public static int rlowerBound(final long[] arr, final long value) {
        int ind = lowerBound(arr, value);
        if (ind == arr.length || arr[ind] != value) ind--;
        return ind;
    }


    public static int upperBound(final long[] arr, final long value) {
        int low = 0;
        int high = arr.length;
        int mid;
        while (low < high) {
            mid = ((high - low) >>> 1) + low;    //(low + high) / 2 (オーバーフロー対策)
            if (arr[mid] <= value) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    //次の順列に書き換える、最大値ならfalseを返す
    public static boolean nextPermutation(int A[]) {
        int len = A.length;
        int pos = len - 2;
        for (; pos >= 0; pos--) {
            if (A[pos] < A[pos + 1]) break;
        }
        if (pos == -1) return false;

        //posより大きい最小の数を二分探索
        int ok = pos + 1;
        int ng = len;
        while (Math.abs(ng - ok) > 1) {
            int mid = (ok + ng) / 2;
            if (A[mid] > A[pos]) ok = mid;
            else ng = mid;

        }

        swap(A, pos, ok);
        reverse(A, pos + 1, len - 1);


        return true;
    }

    //次の順列に書き換える、最小値ならfalseを返す
    public static boolean prevPermutation(int A[]) {
        int len = A.length;
        int pos = len - 2;
        for (; pos >= 0; pos--) {
            if (A[pos] > A[pos + 1]) break;
        }
        if (pos == -1) return false;

        //posより小さい最大の数を二分探索
        int ok = pos + 1;
        int ng = len;
        while (Math.abs(ng - ok) > 1) {
            int mid = (ok + ng) / 2;
            if (A[mid] < A[pos]) ok = mid;
            else ng = mid;

        }

        swap(A, pos, ok);
        reverse(A, pos + 1, len - 1);


        return true;
    }


    static <T> void swap(T[] x, int i, int j) {
        T t = x[i];
        x[i] = x[j];
        x[j] = t;
    }

    static void swap(char[] x, int i, int j) {
        char t = x[i];
        x[i] = x[j];
        x[j] = t;
    }

    static void swap(int[] x, int i, int j) {
        int t = x[i];
        x[i] = x[j];
        x[j] = t;
    }

    public static String reverse(String a) {
        sb.append(a);
        String res = sb.reverse().toString();
        sb.setLength(0);
        return new String(res);
    }

    public static void reverse(int[] x) {
        int l = 0;
        int r = x.length - 1;
        while (l < r) {
            int temp = x[l];
            x[l] = x[r];
            x[r] = temp;
            l++;
            r--;
        }
    }

    public static void reverse(long[] x) {
        int l = 0;
        int r = x.length - 1;
        while (l < r) {
            long temp = x[l];
            x[l] = x[r];
            x[r] = temp;
            l++;
            r--;
        }
    }

    public static void reverse(char[] x) {
        int l = 0;
        int r = x.length - 1;
        while (l < r) {
            char temp = x[l];
            x[l] = x[r];
            x[r] = temp;
            l++;
            r--;
        }
    }

    public static void reverse(int[] x, int s, int e) {
        int l = s;
        int r = e;
        while (l < r) {
            int temp = x[l];
            x[l] = x[r];
            x[r] = temp;
            l++;
            r--;
        }
    }

    static int length(int a) {
        int cou = 0;
        while (a != 0) {
            a /= 10;
            cou++;
        }
        return cou;
    }

    static int length(long a) {
        int cou = 0;
        while (a != 0) {
            a /= 10;
            cou++;
        }
        return cou;
    }

    static int cou(boolean[] a) {
        int res = 0;
        for (boolean b : a) {
            if (b) res++;
        }
        return res;
    }

    static int cou(String s, char c) {
        int res = 0;
        for (char ci : s.toCharArray()) {
            if (ci == c) res++;
        }
        return res;
    }

    static int cou(char[][] a, char c) {
        int co = 0;
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                if (a[i][j] == c) co++;
        return co;
    }

    static int cou(int[] a, int key) {
        int co = 0;
        for (int i = 0; i < a.length; i++)
            if (a[i] == key) co++;
        return co;
    }

    static int cou(long[] a, long key) {
        int co = 0;
        for (int i = 0; i < a.length; i++)
            if (a[i] == key) co++;
        return co;
    }

    static int cou(int[][] a, int key) {
        int co = 0;
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                if (a[i][j] == key) co++;
        return co;
    }

    static int[] couArray(int[] a) {
        int[] res = new int[max(a) + 1];
        for (int i : a) {
            res[i]++;
        }
        return res;
    }

    static void fill(int[][] a, int v) {
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                a[i][j] = v;
    }

    static void fill(char[][] a, char c) {
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                a[i][j] = c;
    }

    static void fill(long[][] a, long v) {
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                a[i][j] = v;
    }

    static void fill(boolean[][] a, boolean v) {
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                a[i][j] = v;
    }

    static void fill(int[][][] a, int v) {
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                for (int k = 0; k < a[0][0].length; k++)
                    a[i][j][k] = v;
    }

    static void fill(long[][][] a, long v) {
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                for (int k = 0; k < a[0][0].length; k++)
                    a[i][j][k] = v;
    }

    static int max(int... a) {
        int res = Integer.MIN_VALUE;
        for (int i : a) {
            res = Math.max(res, i);
        }
        return res;
    }

    static long max(long... a) {
        long res = Long.MIN_VALUE;
        for (long i : a) {
            res = Math.max(res, i);
        }
        return res;
    }

    static double max(double... a) {
        double res = Double.MIN_VALUE;
        for (double i : a) {
            res = Math.max(res, i);
        }
        return res;
    }

    static long min(long... a) {
        long res = Long.MAX_VALUE;
        for (long i : a) {
            res = Math.min(res, i);
        }
        return res;
    }

    static int max(int[][] ar) {
        int res = Integer.MIN_VALUE;
        for (int i[] : ar)
            res = Math.max(res, max(i));
        return res;
    }

    static long max(long[][] ar) {
        long res = Integer.MIN_VALUE;
        for (long i[] : ar)
            res = Math.max(res, max(i));
        return res;
    }

    static int min(int... a) {
        int res = Integer.MAX_VALUE;
        for (int i : a) {
            res = Math.min(res, i);
        }
        return res;
    }


    static int min(int[][] ar) {
        int res = Integer.MAX_VALUE;
        for (int i[] : ar)
            res = Math.min(res, min(i));
        return res;
    }

    public static <T extends Number> long sum(ArrayList<T> lis) {
        long res = 0;
        for (T li : lis) {
            res += li.longValue();
        }
        return res;
    }

    static long sum(int[] a) {
        long cou = 0;
        for (int i : a)
            cou += i;
        return cou;
    }

    static long sum(long[] a) {
        long cou = 0;
        for (long i : a)
            cou += i;
        return cou;
    }


    //FastScanner

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = null;

    public static String next() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    /*public String nextChar(){
        return (char)next()[0];
    }*/
    public static String nextLine() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return tokenizer.nextToken("\n");
    }

    public static long nl() {
        return Long.parseLong(next());
    }

    public static String n() {
        return next();
    }

    public static int ni() {
        return Integer.parseInt(next());
    }

    public static double nd() {
        return Double.parseDouble(next());
    }

    public static int[] nia(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = ni();
        }
        return a;
    }


    //1-index
    public static int[] niao(int n) {
        int[] a = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            a[i] = ni();
        }
        return a;
    }

    //番兵法
    public static int[] nias(int n, int end) {
        int[] a = new int[n + 1];
        for (int i = 0; i < n; i++) {
            a[i] = ni();
        }
        a[n] = end;
        return a;
    }

    public static int[] niad(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = ni() - 1;
        }
        return a;
    }

    public static P[] npa(int n) {
        P[] p = new P[n];
        for (int i = 0; i < n; i++) {
            p[i] = new P(ni(), ni());
        }
        return p;
    }

    public static P[] npad(int n) {
        P[] p = new P[n];
        for (int i = 0; i < n; i++) {
            p[i] = new P(ni() - 1, ni() - 1);
        }
        return p;
    }

    public static int[][] nit(int h, int w) {
        int[][] a = new int[h][w];
        for (int hi = 0; hi < h; hi++) {
            for (int wi = 0; wi < w; wi++) {
                a[hi][wi] = ni();
            }
        }
        return a;
    }

    public static int[][] nitd(int h, int w) {
        int[][] a = new int[h][w];
        for (int hi = 0; hi < h; hi++) {
            for (int wi = 0; wi < w; wi++) {
                a[hi][wi] = ni() - 1;
            }
        }
        return a;
    }

    static int[][] S_ARRAY;
    static long[][] S_LARRAY;
    static int S_INDEX;
    static int S_LINDEX;

    //複数の配列を受け取る
    public static int[] niah(int n, int k) throws Exception {
        if (S_ARRAY == null) {
            S_ARRAY = new int[k][n];
            for (int j = 0; j < n; j++) {
                for (int i = 0; i < k; i++) {
                    S_ARRAY[i][j] = ni();
                }
            }
        }
        return S_ARRAY[S_INDEX++];
    }

    public static long[] nlah(int n, int k) throws Exception {
        if (S_LARRAY == null) {
            S_LARRAY = new long[k][n];
            for (int j = 0; j < n; j++) {
                for (int i = 0; i < k; i++) {
                    S_LARRAY[i][j] = nl();
                }
            }
        }
        return S_LARRAY[S_LINDEX++];
    }

    //複数の配列を受け取る
    public static int[] niahd(int n, int k) throws Exception {
        if (S_ARRAY == null) {
            S_ARRAY = new int[k][n];
            for (int j = 0; j < n; j++) {
                for (int i = 0; i < k; i++) {
                    S_ARRAY[i][j] = ni();
                }
            }
        }
        for (int i = 0; i < N; i++)
            S_ARRAY[S_INDEX][i]--;
        return S_ARRAY[S_INDEX++];
    }

    public static long[] nlahd(int n, int k) throws Exception {
        if (S_LARRAY == null) {
            S_LARRAY = new long[k][n];
            for (int j = 0; j < n; j++) {
                for (int i = 0; i < k; i++) {
                    S_LARRAY[i][j] = nl() - 1;
                }
            }
        }
        return S_LARRAY[S_LINDEX++];
    }

    public static char[] nca() {
        char[] a = next().toCharArray();
        return a;
    }


    public static String[] nsa(int n) {
        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            res[i] = n();
        }
        return res;
    }

    //スペースが入っている場合
    public static char[][] ncts(int h, int w) {
        char[][] a = new char[h][w];
        for (int i = 0; i < h; i++) {
            a[i] = nextLine().replace(" ", "").toCharArray();
        }
        return a;
    }

    public static char[][] nct(int h, int w) {
        char[][] a = new char[h][w];
        for (int hi = 0; hi < h; hi++) {
            String s = nextLine();
            for (int wi = 0; wi < s.length(); wi++) {
                a[hi][wi] = s.charAt(wi);
            }
        }
        return a;
    }

    public static char[][] nctp(int h, int w, char c) {
        char[][] a = new char[h + 2][w + 2];
        for (int hi = 1; hi < h + 1; hi++) {
            String s = nextLine();
            for (int wi = 1; wi < s.length() + 1; wi++) {
                a[hi][wi] = s.charAt(wi - 1);
            }
        }
        for (int wi = 0; wi < w + 2; wi++)
            a[0][wi] = a[h + 1][wi] = c;
        for (int hi = 0; hi < h + 2; hi++)
            a[hi][0] = a[hi][w + 1] = c;
        return a;
    }

    //スペースが入ってる時用
    public static char[][] nctsp(int h, int w, char c) {
        char[][] a = new char[h + 2][w + 2];
        //char c = '*';
        int i;
        for (i = 0; i < w + 2; i++)
            a[0][i] = c;
        for (i = 1; i < h + 1; i++) {
            a[i] = (c + nextLine().replace(" ", "") + c).toCharArray();
        }
        for (i = 0; i < w + 2; i++)
            a[h + 1][i] = c;
        return a;
    }

    public static long[] nla(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = nl();
        }
        return a;
    }

    public static long[] nlas(int n, long e) {
        long[] a = new long[n + 1];
        for (int i = 0; i < n; i++) {
            a[i] = nl();
        }
        a[n] = e;
        return a;
    }

    public static long[] nlao(int n) {
        long[] a = new long[n + 1];
        for (int i = 0; i < n; i++) {
            a[i + 1] = nl();
        }
        return a;
    }

    public static long[] nlad(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = nl() - 1;
        }
        return a;
    }

    public static long[][] nlt(int h, int w) {
        long[][] a = new long[h][w];
        for (int hi = 0; hi < h; hi++) {
            for (int wi = 0; wi < w; wi++) {
                a[hi][wi] = nl();
            }
        }
        return a;
    }

    //便利クラス
    static class CouMap {
        public HashMap<Long, Long> map;
        public HashMap<String, Long> smap;

        CouMap() {
            map = new HashMap();
            smap = new HashMap();
        }

        CouMap(int[] a) {
            map = new HashMap();
            smap = new HashMap();
            for (int i : a) {
                put(i);
            }
        }

        public int size() {
            return map.size();
        }

        public void put(long key, long value) {
            Long nowValue = map.get(key);
            map.put(key, nowValue == null ? value : nowValue + value);
        }

        public void put(String key, long value) {
            Long nowValue = smap.get(key);
            smap.put(key, nowValue == null ? value : nowValue + value);
        }

        public void mput(long key, long value) {
            Long nowValue = map.get(key);
            map.put(key, nowValue == null ? value % MOD : mSum(nowValue, value));
        }

        public void put(long key) {
            put(key, 1);
        }

        public void put(String key) {
            put(key, 1);
        }

        public void put(int... arg) {
            for (int i : arg) {
                put(i, 1);
            }
        }

        public void put(long... arg) {
            for (long i : arg) {
                put(i, 1);
            }
        }

        public void mput(int... arg) {
            for (int i : arg) {
                mput(i, 1);
            }
        }

        public void mput(long... arg) {
            for (long i : arg) {
                mput(i, 1);
            }
        }

        public long get(long key) {
            Long v = map.get(key);
            return v == null ? 0 : v;
        }

        public long get(String key) {
            Long v = map.get(key);
            return v == null ? 0 : v;
        }
    }

    static class P implements Comparable<P> {
        int x, y;

        @Override
        public int compareTo(P p) {
            //xyで昇順
            return x == p.x ? y - p.y : x - p.x;
            //xyで降順
            //return (x == p.x ? y - p.y : x - p.x) * -1;
            //yxで昇順
            //return y == p.y ? x - p.x : y - p.y;
            //yxで昇順
            //return (y == p.y ? x - p.x : y - p.y) * -1;

            //x昇 y降
            //return x == p.x ? p.y - y : x - p.x;
            //x降 y昇
            //return (x == p.x ? p.y - y : x - p.x) * -1;
            //y昇 x降
            //return y == p.y ? p.x - x : y - p.y;
            //y降 x昇
            //return (y == p.y ? p.x - x : y - p.y) * -1;
        }

        P(int a, int b) {
            x = a;
            y = b;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof P)) return false;
            P p = (P) o;
            return x == p.x && y == p.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }

    }

    static class PL implements Comparable<PL> {
        long x, y;

        public int compareTo(PL p) {
            //xyで昇順
            long res = x == p.x ? y - p.y : x - p.x;
            //xyで降順
            //long res = (x == p.x ? y - p.y : x - p.x) * -1;
            //yxで昇順
            //long res = y == p.y ? x - p.x : y - p.y;
            //yxで昇順
            //long res = (y == p.y ? x - p.x : y - p.y) * -1;

            //x昇 y降
            //long res = x == p.x ? p.y - y : x - p.x;
            //x降 y昇
            //long res = (x == p.x ? p.y - y : x - p.x) * -1;
            //y昇 x降
            //long res = y == p.y ? p.x - x : y - p.y;
            //y降 x昇
            //long res = (y == p.y ? p.x - x : y - p.y) * -1;

            return (res == 0) ? 0 : res > 0 ? 1 : -1;
        }

        PL(long a, long b) {
            x = a;
            y = b;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof PL)) return false;
            PL p = (PL) o;
            return x == p.x && y == p.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }

    }

    //値を渡す際は半開区間
    static class RectangleSum {
        //半開区間 0は0
        long[][] rui;
        int H, W;

        RectangleSum(long[][] ori) {
            H = ori.length;
            W = ori[0].length;
            rui = new long[H + 1][W + 1];
            for (int hi = 0; hi < H; hi++) {
                for (int wi = 0; wi < W; wi++) {
                    rui[hi + 1][wi + 1] = ori[hi][wi];
                }
            }
            for (int hi = 1; hi < H + 1; hi++) {
                for (int wi = 1; wi < W + 1; wi++) {
                    rui[hi][wi] += rui[hi - 1][wi];
                    rui[hi][wi] += rui[hi][wi - 1];
                    rui[hi][wi] -= rui[hi - 1][wi - 1];
                }
            }
        }

        RectangleSum(int[][] ori) {
            H = ori.length;
            W = ori[0].length;
            rui = new long[H + 1][W + 1];
            for (int hi = 0; hi < H; hi++) {
                for (int wi = 0; wi < W; wi++) {
                    rui[hi + 1][wi + 1] = ori[hi][wi];
                }
            }
            for (int hi = 1; hi < H + 1; hi++) {
                for (int wi = 1; wi < W + 1; wi++) {
                    rui[hi][wi] += rui[hi - 1][wi];
                    rui[hi][wi] += rui[hi][wi - 1];
                    rui[hi][wi] -= rui[hi - 1][wi - 1];
                }
            }
        }

        //半開区間
        public long getSum(int left, int right, int top, int bottom) {
            if (right > W || bottom > H) return 0;
            if (left < 0 || top < 0) return 0;
            if (top >= bottom || left >= right) return 0;
            long res = rui[bottom][right];
            res -= rui[top][right];
            res -= rui[bottom][left];
            res += rui[top][left];
            return res;
        }

    }

    public static void main(String[] args) throws Exception {
        long startTime = System.currentTimeMillis();
        solve();
        System.out.flush();
        long endTime = System.currentTimeMillis();
        if (DEBUG) System.err.println(endTime - startTime);
    }

}
