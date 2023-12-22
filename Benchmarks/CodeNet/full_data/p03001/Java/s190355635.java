
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BigInteger W = new BigInteger(scanner.next());
        BigInteger H = new BigInteger(scanner.next());
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        BigInteger menseki = W.multiply(H).divide(BigInteger.valueOf(2));
        BigInteger halfW = W.divide(BigInteger.valueOf(2));
        BigInteger halfH = H.divide(BigInteger.valueOf(2));;

        int divType = 0;
        if (halfW.compareTo(BigInteger.valueOf(x)) == 0
                && halfH.compareTo(BigInteger.valueOf(y)) == 0) {
            divType = 1;
        }
        System.out.printf("%f %d\n", menseki.doubleValue(), divType);
    }
}