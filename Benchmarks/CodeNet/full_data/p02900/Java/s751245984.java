import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long A = in.nextLong(), B = in.nextLong();

        if (A == 1 || B == 1) System.out.println(1);
        long gcd = getGCD(A, B);
        System.out.println(primeFactorization(gcd));
    }

    public static int primeFactorization(long n) {
        Set<Integer> set = new HashSet<>();
        for (int i = 2; i <= n; i++)
            while (n % i == 0) {
                set.add(i);
                n /= i;
            }
        return set.size() + 1;
    }

    public static long getGCD(long A, long B) {
        while (A % B != 0) {
            long R = A % B;
            A = B;
            B = R;
        }
        return B;
    }
}
