import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    static void solve() {
        String str = nextString();
        String a = str.substring(0, 1);
        String b = str.substring(1, 2);
        String c = str.substring(2, 3);
        String d = str.substring(3, 4);

        for (int i = 0; i < 8; i++) {
            int candidate = Integer.parseInt(str.substring(0, 1));
            int index = 1;
            for (int j = i; j > 0; j /= 2) {
                if (j % 2 == 1) {
                    candidate += Integer.parseInt(str.substring(index, index + 1));
                } else {
                    candidate -= Integer.parseInt(str.substring(index, index + 1));
                }
                index++;
            }
            if (candidate == 7) {
//                System.out.println(i);
                String op1 = (i % 2 == 1) ? "+" : "-";
                String op2 = ((i >> 1) % 2 == 1) ? "+" : "-";
                String op3 = ((i >> 2) % 2 == 1) ? "+" : "-";

                System.out.println(a + op1 + b + op2 + c + op3 + d + "=7");
                break;
            }
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
    static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
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
    static String toBinaryString(int input, int length) {
        return toBinaryString(input).substring(29 - length);
    }

    // intを29桁のbit文字列に変換
    static String toBinaryString(int input) {
        String ret = "";
        int max = 0x10000000;
        for (int i = 0; i < 29; i++) {
            int tmp = input / max;
            ret += tmp;
            input %= max;
            max /= 2;
        }
        return ret;
    }

    public static void main(String[] args) {
        out = new PrintWriter(System.out);
        sc = new Scanner(System.in);

        solve();

        out.flush();
        sc.close();
    }

}
