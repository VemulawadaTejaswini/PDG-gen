import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.LongStream;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String[] array = reader.readLine().split(" ");
            long A = Long.parseLong(array[0]);
            long B = Long.parseLong(array[1]);

            long gcd = gcd(A, B);
            List<Long> divisors = divisor(gcd);

            int ans = 0;
            for (Long divisor : divisors) {
                if (isPrime(divisor)) {
                    ans++;
                }
            }

            System.out.println(ans);
        }
    }

    public static long gcd(long A, long B) {
        while (true) {
            if (A >= B) {
                A = A % B;
                if (A == 0) {
                    return B;
                }
            } else {
                B = B % A;
                if (B == 0) {
                    return A;
                }
            }
        }
    }

    public static List<Long> divisor(long N) {
        List<Long> list = new ArrayList<Long>();
        for (long n = 1; n <= Math.sqrt(N); n++) {
            if (N % n == 0) {
                list.add(n);
                long n2 = N / n;
                if (n != n2) {
                    list.add(N / n);
                }
            }
        }

        Collections.sort(list);

        return list;
    }

    public static boolean isPrime(long N) {
        return LongStream.rangeClosed(2, (long) Math.sqrt(N)).allMatch(n -> N % n != 0);
    }

}
