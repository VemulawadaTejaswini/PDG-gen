import java.util.Scanner ;
import java.math.BigInteger;
public class sol{
  public static void main(String[] args){
    int h,w;
    Scanner input = new Scanner(System.in);
    h = input.nextInt();
    w = input.nextInt();

    System.out.printf(BigInteger.valueOf(h).multiply(BigInteger.valueOf(w/2)).add(BigInteger.valueOf((w%2) * (h+2-1)/2)).toString());
    
  }
}