import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger N = scanner.nextBigInteger();
        BigInteger K = scanner.nextBigInteger();
        scanner.close();

        BigInteger a = N.remainder(K);

        if (a.compareTo(K.subtract(a)) > 0) {
            System.out.println(K.subtract(a));
        } else {
            System.out.println(a);
        }
    }
}
