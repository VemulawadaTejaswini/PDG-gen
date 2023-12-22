import java.math.BigInteger;
import java.util.stream.Stream;

public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        System.out.println(Stream.generate(() -> null)
                .limit(n)
                .map(i -> BigInteger.valueOf(Math.abs(x - scanner.nextInt())))
                .reduce(BigInteger::gcd)
                .get()
                .intValue());
    }
}