import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int x = sc.nextInt();

        int[] primes = new int[101000];

        for (int i = 2; i < 101000; i++) {
            if (isPrime(i)) {
                primes[i] = i;
            } else {
                primes[i] = Integer.MAX_VALUE;
            }
        }

        System.out.println(IntStream.of(Arrays.copyOfRange(primes, x, primes.length)).min().getAsInt());
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}