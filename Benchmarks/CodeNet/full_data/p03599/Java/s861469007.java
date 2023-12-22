import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    static void solve() {
        int a = nextInt();
        int b = nextInt();
        int c = nextInt();
        int d = nextInt();
        int e = nextInt();
        int f = nextInt();

        double thickness = -1.0;
        int ansWater = Integer.MIN_VALUE;
        int ansSugar = Integer.MIN_VALUE;
        // aa, bb, cc, dd：操作回数
        for (int aa = 0; aa <= 30; aa++) {
            for (int bb = 0; bb <= 30; bb++) {
                int water = 100 * a * aa + 100 * b * bb;
                for (int cc = 0; cc <= 3000; cc++) {

                    int dd = (e * water / 100 - c * cc) / d;
                    dd = Math.max(dd, 0);
                    for (int ddd = dd - 1; ddd <= dd + 1; ddd++) {

                        if (ddd < 0)
                            continue;
                        int sugar = c * cc + d * ddd;
//                        int sugar = c * cc + d * dd;

                        if (water + sugar > f)
                            continue;
                        if (sugar * 100 > e * water)
                            continue;

                        double newThickness = ((double) sugar) / ((double) (water + sugar));
                        if (thickness < newThickness) {
                            thickness = newThickness;
                            ansWater = water;
                            ansSugar = sugar;
//                        System.out.println(aa + ":" + bb + ":" + cc + ":" + dd);
                        }
                    }
                }
            }
        }

//        System.out.println(ansWater);
//        System.out.println(ansSugar);
//        System.out.println(thickness);
        if (thickness < 0.0) {
            throw new RuntimeException();
        } else {
            out.println((ansWater + ansSugar) + " " + ansSugar);
        }
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

//    // intをlength桁のbit文字列に変換
//    static String toBinaryString(int input, int length) {
//        return toBinaryString(input).substring(29 - length);
//    }
//
//    // intを29桁のbit文字列に変換
//    static String toBinaryString(int input) {
//        String ret = "";
//        int max = 0x10000000;
//        for (int i = 0; i < 29; i++) {
//            int tmp = input / max;
//            ret += tmp;
//            input %= max;
//            max /= 2;
//        }
//        return ret;
//    }

    public static void main(String[] args) {
        out = new PrintWriter(System.out);
        sc = new Scanner(System.in);

        solve();

        out.flush();
        sc.close();
    }

}
