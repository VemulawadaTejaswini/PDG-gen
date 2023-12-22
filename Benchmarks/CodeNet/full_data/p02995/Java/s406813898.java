import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        int c = sc.nextInt();
        int d = sc.nextInt();

        long ans = f(b, c, d) - f(a - 1, c, d);
        System.out.println(ans);
    }

    static long f(long x, long c, long d) {
        long ret = x; // これが全体数
        ret -= (x / c); // Cで割れる数を減らす
        ret -= (x / d); // Dで割れる数を減らす
        ret += x / lcm(c, d); // CとDで重複して減らした数を加算する
        return ret;
    }

    static long lcm(long a, long b) {
        // 最小公倍数
        return (a * b) / gcd(a, b);
    }

    static long gcd(long a, long b) {
        // 最大公約数
        return b == 0 ? a : gcd(b, a % b);
    }
}
