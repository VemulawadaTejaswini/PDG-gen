import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        BigInteger cif = new BigInteger("0");
        BigInteger tot = new BigInteger("0");
        for (int qq = 0; qq < m; ++qq) {
            BigInteger d = new BigInteger(scan.next());
            BigInteger c = new BigInteger(scan.next());
            cif = cif.add(c);
            tot = tot.add(d.multiply(c));
        }
        if (tot.mod((BigInteger.TEN.subtract(BigInteger.ONE))).equals(BigInteger.ZERO)) {
            tot = tot.subtract(BigInteger.TEN.subtract(BigInteger.ONE));
        }
        System.out.println(cif.add(tot.divide(BigInteger.TEN.subtract(BigInteger.ONE))).subtract(BigInteger.ONE));
    }
}
