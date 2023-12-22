import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BigInteger a= sc.nextBigInteger();
        BigInteger b=sc.nextBigInteger();
        BigInteger c= a.mod(b);
        BigInteger d= b.subtract(c);
        System.out.println((c.min(d)));

    }
}
