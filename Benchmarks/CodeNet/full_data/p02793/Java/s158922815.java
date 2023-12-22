
import java.math.BigInteger;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println(solve2(N, A));
    }

    private static long solve(int N, int[] A) {
        BigInteger count = BigInteger.ZERO;
        BigInteger lcm = BigInteger.valueOf(A[0]);
        for (int i=1; i<N; i++) {
            lcm = lcm(lcm, A[i]);
            System.err.println("lcm=" + lcm.toString());
        }

        for (int i=0; i<N; i++) {
            System.err.println(lcm);
            count = count.add(lcm.multiply(BigInteger.valueOf(A[i])));
        }

        return count.remainder(BigInteger.valueOf(MOD)).longValue();
    }

    private static long solve2(int N, int[] A) {
        BigInteger[] bigA = new BigInteger[N];
        for (int i=0; i<N; i++) {
            bigA[i] = BigInteger.valueOf(A[i]);
        }

        BigInteger lcm = lcm(bigA);
        BigInteger count = BigInteger.ZERO;
        System.err.println(lcm.toString());
        for (int i=0; i<N; i++) {
            //System.err.println(lcm.remainder(bigA[i]));

            count = count.add(lcm.divide(bigA[i]));
        }

        return count.remainder(BigInteger.valueOf(MOD)).longValue();
    }

    private static BigInteger lcm(BigInteger a, long b) {
        BigInteger bigB = BigInteger.valueOf(b);
        BigInteger t = a.remainder(bigB);
        BigInteger c = a.multiply(bigB);

        //System.err.println("t=" + t.toString() + ", c=" + c.toString());
        while (!t.equals(BigInteger.ZERO)) {
            a = bigB;
            bigB = t;

            t = a.remainder(bigB);
            //System.err.println(t.toString());
        }

        return c.multiply(bigB);
    }

    private static BigInteger lcm(BigInteger... arr) {
        return Stream.of(arr).reduce((x, y) -> createLcm(x, y)).orElse(BigInteger.ONE);
    }

    private static BigInteger createLcm(BigInteger x, BigInteger y) {
        return x.multiply(y)
                .divide(Objects.nonNull(creategcd(x, y)) ? creategcd(x, y) : BigInteger.ONE);
    }

    private static BigInteger creategcd(BigInteger x, BigInteger y) {
        return (Objects.nonNull(x) ? x : BigInteger.ONE).gcd(y);
    }
}