import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        long gcd = gcd(a, b);

        long x = gcd;

        long ans = 1;

        double limit = Math.ceil(Math.sqrt(gcd));

        for (long i = 2; i <= limit; i++) {
            if (x % i == 0) { // 最小の因数を求める
                while (x % i == 0) {
                    x /= i; // 最小の因数で割った数を代入する
                }
                ans++;
            }
        }

        System.out.println(ans);
    }

    private static long gcd(long a, long b) {
        long temp;
        while ((temp = a % b) != 0) {
            a = b;
            b = temp;
        }
        return b;
    }
}
