import java.util.*;
import java.math.*;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    BigInteger N = scan.nextBigInteger();
    System.out.print("0 0 ");
    N = N.add(new BigInteger("1"));
    System.out.println(N+" 1"+" 1"+" 1");
  }
}