
import java.io.*;

import static java.lang.Math.*;
import static java.lang.Math.min;

import java.util.*;

/**
 * @author baito
 */
@SuppressWarnings("unchecked")
public class Main {
    static StringBuilder sb = new StringBuilder();
    static int INF = 1234567890;
    static int MINF = -1234567890;
    static long LINF = 123456789123456789L;
    static long MLINF = -123456789123456789L;
    static long MOD = 1000000007;
    static int[] y4 = {0, 1, 0, -1};
    static int[] x4 = {1, 0, -1, 0};
    static int[] y8 = {0, 1, 0, -1, -1, 1, 1, -1};
    static int[] x8 = {1, 0, -1, 0, 1, -1, 1, -1};
    //    static long[] fa;//factorial
    static ArrayList<Long> Fa;
    static boolean[] isPrime;
    static int[] primes;
    static char[][] ban;
    static long maxRes = MLINF;
    static long minRes = LINF;
    static boolean DEBUG = true;

    static int N;
    static int[] A;

    public static void solve() throws Exception {
        //longを忘れるなオーバーフローするぞ
        N = ni();
        int[] x = new int[N];
        int[] y = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = ni();
            y[i] = ni();
        }
        for (int i = 0; i < N; i++) {
            int sum = x[i] + y[i];
            int mot = x[0] + y[0];
            if ((sum - mot) % 2 == 1) {
                System.out.println("-1");
                return;
            }
        }
        int M = (x[0]+y[0])%2==0?40:39;
        System.out.println(M);
        for (int i = 0; i < M; i++) {
            System.out.print("1 ");
        }
        System.out.println("");
        for (int i = 0; i < N; i++) {
            String res = "";
            int cou=0;
            for (int j = 0; j < x[i]; j++) {
                res += 'R';cou++;
            }
            for (int j = 0; j < -x[i]; j++) {
                res += 'L';cou++;
            }
            for (int j = 0; j < y[i]; j++) {
                res += 'U';cou++;
            }
            for (int j = 0; j < -y[i]; j++) {
                res += 'D';cou++;
            }
            for (int j = 0; j < M-cou; j+=2) {
                res +="UD";
            }
            System.out.println(res);
        }
    }

    static class SegmentLazy {
        int n;
        long[] sum, min, max, lazy;
        int[] mini, maxi;

        SegmentLazy(int size) {
            n = 1;
            while (n < size) n *= 2;
            sum = new long[2 * n - 1];
            min = new long[2 * n - 1];
            max = new long[2 * n - 1];
            lazy = new long[2 * n - 1];
            mini = new int[2 * n - 1];
            maxi = new int[2 * n - 1];
            Arrays.fill(min, Long.MAX_VALUE);
            Arrays.fill(max, Long.MIN_VALUE);
        }

        SegmentLazy(int[] a) {
            this(a.length);
            for (int i = 0; i < n; i++) {
                mini[i + n - 1] = i;
                maxi[i + n - 1] = i;
            }
            for (int i = 0; i < a.length; i++) {
                update(i, a[i]);
            }
        }

        public void update(int i, int x) {
            i += n - 1;
            sum[i] = x;
            min[i] = x;
            max[i] = x;
            while (i > 0) {
                i /= 2;
                sum[i] = sum[i * 2 + 1] + sum[i * 2 + 2];
                setMinMax(i);
            }
        }

        public void add(int l, int r, int x) {
            add(l, r, 0, x, 0, n);
        }

        public void add(int a, int b, int k, int x, int l, int r) {
            eval(k, l, r);
            if (r <= a || b <= l) return;
            else if (a <= l && r <= b) {
                lazy[k] += x;
                eval(k, l, r);
            } else {
                add(a, b, k * 2 + 1, x, l, (l + r) / 2);
                add(a, b, k * 2 + 2, x, (l + r) / 2, r);
                sum[k] = sum[k * 2 + 1] + sum[k * 2 + 2];
                setMinMax(k);
            }
        }

        public long sum(int l, int r) {
            return sum(l, r, 0, 0, n);
        }

        public long sum(int a, int b, int k, int l, int r) {
            eval(k, l, r);
            if (r <= a || b <= l) return 0;
            else if (a <= l && r <= b) {
                return sum[k];
            } else {
                long lv = sum(a, b, k * 2 + 1, l, (l + r) / 2);
                long rv = sum(a, b, k * 2 + 2, (l + r) / 2, r);
                return lv + rv;
            }
        }

        public long min(int l, int r) {
            return min(l, r, 0, 0, n);
        }

        public long min(int a, int b, int k, int l, int r) {
            eval(k, l, r);
            if (r <= a || b <= l) return 0;
            else if (a <= l && r <= b) {
                return min[k];
            } else {
                long lv = min(a, b, k * 2 + 1, l, (l + r) / 2);
                long rv = min(a, b, k * 2 + 2, (l + r) / 2, r);
                return Math.min(lv, rv);
            }
        }

        public long mini(int l, int r) {
            return mini(l, r, 0, 0, n);
        }

        public long mini(int a, int b, int k, int l, int r) {
            eval(k, l, r);
            if (r <= a || b <= l) return -1;
            else if (a <= l && r <= b) {
                return mini[k];
            } else {
                long lv = min(a, b, k * 2 + 1, l, (l + r) / 2);
                long rv = min(a, b, k * 2 + 2, (l + r) / 2, r);
                long li = mini(a, b, k * 2 + 1, l, (l + r) / 2);
                long ri = mini(a, b, k * 2 + 2, (l + r) / 2, r);
                return lv < rv ? li : ri;
            }
        }

        public long max(int l, int r) {
            return max(l, r, 0, 0, n);
        }

        public long max(int a, int b, int k, int l, int r) {
            eval(k, l, r);
            if (r <= a || b <= l) return Integer.MIN_VALUE;
            else if (a <= l && r <= b) {
                return max[k];
            } else {
                long lv = max(a, b, k * 2 + 1, l, (l + r) / 2);
                long rv = max(a, b, k * 2 + 2, (l + r) / 2, r);
                return Math.max(lv, rv);
            }
        }

        public long maxi(int l, int r) {
            return maxi(l, r, 0, 0, n);
        }

        public long maxi(int a, int b, int k, int l, int r) {
            eval(k, l, r);
            if (r <= a || b <= l) return -1;
            else if (a <= l && r <= b) {
                return maxi[k];
            } else {
                long lv = max(a, b, k * 2 + 1, l, (l + r) / 2);
                long rv = max(a, b, k * 2 + 2, (l + r) / 2, r);
                long li = maxi(a, b, k * 2 + 1, l, (l + r) / 2);
                long ri = maxi(a, b, k * 2 + 2, (l + r) / 2, r);
                return lv > rv ? li : ri;
            }
        }


        private void eval(int k, int l, int r) {
            if (lazy[k] != 0) {
                sum[k] += lazy[k] * (r - l);
                min[k] += lazy[k];
                max[k] += lazy[k];
                if (r - l > 1) {
                    lazy[k * 2 + 1] += lazy[k];
                    lazy[k * 2 + 2] += lazy[k];
                }
                lazy[k] = 0;
            }
        }

        private void setMinMax(int i) {
            if (min[i * 2 + 1] < min[i * 2 + 2]) {
                min[i] = min[i * 2 + 1];
                mini[i] = mini[i * 2 + 1];
            } else {
                min[i] = min[i * 2 + 2];
                mini[i] = mini[i * 2 + 2];
            }
            if (max[i * 2 + 1] > max[i * 2 + 2]) {
                max[i] = max[i * 2 + 1];
                maxi[i] = maxi[i * 2 + 1];
            } else {
                max[i] = max[i * 2 + 2];
                maxi[i] = maxi[i * 2 + 2];
            }
        }

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
                    res[i][j] = modSum(res[i][j], modMul(l[i][k], r[k][j]));
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
            if (bitGet(n, 0)) res = matMul(pow, res);
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

    public static boolean calc(long v) {
        int mid = (int) v;
        return true;
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

    //条件を満たす最大値、あるいは最小値を求める
    static long binarysearch(long ok, long ng) {
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
        return ok;
    }

    public static boolean bitGet(BitSet bit, int keta) {
        return bit.nextSetBit(keta) == keta;
    }

    public static boolean bitGet(long bit, int keta) {
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

    public static long sqrt(long v) {
        long res = (long) Math.sqrt(v);
        while (res * res > v) res--;
        return res;
    }

    public static int u0(int a) {
        if (a < 0) return 0;
        return a;
    }

    public static long u0(long a) {
        if (a < 0) return 0;
        return a;
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
        List<Integer> prs = new ArrayList<>();
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (!isPrime[i]) continue;
            prs.add(i);
            for (int j = i * 2; j < n; j += i) {
                isPrime[j] = false;
            }
        }
        primes = new int[prs.size()];
        for (int i = 0; i < prs.size(); i++)
            primes[i] = prs.get(i);
    }

    public static void revSort(int[] a) {
        Arrays.sort(a);
        reverse(a);
    }

    public static void revSort(long[] a) {
        Arrays.sort(a);
        reverse(a);
    }

    public static int[][] copy(int[][] ar) {
        int[][] nr = new int[ar.length][ar[0].length];
        for (int i = 0; i < ar.length; i++)
            for (int j = 0; j < ar[0].length; j++)
                nr[i][j] = ar[i][j];
        return nr;
    }

    /**
     * <h1>指定した値以上の先頭のインデクスを返す</h1>
     * <p>配列要素が０のときは、０が返る。</p>
     *
     * @return<b>int</b> ： 探索した値以上で、先頭になるインデクス
     * 値が無ければ、挿入できる最小のインデックス
     */
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

    /**
     * <h1>指定した値より大きい先頭のインデクスを返す</h1>
     * <p>配列要素が０のときは、０が返る。</p>
     *
     * @return<b>int</b> ： 探索した値より上で、先頭になるインデクス
     * 値が無ければ、挿入できる最小のインデックス
     */
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

    /**
     * <h1>指定した値以上の先頭のインデクスを返す</h1>
     * <p>配列要素が０のときは、０が返る。</p>
     *
     * @return<b>int</b> ： 探索した値以上で、先頭になるインデクス
     * 値がなければ挿入できる最小のインデックス
     */
    public static long lowerBound(final long[] arr, final long value) {
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

    /**
     * <h1>指定した値より大きい先頭のインデクスを返す</h1>
     * <p>配列要素が０のときは、０が返る。</p>
     *
     * @return<b>int</b> ： 探索した値より上で、先頭になるインデクス
     * 値がなければ挿入できる最小のインデックス
     */
    public static long upperBound(final long[] arr, final long value) {
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

    static long ncrdp(int n, int r) {
        if (n < r) return 0;
        long[][] dp = new long[n + 1][r + 1];
        for (int ni = 0; ni < n + 1; ni++) {
            dp[ni][0] = dp[ni][ni] = 1;
            for (int ri = 1; ri < ni; ri++) {
                dp[ni][ri] = dp[ni - 1][ri - 1] + dp[ni - 1][ri];
            }
        }
        return dp[n][r];
    }

    public static int mod(int a, int m) {
        return a >= 0 ? a % m : (int) (a + ceil(-a * 1.0 / m) * m) % m;
    }

    static long modNcr(int n, int r) {
        if (n < 0 || r < 0 || n < r) return 0;
        if (Fa == null || Fa.size() <= n) factorial(n);
        long result = Fa.get(n);
        result = modMul(result, modInv(Fa.get(n - r)));
        result = modMul(result, modInv(Fa.get(r)));
        return result;
    }

    public static long modSum(long... lar) {
        long res = 0;
        for (long l : lar)
            res = (res + l % MOD) % MOD;
        if (res < 0) res += MOD;
        res %= MOD;
        return res;
    }

    public static long modDiff(long a, long b) {
        long res = a % MOD - b % MOD;
        if (res < 0) res += MOD;
        res %= MOD;
        return res;
    }

    public static long modMul(long... lar) {
        long res = 1;
        for (long l : lar)
            res = (res * l % MOD) % MOD;
        if (res < 0) res += MOD;
        res %= MOD;
        return res;
    }

    public static long modDiv(long a, long b) {
        long x = a % MOD;
        long y = b % MOD;
        long res = (x * modInv(y)) % MOD;
        return res;
    }

    static long modInv(long n) {
        return modPow(n, MOD - 2);
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

    static long modPow(long x, long n) {
        long res = 1L;
        while (n > 0) {
            if ((n & 1) == 1) {
                res = res * x % MOD;
            }
            x = x * x % MOD;
            n >>= 1;
        }
        return res;
    }

    //↑nCrをmod計算するために必要

    static int gcd(int n, int r) {
        return r == 0 ? n : gcd(r, n % r);
    }

    static long gcd(long n, long r) {
        return r == 0 ? n : gcd(r, n % r);
    }

    static <T> void swap(T[] x, int i, int j) {
        T t = x[i];
        x[i] = x[j];
        x[j] = t;
    }

    static void swap(int[] x, int i, int j) {
        int t = x[i];
        x[i] = x[j];
        x[j] = t;
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

    static int countC2(char[][] a, char c) {
        int co = 0;
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                if (a[i][j] == c) co++;
        return co;
    }

    static int countI(int[] a, int key) {
        int co = 0;
        for (int i = 0; i < a.length; i++)
            if (a[i] == key) co++;
        return co;
    }

    static int countI(int[][] a, int key) {
        int co = 0;
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                if (a[i][j] == key) co++;
        return co;
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

    static void fill(int[][][] a, int v) {
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

    static int sum(int[] a) {
        int cou = 0;
        for (int i : a)
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

    public static int[] niad(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = ni() - 1;
        }
        return a;
    }

//    public static P[] npa(int n) {
//        P[] p = new P[n];
//        for (int i = 0; i < n; i++) {
//            p[i] = new P(ni(), ni());
//        }
//        return p;
//    }
//
//    public static P[] npad(int n) {
//        P[] p = new P[n];
//        for (int i = 0; i < n; i++) {
//            p[i] = new P(ni() - 1, ni() - 1);
//        }
//        return p;
//    }

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

    //複数の配列を受け取る
    public static void nia2(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            a[i] = ni();
            b[i] = ni();
        }
    }

    //複数の配列を受け取る
    public static void nia3(int[] a, int[] b, int[] c) {
        for (int i = 0; i < a.length; i++) {
            a[i] = ni();
            b[i] = ni();
            c[i] = ni();
        }
    }

    public static char[] nca() {
        char[] a = next().toCharArray();
        return a;
    }

    public static char[][] nct(int h, int w) {
        char[][] a = new char[h][w];
        for (int i = 0; i < h; i++) {
            a[i] = next().toCharArray();
        }
        return a;
    }

    //スペースが入っている場合
    public static char[][] ncts(int h, int w) {
        char[][] a = new char[h][w];
        for (int i = 0; i < h; i++) {
            a[i] = nextLine().replace(" ", "").toCharArray();
        }
        return a;
    }

    public static char[][] nctp(int h, int w, char c) {
        char[][] a = new char[h + 2][w + 2];
        //char c = '*';
        int i;
        for (i = 0; i < w + 2; i++)
            a[0][i] = c;
        for (i = 1; i < h + 1; i++) {
            a[i] = (c + next() + c).toCharArray();
        }
        for (i = 0; i < w + 2; i++)
            a[h + 1][i] = c;
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

    public static long[][] nlt(int h, int w) {
        long[][] a = new long[h][w];
        for (int hi = 0; hi < h; hi++) {
            for (int wi = 0; wi < w; wi++) {
                a[hi][wi] = nl();
            }
        }
        return a;
    }

    public static void main(String[] args) throws Exception {
        long startTime = System.currentTimeMillis();
        solve();
        System.out.flush();
        long endTime = System.currentTimeMillis();
        if (DEBUG) System.err.println(endTime - startTime);
    }

}
