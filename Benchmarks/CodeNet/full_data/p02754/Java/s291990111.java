import java.util.Scanner;
import java.math.BigInteger;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BigInteger n = sc.nextBigInteger(); 
    BigInteger b = sc.nextBigInteger(); 
    BigInteger r = sc.nextBigInteger();
    sc.close();
    if(b.equals(0)) {
      System.out.println("0");
    } else if(r.equals(0)) {
      System.out.println(b);
    } else {
      System.out.println(n.subtract(r));
    }
  }
}
