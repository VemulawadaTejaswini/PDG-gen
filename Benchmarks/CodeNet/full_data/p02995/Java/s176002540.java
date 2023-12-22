import java.util.*;
import java.math.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger A = new BigInteger(sc.next()).subtract(BigInteger.ONE);
        BigInteger B = new BigInteger(sc.next());
        BigInteger C = new BigInteger(sc.next());
        BigInteger D = new BigInteger(sc.next());

        BigInteger cgcd = lcm(C, D);
        BigInteger c = B.divide(C).subtract(A.divide(C));
        BigInteger d = B.divide(D).subtract(A.divide(D));
        BigInteger e = B.divide(cgcd).subtract(A.divide(cgcd));
        System.out.println(
          B.subtract(A).subtract(c.add(d).subtract(e))
        );
    }
    static BigInteger lcm(BigInteger a, BigInteger b){
        return a.multiply(b).divide(a.gcd(b));
    }
  }
