import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        long gcd = gcd(a, b);

        long x = gcd;

        Set<Long> ans = new HashSet<>();

        for (long i = 2; i <= gcd;) {
            if (x % i == 0) { // 最小の因数を求める
                ans.add(i);
                x /= i; // 最小の因数で割った数を代入する
            } else {
                i++;
            }
        }

        System.out.println(ans.size() + 1);
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
