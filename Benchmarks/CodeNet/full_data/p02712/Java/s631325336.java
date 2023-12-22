import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        BigInteger bi = BigInteger.ZERO;

        for (int i = 1; i <= N; i++) {
            if (!fizzOrBuzz(i)) {
                bi = bi.add(new BigInteger("" + i));
            }
        }

        System.out.println(bi.toString());
    }

    public static boolean fizzOrBuzz(int i) {
        if (i % 15 == 0) {
            return true;
        } else if (i % 3 == 0) {
            return true;
        } else if (i % 5 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
