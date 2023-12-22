import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        BigInteger cif = new BigInteger("0");
        BigInteger mod10 = new BigInteger("0");
        BigInteger div10 = new BigInteger("0");
        for (int qq = 0; qq < m; ++qq) {
            BigInteger d = new BigInteger(scan.next());
            BigInteger c = new BigInteger(scan.next());
            cif = cif.add(c);
            d = d.multiply(c);
            mod10 = mod10.add(d);
            //System.out.println(mod10);
            div10 = div10.add(mod10.divide(new BigInteger("10")));
            //System.out.println(mod10);
            mod10 = mod10.mod(new BigInteger("10"));
        }
        System.out.println(div10.add(cif.add(new BigInteger("-1"))));
    }
}
