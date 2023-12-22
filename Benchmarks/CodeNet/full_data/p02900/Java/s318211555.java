import java.util.Scanner;

public class Main {

    private static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    private static long factorize(long n) {
        int count = 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i != 0) {
                continue;
            }
            while (n % i == 0) {
                n /= i;
            }
            count++;
        }
        if (n != 1) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        // 最大公約数
        long gcd = gcd(a, b);
        // aとbの公約数 = gcd(a,b)の約数より、
        // gcdを素因数分解して素因数の個数を数える
        System.out.println(factorize(gcd));
    }

}
