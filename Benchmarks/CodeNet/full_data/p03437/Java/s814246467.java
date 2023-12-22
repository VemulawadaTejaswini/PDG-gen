import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        List<Integer> xPrimes = primeFactors(x);
        List<Integer> yPrimes = primeFactors(y);
        if (x % y != 0) {
            System.out.println(x);
            return;
        }
        for(int p : xPrimes) {
            if (!yPrimes.contains(p)) {
                long temp = x * p;
                if (temp % y != 0) {
                    System.out.println(x * p);
                    return;
                }
            } else {
                yPrimes.remove(Integer.valueOf(p));
            }
        }
        System.out.println(-1);
    }

    public static List<Integer> primeFactors(int numbers) {
        int n = numbers;
        List<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i <= n / i; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            factors.add(n);
        }
        return factors;
    }
}
