import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        if (a == 1 || b == 1) {
            System.out.println(1);

        } else {
            HashSet<Long> commonDivisor = new HashSet<>();
            for (long i = 3; i <= Math.max(a, b) / 2; i += 2) {
                if (a % i == 0 && b % i == 0) {
                    if (isPrimeNumber(i)) {
                        commonDivisor.add(i);
                    }
                }
            }

            int result = commonDivisor.size() + 1;
            if ((a + b) % 2 == 0) {
                result++;
            }
            if (a == b && isPrimeNumber(a)) {
                result++;
            }

            System.out.println(result);
        }
    }

    public static boolean isPrimeNumber(long x) {
        if (x == 1) {
            return false;
        } else if (x <= 0) {
            return false;
        }
        for (long i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
