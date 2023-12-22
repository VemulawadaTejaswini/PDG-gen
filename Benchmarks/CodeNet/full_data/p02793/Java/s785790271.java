import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static long MOD = 1000000007;

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            long[] A = new long[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextLong();
            }

            long[] primes = prime(1000000);

            long[] count = new long[primes.length];
            for (int i = 0; i < N; i++) {
                long a = A[i];
                for (int j = primes.length - 1; j >= 1; j--) {
                    if (a < primes[j]) {
                        continue;
                    }

                    long c = 0;
                    while (a % primes[j] == 0) {
                        c++;
                        a /= primes[j];
                    }

                    if (count[j] < c) {
                        count[j] = c;
                    }
                }
            }

            long lcm = 1;
            for (int j = 1; j < primes.length; j++) {
                while (count[j] > 0) {
                    lcm = (lcm * primes[j]) % MOD;
                    count[j]--;
                }
            }

            long ans = 0;
            for (int i = 0; i < N; i++) {
                ans = (ans + lcm * inv(A[i])) % MOD;
            }

            System.out.println(ans);
        }
    }

    static long inv(long a) {
        long ret = 1;
        long n = MOD - 2;
        while (n > 0) {
            if (n % 2 == 1) {
                ret = (ret * a) % MOD;
            }
            a = (a * a) % MOD;
            n = n / 2;
        }
        return ret;
    }

    static long[] prime(long N) {
        long primes[] = new long[10000];
        primes[0] = 1;
        primes[1] = 2;
        int count = 2;
        long checked = 2;

        if (N <= checked) {
            int pos = Arrays.binarySearch(Arrays.copyOf(primes, count), N);
            if (pos < 0) {
                pos = -pos - 2;
            }
            return Arrays.copyOf(primes, pos);
        }

        for (long n = checked + 1; n <= N; n++) {
            boolean prime = true;

            long sqrt = (long) (Math.sqrt(n));
            for (int i = 1; i < count; i++) {
                if (primes[i] > sqrt) {
                    break;
                }

                if (n % primes[i] == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                if (primes.length == count) {
                    long[] primes2 = new long[primes.length + 10000];
                    System.arraycopy(primes, 0, primes2, 0, primes.length);
                    primes = primes2;
                }

                primes[count] = n;
                count++;
            }
        }

        checked = N;

        return Arrays.copyOf(primes, count);
    }

}
