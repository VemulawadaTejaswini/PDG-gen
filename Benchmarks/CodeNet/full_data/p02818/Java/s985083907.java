import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        BigInteger A = new BigInteger(a);
        String b = in.next();
        BigInteger B = new BigInteger(b);
        String c = in.next();
        BigInteger C = new BigInteger(c);
        while (!C.equals(0)) {
            if (!A.equals(0)) {
                A.subtract(new BigInteger("1"));
            }
            else if (!B.equals(0)) {
                B.subtract(new BigInteger("1"));
            }
            C.subtract(new BigInteger("1"));
        }
        System.out.println(A.toString() + " " + B.toString());
    }
}
