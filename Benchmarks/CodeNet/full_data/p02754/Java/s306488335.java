import java.util.Scanner;
import java.math.BigInteger;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BigInteger n = sc.nextBigInteger(); 
    BigInteger b = sc.nextBigInteger(); 
    BigInteger r = sc.nextBigInteger();
    sc.close();
    if(b.equals(new BigInteger("0"))) {
      System.out.println("0");
    } else {
      BigInteger x = b.multiply(n.divide(n.divide(b.add(r))));
      BigInteger y = n.mod(b.add(r));
      BigInteger z = y.subtract(r);
      System.out.println(x.add(z));
    }
  }
}
