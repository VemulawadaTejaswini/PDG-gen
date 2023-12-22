import java.util.Scanner;


// 147_b
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int len = s.length();
        int half = len / 2;

        int count = 0;

        for (int i = 0; i < half; i++) {
            if (!(s.charAt(i) == s.charAt(s.length() - i - 1))) {
                count++;
            }
        }

        out(count);

    }

    /*
     * 以下メソッド集
     */

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

}
