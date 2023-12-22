import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long A = in.nextLong(), B = in.nextLong();
        int gcd = greatestCommonDivisor(A, B);
        System.out.println(primeFactorization(gcd));
    }

    public static int primeFactorization(int n) {
        Set<Integer> set = new HashSet<>();
        for (int i = 2; i <= n; i++)
            while (n % i == 0) {
                set.add(i);
                n /= i;
            }
        if (n > 1) set.add(n);
        return set.size();
    }

    public static int greatestCommonDivisor(long A, long B) {
        while (A % B != 0) {
            long R = A % B;
            A = B;
            B = R;
        }
        return (int) B;
    }
}
