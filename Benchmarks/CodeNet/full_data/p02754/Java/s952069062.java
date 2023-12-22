import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        BigInteger a = sc.nextBigInteger();
        BigInteger r = sc.nextBigInteger();

        BigInteger sum = a.add(r);
        BigInteger ans = n.divide(sum);
        BigInteger amari = n.remainder(sum);

        if (!amari.equals(0)) {
            System.out.println(a.multiply(ans).add(amari));
        }else{
            System.out.println(a.multiply(ans));
        }
    }
}
