import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static final int NONE = 0;
    static final int G_A = 1;
    static final int G_B = 2;
    static final int G_C = 3;

    static void solve() {
        int n = nextInt();
        int a = nextInt();
        int b = nextInt();
        int c = nextInt();
        int[] l = nextIntArray(n);

        int ans = Integer.MAX_VALUE;
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        List<Integer> listC = new ArrayList<>();
        for (int i = 0; i < (1 << n * 2); i++) { // 竹１本あたり2bit使用するため、n*2だけ左シフト
            listA.clear();
            listB.clear();
            listC.clear();
            for (int j = 0; j < n; j++) {
                int group = ((i >> (j * 2)) % 4);
                if (group == G_A)
                    listA.add(j);
                if (group == G_B)
                    listB.add(j);
                if (group == G_C)
                    listC.add(j);

            }
            // 必ず１本ずつ必要
            if (listA.size() == 0 || listB.size() == 0 || listC.size() == 0)
                continue;

            // コスト計算
            int cost = 0;
            cost += (listA.size() - 1) * 10;
            cost += (listB.size() - 1) * 10;
            cost += (listC.size() - 1) * 10;
            int aa = listA.stream().mapToInt(e -> l[e]).sum();
            cost += Math.abs(aa - a);
            int bb = listB.stream().mapToInt(e -> l[e]).sum();
            cost += Math.abs(bb - b);
            int cc = listC.stream().mapToInt(e -> l[e]).sum();
            cost += Math.abs(cc - c);
//            System.out.println("cost=" + cost);
            if (cost < ans) {
                ans = cost;
            }
        }
        out.println(ans);
    }

    static final int MOD = 1_000_000_007;
    static long[] fac, finv, inv;

    // 階乗(n!)
    static long factorial(long n) {
        long ans = 1;
        for (long i = n; i > 0; i--) {
            ans = ans * i % MOD;
        }
        return ans;
    }

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

    // 2〜nまでの数値を素因数分解したmapを返す.
    // map: 数値 -> (素因数)
    // ex)
    // 2 -> (2)
    // 4 -> (2,2)
    // 12 -> (2,2,3)
    static Map<Integer, List<Integer>> primeFactorizeTo(int n) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 2; i <= n; i++) {
            List<Integer> list = new ArrayList<>();
            int tmp = i;
            for (int j = i - 1; j > 1; j--) {
                if (tmp % j == 0) {
                    if (map.containsKey(j)) {
                        list.addAll(map.get(j));
                    } else {
                        list.add(j);
                    }
                    tmp /= j;
                }
            }
            if (tmp != 1)
                list.add(tmp);
            map.put(i, list);
        }
        return map;
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

    static long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextLong();
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
