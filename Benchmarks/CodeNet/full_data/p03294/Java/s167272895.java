/**
 * TODO: delete this line
 */


import java.math.BigInteger;
import java.util.Scanner;

/**
 * TODO: Rename to Main
 */
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] as = new int[N];

        for (int i = 0; i < N; i++) {
            as[i] = scanner.nextInt();
        }

        BigInteger lcm = BigInteger.valueOf(1);
        for (int a : as) {
            lcm = lcm(lcm, BigInteger.valueOf(a));
        }

        BigInteger sum = BigInteger.valueOf(0);
        for (int a : as) {
            sum = sum.add((lcm.subtract(BigInteger.valueOf(1))).mod(BigInteger.valueOf(a)));
        }
        System.out.println(sum);
    }

    private static BigInteger lcm(BigInteger m, BigInteger n) {
        return m.multiply(n).divide(gcd(m, n));
    }

    private static BigInteger gcd(BigInteger m, BigInteger n) {
        return m.gcd(n);
    }
}