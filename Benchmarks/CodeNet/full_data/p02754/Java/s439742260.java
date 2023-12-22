import java.util.Scanner;
import java.math.BigInteger; 
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BigInteger n = new BigInteger(Integer.toString(sc.nextInt()));
    BigInteger b = new BigInteger(Integer.toString(sc.nextInt()));
    BigInteger r = new BigInteger(Integer.toString(sc.nextInt()));
    BigInteger x = new BigInteger("0");
    if(b == new BigInteger("0")) {
      System.out.println(x);
    } else if(r == new BigInteger("0")) {
      System.out.println(b);
    } else {
      x = n.subtract(r);
      System.out.println(x);
    }
  }
}
