import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    static void solve() {
        int n = nextInt();
//        int[] p = nextIntArray(n);
//        int[] q = nextIntArray(n);
        String p = "";
        for (int i = 0; i < n; i++) {
            p += nextString();
        }
        String q = "";
        for (int i = 0; i < n; i++) {
            q += nextString();
        }

        Set<String> set = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            set.add(String.valueOf(i));
        }
//        System.out.println(set);
        List<String> list = generate(set);
//        System.out.println(list);
//        System.out.println(list.size());

        sort(list);

        int pNum = 0;
        int qNum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contentEquals(p)) {
                pNum = i;
            }
            if (list.get(i).contentEquals(q)) {
                qNum = i;
            }
        }
        int ans = Math.abs(qNum - pNum);
        out.println(ans);
    }

    static List<String> generate(Set<String> set) {
        if (set.size() == 1) {
            List<String> list = new ArrayList<>(set);
            return list;
        }

        List<String> retList = new ArrayList<>();
        for (String str : set) {
            Set<String> set2 = new HashSet<>(set);
            set2.remove(str);
            List<String> list2 = generate(set2);
//            List<String> list3 = new ArrayList<>();
            for (String str2 : list2) {
                String str3 = str + str2;
//                list3.add(str3);
                retList.add(str3);
            }

        }

        return retList;
    }

    static List<List<Integer>> generateList(List<Integer> list) {
        return null;
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
