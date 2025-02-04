import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static String Y = "Yes";
    public static String N = "No";
    public static String I = "IMPOSSIBLE";
    public static String B = "Bad";
    public static String G = "Good";

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int k = ni();
        ArrayList<Long> lunlunList = new ArrayList<>();

        for (long i = 1; i < 10; i++) {
            lunlunList.add(i);
        }

        for (int i = 0;; i++) {
            long moto = lunlunList.get(i);
            long mod10 = moto % 10;

            if (moto % 10 != 0) {
                lunlunList.add(10 * moto + mod10 - 1);
            }
            lunlunList.add(10 * moto + mod10);
            if (mod10 != 9) {
                lunlunList.add(10 * moto + mod10 + 1);
            }

            if (i > 100000) {
                break;
            }
        }

        out(lunlunList.get(k - 1));
    }

    /*
     * 以下メソッド集
     */
    static int ni() {

        return sc.nextInt();
    }

    static long nl() {

        return sc.nextLong();
    }

    static String n() {

        return sc.next();
    }

    static char[] nc() {

        return sc.next().toCharArray();
    }

    static int kaijo(int n) {

        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * kaijo(n - 1);
        }
    }

    static int fib(int n) {

        return (n == 1 || n == 0) ? n : fib(n - 2) + fib(n - 1);
    }

    static long lcm(long m, long n) {

        return m * n / gcd(m, n);
    }

    static int lcm(int m, int n) {

        return m * n / gcd(m, n);
    }

    static long gcd(long a, long b) {

        return (b == 0) ? a : gcd(b, a % b);
    }

    static int gcd(int a, int b) {

        return (b == 0) ? a : gcd(b, a % b);
    }

    static void out(String info) {

        System.out.println(info);
    }

    static void out(int info) {

        System.out.println(info);
    }

    static void out(double info) {

        System.out.println(info);
    }

    static void out(long info) {

        System.out.println(info);
    }

    static void out(char info) {

        System.out.println(info);
    }

    static void outn(String info) {

        System.out.print(info);
    }

    static void outn(int info) {

        System.out.print(info);
    }

    static void outn(double info) {

        System.out.print(info);
    }

    static void outn(long info) {

        System.out.print(info);
    }

    static void outn(char info) {

        System.out.print(info);
    }

    static int max(int a, int b) {

        return Math.max(a, b);
    }

    static long max(long a, long b) {

        return Math.max(a, b);
    }

    static int min(int a, int b) {

        return Math.min(a, b);
    }

    static long min(long a, long b) {

        return Math.min(a, b);
    }
}