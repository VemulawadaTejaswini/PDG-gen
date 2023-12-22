import java.util.*;

public class Main {

    public static void main(String[] args) {
        long MOD = 1000000007;
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long total = 0;
        for (long i = k; i <= n + 1; i++) {
            total += (n - i + 1 + n) * i / 2 - (0 + i - 1) * i / 2 + 1;
            total %= MOD;
        }
        System.out.println(total);
    }

}