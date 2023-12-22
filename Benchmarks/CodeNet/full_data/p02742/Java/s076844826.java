import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            BigInteger two = new BigInteger("2");

            BigInteger r1 = ((b.divide(two)).add(b.mod(two))).multiply((a.divide(two)).add(a.mod(two)));
            BigInteger r2 = (b.divide(two)).multiply(a.divide(two));
            
            System.out.println(r1.add(r2));
        }
    }
}
