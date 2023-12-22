import java.util.*;
import java.math.*;
class Main {
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    BigInteger bi1, bi2, bi3;
    bi1 = new BigInteger(Integer.toString(n));


    if(bi1.isProbablePrime(1))
    System.out.println(n);
    else{
    bi2 = bi1.nextProbablePrime();
    System.out.println(bi2);
    }
  }
}