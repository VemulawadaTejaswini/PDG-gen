import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int count = 2;
        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (getMod(n, i) == 1) {
                    count++;
                }
                if (i * i != n) {
                    if (getMod(n, n / i) == 1) {
                        count++;
                    }
                }
            }
            if ((n - 1) % i == 0 && i * i <= n - 1) {
                count++;
                if (i * i != n - 1) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    
    static long getMod(long x, long y) {
        while (x % y == 0) {
            x /= y;
        }
        return x % y;
    }
}
