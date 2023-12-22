import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long N = s.nextLong();
        long moves = 0, first = 0, second = 0;

        if (!isPrime(N)) {
            ArrayList<Long> divisors = new ArrayList<Long>();
            
            for (long i = 1; i * i <= N; i++) {
                if (N % i == 0)
                    divisors.add(i);
            }

            long smallestDiff = Long.MAX_VALUE;

            for (long i = 0; i < divisors.size() - 1; i++) {
                for (long j = i; j < divisors.size(); j++) {
                    long a = divisors.get((int) (i));
                    long b = divisors.get((int) (j));

                    if ((a * b == N) && (Math.abs(a - b) < smallestDiff)) {
                        smallestDiff = Math.abs(a - b);
                        first = a;
                        second = b;
                    }
                }
            }
        } else {
            first = N;
            second = 1;
        }

        moves = (first - 1) + (second - 1);
        System.out.println(moves);
    }

    static boolean isPrime(long n) {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;

        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (long i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }
}