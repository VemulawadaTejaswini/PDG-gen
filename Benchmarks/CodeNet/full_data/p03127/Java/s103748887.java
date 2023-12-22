import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        BigInteger gc = BigInteger.ZERO;
        BigInteger prev = BigInteger.valueOf(sc.nextInt());
        for (int i = 1; i < n; i++) {
            BigInteger cur = BigInteger.valueOf(sc.nextInt());
            prev = cur.gcd(prev);
        }
        System.out.println(prev);
    }
}