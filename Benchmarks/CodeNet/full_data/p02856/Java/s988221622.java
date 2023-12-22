import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        BigInteger cif = new BigInteger("0");
        BigInteger tot = new BigInteger("0");
        BigInteger div10 = new BigInteger("0");
        for (int qq = 0; qq < m; ++qq) {
            BigInteger d = new BigInteger(scan.next());
            BigInteger c = new BigInteger(scan.next());
            cif = cif.add(c);
            d = d.multiply(c);
            tot = tot.add(d);
        }
        System.out.println(cif.add(tot.divide(new BigInteger("10")).add(new BigInteger("-1"))));
    }
}
