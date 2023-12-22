import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main
{
    private static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    private static List<Long> factorize(long x) {
        List<Long> result = new ArrayList<>();
        result.add(1L);
        for (long i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                result.add(i);
                while (x % i == 0) {
                    x /= i;
                }
            }
        }
        if (x > 1) {
            result.add(x);
        }
        return result;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long gcd = gcd(a, b);
        System.out.println(factorize(gcd).size());
    }
}

