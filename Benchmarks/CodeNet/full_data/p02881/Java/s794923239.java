import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = Long.MAX_VALUE;
        for (long i = 1; i * i <= n; ++i) {
            if (n % i != 0) continue;
            long j = n / i;
            ans = Math.min(ans, i + j - 2);
            System.out.println(ans);
        }
    }
}