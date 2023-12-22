import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    static void solve() {
        int n = nextInt();
        int[] a = nextIntArray(n);

        int ans = 0;
        boolean ok = false;
        int pos = 0;
        for (int i = 0; i < n; i++) {
            int nextPos = a[pos];
            ans++;
            if (nextPos == 2) {
                ok = true;
                break;
            }
            pos = nextPos - 1;
        }

        if (ok) {
            out.println(ans);
        } else {
            out.println("-1");
        }
    }

    static final int MOD = 1_000_000_007;
    static long[] fac, finv, inv;

    // nCkの初期化
    static void comInit(int max) {
        fac = new long[max];
        finv = new long[max];
        inv = new long[max];
        fac[0] = fac[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;

        for (int i = 2; i < max; i++) {
            fac[i] = fac[i - 1] * i % MOD;
            inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
            finv[i] = finv[i - 1] * inv[i] % MOD;
        }
    }

    // nCkの計算
    static long com(int n, int k) {
        if (n < k)
            return 0;
        if (n < 0 || k < 0)
            return 0;
        return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
    }

    static PrintWriter out;
    static Scanner sc;

    static int[][] newIntArray(int h, int w, int value) {
        int[][] ret = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                ret[i][j] = value;
            }
        }
        return ret;
    }

    static int nextInt() {
        return Integer.parseInt(sc.next());
    }

    static long nextLong() {
        return Long.parseLong(sc.next());
    }

    static String nextString() {
        return sc.next();
    }

    static int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }
        return a;
    }

    static List<Integer> nextIntList(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(nextInt());
        }
        return list;
    }

    static List<Double> nextDoubleList(int n) {
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add((double) nextInt());
        }
        return list;
    }

    static List<Long> nextLongList(int n) {
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(nextLong());
        }
        return list;
    }

    static char[][] nextCharArray(int h, int w) {
        char[][] c = new char[h][w];
        for (int i = 0; i < h; i++) {
            String str = nextString();
            for (int j = 0; j < w; j++) {
                c[i][j] = str.charAt(j);
            }
        }
        return c;
    }

    static <T extends Comparable<? super T>> void sort(List<T> list) {
        Collections.sort(list);
    }

    // greatest common divisor
    // 最大公約数
    static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // least common multiple
    // 最小公倍数
    static long lcm(long a, long b) {
        if (a >= b && a % b == 0)
            return a;
        if (b > a && b % a == 0)
            return b;

        if (a > b) {
            return (a / gcd(a, b)) * b;
        } else {
            return (b / gcd(a, b)) * a;
        }
        // return a * b / gcd(a, b);
    }

    // baseのn乗を計算を返す
    static int pow(int base, int n) {
        int ret = 1;
        for (int i = 0; i < n; i++) {
            ret *= base;
        }
        return ret;
    }

    // return n^k mod m
    static long powMod(long n, long k, long m) {
        if (k == 0) {
            return 1;
        } else if (k % 2 == 1) {
            return powMod(n, k - 1, m) * n % m;
        } else {
            long tmp = powMod(n, k / 2, m);
            return tmp * tmp % m;
        }
    }

    // intをlength桁のbit文字列に変換
    static String toBitString(int length, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = length - 1; i >= 0; i--) {
            if ((n >> i) % 2 == 1) {
                sb.append("1");
            } else {
                sb.append("0");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        out = new PrintWriter(System.out);
        sc = new Scanner(System.in);

        solve();

        out.flush();
        sc.close();
    }

}
