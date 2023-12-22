import java.math.BigInteger;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    BigInteger n = new BigInteger(scan.next());
    BigInteger a = new BigInteger(scan.next());
    BigInteger b = new BigInteger(scan.next());

    if(a.equals(b)){
      System.out.println(0);
      return;
    }
    BigInteger x = (new BigInteger(b.toString()).subtract(new BigInteger(a.toString()))
            .abs())
            .divide(new BigInteger("2"));
    if(x.equals(BigInteger.ZERO)){
        x = new BigInteger(n.toString());
    }
    BigInteger y = (new BigInteger(a.toString()).subtract(BigInteger.ONE))
            .max(new BigInteger(b.toString()).subtract(BigInteger.ONE));
    BigInteger z = (new BigInteger(n.toString()).subtract(a)).max(n.subtract(b));
    System.out.println(x.min(y.min(z)).toString());
  }
}
