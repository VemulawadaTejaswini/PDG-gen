
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long sum = 0;
        for (long i = 1; i <= Math.sqrt(n); ++i) {
            long j = n / i;
           // m + 1 = i
            if (i > 1) {
                long m = i - 1;
                if (n % m == n / m) {
                    sum += m;
                }
            }

            // m + 1 = j
            if (j - 1 > 0) {
                long m = j - 1;
                if (n % m == n / m) {
                    sum += m;
                }
            }
        }
        System.out.println(sum);
    }
}
