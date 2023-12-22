import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    static void solve() {
        int n = nextInt();
        double[] x = new double[n];
        double[] y = new double[n];
        for (int i = 0; i < n; i++) {
            x[i] = nextInt();
            y[i] = nextInt();
        }

        // 二分法
        double min = 0.0;
        double max = 10_000.0;
        double r = Double.MIN_VALUE;
        while (max - min > 1.0e-6) {
            r = (max + min) / 2.0;

            boolean updateMin = false; // true -> rを増加
            boolean updateMax = true; // true -> rを減少
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    // 半径rで中心が点iと点jの円が交わる2点の座標を(x1,y1),(x2,y2)とする
                    // 傾き
                    double theta = Math.atan(-(x[j] - x[i]) / (y[j] - y[i]));
                    // 点iと点jの距離
                    double d = distance(x[i], y[i], x[j], y[j]);
                    // 点iと点jの中点から、半径rの円の交点までの距離:l
                    double ll = r * r - (d / 2.0) * (d / 2.0);
                    if (ll < 0) {
                        updateMin = true;
                        break;
                    }
                    double l = Math.sqrt(ll);
                    // 交点の座標
                    double x1 = (x[i] + x[j]) / 2.0 + l * Math.cos(theta);
                    double y1 = (y[i] + y[j]) / 2.0 + l * Math.sin(theta);
                    double x2 = (x[i] + x[j]) / 2.0 - l * Math.cos(theta);
                    double y2 = (y[i] + y[j]) / 2.0 - l * Math.sin(theta);

                    // x1,y1の評価
                    updateMax = true;
                    for (int ii = 0; ii < n; ii++) {
                        if (ii == i || ii == j)
                            continue;

                        if (distance(x1, y1, x[ii], y[ii]) > r)
                            updateMax = false;
                    }
                    if (updateMax) {
                        break;
                    }
                    // x2,y2の評価
                    updateMax = true;
                    for (int ii = 0; ii < n; ii++) {
                        if (ii == i || ii == j)
                            continue;

                        if (distance(x2, y2, x[ii], y[ii]) > r)
                            updateMax = false;
                    }
                    if (updateMax) {
                        break;
                    }

                }
                if (updateMax || updateMin)
                    break;

            }
//            debugPrint("bef)max=" + max + ", min=" + min + ", r=" + r + ", max - min=" + (max - min));
            if (updateMin)
                min = r;
            else if (updateMax)
                max = r;
            else
                min = r;
            debugPrint("aft)max=" + max + ", min=" + min + ", r=" + r + ", max - min=" + (max - min));
        }

        out.println(r);
    }

    static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
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
        return a * b / gcd(a, b);
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

    static String className;

    static void setClassName() {
        className = new Object() {
        }.getClass().getEnclosingClass().getSimpleName();
    }

    static void debugPrint(String msg) {
        if (!className.equals("Main"))
            System.err.println(msg);
    }

    public static void main(String[] args) {
        long start = System.nanoTime();
        setClassName();
        out = new PrintWriter(System.out);
        sc = new Scanner(System.in);

        solve();

        out.flush();
        sc.close();
        long end = System.nanoTime();
        debugPrint("elapsed time: " + (end - start) / 1_000_000 + "[msec]");
    }

}
